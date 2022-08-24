# SeveralninesClusterControl.AlarmsApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**alarmPost**](AlarmsApi.md#alarmPost) | **POST** /alarm | GetStatistics | GetAlarm | GetAlarms | IgnoreAlarm



## alarmPost

> AlarmResponse alarmPost(alarm)

GetStatistics | GetAlarm | GetAlarms | IgnoreAlarm

### Example

```javascript
import SeveralninesClusterControl from 'severalnines_cluster_control';

let apiInstance = new SeveralninesClusterControl.AlarmsApi();
let alarm = new SeveralninesClusterControl.Alarm(); // Alarm | All things related to Alarms and Stats
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

