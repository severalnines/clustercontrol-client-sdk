# OpenapiClient::ConfigLdapConfiguration

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **enabled** | **Boolean** |  | [optional] |
| **ldap_admin_password** | **String** |  | [optional] |
| **ldap_admin_user** | **String** |  | [optional] |
| **ldap_group_search_root** | **String** |  | [optional] |
| **ldap_server_uri** | **String** |  | [optional] |
| **ldap_user_search_root** | **String** |  | [optional] |
| **group_mappings** | [**Array&lt;ConfigLdapConfigurationGroupMappings&gt;**](ConfigLdapConfigurationGroupMappings.md) |  | [optional] |
| **ldap_settings** | [**ConfigLdapConfigurationLdapSettings**](ConfigLdapConfigurationLdapSettings.md) |  | [optional] |
| **security** | [**ConfigLdapConfigurationSecurity**](ConfigLdapConfigurationSecurity.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::ConfigLdapConfiguration.new(
  enabled: null,
  ldap_admin_password: null,
  ldap_admin_user: null,
  ldap_group_search_root: null,
  ldap_server_uri: null,
  ldap_user_search_root: null,
  group_mappings: null,
  ldap_settings: null,
  security: null
)
```

