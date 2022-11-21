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
import com.severalnines.clustercontrol.api.abstraction.common.AbstractClusterControlOperation;
import com.severalnines.clustercontrol.api.abstraction.common.ClusterControlApiException;
import com.severalnines.clustercontrol.api.abstraction.common.DefaultClusterControlOpExecStrategy;
import com.severalnines.clustercontrol.api.abstraction.job.*;
import com.severalnines.clustercontrol.api.abstraction.nonjob.AuthenticateWithClusterControl;
import com.severalnines.clustercontrol.api.abstraction.nonjob.ClusterDiscovery;
import org.openapitools.ccapi.client.model.JobsJobJobSpec;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClusterControlClient extends AbstractClusterControlClient {

    private static final Logger logger
            = LoggerFactory.getLogger(ClusterControlClient.class);

    public ClusterControlClient(AbstractAuthenticationStrategy reAuthStrategy) {
        super(reAuthStrategy);
    }

    @Override
    public String authenticateUser(String jsonStr) throws ClusterControlApiException {
        AuthenticateWithClusterControl ccAuth = new AuthenticateWithClusterControl(
                getAuthStrategy(), jsonStr);
        DefaultClusterControlOpExecStrategy execStrategy = new DefaultClusterControlOpExecStrategy(
                getAuthStrategy(), ccAuth);
        execStrategy.executeOp();
        return ("{\"status\": \"Success\"");
    }

    @Override
    public String getSuportedClusterTypes(String jsonStr) throws ClusterControlApiException {
        ClusterDiscovery discov = new ClusterDiscovery(getAuthStrategy(), jsonStr,
                ClusterDiscovery.DiscoveryOperTypeEnum.GET_CLUSTER_TYPES);

        DefaultClusterControlOpExecStrategy execStrategy = new DefaultClusterControlOpExecStrategy(
                getAuthStrategy(), discov);

        return execStrategy.executeOp();
    }

    @Override
    public String createMysqlMariaCluster(String jsonStr) throws ClusterControlApiException {
        AbstractDbClusterJob crClustJob = new MysqlMariaClusterJob(
                getAuthStrategy(), jsonStr, JobsJobJobSpec.CommandEnum.CREATE_CLUSTER);

        DefaultClusterControlOpExecStrategy execStrategy = new DefaultClusterControlOpExecStrategy(
                getAuthStrategy(), crClustJob);

        return execStrategy.executeOp();
    }

    @Override
    public String createPostgresqlCluster(String jsonStr) throws ClusterControlApiException {
        AbstractDbClusterJob crClustJob = new PostgresqlClusterJob(
                getAuthStrategy(), jsonStr, JobsJobJobSpec.CommandEnum.CREATE_CLUSTER);

        DefaultClusterControlOpExecStrategy execStrategy = new DefaultClusterControlOpExecStrategy(
                getAuthStrategy(), crClustJob);

        return execStrategy.executeOp();
    }

    @Override
    public String createTimescaleCluster(String jsonStr) throws ClusterControlApiException {
        AbstractDbClusterJob crClustJob = new TimescaleDbClusterJob(
                getAuthStrategy(), jsonStr, JobsJobJobSpec.CommandEnum.CREATE_CLUSTER);

        DefaultClusterControlOpExecStrategy execStrategy = new DefaultClusterControlOpExecStrategy(
                getAuthStrategy(), crClustJob);

        return execStrategy.executeOp();
    }

    @Override
    public String createMongoCluster(String jsonStr) throws ClusterControlApiException {
        AbstractDbClusterJob crClustJob = new MongoDbClusterJob(
                getAuthStrategy(), jsonStr, JobsJobJobSpec.CommandEnum.CREATE_CLUSTER);

        DefaultClusterControlOpExecStrategy execStrategy = new DefaultClusterControlOpExecStrategy(
                getAuthStrategy(), crClustJob);

        return execStrategy.executeOp();
    }

    @Override
    public String createRedisCluster(String jsonStr) throws ClusterControlApiException {
        AbstractDbClusterJob crClustJob = new RedisClusterJob(
                getAuthStrategy(), jsonStr, JobsJobJobSpec.CommandEnum.CREATE_CLUSTER);

        DefaultClusterControlOpExecStrategy execStrategy = new DefaultClusterControlOpExecStrategy(
                getAuthStrategy(), crClustJob);

        return execStrategy.executeOp();
    }

    @Override
    public String createMsSqlCluster(String jsonStr) throws ClusterControlApiException {
        AbstractDbClusterJob crClustJob = new MsSqlClusterJob(
                getAuthStrategy(), jsonStr, JobsJobJobSpec.CommandEnum.CREATE_CLUSTER);

        DefaultClusterControlOpExecStrategy execStrategy = new DefaultClusterControlOpExecStrategy(
                getAuthStrategy(), crClustJob);

        return execStrategy.executeOp();
    }

    @Override
    public String createElastisearchCluster(String jsonStr) throws ClusterControlApiException {
        AbstractDbClusterJob crClustJob = new ElasticsearchClusterJob(
                getAuthStrategy(), jsonStr, JobsJobJobSpec.CommandEnum.CREATE_CLUSTER);

        DefaultClusterControlOpExecStrategy execStrategy = new DefaultClusterControlOpExecStrategy(
                getAuthStrategy(), crClustJob);

        return execStrategy.executeOp();
    }

    @Override
    public String removeCluster(String jsonStr) throws ClusterControlApiException {
        AbstractDbClusterJob rmClustJob = new RemoveClusterJob(
                getAuthStrategy(), jsonStr, JobsJobJobSpec.CommandEnum.REMOVE_CLUSTER);

        DefaultClusterControlOpExecStrategy execStrategy = new DefaultClusterControlOpExecStrategy(
                getAuthStrategy(), rmClustJob);

        return execStrategy.executeOp();
    }

    @Override
    public String getJob(String jsonStr) throws ClusterControlApiException {
        AbstractClusterControlOperation rmClustJob = new ClusterControlJob(getAuthStrategy(), jsonStr);

        DefaultClusterControlOpExecStrategy execStrategy = new DefaultClusterControlOpExecStrategy(
                getAuthStrategy(), rmClustJob);

        return execStrategy.executeOp();
    }

}
