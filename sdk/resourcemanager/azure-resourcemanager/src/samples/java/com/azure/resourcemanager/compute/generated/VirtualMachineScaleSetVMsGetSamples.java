// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

/**
 * Samples for VirtualMachineScaleSetVMs Get.
 */
public final class VirtualMachineScaleSetVMsGetSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-03-01/examples/
     * virtualMachineScaleSetExamples/VirtualMachineScaleSetVM_Get_WithVMSizeProperties.json
     */
    /**
     * Sample code: Get VM scale set VM with VMSizeProperties.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getVMScaleSetVMWithVMSizeProperties(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines().manager().serviceClient().getVirtualMachineScaleSetVMs()
            .getWithResponse("myResourceGroup", "{vmss-name}", "0", null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-03-01/examples/
     * virtualMachineScaleSetExamples/VirtualMachineScaleSetVM_Get_WithUserData.json
     */
    /**
     * Sample code: Get VM scale set VM with UserData.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getVMScaleSetVMWithUserData(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines().manager().serviceClient().getVirtualMachineScaleSetVMs()
            .getWithResponse("myResourceGroup", "{vmss-name}", "0", null, com.azure.core.util.Context.NONE);
    }
}
