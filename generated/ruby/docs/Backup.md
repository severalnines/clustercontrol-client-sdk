# OpenapiClient::Backup

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **operation** | **String** |  |  |
| **cluster_id** | **Integer** |  | [optional] |
| **ascending** | **Boolean** |  | [optional] |
| **schedule** | [**BackupSchedule**](BackupSchedule.md) |  | [optional] |
| **backup_record** | [**BackupBackupRecord**](BackupBackupRecord.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::Backup.new(
  operation: null,
  cluster_id: null,
  ascending: null,
  schedule: null,
  backup_record: null
)
```

