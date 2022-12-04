package com.severalnines.clustercontrol.api.abstraction.pojo;

public class Cluster {
    public Cluster() {}

    public int getClusterId() {
        return clusterId;
    }

    public void setClusterId(int clusterId) {
        this.clusterId = clusterId;
    }

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    private Integer clusterId;
    private String clusterName;
}
