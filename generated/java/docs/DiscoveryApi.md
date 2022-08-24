# DiscoveryApi

All URIs are relative to *https://cchost:9501/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**discoveryPost**](DiscoveryApi.md#discoveryPost) | **POST** /discovery | CheckClusterName | CheckHosts | GetSupportedClusterTypes |


<a name="discoveryPost"></a>
# **discoveryPost**
> discoveryPost(discovery)

CheckClusterName | CheckHosts | GetSupportedClusterTypes

### Example
```java
// Import classes:
import org.openapitools.ccapi.client.ApiClient;
import org.openapitools.ccapi.client.ApiException;
import org.openapitools.ccapi.client.Configuration;
import org.openapitools.ccapi.client.models.*;
import org.openapitools.ccapi.client.api.DiscoveryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cchost:9501/v2");

    DiscoveryApi apiInstance = new DiscoveryApi(defaultClient);
    Discovery discovery = new Discovery(); // Discovery | All things related to Clusters and cluster Hosts
    try {
      apiInstance.discoveryPost(discovery);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscoveryApi#discoveryPost");
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
| **discovery** | [**Discovery**](Discovery.md)| All things related to Clusters and cluster Hosts | |

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

