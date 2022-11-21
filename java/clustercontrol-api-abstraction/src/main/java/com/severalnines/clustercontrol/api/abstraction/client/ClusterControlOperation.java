package com.severalnines.clustercontrol.api.abstraction.client;

import com.severalnines.clustercontrol.api.abstraction.common.ClusterControlApiException;

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
public interface ClusterControlOperation {
    public String authenticateUser(String jsonStr) throws ClusterControlApiException;

    public String getSuportedClusterTypes(String jsonStr) throws ClusterControlApiException;

    public String createMysqlMariaCluster(String jsonStr) throws ClusterControlApiException;

    public String createPostgresqlCluster(String jsonStr) throws ClusterControlApiException;

    public String createTimescaleCluster(String jsonStr) throws ClusterControlApiException;

    public String createMongoCluster(String jsonStr) throws ClusterControlApiException;

    public String createRedisCluster(String jsonStr) throws ClusterControlApiException;

    public String createMsSqlCluster(String jsonStr) throws ClusterControlApiException;

    public String createElastisearchCluster(String jsonStr) throws ClusterControlApiException;

    public String removeCluster(String jsonStr) throws ClusterControlApiException;

    //    public String createMysqlReplicationCluster(String jsonStr) throws ClusterControlApiException;
//
//    public String createMariaReplicationCluster(String jsonStr) throws ClusterControlApiException;
//
//    public String createPerconaXtradbCluster(String jsonStr) throws ClusterControlApiException;
//
//    public String createMariaGaleraCluster(String jsonStr) throws ClusterControlApiException;
//
//    public String createPostgresqlCluster(String jsonStr) throws ClusterControlApiException;
//
//    public String createTimescaleCluster(String jsonStr) throws ClusterControlApiException;
//
//    public String createMongoReplicasetCluster(String jsonStr) throws ClusterControlApiException;
//
//    public String createMongoShardedCluster(String jsonStr) throws ClusterControlApiException;
//
//    public String createRedisCluster(String jsonStr) throws ClusterControlApiException;
//
//    public String createSqlServerCluster(String jsonStr) throws ClusterControlApiException;
//
//    public String createElasticSearchCluster(String jsonStr) throws ClusterControlApiException;
//
//    public String deleteCluster(String jsonStr) throws ClusterControlApiException;
//
//    public String createBackup(String jsonStr) throws ClusterControlApiException;
//
//    public String scheduleBackup(String jsonStr) throws ClusterControlApiException;
}
