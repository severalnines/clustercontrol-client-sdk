# ClustersApi

All URIs are relative to *https://&lt;cchost&gt;:9501/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**clustersPost**](ClustersApi.md#clustersPost) | **POST** /clusters | GetClusterInfo | Get/Set Config | etc |


<a name="clustersPost"></a>
# **clustersPost**
> clustersPost(clusters)

GetClusterInfo | Get/Set Config | etc

### Example
```java
// Import classes:
import org.openapitools.ccapi.client.ApiClient;
import org.openapitools.ccapi.client.ApiException;
import org.openapitools.ccapi.client.Configuration;
import org.openapitools.ccapi.client.models.*;
import org.openapitools.ccapi.client.api.ClustersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://<cchost>:9501/v2");

    ClustersApi apiInstance = new ClustersApi(defaultClient);
    Clusters clusters = new Clusters(); // Clusters | Get cluster information
    try {
      apiInstance.clustersPost(clusters);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClustersApi#clustersPost");
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
| **clusters** | [**Clusters**](Clusters.md)| Get cluster information | |

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

