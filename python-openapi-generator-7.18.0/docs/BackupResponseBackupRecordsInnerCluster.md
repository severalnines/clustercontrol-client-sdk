# BackupResponseBackupRecordsInnerCluster


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cluster_name** | **str** |  | [optional] 
**cluster_id** | **int** |  | [optional] 
**cluster_auto_recovery** | **bool** |  | [optional] 
**maintenance_mode_active** | **bool** |  | [optional] 
**maintenance_periods** | [**List[BackupResponseBackupRecordsInnerClusterMaintenancePeriodsInner]**](BackupResponseBackupRecordsInnerClusterMaintenancePeriodsInner.md) |  | [optional] 

## Example

```python
from openapi_cc_client.models.backup_response_backup_records_inner_cluster import BackupResponseBackupRecordsInnerCluster

# TODO update the JSON string below
json = "{}"
# create an instance of BackupResponseBackupRecordsInnerCluster from a JSON string
backup_response_backup_records_inner_cluster_instance = BackupResponseBackupRecordsInnerCluster.from_json(json)
# print the JSON string representation of the object
print(BackupResponseBackupRecordsInnerCluster.to_json())

# convert the object into a dict
backup_response_backup_records_inner_cluster_dict = backup_response_backup_records_inner_cluster_instance.to_dict()
# create an instance of BackupResponseBackupRecordsInnerCluster from a dict
backup_response_backup_records_inner_cluster_from_dict = BackupResponseBackupRecordsInnerCluster.from_dict(backup_response_backup_records_inner_cluster_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


