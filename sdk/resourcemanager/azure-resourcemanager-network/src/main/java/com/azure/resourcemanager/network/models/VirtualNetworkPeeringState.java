// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for VirtualNetworkPeeringState. */
public final class VirtualNetworkPeeringState extends ExpandableStringEnum<VirtualNetworkPeeringState> {
    /** Static value Initiated for VirtualNetworkPeeringState. */
    public static final VirtualNetworkPeeringState INITIATED = fromString("Initiated");

    /** Static value Connected for VirtualNetworkPeeringState. */
    public static final VirtualNetworkPeeringState CONNECTED = fromString("Connected");

    /** Static value Disconnected for VirtualNetworkPeeringState. */
    public static final VirtualNetworkPeeringState DISCONNECTED = fromString("Disconnected");

    /**
     * Creates or finds a VirtualNetworkPeeringState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VirtualNetworkPeeringState.
     */
    @JsonCreator
    public static VirtualNetworkPeeringState fromString(String name) {
        return fromString(name, VirtualNetworkPeeringState.class);
    }

    /**
     * Gets known VirtualNetworkPeeringState values.
     *
     * @return known VirtualNetworkPeeringState values.
     */
    public static Collection<VirtualNetworkPeeringState> values() {
        return values(VirtualNetworkPeeringState.class);
    }
}
