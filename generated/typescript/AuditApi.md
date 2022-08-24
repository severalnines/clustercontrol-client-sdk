# .AuditApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**auditPost**](AuditApi.md#auditPost) | **POST** /audit | GetStatistics | GetAlarm | GetAlarms | IgnoreAlarm


# **auditPost**
> void auditPost(audit)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AuditApi(configuration);

let body:.AuditApiAuditPostRequest = {
  // Audit | Used to get the audit log entries
  audit: {
    operation: "getEntries",
    clusterIds: [
      1,
    ],
    ascending: true,
  },
};

apiInstance.auditPost(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audit** | **Audit**| Used to get the audit log entries |


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


