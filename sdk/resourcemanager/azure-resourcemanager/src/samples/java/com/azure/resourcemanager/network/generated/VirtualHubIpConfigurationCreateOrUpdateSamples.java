// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.resourcemanager.network.fluent.models.HubIpConfigurationInner;
import com.azure.resourcemanager.network.fluent.models.SubnetInner;

/** Samples for VirtualHubIpConfiguration CreateOrUpdate. */
public final class VirtualHubIpConfigurationCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-05-01/examples/VirtualHubIpConfigurationPut.json
     */
    /**
     * Sample code: VirtualHubIpConfigurationPut.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void virtualHubIpConfigurationPut(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getVirtualHubIpConfigurations()
            .createOrUpdate(
                "rg1",
                "hub1",
                "ipconfig1",
                new HubIpConfigurationInner()
                    .withSubnet(
                        new SubnetInner()
                            .withId(
                                "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/vnet1/subnets/subnet1")),
                com.azure.core.util.Context.NONE);
    }
}
