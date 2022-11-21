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
import com.severalnines.clustercontrol.api.abstraction.pojo.DbCluster;
import org.openapitools.ccapi.client.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MysqlMariaClusterJob extends AbstractDbClusterJob {

    private static final Logger logger = LoggerFactory.getLogger(MysqlMariaClusterJob.class);

    public MysqlMariaClusterJob(AbstractAuthenticationStrategy authStrategy, String jsonStr, DbClusterJobTypeEnum jobType) {
        super(authStrategy, jsonStr, jobType);
    }

    @Override
    protected void setDefaultDbUser(JobsJobJobSpecJobData jsjD) {
        jsjD.setDbUser("root");
    }

    @Override
    protected void setDefaultPort(JobsJobJobSpecJobData jsjD) {
        jsjD.setPort(3306);
    }

    @Override
    protected void setDefaultDataDir(JobsJobJobSpecJobData jsjD) {
        jsjD.setDataDir("/var/lib/mysql");
    }

    @Override
    protected void setClusterType(JobsJobJobSpecJobData jsjD, DbCluster createDetails) throws ClusterControlApiException {
        String clusterType = createDetails.getClusterType();
        if (clusterType != null && clusterType.length() > 0 &&
                (clusterType.compareToIgnoreCase("replication") == 0 ||
                        clusterType.compareToIgnoreCase("galera") == 0)) {
            jsjD.setClusterType(JobsJobJobSpecJobData.ClusterTypeEnum.fromValue(clusterType));
        } else {
            throw new ClusterControlInputException("Unsupported or unspecified cluster_type. Valid values are galera and replication");
        }
    }

}
