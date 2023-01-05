// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.monitor.models.CategoryType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The diagnostic settings Category. */
@Fluent
public final class DiagnosticSettingsCategory {
    /*
     * The type of the diagnostic settings category.
     */
    @JsonProperty(value = "categoryType")
    private CategoryType categoryType;

    /*
     * the collection of what category groups are supported.
     */
    @JsonProperty(value = "categoryGroups")
    private List<String> categoryGroups;

    /** Creates an instance of DiagnosticSettingsCategory class. */
    public DiagnosticSettingsCategory() {
    }

    /**
     * Get the categoryType property: The type of the diagnostic settings category.
     *
     * @return the categoryType value.
     */
    public CategoryType categoryType() {
        return this.categoryType;
    }

    /**
     * Set the categoryType property: The type of the diagnostic settings category.
     *
     * @param categoryType the categoryType value to set.
     * @return the DiagnosticSettingsCategory object itself.
     */
    public DiagnosticSettingsCategory withCategoryType(CategoryType categoryType) {
        this.categoryType = categoryType;
        return this;
    }

    /**
     * Get the categoryGroups property: the collection of what category groups are supported.
     *
     * @return the categoryGroups value.
     */
    public List<String> categoryGroups() {
        return this.categoryGroups;
    }

    /**
     * Set the categoryGroups property: the collection of what category groups are supported.
     *
     * @param categoryGroups the categoryGroups value to set.
     * @return the DiagnosticSettingsCategory object itself.
     */
    public DiagnosticSettingsCategory withCategoryGroups(List<String> categoryGroups) {
        this.categoryGroups = categoryGroups;
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
