# \AlarmsApi

All URIs are relative to *https://&lt;cchost&gt;:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AlarmPost**](AlarmsApi.md#AlarmPost) | **Post** /alarm | GetStatistics | GetAlarm | GetAlarms | IgnoreAlarm



## AlarmPost

> AlarmResponse AlarmPost(ctx).Alarm(alarm).Execute()

GetStatistics | GetAlarm | GetAlarms | IgnoreAlarm

### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    alarm := *openapiclient.NewAlarm("Operation_example") // Alarm | All things related to Alarms and Stats

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AlarmsApi.AlarmPost(context.Background()).Alarm(alarm).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AlarmsApi.AlarmPost``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AlarmPost`: AlarmResponse
    fmt.Fprintf(os.Stdout, "Response from `AlarmsApi.AlarmPost`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAlarmPostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alarm** | [**Alarm**](Alarm.md) | All things related to Alarms and Stats | 

### Return type

[**AlarmResponse**](AlarmResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

