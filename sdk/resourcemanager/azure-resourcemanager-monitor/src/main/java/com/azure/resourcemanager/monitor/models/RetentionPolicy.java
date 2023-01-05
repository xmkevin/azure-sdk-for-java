// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Specifies the retention policy for the log. */
@Fluent
public final class RetentionPolicy {
    /*
     * a value indicating whether the retention policy is enabled.
     */
    @JsonProperty(value = "enabled", required = true)
    private boolean enabled;

    /*
     * the number of days for the retention in days. A value of 0 will retain the events indefinitely.
     */
    @JsonProperty(value = "days", required = true)
    private int days;

    /** Creates an instance of RetentionPolicy class. */
    public RetentionPolicy() {
    }

    /**
     * Get the enabled property: a value indicating whether the retention policy is enabled.
     *
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: a value indicating whether the retention policy is enabled.
     *
     * @param enabled the enabled value to set.
     * @return the RetentionPolicy object itself.
     */
    public RetentionPolicy withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the days property: the number of days for the retention in days. A value of 0 will retain the events
     * indefinitely.
     *
     * @return the days value.
     */
    public int days() {
        return this.days;
    }

    /**
     * Set the days property: the number of days for the retention in days. A value of 0 will retain the events
     * indefinitely.
     *
     * @param days the days value to set.
     * @return the RetentionPolicy object itself.
     */
    public RetentionPolicy withDays(int days) {
        this.days = days;
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
