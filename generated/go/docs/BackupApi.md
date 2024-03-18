# \BackupAPI

All URIs are relative to *https://&lt;cchost&gt;:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BackupPost**](BackupAPI.md#BackupPost) | **Post** /backup | GetBackups | GetBackupSchedules | ScheduleBackup | DeleteBackupRecord



## BackupPost

> BackupPost(ctx).Backup(backup).Execute()

GetBackups | GetBackupSchedules | ScheduleBackup | DeleteBackupRecord

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
	backup := *openapiclient.NewBackup("Operation_example") // Backup | All things related to Backups

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.BackupAPI.BackupPost(context.Background()).Backup(backup).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BackupAPI.BackupPost``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiBackupPostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **backup** | [**Backup**](Backup.md) | All things related to Backups | 

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

