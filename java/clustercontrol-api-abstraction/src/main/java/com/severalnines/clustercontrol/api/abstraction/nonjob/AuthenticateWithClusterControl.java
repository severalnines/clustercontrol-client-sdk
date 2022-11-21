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

import com.severalnines.clustercontrol.api.abstraction.common.*;
import com.severalnines.clustercontrol.api.abstraction.pojo.AuthenticateUser;
import com.severalnines.clustercontrol.api.abstraction.pojo.ClusterControlApiResponse;
import org.openapitools.ccapi.client.ApiClient;
import org.openapitools.ccapi.client.ApiException;
import org.openapitools.ccapi.client.ApiResponse;
import org.openapitools.ccapi.client.api.AuthApi;
import org.openapitools.ccapi.client.model.Authenticate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AuthenticateWithClusterControl extends AbstractClusterControlOperation {
    private static final Logger logger
            = LoggerFactory.getLogger(AuthenticateWithClusterControl.class);

    public AuthenticateWithClusterControl(AbstractAuthenticationStrategy authStrategy, String jsonStr) {
        super(authStrategy, jsonStr);
    }

    @Override
    public String execute() throws ClusterControlApiException {
        authenticateWithClusterControl();
        return "";
    }

    protected void authenticateWithClusterControl() throws ClusterControlApiException {
        AuthenticateWithClusterControl(getAuthStrategy().getApiClient(), getJsonInput());
    }

    static public void AuthenticateWithClusterControl(ApiClient apiClient, String jsonStr)
            throws ClusterControlApiException {

        AuthenticateUser authUser;
        try {
            authUser = JsonSerializeDeserialize.jsonToObject(jsonStr, AuthenticateUser.class);
        } catch (Exception e) {
            logger.warn("Exception in jsonToObject(): ", e);
            throw new ClusterControlApiException(e);
        }

        apiClient.setBasePath(authUser.getCcUrl());
        logger.info("CC_URL: {}", authUser.getCcUrl());
        apiClient.setVerifyingSsl(false);

        AuthApi authApiInstance = new AuthApi(apiClient);
        Authenticate authenticate = new Authenticate(); // Authenticate | Authentication parameters
        authenticate.operation(Authenticate.OperationEnum.AUTHENTICATEWITHPASSWORD);
        authenticate.userName(authUser.getUsername());
        authenticate.password(authUser.getPassword());
        try {
            logger.trace("Auth request: {}", authenticate);
            ApiResponse<Void> resp = authApiInstance.authPostWithHttpInfo(authenticate);
            logger.debug("Auth response: {}", resp.getData());
            String respS = String.valueOf(resp.getData());
            try {
                ClusterControlApiResponse ccRespO = JsonSerializeDeserialize.jsonToObject(
                        respS, ClusterControlApiResponse.class);
                // ret = ccRespO.isRequestStatusOk();
                if (!ccRespO.isRequestStatusOk()) {
                    throw new ClusterControlApiException("AccessDenied: username and/or password incorrect");
                }
            } catch (Exception e) {
                logger.warn("Exception: ", e);
                throw new ClusterControlApiException(e);
            }
        } catch (ApiException e) {
            logger.warn("Exception in AuthenticatePost:", e);
            throw new ClusterControlApiException(e);
        }

    }
}
