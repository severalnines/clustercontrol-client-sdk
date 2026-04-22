# ConfigLdapConfigurationSecurity


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ca_cert_file** | **str** |  | [optional] 
**cert_file** | **str** |  | [optional] 
**key_file** | **str** |  | [optional] 

## Example

```python
from openapi_cc_client.models.config_ldap_configuration_security import ConfigLdapConfigurationSecurity

# TODO update the JSON string below
json = "{}"
# create an instance of ConfigLdapConfigurationSecurity from a JSON string
config_ldap_configuration_security_instance = ConfigLdapConfigurationSecurity.from_json(json)
# print the JSON string representation of the object
print(ConfigLdapConfigurationSecurity.to_json())

# convert the object into a dict
config_ldap_configuration_security_dict = config_ldap_configuration_security_instance.to_dict()
# create an instance of ConfigLdapConfigurationSecurity from a dict
config_ldap_configuration_security_from_dict = ConfigLdapConfigurationSecurity.from_dict(config_ldap_configuration_security_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


