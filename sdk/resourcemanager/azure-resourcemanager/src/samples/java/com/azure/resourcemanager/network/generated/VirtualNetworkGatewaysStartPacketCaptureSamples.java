// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.models.VpnPacketCaptureStartParameters;

/** Samples for VirtualNetworkGateways StartPacketCapture. */
public final class VirtualNetworkGatewaysStartPacketCaptureSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-08-01/examples/VirtualNetworkGatewayStartPacketCaptureFilterData.json
     */
    /**
     * Sample code: Start packet capture on virtual network gateway with filter.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void startPacketCaptureOnVirtualNetworkGatewayWithFilter(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getVirtualNetworkGateways()
            .startPacketCapture(
                "rg1",
                "vpngw",
                new VpnPacketCaptureStartParameters()
                    .withFilterData(
                        "{'TracingFlags': 11,'MaxPacketBufferSize': 120,'MaxFileSize': 200,'Filters':"
                            + " [{'SourceSubnets': ['20.1.1.0/24'],'DestinationSubnets': ['10.1.1.0/24'],'SourcePort':"
                            + " [500],'DestinationPort': [4500],'Protocol': 6,'TcpFlags':"
                            + " 16,'CaptureSingleDirectionTrafficOnly': true}]}"),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-08-01/examples/VirtualNetworkGatewayStartPacketCapture.json
     */
    /**
     * Sample code: Start packet capture on virtual network gateway without filter.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void startPacketCaptureOnVirtualNetworkGatewayWithoutFilter(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getVirtualNetworkGateways()
            .startPacketCapture("rg1", "vpngw", null, Context.NONE);
    }
}
