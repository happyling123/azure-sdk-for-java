// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureIaaSvmProtectedItemExtendedInfo;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class AzureIaaSvmProtectedItemExtendedInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureIaaSvmProtectedItemExtendedInfo model =
            BinaryData
                .fromString(
                    "{\"oldestRecoveryPoint\":\"2021-01-01T13:50:02Z\",\"oldestRecoveryPointInVault\":\"2021-03-01T13:31:29Z\",\"oldestRecoveryPointInArchive\":\"2021-09-08T06:19:33Z\",\"newestRecoveryPointInArchive\":\"2021-02-27T13:49:15Z\",\"recoveryPointCount\":1614999854,\"policyInconsistent\":true}")
                .toObject(AzureIaaSvmProtectedItemExtendedInfo.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-01T13:50:02Z"), model.oldestRecoveryPoint());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-01T13:31:29Z"), model.oldestRecoveryPointInVault());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-08T06:19:33Z"), model.oldestRecoveryPointInArchive());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-27T13:49:15Z"), model.newestRecoveryPointInArchive());
        Assertions.assertEquals(1614999854, model.recoveryPointCount());
        Assertions.assertEquals(true, model.policyInconsistent());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureIaaSvmProtectedItemExtendedInfo model =
            new AzureIaaSvmProtectedItemExtendedInfo()
                .withOldestRecoveryPoint(OffsetDateTime.parse("2021-01-01T13:50:02Z"))
                .withOldestRecoveryPointInVault(OffsetDateTime.parse("2021-03-01T13:31:29Z"))
                .withOldestRecoveryPointInArchive(OffsetDateTime.parse("2021-09-08T06:19:33Z"))
                .withNewestRecoveryPointInArchive(OffsetDateTime.parse("2021-02-27T13:49:15Z"))
                .withRecoveryPointCount(1614999854)
                .withPolicyInconsistent(true);
        model = BinaryData.fromObject(model).toObject(AzureIaaSvmProtectedItemExtendedInfo.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-01T13:50:02Z"), model.oldestRecoveryPoint());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-01T13:31:29Z"), model.oldestRecoveryPointInVault());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-08T06:19:33Z"), model.oldestRecoveryPointInArchive());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-27T13:49:15Z"), model.newestRecoveryPointInArchive());
        Assertions.assertEquals(1614999854, model.recoveryPointCount());
        Assertions.assertEquals(true, model.policyInconsistent());
    }
}
