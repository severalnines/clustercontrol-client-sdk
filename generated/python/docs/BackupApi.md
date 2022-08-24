# openapi_cc_client.BackupApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**backup_post**](BackupApi.md#backup_post) | **POST** /backup | GetBackups | GetBackupSchedules | ScheduleBackup | DeleteBackupRecord


# **backup_post**
> backup_post(backup)

GetBackups | GetBackupSchedules | ScheduleBackup | DeleteBackupRecord

### Example


```python
import time
import openapi_cc_client
from openapi_cc_client.api import backup_api
from openapi_cc_client.model.backup import Backup
from pprint import pprint
# Defining the host is optional and defaults to https://cchost:9501/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_cc_client.Configuration(
    host = "https://cchost:9501/v2"
)


# Enter a context with an instance of the API client
with openapi_cc_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = backup_api.BackupApi(api_client)
    backup = Backup(
        operation="getBackups",
        cluster_id=1,
        ascending=True,
        schedule=BackupSchedule(
            class_name="CmonBackupSchedule",
            enabled=True,
            schedule="schedule_example",
            schedule_id=1,
            job=BackupScheduleJob(
                command="backup",
                job_data=BackupScheduleJobJobData(
                    description="description_example",
                    backup_failover=True,
                    backup_failover_host="auto",
                    backup_method="pg_basebackup",
                    backup_retention=1,
                    backupdir="backupdir_example",
                    backupsubdir="backupsubdir_example",
                    cc_storage="cc_storage_example",
                    compression=True,
                    compresion_level=1,
                    encrypt_backup=True,
                    hostname="hostname_example",
                    port=1,
                    verify_backup_delay=1,
                    verify_backup=BackupScheduleJobJobDataVerifyBackup(
                        disable_firewall=True,
                        disable_selinux=True,
                        install_software=True,
                        server_address="server_address_example",
                        terminate_db_server=True,
                    ),
                ),
            ),
        ),
        backup_record=BackupBackupRecord(
            backup_id=1,
        ),
    ) # Backup | All things related to Backups

    # example passing only required values which don't have defaults set
    try:
        # GetBackups | GetBackupSchedules | ScheduleBackup | DeleteBackupRecord
        api_instance.backup_post(backup)
    except openapi_cc_client.ApiException as e:
        print("Exception when calling BackupApi->backup_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **backup** | [**Backup**](Backup.md)| All things related to Backups |

### Return type

void (empty response body)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

