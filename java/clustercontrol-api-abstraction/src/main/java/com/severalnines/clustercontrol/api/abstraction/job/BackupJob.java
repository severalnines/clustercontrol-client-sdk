package com.severalnines.clustercontrol.api.abstraction.job;

import com.severalnines.clustercontrol.api.abstraction.common.AbstractAuthenticationStrategy;
import org.openapitools.ccapi.client.model.JobsJobJobSpec;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BackupJob extends AbstractDbClusterJob {

    private static final Logger logger = LoggerFactory.getLogger(BackupJob.class);

    public BackupJob(AbstractAuthenticationStrategy authStrategy, String jsonStr, JobsJobJobSpec.CommandEnum jobType) {
        super(authStrategy, jsonStr, jobType);
    }
}
