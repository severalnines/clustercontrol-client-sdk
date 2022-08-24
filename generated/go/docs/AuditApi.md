# \AuditApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AuditPost**](AuditApi.md#AuditPost) | **Post** /audit | GetStatistics | GetAlarm | GetAlarms | IgnoreAlarm



## AuditPost

> AuditPost(ctx).Audit(audit).Execute()

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
    audit := *openapiclient.NewAudit("Operation_example") // Audit | Used to get the audit log entries

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AuditApi.AuditPost(context.Background()).Audit(audit).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AuditApi.AuditPost``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAuditPostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audit** | [**Audit**](Audit.md) | Used to get the audit log entries | 

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

