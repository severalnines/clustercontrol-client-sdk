/*
 * Severalnines ClusterControl
 * This is a ...
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: sales@severalnines.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.ccapi.client.api;

import org.openapitools.ccapi.client.ApiException;
import org.openapitools.ccapi.client.model.Authenticate;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthApi
 */
@Disabled
public class AuthApiTest {

    private final AuthApi api = new AuthApi();

    /**
     * Authenticate | Logout | Password Reset | Authenticate response (with challenge)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authPostTest() throws ApiException {
        Authenticate authenticate = null;
        api.authPost(authenticate);
        // TODO: test validations
    }

}
