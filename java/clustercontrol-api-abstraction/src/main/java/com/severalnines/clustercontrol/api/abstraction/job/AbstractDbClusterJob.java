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
package com.severalnines.clustercontrol.api.abstraction.job;

import com.severalnines.clustercontrol.api.abstraction.common.*;
import com.severalnines.clustercontrol.api.abstraction.pojo.BackupSpec;
import com.severalnines.clustercontrol.api.abstraction.pojo.DbCluster;
import com.severalnines.clustercontrol.api.abstraction.pojo.Host;
import org.openapitools.ccapi.client.ApiClient;
import org.openapitools.ccapi.client.ApiResponse;
import org.openapitools.ccapi.client.api.JobsApi;
import org.openapitools.ccapi.client.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public abstract class AbstractDbClusterJob extends AbstractClusterControlOperation {

    private static final Logger logger = LoggerFactory.getLogger(AbstractDbClusterJob.class);

    private JobsJobJobSpec.CommandEnum jobType;

    public JobsJobJobSpec.CommandEnum getDbClusterOpType() {
        return jobType;
    }

    AbstractDbClusterJob(AbstractAuthenticationStrategy authStrategy, String jsonStr, JobsJobJobSpec.CommandEnum jobType) {
        super(authStrategy, jsonStr);
        this.jobType = jobType;
    }

    @Override
    public String execute() throws ClusterControlApiException {
        switch (getDbClusterOpType()) {
            case CREATE_CLUSTER:
                return createCluster();
            case REMOVE_CLUSTER:
                return removeCluster();
            case BACKUP:
                return createBackup();
            case DELETE_BACKUP:
                return deleteBackup();
            default:
                logger.warn("Unsupported DbClusterOpType (enum: {})", getDbClusterOpType());
                break;
        }
        return "";
    }

    protected void setBackupCommon(Jobs jobs, BackupSpec backupSpec) {
        jobs.setOperation(Jobs.OperationEnum.CREATEJOBINSTANCE);
        jobs.setClusterId(backupSpec.getClusterId());
    }

    protected void setBackupCommon(JobsJob jj) {
        jj.setClassName("CmonJobInstance");
    }

    protected void setBackupCommon(JobsJobJobSpecJobData jsjD, BackupSpec backupSpec) {
        jsjD.setClusterid(backupSpec.getClusterId());
    }

    protected String deleteBackup() throws ClusterControlApiException {
        String ret = "";

        BackupSpec backupSpec = formBackupDetails(getJsonInput());

        try {
            ApiClient defaultClient = getAuthStrategy().getApiClient();
            JobsApi apiInstance = new JobsApi(defaultClient);
            Jobs jobs = new Jobs();
            setBackupCommon(jobs, backupSpec);

            JobsJob jj = new JobsJob();
            setBackupCommon(jj);

            JobsJobJobSpec jSpec = new JobsJobJobSpec();
            jSpec.setCommand(JobsJobJobSpec.CommandEnum.DELETE_BACKUP);

            JobsJobJobSpecJobData jsjD = new JobsJobJobSpecJobData();
            setBackupCommon(jsjD, backupSpec);
            jsjD.setBackupId(backupSpec.getBackupId());

            jSpec.setJobData(jsjD);
            jj.setJobSpec(jSpec);
            jobs.setJob(jj);

            logger.debug("DeleteBackupJobPost request: {}", jobs);
            if (!AbstractAuthenticationStrategy.IsDebugMode()) {
                ApiResponse<Void> resp = apiInstance.jobsPostWithHttpInfo(jobs);
                ret = String.valueOf(resp.getData());
                logger.debug("DeleteBackupJobPost resp: {}", ret);
            }
        } catch (Exception e) {
            logger.warn("Exception:", e);
            handleException(e);
        }

        return ret;
    }

    protected String createBackup() throws ClusterControlApiException {
        String ret = "";

        BackupSpec backupSpec = formBackupDetails(getJsonInput());

        try {
            ApiClient defaultClient = getAuthStrategy().getApiClient();
            JobsApi apiInstance = new JobsApi(defaultClient);
            Jobs jobs = new Jobs();
            setBackupCommon(jobs, backupSpec);

            JobsJob jj = new JobsJob();
            setBackupCommon(jj);

            JobsJobJobSpec jSpec = new JobsJobJobSpec();
            jSpec.setCommand(JobsJobJobSpec.CommandEnum.BACKUP);

            JobsJobJobSpecJobData jsjD = new JobsJobJobSpecJobData();
            setBackupCommon(jsjD, backupSpec);

            // TODO: need to implement
/*
 */
            jsjD.setBackupFailover(true);
            jsjD.setBackupFailoverHost(JobsJobJobSpecJobData.BackupFailoverHostEnum.AUTO);
            jsjD.setBackupMethod(JobsJobJobSpecJobData.BackupMethodEnum.fromValue(backupSpec.getBackupMethod()));
            jsjD.setBackupRetention(backupSpec.getBackupRetention());
            jsjD.setBackupDir("/root/backups");
            jsjD.setBackupsubdir("BACKUP-%I");
            jsjD.setCcStorage("0");
            jsjD.setCompression(true);
            jsjD.setCompressionLevel(16);
            jsjD.setHostname(backupSpec.getHostname());
            jsjD.setPort(backupSpec.getPort());
            jsjD.setUsePigz(false);
            jsjD.setUseQpress(false);

/*
            jsjD.setXtrabackupBackupLocks();
            jsjD.setXtrabackupLockDdlPerTable();
            jsjD.setXtrabackupParallellism();
*/

            jSpec.setJobData(jsjD);
            jj.setJobSpec(jSpec);
            jobs.setJob(jj);

            logger.debug("CreateBackupJobPost request: {}", jobs);
            if (!AbstractAuthenticationStrategy.IsDebugMode()) {
                ApiResponse<Void> resp = apiInstance.jobsPostWithHttpInfo(jobs);
                ret = String.valueOf(resp.getData());
                logger.debug("CreateBackupJobPost resp: {}", ret);
            }
        } catch (Exception e) {
            logger.warn("Exception:", e);
            handleException(e);
        }

        return ret;
    }

    protected String removeCluster() throws ClusterControlApiException {
        String ret = "";

        DbCluster createDetails = formDbClusterDetails(getJsonInput());

        try {
            ApiClient defaultClient = getAuthStrategy().getApiClient();
            JobsApi apiInstance = new JobsApi(defaultClient);
            Jobs jobs = new Jobs();
            jobs.setOperation(Jobs.OperationEnum.CREATEJOBINSTANCE);
            jobs.setClusterId(createDetails.getClusterId());

            JobsJob jj = new JobsJob();
            jj.setClassName("CmonJobInstance");

            JobsJobJobSpec jSpec = new JobsJobJobSpec();
            jSpec.setCommand(JobsJobJobSpec.CommandEnum.REMOVE_CLUSTER);

            JobsJobJobSpecJobData jsjD = new JobsJobJobSpecJobData();
            jsjD.setClusterid(createDetails.getClusterId());
            jsjD.setClusterName(createDetails.getClusterName());

            jSpec.setJobData(jsjD);
            jj.setJobSpec(jSpec);
            jobs.setJob(jj);

            logger.debug("RemoveClusterPost request: {}", jobs);
            if (!AbstractAuthenticationStrategy.IsDebugMode()) {
                ApiResponse<Void> resp = apiInstance.jobsPostWithHttpInfo(jobs);
                ret = String.valueOf(resp.getData());
                logger.debug("RemoveClusterPost resp: {}", ret);
            }
        } catch (Exception e) {
            logger.warn("Exception:", e);
            handleException(e);
        }

        return ret;
    }

    protected String createCluster() throws ClusterControlApiException {
        String ret = "";

        DbCluster createDetails = formDbClusterDetails(getJsonInput());

        try {
            ApiClient defaultClient = getAuthStrategy().getApiClient();
            JobsApi apiInstance = new JobsApi(defaultClient);
            Jobs jobs = new Jobs();
            jobs.setOperation(Jobs.OperationEnum.CREATEJOBINSTANCE);

            JobsJob jj = new JobsJob();
            jj.setClassName("CmonJobInstance");

            JobsJobJobSpec jSpec = new JobsJobJobSpec();
            jSpec.setCommand(JobsJobJobSpec.CommandEnum.CREATE_CLUSTER);

            JobsJobJobSpecJobData jsjD = new JobsJobJobSpecJobData();
            createCluster(jsjD, createDetails);

            setVendor(jsjD, createDetails);

            setDbVersion(jsjD, createDetails);

            setDataDir(jsjD, createDetails);

            setClusterType(jsjD, createDetails);

            setType(jsjD, createDetails);

            setDbUser(jsjD, createDetails);

            if (!setPort(jsjD, createDetails)) {
                setDefaultPort(jsjD);
            }

            setAdditionalFields(jsjD, createDetails);

            setSnapshotLocation(jsjD, createDetails);
            setSnapshotRepository(jsjD, createDetails);
            setSnapshotStorageHost(jsjD, createDetails);

            setTemplate(jsjD, createDetails);

            List<JobsJobJobSpecJobDataNodesInner> nodes = new LinkedList<>();
            setNodes(nodes, jsjD, createDetails);
            jsjD.setNodes(nodes);

            JobsJobJobSpecJobDataTopology jsjdT = new JobsJobJobSpecJobDataTopology();
            setTopology(jsjdT, jsjD, createDetails);
            jsjD.setTopology(jsjdT);

            setConfigServers(jsjD, createDetails);
            setMongosServers(jsjD, createDetails);
            setReplicasets(jsjD, createDetails);

            jSpec.setJobData(jsjD);
            jj.setJobSpec(jSpec);
            jobs.setJob(jj);

            logger.debug("CreateClusterPost request: {}", jobs);
            if (!AbstractAuthenticationStrategy.IsDebugMode()) {
                ApiResponse<Void> resp = apiInstance.jobsPostWithHttpInfo(jobs);
                ret = String.valueOf(resp.getData());
                logger.debug("CreateClusterPost resp: {}", ret);
            }
        } catch (Exception e) {
            logger.warn("Exception:", e);
            handleException(e);
        }

        return ret;
    }

//    protected void createCluster(Jobs jobs, DbCluster createDetails) {
//        jobs.setOperation(Jobs.OperationEnum.CREATEJOBINSTANCE);
//    }

//    protected void createCluster(JobsJob jj, DbCluster createDetails) {
//        jj.setClassName("CmonJobInstance");
//    }

//    protected void createCluster(JobsJobJobSpec jSpec, DbCluster createDetails) {
//        jSpec.setCommand(JobsJobJobSpec.CommandEnum.CREATE_CLUSTER);
//    }

    protected void setDbUser(JobsJobJobSpecJobData jsjD, DbCluster createDetails) {
        String dbUser = createDetails.getDbAdminUser();
        if (dbUser != null && dbUser.length() > 0) {
            jsjD.setDbUser(dbUser);
        } else {
            setDefaultDbUser(jsjD);
        }
    }

    protected void setDataDir(JobsJobJobSpecJobData jsjD, DbCluster createDetails) {
        String dataDir = createDetails.getDataDir();
        if (dataDir != null && dataDir.length() > 0) {
            jsjD.setDataDir(dataDir);
        } else {
            setDefaultDataDir(jsjD);
        }
    }

    protected void setType(JobsJobJobSpecJobData jsjD, DbCluster createDetails) {
    }

    protected void setClusterType(JobsJobJobSpecJobData jsjD, DbCluster createDetails)
            throws ClusterControlApiException {

    }

    protected void createCluster(JobsJobJobSpecJobData jsjD, DbCluster createDetails) throws ClusterControlApiException {
        jsjD.setClusterName(createDetails.getClusterName());

        String dbPass = createDetails.getDbAdminUserPw();
        if (dbPass != null && dbPass.length() > 0) {
            jsjD.setDbPassword(createDetails.getDbAdminUserPw());
        } else {
            throw new ClusterControlInputException("Database admin user's password is not specified.");
        }

        jsjD.setDisableFirewall(true);
        jsjD.setDisableSelinux(true);
        jsjD.setGenerateToken(true);
        jsjD.setInstallSoftware(true);

        jsjD.setSshKeyfile(createDetails.getSshKeyfile());
        jsjD.setSshPort(createDetails.getSshPort());
        jsjD.setSshUser(createDetails.getSshUser());
        jsjD.setSudoPassword(createDetails.getSudoPassword());
    }

    protected boolean setPort(JobsJobJobSpecJobData jsjD, DbCluster createDetails) throws ClusterControlApiException {
        String port = createDetails.getPort();
        if (port != null && port.length() > 0) {
            try {
                jsjD.setPort(Integer.valueOf(port));
                return (true);
            } catch (Exception e) {
                logger.warn("Exception parsing port(integer)", e);
                throw new ClusterControlInputException(e);
            }
        }
        return (false);
    }

    protected void setDefaultDbUser(JobsJobJobSpecJobData jsjD) {
    }

    protected void setDefaultPort(JobsJobJobSpecJobData jsjD) {
    }

    protected void setDefaultDataDir(JobsJobJobSpecJobData jsjD) {
    }

    protected void setAdditionalFields(JobsJobJobSpecJobData jsjD, DbCluster createDetails)
            throws ClusterControlApiException {
    }

    protected void setVendor(JobsJobJobSpecJobData jsjD, DbCluster createDetails) throws ClusterControlApiException {
        String vendor = createDetails.getDbVendor();
        if (vendor != null && vendor.length() > 0) {
            try {
                jsjD.setVendor(JobsJobJobSpecJobData.VendorEnum.fromValue(vendor));
                return;
            } catch (Exception e) {
                logger.warn("Exception in parsing vendor", e);
                throw new ClusterControlInputException(e);
            }
        } else {
            if (jsjD.getClusterType() == JobsJobJobSpecJobData.ClusterTypeEnum.POSTGRESQL_SINGLE) {
                jsjD.setVendor(JobsJobJobSpecJobData.VendorEnum.DEFAULT);
                return;
            }
        }
        throw new ClusterControlInputException("Unable to figure out vendor");
    }

    protected void setDbVersion(JobsJobJobSpecJobData jsjD, DbCluster createDetails) throws ClusterControlApiException {
        String dbVersion = createDetails.getDbVersion();
        if (dbVersion != null && dbVersion.length() > 0) {
            jsjD.setVersion(dbVersion);
        } else {
            throw new ClusterControlInputException("DB version not specified");
        }
    }

    protected void setTemplate(JobsJobJobSpecJobData jsjD, DbCluster createDetails) throws ClusterControlApiException {
        try {
            String template = DbConstants.Instance().getTemplate(jsjD.getClusterType(),
                    jsjD.getVendor(), createDetails.getDbVersion());
            if (template != null) {
                jsjD.setConfigTemplate(template);
            }
        } catch (Exception e) {
            logger.warn("Exception parsing port(integer)", e);
            throw new ClusterControlInputException(e);
        }
    }

    /**
     * "hosts" : [
     * {
     * "hostname" : "10.0.0.1",
     * "port" : "3306"
     * },
     * {
     * "hostname" : "10.0.0.2",
     * "port" : "3306"
     * }
     * ]
     *
     * @param nodes
     * @param jsjD
     * @param createDetails
     */
    protected void setNodes(List<JobsJobJobSpecJobDataNodesInner> nodes, JobsJobJobSpecJobData jsjD, DbCluster createDetails)
            throws ClusterControlApiException {
        try {
            for (Host h : createDetails.getHosts()) {
                JobsJobJobSpecJobDataNodesInner jsjdN = new JobsJobJobSpecJobDataNodesInner();
                jsjdN.setHostname(h.getHostname());
                jsjdN.setHostnameData(h.getHostname());
                String port = h.getPort();
                if (port != null && port.length() > 0) {
                    jsjdN.setPort(port);
                } else {
                    jsjdN.setPort(jsjD.getPort().toString());
                }
                nodes.add(jsjdN);
            }
        } catch (Exception e) {
            logger.warn("Exception: ", e);
            throw new ClusterControlInputException(e);
        }
    }

    /**
     * "master_slave_links":[
     * {"m1" : "m2"},
     * {"m1" : "m3"}
     * {"m2" : "m4"}
     * ]
     *
     * @param jsjdT
     * @param jsjD
     * @param createDetails
     * @throws ClusterControlApiException
     */
    protected void setTopology(JobsJobJobSpecJobDataTopology jsjdT, JobsJobJobSpecJobData jsjD, DbCluster createDetails) throws ClusterControlApiException {
        List<Map<String, String>> links = new ArrayList<>();
        try {
            for (Map<String, String> link : createDetails.getMasterSlaveLinks()) {
                links.add(link);
            }
            jsjdT.setMasterSlaveLinks(links);
        } catch (Exception e) {
            logger.warn("Exception ", e);
            throw new ClusterControlApiException(e);
        }
    }

    protected void setConfigServers(JobsJobJobSpecJobData jsjD, DbCluster createDetails) throws ClusterControlApiException {

    }

    protected void setMongosServers(JobsJobJobSpecJobData jsjD, DbCluster createDetails) throws ClusterControlApiException {

    }

    protected void setReplicasets(JobsJobJobSpecJobData jsjD, DbCluster createDetails) throws ClusterControlApiException {

    }

    protected void setSnapshotLocation(JobsJobJobSpecJobData jsjD, DbCluster createDetails) throws ClusterControlApiException {

    }

    protected void setSnapshotRepository(JobsJobJobSpecJobData jsjD, DbCluster createDetails) throws ClusterControlApiException {

    }

    protected void setSnapshotStorageHost(JobsJobJobSpecJobData jsjD, DbCluster createDetails) throws ClusterControlApiException {

    }

}
