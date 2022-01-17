// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.fluent.models.SnapshotUpdateProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Snapshot update resource. */
@Fluent
public final class SnapshotUpdate {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SnapshotUpdate.class);

    /*
     * Snapshot resource update properties.
     */
    @JsonProperty(value = "properties")
    private SnapshotUpdateProperties innerProperties;

    /*
     * Resource tags
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * The snapshots sku name. Can be Standard_LRS, Premium_LRS, or
     * Standard_ZRS. This is an optional parameter for incremental snapshot and
     * the default behavior is the SKU will be set to the same sku as the
     * previous snapshot
     */
    @JsonProperty(value = "sku")
    private SnapshotSku sku;

    /**
     * Get the innerProperties property: Snapshot resource update properties.
     *
     * @return the innerProperties value.
     */
    private SnapshotUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the SnapshotUpdate object itself.
     */
    public SnapshotUpdate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the sku property: The snapshots sku name. Can be Standard_LRS, Premium_LRS, or Standard_ZRS. This is an
     * optional parameter for incremental snapshot and the default behavior is the SKU will be set to the same sku as
     * the previous snapshot.
     *
     * @return the sku value.
     */
    public SnapshotSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The snapshots sku name. Can be Standard_LRS, Premium_LRS, or Standard_ZRS. This is an
     * optional parameter for incremental snapshot and the default behavior is the SKU will be set to the same sku as
     * the previous snapshot.
     *
     * @param sku the sku value to set.
     * @return the SnapshotUpdate object itself.
     */
    public SnapshotUpdate withSku(SnapshotSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the osType property: the Operating System type.
     *
     * @return the osType value.
     */
    public OperatingSystemTypes osType() {
        return this.innerProperties() == null ? null : this.innerProperties().osType();
    }

    /**
     * Set the osType property: the Operating System type.
     *
     * @param osType the osType value to set.
     * @return the SnapshotUpdate object itself.
     */
    public SnapshotUpdate withOsType(OperatingSystemTypes osType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SnapshotUpdateProperties();
        }
        this.innerProperties().withOsType(osType);
        return this;
    }

    /**
     * Get the diskSizeGB property: If creationData.createOption is Empty, this field is mandatory and it indicates the
     * size of the disk to create. If this field is present for updates or creation with other options, it indicates a
     * resize. Resizes are only allowed if the disk is not attached to a running VM, and can only increase the disk's
     * size.
     *
     * @return the diskSizeGB value.
     */
    public Integer diskSizeGB() {
        return this.innerProperties() == null ? null : this.innerProperties().diskSizeGB();
    }

    /**
     * Set the diskSizeGB property: If creationData.createOption is Empty, this field is mandatory and it indicates the
     * size of the disk to create. If this field is present for updates or creation with other options, it indicates a
     * resize. Resizes are only allowed if the disk is not attached to a running VM, and can only increase the disk's
     * size.
     *
     * @param diskSizeGB the diskSizeGB value to set.
     * @return the SnapshotUpdate object itself.
     */
    public SnapshotUpdate withDiskSizeGB(Integer diskSizeGB) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SnapshotUpdateProperties();
        }
        this.innerProperties().withDiskSizeGB(diskSizeGB);
        return this;
    }

    /**
     * Get the encryptionSettingsCollection property: Encryption settings collection used be Azure Disk Encryption, can
     * contain multiple encryption settings per disk or snapshot.
     *
     * @return the encryptionSettingsCollection value.
     */
    public EncryptionSettingsCollection encryptionSettingsCollection() {
        return this.innerProperties() == null ? null : this.innerProperties().encryptionSettingsCollection();
    }

    /**
     * Set the encryptionSettingsCollection property: Encryption settings collection used be Azure Disk Encryption, can
     * contain multiple encryption settings per disk or snapshot.
     *
     * @param encryptionSettingsCollection the encryptionSettingsCollection value to set.
     * @return the SnapshotUpdate object itself.
     */
    public SnapshotUpdate withEncryptionSettingsCollection(EncryptionSettingsCollection encryptionSettingsCollection) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SnapshotUpdateProperties();
        }
        this.innerProperties().withEncryptionSettingsCollection(encryptionSettingsCollection);
        return this;
    }

    /**
     * Get the encryption property: Encryption property can be used to encrypt data at rest with customer managed keys
     * or platform managed keys.
     *
     * @return the encryption value.
     */
    public Encryption encryption() {
        return this.innerProperties() == null ? null : this.innerProperties().encryption();
    }

    /**
     * Set the encryption property: Encryption property can be used to encrypt data at rest with customer managed keys
     * or platform managed keys.
     *
     * @param encryption the encryption value to set.
     * @return the SnapshotUpdate object itself.
     */
    public SnapshotUpdate withEncryption(Encryption encryption) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SnapshotUpdateProperties();
        }
        this.innerProperties().withEncryption(encryption);
        return this;
    }

    /**
     * Get the networkAccessPolicy property: Policy for accessing the disk via network.
     *
     * @return the networkAccessPolicy value.
     */
    public NetworkAccessPolicy networkAccessPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().networkAccessPolicy();
    }

    /**
     * Set the networkAccessPolicy property: Policy for accessing the disk via network.
     *
     * @param networkAccessPolicy the networkAccessPolicy value to set.
     * @return the SnapshotUpdate object itself.
     */
    public SnapshotUpdate withNetworkAccessPolicy(NetworkAccessPolicy networkAccessPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SnapshotUpdateProperties();
        }
        this.innerProperties().withNetworkAccessPolicy(networkAccessPolicy);
        return this;
    }

    /**
     * Get the diskAccessId property: ARM id of the DiskAccess resource for using private endpoints on disks.
     *
     * @return the diskAccessId value.
     */
    public String diskAccessId() {
        return this.innerProperties() == null ? null : this.innerProperties().diskAccessId();
    }

    /**
     * Set the diskAccessId property: ARM id of the DiskAccess resource for using private endpoints on disks.
     *
     * @param diskAccessId the diskAccessId value to set.
     * @return the SnapshotUpdate object itself.
     */
    public SnapshotUpdate withDiskAccessId(String diskAccessId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SnapshotUpdateProperties();
        }
        this.innerProperties().withDiskAccessId(diskAccessId);
        return this;
    }

    /**
     * Get the supportsHibernation property: Indicates the OS on a snapshot supports hibernation.
     *
     * @return the supportsHibernation value.
     */
    public Boolean supportsHibernation() {
        return this.innerProperties() == null ? null : this.innerProperties().supportsHibernation();
    }

    /**
     * Set the supportsHibernation property: Indicates the OS on a snapshot supports hibernation.
     *
     * @param supportsHibernation the supportsHibernation value to set.
     * @return the SnapshotUpdate object itself.
     */
    public SnapshotUpdate withSupportsHibernation(Boolean supportsHibernation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SnapshotUpdateProperties();
        }
        this.innerProperties().withSupportsHibernation(supportsHibernation);
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Policy for controlling export on the disk.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: Policy for controlling export on the disk.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the SnapshotUpdate object itself.
     */
    public SnapshotUpdate withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SnapshotUpdateProperties();
        }
        this.innerProperties().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * Get the supportedCapabilities property: List of supported capabilities (like accelerated networking) for the
     * image from which the OS disk was created.
     *
     * @return the supportedCapabilities value.
     */
    public SupportedCapabilities supportedCapabilities() {
        return this.innerProperties() == null ? null : this.innerProperties().supportedCapabilities();
    }

    /**
     * Set the supportedCapabilities property: List of supported capabilities (like accelerated networking) for the
     * image from which the OS disk was created.
     *
     * @param supportedCapabilities the supportedCapabilities value to set.
     * @return the SnapshotUpdate object itself.
     */
    public SnapshotUpdate withSupportedCapabilities(SupportedCapabilities supportedCapabilities) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SnapshotUpdateProperties();
        }
        this.innerProperties().withSupportedCapabilities(supportedCapabilities);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
    }
}
