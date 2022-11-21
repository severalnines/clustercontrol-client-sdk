# \ControllerApi

All URIs are relative to *https://&lt;cchost&gt;:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ControllerPost**](ControllerApi.md#ControllerPost) | **Post** /controller | Ping | Heartbeat | etc



## ControllerPost

> ControllerPost(ctx).Controller(controller).Execute()

Ping | Heartbeat | etc

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
    controller := *openapiclient.NewController("Operation_example") // Controller | Managing controller and operate the Cmon HA subsystem

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ControllerApi.ControllerPost(context.Background()).Controller(controller).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ControllerApi.ControllerPost``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiControllerPostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controller** | [**Controller**](Controller.md) | Managing controller and operate the Cmon HA subsystem | 

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

