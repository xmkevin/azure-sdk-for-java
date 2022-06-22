// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for Subnets Get. */
public final class SubnetsGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-08-01/examples/SubnetGet.json
     */
    /**
     * Sample code: Get subnet.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getSubnet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getSubnets()
            .getWithResponse("subnet-test", "vnetname", "subnet1", null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-08-01/examples/SubnetGetWithDelegation.json
     */
    /**
     * Sample code: Get subnet with a delegation.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getSubnetWithADelegation(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getSubnets()
            .getWithResponse("subnet-test", "vnetname", "subnet1", null, Context.NONE);
    }
}
