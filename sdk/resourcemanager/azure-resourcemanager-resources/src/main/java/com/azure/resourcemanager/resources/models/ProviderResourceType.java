// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Resource type managed by the resource provider. */
@Fluent
public final class ProviderResourceType {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProviderResourceType.class);

    /*
     * The resource type.
     */
    @JsonProperty(value = "resourceType")
    private String resourceType;

    /*
     * The collection of locations where this resource type can be created.
     */
    @JsonProperty(value = "locations")
    private List<String> locations;

    /*
     * The location mappings that are supported by this resource type.
     */
    @JsonProperty(value = "locationMappings")
    private List<ProviderExtendedLocation> locationMappings;

    /*
     * The aliases that are supported by this resource type.
     */
    @JsonProperty(value = "aliases")
    private List<Alias> aliases;

    /*
     * The API version.
     */
    @JsonProperty(value = "apiVersions")
    private List<String> apiVersions;

    /*
     * The default API version.
     */
    @JsonProperty(value = "defaultApiVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String defaultApiVersion;

    /*
     * The zoneMappings property.
     */
    @JsonProperty(value = "zoneMappings")
    private List<ZoneMapping> zoneMappings;

    /*
     * The API profiles for the resource provider.
     */
    @JsonProperty(value = "apiProfiles", access = JsonProperty.Access.WRITE_ONLY)
    private List<ApiProfile> apiProfiles;

    /*
     * The additional capabilities offered by this resource type.
     */
    @JsonProperty(value = "capabilities")
    private String capabilities;

    /*
     * The properties.
     */
    @JsonProperty(value = "properties")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> properties;

    /**
     * Get the resourceType property: The resource type.
     *
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType property: The resource type.
     *
     * @param resourceType the resourceType value to set.
     * @return the ProviderResourceType object itself.
     */
    public ProviderResourceType withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get the locations property: The collection of locations where this resource type can be created.
     *
     * @return the locations value.
     */
    public List<String> locations() {
        return this.locations;
    }

    /**
     * Set the locations property: The collection of locations where this resource type can be created.
     *
     * @param locations the locations value to set.
     * @return the ProviderResourceType object itself.
     */
    public ProviderResourceType withLocations(List<String> locations) {
        this.locations = locations;
        return this;
    }

    /**
     * Get the locationMappings property: The location mappings that are supported by this resource type.
     *
     * @return the locationMappings value.
     */
    public List<ProviderExtendedLocation> locationMappings() {
        return this.locationMappings;
    }

    /**
     * Set the locationMappings property: The location mappings that are supported by this resource type.
     *
     * @param locationMappings the locationMappings value to set.
     * @return the ProviderResourceType object itself.
     */
    public ProviderResourceType withLocationMappings(List<ProviderExtendedLocation> locationMappings) {
        this.locationMappings = locationMappings;
        return this;
    }

    /**
     * Get the aliases property: The aliases that are supported by this resource type.
     *
     * @return the aliases value.
     */
    public List<Alias> aliases() {
        return this.aliases;
    }

    /**
     * Set the aliases property: The aliases that are supported by this resource type.
     *
     * @param aliases the aliases value to set.
     * @return the ProviderResourceType object itself.
     */
    public ProviderResourceType withAliases(List<Alias> aliases) {
        this.aliases = aliases;
        return this;
    }

    /**
     * Get the apiVersions property: The API version.
     *
     * @return the apiVersions value.
     */
    public List<String> apiVersions() {
        return this.apiVersions;
    }

    /**
     * Set the apiVersions property: The API version.
     *
     * @param apiVersions the apiVersions value to set.
     * @return the ProviderResourceType object itself.
     */
    public ProviderResourceType withApiVersions(List<String> apiVersions) {
        this.apiVersions = apiVersions;
        return this;
    }

    /**
     * Get the defaultApiVersion property: The default API version.
     *
     * @return the defaultApiVersion value.
     */
    public String defaultApiVersion() {
        return this.defaultApiVersion;
    }

    /**
     * Get the zoneMappings property: The zoneMappings property.
     *
     * @return the zoneMappings value.
     */
    public List<ZoneMapping> zoneMappings() {
        return this.zoneMappings;
    }

    /**
     * Set the zoneMappings property: The zoneMappings property.
     *
     * @param zoneMappings the zoneMappings value to set.
     * @return the ProviderResourceType object itself.
     */
    public ProviderResourceType withZoneMappings(List<ZoneMapping> zoneMappings) {
        this.zoneMappings = zoneMappings;
        return this;
    }

    /**
     * Get the apiProfiles property: The API profiles for the resource provider.
     *
     * @return the apiProfiles value.
     */
    public List<ApiProfile> apiProfiles() {
        return this.apiProfiles;
    }

    /**
     * Get the capabilities property: The additional capabilities offered by this resource type.
     *
     * @return the capabilities value.
     */
    public String capabilities() {
        return this.capabilities;
    }

    /**
     * Set the capabilities property: The additional capabilities offered by this resource type.
     *
     * @param capabilities the capabilities value to set.
     * @return the ProviderResourceType object itself.
     */
    public ProviderResourceType withCapabilities(String capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Get the properties property: The properties.
     *
     * @return the properties value.
     */
    public Map<String, String> properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties.
     *
     * @param properties the properties value to set.
     * @return the ProviderResourceType object itself.
     */
    public ProviderResourceType withProperties(Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (locationMappings() != null) {
            locationMappings().forEach(e -> e.validate());
        }
        if (aliases() != null) {
            aliases().forEach(e -> e.validate());
        }
        if (zoneMappings() != null) {
            zoneMappings().forEach(e -> e.validate());
        }
        if (apiProfiles() != null) {
            apiProfiles().forEach(e -> e.validate());
        }
    }
}
