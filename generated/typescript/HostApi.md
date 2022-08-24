# .HostApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**hostPost**](HostApi.md#hostPost) | **POST** /host | Path for managing servers


# **hostPost**
> void hostPost(host)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .HostApi(configuration);

let body:.HostApiHostPostRequest = {
  // Host | (Un)Register servers, Shutdown servers, etc
  host: {
    operation: "startServers",
    servers: [
      {
        className: "CmonContainerServer",
        hostname: "hostname_example",
        cdtPath: "cdtPath_example",
      },
    ],
    clusterId: 1,
    dryRun: true,
    host: {
      className: "className_example",
      hostname: "hostname_example",
      port: 1,
    },
  },
};

apiInstance.hostPost(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **host** | **Host**| (Un)Register servers, Shutdown servers, etc |


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


