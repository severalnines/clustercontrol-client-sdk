# OpenapiClient::ClustersAccount

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **class_name** | **String** |  | [optional] |
| **grants** | **String** | e.g. \&quot;john:ALL;pipas:INSERT\&quot; | [optional] |
| **host_allow** | **String** | e.g. \&quot;1.2.3.4\&quot; | [optional] |
| **own_database** | **String** |  | [optional] |
| **privileges** | **String** | e.g. \&quot;testCreateDatabase.*:DELETE,TRUNCATE\&quot; | [optional] |
| **user_name** | **String** | e.g. \&quot;pipas\&quot; | [optional] |
| **password** | **String** |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::ClustersAccount.new(
  class_name: null,
  grants: null,
  host_allow: null,
  own_database: null,
  privileges: null,
  user_name: null,
  password: null
)
```

