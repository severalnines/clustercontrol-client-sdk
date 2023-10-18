# Maintenance


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | **str** |  | 
**cluster_id** | **int** |  | [optional] 
**deadline** | **str** |  | [optional] 
**initiate** | **str** |  | [optional] 
**hostname** | **str** |  | [optional] 
**uuid** | **str** |  | [optional] 

## Example

```python
from openapi_cc_client.models.maintenance import Maintenance

# TODO update the JSON string below
json = "{}"
# create an instance of Maintenance from a JSON string
maintenance_instance = Maintenance.from_json(json)
# print the JSON string representation of the object
print Maintenance.to_json()

# convert the object into a dict
maintenance_dict = maintenance_instance.to_dict()
# create an instance of Maintenance from a dict
maintenance_form_dict = maintenance.from_dict(maintenance_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


