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
import org.openapitools.ccapi.client.model.Jobs;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for JobsApi
 */
@Disabled
public class JobsApiTest {

    private final JobsApi api = new JobsApi();

    /**
     * CreateJobInstance | etc
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void jobsPostTest() throws ApiException {
        Jobs jobs = null;
        api.jobsPost(jobs);
        // TODO: test validations
    }

}
