# ConfigConfigurationInner


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | [optional] 
**value** | **str** |  | [optional] 
**group** | **str** | Group name | [optional] 

## Example

```python
from openapi_cc_client.models.config_configuration_inner import ConfigConfigurationInner

# TODO update the JSON string below
json = "{}"
# create an instance of ConfigConfigurationInner from a JSON string
config_configuration_inner_instance = ConfigConfigurationInner.from_json(json)
# print the JSON string representation of the object
print ConfigConfigurationInner.to_json()

# convert the object into a dict
config_configuration_inner_dict = config_configuration_inner_instance.to_dict()
# create an instance of ConfigConfigurationInner from a dict
config_configuration_inner_form_dict = config_configuration_inner.from_dict(config_configuration_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


