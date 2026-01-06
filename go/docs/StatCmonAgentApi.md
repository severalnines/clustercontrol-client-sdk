# \StatCmonAgentAPI

All URIs are relative to *https://&lt;cchost&gt;:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**StatCmonagentPost**](StatCmonAgentAPI.md#StatCmonagentPost) | **Post** /stat/cmonagent | GetInfo | etc



## StatCmonagentPost

> StatCmonagentPost(ctx).StatCmonAgent(statCmonAgent).Execute()

GetInfo | etc

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
	statCmonAgent := *openapiclient.NewStatCmonAgent("Operation_example") // StatCmonAgent | Provides calls to access various statistical information about the cluster

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.StatCmonAgentAPI.StatCmonagentPost(context.Background()).StatCmonAgent(statCmonAgent).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `StatCmonAgentAPI.StatCmonagentPost``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiStatCmonagentPostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statCmonAgent** | [**StatCmonAgent**](StatCmonAgent.md) | Provides calls to access various statistical information about the cluster | 

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

