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
package com.severalnines.clustercontrol.api.abstraction.nonjob;

import com.severalnines.clustercontrol.api.abstraction.common.AbstractAuthenticationStrategy;
import com.severalnines.clustercontrol.api.abstraction.common.AbstractClusterControlOperation;
import com.severalnines.clustercontrol.api.abstraction.common.ClusterControlApiException;
import org.openapitools.ccapi.client.ApiClient;
import org.openapitools.ccapi.client.ApiException;
import org.openapitools.ccapi.client.ApiResponse;
import org.openapitools.ccapi.client.api.DiscoveryApi;
import org.openapitools.ccapi.client.model.Discovery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClusterDiscovery extends AbstractClusterControlOperation {

    private static final Logger logger
            = LoggerFactory.getLogger(ClusterDiscovery.class);

    private Discovery.OperationEnum opType;

    protected Discovery.OperationEnum getOpType() {
        return opType;
    }

    public ClusterDiscovery(AbstractAuthenticationStrategy authStrategy, String jsonStr, Discovery.OperationEnum opType) {
        super(authStrategy, jsonStr);
        this.opType = opType;
    }

    @Override
    public String execute() throws ClusterControlApiException {
        switch (getOpType()) {
            case GETSUPPORTEDCLUSTERTYPES:
                return getSupportedClusterTypes();
            default:
                logger.warn("Unsupported Op (enum:{})", getOpType());
                break;
        }
        return null;
    }

    protected String getSupportedClusterTypes() throws ClusterControlApiException {
        String ret = null;

        try {
            ApiClient defaultClient = getAuthStrategy().getApiClient();
            DiscoveryApi discovApiInstance = new DiscoveryApi(defaultClient);
            Discovery discovery = new Discovery(); // Discovery | All things related to Clusters and cluster Hosts
            discovery.setOperation(Discovery.OperationEnum.GETSUPPORTEDCLUSTERTYPES);

            logger.debug("Discovery request: {}", discovery);
            if (!AbstractAuthenticationStrategy.IsDebugMode()) {
                ApiResponse<Void> resp = discovApiInstance.discoveryPostWithHttpInfo(discovery);
                ret = String.valueOf(resp.getData());
                logger.debug("Discovery response: {}", ret);
            }
        } catch (ApiException e) {
            logger.warn("Exception:", e);
            handleException(e);
        }

        return ret;
    }

}
