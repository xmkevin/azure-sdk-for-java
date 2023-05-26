// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Recommended action for the service health event. */
@Fluent
public final class EventPropertiesRecommendedActionsItem {
    /*
     * Recommended action group Id for the service health event.
     */
    @JsonProperty(value = "groupId")
    private Integer groupId;

    /*
     * Recommended action text
     */
    @JsonProperty(value = "actionText")
    private String actionText;

    /** Creates an instance of EventPropertiesRecommendedActionsItem class. */
    public EventPropertiesRecommendedActionsItem() {
    }

    /**
     * Get the groupId property: Recommended action group Id for the service health event.
     *
     * @return the groupId value.
     */
    public Integer groupId() {
        return this.groupId;
    }

    /**
     * Set the groupId property: Recommended action group Id for the service health event.
     *
     * @param groupId the groupId value to set.
     * @return the EventPropertiesRecommendedActionsItem object itself.
     */
    public EventPropertiesRecommendedActionsItem withGroupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Get the actionText property: Recommended action text.
     *
     * @return the actionText value.
     */
    public String actionText() {
        return this.actionText;
    }

    /**
     * Set the actionText property: Recommended action text.
     *
     * @param actionText the actionText value to set.
     * @return the EventPropertiesRecommendedActionsItem object itself.
     */
    public EventPropertiesRecommendedActionsItem withActionText(String actionText) {
        this.actionText = actionText;
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
