# JobsApi

All URIs are relative to *https://cchost:9501/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**jobsPost**](JobsApi.md#jobsPost) | **POST** /jobs | CreateJobInstance | etc |


<a name="jobsPost"></a>
# **jobsPost**
> jobsPost(jobs)

CreateJobInstance | etc

### Example
```java
// Import classes:
import org.openapitools.ccapi.client.ApiClient;
import org.openapitools.ccapi.client.ApiException;
import org.openapitools.ccapi.client.Configuration;
import org.openapitools.ccapi.client.models.*;
import org.openapitools.ccapi.client.api.JobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cchost:9501/v2");

    JobsApi apiInstance = new JobsApi(defaultClient);
    Jobs jobs = new Jobs(); // Jobs | Creating, manipulating, and obtaining information about jobs
    try {
      apiInstance.jobsPost(jobs);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#jobsPost");
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
| **jobs** | [**Jobs**](Jobs.md)| Creating, manipulating, and obtaining information about jobs | |

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

