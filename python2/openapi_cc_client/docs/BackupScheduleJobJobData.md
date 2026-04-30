# BackupScheduleJobJobData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** |  | [optional] 
**backup_failover** | **bool** |  | [optional] 
**backup_failover_host** | **str** |  | [optional] 
**backup_method** | **str** |  | [optional] 
**backup_retention** | **int** |  | [optional] 
**backupdir** | **str** |  | [optional] 
**backupsubdir** | **str** |  | [optional] 
**cc_storage** | **bool** |  | [optional] 
**compression** | **bool** |  | [optional] 
**compresion_level** | **int** |  | [optional] 
**encrypt_backup** | **bool** |  | [optional] 
**hostname** | **str** |  | [optional] 
**port** | **int** |  | [optional] 
**verify_backup_delay** | **int** |  | [optional] 
**verify_backup** | [**BackupScheduleJobJobDataVerifyBackup**](BackupScheduleJobJobDataVerifyBackup.md) |  | [optional] 

## Example

```python
from openapi_cc_client.models.backup_schedule_job_job_data import BackupScheduleJobJobData

# TODO update the JSON string below
json = "{}"
# create an instance of BackupScheduleJobJobData from a JSON string
backup_schedule_job_job_data_instance = BackupScheduleJobJobData.from_json(json)
# print the JSON string representation of the object
print(BackupScheduleJobJobData.to_json())

# convert the object into a dict
backup_schedule_job_job_data_dict = backup_schedule_job_job_data_instance.to_dict()
# create an instance of BackupScheduleJobJobData from a dict
backup_schedule_job_job_data_from_dict = BackupScheduleJobJobData.from_dict(backup_schedule_job_job_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


