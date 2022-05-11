// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appcontainers.models.Certificate;
import java.util.HashMap;
import java.util.Map;

/** Samples for Certificates Update. */
public final class CertificatesUpdateSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-03-01/examples/Certificates_Patch.json
     */
    /**
     * Sample code: Patch Certificate.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void patchCertificate(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        Certificate resource =
            manager
                .certificates()
                .getWithResponse("examplerg", "testcontainerenv", "certificate-firendly-name", Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).apply();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}