// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for VirtualNetworkGatewayType. */
public final class VirtualNetworkGatewayType extends ExpandableStringEnum<VirtualNetworkGatewayType> {
    /** Static value Vpn for VirtualNetworkGatewayType. */
    public static final VirtualNetworkGatewayType VPN = fromString("Vpn");

    /** Static value ExpressRoute for VirtualNetworkGatewayType. */
    public static final VirtualNetworkGatewayType EXPRESS_ROUTE = fromString("ExpressRoute");

    /** Static value LocalGateway for VirtualNetworkGatewayType. */
    public static final VirtualNetworkGatewayType LOCAL_GATEWAY = fromString("LocalGateway");

    /**
     * Creates or finds a VirtualNetworkGatewayType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VirtualNetworkGatewayType.
     */
    @JsonCreator
    public static VirtualNetworkGatewayType fromString(String name) {
        return fromString(name, VirtualNetworkGatewayType.class);
    }

    /**
     * Gets known VirtualNetworkGatewayType values.
     *
     * @return known VirtualNetworkGatewayType values.
     */
    public static Collection<VirtualNetworkGatewayType> values() {
        return values(VirtualNetworkGatewayType.class);
    }
}
