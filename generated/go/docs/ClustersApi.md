# \ClustersAPI

All URIs are relative to *https://&lt;cchost&gt;:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ClustersPost**](ClustersAPI.md#ClustersPost) | **Post** /clusters | GetClusterInfo | Get/Set Config | etc



## ClustersPost

> ClusterResponse ClustersPost(ctx).Clusters(clusters).Execute()

GetClusterInfo | Get/Set Config | etc

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
	clusters := *openapiclient.NewClusters("Operation_example") // Clusters | Get cluster information

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ClustersAPI.ClustersPost(context.Background()).Clusters(clusters).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ClustersAPI.ClustersPost``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ClustersPost`: ClusterResponse
	fmt.Fprintf(os.Stdout, "Response from `ClustersAPI.ClustersPost`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiClustersPostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusters** | [**Clusters**](Clusters.md) | Get cluster information | 

### Return type

[**ClusterResponse**](ClusterResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

