# StatPrometheusApi

All URIs are relative to *https://cchost:9501/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**statPrometheusQueryPost**](StatPrometheusApi.md#statPrometheusQueryPost) | **POST** /stat/prometheus/query | GetInfo | etc |


<a name="statPrometheusQueryPost"></a>
# **statPrometheusQueryPost**
> statPrometheusQueryPost(statPrometheus)

GetInfo | etc

### Example
```java
// Import classes:
import org.openapitools.ccapi.client.ApiClient;
import org.openapitools.ccapi.client.ApiException;
import org.openapitools.ccapi.client.Configuration;
import org.openapitools.ccapi.client.models.*;
import org.openapitools.ccapi.client.api.StatPrometheusApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cchost:9501/v2");

    StatPrometheusApi apiInstance = new StatPrometheusApi(defaultClient);
    StatPrometheus statPrometheus = new StatPrometheus(); // StatPrometheus | Provides calls to access various statistical information about the cluster
    try {
      apiInstance.statPrometheusQueryPost(statPrometheus);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatPrometheusApi#statPrometheusQueryPost");
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
| **statPrometheus** | [**StatPrometheus**](StatPrometheus.md)| Provides calls to access various statistical information about the cluster | |

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

