// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.models;

import com.azure.resourcemanager.storagemover.fluent.models.JobRunInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of JobRun. */
public interface JobRun {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the status property: The state of the job execution.
     *
     * @return the status value.
     */
    JobRunStatus status();

    /**
     * Gets the scanStatus property: The status of Agent's scanning of source.
     *
     * @return the scanStatus value.
     */
    JobRunScanStatus scanStatus();

    /**
     * Gets the agentName property: Name of the Agent assigned to this run.
     *
     * @return the agentName value.
     */
    String agentName();

    /**
     * Gets the agentResourceId property: Fully qualified resource id of the Agent assigned to this run.
     *
     * @return the agentResourceId value.
     */
    String agentResourceId();

    /**
     * Gets the executionStartTime property: Start time of the run. Null if no Agent reported that the job has started.
     *
     * @return the executionStartTime value.
     */
    OffsetDateTime executionStartTime();

    /**
     * Gets the executionEndTime property: End time of the run. Null if Agent has not reported that the job has ended.
     *
     * @return the executionEndTime value.
     */
    OffsetDateTime executionEndTime();

    /**
     * Gets the lastStatusUpdate property: The last updated time of the Job Run.
     *
     * @return the lastStatusUpdate value.
     */
    OffsetDateTime lastStatusUpdate();

    /**
     * Gets the itemsScanned property: Number of items scanned so far in source.
     *
     * @return the itemsScanned value.
     */
    Long itemsScanned();

    /**
     * Gets the itemsExcluded property: Number of items that will not be transferred, as they are excluded by user
     * configuration.
     *
     * @return the itemsExcluded value.
     */
    Long itemsExcluded();

    /**
     * Gets the itemsUnsupported property: Number of items that will not be transferred, as they are unsupported on
     * target.
     *
     * @return the itemsUnsupported value.
     */
    Long itemsUnsupported();

    /**
     * Gets the itemsNoTransferNeeded property: Number of items that will not be transferred, as they are already found
     * on target (e.g. mirror mode).
     *
     * @return the itemsNoTransferNeeded value.
     */
    Long itemsNoTransferNeeded();

    /**
     * Gets the itemsFailed property: Number of items that were attempted to transfer and failed.
     *
     * @return the itemsFailed value.
     */
    Long itemsFailed();

    /**
     * Gets the itemsTransferred property: Number of items successfully transferred to target.
     *
     * @return the itemsTransferred value.
     */
    Long itemsTransferred();

    /**
     * Gets the bytesScanned property: Bytes of data scanned so far in source.
     *
     * @return the bytesScanned value.
     */
    Long bytesScanned();

    /**
     * Gets the bytesExcluded property: Bytes of data that will not be transferred, as they are excluded by user
     * configuration.
     *
     * @return the bytesExcluded value.
     */
    Long bytesExcluded();

    /**
     * Gets the bytesUnsupported property: Bytes of data that will not be transferred, as they are unsupported on
     * target.
     *
     * @return the bytesUnsupported value.
     */
    Long bytesUnsupported();

    /**
     * Gets the bytesNoTransferNeeded property: Bytes of data that will not be transferred, as they are already found on
     * target (e.g. mirror mode).
     *
     * @return the bytesNoTransferNeeded value.
     */
    Long bytesNoTransferNeeded();

    /**
     * Gets the bytesFailed property: Bytes of data that were attempted to transfer and failed.
     *
     * @return the bytesFailed value.
     */
    Long bytesFailed();

    /**
     * Gets the bytesTransferred property: Bytes of data successfully transferred to target.
     *
     * @return the bytesTransferred value.
     */
    Long bytesTransferred();

    /**
     * Gets the sourceName property: Name of source Endpoint resource. This resource may no longer exist.
     *
     * @return the sourceName value.
     */
    String sourceName();

    /**
     * Gets the sourceResourceId property: Fully qualified resource id of source Endpoint. This id may no longer exist.
     *
     * @return the sourceResourceId value.
     */
    String sourceResourceId();

    /**
     * Gets the sourceProperties property: Copy of source Endpoint resource's properties at time of Job Run creation.
     *
     * @return the sourceProperties value.
     */
    Object sourceProperties();

    /**
     * Gets the targetName property: Name of target Endpoint resource. This resource may no longer exist.
     *
     * @return the targetName value.
     */
    String targetName();

    /**
     * Gets the targetResourceId property: Fully qualified resource id of of Endpoint. This id may no longer exist.
     *
     * @return the targetResourceId value.
     */
    String targetResourceId();

    /**
     * Gets the targetProperties property: Copy of Endpoint resource's properties at time of Job Run creation.
     *
     * @return the targetProperties value.
     */
    Object targetProperties();

    /**
     * Gets the jobDefinitionProperties property: Copy of parent Job Definition's properties at time of Job Run
     * creation.
     *
     * @return the jobDefinitionProperties value.
     */
    Object jobDefinitionProperties();

    /**
     * Gets the error property: Error details.
     *
     * @return the error value.
     */
    JobRunError error();

    /**
     * Gets the provisioningState property: The provisioning state of this resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the inner com.azure.resourcemanager.storagemover.fluent.models.JobRunInner object.
     *
     * @return the inner object.
     */
    JobRunInner innerModel();
}
