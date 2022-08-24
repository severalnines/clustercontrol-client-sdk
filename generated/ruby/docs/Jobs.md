# OpenapiClient::Jobs

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **operation** | **String** |  |  |
| **cluster_id** | **Integer** |  | [optional] |
| **job_id** | **Integer** |  | [optional] |
| **signal** | **Integer** |  | [optional] |
| **ascending** | **Boolean** |  | [optional] |
| **limit** | **Integer** |  | [optional] |
| **offset** | **Integer** |  | [optional] |
| **log_level** | **String** |  | [optional] |
| **job** | [**JobsJob**](JobsJob.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::Jobs.new(
  operation: null,
  cluster_id: null,
  job_id: null,
  signal: null,
  ascending: null,
  limit: null,
  offset: null,
  log_level: null,
  job: null
)
```

