// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.AlertsState;
import com.azure.resourcemanager.dataprotection.models.AzureMonitorAlertSettings;
import com.azure.resourcemanager.dataprotection.models.BackupVault;
import com.azure.resourcemanager.dataprotection.models.CrossRegionRestoreSettings;
import com.azure.resourcemanager.dataprotection.models.CrossRegionRestoreState;
import com.azure.resourcemanager.dataprotection.models.CrossSubscriptionRestoreSettings;
import com.azure.resourcemanager.dataprotection.models.CrossSubscriptionRestoreState;
import com.azure.resourcemanager.dataprotection.models.FeatureSettings;
import com.azure.resourcemanager.dataprotection.models.ImmutabilitySettings;
import com.azure.resourcemanager.dataprotection.models.ImmutabilityState;
import com.azure.resourcemanager.dataprotection.models.MonitoringSettings;
import com.azure.resourcemanager.dataprotection.models.SecuritySettings;
import com.azure.resourcemanager.dataprotection.models.SoftDeleteSettings;
import com.azure.resourcemanager.dataprotection.models.SoftDeleteState;
import com.azure.resourcemanager.dataprotection.models.StorageSetting;
import com.azure.resourcemanager.dataprotection.models.StorageSettingStoreTypes;
import com.azure.resourcemanager.dataprotection.models.StorageSettingTypes;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class BackupVaultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BackupVault model =
            BinaryData
                .fromString(
                    "{\"monitoringSettings\":{\"azureMonitorAlertSettings\":{\"alertsForAllJobFailures\":\"Enabled\"}},\"provisioningState\":\"Updating\",\"resourceMoveState\":\"PrepareTimedout\",\"resourceMoveDetails\":{\"operationId\":\"gou\",\"startTimeUtc\":\"ndlik\",\"completionTimeUtc\":\"qkgfgibma\",\"sourceResourcePath\":\"akeqs\",\"targetResourcePath\":\"yb\"},\"securitySettings\":{\"softDeleteSettings\":{\"state\":\"Off\",\"retentionDurationInDays\":18.452690158174846},\"immutabilitySettings\":{\"state\":\"Unlocked\"}},\"storageSettings\":[{\"datastoreType\":\"ArchiveStore\",\"type\":\"GeoRedundant\"}],\"isVaultProtectedByResourceGuard\":true,\"featureSettings\":{\"crossSubscriptionRestoreSettings\":{\"state\":\"PermanentlyDisabled\"},\"crossRegionRestoreSettings\":{\"state\":\"Disabled\"}},\"secureScore\":\"Adequate\"}")
                .toObject(BackupVault.class);
        Assertions
            .assertEquals(
                AlertsState.ENABLED, model.monitoringSettings().azureMonitorAlertSettings().alertsForAllJobFailures());
        Assertions.assertEquals(SoftDeleteState.OFF, model.securitySettings().softDeleteSettings().state());
        Assertions
            .assertEquals(18.452690158174846D, model.securitySettings().softDeleteSettings().retentionDurationInDays());
        Assertions.assertEquals(ImmutabilityState.UNLOCKED, model.securitySettings().immutabilitySettings().state());
        Assertions.assertEquals(StorageSettingStoreTypes.ARCHIVE_STORE, model.storageSettings().get(0).datastoreType());
        Assertions.assertEquals(StorageSettingTypes.GEO_REDUNDANT, model.storageSettings().get(0).type());
        Assertions
            .assertEquals(
                CrossSubscriptionRestoreState.PERMANENTLY_DISABLED,
                model.featureSettings().crossSubscriptionRestoreSettings().state());
        Assertions
            .assertEquals(
                CrossRegionRestoreState.DISABLED, model.featureSettings().crossRegionRestoreSettings().state());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BackupVault model =
            new BackupVault()
                .withMonitoringSettings(
                    new MonitoringSettings()
                        .withAzureMonitorAlertSettings(
                            new AzureMonitorAlertSettings().withAlertsForAllJobFailures(AlertsState.ENABLED)))
                .withSecuritySettings(
                    new SecuritySettings()
                        .withSoftDeleteSettings(
                            new SoftDeleteSettings()
                                .withState(SoftDeleteState.OFF)
                                .withRetentionDurationInDays(18.452690158174846D))
                        .withImmutabilitySettings(new ImmutabilitySettings().withState(ImmutabilityState.UNLOCKED)))
                .withStorageSettings(
                    Arrays
                        .asList(
                            new StorageSetting()
                                .withDatastoreType(StorageSettingStoreTypes.ARCHIVE_STORE)
                                .withType(StorageSettingTypes.GEO_REDUNDANT)))
                .withFeatureSettings(
                    new FeatureSettings()
                        .withCrossSubscriptionRestoreSettings(
                            new CrossSubscriptionRestoreSettings()
                                .withState(CrossSubscriptionRestoreState.PERMANENTLY_DISABLED))
                        .withCrossRegionRestoreSettings(
                            new CrossRegionRestoreSettings().withState(CrossRegionRestoreState.DISABLED)));
        model = BinaryData.fromObject(model).toObject(BackupVault.class);
        Assertions
            .assertEquals(
                AlertsState.ENABLED, model.monitoringSettings().azureMonitorAlertSettings().alertsForAllJobFailures());
        Assertions.assertEquals(SoftDeleteState.OFF, model.securitySettings().softDeleteSettings().state());
        Assertions
            .assertEquals(18.452690158174846D, model.securitySettings().softDeleteSettings().retentionDurationInDays());
        Assertions.assertEquals(ImmutabilityState.UNLOCKED, model.securitySettings().immutabilitySettings().state());
        Assertions.assertEquals(StorageSettingStoreTypes.ARCHIVE_STORE, model.storageSettings().get(0).datastoreType());
        Assertions.assertEquals(StorageSettingTypes.GEO_REDUNDANT, model.storageSettings().get(0).type());
        Assertions
            .assertEquals(
                CrossSubscriptionRestoreState.PERMANENTLY_DISABLED,
                model.featureSettings().crossSubscriptionRestoreSettings().state());
        Assertions
            .assertEquals(
                CrossRegionRestoreState.DISABLED, model.featureSettings().crossRegionRestoreSettings().state());
    }
}
