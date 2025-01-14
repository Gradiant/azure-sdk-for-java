// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.azure.keyvault.cryptography.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Security;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import org.apache.commons.lang3.tuple.Pair;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.common.collect.ImmutableMap;
import com.microsoft.azure.keyvault.cryptography.EcKey;
import com.microsoft.azure.keyvault.cryptography.algorithms.Es256;
import com.microsoft.azure.keyvault.cryptography.algorithms.Es256k;
import com.microsoft.azure.keyvault.cryptography.algorithms.Es384;
import com.microsoft.azure.keyvault.cryptography.algorithms.Es512;
import com.microsoft.azure.keyvault.cryptography.SignatureEncoding;
import com.microsoft.azure.keyvault.webkey.JsonWebKey;
import com.microsoft.azure.keyvault.webkey.JsonWebKeyCurveName;
import com.microsoft.azure.keyvault.webkey.JsonWebKeyType;

public class ECKeyTest {

    private static Provider provider = null;

    static byte[] cek;
    static KeyFactory factory;
    static MessageDigest digest256;
    static MessageDigest digest384;
    static MessageDigest digest512;
    static KeyPairGenerator ecKeyGenerator;
    static Map<JsonWebKeyCurveName, MessageDigest> curveToDigest;
    static List<JsonWebKeyCurveName> curveList;

//    To create keys and signatures used in this class with openssl:
//
//    Create key
//        openssl ecparam -name {curve_name} -genkey > {key_name}.pem
//        openssl pkcs8 -topk8 -nocrypt -in {key_name}.pem -out {key_name}pkcs8.pem
//        openssl ec -in {key_name}pkcs8.pem -pubout -out {key_name}pkcs8pub.pem
//
//    Sign key
//        openssl dgst -{sha_digest} -sign {key_name}pkcs8.pem -out {signature} <file>
//
//    Verify key
//        openssl dgst -{sha_digest} -verify {key_name}pkcs8pub.pem -signature {signature} <file>


    protected static void setProvider(Provider provider) {
        ECKeyTest.provider = provider;
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        setProvider(Security.getProvider("BC"));
        ecKeyGenerator = KeyPairGenerator.getInstance("EC", provider);

        Path byteLocation = Paths.get(getPath("byte_array.bin"));
        cek = Files.readAllBytes(byteLocation);

        factory = KeyFactory.getInstance("EC", provider);

        digest256 = MessageDigest.getInstance("SHA-256");
        digest384 = MessageDigest.getInstance("SHA-384");
        digest512 = MessageDigest.getInstance("SHA-512");

        curveToDigest = ImmutableMap.<JsonWebKeyCurveName, MessageDigest>builder()
            .put(JsonWebKeyCurveName.P_256, digest256)
            .put(JsonWebKeyCurveName.P_384, digest384)
            .put(JsonWebKeyCurveName.P_521, digest512)
            .put(JsonWebKeyCurveName.P_256K, digest256)
            .build();
        //JsonWebKeyCurveName.SECP256K1)
        curveList = Arrays.asList(JsonWebKeyCurveName.P_256, JsonWebKeyCurveName.P_384, JsonWebKeyCurveName.P_521, JsonWebKeyCurveName.P_256K);
    }

    @Test
    public void testCurves() throws Exception {
        for (JsonWebKeyCurveName crv : curveList) {
            EcKey key = new EcKey("keyId", crv);
            doSignVerify(key, curveToDigest.get(crv));
        }
    }

