# BackupApi

All URIs are relative to *https://cchost:9501/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**backupPost**](BackupApi.md#backupPost) | **POST** /backup | GetBackups | GetBackupSchedules | ScheduleBackup | DeleteBackupRecord |


<a name="backupPost"></a>
# **backupPost**
> backupPost(backup)

GetBackups | GetBackupSchedules | ScheduleBackup | DeleteBackupRecord

### Example
```java
// Import classes:
import org.openapitools.ccapi.client.ApiClient;
import org.openapitools.ccapi.client.ApiException;
import org.openapitools.ccapi.client.Configuration;
import org.openapitools.ccapi.client.models.*;
import org.openapitools.ccapi.client.api.BackupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cchost:9501/v2");

    BackupApi apiInstance = new BackupApi(defaultClient);
    Backup backup = new Backup(); // Backup | All things related to Backups
    try {
      apiInstance.backupPost(backup);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackupApi#backupPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **backup** | [**Backup**](Backup.md)| All things related to Backups | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **405** | Unauthorized |  -  |

