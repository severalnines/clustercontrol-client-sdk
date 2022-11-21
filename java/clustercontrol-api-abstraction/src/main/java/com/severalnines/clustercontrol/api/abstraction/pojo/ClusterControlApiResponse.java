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
package com.severalnines.clustercontrol.api.abstraction.pojo;

public class ClusterControlApiResponse {
    String controllerId;
    String errorString;
    String requestProcessed;
    String requestStatus;

    public void setControllerId(String controllerId) {
        this.controllerId = controllerId;
    }

    public void setErrorString(String errorString) {
        this.errorString = errorString;
    }

    public void setRequestProcessed(String requestProcessed) {
        this.requestProcessed = requestProcessed;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    public String getControllerId() {
        return controllerId;
    }

    public String getErrorString() {
        return errorString;
    }

    public String getRequestProcessed() {
        return requestProcessed;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public boolean isRequestStatusOk() {
        if (requestStatus != null &&
                requestStatus.compareToIgnoreCase("ok") == 0) {
            return true;
        }
        return false;
    }

    public boolean isAuthRequired() {
        if (requestStatus != null &&
                requestStatus.compareToIgnoreCase("AuthRequired") == 0) {
            return true;
        }
        return false;
    }

}
