# MaintenanceApi

All URIs are relative to *https://cchost:9501/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**maintenancePost**](MaintenanceApi.md#maintenancePost) | **POST** /maintenance | CreateJobInstance | etc |


<a name="maintenancePost"></a>
# **maintenancePost**
> maintenancePost(maintenance)

CreateJobInstance | etc

### Example
```java
// Import classes:
import org.openapitools.ccapi.client.ApiClient;
import org.openapitools.ccapi.client.ApiException;
import org.openapitools.ccapi.client.Configuration;
import org.openapitools.ccapi.client.models.*;
import org.openapitools.ccapi.client.api.MaintenanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cchost:9501/v2");

    MaintenanceApi apiInstance = new MaintenanceApi(defaultClient);
    Maintenance maintenance = new Maintenance(); // Maintenance | Creating, deleting and obtaining maintenance periods
    try {
      apiInstance.maintenancePost(maintenance);
    } catch (ApiException e) {
      System.err.println("Exception when calling MaintenanceApi#maintenancePost");
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
| **maintenance** | [**Maintenance**](Maintenance.md)| Creating, deleting and obtaining maintenance periods | |

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

