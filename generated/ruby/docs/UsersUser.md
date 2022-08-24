# OpenapiClient::UsersUser

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **class_name** | **String** |  | [optional] |
| **user_name** | **String** |  | [optional] |
| **email_address** | **String** |  | [optional] |
| **new_password** | **String** |  | [optional] |
| **old_password** | **String** |  | [optional] |
| **groups** | [**Array&lt;UsersUserGroups&gt;**](UsersUserGroups.md) |  | [optional] |
| **public_keys** | [**Array&lt;UsersUserPublicKeys&gt;**](UsersUserPublicKeys.md) |  | [optional] |
| **public_key** | [**Array&lt;UsersUserPublicKeys&gt;**](UsersUserPublicKeys.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::UsersUser.new(
  class_name: null,
  user_name: null,
  email_address: null,
  new_password: null,
  old_password: null,
  groups: null,
  public_keys: null,
  public_key: null
)
```

