# ConfigLdapConfigurationLdapSettings


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ldap_email_attributes** | **str** |  | [optional] 
**ldap_group_class_name** | **str** |  | [optional] 
**ldap_group_id_attributes** | **str** |  | [optional] 
**ldap_group_name_attribute** | **str** |  | [optional] 
**ldap_member_attributes** | **str** |  | [optional] 
**ldap_network_timeout** | **str** |  | [optional] 
**ldap_protocol_version** | **str** |  | [optional] 
**ldap_query_time_limit** | **str** |  | [optional] 
**ldap_realname_attributes** | **str** |  | [optional] 
**ldap_user_class_name** | **str** |  | [optional] 
**ldap_username_attributes** | **str** |  | [optional] 

## Example

```python
from openapi_cc_client.models.config_ldap_configuration_ldap_settings import ConfigLdapConfigurationLdapSettings

# TODO update the JSON string below
json = "{}"
# create an instance of ConfigLdapConfigurationLdapSettings from a JSON string
config_ldap_configuration_ldap_settings_instance = ConfigLdapConfigurationLdapSettings.from_json(json)
# print the JSON string representation of the object
print ConfigLdapConfigurationLdapSettings.to_json()

# convert the object into a dict
config_ldap_configuration_ldap_settings_dict = config_ldap_configuration_ldap_settings_instance.to_dict()
# create an instance of ConfigLdapConfigurationLdapSettings from a dict
config_ldap_configuration_ldap_settings_form_dict = config_ldap_configuration_ldap_settings.from_dict(config_ldap_configuration_ldap_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


