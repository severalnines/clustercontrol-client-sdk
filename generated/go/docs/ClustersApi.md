# \ClustersApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ClustersPost**](ClustersApi.md#ClustersPost) | **Post** /clusters | GetClusterInfo | Get/Set Config | etc



## ClustersPost

> ClustersPost(ctx).Clusters(clusters).Execute()

GetClusterInfo | Get/Set Config | etc

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
    clusters := *openapiclient.NewClusters("Operation_example") // Clusters | Get cluster information

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ClustersApi.ClustersPost(context.Background()).Clusters(clusters).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ClustersApi.ClustersPost``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiClustersPostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusters** | [**Clusters**](Clusters.md) | Get cluster information | 

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

