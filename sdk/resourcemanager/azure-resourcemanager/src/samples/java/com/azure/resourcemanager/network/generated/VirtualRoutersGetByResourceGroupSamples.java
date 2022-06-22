// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for VirtualRouters GetByResourceGroup. */
public final class VirtualRoutersGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-08-01/examples/VirtualRouterGet.json
     */
    /**
     * Sample code: Get VirtualRouter.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getVirtualRouter(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getVirtualRouters()
            .getByResourceGroupWithResponse("rg1", "virtualRouter", null, Context.NONE);
    }
}
