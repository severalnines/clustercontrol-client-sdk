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

import com.severalnines.clustercontrol.api.abstraction.nonjob.AuthenticateWithClusterControl;
import com.severalnines.clustercontrol.api.abstraction.pojo.AuthenticateUser;
import org.openapitools.ccapi.client.ApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractAuthenticationStrategy implements AuthenticationStrategy {

    private static final Logger logger
            = LoggerFactory.getLogger(AbstractAuthenticationStrategy.class);

    static boolean isDebugMode = false;

    public static boolean IsDebugMode() {
        return isDebugMode;
    }
    public static void TurnOffDebug() {
        isDebugMode = false;
    }
    public static void TurnOnDebug() {
        isDebugMode = true;
    }

    private ApiClient apiClient;

    protected AbstractAuthenticationStrategy() {
        this.apiClient = new ApiClient();
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    @Override
    public void authenticateWithClusterControl() throws ClusterControlApiException {
        // TODO: how or where do we get the credentials and CC_URL from
        AuthenticateUser authU = new AuthenticateUser();
        authU.setCcUrl(System.getenv("CC_URL"));
        authU.setUsername(System.getenv("CC_API_USER"));
        authU.setPassword(System.getenv("CC_API_USER_PW"));

        String jsonStr;
        try {
            jsonStr = JsonSerializeDeserialize.objectToJson(authU);
        } catch (Exception e) {
            logger.warn("Exception: ", e);
            throw new ClusterControlInputException(e);
        }

        AuthenticateWithClusterControl.AuthenticateWithClusterControl(getApiClient(), jsonStr);
    }
}
