// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.FirewallResourceInner;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.GlobalRulestackInfoInner;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.LogSettingsInner;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.SupportInfoInner;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.FirewallResourceUpdate;

/** An instance of this class provides access to all the operations defined in FirewallsClient. */
public interface FirewallsClient {
    /**
     * List FirewallResource resources by subscription ID.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a FirewallResource list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FirewallResourceInner> list();

    /**
     * List FirewallResource resources by subscription ID.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a FirewallResource list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FirewallResourceInner> list(Context context);

    /**
     * List FirewallResource resources by resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a FirewallResource list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FirewallResourceInner> listByResourceGroup(String resourceGroupName);

    /**
     * List FirewallResource resources by resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a FirewallResource list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FirewallResourceInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Get a FirewallResource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param firewallName Firewall resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a FirewallResource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<FirewallResourceInner> getByResourceGroupWithResponse(
        String resourceGroupName, String firewallName, Context context);

    /**
     * Get a FirewallResource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param firewallName Firewall resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a FirewallResource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FirewallResourceInner getByResourceGroup(String resourceGroupName, String firewallName);

    /**
     * Create a FirewallResource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param firewallName Firewall resource name.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of paloAltoNetworks Firewall.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<FirewallResourceInner>, FirewallResourceInner> beginCreateOrUpdate(
        String resourceGroupName, String firewallName, FirewallResourceInner resource);

    /**
     * Create a FirewallResource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param firewallName Firewall resource name.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of paloAltoNetworks Firewall.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<FirewallResourceInner>, FirewallResourceInner> beginCreateOrUpdate(
        String resourceGroupName, String firewallName, FirewallResourceInner resource, Context context);

    /**
     * Create a FirewallResource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param firewallName Firewall resource name.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paloAltoNetworks Firewall.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FirewallResourceInner createOrUpdate(String resourceGroupName, String firewallName, FirewallResourceInner resource);

    /**
     * Create a FirewallResource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param firewallName Firewall resource name.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paloAltoNetworks Firewall.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FirewallResourceInner createOrUpdate(
        String resourceGroupName, String firewallName, FirewallResourceInner resource, Context context);

    /**
     * Update a FirewallResource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param firewallName Firewall resource name.
     * @param properties The resource properties to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paloAltoNetworks Firewall along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<FirewallResourceInner> updateWithResponse(
        String resourceGroupName, String firewallName, FirewallResourceUpdate properties, Context context);

    /**
     * Update a FirewallResource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param firewallName Firewall resource name.
     * @param properties The resource properties to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paloAltoNetworks Firewall.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FirewallResourceInner update(String resourceGroupName, String firewallName, FirewallResourceUpdate properties);

    /**
     * Delete a FirewallResource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param firewallName Firewall resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String firewallName);

    /**
     * Delete a FirewallResource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param firewallName Firewall resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String firewallName, Context context);

    /**
     * Delete a FirewallResource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param firewallName Firewall resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String firewallName);

    /**
     * Delete a FirewallResource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param firewallName Firewall resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String firewallName, Context context);

    /**
     * Get Global Rulestack associated with the Firewall.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param firewallName Firewall resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return global Rulestack associated with the Firewall along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<GlobalRulestackInfoInner> getGlobalRulestackWithResponse(
        String resourceGroupName, String firewallName, Context context);

    /**
     * Get Global Rulestack associated with the Firewall.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param firewallName Firewall resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return global Rulestack associated with the Firewall.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GlobalRulestackInfoInner getGlobalRulestack(String resourceGroupName, String firewallName);

    /**
     * Log Profile for Firewall.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param firewallName Firewall resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return log Settings for Firewall along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<LogSettingsInner> getLogProfileWithResponse(
        String resourceGroupName, String firewallName, Context context);

    /**
     * Log Profile for Firewall.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param firewallName Firewall resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return log Settings for Firewall.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LogSettingsInner getLogProfile(String resourceGroupName, String firewallName);

    /**
     * support info for firewall.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param firewallName Firewall resource name.
     * @param email email address on behalf of which this API called.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return support information for the resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SupportInfoInner> getSupportInfoWithResponse(
        String resourceGroupName, String firewallName, String email, Context context);

    /**
     * support info for firewall.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param firewallName Firewall resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return support information for the resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SupportInfoInner getSupportInfo(String resourceGroupName, String firewallName);

    /**
     * Log Profile for Firewall.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param firewallName Firewall resource name.
     * @param logSettings Log Settings for Firewall.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> saveLogProfileWithResponse(
        String resourceGroupName, String firewallName, LogSettingsInner logSettings, Context context);

    /**
     * Log Profile for Firewall.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param firewallName Firewall resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void saveLogProfile(String resourceGroupName, String firewallName);
}
