// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for DscpConfiguration Delete. */
public final class DscpConfigurationDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-05-01/examples/DscpConfigurationDelete.json
     */
    /**
     * Sample code: Delete DSCP Configuration.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteDSCPConfiguration(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getDscpConfigurations()
            .delete("rg1", "mydscpConfig", com.azure.core.util.Context.NONE);
    }
}
