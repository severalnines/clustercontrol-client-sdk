# ControllerApi

All URIs are relative to *https://cchost:9501/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**controllerPost**](ControllerApi.md#controllerPost) | **POST** /controller | Ping | Heartbeat | etc |


<a name="controllerPost"></a>
# **controllerPost**
> controllerPost(controller)

Ping | Heartbeat | etc

### Example
```java
// Import classes:
import org.openapitools.ccapi.client.ApiClient;
import org.openapitools.ccapi.client.ApiException;
import org.openapitools.ccapi.client.Configuration;
import org.openapitools.ccapi.client.models.*;
import org.openapitools.ccapi.client.api.ControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cchost:9501/v2");

    ControllerApi apiInstance = new ControllerApi(defaultClient);
    Controller controller = new Controller(); // Controller | Managing controller and operate the Cmon HA subsystem
    try {
      apiInstance.controllerPost(controller);
    } catch (ApiException e) {
      System.err.println("Exception when calling ControllerApi#controllerPost");
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
| **controller** | [**Controller**](Controller.md)| Managing controller and operate the Cmon HA subsystem | |

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

