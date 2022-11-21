# \ConfigApi

All URIs are relative to *https://&lt;cchost&gt;:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ConfigPost**](ConfigApi.md#ConfigPost) | **Post** /config | GetConfig | xxx | xxx | etc



## ConfigPost

> ConfigPost(ctx).Config(config).Execute()

GetConfig | xxx | xxx | etc

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
    config := *openapiclient.NewConfig("Operation_example") // Config | Provides access to various Cmon configuration files

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ConfigApi.ConfigPost(context.Background()).Config(config).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ConfigApi.ConfigPost``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiConfigPostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **config** | [**Config**](Config.md) | Provides access to various Cmon configuration files | 

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

