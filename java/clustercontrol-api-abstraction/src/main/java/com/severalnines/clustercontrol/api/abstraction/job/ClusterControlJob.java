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
import com.severalnines.clustercontrol.api.abstraction.pojo.Job;
import org.openapitools.ccapi.client.ApiClient;
import org.openapitools.ccapi.client.ApiResponse;
import org.openapitools.ccapi.client.api.JobsApi;
import org.openapitools.ccapi.client.model.Jobs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClusterControlJob extends AbstractClusterControlOperation {
    private static final Logger logger = LoggerFactory.getLogger(ClusterControlJob.class);

    public ClusterControlJob(AbstractAuthenticationStrategy authStrategy, String jsonStr) {
        super(authStrategy, jsonStr);
    }
    @Override
    public String execute() throws ClusterControlApiException {
        String ret = "";

        Job job;
        try {
            job = JsonSerializeDeserialize.jsonToObject(getJsonInput(), Job.class);
        } catch (Exception e) {
            logger.warn("Exception: ", e);
            throw new ClusterControlInputException(e);
        }

        try {
            ApiClient defaultClient = getAuthStrategy().getApiClient();
            JobsApi apiInstance = new JobsApi(defaultClient);
            Jobs jobs = new Jobs();
            jobs.setOperation(Jobs.OperationEnum.GETJOBINSTANCE);
            jobs.setJobId(job.getJobId());
            logger.debug("GetJobPost request: {}", jobs);
            if (!AbstractAuthenticationStrategy.IsDebugMode()) {
                ApiResponse<Void> resp = apiInstance.jobsPostWithHttpInfo(jobs);
                ret = String.valueOf(resp.getData());
                logger.debug("GetJobPost resp: {}", ret);
            }
        } catch (Exception e) {
            logger.warn("Exception:", e);
            handleException(e);
        }

        return ret;
    }

}
