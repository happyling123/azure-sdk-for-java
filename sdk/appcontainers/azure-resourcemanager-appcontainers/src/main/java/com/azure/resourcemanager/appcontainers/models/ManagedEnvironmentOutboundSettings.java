// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Configuration used to control the Environment Egress outbound traffic. */
@Fluent
public final class ManagedEnvironmentOutboundSettings {
    /*
     * Outbound type for the cluster
     */
    @JsonProperty(value = "outBoundType")
    private ManagedEnvironmentOutBoundType outBoundType;

    /*
     * Virtual Appliance IP used as the Egress controller for the Environment
     */
    @JsonProperty(value = "virtualNetworkApplianceIp")
    private String virtualNetworkApplianceIp;

    /** Creates an instance of ManagedEnvironmentOutboundSettings class. */
    public ManagedEnvironmentOutboundSettings() {
    }

    /**
     * Get the outBoundType property: Outbound type for the cluster.
     *
     * @return the outBoundType value.
     */
    public ManagedEnvironmentOutBoundType outBoundType() {
        return this.outBoundType;
    }

    /**
     * Set the outBoundType property: Outbound type for the cluster.
     *
     * @param outBoundType the outBoundType value to set.
     * @return the ManagedEnvironmentOutboundSettings object itself.
     */
    public ManagedEnvironmentOutboundSettings withOutBoundType(ManagedEnvironmentOutBoundType outBoundType) {
        this.outBoundType = outBoundType;
        return this;
    }

    /**
     * Get the virtualNetworkApplianceIp property: Virtual Appliance IP used as the Egress controller for the
     * Environment.
     *
     * @return the virtualNetworkApplianceIp value.
     */
    public String virtualNetworkApplianceIp() {
        return this.virtualNetworkApplianceIp;
    }

    /**
     * Set the virtualNetworkApplianceIp property: Virtual Appliance IP used as the Egress controller for the
     * Environment.
     *
     * @param virtualNetworkApplianceIp the virtualNetworkApplianceIp value to set.
     * @return the ManagedEnvironmentOutboundSettings object itself.
     */
    public ManagedEnvironmentOutboundSettings withVirtualNetworkApplianceIp(String virtualNetworkApplianceIp) {
        this.virtualNetworkApplianceIp = virtualNetworkApplianceIp;
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
