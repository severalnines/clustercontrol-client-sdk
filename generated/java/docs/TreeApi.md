# TreeApi

All URIs are relative to *https://&lt;cchost&gt;:9501/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**treePost**](TreeApi.md#treePost) | **POST** /tree | AddACL | RemoveAcl | etc |


<a name="treePost"></a>
# **treePost**
> treePost(tree)

AddACL | RemoveAcl | etc

### Example
```java
// Import classes:
import org.openapitools.ccapi.client.ApiClient;
import org.openapitools.ccapi.client.ApiException;
import org.openapitools.ccapi.client.Configuration;
import org.openapitools.ccapi.client.models.*;
import org.openapitools.ccapi.client.api.TreeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://<cchost>:9501/v2");

    TreeApi apiInstance = new TreeApi(defaultClient);
    Tree tree = new Tree(); // Tree | Manipulate ACLs for Groups and Users that are maintained by the Cmon controller
    try {
      apiInstance.treePost(tree);
    } catch (ApiException e) {
      System.err.println("Exception when calling TreeApi#treePost");
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
| **tree** | [**Tree**](Tree.md)| Manipulate ACLs for Groups and Users that are maintained by the Cmon controller | |

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

