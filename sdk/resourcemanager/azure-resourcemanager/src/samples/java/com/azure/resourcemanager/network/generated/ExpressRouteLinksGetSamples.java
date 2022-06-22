// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for ExpressRouteLinks Get. */
public final class ExpressRouteLinksGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-08-01/examples/ExpressRouteLinkGet.json
     */
    /**
     * Sample code: ExpressRouteLinkGet.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void expressRouteLinkGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getExpressRouteLinks()
            .getWithResponse("rg1", "portName", "linkName", Context.NONE);
    }
}
