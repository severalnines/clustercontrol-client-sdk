# ConfigApi

All URIs are relative to *https://&lt;cchost&gt;:9501/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**configPost**](ConfigApi.md#configPost) | **POST** /config | GetConfig | xxx | xxx | etc |


<a name="configPost"></a>
# **configPost**
> configPost(config)

GetConfig | xxx | xxx | etc

### Example
```java
// Import classes:
import org.openapitools.ccapi.client.ApiClient;
import org.openapitools.ccapi.client.ApiException;
import org.openapitools.ccapi.client.Configuration;
import org.openapitools.ccapi.client.models.*;
import org.openapitools.ccapi.client.api.ConfigApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://<cchost>:9501/v2");

    ConfigApi apiInstance = new ConfigApi(defaultClient);
    Config config = new Config(); // Config | Provides access to various Cmon configuration files
    try {
      apiInstance.configPost(config);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigApi#configPost");
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
| **config** | [**Config**](Config.md)| Provides access to various Cmon configuration files | |

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

