// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.chaos.models.StepStatus;

public final class StepStatusTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StepStatus model =
            BinaryData
                .fromString(
                    "{\"stepName\":\"tdum\",\"stepId\":\"p\",\"status\":\"ebmnzbtbhjpglk\",\"branches\":[{\"branchName\":\"dneu\",\"branchId\":\"fphsdyhtozfikdow\",\"status\":\"uuvxz\",\"actions\":[{\"actionName\":\"ithhqzon\",\"actionId\":\"ggbhcohfwds\",\"status\":\"ka\",\"startTime\":\"2021-05-13T01:39:31Z\",\"endTime\":\"2021-03-15T03:19:59Z\",\"targets\":[{},{},{}]},{\"actionName\":\"acffgdkzzewkfvhq\",\"actionId\":\"a\",\"status\":\"vpnpp\",\"startTime\":\"2021-10-20T12:14:16Z\",\"endTime\":\"2021-03-21T05:49:29Z\",\"targets\":[{},{},{}]},{\"actionName\":\"hdlxyjrxsagafcn\",\"actionId\":\"gwq\",\"status\":\"nedgfbc\",\"startTime\":\"2021-07-29T10:41:12Z\",\"endTime\":\"2021-05-31T02:02:01Z\",\"targets\":[{},{},{},{}]},{\"actionName\":\"eqdcv\",\"actionId\":\"hvoodsotbobzd\",\"status\":\"cjwvn\",\"startTime\":\"2021-06-06T16:32:33Z\",\"endTime\":\"2021-11-29T05:13:59Z\",\"targets\":[{}]}]},{\"branchName\":\"cxrslpmutwuoe\",\"branchId\":\"pkhjwni\",\"status\":\"sluicpdggkzz\",\"actions\":[{\"actionName\":\"mpaxmodfvuefywsb\",\"actionId\":\"vmwy\",\"status\":\"fouyf\",\"startTime\":\"2021-03-21T19:22:18Z\",\"endTime\":\"2021-01-14T19:12:22Z\",\"targets\":[{},{},{},{}]},{\"actionName\":\"yzvqt\",\"actionId\":\"ubex\",\"status\":\"zksmondj\",\"startTime\":\"2021-10-31T06:50:30Z\",\"endTime\":\"2021-06-21T21:58:07Z\",\"targets\":[{},{},{},{}]},{\"actionName\":\"mg\",\"actionId\":\"pkwhojvpa\",\"status\":\"gxysmocmbqfqvm\",\"startTime\":\"2021-03-02T11:08:18Z\",\"endTime\":\"2021-10-15T15:22:20Z\",\"targets\":[{},{},{}]},{\"actionName\":\"helxprglya\",\"actionId\":\"dckcbc\",\"status\":\"jrjxgciqibrhosx\",\"startTime\":\"2021-10-09T16:21:07Z\",\"endTime\":\"2021-07-12T05:33:05Z\",\"targets\":[{}]}]}]}")
                .toObject(StepStatus.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StepStatus model = new StepStatus();
        model = BinaryData.fromObject(model).toObject(StepStatus.class);
    }
}
