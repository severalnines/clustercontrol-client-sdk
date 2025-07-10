# SeveralninesClusterControlRestApiV2.AlarmsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**alarmPost**](AlarmsApi.md#alarmPost) | **POST** /alarm | GetStatistics | GetAlarm | GetAlarms | IgnoreAlarm



## alarmPost

> AlarmResponse alarmPost(alarm)

GetStatistics | GetAlarm | GetAlarms | IgnoreAlarm

### Example

```javascript
import SeveralninesClusterControlRestApiV2 from 'severalnines_cluster_control_rest_api__v2';

let apiInstance = new SeveralninesClusterControlRestApiV2.AlarmsApi();
let alarm = new SeveralninesClusterControlRestApiV2.Alarm(); // Alarm | All things related to Alarms and Stats
apiInstance.alarmPost(alarm, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alarm** | [**Alarm**](Alarm.md)| All things related to Alarms and Stats | 

### Return type

[**AlarmResponse**](AlarmResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

