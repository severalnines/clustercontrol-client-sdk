# UsersApi

All URIs are relative to *https://cchost:9501/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**usersPost**](UsersApi.md#usersPost) | **POST** /users | CreateUser | etc |


<a name="usersPost"></a>
# **usersPost**
> usersPost(users)

CreateUser | etc

### Example
```java
// Import classes:
import org.openapitools.ccapi.client.ApiClient;
import org.openapitools.ccapi.client.ApiException;
import org.openapitools.ccapi.client.Configuration;
import org.openapitools.ccapi.client.models.*;
import org.openapitools.ccapi.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cchost:9501/v2");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Users users = new Users(); // Users | Manipulate Cmon Users, users that are maintained by the Cmon controller
    try {
      apiInstance.usersPost(users);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersPost");
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
| **users** | [**Users**](Users.md)| Manipulate Cmon Users, users that are maintained by the Cmon controller | |

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

