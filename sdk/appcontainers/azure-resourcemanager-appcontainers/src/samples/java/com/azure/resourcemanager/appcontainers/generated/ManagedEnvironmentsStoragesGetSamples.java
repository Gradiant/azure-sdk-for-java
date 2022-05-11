// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.Context;

/** Samples for ManagedEnvironmentsStorages Get. */
public final class ManagedEnvironmentsStoragesGetSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-03-01/examples/ManagedEnvironmentsStorages_Get.json
     */
    /**
     * Sample code: get a environments storage properties by subscription.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void getAEnvironmentsStoragePropertiesBySubscription(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.managedEnvironmentsStorages().getWithResponse("examplerg", "managedEnv", "jlaw-demo1", Context.NONE);
    }
}