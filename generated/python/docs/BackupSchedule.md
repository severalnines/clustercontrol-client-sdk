# BackupSchedule


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**class_name** | **str** |  | [optional] 
**enabled** | **bool** |  | [optional] 
**schedule** | **str** |  | [optional] 
**schedule_id** | **int** |  | [optional] 
**job** | [**BackupScheduleJob**](BackupScheduleJob.md) |  | [optional] 

## Example

```python
from openapi_cc_client.models.backup_schedule import BackupSchedule

# TODO update the JSON string below
json = "{}"
# create an instance of BackupSchedule from a JSON string
backup_schedule_instance = BackupSchedule.from_json(json)
# print the JSON string representation of the object
print BackupSchedule.to_json()

# convert the object into a dict
backup_schedule_dict = backup_schedule_instance.to_dict()
# create an instance of BackupSchedule from a dict
backup_schedule_form_dict = backup_schedule.from_dict(backup_schedule_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


