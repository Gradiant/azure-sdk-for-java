// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** InMageAzureV2 Managed disk details. */
@Fluent
public final class InMageAzureV2ManagedDiskDetails {
    /*
     * The disk id.
     */
    @JsonProperty(value = "diskId")
    private String diskId;

    /*
     * Seed managed disk Id.
     */
    @JsonProperty(value = "seedManagedDiskId")
    private String seedManagedDiskId;

    /*
     * The replica disk type.
     */
    @JsonProperty(value = "replicaDiskType")
    private String replicaDiskType;

    /*
     * The DiskEncryptionSet ARM ID.
     */
    @JsonProperty(value = "diskEncryptionSetId")
    private String diskEncryptionSetId;

    /*
     * The target disk name.
     */
    @JsonProperty(value = "targetDiskName")
    private String targetDiskName;

    /** Creates an instance of InMageAzureV2ManagedDiskDetails class. */
    public InMageAzureV2ManagedDiskDetails() {
    }

    /**
     * Get the diskId property: The disk id.
     *
     * @return the diskId value.
     */
    public String diskId() {
        return this.diskId;
    }

    /**
     * Set the diskId property: The disk id.
     *
     * @param diskId the diskId value to set.
     * @return the InMageAzureV2ManagedDiskDetails object itself.
     */
    public InMageAzureV2ManagedDiskDetails withDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }

    /**
     * Get the seedManagedDiskId property: Seed managed disk Id.
     *
     * @return the seedManagedDiskId value.
     */
    public String seedManagedDiskId() {
        return this.seedManagedDiskId;
    }

    /**
     * Set the seedManagedDiskId property: Seed managed disk Id.
     *
     * @param seedManagedDiskId the seedManagedDiskId value to set.
     * @return the InMageAzureV2ManagedDiskDetails object itself.
     */
    public InMageAzureV2ManagedDiskDetails withSeedManagedDiskId(String seedManagedDiskId) {
        this.seedManagedDiskId = seedManagedDiskId;
        return this;
    }

    /**
     * Get the replicaDiskType property: The replica disk type.
     *
     * @return the replicaDiskType value.
     */
    public String replicaDiskType() {
        return this.replicaDiskType;
    }

    /**
     * Set the replicaDiskType property: The replica disk type.
     *
     * @param replicaDiskType the replicaDiskType value to set.
     * @return the InMageAzureV2ManagedDiskDetails object itself.
     */
    public InMageAzureV2ManagedDiskDetails withReplicaDiskType(String replicaDiskType) {
        this.replicaDiskType = replicaDiskType;
        return this;
    }

    /**
     * Get the diskEncryptionSetId property: The DiskEncryptionSet ARM ID.
     *
     * @return the diskEncryptionSetId value.
     */
    public String diskEncryptionSetId() {
        return this.diskEncryptionSetId;
    }

    /**
     * Set the diskEncryptionSetId property: The DiskEncryptionSet ARM ID.
     *
     * @param diskEncryptionSetId the diskEncryptionSetId value to set.
     * @return the InMageAzureV2ManagedDiskDetails object itself.
     */
    public InMageAzureV2ManagedDiskDetails withDiskEncryptionSetId(String diskEncryptionSetId) {
        this.diskEncryptionSetId = diskEncryptionSetId;
        return this;
    }

    /**
     * Get the targetDiskName property: The target disk name.
     *
     * @return the targetDiskName value.
     */
    public String targetDiskName() {
        return this.targetDiskName;
    }

    /**
     * Set the targetDiskName property: The target disk name.
     *
     * @param targetDiskName the targetDiskName value to set.
     * @return the InMageAzureV2ManagedDiskDetails object itself.
     */
    public InMageAzureV2ManagedDiskDetails withTargetDiskName(String targetDiskName) {
        this.targetDiskName = targetDiskName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
