// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.GovernanceRuleList;

public final class GovernanceRuleListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GovernanceRuleList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"tenantId\":\"eakxcptsoqfyi\",\"displayName\":\"seqchkrt\",\"description\":\"razisg\",\"remediationTimeframe\":\"iuemvanbwzohmnr\",\"isGracePeriod\":false,\"rulePriority\":1409401531,\"isDisabled\":false,\"ruleType\":\"ServiceNow\",\"sourceResourceType\":\"Assessments\",\"excludedScopes\":[],\"conditionSets\":[],\"includeMemberScopes\":false},\"id\":\"ptysprq\",\"name\":\"gnzxojpslsvj\",\"type\":\"pli\"},{\"properties\":{\"tenantId\":\"qwoyxqvapco\",\"displayName\":\"houcqpqojxc\",\"description\":\"rzdcgdzbenribcaw\",\"remediationTimeframe\":\"zqddtjwfljhzn\",\"isGracePeriod\":true,\"rulePriority\":1578404842,\"isDisabled\":false,\"ruleType\":\"ServiceNow\",\"sourceResourceType\":\"Assessments\",\"excludedScopes\":[],\"conditionSets\":[],\"includeMemberScopes\":false},\"id\":\"cqtjzmi\",\"name\":\"vgbgatzuuvbxng\",\"type\":\"ebwgga\"}],\"nextLink\":\"tzlswvaj\"}")
                .toObject(GovernanceRuleList.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GovernanceRuleList model = new GovernanceRuleList();
        model = BinaryData.fromObject(model).toObject(GovernanceRuleList.class);
    }
}
