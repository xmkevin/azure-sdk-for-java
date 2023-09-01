// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for LoadBalancers Delete. */
public final class LoadBalancersDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-05-01/examples/LoadBalancerDelete.json
     */
    /**
     * Sample code: Delete load balancer.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteLoadBalancer(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getLoadBalancers()
            .delete("rg1", "lb", com.azure.core.util.Context.NONE);
    }
}
