# MaintenanceResponseMaintenanceRecordsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cluster_id** | **int** |  | [optional] 
**is_active** | **bool** |  | [optional] 
**cluster** | [**BackupResponseBackupRecordsInnerCluster**](BackupResponseBackupRecordsInnerCluster.md) |  | [optional] 

## Example

```python
from openapi_cc_client.models.maintenance_response_maintenance_records_inner import MaintenanceResponseMaintenanceRecordsInner

# TODO update the JSON string below
json = "{}"
# create an instance of MaintenanceResponseMaintenanceRecordsInner from a JSON string
maintenance_response_maintenance_records_inner_instance = MaintenanceResponseMaintenanceRecordsInner.from_json(json)
# print the JSON string representation of the object
print(MaintenanceResponseMaintenanceRecordsInner.to_json())

# convert the object into a dict
maintenance_response_maintenance_records_inner_dict = maintenance_response_maintenance_records_inner_instance.to_dict()
# create an instance of MaintenanceResponseMaintenanceRecordsInner from a dict
maintenance_response_maintenance_records_inner_from_dict = MaintenanceResponseMaintenanceRecordsInner.from_dict(maintenance_response_maintenance_records_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


