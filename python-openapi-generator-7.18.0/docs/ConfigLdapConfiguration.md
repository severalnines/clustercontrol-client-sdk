# ConfigLdapConfiguration


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **bool** |  | [optional] 
**ldap_admin_password** | **str** |  | [optional] 
**ldap_admin_user** | **str** |  | [optional] 
**ldap_group_search_root** | **str** |  | [optional] 
**ldap_server_uri** | **str** |  | [optional] 
**ldap_user_search_root** | **str** |  | [optional] 
**group_mappings** | [**List[ConfigLdapConfigurationGroupMappingsInner]**](ConfigLdapConfigurationGroupMappingsInner.md) |  | [optional] 
**ldap_settings** | [**ConfigLdapConfigurationLdapSettings**](ConfigLdapConfigurationLdapSettings.md) |  | [optional] 
**security** | [**ConfigLdapConfigurationSecurity**](ConfigLdapConfigurationSecurity.md) |  | [optional] 

## Example

```python
from openapi_cc_client.models.config_ldap_configuration import ConfigLdapConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of ConfigLdapConfiguration from a JSON string
config_ldap_configuration_instance = ConfigLdapConfiguration.from_json(json)
# print the JSON string representation of the object
print(ConfigLdapConfiguration.to_json())

# convert the object into a dict
config_ldap_configuration_dict = config_ldap_configuration_instance.to_dict()
# create an instance of ConfigLdapConfiguration from a dict
config_ldap_configuration_from_dict = ConfigLdapConfiguration.from_dict(config_ldap_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


