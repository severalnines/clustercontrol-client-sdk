# \StatApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**StatPost**](StatApi.md#StatPost) | **Post** /stat | GetInfo | etc



## StatPost

> StatPost(ctx).Stat(stat).Execute()

GetInfo | etc

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
    stat := *openapiclient.NewStat("Operation_example") // Stat | Provides calls to access various statistical information about the cluster

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.StatApi.StatPost(context.Background()).Stat(stat).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `StatApi.StatPost``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiStatPostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stat** | [**Stat**](Stat.md) | Provides calls to access various statistical information about the cluster | 

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

