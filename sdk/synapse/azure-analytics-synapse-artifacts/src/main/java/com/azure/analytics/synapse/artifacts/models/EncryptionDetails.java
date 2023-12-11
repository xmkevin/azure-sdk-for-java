// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details of the encryption associated with the workspace.
 */
@Fluent
public final class EncryptionDetails {
    /*
     * Double Encryption enabled
     */
    @JsonProperty(value = "doubleEncryptionEnabled", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean doubleEncryptionEnabled;

    /*
     * Customer Managed Key Details
     */
    @JsonProperty(value = "cmk")
    private CustomerManagedKeyDetails cmk;

    /**
     * Creates an instance of EncryptionDetails class.
     */
    public EncryptionDetails() {
    }

    /**
     * Get the doubleEncryptionEnabled property: Double Encryption enabled.
     * 
     * @return the doubleEncryptionEnabled value.
     */
    public Boolean isDoubleEncryptionEnabled() {
        return this.doubleEncryptionEnabled;
    }

    /**
     * Get the cmk property: Customer Managed Key Details.
     * 
     * @return the cmk value.
     */
    public CustomerManagedKeyDetails getCmk() {
        return this.cmk;
    }

    /**
     * Set the cmk property: Customer Managed Key Details.
     * 
     * @param cmk the cmk value to set.
     * @return the EncryptionDetails object itself.
     */
    public EncryptionDetails setCmk(CustomerManagedKeyDetails cmk) {
        this.cmk = cmk;
        return this;
    }
}
