// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.fluent.models.WorkloadNetworkVMGroupProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class WorkloadNetworkVMGroupPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkloadNetworkVMGroupProperties model =
            BinaryData
                .fromString(
                    "{\"displayName\":\"gnayqigynduh\",\"members\":[\"qlkth\",\"maqolbgycduie\",\"tgccymvaolpss\"],\"status\":\"FAILURE\",\"provisioningState\":\"Failed\",\"revision\":940610692718193227}")
                .toObject(WorkloadNetworkVMGroupProperties.class);
        Assertions.assertEquals("gnayqigynduh", model.displayName());
        Assertions.assertEquals("qlkth", model.members().get(0));
        Assertions.assertEquals(940610692718193227L, model.revision());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkloadNetworkVMGroupProperties model =
            new WorkloadNetworkVMGroupProperties()
                .withDisplayName("gnayqigynduh")
                .withMembers(Arrays.asList("qlkth", "maqolbgycduie", "tgccymvaolpss"))
                .withRevision(940610692718193227L);
        model = BinaryData.fromObject(model).toObject(WorkloadNetworkVMGroupProperties.class);
        Assertions.assertEquals("gnayqigynduh", model.displayName());
        Assertions.assertEquals("qlkth", model.members().get(0));
        Assertions.assertEquals(940610692718193227L, model.revision());
    }
}
