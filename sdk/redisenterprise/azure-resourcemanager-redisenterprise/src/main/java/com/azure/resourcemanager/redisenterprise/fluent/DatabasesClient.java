// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.redisenterprise.fluent.models.AccessKeysInner;
import com.azure.resourcemanager.redisenterprise.fluent.models.DatabaseInner;
import com.azure.resourcemanager.redisenterprise.models.DatabaseUpdate;
import com.azure.resourcemanager.redisenterprise.models.ExportClusterParameters;
import com.azure.resourcemanager.redisenterprise.models.FlushParameters;
import com.azure.resourcemanager.redisenterprise.models.ForceUnlinkParameters;
import com.azure.resourcemanager.redisenterprise.models.ImportClusterParameters;
import com.azure.resourcemanager.redisenterprise.models.RegenerateKeyParameters;

/**
 * An instance of this class provides access to all the operations defined in DatabasesClient.
 */
public interface DatabasesClient {
    /**
     * Gets all databases in the specified RedisEnterprise cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all databases in the specified RedisEnterprise cluster as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DatabaseInner> listByCluster(String resourceGroupName, String clusterName);

    /**
     * Gets all databases in the specified RedisEnterprise cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all databases in the specified RedisEnterprise cluster as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DatabaseInner> listByCluster(String resourceGroupName, String clusterName, Context context);

    /**
     * Creates a database.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param databaseName The name of the database.
     * @param parameters Parameters supplied to the create or update database operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of describes a database on the RedisEnterprise cluster.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DatabaseInner>, DatabaseInner> beginCreate(String resourceGroupName, String clusterName,
        String databaseName, DatabaseInner parameters);

    /**
     * Creates a database.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param databaseName The name of the database.
     * @param parameters Parameters supplied to the create or update database operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of describes a database on the RedisEnterprise cluster.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DatabaseInner>, DatabaseInner> beginCreate(String resourceGroupName, String clusterName,
        String databaseName, DatabaseInner parameters, Context context);

    /**
     * Creates a database.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param databaseName The name of the database.
     * @param parameters Parameters supplied to the create or update database operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a database on the RedisEnterprise cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DatabaseInner create(String resourceGroupName, String clusterName, String databaseName, DatabaseInner parameters);

    /**
     * Creates a database.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param databaseName The name of the database.
     * @param parameters Parameters supplied to the create or update database operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a database on the RedisEnterprise cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DatabaseInner create(String resourceGroupName, String clusterName, String databaseName, DatabaseInner parameters,
        Context context);

    /**
     * Updates a database.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param databaseName The name of the database.
     * @param parameters Parameters supplied to the create or update database operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of describes a database on the RedisEnterprise cluster.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DatabaseInner>, DatabaseInner> beginUpdate(String resourceGroupName, String clusterName,
        String databaseName, DatabaseUpdate parameters);

    /**
     * Updates a database.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param databaseName The name of the database.
     * @param parameters Parameters supplied to the create or update database operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of describes a database on the RedisEnterprise cluster.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DatabaseInner>, DatabaseInner> beginUpdate(String resourceGroupName, String clusterName,
        String databaseName, DatabaseUpdate parameters, Context context);

    /**
     * Updates a database.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param databaseName The name of the database.
     * @param parameters Parameters supplied to the create or update database operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a database on the RedisEnterprise cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DatabaseInner update(String resourceGroupName, String clusterName, String databaseName, DatabaseUpdate parameters);

    /**
     * Updates a database.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param databaseName The name of the database.
     * @param parameters Parameters supplied to the create or update database operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a database on the RedisEnterprise cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DatabaseInner update(String resourceGroupName, String clusterName, String databaseName, DatabaseUpdate parameters,
        Context context);

    /**
     * Gets information about a database in a RedisEnterprise cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param databaseName The name of the database.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a database in a RedisEnterprise cluster along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DatabaseInner> getWithResponse(String resourceGroupName, String clusterName, String databaseName,
        Context context);

    /**
     * Gets information about a database in a RedisEnterprise cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a database in a RedisEnterprise cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DatabaseInner get(String resourceGroupName, String clusterName, String databaseName);

    /**
     * Deletes a single database.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String clusterName, String databaseName);

    /**
     * Deletes a single database.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param databaseName The name of the database.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String clusterName, String databaseName,
        Context context);

    /**
     * Deletes a single database.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String clusterName, String databaseName);

    /**
     * Deletes a single database.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param databaseName The name of the database.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String clusterName, String databaseName, Context context);

    /**
     * Retrieves the access keys for the RedisEnterprise database.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param databaseName The name of the database.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access keys along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AccessKeysInner> listKeysWithResponse(String resourceGroupName, String clusterName, String databaseName,
        Context context);

    /**
     * Retrieves the access keys for the RedisEnterprise database.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access keys.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccessKeysInner listKeys(String resourceGroupName, String clusterName, String databaseName);

    /**
     * Regenerates the RedisEnterprise database's access keys.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param databaseName The name of the database.
     * @param parameters Specifies which key to regenerate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of access keys.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AccessKeysInner>, AccessKeysInner> beginRegenerateKey(String resourceGroupName,
        String clusterName, String databaseName, RegenerateKeyParameters parameters);

    /**
     * Regenerates the RedisEnterprise database's access keys.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param databaseName The name of the database.
     * @param parameters Specifies which key to regenerate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of access keys.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AccessKeysInner>, AccessKeysInner> beginRegenerateKey(String resourceGroupName,
        String clusterName, String databaseName, RegenerateKeyParameters parameters, Context context);

    /**
     * Regenerates the RedisEnterprise database's access keys.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param databaseName The name of the database.
     * @param parameters Specifies which key to regenerate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access keys.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccessKeysInner regenerateKey(String resourceGroupName, String clusterName, String databaseName,
        RegenerateKeyParameters parameters);

    /**
     * Regenerates the RedisEnterprise database's access keys.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param databaseName The name of the database.
     * @param parameters Specifies which key to regenerate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access keys.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccessKeysInner regenerateKey(String resourceGroupName, String clusterName, String databaseName,
        RegenerateKeyParameters parameters, Context context);

    /**
     * Imports database files to target database.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param databaseName The name of the database.
     * @param parameters Storage information for importing into the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginImportMethod(String resourceGroupName, String clusterName,
        String databaseName, ImportClusterParameters parameters);

    /**
     * Imports database files to target database.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param databaseName The name of the database.
     * @param parameters Storage information for importing into the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginImportMethod(String resourceGroupName, String clusterName,
        String databaseName, ImportClusterParameters parameters, Context context);

    /**
     * Imports database files to target database.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param databaseName The name of the database.
     * @param parameters Storage information for importing into the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void importMethod(String resourceGroupName, String clusterName, String databaseName,
        ImportClusterParameters parameters);

    /**
     * Imports database files to target database.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param databaseName The name of the database.
     * @param parameters Storage information for importing into the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void importMethod(String resourceGroupName, String clusterName, String databaseName,
        ImportClusterParameters parameters, Context context);

    /**
     * Exports a database file from target database.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param databaseName The name of the database.
     * @param parameters Storage information for exporting into the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginExport(String resourceGroupName, String clusterName, String databaseName,
        ExportClusterParameters parameters);

    /**
     * Exports a database file from target database.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param databaseName The name of the database.
     * @param parameters Storage information for exporting into the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginExport(String resourceGroupName, String clusterName, String databaseName,
        ExportClusterParameters parameters, Context context);

    /**
     * Exports a database file from target database.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param databaseName The name of the database.
     * @param parameters Storage information for exporting into the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void export(String resourceGroupName, String clusterName, String databaseName, ExportClusterParameters parameters);

    /**
     * Exports a database file from target database.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param databaseName The name of the database.
     * @param parameters Storage information for exporting into the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void export(String resourceGroupName, String clusterName, String databaseName, ExportClusterParameters parameters,
        Context context);

    /**
     * Forcibly removes the link to the specified database resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param databaseName The name of the database.
     * @param parameters Information identifying the database to be unlinked.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginForceUnlink(String resourceGroupName, String clusterName,
        String databaseName, ForceUnlinkParameters parameters);

    /**
     * Forcibly removes the link to the specified database resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param databaseName The name of the database.
     * @param parameters Information identifying the database to be unlinked.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginForceUnlink(String resourceGroupName, String clusterName,
        String databaseName, ForceUnlinkParameters parameters, Context context);

    /**
     * Forcibly removes the link to the specified database resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param databaseName The name of the database.
     * @param parameters Information identifying the database to be unlinked.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void forceUnlink(String resourceGroupName, String clusterName, String databaseName,
        ForceUnlinkParameters parameters);

    /**
     * Forcibly removes the link to the specified database resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param databaseName The name of the database.
     * @param parameters Information identifying the database to be unlinked.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void forceUnlink(String resourceGroupName, String clusterName, String databaseName,
        ForceUnlinkParameters parameters, Context context);

    /**
     * Flushes all the keys in this database and also from its linked databases.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param databaseName The name of the database.
     * @param parameters Information identifying the databases to be flushed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginFlush(String resourceGroupName, String clusterName, String databaseName,
        FlushParameters parameters);

    /**
     * Flushes all the keys in this database and also from its linked databases.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param databaseName The name of the database.
     * @param parameters Information identifying the databases to be flushed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginFlush(String resourceGroupName, String clusterName, String databaseName,
        FlushParameters parameters, Context context);

    /**
     * Flushes all the keys in this database and also from its linked databases.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param databaseName The name of the database.
     * @param parameters Information identifying the databases to be flushed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void flush(String resourceGroupName, String clusterName, String databaseName, FlushParameters parameters);

    /**
     * Flushes all the keys in this database and also from its linked databases.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param databaseName The name of the database.
     * @param parameters Information identifying the databases to be flushed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void flush(String resourceGroupName, String clusterName, String databaseName, FlushParameters parameters,
        Context context);
}
