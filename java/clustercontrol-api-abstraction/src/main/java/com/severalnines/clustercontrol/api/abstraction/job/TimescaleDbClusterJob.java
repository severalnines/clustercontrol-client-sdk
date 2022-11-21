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
import com.severalnines.clustercontrol.api.abstraction.pojo.DbCluster;
import org.openapitools.ccapi.client.model.JobsJobJobSpec;
import org.openapitools.ccapi.client.model.JobsJobJobSpecJobData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TimescaleDbClusterJob extends AbstractPostgresqlClusterJob {

    private static final Logger logger = LoggerFactory.getLogger(TimescaleDbClusterJob.class);

    public TimescaleDbClusterJob(AbstractAuthenticationStrategy authStrategy, String jsonStr, JobsJobJobSpec.CommandEnum jobType) {
        super(authStrategy, jsonStr, jobType);
    }

    @Override
    protected void setTimescaleDbExtension(JobsJobJobSpecJobData jsjD, DbCluster createDetails) {
        jsjD.setInstallTimescaledb(true);
    }
}
