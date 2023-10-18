# ConfigLdapConfigurationGroupMappingsInner


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cmon_group_name** | **str** |  | [optional] 
**ldap_group_id** | **str** |  | [optional] 
**section_name** | **str** |  | [optional] 

## Example

```python
from openapi_cc_client.models.config_ldap_configuration_group_mappings_inner import ConfigLdapConfigurationGroupMappingsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ConfigLdapConfigurationGroupMappingsInner from a JSON string
config_ldap_configuration_group_mappings_inner_instance = ConfigLdapConfigurationGroupMappingsInner.from_json(json)
# print the JSON string representation of the object
print ConfigLdapConfigurationGroupMappingsInner.to_json()

# convert the object into a dict
config_ldap_configuration_group_mappings_inner_dict = config_ldap_configuration_group_mappings_inner_instance.to_dict()
# create an instance of ConfigLdapConfigurationGroupMappingsInner from a dict
config_ldap_configuration_group_mappings_inner_form_dict = config_ldap_configuration_group_mappings_inner.from_dict(config_ldap_configuration_group_mappings_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


