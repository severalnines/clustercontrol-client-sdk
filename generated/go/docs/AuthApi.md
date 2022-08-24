# \AuthApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AuthPost**](AuthApi.md#AuthPost) | **Post** /auth | Authenticate | Logout | Password Reset | Authenticate response (with challenge)



## AuthPost

> AuthPost(ctx).Authenticate(authenticate).Execute()

Authenticate | Logout | Password Reset | Authenticate response (with challenge)

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
    authenticate := *openapiclient.NewAuthenticate("Operation_example") // Authenticate | Authentication parameters

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AuthApi.AuthPost(context.Background()).Authenticate(authenticate).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AuthApi.AuthPost``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAuthPostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authenticate** | [**Authenticate**](Authenticate.md) | Authentication parameters | 

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

