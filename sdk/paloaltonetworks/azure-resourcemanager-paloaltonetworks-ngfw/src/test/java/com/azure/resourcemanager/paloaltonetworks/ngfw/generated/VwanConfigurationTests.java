// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.IpAddress;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.IpAddressSpace;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.VwanConfiguration;
import org.junit.jupiter.api.Assertions;

public final class VwanConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VwanConfiguration model =
            BinaryData
                .fromString(
                    "{\"networkVirtualApplianceId\":\"ehtwdwrft\",\"vHub\":{\"resourceId\":\"iby\",\"addressSpace\":\"dl\"},\"trustSubnet\":{\"resourceId\":\"hfwpracstwit\",\"addressSpace\":\"hevxcced\"},\"unTrustSubnet\":{\"resourceId\":\"md\",\"addressSpace\":\"dnwzxltjcvnhltiu\"},\"ipOfTrustSubnetForUdr\":{\"resourceId\":\"navvwx\",\"address\":\"byqunyow\"}}")
                .toObject(VwanConfiguration.class);
        Assertions.assertEquals("ehtwdwrft", model.networkVirtualApplianceId());
        Assertions.assertEquals("iby", model.vHub().resourceId());
        Assertions.assertEquals("dl", model.vHub().addressSpace());
        Assertions.assertEquals("hfwpracstwit", model.trustSubnet().resourceId());
        Assertions.assertEquals("hevxcced", model.trustSubnet().addressSpace());
        Assertions.assertEquals("md", model.unTrustSubnet().resourceId());
        Assertions.assertEquals("dnwzxltjcvnhltiu", model.unTrustSubnet().addressSpace());
        Assertions.assertEquals("navvwx", model.ipOfTrustSubnetForUdr().resourceId());
        Assertions.assertEquals("byqunyow", model.ipOfTrustSubnetForUdr().address());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VwanConfiguration model =
            new VwanConfiguration()
                .withNetworkVirtualApplianceId("ehtwdwrft")
                .withVHub(new IpAddressSpace().withResourceId("iby").withAddressSpace("dl"))
                .withTrustSubnet(new IpAddressSpace().withResourceId("hfwpracstwit").withAddressSpace("hevxcced"))
                .withUnTrustSubnet(new IpAddressSpace().withResourceId("md").withAddressSpace("dnwzxltjcvnhltiu"))
                .withIpOfTrustSubnetForUdr(new IpAddress().withResourceId("navvwx").withAddress("byqunyow"));
        model = BinaryData.fromObject(model).toObject(VwanConfiguration.class);
        Assertions.assertEquals("ehtwdwrft", model.networkVirtualApplianceId());
        Assertions.assertEquals("iby", model.vHub().resourceId());
        Assertions.assertEquals("dl", model.vHub().addressSpace());
        Assertions.assertEquals("hfwpracstwit", model.trustSubnet().resourceId());
        Assertions.assertEquals("hevxcced", model.trustSubnet().addressSpace());
        Assertions.assertEquals("md", model.unTrustSubnet().resourceId());
        Assertions.assertEquals("dnwzxltjcvnhltiu", model.unTrustSubnet().addressSpace());
        Assertions.assertEquals("navvwx", model.ipOfTrustSubnetForUdr().resourceId());
        Assertions.assertEquals("byqunyow", model.ipOfTrustSubnetForUdr().address());
    }
}
