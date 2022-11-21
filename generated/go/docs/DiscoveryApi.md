# \DiscoveryApi

All URIs are relative to *https://&lt;cchost&gt;:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DiscoveryPost**](DiscoveryApi.md#DiscoveryPost) | **Post** /discovery | CheckClusterName | CheckHosts | GetSupportedClusterTypes



## DiscoveryPost

> DiscoveryPost(ctx).Discovery(discovery).Execute()

CheckClusterName | CheckHosts | GetSupportedClusterTypes

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
    discovery := *openapiclient.NewDiscovery("Operation_example") // Discovery | All things related to Clusters and cluster Hosts

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DiscoveryApi.DiscoveryPost(context.Background()).Discovery(discovery).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DiscoveryApi.DiscoveryPost``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiDiscoveryPostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **discovery** | [**Discovery**](Discovery.md) | All things related to Clusters and cluster Hosts | 

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

