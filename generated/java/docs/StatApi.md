# StatApi

All URIs are relative to *https://&lt;cchost&gt;:9501/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**statPost**](StatApi.md#statPost) | **POST** /stat | GetInfo | etc |


<a name="statPost"></a>
# **statPost**
> statPost(stat)

GetInfo | etc

### Example
```java
// Import classes:
import org.openapitools.ccapi.client.ApiClient;
import org.openapitools.ccapi.client.ApiException;
import org.openapitools.ccapi.client.Configuration;
import org.openapitools.ccapi.client.models.*;
import org.openapitools.ccapi.client.api.StatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://<cchost>:9501/v2");

    StatApi apiInstance = new StatApi(defaultClient);
    Stat stat = new Stat(); // Stat | Provides calls to access various statistical information about the cluster
    try {
      apiInstance.statPost(stat);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatApi#statPost");
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
| **stat** | [**Stat**](Stat.md)| Provides calls to access various statistical information about the cluster | |

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

