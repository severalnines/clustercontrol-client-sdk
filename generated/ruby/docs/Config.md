# OpenapiClient::Config

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **operation** | **String** |  |  |
| **hostname** | **String** |  | [optional] |
| **port** | **Integer** |  | [optional] |
| **configuration** | [**Array&lt;ConfigConfiguration&gt;**](ConfigConfiguration.md) |  | [optional] |
| **ldap_configuration** | [**ConfigLdapConfiguration**](ConfigLdapConfiguration.md) |  | [optional] |
| **licensedata** | **String** |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::Config.new(
  operation: null,
  hostname: null,
  port: null,
  configuration: null,
  ldap_configuration: null,
  licensedata: null
)
```

