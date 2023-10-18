# BackupScheduleJob


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**command** | **str** |  | [optional] 
**job_data** | [**BackupScheduleJobJobData**](BackupScheduleJobJobData.md) |  | [optional] 

## Example

```python
from openapi_cc_client.models.backup_schedule_job import BackupScheduleJob

# TODO update the JSON string below
json = "{}"
# create an instance of BackupScheduleJob from a JSON string
backup_schedule_job_instance = BackupScheduleJob.from_json(json)
# print the JSON string representation of the object
print BackupScheduleJob.to_json()

# convert the object into a dict
backup_schedule_job_dict = backup_schedule_job_instance.to_dict()
# create an instance of BackupScheduleJob from a dict
backup_schedule_job_form_dict = backup_schedule_job.from_dict(backup_schedule_job_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


