// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.ScanInner;
import com.azure.resourcemanager.security.models.ScanProperties;
import com.azure.resourcemanager.security.models.ScanState;
import com.azure.resourcemanager.security.models.ScanTriggerType;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class ScanInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScanInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"triggerType\":\"OnDemand\",\"state\":\"Failed\",\"server\":\"qxkfaoytehqp\",\"database\":\"jmvqmtd\",\"sqlVersion\":\"kygroejnndljdj\",\"startTime\":\"2021-06-10T12:23:34Z\",\"endTime\":\"2021-10-05T05:25:57Z\",\"highSeverityFailedRulesCount\":721196511,\"mediumSeverityFailedRulesCount\":1365280393,\"lowSeverityFailedRulesCount\":1266786667,\"totalPassedRulesCount\":775860156,\"totalFailedRulesCount\":1038421069,\"totalRulesCount\":443763123,\"isBaselineApplied\":false,\"lastScanTime\":\"2021-08-01T00:50:40Z\"},\"id\":\"lwryshwddkvbxgkq\",\"name\":\"sybwptdaca\",\"type\":\"vvlfntymtp\"}")
                .toObject(ScanInner.class);
        Assertions.assertEquals(ScanTriggerType.ON_DEMAND, model.properties().triggerType());
        Assertions.assertEquals(ScanState.FAILED, model.properties().state());
        Assertions.assertEquals("qxkfaoytehqp", model.properties().server());
        Assertions.assertEquals("jmvqmtd", model.properties().database());
        Assertions.assertEquals("kygroejnndljdj", model.properties().sqlVersion());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-10T12:23:34Z"), model.properties().startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-05T05:25:57Z"), model.properties().endTime());
        Assertions.assertEquals(721196511, model.properties().highSeverityFailedRulesCount());
        Assertions.assertEquals(1365280393, model.properties().mediumSeverityFailedRulesCount());
        Assertions.assertEquals(1266786667, model.properties().lowSeverityFailedRulesCount());
        Assertions.assertEquals(775860156, model.properties().totalPassedRulesCount());
        Assertions.assertEquals(1038421069, model.properties().totalFailedRulesCount());
        Assertions.assertEquals(443763123, model.properties().totalRulesCount());
        Assertions.assertEquals(false, model.properties().isBaselineApplied());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-01T00:50:40Z"), model.properties().lastScanTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScanInner model =
            new ScanInner()
                .withProperties(
                    new ScanProperties()
                        .withTriggerType(ScanTriggerType.ON_DEMAND)
                        .withState(ScanState.FAILED)
                        .withServer("qxkfaoytehqp")
                        .withDatabase("jmvqmtd")
                        .withSqlVersion("kygroejnndljdj")
                        .withStartTime(OffsetDateTime.parse("2021-06-10T12:23:34Z"))
                        .withEndTime(OffsetDateTime.parse("2021-10-05T05:25:57Z"))
                        .withHighSeverityFailedRulesCount(721196511)
                        .withMediumSeverityFailedRulesCount(1365280393)
                        .withLowSeverityFailedRulesCount(1266786667)
                        .withTotalPassedRulesCount(775860156)
                        .withTotalFailedRulesCount(1038421069)
                        .withTotalRulesCount(443763123)
                        .withIsBaselineApplied(false)
                        .withLastScanTime(OffsetDateTime.parse("2021-08-01T00:50:40Z")));
        model = BinaryData.fromObject(model).toObject(ScanInner.class);
        Assertions.assertEquals(ScanTriggerType.ON_DEMAND, model.properties().triggerType());
        Assertions.assertEquals(ScanState.FAILED, model.properties().state());
        Assertions.assertEquals("qxkfaoytehqp", model.properties().server());
        Assertions.assertEquals("jmvqmtd", model.properties().database());
        Assertions.assertEquals("kygroejnndljdj", model.properties().sqlVersion());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-10T12:23:34Z"), model.properties().startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-05T05:25:57Z"), model.properties().endTime());
        Assertions.assertEquals(721196511, model.properties().highSeverityFailedRulesCount());
        Assertions.assertEquals(1365280393, model.properties().mediumSeverityFailedRulesCount());
        Assertions.assertEquals(1266786667, model.properties().lowSeverityFailedRulesCount());
        Assertions.assertEquals(775860156, model.properties().totalPassedRulesCount());
        Assertions.assertEquals(1038421069, model.properties().totalFailedRulesCount());
        Assertions.assertEquals(443763123, model.properties().totalRulesCount());
        Assertions.assertEquals(false, model.properties().isBaselineApplied());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-01T00:50:40Z"), model.properties().lastScanTime());
    }
}
