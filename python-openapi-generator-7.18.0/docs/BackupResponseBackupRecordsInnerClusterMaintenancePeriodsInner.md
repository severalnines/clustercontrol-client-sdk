# BackupResponseBackupRecordsInnerClusterMaintenancePeriodsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | **str** |  | [optional] 
**initiate** | **str** |  | [optional] 
**deadline** | **str** |  | [optional] 
**is_active** | **bool** |  | [optional] 
**reason** | **str** |  | [optional] 

## Example

```python
from openapi_cc_client.models.backup_response_backup_records_inner_cluster_maintenance_periods_inner import BackupResponseBackupRecordsInnerClusterMaintenancePeriodsInner

# TODO update the JSON string below
json = "{}"
# create an instance of BackupResponseBackupRecordsInnerClusterMaintenancePeriodsInner from a JSON string
backup_response_backup_records_inner_cluster_maintenance_periods_inner_instance = BackupResponseBackupRecordsInnerClusterMaintenancePeriodsInner.from_json(json)
# print the JSON string representation of the object
print(BackupResponseBackupRecordsInnerClusterMaintenancePeriodsInner.to_json())

# convert the object into a dict
backup_response_backup_records_inner_cluster_maintenance_periods_inner_dict = backup_response_backup_records_inner_cluster_maintenance_periods_inner_instance.to_dict()
# create an instance of BackupResponseBackupRecordsInnerClusterMaintenancePeriodsInner from a dict
backup_response_backup_records_inner_cluster_maintenance_periods_inner_from_dict = BackupResponseBackupRecordsInnerClusterMaintenancePeriodsInner.from_dict(backup_response_backup_records_inner_cluster_maintenance_periods_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


