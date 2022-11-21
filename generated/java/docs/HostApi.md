# HostApi

All URIs are relative to *https://&lt;cchost&gt;:9501/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**hostPost**](HostApi.md#hostPost) | **POST** /host | Path for managing servers |


<a name="hostPost"></a>
# **hostPost**
> hostPost(host)

Path for managing servers

### Example
```java
// Import classes:
import org.openapitools.ccapi.client.ApiClient;
import org.openapitools.ccapi.client.ApiException;
import org.openapitools.ccapi.client.Configuration;
import org.openapitools.ccapi.client.models.*;
import org.openapitools.ccapi.client.api.HostApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://<cchost>:9501/v2");

    HostApi apiInstance = new HostApi(defaultClient);
    Host host = new Host(); // Host | (Un)Register servers, Shutdown servers, etc
    try {
      apiInstance.hostPost(host);
    } catch (ApiException e) {
      System.err.println("Exception when calling HostApi#hostPost");
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
| **host** | [**Host**](Host.md)| (Un)Register servers, Shutdown servers, etc | |

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

