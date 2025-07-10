# SeveralninesClusterControlRestApiV2.AuthApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authPost**](AuthApi.md#authPost) | **POST** /auth | Authenticate | Logout | Password Reset | Authenticate response (with challenge)



## authPost

> authPost(authenticate)

Authenticate | Logout | Password Reset | Authenticate response (with challenge)

### Example

```javascript
import SeveralninesClusterControlRestApiV2 from 'severalnines_cluster_control_rest_api__v2';

let apiInstance = new SeveralninesClusterControlRestApiV2.AuthApi();
let authenticate = new SeveralninesClusterControlRestApiV2.Authenticate(); // Authenticate | Authentication parameters
apiInstance.authPost(authenticate, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authenticate** | [**Authenticate**](Authenticate.md)| Authentication parameters | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

