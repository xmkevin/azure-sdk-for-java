// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

/**
 * Samples for VirtualMachineRunCommands List.
 */
public final class VirtualMachineRunCommandsListSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-03-01/examples/runCommandExamples/
     * RunCommand_List.json
     */
    /**
     * Sample code: VirtualMachineRunCommandList.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void virtualMachineRunCommandList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines().manager().serviceClient().getVirtualMachineRunCommands().list("SoutheastAsia",
            com.azure.core.util.Context.NONE);
    }
}
