# OpenapiClient::Stat

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **operation** | **String** |  |  |
| **cluster_id** | **Integer** |  | [optional] |
| **name** | **String** | stat name. e.g. cpustat | [optional] |
| **start_datetime** | **String** | e.g. \&quot;15:20\&quot; | [optional] |
| **end_datetime** | **String** | e.g. \&quot;15:21\&quot; | [optional] |
| **with_hosts** | **Boolean** |  | [optional] |
| **calculate_per_sec** | **Boolean** |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::Stat.new(
  operation: null,
  cluster_id: null,
  name: null,
  start_datetime: null,
  end_datetime: null,
  with_hosts: null,
  calculate_per_sec: null
)
```

