# CloudApi

All URIs are relative to *https://cchost:9501/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cloudPost**](CloudApi.md#cloudPost) | **POST** /cloud | VerifyCredentials | ListCredentials | etc |


<a name="cloudPost"></a>
# **cloudPost**
> cloudPost(cloud)

VerifyCredentials | ListCredentials | etc

### Example
```java
// Import classes:
import org.openapitools.ccapi.client.ApiClient;
import org.openapitools.ccapi.client.ApiException;
import org.openapitools.ccapi.client.Configuration;
import org.openapitools.ccapi.client.models.*;
import org.openapitools.ccapi.client.api.CloudApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cchost:9501/v2");

    CloudApi apiInstance = new CloudApi(defaultClient);
    Cloud cloud = new Cloud(); // Cloud | calls to manage the cloud-credentials
    try {
      apiInstance.cloudPost(cloud);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudApi#cloudPost");
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
| **cloud** | [**Cloud**](Cloud.md)| calls to manage the cloud-credentials | |

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

