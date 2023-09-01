// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.resourcemanager.network.fluent.models.ConnectionResetSharedKeyInner;

/** Samples for VirtualNetworkGatewayConnections ResetSharedKey. */
public final class VirtualNetworkGatewayConnectionsResetSharedKeySamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-05-01/examples/VirtualNetworkGatewayConnectionResetSharedKey.json
     */
    /**
     * Sample code: ResetVirtualNetworkGatewayConnectionSharedKey.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void resetVirtualNetworkGatewayConnectionSharedKey(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getVirtualNetworkGatewayConnections()
            .resetSharedKey(
                "rg1",
                "conn1",
                new ConnectionResetSharedKeyInner().withKeyLength(128),
                com.azure.core.util.Context.NONE);
    }
}
