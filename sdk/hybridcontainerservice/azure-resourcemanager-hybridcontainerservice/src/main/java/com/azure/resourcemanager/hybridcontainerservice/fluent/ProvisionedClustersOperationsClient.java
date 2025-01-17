// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.hybridcontainerservice.fluent.models.ProvisionedClusterUpgradeProfileInner;
import com.azure.resourcemanager.hybridcontainerservice.fluent.models.ProvisionedClustersResponseInner;
import com.azure.resourcemanager.hybridcontainerservice.models.ProvisionedClusters;
import com.azure.resourcemanager.hybridcontainerservice.models.ProvisionedClustersPatch;

/** An instance of this class provides access to all the operations defined in ProvisionedClustersOperationsClient. */
public interface ProvisionedClustersOperationsClient {
    /**
     * Gets the provisioned cluster
     *
     * <p>Gets the Hybrid AKS provisioned cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName Parameter for the name of the provisioned cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Hybrid AKS provisioned cluster along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ProvisionedClustersResponseInner> getByResourceGroupWithResponse(
        String resourceGroupName, String resourceName, Context context);

    /**
     * Gets the provisioned cluster
     *
     * <p>Gets the Hybrid AKS provisioned cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName Parameter for the name of the provisioned cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Hybrid AKS provisioned cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProvisionedClustersResponseInner getByResourceGroup(String resourceGroupName, String resourceName);

    /**
     * Creates the provisioned cluster
     *
     * <p>Creates the Hybrid AKS provisioned cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName Parameter for the name of the provisioned cluster.
     * @param provisionedClusters The provisionedClusters resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the provisionedClusters resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ProvisionedClustersResponseInner>, ProvisionedClustersResponseInner> beginCreateOrUpdate(
        String resourceGroupName, String resourceName, ProvisionedClusters provisionedClusters);

    /**
     * Creates the provisioned cluster
     *
     * <p>Creates the Hybrid AKS provisioned cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName Parameter for the name of the provisioned cluster.
     * @param provisionedClusters The provisionedClusters resource definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the provisionedClusters resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ProvisionedClustersResponseInner>, ProvisionedClustersResponseInner> beginCreateOrUpdate(
        String resourceGroupName, String resourceName, ProvisionedClusters provisionedClusters, Context context);

    /**
     * Creates the provisioned cluster
     *
     * <p>Creates the Hybrid AKS provisioned cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName Parameter for the name of the provisioned cluster.
     * @param provisionedClusters The provisionedClusters resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the provisionedClusters resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProvisionedClustersResponseInner createOrUpdate(
        String resourceGroupName, String resourceName, ProvisionedClusters provisionedClusters);

    /**
     * Creates the provisioned cluster
     *
     * <p>Creates the Hybrid AKS provisioned cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName Parameter for the name of the provisioned cluster.
     * @param provisionedClusters The provisionedClusters resource definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the provisionedClusters resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProvisionedClustersResponseInner createOrUpdate(
        String resourceGroupName, String resourceName, ProvisionedClusters provisionedClusters, Context context);

    /**
     * Deletes the provisioned cluster
     *
     * <p>Deletes the Hybrid AKS provisioned cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName Parameter for the name of the provisioned cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String resourceName, Context context);

    /**
     * Deletes the provisioned cluster
     *
     * <p>Deletes the Hybrid AKS provisioned cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName Parameter for the name of the provisioned cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String resourceName);

    /**
     * Updates the provisioned cluster
     *
     * <p>Updates the Hybrid AKS provisioned cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName Parameter for the name of the provisioned cluster.
     * @param provisionedClusters The provisionedClusters resource patch definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the provisionedClusters resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ProvisionedClustersResponseInner>, ProvisionedClustersResponseInner> beginUpdate(
        String resourceGroupName, String resourceName, ProvisionedClustersPatch provisionedClusters);

    /**
     * Updates the provisioned cluster
     *
     * <p>Updates the Hybrid AKS provisioned cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName Parameter for the name of the provisioned cluster.
     * @param provisionedClusters The provisionedClusters resource patch definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the provisionedClusters resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ProvisionedClustersResponseInner>, ProvisionedClustersResponseInner> beginUpdate(
        String resourceGroupName, String resourceName, ProvisionedClustersPatch provisionedClusters, Context context);

    /**
     * Updates the provisioned cluster
     *
     * <p>Updates the Hybrid AKS provisioned cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName Parameter for the name of the provisioned cluster.
     * @param provisionedClusters The provisionedClusters resource patch definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the provisionedClusters resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProvisionedClustersResponseInner update(
        String resourceGroupName, String resourceName, ProvisionedClustersPatch provisionedClusters);

    /**
     * Updates the provisioned cluster
     *
     * <p>Updates the Hybrid AKS provisioned cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName Parameter for the name of the provisioned cluster.
     * @param provisionedClusters The provisionedClusters resource patch definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the provisionedClusters resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProvisionedClustersResponseInner update(
        String resourceGroupName, String resourceName, ProvisionedClustersPatch provisionedClusters, Context context);

    /**
     * Gets the provisioned clusters in a resource group
     *
     * <p>Gets the Hybrid AKS provisioned cluster in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Hybrid AKS provisioned cluster in a resource group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ProvisionedClustersResponseInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets the provisioned clusters in a resource group
     *
     * <p>Gets the Hybrid AKS provisioned cluster in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Hybrid AKS provisioned cluster in a resource group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ProvisionedClustersResponseInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets the provisioned clusters in a subscription
     *
     * <p>Gets the Hybrid AKS provisioned cluster in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Hybrid AKS provisioned cluster in a subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ProvisionedClustersResponseInner> list();

    /**
     * Gets the provisioned clusters in a subscription
     *
     * <p>Gets the Hybrid AKS provisioned cluster in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Hybrid AKS provisioned cluster in a subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ProvisionedClustersResponseInner> list(Context context);

    /**
     * Gets the upgrade profile of a provisioned cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName Parameter for the name of the provisioned cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the upgrade profile of a provisioned cluster along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ProvisionedClusterUpgradeProfileInner> getUpgradeProfileWithResponse(
        String resourceGroupName, String resourceName, Context context);

    /**
     * Gets the upgrade profile of a provisioned cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName Parameter for the name of the provisioned cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the upgrade profile of a provisioned cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProvisionedClusterUpgradeProfileInner getUpgradeProfile(String resourceGroupName, String resourceName);

    /**
     * Upgrades the node image version of the cluster control plane and all agent pools to the latest.
     *
     * <p>Upgrading the node image version of a cluster applies the newest OS and runtime updates to the nodes.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName Parameter for the name of the provisioned cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginUpgradeNodeImageVersionForEntireCluster(
        String resourceGroupName, String resourceName);

    /**
     * Upgrades the node image version of the cluster control plane and all agent pools to the latest.
     *
     * <p>Upgrading the node image version of a cluster applies the newest OS and runtime updates to the nodes.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName Parameter for the name of the provisioned cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginUpgradeNodeImageVersionForEntireCluster(
        String resourceGroupName, String resourceName, Context context);

    /**
     * Upgrades the node image version of the cluster control plane and all agent pools to the latest.
     *
     * <p>Upgrading the node image version of a cluster applies the newest OS and runtime updates to the nodes.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName Parameter for the name of the provisioned cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void upgradeNodeImageVersionForEntireCluster(String resourceGroupName, String resourceName);

    /**
     * Upgrades the node image version of the cluster control plane and all agent pools to the latest.
     *
     * <p>Upgrading the node image version of a cluster applies the newest OS and runtime updates to the nodes.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName Parameter for the name of the provisioned cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void upgradeNodeImageVersionForEntireCluster(String resourceGroupName, String resourceName, Context context);
}
