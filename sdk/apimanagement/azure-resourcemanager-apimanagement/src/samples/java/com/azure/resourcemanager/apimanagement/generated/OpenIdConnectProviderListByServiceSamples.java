// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.Context;

/** Samples for OpenIdConnectProvider ListByService. */
public final class OpenIdConnectProviderListByServiceSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2021-08-01/examples/ApiManagementListOpenIdConnectProviders.json
     */
    /**
     * Sample code: ApiManagementListOpenIdConnectProviders.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementListOpenIdConnectProviders(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.openIdConnectProviders().listByService("rg1", "apimService1", null, null, null, Context.NONE);
    }
}