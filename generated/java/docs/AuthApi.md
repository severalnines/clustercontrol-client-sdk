# AuthApi

All URIs are relative to *https://&lt;cchost&gt;:9501/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authPost**](AuthApi.md#authPost) | **POST** /auth | Authenticate | Logout | Password Reset | Authenticate response (with challenge) |


<a name="authPost"></a>
# **authPost**
> authPost(authenticate)

Authenticate | Logout | Password Reset | Authenticate response (with challenge)

### Example
```java
// Import classes:
import org.openapitools.ccapi.client.ApiClient;
import org.openapitools.ccapi.client.ApiException;
import org.openapitools.ccapi.client.Configuration;
import org.openapitools.ccapi.client.models.*;
import org.openapitools.ccapi.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://<cchost>:9501/v2");

    AuthApi apiInstance = new AuthApi(defaultClient);
    Authenticate authenticate = new Authenticate(); // Authenticate | Authentication parameters
    try {
      apiInstance.authPost(authenticate);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#authPost");
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
| **authenticate** | [**Authenticate**](Authenticate.md)| Authentication parameters | |

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
| **200** | Successful authentication |  -  |
| **405** | Invalid input |  -  |

