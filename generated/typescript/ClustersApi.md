# .ClustersApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clustersPost**](ClustersApi.md#clustersPost) | **POST** /clusters | GetClusterInfo | Get/Set Config | etc


# **clustersPost**
> void clustersPost(clusters)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ClustersApi(configuration);

let body:.ClustersApiClustersPostRequest = {
  // Clusters | Get cluster information
  clusters: {
    operation: "getallclusterinfo",
    clusterId: 1,
    clusterName: "clusterName_example",
    withHosts: true,
    withSheetInfo: true,
    configuration: [
      {
        name: "name_example",
        value: "value_example",
      },
    ],
    account: {
      className: "CmonAccount",
      grants: "grants_example",
      hostAllow: "hostAllow_example",
      ownDatabase: "ownDatabase_example",
      privileges: "privileges_example",
      userName: "userName_example",
      password: "password_example",
    },
    filterStrings: "filterStrings_example",
    limit: 1,
    offset: 1,
    database: {
      className: "CmonDataBase",
      databaseName: "databaseName_example",
    },
    nodes: [
      "nodes_example",
    ],
  },
};

apiInstance.clustersPost(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusters** | **Clusters**| Get cluster information |


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


