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
import org.openapitools.ccapi.client.model.Clusters;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ClustersApi
 */
@Disabled
public class ClustersApiTest {

    private final ClustersApi api = new ClustersApi();

    /**
     * GetClusterInfo | Get/Set Config | etc
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void clustersPostTest() throws ApiException {
        Clusters clusters = null;
        api.clustersPost(clusters);
        // TODO: test validations
    }

}