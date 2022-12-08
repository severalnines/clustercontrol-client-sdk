/*
 * Severalnines ClusterControl REST API (V2)
 * REST API (V2) specification for ClusterControl - AI Powered Database automation tool for multi/hybrid cloud database deployment.
 *
 * The version of the OpenAPI document: OpenAPI specification v1.0.0
 * Contact: sales@severalnines.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.ccapi.client.api;

import org.openapitools.ccapi.client.ApiException;
import org.openapitools.ccapi.client.model.Backup;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BackupApi
 */
@Disabled
public class BackupApiTest {

    private final BackupApi api = new BackupApi();

    /**
     * GetBackups | GetBackupSchedules | ScheduleBackup | DeleteBackupRecord
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void backupPostTest() throws ApiException {
        Backup backup = null;
        api.backupPost(backup);
        // TODO: test validations
    }

}
