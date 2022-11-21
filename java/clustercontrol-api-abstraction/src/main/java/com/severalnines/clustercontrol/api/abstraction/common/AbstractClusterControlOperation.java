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
package com.severalnines.clustercontrol.api.abstraction.common;

import com.severalnines.clustercontrol.api.abstraction.pojo.ClusterControlApiResponse;
import org.openapitools.ccapi.client.ApiException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractClusterControlOperation implements ClusterControlOperation {
    private static final Logger logger
            = LoggerFactory.getLogger(AbstractClusterControlOperation.class);

    protected AbstractClusterControlOperation(AbstractAuthenticationStrategy authStrategy, String jsonStr) {
        this.authStrategy = authStrategy;
        this.jsonInput = jsonStr;
    }

    AbstractAuthenticationStrategy authStrategy;

    public AbstractAuthenticationStrategy getAuthStrategy() {
        return authStrategy;
    }

    String jsonInput;

    public String getJsonInput() {
        return jsonInput;
    }

    public abstract String execute() throws ClusterControlApiException;

    protected void handleException(Exception e) throws ClusterControlApiException {
        if (e instanceof ApiException) {
            try {
                ApiException apiE = (ApiException) e;
                String content = apiE.getResponseBody();
                if (content != null && content.length() > 0) {
                    ClusterControlApiResponse respPojo = JsonSerializeDeserialize.jsonToObject(
                            apiE.getResponseBody(), ClusterControlApiResponse.class);
                    if (respPojo.isAuthRequired()) {
                        throw new ClusterControlAuthRequiredException(e);
                    }
                }
            } catch (Exception eInner) {
                logger.warn("Exception:", eInner);
                throw new ClusterControlApiException(eInner);
            }
        }
        throw new ClusterControlApiException(e);
    }
}
