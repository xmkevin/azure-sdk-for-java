// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The authentication options for Azure OpenAI On Your Data when using an Elasticsearch key and key ID pair.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("key_and_key_id")
@Immutable
public final class OnYourDataKeyAndKeyIdAuthenticationOptions extends OnYourDataAuthenticationOptions {

    /*
     * The key to use for authentication.
     */
    @Generated
    @JsonProperty(value = "key")
    private String key;

    /*
     * The key ID to use for authentication.
     */
    @Generated
    @JsonProperty(value = "key_id")
    private String keyId;

    /**
     * Creates an instance of OnYourDataKeyAndKeyIdAuthenticationOptions class.
     *
     * @param key the key value to set.
     * @param keyId the keyId value to set.
     */
    @Generated
    @JsonCreator
    public OnYourDataKeyAndKeyIdAuthenticationOptions(@JsonProperty(value = "key") String key,
        @JsonProperty(value = "key_id") String keyId) {
        this.key = key;
        this.keyId = keyId;
    }

    /**
     * Get the key property: The key to use for authentication.
     *
     * @return the key value.
     */
    @Generated
    public String getKey() {
        return this.key;
    }

    /**
     * Get the keyId property: The key ID to use for authentication.
     *
     * @return the keyId value.
     */
    @Generated
    public String getKeyId() {
        return this.keyId;
    }
}
