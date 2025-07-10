# SeveralninesClusterControlRestApiV2.BackupApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**backupPost**](BackupApi.md#backupPost) | **POST** /backup | GetBackups | GetBackupSchedules | ScheduleBackup | DeleteBackupRecord



## backupPost

> backupPost(backup)

GetBackups | GetBackupSchedules | ScheduleBackup | DeleteBackupRecord

### Example

```javascript
import SeveralninesClusterControlRestApiV2 from 'severalnines_cluster_control_rest_api__v2';

let apiInstance = new SeveralninesClusterControlRestApiV2.BackupApi();
let backup = new SeveralninesClusterControlRestApiV2.Backup(); // Backup | All things related to Backups
apiInstance.backupPost(backup, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **backup** | [**Backup**](Backup.md)| All things related to Backups | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

