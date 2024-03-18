# \AlarmsAPI

All URIs are relative to *https://&lt;cchost&gt;:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AlarmPost**](AlarmsAPI.md#AlarmPost) | **Post** /alarm | GetStatistics | GetAlarm | GetAlarms | IgnoreAlarm



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
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	alarm := *openapiclient.NewAlarm("Operation_example") // Alarm | All things related to Alarms and Stats

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AlarmsAPI.AlarmPost(context.Background()).Alarm(alarm).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AlarmsAPI.AlarmPost``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AlarmPost`: AlarmResponse
	fmt.Fprintf(os.Stdout, "Response from `AlarmsAPI.AlarmPost`: %v\n", resp)
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

