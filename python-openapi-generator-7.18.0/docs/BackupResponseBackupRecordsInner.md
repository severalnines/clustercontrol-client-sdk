# BackupResponseBackupRecordsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | **int** |  | [optional] 
**cloud_locations** | [**List[BackupResponseBackupRecordsInnerCloudLocationsInner]**](BackupResponseBackupRecordsInnerCloudLocationsInner.md) |  | [optional] 
**host_locations** | [**List[BackupResponseBackupRecordsInnerHostLocationsInner]**](BackupResponseBackupRecordsInnerHostLocationsInner.md) |  | [optional] 
**metadata** | [**BackupResponseBackupRecordsInnerMetadata**](BackupResponseBackupRecordsInnerMetadata.md) |  | [optional] 
**cluster** | [**BackupResponseBackupRecordsInnerCluster**](BackupResponseBackupRecordsInnerCluster.md) |  | [optional] 

## Example

```python
from openapi_cc_client.models.backup_response_backup_records_inner import BackupResponseBackupRecordsInner

# TODO update the JSON string below
json = "{}"
# create an instance of BackupResponseBackupRecordsInner from a JSON string
backup_response_backup_records_inner_instance = BackupResponseBackupRecordsInner.from_json(json)
# print the JSON string representation of the object
print(BackupResponseBackupRecordsInner.to_json())

# convert the object into a dict
backup_response_backup_records_inner_dict = backup_response_backup_records_inner_instance.to_dict()
# create an instance of BackupResponseBackupRecordsInner from a dict
backup_response_backup_records_inner_from_dict = BackupResponseBackupRecordsInner.from_dict(backup_response_backup_records_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


