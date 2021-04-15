// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.devtestlabs.fluent.models.GenerateUploadUriResponseInner;
import com.azure.resourcemanager.devtestlabs.fluent.models.LabInner;
import com.azure.resourcemanager.devtestlabs.fluent.models.LabVhdInner;
import com.azure.resourcemanager.devtestlabs.models.ExportResourceUsageParameters;
import com.azure.resourcemanager.devtestlabs.models.GenerateUploadUriParameter;
import com.azure.resourcemanager.devtestlabs.models.ImportLabVirtualMachineRequest;
import com.azure.resourcemanager.devtestlabs.models.LabFragment;
import com.azure.resourcemanager.devtestlabs.models.LabVirtualMachineCreationParameter;

/** An instance of this class provides access to all the operations defined in LabsClient. */
public interface LabsClient {
    /**
     * List labs in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a list operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LabInner> list();

    /**
     * List labs in a subscription.
     *
     * @param expand Specify the $expand query. Example: 'properties($select=defaultStorageAccount)'.
     * @param filter The filter to apply to the operation. Example: '$filter=contains(name,'myName').
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param orderby The ordering expression for the results, using OData notation. Example: '$orderby=name desc'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a list operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LabInner> list(String expand, String filter, Integer top, String orderby, Context context);

    /**
     * List labs in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a list operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LabInner> listByResourceGroup(String resourceGroupName);

    /**
     * List labs in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expand Specify the $expand query. Example: 'properties($select=defaultStorageAccount)'.
     * @param filter The filter to apply to the operation. Example: '$filter=contains(name,'myName').
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param orderby The ordering expression for the results, using OData notation. Example: '$orderby=name desc'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a list operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LabInner> listByResourceGroup(
        String resourceGroupName, String expand, String filter, Integer top, String orderby, Context context);

    /**
     * Get lab.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the lab.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return lab.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LabInner getByResourceGroup(String resourceGroupName, String name);

    /**
     * Get lab.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the lab.
     * @param expand Specify the $expand query. Example: 'properties($select=defaultStorageAccount)'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return lab.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<LabInner> getByResourceGroupWithResponse(
        String resourceGroupName, String name, String expand, Context context);

    /**
     * Create or replace an existing lab. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the lab.
     * @param lab A lab.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a lab.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<LabInner>, LabInner> beginCreateOrUpdate(String resourceGroupName, String name, LabInner lab);

    /**
     * Create or replace an existing lab. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the lab.
     * @param lab A lab.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a lab.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<LabInner>, LabInner> beginCreateOrUpdate(
        String resourceGroupName, String name, LabInner lab, Context context);

    /**
     * Create or replace an existing lab. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the lab.
     * @param lab A lab.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a lab.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LabInner createOrUpdate(String resourceGroupName, String name, LabInner lab);

    /**
     * Create or replace an existing lab. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the lab.
     * @param lab A lab.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a lab.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LabInner createOrUpdate(String resourceGroupName, String name, LabInner lab, Context context);

    /**
     * Delete lab. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the lab.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String name);

    /**
     * Delete lab. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the lab.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String name, Context context);

    /**
     * Delete lab. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the lab.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String name);

    /**
     * Delete lab. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the lab.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String name, Context context);

    /**
     * Allows modifying tags of labs. All other properties will be ignored.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the lab.
     * @param lab A lab.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a lab.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LabInner update(String resourceGroupName, String name, LabFragment lab);

    /**
     * Allows modifying tags of labs. All other properties will be ignored.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the lab.
     * @param lab A lab.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a lab.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<LabInner> updateWithResponse(String resourceGroupName, String name, LabFragment lab, Context context);

    /**
     * Claim a random claimable virtual machine in the lab. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the lab.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginClaimAnyVm(String resourceGroupName, String name);

    /**
     * Claim a random claimable virtual machine in the lab. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the lab.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginClaimAnyVm(String resourceGroupName, String name, Context context);

    /**
     * Claim a random claimable virtual machine in the lab. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the lab.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void claimAnyVm(String resourceGroupName, String name);

    /**
     * Claim a random claimable virtual machine in the lab. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the lab.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void claimAnyVm(String resourceGroupName, String name, Context context);

    /**
     * Create virtual machines in a lab. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the lab.
     * @param labVirtualMachineCreationParameter Properties for creating a virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginCreateEnvironment(
        String resourceGroupName, String name, LabVirtualMachineCreationParameter labVirtualMachineCreationParameter);

    /**
     * Create virtual machines in a lab. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the lab.
     * @param labVirtualMachineCreationParameter Properties for creating a virtual machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginCreateEnvironment(
        String resourceGroupName,
        String name,
        LabVirtualMachineCreationParameter labVirtualMachineCreationParameter,
        Context context);

    /**
     * Create virtual machines in a lab. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the lab.
     * @param labVirtualMachineCreationParameter Properties for creating a virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void createEnvironment(
        String resourceGroupName, String name, LabVirtualMachineCreationParameter labVirtualMachineCreationParameter);

    /**
     * Create virtual machines in a lab. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the lab.
     * @param labVirtualMachineCreationParameter Properties for creating a virtual machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void createEnvironment(
        String resourceGroupName,
        String name,
        LabVirtualMachineCreationParameter labVirtualMachineCreationParameter,
        Context context);

    /**
     * Exports the lab resource usage into a storage account This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the lab.
     * @param exportResourceUsageParameters The parameters of the export operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginExportResourceUsage(
        String resourceGroupName, String name, ExportResourceUsageParameters exportResourceUsageParameters);

    /**
     * Exports the lab resource usage into a storage account This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the lab.
     * @param exportResourceUsageParameters The parameters of the export operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginExportResourceUsage(
        String resourceGroupName,
        String name,
        ExportResourceUsageParameters exportResourceUsageParameters,
        Context context);

    /**
     * Exports the lab resource usage into a storage account This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the lab.
     * @param exportResourceUsageParameters The parameters of the export operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void exportResourceUsage(
        String resourceGroupName, String name, ExportResourceUsageParameters exportResourceUsageParameters);

    /**
     * Exports the lab resource usage into a storage account This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the lab.
     * @param exportResourceUsageParameters The parameters of the export operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void exportResourceUsage(
        String resourceGroupName,
        String name,
        ExportResourceUsageParameters exportResourceUsageParameters,
        Context context);

    /**
     * Generate a URI for uploading custom disk images to a Lab.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the lab.
     * @param generateUploadUriParameter Properties for generating an upload URI.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body for generating an upload URI.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GenerateUploadUriResponseInner generateUploadUri(
        String resourceGroupName, String name, GenerateUploadUriParameter generateUploadUriParameter);

    /**
     * Generate a URI for uploading custom disk images to a Lab.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the lab.
     * @param generateUploadUriParameter Properties for generating an upload URI.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body for generating an upload URI.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<GenerateUploadUriResponseInner> generateUploadUriWithResponse(
        String resourceGroupName, String name, GenerateUploadUriParameter generateUploadUriParameter, Context context);

    /**
     * Import a virtual machine into a different lab. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the lab.
     * @param importLabVirtualMachineRequest This represents the payload required to import a virtual machine from a
     *     different lab into the current one.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginImportVirtualMachine(
        String resourceGroupName, String name, ImportLabVirtualMachineRequest importLabVirtualMachineRequest);

    /**
     * Import a virtual machine into a different lab. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the lab.
     * @param importLabVirtualMachineRequest This represents the payload required to import a virtual machine from a
     *     different lab into the current one.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginImportVirtualMachine(
        String resourceGroupName,
        String name,
        ImportLabVirtualMachineRequest importLabVirtualMachineRequest,
        Context context);

    /**
     * Import a virtual machine into a different lab. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the lab.
     * @param importLabVirtualMachineRequest This represents the payload required to import a virtual machine from a
     *     different lab into the current one.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void importVirtualMachine(
        String resourceGroupName, String name, ImportLabVirtualMachineRequest importLabVirtualMachineRequest);

    /**
     * Import a virtual machine into a different lab. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the lab.
     * @param importLabVirtualMachineRequest This represents the payload required to import a virtual machine from a
     *     different lab into the current one.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void importVirtualMachine(
        String resourceGroupName,
        String name,
        ImportLabVirtualMachineRequest importLabVirtualMachineRequest,
        Context context);

    /**
     * List disk images available for custom image creation.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the lab.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a list operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LabVhdInner> listVhds(String resourceGroupName, String name);

    /**
     * List disk images available for custom image creation.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the lab.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a list operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LabVhdInner> listVhds(String resourceGroupName, String name, Context context);
}
