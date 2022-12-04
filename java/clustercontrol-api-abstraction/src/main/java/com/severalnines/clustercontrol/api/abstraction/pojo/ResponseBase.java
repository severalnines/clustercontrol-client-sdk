package com.severalnines.clustercontrol.api.abstraction.pojo;

public class ResponseBase {
    public ResponseBase() {}

    private String controllerId;
    private String requestStatus;

    public String getControllerId() {
        return controllerId;
    }

    public void setControllerId(String controllerId) {
        this.controllerId = controllerId;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }
}
