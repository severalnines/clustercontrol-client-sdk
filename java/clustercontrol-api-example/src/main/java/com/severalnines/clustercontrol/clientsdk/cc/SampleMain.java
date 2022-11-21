/*
 *     Copyright 2022 Severalnines Inc. @ https://severalnines.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.severalnines.clustercontrol.clientsdk.cc;

import com.severalnines.clustercontrol.api.abstraction.client.ClusterControlClient;
import com.severalnines.clustercontrol.api.abstraction.common.AbstractAuthenticationStrategy;
import com.severalnines.clustercontrol.api.abstraction.common.JsonSerializeDeserialize;
import com.severalnines.clustercontrol.api.abstraction.client.SimpleAuthenticationStrategy;
import com.severalnines.clustercontrol.api.abstraction.pojo.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public final class SampleMain {
    private static final Logger logger
            = LoggerFactory.getLogger(SampleMain.class);

    SampleMain(ClusterControlClient ccClient) {
        this.myCcClient = ccClient;
    }

    ClusterControlClient myCcClient;

    void createMysqlMasterSlaveCluster() throws Exception {
        DbCluster dbCluster = new DbCluster();
        dbCluster.setClusterName("api-abstraction-test");
        dbCluster.setClusterType("replication"); // options: replication, postgresql_single, redis, mssql_single, mssql_ao_async, galera, elastic
        dbCluster.setDbAdminUser("root");
        dbCluster.setDbAdminUserPw("XXX");
        dbCluster.setDbVendor("percona"); // options: default, percona, microsoft, redis, oracle, mariadb, elasticsearch
        dbCluster.setDbVersion("8.0");
        dbCluster.setPort("3306");
        dbCluster.setDbType("mysql"); // options: mysql, postgresql, redis, microsoft, elasticsearch
        Map<String,String> msLink = new HashMap<>();
        msLink.put("primary", "standby");
        dbCluster.addMasterSlaveLink(msLink);
        Host m = new Host("primary");
        dbCluster.addHost(m);
        Host s = new Host("standby");
        dbCluster.addHost(s);
        String createRet = myCcClient.createMysqlMariaCluster(JsonSerializeDeserialize.objectToJson(dbCluster));
        logger.info("CreateCluster response: {}", createRet);
    }

    void createMysqlGaleraCluster() throws Exception {
        DbCluster dbCluster = new DbCluster();
        dbCluster.setClusterName("api-abstraction-test");
        dbCluster.setClusterType("galera"); // options: replication, postgresql_single, redis, mssql_single, mssql_ao_async, galera, elastic
        dbCluster.setDbAdminUser("root");
        dbCluster.setDbAdminUserPw("XXX");
        dbCluster.setDbVendor("mariadb"); // options: default, percona, microsoft, redis, oracle, mariadb, elasticsearch
        dbCluster.setDbVersion("10.6");
        dbCluster.setPort("3306");
        dbCluster.setDbType("mysql"); // options: mysql, postgresql, redis, microsoft, elasticsearch
        Host m1 = new Host("m1");
        dbCluster.addHost(m1);
        Host m2 = new Host("m2");
        dbCluster.addHost(m2);
        Host m3 = new Host("m3");
        dbCluster.addHost(m3);
        String createRet = myCcClient.createMysqlMariaCluster(JsonSerializeDeserialize.objectToJson(dbCluster));
        logger.info("CreateCluster response: {}", createRet);
    }

    void createPgCluster() throws Exception {
        DbCluster dbCluster = new DbCluster();
        dbCluster.setClusterType("postgresql_single"); // options: replication, postgresql_single, redis, mssql_single, mssql_ao_async, galera, elastic
        dbCluster.setDbAdminUser("pgadmin");
        dbCluster.setDbAdminUserPw("XXX");
        dbCluster.setPort("5432");
        dbCluster.setDbVendor("default"); // options: default, percona, microsoft, redis, oracle, mariadb, elasticsearch
        dbCluster.setDbVersion("13");
        dbCluster.setDbType("postgresql"); // options: mysql, postgresql, redis, microsoft, elasticsearch
        Host m = new Host("primary");
        dbCluster.addHost(m);
        Host s = new Host("standby");
        dbCluster.addHost(s);
        String createRet = myCcClient.createPostgresqlCluster(JsonSerializeDeserialize.objectToJson(dbCluster));
        logger.info("CreateCluster response: {}", createRet);

        createRet = myCcClient.createTimescaleCluster(JsonSerializeDeserialize.objectToJson(dbCluster));
        logger.info("CreateCluster response: {}", createRet);
    }

    void createMongoCluster() throws Exception {
        DbCluster dbCluster = new DbCluster();
        dbCluster.setClusterType("mongodb"); // options: replication, postgresql_single, redis, mssql_single, mssql_ao_async, galera, elastic
        dbCluster.setDbType("mongodb"); // options: mysql, postgresql, redis, microsoft, elasticsearch
        dbCluster.setDbVendor("10gen"); // options: default, percona, microsoft, redis, oracle, mariadb, elasticsearch, 10gen
        dbCluster.setDbVersion("5.0");
        dbCluster.setDbAdminUser("mongoadmin");
        dbCluster.setDbAdminUserPw("XXX");
        dbCluster.setPort("27017");

        Host m = new Host("primary");
        Host s = new Host("standby");

        MongoServer cs = new MongoServer();
        Host csMem = new Host(m.getHostname());
        csMem.setPort("27019");
        cs.addMember(csMem);
        dbCluster.setConfigServers(cs);

        Host mongosServer = new Host(s.getHostname());
        mongosServer.setPort("27017");
        dbCluster.addMongosServer(mongosServer);

        MongoReplicaset rs = new MongoReplicaset("user_accounts");
        Host rsHost = new Host("r1");
        rsHost.setPort("27018");
        rsHost.setPriority("1.0");
        rs.addMember(rsHost);
        dbCluster.addReplicaset(rs);
        String createRet = myCcClient.createMongoCluster(JsonSerializeDeserialize.objectToJson(dbCluster));
        logger.info("CreateCluster response: {}", createRet);
    }

    void createRedisCluster() throws Exception {
        DbCluster dbCluster = new DbCluster();
        dbCluster.setClusterName("api-abstraction-test");
        dbCluster.setClusterType("redis"); // options: replication, postgresql_single, redis, mssql_single, mssql_ao_async, galera, elastic
        dbCluster.setDbAdminUserPw("XXX");
        dbCluster.setDbVersion("6.0"); // 5 or 6
        Host r1 = new Host("r1");
        dbCluster.addHost(r1);
        Host r2 = new Host("r2");
        dbCluster.addHost(r2);
        Host r3 = new Host("r3");
        dbCluster.addHost(r3);
        String createRet = myCcClient.createRedisCluster(JsonSerializeDeserialize.objectToJson(dbCluster));
        logger.info("CreateCluster response: {}", createRet);
    }

    void createMsSqlCluster() throws Exception {
        DbCluster dbCluster = new DbCluster();
        dbCluster.setClusterName("api-abstraction-test");
        dbCluster.setClusterType("mssql_ao_async"); // options: replication, postgresql_single, redis, mssql_single, mssql_ao_async, galera, elastic
        dbCluster.setDbAdminUserPw("XXX");
        dbCluster.setDbVersion("2019");
        Host r1 = new Host("r1");
        dbCluster.addHost(r1);
        Host r2 = new Host("r2");
        dbCluster.addHost(r2);String createRet = myCcClient.createMsSqlCluster(JsonSerializeDeserialize.objectToJson(dbCluster));
        logger.info("CreateCluster response: {}", createRet);
    }

    void createElasticsearchCluster() throws Exception {
        DbCluster dbCluster = new DbCluster();
        dbCluster.setClusterName("api-abstraction-test");
        dbCluster.setClusterType("elastic"); // options: replication, postgresql_single, redis, mssql_single, mssql_ao_async, galera, elastic
        dbCluster.setDbAdminUser("admin");
        dbCluster.setDbAdminUserPw("XXX");
        dbCluster.setDbVersion("8.1.3");
        dbCluster.setSnapshotLocaiton("/mnt/data");
        dbCluster.setSnapshotRepository("cc_snapshots");
        Host r1 = new Host("r1");
        r1.setRoles("master-data");
        dbCluster.addHost(r1);
        Host r2 = new Host("r2");
        r2.setRoles("master-data");
        dbCluster.setStorageHost("r1");
        dbCluster.addHost(r2);String createRet = myCcClient.createElastisearchCluster(JsonSerializeDeserialize.objectToJson(dbCluster));
        logger.info("CreateCluster response: {}", createRet);
    }

    void removeCluster() throws Exception {
        DbCluster dbCluster = new DbCluster();
        dbCluster.setClusterName("api-abstraction-test");
        dbCluster.setClusterId(21);
        String createRet = myCcClient.removeCluster(JsonSerializeDeserialize.objectToJson(dbCluster));
        logger.info("CreateCluster response: {}", createRet);
    }

    public static void main(String[] args) throws Exception {
        JsonSerializeDeserialize.SetSnakeNaming();
        SimpleAuthenticationStrategy authStrategy = new SimpleAuthenticationStrategy();
        AbstractAuthenticationStrategy.TurnOnDebug();
        // AbstractAuthenticationStrategy.TurnOffDebug();

        ClusterControlClient ccClient = new ClusterControlClient(authStrategy);
        AuthenticateUser authU = new AuthenticateUser();
        authU.setCcUrl(System.getenv("CC_URL"));
        authU.setUsername(System.getenv("CC_API_USER"));
        authU.setPassword(System.getenv("CC_API_USER_PW"));

        String authRet = ccClient.authenticateUser(JsonSerializeDeserialize.objectToJson(authU));
        logger.info("Login: {}", authRet);

        String discovRet = ccClient.getSuportedClusterTypes("");
        logger.info(discovRet);

        SampleMain sm = new SampleMain(ccClient);

        // MySQL cluster
        sm.createMysqlMasterSlaveCluster();
        sm.createMysqlGaleraCluster();

        // PG & TimescaleDB cluster
        sm.createPgCluster();

        // MongoDB cluster (replicaset and sharded)
        sm.createMongoCluster();

        // Redis
        sm.createRedisCluster();

        // MS SQL Server
        sm.createMsSqlCluster();

        // Elasticsearch
        sm.createElasticsearchCluster();

        // Remove cluster
        sm.removeCluster();
    }
}
