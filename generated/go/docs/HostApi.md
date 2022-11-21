# \HostApi

All URIs are relative to *https://&lt;cchost&gt;:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**HostPost**](HostApi.md#HostPost) | **Post** /host | Path for managing servers



## HostPost

> HostPost(ctx).Host(host).Execute()

Path for managing servers

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
    host := *openapiclient.NewHost("Operation_example") // Host | (Un)Register servers, Shutdown servers, etc

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.HostApi.HostPost(context.Background()).Host(host).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `HostApi.HostPost``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiHostPostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **host** | [**Host**](Host.md) | (Un)Register servers, Shutdown servers, etc | 

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

