# BackupResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backup_records** | [**List[BackupResponseBackupRecordsInner]**](BackupResponseBackupRecordsInner.md) |  | [optional] 

## Example

```python
from openapi_cc_client.models.backup_response import BackupResponse

# TODO update the JSON string below
json = "{}"
# create an instance of BackupResponse from a JSON string
backup_response_instance = BackupResponse.from_json(json)
# print the JSON string representation of the object
print(BackupResponse.to_json())

# convert the object into a dict
backup_response_dict = backup_response_instance.to_dict()
# create an instance of BackupResponse from a dict
backup_response_from_dict = BackupResponse.from_dict(backup_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


