# Controller


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | **str** |  | 
**client_ip_address** | **str** |  | [optional] 
**controller_key** | **str** |  | [optional] 

## Example

```python
from openapi_cc_client.models.controller import Controller

# TODO update the JSON string below
json = "{}"
# create an instance of Controller from a JSON string
controller_instance = Controller.from_json(json)
# print the JSON string representation of the object
print(Controller.to_json())

# convert the object into a dict
controller_dict = controller_instance.to_dict()
# create an instance of Controller from a dict
controller_from_dict = Controller.from_dict(controller_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


