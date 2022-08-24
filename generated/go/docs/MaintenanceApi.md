# \MaintenanceApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MaintenancePost**](MaintenanceApi.md#MaintenancePost) | **Post** /maintenance | CreateJobInstance | etc



## MaintenancePost

> MaintenancePost(ctx).Maintenance(maintenance).Execute()

CreateJobInstance | etc

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
    maintenance := *openapiclient.NewMaintenance("Operation_example") // Maintenance | Creating, deleting and obtaining maintenance periods

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MaintenanceApi.MaintenancePost(context.Background()).Maintenance(maintenance).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MaintenanceApi.MaintenancePost``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMaintenancePostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **maintenance** | [**Maintenance**](Maintenance.md) | Creating, deleting and obtaining maintenance periods | 

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

