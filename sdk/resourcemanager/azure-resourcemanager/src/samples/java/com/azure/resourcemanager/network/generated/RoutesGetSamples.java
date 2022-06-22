// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for Routes Get. */
public final class RoutesGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-08-01/examples/RouteTableRouteGet.json
     */
    /**
     * Sample code: Get route.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getRoute(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getRoutes().getWithResponse("rg1", "testrt", "route1", Context.NONE);
    }
}
