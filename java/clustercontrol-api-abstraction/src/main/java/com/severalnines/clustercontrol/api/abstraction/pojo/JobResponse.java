package com.severalnines.clustercontrol.api.abstraction.pojo;

public class JobResponse extends ResponseBase {
    public JobResponse() {}

    private Job job;

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}
