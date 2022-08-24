# .ControllerApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**controllerPost**](ControllerApi.md#controllerPost) | **POST** /controller | Ping | Heartbeat | etc


# **controllerPost**
> void controllerPost(controller)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ControllerApi(configuration);

let body:.ControllerApiControllerPostRequest = {
  // Controller | Managing controller and operate the Cmon HA subsystem
  controller: {
    operation: "ping",
    clientIpAddress: "clientIpAddress_example",
    controllerKey: "controllerKey_example",
  },
};

apiInstance.controllerPost(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controller** | **Controller**| Managing controller and operate the Cmon HA subsystem |


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
**200** | Successful operation |  -  |
**405** | Unauthorized |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


