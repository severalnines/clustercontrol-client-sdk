# .BackupApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**backupPost**](BackupApi.md#backupPost) | **POST** /backup | GetBackups | GetBackupSchedules | ScheduleBackup | DeleteBackupRecord


# **backupPost**
> void backupPost(backup)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .BackupApi(configuration);

let body:.BackupApiBackupPostRequest = {
  // Backup | All things related to Backups
  backup: {
    operation: "getBackups",
    clusterId: 1,
    ascending: true,
    schedule: {
      className: "CmonBackupSchedule",
      enabled: true,
      schedule: "schedule_example",
      job: {
        command: "backup",
        jobData: {
          description: "description_example",
          backupFailover: true,
          backupFailoverHost: "auto",
          backupMethod: "pg_basebackup",
          backupRetention: 1,
          backupdir: "backupdir_example",
          backupsubdir: "backupsubdir_example",
          ccStorage: "ccStorage_example",
          compression: true,
          compresionLevel: 1,
          hostname: "hostname_example",
          port: 1,
          verifyBackupDelay: 1,
          verifyBackup: {
            disableFirewall: true,
            disableSelinux: true,
            installSoftware: true,
            serverAddress: "serverAddress_example",
            terminateDbServer: true,
          },
        },
      },
    },
    backupRecord: {
      backupId: 1,
    },
  },
};

apiInstance.backupPost(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **backup** | **Backup**| All things related to Backups |


### Return type

**void**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**405** | Unauthorized |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


