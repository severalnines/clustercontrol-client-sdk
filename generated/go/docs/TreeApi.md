# \TreeAPI

All URIs are relative to *https://&lt;cchost&gt;:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**TreePost**](TreeAPI.md#TreePost) | **Post** /tree | AddACL | RemoveAcl | etc



## TreePost

> TreePost(ctx).Tree(tree).Execute()

AddACL | RemoveAcl | etc

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
	tree := *openapiclient.NewTree("Operation_example") // Tree | Manipulate ACLs for Groups and Users that are maintained by the Cmon controller

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.TreeAPI.TreePost(context.Background()).Tree(tree).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TreeAPI.TreePost``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiTreePostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tree** | [**Tree**](Tree.md) | Manipulate ACLs for Groups and Users that are maintained by the Cmon controller | 

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

