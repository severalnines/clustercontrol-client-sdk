# .DiscoveryApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**discoveryPost**](DiscoveryApi.md#discoveryPost) | **POST** /discovery | CheckClusterName | CheckHosts | GetSupportedClusterTypes


# **discoveryPost**
> void discoveryPost(discovery)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DiscoveryApi(configuration);

let body:.DiscoveryApiDiscoveryPostRequest = {
  // Discovery | All things related to Clusters and cluster Hosts
  discovery: {
    operation: "checkClusterName",
    newClusterName: "newClusterName_example",
    checkIfAlreadyRegistered: true,
    checkJob: true,
    checkSshSudo: true,
    nodes: [
      {
        className: "CmonHost",
        hostName: "hostName_example",
        port: 1,
      },
    ],
    job: {
      className: "CmonJobInstance",
      jobSpec: {
        command: "create_cluster",
        jobData: {
          clusterType: "group_replication",
          mysqlVersion: "mysqlVersion_example",
          vendor: "vendor_example",
          nodes: [
            {
              className: "CmonHost",
              hostName: "hostName_example",
            },
          ],
        },
      },
    },
    sshCredentials: {
      className: "className_example",
      userName: "userName_example",
      password: "password_example",
      sshKeyfile: "sshKeyfile_example",
    },
  },
};

apiInstance.discoveryPost(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **discovery** | **Discovery**| All things related to Clusters and cluster Hosts |


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


