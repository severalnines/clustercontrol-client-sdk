package com.severalnines.clustercontrol.api.abstraction.pojo;

public class ClusterResponse extends ResponseBase {
    public ClusterResponse() {}

    private Cluster cluster;

    public Cluster getCluster() {
        return cluster;
    }

    public void setCluster(Cluster cluster) {
        this.cluster = cluster;
    }
}
