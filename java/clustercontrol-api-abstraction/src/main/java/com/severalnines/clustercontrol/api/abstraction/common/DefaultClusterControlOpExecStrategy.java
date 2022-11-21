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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DefaultClusterControlOpExecStrategy extends AbstractClusterControlOpExecStrategy {

    private static final Logger logger
            = LoggerFactory.getLogger(DefaultClusterControlOpExecStrategy.class);

    private ClusterControlOperation ccOp;

    public ClusterControlOperation getCcOp() {
        return ccOp;
    }

    private AbstractAuthenticationStrategy authStrategy;

    protected AbstractAuthenticationStrategy getAuthStrategy() {
        return authStrategy;
    }

    public DefaultClusterControlOpExecStrategy(AbstractAuthenticationStrategy authStrategy, ClusterControlOperation op) {
        this.authStrategy = authStrategy;
        this.ccOp = op;
    }

    public String executeOp() throws ClusterControlApiException {
        String opRet = "";

        int numReties = 5;
        boolean isSuccess = false;
        while (numReties > 0 && !isSuccess) {
            try {
                opRet = getCcOp().execute();
                logger.debug(opRet);
                isSuccess = true;
            } catch (ClusterControlApiException e) {
                if (e instanceof ClusterControlAuthRequiredException) {
                    getAuthStrategy().authenticateWithClusterControl();
                    --numReties;
                } else {
                    throw new ClusterControlApiException(e);
                }
            }
        }

        return opRet;
    }
}
