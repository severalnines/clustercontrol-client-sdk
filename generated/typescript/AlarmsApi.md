# .AlarmsApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**alarmPost**](AlarmsApi.md#alarmPost) | **POST** /alarm | GetStatistics | GetAlarm | GetAlarms | IgnoreAlarm


# **alarmPost**
> AlarmResponse alarmPost(alarm)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AlarmsApi(configuration);

let body:.AlarmsApiAlarmPostRequest = {
  // Alarm | All things related to Alarms and Stats
  alarm: {
    operation: "getStatistics",
    clusterId: 1,
    alarmId: 1,
    className: "CmonRpcRequest",
    ignore: true,
  },
};

apiInstance.alarmPost(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alarm** | **Alarm**| All things related to Alarms and Stats |


### Return type

**AlarmResponse**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**405** | Unauthorized |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


