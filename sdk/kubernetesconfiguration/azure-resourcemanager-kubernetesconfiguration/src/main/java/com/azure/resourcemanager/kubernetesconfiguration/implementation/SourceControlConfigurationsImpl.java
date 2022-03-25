// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.kubernetesconfiguration.fluent.SourceControlConfigurationsClient;
import com.azure.resourcemanager.kubernetesconfiguration.fluent.models.SourceControlConfigurationInner;
import com.azure.resourcemanager.kubernetesconfiguration.models.SourceControlConfiguration;
import com.azure.resourcemanager.kubernetesconfiguration.models.SourceControlConfigurations;

public final class SourceControlConfigurationsImpl implements SourceControlConfigurations {
    private static final ClientLogger LOGGER = new ClientLogger(SourceControlConfigurationsImpl.class);

    private final SourceControlConfigurationsClient innerClient;

    private final com.azure.resourcemanager.kubernetesconfiguration.SourceControlConfigurationManager serviceManager;

    public SourceControlConfigurationsImpl(
        SourceControlConfigurationsClient innerClient,
        com.azure.resourcemanager.kubernetesconfiguration.SourceControlConfigurationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public SourceControlConfiguration get(
        String resourceGroupName,
        String clusterRp,
        String clusterResourceName,
        String clusterName,
        String sourceControlConfigurationName) {
        SourceControlConfigurationInner inner =
            this
                .serviceClient()
                .get(resourceGroupName, clusterRp, clusterResourceName, clusterName, sourceControlConfigurationName);
        if (inner != null) {
            return new SourceControlConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SourceControlConfiguration> getWithResponse(
        String resourceGroupName,
        String clusterRp,
        String clusterResourceName,
        String clusterName,
        String sourceControlConfigurationName,
        Context context) {
        Response<SourceControlConfigurationInner> inner =
            this
                .serviceClient()
                .getWithResponse(
                    resourceGroupName,
                    clusterRp,
                    clusterResourceName,
                    clusterName,
                    sourceControlConfigurationName,
                    context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SourceControlConfigurationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SourceControlConfiguration createOrUpdate(
        String resourceGroupName,
        String clusterRp,
        String clusterResourceName,
        String clusterName,
        String sourceControlConfigurationName,
        SourceControlConfigurationInner sourceControlConfiguration) {
        SourceControlConfigurationInner inner =
            this
                .serviceClient()
                .createOrUpdate(
                    resourceGroupName,
                    clusterRp,
                    clusterResourceName,
                    clusterName,
                    sourceControlConfigurationName,
                    sourceControlConfiguration);
        if (inner != null) {
            return new SourceControlConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SourceControlConfiguration> createOrUpdateWithResponse(
        String resourceGroupName,
        String clusterRp,
        String clusterResourceName,
        String clusterName,
        String sourceControlConfigurationName,
        SourceControlConfigurationInner sourceControlConfiguration,
        Context context) {
        Response<SourceControlConfigurationInner> inner =
            this
                .serviceClient()
                .createOrUpdateWithResponse(
                    resourceGroupName,
                    clusterRp,
                    clusterResourceName,
                    clusterName,
                    sourceControlConfigurationName,
                    sourceControlConfiguration,
                    context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SourceControlConfigurationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(
        String resourceGroupName,
        String clusterRp,
        String clusterResourceName,
        String clusterName,
        String sourceControlConfigurationName) {
        this
            .serviceClient()
            .delete(resourceGroupName, clusterRp, clusterResourceName, clusterName, sourceControlConfigurationName);
    }

    public void delete(
        String resourceGroupName,
        String clusterRp,
        String clusterResourceName,
        String clusterName,
        String sourceControlConfigurationName,
        Context context) {
        this
            .serviceClient()
            .delete(
                resourceGroupName,
                clusterRp,
                clusterResourceName,
                clusterName,
                sourceControlConfigurationName,
                context);
    }

    public PagedIterable<SourceControlConfiguration> list(
        String resourceGroupName, String clusterRp, String clusterResourceName, String clusterName) {
        PagedIterable<SourceControlConfigurationInner> inner =
            this.serviceClient().list(resourceGroupName, clusterRp, clusterResourceName, clusterName);
        return Utils.mapPage(inner, inner1 -> new SourceControlConfigurationImpl(inner1, this.manager()));
    }

    public PagedIterable<SourceControlConfiguration> list(
        String resourceGroupName, String clusterRp, String clusterResourceName, String clusterName, Context context) {
        PagedIterable<SourceControlConfigurationInner> inner =
            this.serviceClient().list(resourceGroupName, clusterRp, clusterResourceName, clusterName, context);
        return Utils.mapPage(inner, inner1 -> new SourceControlConfigurationImpl(inner1, this.manager()));
    }

    private SourceControlConfigurationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.kubernetesconfiguration.SourceControlConfigurationManager manager() {
        return this.serviceManager;
    }
}