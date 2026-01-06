# Config


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | **str** |  | 
**hostname** | **str** |  | [optional] 
**port** | **int** |  | [optional] 
**configuration** | [**List[ConfigConfigurationInner]**](ConfigConfigurationInner.md) |  | [optional] 
**ldap_configuration** | [**ConfigLdapConfiguration**](ConfigLdapConfiguration.md) |  | [optional] 
**licensedata** | **str** |  | [optional] 

## Example

```python
from openapi_cc_client.models.config import Config

# TODO update the JSON string below
json = "{}"
# create an instance of Config from a JSON string
config_instance = Config.from_json(json)
# print the JSON string representation of the object
print(Config.to_json())

# convert the object into a dict
config_dict = config_instance.to_dict()
# create an instance of Config from a dict
config_from_dict = Config.from_dict(config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


