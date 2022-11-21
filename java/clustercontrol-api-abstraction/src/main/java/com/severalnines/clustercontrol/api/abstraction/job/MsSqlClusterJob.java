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
import org.openapitools.ccapi.client.model.JobsJobJobSpec;
import org.openapitools.ccapi.client.model.JobsJobJobSpecJobData;
import org.openapitools.ccapi.client.model.JobsJobJobSpecJobDataNodesInner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class MsSqlClusterJob extends AbstractDbClusterJob {

    private static final Logger logger = LoggerFactory.getLogger(MsSqlClusterJob.class);

    public MsSqlClusterJob(AbstractAuthenticationStrategy authStrategy, String jsonStr, JobsJobJobSpec.CommandEnum jobType) {
        super(authStrategy, jsonStr, jobType);
    }

    @Override
    protected void setVendor(JobsJobJobSpecJobData jsjD, DbCluster createDetails) throws ClusterControlApiException {
        jsjD.setVendor(JobsJobJobSpecJobData.VendorEnum.fromValue("microsoft"));
    }

    @Override
    protected void setType(JobsJobJobSpecJobData jsjD, DbCluster createDetails) {
        jsjD.setType(JobsJobJobSpecJobData.TypeEnum.MICROSOFT);
    }

    @Override
    protected void setDefaultPort(JobsJobJobSpecJobData jsjD) {
        jsjD.setPort(1433);
    }

    @Override
    protected void setDefaultDbUser(JobsJobJobSpecJobData jsjD) {
        jsjD.setDbUser("SQLServerAdmin");
    }

    @Override
    protected void setDefaultDataDir(JobsJobJobSpecJobData jsjD) {
        jsjD.setDataDir("/var/opt/mssql/data");
    }

    @Override
    protected void setClusterType(JobsJobJobSpecJobData jsjD, DbCluster createDetails) throws ClusterControlApiException {
        String clusterType = createDetails.getClusterType();
        if (clusterType != null && clusterType.length() > 0 &&
                clusterType.compareToIgnoreCase("mssql_ao_async") == 0) {
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
                sqls.setPort(jsjD.getPort().toString());
                sqls.setConfigfile("/var/opt/mssql/mssql.conf");
                nodes.add(sqls);
            }
        } catch (Exception e) {
            logger.warn("Exception: ", e);
            throw new ClusterControlInputException(e);
        }
    }

}
