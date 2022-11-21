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

import com.severalnines.clustercontrol.api.abstraction.common.AbstractAuthenticationStrategy;
import com.severalnines.clustercontrol.api.abstraction.common.ClusterControlApiException;
import com.severalnines.clustercontrol.api.abstraction.common.ClusterControlInputException;
import com.severalnines.clustercontrol.api.abstraction.pojo.DbCluster;
import com.severalnines.clustercontrol.api.abstraction.pojo.Host;
import org.openapitools.ccapi.client.model.JobsJobJobSpecJobData;
import org.openapitools.ccapi.client.model.JobsJobJobSpecJobDataNodesInner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ElasticsearchClusterJob extends AbstractDbClusterJob {

    private static final Logger logger = LoggerFactory.getLogger(ElasticsearchClusterJob.class);

    public ElasticsearchClusterJob(AbstractAuthenticationStrategy authStrategy, String jsonStr, DbClusterJobTypeEnum jobType) {
        super(authStrategy, jsonStr, jobType);
    }

    @Override
    protected void setVendor(JobsJobJobSpecJobData jsjD, DbCluster createDetails) throws ClusterControlApiException {
        jsjD.setVendor(JobsJobJobSpecJobData.VendorEnum.fromValue("elasticsearch"));
    }

    @Override
    protected void setType(JobsJobJobSpecJobData jsjD, DbCluster createDetails) {
        jsjD.setType(JobsJobJobSpecJobData.TypeEnum.ELASTICSEARCH);
    }

    @Override
    protected void setDefaultPort(JobsJobJobSpecJobData jsjD) {
        jsjD.setPort(1433);
    }

    @Override
    protected void setDefaultDbUser(JobsJobJobSpecJobData jsjD) {
        jsjD.setDbUser("admin");
    }

    @Override
    protected void setDefaultDataDir(JobsJobJobSpecJobData jsjD) {
    }

    @Override
    protected void setClusterType(JobsJobJobSpecJobData jsjD, DbCluster createDetails) throws ClusterControlApiException {
        String clusterType = createDetails.getClusterType();
        if (clusterType != null && clusterType.length() > 0 &&
                clusterType.compareToIgnoreCase("elastic") == 0) {
            jsjD.setClusterType(JobsJobJobSpecJobData.ClusterTypeEnum.fromValue(clusterType));
        } else {
            throw new ClusterControlInputException("Unsupported or unspecified cluster_type. Valid values are galera and replication");
        }
    }

    @Override
    protected void setTemplate(JobsJobJobSpecJobData jsjD, DbCluster createDetails) throws ClusterControlApiException {
        // don't need to set it for Redis
    }

    @Override
    protected void setNodes(List<JobsJobJobSpecJobDataNodesInner> nodes, JobsJobJobSpecJobData jsjD, DbCluster createDetails)
            throws ClusterControlApiException {
        try {
            for (Host h : createDetails.getHosts()) {
                JobsJobJobSpecJobDataNodesInner sqls = new JobsJobJobSpecJobDataNodesInner();
                sqls.setClassName(JobsJobJobSpecJobDataNodesInner.ClassNameEnum.CMONMSSQLHOST);
                sqls.setHostname(h.getHostname());
                sqls.setHostnameData(h.getHostname());
                sqls.setProtocol(JobsJobJobSpecJobDataNodesInner.ProtocolEnum.ELASTIC);
                sqls.setRoles(JobsJobJobSpecJobDataNodesInner.RolesEnum.fromValue(h.getRoles()));
                nodes.add(sqls);
            }
        } catch (Exception e) {
            logger.warn("Exception: ", e);
            throw new ClusterControlInputException(e);
        }
    }

    @Override
    protected void setSnapshotLocation(JobsJobJobSpecJobData jsjD, DbCluster createDetails) throws ClusterControlApiException {
        String sl = createDetails.getSnapshotLocaiton();
        if (sl != null && sl.length() > 0) {
            jsjD.setSnapshotLocaiton(sl);
        } else {
            jsjD.setSnapshotLocaiton("/home/root/backups/es-snapshot-repositories");
        }
    }

    @Override
    protected void setSnapshotRepository(JobsJobJobSpecJobData jsjD, DbCluster createDetails) throws ClusterControlApiException {
        String sr = createDetails.getSnapshotRepository();
        if (sr != null && sr.length() > 0) {
            jsjD.setSnapshotRepository(sr);
        } else {
            jsjD.setSnapshotRepository("cc_snapshots");
        }
    }

    @Override
    protected void setSnapshotStorageHost(JobsJobJobSpecJobData jsjD, DbCluster createDetails) throws ClusterControlApiException {
        jsjD.setStorageHost(createDetails.getStorageHost());
    }

}
