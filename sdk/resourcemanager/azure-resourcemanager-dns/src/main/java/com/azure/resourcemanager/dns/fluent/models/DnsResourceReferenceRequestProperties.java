// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dns.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Represents the properties of the Dns Resource Reference Request. */
@Fluent
public final class DnsResourceReferenceRequestProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DnsResourceReferenceRequestProperties.class);

    /*
     * A list of references to azure resources for which referencing dns
     * records need to be queried.
     */
    @JsonProperty(value = "targetResources")
    private List<SubResource> targetResources;

    /**
     * Get the targetResources property: A list of references to azure resources for which referencing dns records need
     * to be queried.
     *
     * @return the targetResources value.
     */
    public List<SubResource> targetResources() {
        return this.targetResources;
    }

    /**
     * Set the targetResources property: A list of references to azure resources for which referencing dns records need
     * to be queried.
     *
     * @param targetResources the targetResources value to set.
     * @return the DnsResourceReferenceRequestProperties object itself.
     */
    public DnsResourceReferenceRequestProperties withTargetResources(List<SubResource> targetResources) {
        this.targetResources = targetResources;
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
