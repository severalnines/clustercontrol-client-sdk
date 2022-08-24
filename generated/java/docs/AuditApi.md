# AuditApi

All URIs are relative to *https://cchost:9501/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**auditPost**](AuditApi.md#auditPost) | **POST** /audit | GetStatistics | GetAlarm | GetAlarms | IgnoreAlarm |


<a name="auditPost"></a>
# **auditPost**
> auditPost(audit)

GetStatistics | GetAlarm | GetAlarms | IgnoreAlarm

### Example
```java
// Import classes:
import org.openapitools.ccapi.client.ApiClient;
import org.openapitools.ccapi.client.ApiException;
import org.openapitools.ccapi.client.Configuration;
import org.openapitools.ccapi.client.models.*;
import org.openapitools.ccapi.client.api.AuditApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cchost:9501/v2");

    AuditApi apiInstance = new AuditApi(defaultClient);
    Audit audit = new Audit(); // Audit | Used to get the audit log entries
    try {
      apiInstance.auditPost(audit);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuditApi#auditPost");
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
| **audit** | [**Audit**](Audit.md)| Used to get the audit log entries | |

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

