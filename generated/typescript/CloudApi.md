# .CloudApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cloudPost**](CloudApi.md#cloudPost) | **POST** /cloud | VerifyCredentials | ListCredentials | etc


# **cloudPost**
> void cloudPost(cloud)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudApi(configuration);

let body:.CloudApiCloudPostRequest = {
  // Cloud | calls to manage the cloud-credentials
  cloud: {
    operation: "verifyCredentials",
    provider: "provider_example",
    name: "name_example",
    comment: "comment_example",
    id: 1,
    credentials: {
      accessKeyId: "accessKeyId_example",
      accessKeySecret: "accessKeySecret_example",
      accessKeyRegion: "accessKeyRegion_example",
    },
  },
};

apiInstance.cloudPost(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloud** | **Cloud**| calls to manage the cloud-credentials |


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


