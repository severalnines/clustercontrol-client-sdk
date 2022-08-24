# OpenapiClient::JobsJob

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **class_name** | **String** |  | [optional] |
| **job_spec** | [**JobsJobJobSpec**](JobsJobJobSpec.md) |  | [optional] |
| **recurrence** | **String** | e.g. \&quot;2 * * * *\&quot; | [optional] |
| **tags** | **Array&lt;String&gt;** |  | [optional] |
| **title** | **String** |  | [optional] |
| **status** | **String** |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::JobsJob.new(
  class_name: null,
  job_spec: null,
  recurrence: null,
  tags: null,
  title: null,
  status: null
)
```

