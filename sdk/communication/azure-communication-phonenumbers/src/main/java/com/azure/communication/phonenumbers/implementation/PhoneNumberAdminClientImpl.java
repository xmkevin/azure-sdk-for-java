// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.phonenumbers.implementation;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;

/** Initializes a new instance of the PhoneNumberAdminClient type. */
public final class PhoneNumberAdminClientImpl {
    /** The communication resource, for example https://resourcename.communication.azure.com. */
    private final String endpoint;

    /**
     * Gets The communication resource, for example https://resourcename.communication.azure.com.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** Api Version. */
    private final String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The PhoneNumbersImpl object to access its operations. */
    private final PhoneNumbersImpl phoneNumbers;

    /**
     * Gets the PhoneNumbersImpl object to access its operations.
     *
     * @return the PhoneNumbersImpl object.
     */
    public PhoneNumbersImpl getPhoneNumbers() {
        return this.phoneNumbers;
    }

    /**
     * Initializes an instance of PhoneNumberAdminClient client.
     *
     * @param endpoint The communication resource, for example https://resourcename.communication.azure.com.
     * @param apiVersion Api Version.
     */
    PhoneNumberAdminClientImpl(String endpoint, String apiVersion) {
        this(
                new HttpPipelineBuilder()
                        .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                        .build(),
                JacksonAdapter.createDefaultSerializerAdapter(),
                endpoint,
                apiVersion);
    }

    /**
     * Initializes an instance of PhoneNumberAdminClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param endpoint The communication resource, for example https://resourcename.communication.azure.com.
     * @param apiVersion Api Version.
     */
    PhoneNumberAdminClientImpl(HttpPipeline httpPipeline, String endpoint, String apiVersion) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), endpoint, apiVersion);
    }

    /**
     * Initializes an instance of PhoneNumberAdminClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param endpoint The communication resource, for example https://resourcename.communication.azure.com.
     * @param apiVersion Api Version.
     */
    PhoneNumberAdminClientImpl(
            HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String endpoint, String apiVersion) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.endpoint = endpoint;
        this.apiVersion = apiVersion;
        this.phoneNumbers = new PhoneNumbersImpl(this);
    }
}
