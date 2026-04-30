# \AuthAPI

All URIs are relative to *https://cchost/proxy*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AuthLoginPost**](AuthAPI.md#AuthLoginPost) | **Post** /auth/login | Authenticate



## AuthLoginPost

> AuthenticateResponse AuthLoginPost(ctx).Authenticate(authenticate).Execute()

Authenticate

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/severalnines/clustercontrol-client-sdk/go/proxy/pkg/openapi"
)

func main() {
	authenticate := *openapiclient.NewAuthenticate() // Authenticate | Authentication parameters

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AuthAPI.AuthLoginPost(context.Background()).Authenticate(authenticate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AuthAPI.AuthLoginPost``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AuthLoginPost`: AuthenticateResponse
	fmt.Fprintf(os.Stdout, "Response from `AuthAPI.AuthLoginPost`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAuthLoginPostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authenticate** | [**Authenticate**](Authenticate.md) | Authentication parameters | 

### Return type

[**AuthenticateResponse**](AuthenticateResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

