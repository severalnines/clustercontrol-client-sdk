# OpenapiClient::StatPrometheus

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **operation** | **String** |  |  |
| **cluster_id** | **Integer** |  | [optional] |
| **cluster_name** | **String** |  | [optional] |
| **queries** | [**Array&lt;StatPrometheusQueries&gt;**](StatPrometheusQueries.md) |  | [optional] |
| **start** | **Integer** | Seconds since 1970. e.g. 1622105617 | [optional] |
| **_end** | **Integer** | Seconds since 1970. e.g. 1622108317 | [optional] |
| **step** | **Integer** |  | [optional] |
| **returnfrom** | **Integer** |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::StatPrometheus.new(
  operation: null,
  cluster_id: null,
  cluster_name: null,
  queries: null,
  start: null,
  _end: null,
  step: null,
  returnfrom: null
)
```

