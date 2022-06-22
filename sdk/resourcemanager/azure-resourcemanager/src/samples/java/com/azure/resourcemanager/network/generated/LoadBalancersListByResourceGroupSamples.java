// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for LoadBalancers ListByResourceGroup. */
public final class LoadBalancersListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-08-01/examples/LoadBalancerList.json
     */
    /**
     * Sample code: List load balancers in resource group.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listLoadBalancersInResourceGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getLoadBalancers().listByResourceGroup("rg1", Context.NONE);
    }
}
