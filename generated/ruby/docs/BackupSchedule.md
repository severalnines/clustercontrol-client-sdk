# OpenapiClient::BackupSchedule

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **class_name** | **String** |  | [optional] |
| **enabled** | **Boolean** |  | [optional] |
| **schedule** | **String** |  | [optional] |
| **job** | [**BackupScheduleJob**](BackupScheduleJob.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::BackupSchedule.new(
  class_name: null,
  enabled: null,
  schedule: null,
  job: null
)
```

