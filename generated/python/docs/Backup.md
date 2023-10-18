# Backup


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | **str** |  | 
**cluster_id** | **int** |  | [optional] 
**ascending** | **bool** |  | [optional] 
**schedule** | [**BackupSchedule**](BackupSchedule.md) |  | [optional] 
**backup_record** | [**BackupBackupRecord**](BackupBackupRecord.md) |  | [optional] 

## Example

```python
from openapi_cc_client.models.backup import Backup

# TODO update the JSON string below
json = "{}"
# create an instance of Backup from a JSON string
backup_instance = Backup.from_json(json)
# print the JSON string representation of the object
print Backup.to_json()

# convert the object into a dict
backup_dict = backup_instance.to_dict()
# create an instance of Backup from a dict
backup_form_dict = backup.from_dict(backup_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


