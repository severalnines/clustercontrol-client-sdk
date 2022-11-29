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
package com.severalnines.clustercontrol.api.abstraction.client;

import com.severalnines.clustercontrol.api.abstraction.common.AbstractAuthenticationStrategy;
import com.severalnines.clustercontrol.api.abstraction.common.ClusterControlApiException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

abstract class AbstractClusterControlClient implements ClusterControlOperation  {

    private static final Logger logger
            = LoggerFactory.getLogger(AbstractClusterControlClient.class);

    AbstractClusterControlClient(AbstractAuthenticationStrategy authStrategy) {
        this.authStrategy = authStrategy;
    }

    private AbstractAuthenticationStrategy authStrategy;

    public AbstractAuthenticationStrategy getAuthStrategy() {
        return authStrategy;
    }

    @Override
    public String authenticateUser(String jsonStr) throws ClusterControlApiException {
        return null;
    }

    @Override
    public String getSuportedClusterTypes(String jsonStr) throws ClusterControlApiException {
        return null;
    }

    @Override
    public String createMysqlMariaCluster(String jsonStr) throws ClusterControlApiException {
        return null;
    }

    @Override
    public String createPostgresqlCluster(String jsonStr) throws ClusterControlApiException {
        return null;
    }

    @Override
    public String createTimescaleCluster(String jsonStr) throws ClusterControlApiException {
        return null;
    }

    @Override
    public String createMongoCluster(String jsonStr) throws ClusterControlApiException {
        return null;
    }

    @Override
    public String createRedisCluster(String jsonStr) throws ClusterControlApiException {
        return null;
    }

    @Override
    public String createMsSqlCluster(String jsonStr) throws ClusterControlApiException {
        return null;
    }

    @Override
    public String createElastisearchCluster(String jsonStr) throws ClusterControlApiException {
        return null;
    }

    @Override
    public String removeCluster(String jsonStr) throws ClusterControlApiException {
        return null;
    }

    @Override
    public String getJob(String jsonStr) throws ClusterControlApiException {
        return null;
    }

    @Override
    public String createBackupSchedule(String jsonStr) throws ClusterControlApiException {
        return null;
    }

//    @Override
//    public String deleteBackupSchedule(String jsonStr) throws ClusterControlApiException {
//        return null;
//    }

    @Override
    public String createBackup(String jsonStr) throws ClusterControlApiException {
        return null;
    }

    @Override
    public String deleteBackup(String jsonStr) throws ClusterControlApiException {
        return null;
    }

    @Override
    public String deleteBackupRecord(String jsonStr) throws ClusterControlApiException {
        return null;
    }

    @Override
    public String getClusterInfo(String jsonStr) throws ClusterControlApiException {
        return null;
    }
}