    @Test(expected = NoSuchAlgorithmException.class)
    public void testUnsupportedCurve() throws NoSuchAlgorithmException, InvalidAlgorithmParameterException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        EcKey key = new EcKey("keyId", new JsonWebKeyCurveName("not an algo"));
    }

    @Test
    public void testDefaultKey() throws Exception {
        EcKey key = new EcKey("keyId");
        doSignVerify(key, digest256);
    }

    @Test
    public void testWithKeyPair() throws Exception {
        for (JsonWebKeyCurveName crv : curveList) {
            ECGenParameterSpec gps = new ECGenParameterSpec(EcKey.CURVE_TO_SPEC_NAME.get(crv));
            ecKeyGenerator.initialize(gps);
            KeyPair keyPair = ecKeyGenerator.generateKeyPair();

            final String name = "keyid";
            EcKey key = new EcKey(name, keyPair);
            assertEquals(name, key.getKid());
            assertEquals(crv, key.getCurve());
            doSignVerify(key, curveToDigest.get(crv));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithNotCurveKeyPair() throws Exception {
        ECGenParameterSpec gps = new ECGenParameterSpec("secp192k1");
        ecKeyGenerator.initialize(gps);
        KeyPair keyPair = ecKeyGenerator.generateKeyPair();

        final String name = "keyid";
        EcKey key = new EcKey(name, keyPair);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testFromJsonWebKeyPublicOnly() throws Exception {
        ECGenParameterSpec gps = new ECGenParameterSpec(EcKey.P256);
        ecKeyGenerator.initialize(gps);
        KeyPair keyPair = ecKeyGenerator.generateKeyPair();

        ECPublicKey apub = (ECPublicKey) keyPair.getPublic();
        ECPoint point = apub.getW();

        JsonWebKey jwk = new JsonWebKey()
                .withKid("kid")
                .withCrv(JsonWebKeyCurveName.P_256)
                .withX(point.getAffineX().toByteArray())
                .withY(point.getAffineY().toByteArray())
                .withKty(JsonWebKeyType.EC);

        assertFalse(jwk.hasPrivateKey());

        EcKey newKey = EcKey.fromJsonWebKey(jwk, false);
        assertEquals("kid", newKey.getKid());
        doSignVerify(newKey, digest256);
    }

    @Test
    public void testFromJsonWebKey() throws Exception {
        ECGenParameterSpec gps = new ECGenParameterSpec(EcKey.P384);
        ecKeyGenerator.initialize(gps);
        KeyPair keyPair = ecKeyGenerator.generateKeyPair();

        ECPublicKey apub = (ECPublicKey) keyPair.getPublic();
        ECPoint point = apub.getW();
        ECPrivateKey apriv = (ECPrivateKey) keyPair.getPrivate();

        JsonWebKey jwk = new JsonWebKey()
                .withKid("kid")
                .withCrv(JsonWebKeyCurveName.P_384)
                .withX(point.getAffineX().toByteArray())
                .withY(point.getAffineY().toByteArray())
                .withD(apriv.getS().toByteArray())
                .withKty(JsonWebKeyType.EC);

        assertTrue(jwk.hasPrivateKey());

        EcKey newKey = EcKey.fromJsonWebKey(jwk, true);
        assertEquals("kid", newKey.getKid());
        doSignVerify(newKey, digest384);
    }

    private static PrivateKey generatePrivateKey(KeyFactory factory, String filename) throws InvalidKeySpecException, FileNotFoundException, IOException {
        PemFile pemFile = new PemFile(filename);
        byte[] content = pemFile.getPemObject().getContent();
        PKCS8EncodedKeySpec privKeySpec = new PKCS8EncodedKeySpec(content);
        return factory.generatePrivate(privKeySpec);
    }

    private static PublicKey generatePublicKey(KeyFactory factory, String filename) throws InvalidKeySpecException, FileNotFoundException, IOException {
        PemFile pemFile = new PemFile(filename);
        byte[] content = pemFile.getPemObject().getContent();
        X509EncodedKeySpec pubKeySpec = new X509EncodedKeySpec(content);
        return factory.generatePublic(pubKeySpec);
    }

    private KeyPair getKeyFromFile(String privateKeyPath, String publicKeyPath) throws InvalidKeySpecException, FileNotFoundException, IOException {
        PrivateKey priv = generatePrivateKey(factory, privateKeyPath);
        PublicKey pub = generatePublicKey(factory, publicKeyPath);
        ECPublicKey apub = (ECPublicKey) pub;
        ECPrivateKey apriv = (ECPrivateKey) priv;

        KeyPair keyPair = new KeyPair(apub, apriv);
        return keyPair;
    }

    private void testFromFile(String keyType, MessageDigest digest, String algorithm) throws Exception {
        String privateKeyPath = getPath(keyType + "keynew.pem");
        String publicKeyPath = getPath(keyType + "keypubnew.pem");

        EcKey newKey = new EcKey("akey", getKeyFromFile(privateKeyPath, publicKeyPath));

        Path signatureLocation = Paths.get(getPath(keyType + "sig.der"));
        byte[] signature = SignatureEncoding.fromAsn1Der(Files.readAllBytes(signatureLocation), algorithm);

        doVerify(newKey, digest, signature);
    }

    private static String getPath(String filename) {

        String path =  ECKeyTest.class.getClassLoader().getResource(filename).getPath();
        if (path.contains(":")) {
            path = path.substring(1);
        }
        return path;
    }

    @Test
    public void testCreateSECP256K1Key() throws Exception {
        ECGenParameterSpec gps = new ECGenParameterSpec("secp256k1");
        Provider myprov = Security.getProvider("BC");
        final KeyPairGenerator generator = KeyPairGenerator.getInstance("EC");

        generator.initialize(gps);
        EcKey key = new EcKey("akey", JsonWebKeyCurveName.P_256K);
    }

    @Test
    public void testFromP384File() throws Exception {
        testFromFile("p384", digest384, Es384.ALGORITHM_NAME);
    }

    @Test
    public void testFromP521File() throws Exception {
        testFromFile("p521", digest512, Es512.ALGORITHM_NAME);
    }

    @Test
    public void testFromP256File() throws Exception {
        testFromFile("p256", digest256, Es256.ALGORITHM_NAME);
    }

    @Test
    public void testFromSEC256File() throws Exception {
        testFromFile("secp256", digest256, Es256k.ALGORITHM_NAME);
    }

    @Test
    public void testToJsonWebKey() throws Exception {
        ECGenParameterSpec gps = new ECGenParameterSpec(EcKey.P521);
        ecKeyGenerator.initialize(gps);
        KeyPair keyPair = ecKeyGenerator.generateKeyPair();

        ECPublicKey apub = (ECPublicKey) keyPair.getPublic();
        ECPoint point = apub.getW();
        ECPrivateKey apriv = (ECPrivateKey) keyPair.getPrivate();

        JsonWebKey jwk = new JsonWebKey()
                .withKid("kid")
                .withCrv(JsonWebKeyCurveName.P_521)
                .withX(point.getAffineX().toByteArray())
                .withY(point.getAffineY().toByteArray())
                .withD(apriv.getS().toByteArray())
                .withKty(JsonWebKeyType.EC);

        EcKey newKey = new EcKey("kid", keyPair);

        JsonWebKey newJwk = newKey.toJsonWebKey();
        //set missing parameters
        newJwk.withKid("kid");

        assertEquals(jwk, newJwk);
    }

    //Checks validity of verify by
    //Externally signing a byte_array with openssl
    //Verifying with SDK
    private void doVerify(EcKey key, MessageDigest digest, byte[] preGenSignature) throws IOException, NoSuchAlgorithmException, InterruptedException, ExecutionException {
        byte[] hash = digest.digest(cek);

        //Use sign and verify to test each other.
        boolean result = key.verifyAsync(hash, preGenSignature, key.getDefaultSignatureAlgorithm()).get();
        assertTrue(result);

        //Check that key denies invalid digest.
        BigInteger bigInt = new BigInteger(hash);
        BigInteger shiftInt = bigInt.shiftRight(4);
        byte[] shifted = shiftInt.toByteArray();
        boolean incorrectResult = key.verifyAsync(shifted, preGenSignature, key.getDefaultSignatureAlgorithm()).get();
        assertFalse(incorrectResult);

        key.close();
    }

    private void doSignVerify(EcKey key, MessageDigest digest) throws IOException, NoSuchAlgorithmException, InterruptedException, ExecutionException {

        byte[] hash = digest.digest(cek);

        //Use sign and verify to test each other.
        Pair<byte[], String> signature = key.signAsync(hash, key.getDefaultSignatureAlgorithm()).get();
        boolean result = key.verifyAsync(hash, signature.getLeft(), key.getDefaultSignatureAlgorithm()).get();
        assertTrue(result);

        //Check that key denies invalid digest.
        BigInteger bigInt = new BigInteger(hash);
        BigInteger shiftInt = bigInt.shiftRight(4);
        byte[] shifted = shiftInt.toByteArray();
        boolean incorrectResult = key.verifyAsync(shifted, signature.getLeft(), key.getDefaultSignatureAlgorithm()).get();
        assertFalse(incorrectResult);

        key.close();
    }
}
