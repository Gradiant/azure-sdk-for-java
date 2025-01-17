// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureStorageProtectableContainer;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupManagementType;
import org.junit.jupiter.api.Assertions;

public final class AzureStorageProtectableContainerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureStorageProtectableContainer model =
            BinaryData
                .fromString(
                    "{\"protectableContainerType\":\"StorageContainer\",\"friendlyName\":\"udgzhxogjgg\",\"backupManagementType\":\"MAB\",\"healthStatus\":\"jkxibda\",\"containerId\":\"rkmdyom\"}")
                .toObject(AzureStorageProtectableContainer.class);
        Assertions.assertEquals("udgzhxogjgg", model.friendlyName());
        Assertions.assertEquals(BackupManagementType.MAB, model.backupManagementType());
        Assertions.assertEquals("jkxibda", model.healthStatus());
        Assertions.assertEquals("rkmdyom", model.containerId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureStorageProtectableContainer model =
            new AzureStorageProtectableContainer()
                .withFriendlyName("udgzhxogjgg")
                .withBackupManagementType(BackupManagementType.MAB)
                .withHealthStatus("jkxibda")
                .withContainerId("rkmdyom");
        model = BinaryData.fromObject(model).toObject(AzureStorageProtectableContainer.class);
        Assertions.assertEquals("udgzhxogjgg", model.friendlyName());
        Assertions.assertEquals(BackupManagementType.MAB, model.backupManagementType());
        Assertions.assertEquals("jkxibda", model.healthStatus());
        Assertions.assertEquals("rkmdyom", model.containerId());
    }
}
