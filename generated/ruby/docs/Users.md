# OpenapiClient::Users

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **operation** | **String** |  |  |
| **create_group** | **Boolean** |  | [optional] |
| **new_password** | **String** |  | [optional] |
| **group_name** | **String** |  | [optional] |
| **replace_primary_group** | **Boolean** |  | [optional] |
| **with_tags** | **Array&lt;String&gt;** |  | [optional] |
| **user** | [**UsersUser**](UsersUser.md) |  | [optional] |
| **group** | [**UsersGroup**](UsersGroup.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::Users.new(
  operation: null,
  create_group: null,
  new_password: null,
  group_name: null,
  replace_primary_group: null,
  with_tags: null,
  user: null,
  group: null
)
```

