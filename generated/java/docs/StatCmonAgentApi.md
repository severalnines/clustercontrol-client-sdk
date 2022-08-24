# StatCmonAgentApi

All URIs are relative to *https://cchost:9501/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**statCmonagentPost**](StatCmonAgentApi.md#statCmonagentPost) | **POST** /stat/cmonagent | GetInfo | etc |


<a name="statCmonagentPost"></a>
# **statCmonagentPost**
> statCmonagentPost(statCmonAgent)

GetInfo | etc

### Example
```java
// Import classes:
import org.openapitools.ccapi.client.ApiClient;
import org.openapitools.ccapi.client.ApiException;
import org.openapitools.ccapi.client.Configuration;
import org.openapitools.ccapi.client.models.*;
import org.openapitools.ccapi.client.api.StatCmonAgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cchost:9501/v2");

    StatCmonAgentApi apiInstance = new StatCmonAgentApi(defaultClient);
    StatCmonAgent statCmonAgent = new StatCmonAgent(); // StatCmonAgent | Provides calls to access various statistical information about the cluster
    try {
      apiInstance.statCmonagentPost(statCmonAgent);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatCmonAgentApi#statCmonagentPost");
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
| **statCmonAgent** | [**StatCmonAgent**](StatCmonAgent.md)| Provides calls to access various statistical information about the cluster | |

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

