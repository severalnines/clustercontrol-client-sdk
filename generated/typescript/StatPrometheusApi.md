# .StatPrometheusApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**statPrometheusQueryPost**](StatPrometheusApi.md#statPrometheusQueryPost) | **POST** /stat/prometheus/query | GetInfo | etc


# **statPrometheusQueryPost**
> void statPrometheusQueryPost(statPrometheus)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .StatPrometheusApi(configuration);

let body:.StatPrometheusApiStatPrometheusQueryPostRequest = {
  // StatPrometheus | Provides calls to access various statistical information about the cluster
  statPrometheus: {
    operation: "/prometheus",
    clusterId: 1,
    clusterName: "clusterName_example",
    queries: [
      {
        query: "query_example",
        step: 1,
      },
    ],
    start: 1,
    end: 1,
    step: 1,
    returnfrom: 1,
  },
};

apiInstance.statPrometheusQueryPost(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statPrometheus** | **StatPrometheus**| Provides calls to access various statistical information about the cluster |


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


