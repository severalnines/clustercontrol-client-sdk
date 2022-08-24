# .MaintenanceApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**maintenancePost**](MaintenanceApi.md#maintenancePost) | **POST** /maintenance | CreateJobInstance | etc


# **maintenancePost**
> void maintenancePost(maintenance)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .MaintenanceApi(configuration);

let body:.MaintenanceApiMaintenancePostRequest = {
  // Maintenance | Creating, deleting and obtaining maintenance periods
  maintenance: {
    operation: "addMaintenance",
    clusterId: 1,
    deadline: "deadline_example",
    initiate: "initiate_example",
    hostname: "hostname_example",
    UUID: "UUID_example",
  },
};

apiInstance.maintenancePost(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **maintenance** | **Maintenance**| Creating, deleting and obtaining maintenance periods |


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


