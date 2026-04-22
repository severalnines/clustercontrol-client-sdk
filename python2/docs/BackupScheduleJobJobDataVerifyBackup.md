# BackupScheduleJobJobDataVerifyBackup


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**disable_firewall** | **bool** |  | [optional] 
**disable_selinux** | **bool** |  | [optional] 
**install_software** | **bool** |  | [optional] 
**server_address** | **str** |  | [optional] 
**terminate_db_server** | **bool** |  | [optional] 

## Example

```python
from openapi_cc_client.models.backup_schedule_job_job_data_verify_backup import BackupScheduleJobJobDataVerifyBackup

# TODO update the JSON string below
json = "{}"
# create an instance of BackupScheduleJobJobDataVerifyBackup from a JSON string
backup_schedule_job_job_data_verify_backup_instance = BackupScheduleJobJobDataVerifyBackup.from_json(json)
# print the JSON string representation of the object
print(BackupScheduleJobJobDataVerifyBackup.to_json())

# convert the object into a dict
backup_schedule_job_job_data_verify_backup_dict = backup_schedule_job_job_data_verify_backup_instance.to_dict()
# create an instance of BackupScheduleJobJobDataVerifyBackup from a dict
backup_schedule_job_job_data_verify_backup_from_dict = BackupScheduleJobJobDataVerifyBackup.from_dict(backup_schedule_job_job_data_verify_backup_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


