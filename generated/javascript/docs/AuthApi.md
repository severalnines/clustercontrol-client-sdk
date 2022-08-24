# SeveralninesClusterControl.AuthApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authPost**](AuthApi.md#authPost) | **POST** /auth | Authenticate | Logout | Password Reset | Authenticate response (with challenge)



## authPost

> authPost(authenticate)

Authenticate | Logout | Password Reset | Authenticate response (with challenge)

### Example

```javascript
import SeveralninesClusterControl from 'severalnines_cluster_control';

let apiInstance = new SeveralninesClusterControl.AuthApi();
let authenticate = new SeveralninesClusterControl.Authenticate(); // Authenticate | Authentication parameters
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

