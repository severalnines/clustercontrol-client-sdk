# .StatCmonAgentApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**statCmonagentPost**](StatCmonAgentApi.md#statCmonagentPost) | **POST** /stat/cmonagent | GetInfo | etc


# **statCmonagentPost**
> void statCmonagentPost(statCmonAgent)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .StatCmonAgentApi(configuration);

let body:.StatCmonAgentApiStatCmonagentPostRequest = {
  // StatCmonAgent | Provides calls to access various statistical information about the cluster
  statCmonAgent: {
    operation: "/cmonagent",
    apiKey: "apiKey_example",
    className: "CmnRequest",
    requestData: {
      begin: "begin_example",
      className: "CmnReadParam",
      end: "end_example",
      limit: 1,
      mimeType: "mimeType_example",
      objectName: "objectName_example",
      origin: "timeline",
    },
  },
};

apiInstance.statCmonagentPost(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statCmonAgent** | **StatCmonAgent**| Provides calls to access various statistical information about the cluster |


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


