# \CloudApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CloudPost**](CloudApi.md#CloudPost) | **Post** /cloud | VerifyCredentials | ListCredentials | etc



## CloudPost

> CloudPost(ctx).Cloud(cloud).Execute()

VerifyCredentials | ListCredentials | etc

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
    cloud := *openapiclient.NewCloud("Operation_example") // Cloud | calls to manage the cloud-credentials

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.CloudApi.CloudPost(context.Background()).Cloud(cloud).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `CloudApi.CloudPost``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCloudPostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloud** | [**Cloud**](Cloud.md) | calls to manage the cloud-credentials | 

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

