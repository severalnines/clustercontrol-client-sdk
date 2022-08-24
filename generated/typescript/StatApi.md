# .StatApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**statPost**](StatApi.md#statPost) | **POST** /stat | GetInfo | etc


# **statPost**
> void statPost(stat)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .StatApi(configuration);

let body:.StatApiStatPostRequest = {
  // Stat | Provides calls to access various statistical information about the cluster
  stat: {
    operation: "getInfo",
    clusterId: 1,
    name: "cpustat",
    startDatetime: "startDatetime_example",
    endDatetime: "endDatetime_example",
    withHosts: true,
    calculatePerSec: true,
  },
};

apiInstance.statPost(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stat** | **Stat**| Provides calls to access various statistical information about the cluster |


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


