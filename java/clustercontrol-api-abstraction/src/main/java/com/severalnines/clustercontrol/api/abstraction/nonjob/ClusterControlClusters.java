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
import com.severalnines.clustercontrol.api.abstraction.pojo.DbCluster;
import org.openapitools.ccapi.client.ApiClient;
import org.openapitools.ccapi.client.ApiException;
import org.openapitools.ccapi.client.ApiResponse;
import org.openapitools.ccapi.client.api.ClustersApi;
import org.openapitools.ccapi.client.api.DiscoveryApi;
import org.openapitools.ccapi.client.model.Clusters;
import org.openapitools.ccapi.client.model.Discovery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClusterControlClusters extends AbstractClusterControlOperation {

    private static final Logger logger
            = LoggerFactory.getLogger(ClusterControlClusters.class);

    private Clusters.OperationEnum opType;

    protected Clusters.OperationEnum getOpType() {
        return opType;
    }

    public ClusterControlClusters(AbstractAuthenticationStrategy authStrategy, String jsonStr, Clusters.OperationEnum opType) {
        super(authStrategy, jsonStr);
        this.opType = opType;
    }

    @Override
    public String execute() throws ClusterControlApiException {
        switch (getOpType()) {
            case GETCLUSTERINFO:
                return getClusterInfo();
            default:
                logger.warn("Unsupported Op (enum:{})", getOpType());
                break;
        }
        return null;
    }

    protected String getClusterInfo() throws ClusterControlApiException {
        String ret = "";

        DbCluster createDetails = formDbClusterDetails(getJsonInput());

        try {
            ApiClient defaultClient = getAuthStrategy().getApiClient();
            ClustersApi clustersApi = new ClustersApi(defaultClient);
            Clusters clusters = new Clusters(); // Discovery | All things related to Clusters and cluster Hosts
            clusters.setOperation(Clusters.OperationEnum.GETCLUSTERINFO);
            clusters.setClusterId(createDetails.getClusterId());

            logger.debug("ClustersPost request: {}", clusters);
            if (!AbstractAuthenticationStrategy.IsDebugMode()) {
                ApiResponse<Void> resp = clustersApi.clustersPostWithHttpInfo(clusters);
                ret = String.valueOf(resp.getData());
                logger.debug("ClustersPost response: {}", ret);
            }
        } catch (ApiException e) {
            logger.warn("Exception:", e);
            handleException(e);
        }

        return ret;
    }

}
