package com.severalnines.clustercontrol.api.abstraction.job;

import com.severalnines.clustercontrol.api.abstraction.common.AbstractAuthenticationStrategy;
import com.severalnines.clustercontrol.api.abstraction.common.ClusterControlApiException;
import com.severalnines.clustercontrol.api.abstraction.pojo.DbCluster;
import org.openapitools.ccapi.client.model.JobsJobJobSpec;
import org.openapitools.ccapi.client.model.JobsJobJobSpecJobData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RemoveClusterJob extends AbstractDbClusterJob {
    private static final Logger logger = LoggerFactory.getLogger(RemoveClusterJob.class);

    public RemoveClusterJob(AbstractAuthenticationStrategy authStrategy, String jsonStr, JobsJobJobSpec.CommandEnum jobType) {
        super(authStrategy, jsonStr, jobType);
    }

    @Override
    protected void setClusterType(JobsJobJobSpecJobData jsjD, DbCluster createDetails) throws ClusterControlApiException {
    }

}
