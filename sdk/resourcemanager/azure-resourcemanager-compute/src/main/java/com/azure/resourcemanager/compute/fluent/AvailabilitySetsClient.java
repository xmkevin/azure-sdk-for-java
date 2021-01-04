// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.fluent.models.AvailabilitySetInner;
import com.azure.resourcemanager.compute.fluent.models.VirtualMachineSizeInner;
import com.azure.resourcemanager.compute.models.AvailabilitySetUpdate;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsListing;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in AvailabilitySetsClient. */
public interface AvailabilitySetsClient
    extends InnerSupportsGet<AvailabilitySetInner>,
        InnerSupportsListing<AvailabilitySetInner>,
        InnerSupportsDelete<Void> {
    /**
     * Create or update an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @param parameters Specifies information about the availability set that the virtual machine should be assigned
     *     to. Virtual machines specified in the same availability set are allocated to different nodes to maximize
     *     availability. For more information about availability sets, see [Manage the availability of virtual
     *     machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-manage-availability?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json).
     *     &lt;br&gt;&lt;br&gt; For more information on Azure planned maintenance, see [Planned maintenance for virtual
     *     machines in
     *     Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-planned-maintenance?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json)
     *     &lt;br&gt;&lt;br&gt; Currently, a VM can only be added to availability set at creation time. An existing VM
     *     cannot be added to an availability set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the availability set that the virtual machine should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<AvailabilitySetInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String availabilitySetName, AvailabilitySetInner parameters);

    /**
     * Create or update an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @param parameters Specifies information about the availability set that the virtual machine should be assigned
     *     to. Virtual machines specified in the same availability set are allocated to different nodes to maximize
     *     availability. For more information about availability sets, see [Manage the availability of virtual
     *     machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-manage-availability?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json).
     *     &lt;br&gt;&lt;br&gt; For more information on Azure planned maintenance, see [Planned maintenance for virtual
     *     machines in
     *     Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-planned-maintenance?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json)
     *     &lt;br&gt;&lt;br&gt; Currently, a VM can only be added to availability set at creation time. An existing VM
     *     cannot be added to an availability set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the availability set that the virtual machine should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<AvailabilitySetInner> createOrUpdateAsync(
        String resourceGroupName, String availabilitySetName, AvailabilitySetInner parameters);

    /**
     * Create or update an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @param parameters Specifies information about the availability set that the virtual machine should be assigned
     *     to. Virtual machines specified in the same availability set are allocated to different nodes to maximize
     *     availability. For more information about availability sets, see [Manage the availability of virtual
     *     machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-manage-availability?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json).
     *     &lt;br&gt;&lt;br&gt; For more information on Azure planned maintenance, see [Planned maintenance for virtual
     *     machines in
     *     Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-planned-maintenance?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json)
     *     &lt;br&gt;&lt;br&gt; Currently, a VM can only be added to availability set at creation time. An existing VM
     *     cannot be added to an availability set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the availability set that the virtual machine should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AvailabilitySetInner createOrUpdate(
        String resourceGroupName, String availabilitySetName, AvailabilitySetInner parameters);

    /**
     * Create or update an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @param parameters Specifies information about the availability set that the virtual machine should be assigned
     *     to. Virtual machines specified in the same availability set are allocated to different nodes to maximize
     *     availability. For more information about availability sets, see [Manage the availability of virtual
     *     machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-manage-availability?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json).
     *     &lt;br&gt;&lt;br&gt; For more information on Azure planned maintenance, see [Planned maintenance for virtual
     *     machines in
     *     Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-planned-maintenance?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json)
     *     &lt;br&gt;&lt;br&gt; Currently, a VM can only be added to availability set at creation time. An existing VM
     *     cannot be added to an availability set.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the availability set that the virtual machine should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AvailabilitySetInner> createOrUpdateWithResponse(
        String resourceGroupName, String availabilitySetName, AvailabilitySetInner parameters, Context context);

    /**
     * Update an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @param parameters Specifies information about the availability set that the virtual machine should be assigned
     *     to. Only tags may be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the availability set that the virtual machine should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<AvailabilitySetInner>> updateWithResponseAsync(
        String resourceGroupName, String availabilitySetName, AvailabilitySetUpdate parameters);

    /**
     * Update an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @param parameters Specifies information about the availability set that the virtual machine should be assigned
     *     to. Only tags may be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the availability set that the virtual machine should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<AvailabilitySetInner> updateAsync(
        String resourceGroupName, String availabilitySetName, AvailabilitySetUpdate parameters);

    /**
     * Update an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @param parameters Specifies information about the availability set that the virtual machine should be assigned
     *     to. Only tags may be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the availability set that the virtual machine should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AvailabilitySetInner update(String resourceGroupName, String availabilitySetName, AvailabilitySetUpdate parameters);

    /**
     * Update an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @param parameters Specifies information about the availability set that the virtual machine should be assigned
     *     to. Only tags may be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the availability set that the virtual machine should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AvailabilitySetInner> updateWithResponse(
        String resourceGroupName, String availabilitySetName, AvailabilitySetUpdate parameters, Context context);

    /**
     * Delete an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String availabilitySetName);

    /**
     * Delete an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String availabilitySetName);

    /**
     * Delete an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String availabilitySetName);

    /**
     * Delete an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String availabilitySetName, Context context);

    /**
     * Retrieves information about an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the availability set that the virtual machine should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<AvailabilitySetInner>> getByResourceGroupWithResponseAsync(
        String resourceGroupName, String availabilitySetName);

    /**
     * Retrieves information about an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the availability set that the virtual machine should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<AvailabilitySetInner> getByResourceGroupAsync(String resourceGroupName, String availabilitySetName);

    /**
     * Retrieves information about an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the availability set that the virtual machine should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AvailabilitySetInner getByResourceGroup(String resourceGroupName, String availabilitySetName);

    /**
     * Retrieves information about an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the availability set that the virtual machine should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AvailabilitySetInner> getByResourceGroupWithResponse(
        String resourceGroupName, String availabilitySetName, Context context);

    /**
     * Lists all availability sets in a subscription.
     *
     * @param expand The expand expression to apply to the operation. Allowed values are 'instanceView'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Availability Set operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<AvailabilitySetInner> listAsync(String expand);

    /**
     * Lists all availability sets in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Availability Set operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<AvailabilitySetInner> listAsync();

    /**
     * Lists all availability sets in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Availability Set operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AvailabilitySetInner> list();

    /**
     * Lists all availability sets in a subscription.
     *
     * @param expand The expand expression to apply to the operation. Allowed values are 'instanceView'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Availability Set operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AvailabilitySetInner> list(String expand, Context context);

    /**
     * Lists all availability sets in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Availability Set operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<AvailabilitySetInner> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Lists all availability sets in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Availability Set operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AvailabilitySetInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all availability sets in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Availability Set operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AvailabilitySetInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists all available virtual machine sizes that can be used to create a new virtual machine in an existing
     * availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Virtual Machine operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<VirtualMachineSizeInner> listAvailableSizesAsync(String resourceGroupName, String availabilitySetName);

    /**
     * Lists all available virtual machine sizes that can be used to create a new virtual machine in an existing
     * availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Virtual Machine operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualMachineSizeInner> listAvailableSizes(String resourceGroupName, String availabilitySetName);

    /**
     * Lists all available virtual machine sizes that can be used to create a new virtual machine in an existing
     * availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Virtual Machine operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualMachineSizeInner> listAvailableSizes(
        String resourceGroupName, String availabilitySetName, Context context);
}
