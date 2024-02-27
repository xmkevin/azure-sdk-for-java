// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.storagecache.fluent.models.CacheInner;
import com.azure.resourcemanager.storagecache.models.Cache;
import com.azure.resourcemanager.storagecache.models.CacheDirectorySettings;
import com.azure.resourcemanager.storagecache.models.CacheEncryptionSettings;
import com.azure.resourcemanager.storagecache.models.CacheHealth;
import com.azure.resourcemanager.storagecache.models.CacheIdentity;
import com.azure.resourcemanager.storagecache.models.CacheNetworkSettings;
import com.azure.resourcemanager.storagecache.models.CacheSecuritySettings;
import com.azure.resourcemanager.storagecache.models.CacheSku;
import com.azure.resourcemanager.storagecache.models.CacheUpgradeSettings;
import com.azure.resourcemanager.storagecache.models.CacheUpgradeStatus;
import com.azure.resourcemanager.storagecache.models.PrimingJob;
import com.azure.resourcemanager.storagecache.models.PrimingJobIdParameter;
import com.azure.resourcemanager.storagecache.models.ProvisioningStateType;
import com.azure.resourcemanager.storagecache.models.StorageTargetSpaceAllocation;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class CacheImpl implements Cache, Cache.Definition, Cache.Update {
    private CacheInner innerObject;

    private final com.azure.resourcemanager.storagecache.StorageCacheManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public CacheIdentity identity() {
        return this.innerModel().identity();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public CacheSku sku() {
        return this.innerModel().sku();
    }

    public Integer cacheSizeGB() {
        return this.innerModel().cacheSizeGB();
    }

    public CacheHealth health() {
        return this.innerModel().health();
    }

    public List<String> mountAddresses() {
        List<String> inner = this.innerModel().mountAddresses();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ProvisioningStateType provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String subnet() {
        return this.innerModel().subnet();
    }

    public CacheUpgradeStatus upgradeStatus() {
        return this.innerModel().upgradeStatus();
    }

    public CacheUpgradeSettings upgradeSettings() {
        return this.innerModel().upgradeSettings();
    }

    public CacheNetworkSettings networkSettings() {
        return this.innerModel().networkSettings();
    }

    public CacheEncryptionSettings encryptionSettings() {
        return this.innerModel().encryptionSettings();
    }

    public CacheSecuritySettings securitySettings() {
        return this.innerModel().securitySettings();
    }

    public CacheDirectorySettings directoryServicesSettings() {
        return this.innerModel().directoryServicesSettings();
    }

    public List<String> zones() {
        List<String> inner = this.innerModel().zones();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<PrimingJob> primingJobs() {
        List<PrimingJob> inner = this.innerModel().primingJobs();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<StorageTargetSpaceAllocation> spaceAllocation() {
        List<StorageTargetSpaceAllocation> inner = this.innerModel().spaceAllocation();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public CacheInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.storagecache.StorageCacheManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String cacheName;

    public CacheImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Cache create() {
        this.innerObject = serviceManager.serviceClient().getCaches().createOrUpdate(resourceGroupName, cacheName,
            this.innerModel(), Context.NONE);
        return this;
    }

    public Cache create(Context context) {
        this.innerObject = serviceManager.serviceClient().getCaches().createOrUpdate(resourceGroupName, cacheName,
            this.innerModel(), context);
        return this;
    }

    CacheImpl(String name, com.azure.resourcemanager.storagecache.StorageCacheManager serviceManager) {
        this.innerObject = new CacheInner();
        this.serviceManager = serviceManager;
        this.cacheName = name;
    }

    public CacheImpl update() {
        return this;
    }

    public Cache apply() {
        this.innerObject = serviceManager.serviceClient().getCaches().update(resourceGroupName, cacheName,
            this.innerModel(), Context.NONE);
        return this;
    }

    public Cache apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getCaches().update(resourceGroupName, cacheName,
            this.innerModel(), context);
        return this;
    }

    CacheImpl(CacheInner innerObject, com.azure.resourcemanager.storagecache.StorageCacheManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourcegroups");
        this.cacheName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "caches");
    }

    public Cache refresh() {
        this.innerObject = serviceManager.serviceClient().getCaches()
            .getByResourceGroupWithResponse(resourceGroupName, cacheName, Context.NONE).getValue();
        return this;
    }

    public Cache refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getCaches()
            .getByResourceGroupWithResponse(resourceGroupName, cacheName, context).getValue();
        return this;
    }

    public void debugInfo() {
        serviceManager.caches().debugInfo(resourceGroupName, cacheName);
    }

    public void debugInfo(Context context) {
        serviceManager.caches().debugInfo(resourceGroupName, cacheName, context);
    }

    public void flush() {
        serviceManager.caches().flush(resourceGroupName, cacheName);
    }

    public void flush(Context context) {
        serviceManager.caches().flush(resourceGroupName, cacheName, context);
    }

    public void start() {
        serviceManager.caches().start(resourceGroupName, cacheName);
    }

    public void start(Context context) {
        serviceManager.caches().start(resourceGroupName, cacheName, context);
    }

    public void stop() {
        serviceManager.caches().stop(resourceGroupName, cacheName);
    }

    public void stop(Context context) {
        serviceManager.caches().stop(resourceGroupName, cacheName, context);
    }

    public void startPrimingJob() {
        serviceManager.caches().startPrimingJob(resourceGroupName, cacheName);
    }

    public void startPrimingJob(PrimingJob primingjob, Context context) {
        serviceManager.caches().startPrimingJob(resourceGroupName, cacheName, primingjob, context);
    }

    public void stopPrimingJob() {
        serviceManager.caches().stopPrimingJob(resourceGroupName, cacheName);
    }

    public void stopPrimingJob(PrimingJobIdParameter primingJobId, Context context) {
        serviceManager.caches().stopPrimingJob(resourceGroupName, cacheName, primingJobId, context);
    }

    public void pausePrimingJob() {
        serviceManager.caches().pausePrimingJob(resourceGroupName, cacheName);
    }

    public void pausePrimingJob(PrimingJobIdParameter primingJobId, Context context) {
        serviceManager.caches().pausePrimingJob(resourceGroupName, cacheName, primingJobId, context);
    }

    public void resumePrimingJob() {
        serviceManager.caches().resumePrimingJob(resourceGroupName, cacheName);
    }

    public void resumePrimingJob(PrimingJobIdParameter primingJobId, Context context) {
        serviceManager.caches().resumePrimingJob(resourceGroupName, cacheName, primingJobId, context);
    }

    public void upgradeFirmware() {
        serviceManager.caches().upgradeFirmware(resourceGroupName, cacheName);
    }

    public void upgradeFirmware(Context context) {
        serviceManager.caches().upgradeFirmware(resourceGroupName, cacheName, context);
    }

    public CacheImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public CacheImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public CacheImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public CacheImpl withIdentity(CacheIdentity identity) {
        this.innerModel().withIdentity(identity);
        return this;
    }

    public CacheImpl withSku(CacheSku sku) {
        this.innerModel().withSku(sku);
        return this;
    }

    public CacheImpl withCacheSizeGB(Integer cacheSizeGB) {
        this.innerModel().withCacheSizeGB(cacheSizeGB);
        return this;
    }

    public CacheImpl withSubnet(String subnet) {
        this.innerModel().withSubnet(subnet);
        return this;
    }

    public CacheImpl withUpgradeSettings(CacheUpgradeSettings upgradeSettings) {
        this.innerModel().withUpgradeSettings(upgradeSettings);
        return this;
    }

    public CacheImpl withNetworkSettings(CacheNetworkSettings networkSettings) {
        this.innerModel().withNetworkSettings(networkSettings);
        return this;
    }

    public CacheImpl withEncryptionSettings(CacheEncryptionSettings encryptionSettings) {
        this.innerModel().withEncryptionSettings(encryptionSettings);
        return this;
    }

    public CacheImpl withSecuritySettings(CacheSecuritySettings securitySettings) {
        this.innerModel().withSecuritySettings(securitySettings);
        return this;
    }

    public CacheImpl withDirectoryServicesSettings(CacheDirectorySettings directoryServicesSettings) {
        this.innerModel().withDirectoryServicesSettings(directoryServicesSettings);
        return this;
    }

    public CacheImpl withZones(List<String> zones) {
        this.innerModel().withZones(zones);
        return this;
    }
}
