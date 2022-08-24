# \JobsApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**JobsPost**](JobsApi.md#JobsPost) | **Post** /jobs | CreateJobInstance | etc



## JobsPost

> JobsPost(ctx).Jobs(jobs).Execute()

CreateJobInstance | etc

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
    jobs := *openapiclient.NewJobs("Operation_example") // Jobs | Creating, manipulating, and obtaining information about jobs

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.JobsApi.JobsPost(context.Background()).Jobs(jobs).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `JobsApi.JobsPost``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiJobsPostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobs** | [**Jobs**](Jobs.md) | Creating, manipulating, and obtaining information about jobs | 

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

