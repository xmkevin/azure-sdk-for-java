// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.devcenter;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.developer.devcenter.implementation.DevCentersImpl;

/** Initializes a new instance of the synchronous DevCenterClient type. */
@ServiceClient(builder = DevCenterClientBuilder.class)
public final class DevCenterClient {
    @Generated private final DevCentersImpl serviceClient;

    /**
     * Initializes an instance of DevCenterClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    DevCenterClient(DevCentersImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Lists all projects.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>filter</td><td>String</td><td>No</td><td>An OData filter clause to apply to the operation.</td></tr>
     *     <tr><td>top</td><td>Integer</td><td>No</td><td>The maximum number of resources to return from the operation. Example: 'top=10'.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     name: String (Optional)
     *     description: String (Optional)
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return results of the project list operation as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> listProjects(RequestOptions requestOptions) {
        return this.serviceClient.listProjects(requestOptions);
    }

    /**
     * Gets a project.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     name: String (Optional)
     *     description: String (Optional)
     * }
     * }</pre>
     *
     * @param projectName The DevCenter Project upon which to execute operations.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a project along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getProjectWithResponse(String projectName, RequestOptions requestOptions) {
        return this.serviceClient.getProjectWithResponse(projectName, requestOptions);
    }

    /**
     * Lists Dev Boxes that the caller has access to in the DevCenter.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>filter</td><td>String</td><td>No</td><td>An OData filter clause to apply to the operation.</td></tr>
     *     <tr><td>top</td><td>Integer</td><td>No</td><td>The maximum number of resources to return from the operation. Example: 'top=10'.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     name: String (Optional)
     *     projectName: String (Optional)
     *     poolName: String (Required)
     *     hibernateSupport: String(Disabled/Enabled) (Optional)
     *     provisioningState: String (Optional)
     *     actionState: String (Optional)
     *     powerState: String(Unknown/Deallocated/PoweredOff/Running/Hibernated) (Optional)
     *     uniqueId: String (Optional)
     *     errorDetails (Optional): {
     *         code: String (Optional)
     *         message: String (Optional)
     *     }
     *     location: String (Optional)
     *     osType: String(Windows) (Optional)
     *     user: String (Optional)
     *     hardwareProfile (Optional): {
     *         skuName: String (Optional)
     *         vCPUs: Integer (Optional)
     *         memoryGB: Integer (Optional)
     *     }
     *     storageProfile (Optional): {
     *         osDisk (Optional): {
     *             diskSizeGB: Integer (Optional)
     *         }
     *     }
     *     imageReference (Optional): {
     *         name: String (Optional)
     *         version: String (Optional)
     *         operatingSystem: String (Optional)
     *         osBuildNumber: String (Optional)
     *         publishedDate: OffsetDateTime (Optional)
     *     }
     *     createdTime: OffsetDateTime (Optional)
     *     localAdministrator: String(Enabled/Disabled) (Optional)
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the Dev Box list result as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> listAllDevBoxes(RequestOptions requestOptions) {
        return this.serviceClient.listAllDevBoxes(requestOptions);
    }

    /**
     * Lists Dev Boxes in the Dev Center for a particular user.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>filter</td><td>String</td><td>No</td><td>An OData filter clause to apply to the operation.</td></tr>
     *     <tr><td>top</td><td>Integer</td><td>No</td><td>The maximum number of resources to return from the operation. Example: 'top=10'.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     name: String (Optional)
     *     projectName: String (Optional)
     *     poolName: String (Required)
     *     hibernateSupport: String(Disabled/Enabled) (Optional)
     *     provisioningState: String (Optional)
     *     actionState: String (Optional)
     *     powerState: String(Unknown/Deallocated/PoweredOff/Running/Hibernated) (Optional)
     *     uniqueId: String (Optional)
     *     errorDetails (Optional): {
     *         code: String (Optional)
     *         message: String (Optional)
     *     }
     *     location: String (Optional)
     *     osType: String(Windows) (Optional)
     *     user: String (Optional)
     *     hardwareProfile (Optional): {
     *         skuName: String (Optional)
     *         vCPUs: Integer (Optional)
     *         memoryGB: Integer (Optional)
     *     }
     *     storageProfile (Optional): {
     *         osDisk (Optional): {
     *             diskSizeGB: Integer (Optional)
     *         }
     *     }
     *     imageReference (Optional): {
     *         name: String (Optional)
     *         version: String (Optional)
     *         operatingSystem: String (Optional)
     *         osBuildNumber: String (Optional)
     *         publishedDate: OffsetDateTime (Optional)
     *     }
     *     createdTime: OffsetDateTime (Optional)
     *     localAdministrator: String(Enabled/Disabled) (Optional)
     * }
     * }</pre>
     *
     * @param userId The AAD object id of the user. If value is 'me', the identity is taken from the authentication
     *     context.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the Dev Box list result as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> listAllDevBoxesByUser(String userId, RequestOptions requestOptions) {
        return this.serviceClient.listAllDevBoxesByUser(userId, requestOptions);
    }
}
