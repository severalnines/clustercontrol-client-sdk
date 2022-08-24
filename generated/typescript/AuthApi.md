# .AuthApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authPost**](AuthApi.md#authPost) | **POST** /auth | Authenticate | Logout | Password Reset | Authenticate response (with challenge)


# **authPost**
> void authPost(authenticate)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AuthApi(configuration);

let body:.AuthApiAuthPostRequest = {
  // Authenticate | Authentication parameters
  authenticate: {
    operation: "authenticateWithPassword",
    userName: "userName_example",
    password: "password_example",
    signature: "signature_example",
    newPassword: "newPassword_example",
    passwordResetToken: "passwordResetToken_example",
  },
};

apiInstance.authPost(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authenticate** | **Authenticate**| Authentication parameters |


### Return type

**void**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful authentication |  -  |
**405** | Invalid input |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


