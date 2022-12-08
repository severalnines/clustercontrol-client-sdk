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

import com.severalnines.clustercontrol.api.abstraction.common.*;
import com.severalnines.clustercontrol.api.abstraction.job.*;
import com.severalnines.clustercontrol.api.abstraction.nonjob.AuthenticateWithClusterControl;
import com.severalnines.clustercontrol.api.abstraction.nonjob.BackupSchedule;
import com.severalnines.clustercontrol.api.abstraction.nonjob.ClusterControlClusters;
import com.severalnines.clustercontrol.api.abstraction.nonjob.ClusterDiscovery;
import com.severalnines.clustercontrol.api.abstraction.pojo.DbCluster;
import org.openapitools.ccapi.client.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClusterControlClient extends AbstractClusterControlClient {

    private static final Logger logger = LoggerFactory.getLogger(ClusterControlClient.class);

    public ClusterControlClient(AbstractAuthenticationStrategy reAuthStrategy) {
        super(reAuthStrategy);
    }

    @Override
    public String authenticateUser(String jsonStr) throws ClusterControlApiException {
        AuthenticateWithClusterControl ccAuth = new AuthenticateWithClusterControl(getAuthStrategy(), jsonStr);
        DefaultClusterControlOperationProxy proxy = new DefaultClusterControlOperationProxy(getAuthStrategy(), ccAuth);
        proxy.execute();
        return ("{\"status\": \"Success\"");
    }

    @Override
    public String getSuportedClusterTypes(String jsonStr) throws ClusterControlApiException {
        ClusterDiscovery discov = new ClusterDiscovery(
                getAuthStrategy(), jsonStr, Discovery.OperationEnum.GETSUPPORTEDCLUSTERTYPES);

        DefaultClusterControlOperationProxy proxy =
                new DefaultClusterControlOperationProxy(getAuthStrategy(), discov);

        return proxy.execute();
    }

    @Override
    public String createDatabaseCluster(String jsonStr) throws ClusterControlApiException {
        DbCluster createDetails;
        try {
            createDetails = JsonSerializeDeserialize.jsonToObject(jsonStr, DbCluster.class);
        } catch (Exception e) {
            logger.warn("Exception in jsonToObject: ", e);
            throw new ClusterControlInputException(e);
        }

        AbstractDbClusterJob crClustJob = null;
        switch (JobsJobJobSpecJobData.ClusterTypeEnum.fromValue(createDetails.getClusterType())) {
            case REPLICATION:
            case GALERA:
                crClustJob = new MysqlMariaClusterJob(
                        getAuthStrategy(), jsonStr, JobsJobJobSpec.CommandEnum.CREATE_CLUSTER);
                break;
            case ELASTIC:
                crClustJob = new ElasticsearchClusterJob(
                        getAuthStrategy(), jsonStr, JobsJobJobSpec.CommandEnum.CREATE_CLUSTER);
                break;
            case MONGODB:
                crClustJob = new MongoDbClusterJob(
                        getAuthStrategy(), jsonStr, JobsJobJobSpec.CommandEnum.CREATE_CLUSTER);
                break;
            case MSSQL_SINGLE:
            case MSSQL_AO_ASYNC:
                crClustJob = new MsSqlClusterJob(
                        getAuthStrategy(), jsonStr, JobsJobJobSpec.CommandEnum.CREATE_CLUSTER);
                break;
            case POSTGRESQL_SINGLE:
                crClustJob = new PostgresqlClusterJob(
                        getAuthStrategy(), jsonStr, JobsJobJobSpec.CommandEnum.CREATE_CLUSTER);
                break;
            case REDIS:
                crClustJob = new RedisClusterJob(
                        getAuthStrategy(), jsonStr, JobsJobJobSpec.CommandEnum.CREATE_CLUSTER);
                break;
            default:
                logger.warn("Unsupported cluster_type: {}", createDetails.getClusterType());
                throw new ClusterControlApiException("Unsupported cluster_type:" + createDetails.getClusterType());
                // break;
        }

        DefaultClusterControlOperationProxy proxy = new DefaultClusterControlOperationProxy(
                getAuthStrategy(), crClustJob);

        return proxy.execute();
    }

    @Override
    public String createMysqlMariaCluster(String jsonStr) throws ClusterControlApiException {
        AbstractDbClusterJob crClustJob = new MysqlMariaClusterJob(
                getAuthStrategy(), jsonStr, JobsJobJobSpec.CommandEnum.CREATE_CLUSTER);

        DefaultClusterControlOperationProxy proxy =
                new DefaultClusterControlOperationProxy(getAuthStrategy(), crClustJob);

        return proxy.execute();
    }

    @Override
    public String createPostgresqlCluster(String jsonStr) throws ClusterControlApiException {
        AbstractDbClusterJob crClustJob = new PostgresqlClusterJob(
                getAuthStrategy(), jsonStr, JobsJobJobSpec.CommandEnum.CREATE_CLUSTER);

        DefaultClusterControlOperationProxy proxy =
                new DefaultClusterControlOperationProxy(getAuthStrategy(), crClustJob);

        return proxy.execute();
    }

    @Override
    public String createTimescaleCluster(String jsonStr) throws ClusterControlApiException {
        AbstractDbClusterJob crClustJob = new TimescaleDbClusterJob(
                getAuthStrategy(), jsonStr, JobsJobJobSpec.CommandEnum.CREATE_CLUSTER);

        DefaultClusterControlOperationProxy proxy =
                new DefaultClusterControlOperationProxy(getAuthStrategy(), crClustJob);

        return proxy.execute();
    }

    @Override
    public String createMongoCluster(String jsonStr) throws ClusterControlApiException {
        AbstractDbClusterJob crClustJob = new MongoDbClusterJob(
                getAuthStrategy(), jsonStr, JobsJobJobSpec.CommandEnum.CREATE_CLUSTER);

        DefaultClusterControlOperationProxy proxy =
                new DefaultClusterControlOperationProxy(getAuthStrategy(), crClustJob);

        return proxy.execute();
    }

    @Override
    public String createRedisCluster(String jsonStr) throws ClusterControlApiException {
        AbstractDbClusterJob crClustJob = new RedisClusterJob(
                getAuthStrategy(), jsonStr, JobsJobJobSpec.CommandEnum.CREATE_CLUSTER);

        DefaultClusterControlOperationProxy proxy =
                new DefaultClusterControlOperationProxy(getAuthStrategy(), crClustJob);

        return proxy.execute();
    }

    @Override
    public String createMsSqlCluster(String jsonStr) throws ClusterControlApiException {
        AbstractDbClusterJob crClustJob = new MsSqlClusterJob(
                getAuthStrategy(), jsonStr, JobsJobJobSpec.CommandEnum.CREATE_CLUSTER);

        DefaultClusterControlOperationProxy proxy =
                new DefaultClusterControlOperationProxy(getAuthStrategy(), crClustJob);

        return proxy.execute();
    }

    @Override
    public String createElastisearchCluster(String jsonStr) throws ClusterControlApiException {
        AbstractDbClusterJob crClustJob = new ElasticsearchClusterJob(
                getAuthStrategy(), jsonStr, JobsJobJobSpec.CommandEnum.CREATE_CLUSTER);

        DefaultClusterControlOperationProxy proxy =
                new DefaultClusterControlOperationProxy(getAuthStrategy(), crClustJob);

        return proxy.execute();
    }

    @Override
    public String removeCluster(String jsonStr) throws ClusterControlApiException {
        AbstractDbClusterJob rmClustJob = new RemoveClusterJob(
                getAuthStrategy(), jsonStr, JobsJobJobSpec.CommandEnum.REMOVE_CLUSTER);

        DefaultClusterControlOperationProxy proxy =
                new DefaultClusterControlOperationProxy(getAuthStrategy(), rmClustJob);

        return proxy.execute();
    }

    @Override
    public String getJob(String jsonStr) throws ClusterControlApiException {
        ClusterControlJob rmClustJob = new ClusterControlJob(getAuthStrategy(), jsonStr);

        DefaultClusterControlOperationProxy proxy =
                new DefaultClusterControlOperationProxy(getAuthStrategy(), rmClustJob);

        return proxy.execute();
    }

    @Override
    public String createBackupSchedule(String jsonStr) throws ClusterControlApiException {
        BackupSchedule backupSchedule = new BackupSchedule(
                getAuthStrategy(), jsonStr, Backup.OperationEnum.SCHEDULEBACKUP);

        DefaultClusterControlOperationProxy proxy =
                new DefaultClusterControlOperationProxy(getAuthStrategy(), backupSchedule);

        return proxy.execute();
    }

//    @Override
//    public String deleteBackupSchedule(String jsonStr) throws ClusterControlApiException {
//        return null;
//    }

    @Override
    public String createBackup(String jsonStr) throws ClusterControlApiException {
        BackupJob backup = new BackupJob(getAuthStrategy(), jsonStr, JobsJobJobSpec.CommandEnum.BACKUP);

        DefaultClusterControlOperationProxy proxy =
                new DefaultClusterControlOperationProxy(getAuthStrategy(), backup);

        return proxy.execute();
    }

    @Override
    public String deleteBackup(String jsonStr) throws ClusterControlApiException {
        BackupJob backup = new BackupJob(getAuthStrategy(), jsonStr, JobsJobJobSpec.CommandEnum.DELETE_BACKUP);

        DefaultClusterControlOperationProxy proxy =
                new DefaultClusterControlOperationProxy(getAuthStrategy(), backup);

        return proxy.execute();
    }

    @Override
    public String deleteBackupRecord(String jsonStr) throws ClusterControlApiException {
        BackupSchedule backupSchedule = new BackupSchedule(
                getAuthStrategy(), jsonStr, Backup.OperationEnum.DELETEBACKUPRECORD);

        DefaultClusterControlOperationProxy proxy =
                new DefaultClusterControlOperationProxy(getAuthStrategy(), backupSchedule);

        return proxy.execute();
    }

    @Override
    public String getClusterInfo(String jsonStr) throws ClusterControlApiException {
        ClusterControlClusters clusters = new ClusterControlClusters(
                getAuthStrategy(), jsonStr, Clusters.OperationEnum.GETCLUSTERINFO);

        DefaultClusterControlOperationProxy proxy =
                new DefaultClusterControlOperationProxy(getAuthStrategy(), clusters);

        return proxy.execute();
    }

}
