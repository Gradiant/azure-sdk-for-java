// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of IotConnectorFhirDestinations. */
public interface IotConnectorFhirDestinations {
    /**
     * Gets the properties of the specified Iot Connector FHIR destination.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @param iotConnectorName The name of IoT Connector resource.
     * @param fhirDestinationName The name of IoT Connector FHIR destination resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified Iot Connector FHIR destination.
     */
    IotFhirDestination get(
        String resourceGroupName, String workspaceName, String iotConnectorName, String fhirDestinationName);

    /**
     * Gets the properties of the specified Iot Connector FHIR destination.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @param iotConnectorName The name of IoT Connector resource.
     * @param fhirDestinationName The name of IoT Connector FHIR destination resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified Iot Connector FHIR destination along with {@link Response}.
     */
    Response<IotFhirDestination> getWithResponse(
        String resourceGroupName,
        String workspaceName,
        String iotConnectorName,
        String fhirDestinationName,
        Context context);

    /**
     * Deletes an IoT Connector FHIR destination.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @param iotConnectorName The name of IoT Connector resource.
     * @param fhirDestinationName The name of IoT Connector FHIR destination resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String workspaceName, String iotConnectorName, String fhirDestinationName);

    /**
     * Deletes an IoT Connector FHIR destination.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @param iotConnectorName The name of IoT Connector resource.
     * @param fhirDestinationName The name of IoT Connector FHIR destination resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName,
        String workspaceName,
        String iotConnectorName,
        String fhirDestinationName,
        Context context);

    /**
     * Gets the properties of the specified Iot Connector FHIR destination.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified Iot Connector FHIR destination along with {@link Response}.
     */
    IotFhirDestination getById(String id);

    /**
     * Gets the properties of the specified Iot Connector FHIR destination.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified Iot Connector FHIR destination along with {@link Response}.
     */
    Response<IotFhirDestination> getByIdWithResponse(String id, Context context);

    /**
     * Deletes an IoT Connector FHIR destination.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes an IoT Connector FHIR destination.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new IotFhirDestination resource.
     *
     * @param name resource name.
     * @return the first stage of the new IotFhirDestination definition.
     */
    IotFhirDestination.DefinitionStages.Blank define(String name);
}