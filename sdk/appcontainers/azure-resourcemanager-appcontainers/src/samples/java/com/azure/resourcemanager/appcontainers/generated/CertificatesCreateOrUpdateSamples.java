// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.resourcemanager.appcontainers.models.CertificateProperties;

/** Samples for Certificates CreateOrUpdate. */
public final class CertificatesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-03-01/examples/Certificate_CreateOrUpdate.json
     */
    /**
     * Sample code: Create or Update Certificate.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void createOrUpdateCertificate(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .certificates()
            .define("certificate-firendly-name")
            .withRegion("East US")
            .withExistingManagedEnvironment("examplerg", "testcontainerenv")
            .withProperties(
                new CertificateProperties()
                    .withPassword("private key password")
                    .withValue("PFX-or-PEM-blob".getBytes()))
            .create();
    }
}