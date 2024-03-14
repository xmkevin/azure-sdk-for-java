// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.redisenterprise.models.AofFrequency;
import com.azure.resourcemanager.redisenterprise.models.ClusteringPolicy;
import com.azure.resourcemanager.redisenterprise.models.DatabasePropertiesGeoReplication;
import com.azure.resourcemanager.redisenterprise.models.DatabaseUpdate;
import com.azure.resourcemanager.redisenterprise.models.EvictionPolicy;
import com.azure.resourcemanager.redisenterprise.models.LinkedDatabase;
import com.azure.resourcemanager.redisenterprise.models.Module;
import com.azure.resourcemanager.redisenterprise.models.Persistence;
import com.azure.resourcemanager.redisenterprise.models.Protocol;
import com.azure.resourcemanager.redisenterprise.models.RdbFrequency;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DatabaseUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DatabaseUpdate model = BinaryData.fromString(
            "{\"properties\":{\"clientProtocol\":\"Encrypted\",\"port\":1788312026,\"provisioningState\":\"Succeeded\",\"resourceState\":\"Running\",\"clusteringPolicy\":\"EnterpriseCluster\",\"evictionPolicy\":\"AllKeysRandom\",\"persistence\":{\"aofEnabled\":true,\"rdbEnabled\":true,\"aofFrequency\":\"1s\",\"rdbFrequency\":\"6h\"},\"modules\":[{\"name\":\"igeho\",\"args\":\"bowsk\",\"version\":\"yktz\"}],\"geoReplication\":{\"groupNickname\":\"iywgqywgndrvynh\",\"linkedDatabases\":[{\"id\":\"hrc\",\"state\":\"Linked\"},{\"id\":\"ocpecfvmmco\",\"state\":\"LinkFailed\"},{\"id\":\"lzevgbmqjqab\",\"state\":\"UnlinkFailed\"}]}}}")
            .toObject(DatabaseUpdate.class);
        Assertions.assertEquals(Protocol.ENCRYPTED, model.clientProtocol());
        Assertions.assertEquals(1788312026, model.port());
        Assertions.assertEquals(ClusteringPolicy.ENTERPRISE_CLUSTER, model.clusteringPolicy());
        Assertions.assertEquals(EvictionPolicy.ALL_KEYS_RANDOM, model.evictionPolicy());
        Assertions.assertEquals(true, model.persistence().aofEnabled());
        Assertions.assertEquals(true, model.persistence().rdbEnabled());
        Assertions.assertEquals(AofFrequency.ONES, model.persistence().aofFrequency());
        Assertions.assertEquals(RdbFrequency.SIXH, model.persistence().rdbFrequency());
        Assertions.assertEquals("igeho", model.modules().get(0).name());
        Assertions.assertEquals("bowsk", model.modules().get(0).args());
        Assertions.assertEquals("iywgqywgndrvynh", model.geoReplication().groupNickname());
        Assertions.assertEquals("hrc", model.geoReplication().linkedDatabases().get(0).id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DatabaseUpdate model = new DatabaseUpdate().withClientProtocol(Protocol.ENCRYPTED).withPort(1788312026)
            .withClusteringPolicy(ClusteringPolicy.ENTERPRISE_CLUSTER)
            .withEvictionPolicy(EvictionPolicy.ALL_KEYS_RANDOM)
            .withPersistence(new Persistence().withAofEnabled(true).withRdbEnabled(true)
                .withAofFrequency(AofFrequency.ONES).withRdbFrequency(RdbFrequency.SIXH))
            .withModules(Arrays.asList(new Module().withName("igeho").withArgs("bowsk")))
            .withGeoReplication(new DatabasePropertiesGeoReplication().withGroupNickname("iywgqywgndrvynh")
                .withLinkedDatabases(Arrays.asList(new LinkedDatabase().withId("hrc"),
                    new LinkedDatabase().withId("ocpecfvmmco"), new LinkedDatabase().withId("lzevgbmqjqab"))));
        model = BinaryData.fromObject(model).toObject(DatabaseUpdate.class);
        Assertions.assertEquals(Protocol.ENCRYPTED, model.clientProtocol());
        Assertions.assertEquals(1788312026, model.port());
        Assertions.assertEquals(ClusteringPolicy.ENTERPRISE_CLUSTER, model.clusteringPolicy());
        Assertions.assertEquals(EvictionPolicy.ALL_KEYS_RANDOM, model.evictionPolicy());
        Assertions.assertEquals(true, model.persistence().aofEnabled());
        Assertions.assertEquals(true, model.persistence().rdbEnabled());
        Assertions.assertEquals(AofFrequency.ONES, model.persistence().aofFrequency());
        Assertions.assertEquals(RdbFrequency.SIXH, model.persistence().rdbFrequency());
        Assertions.assertEquals("igeho", model.modules().get(0).name());
        Assertions.assertEquals("bowsk", model.modules().get(0).args());
        Assertions.assertEquals("iywgqywgndrvynh", model.geoReplication().groupNickname());
        Assertions.assertEquals("hrc", model.geoReplication().linkedDatabases().get(0).id());
    }
}
