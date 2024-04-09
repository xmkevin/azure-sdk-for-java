// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies Reboot related Scheduled Event related configurations.
 */
@Fluent
public final class UserInitiatedReboot {
    /*
     * Specifies Reboot Scheduled Event related configurations.
     */
    @JsonProperty(value = "automaticallyApprove")
    private Boolean automaticallyApprove;

    /**
     * Creates an instance of UserInitiatedReboot class.
     */
    public UserInitiatedReboot() {
    }

    /**
     * Get the automaticallyApprove property: Specifies Reboot Scheduled Event related configurations.
     * 
     * @return the automaticallyApprove value.
     */
    public Boolean automaticallyApprove() {
        return this.automaticallyApprove;
    }

    /**
     * Set the automaticallyApprove property: Specifies Reboot Scheduled Event related configurations.
     * 
     * @param automaticallyApprove the automaticallyApprove value to set.
     * @return the UserInitiatedReboot object itself.
     */
    public UserInitiatedReboot withAutomaticallyApprove(Boolean automaticallyApprove) {
        this.automaticallyApprove = automaticallyApprove;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
