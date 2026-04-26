

# Backup


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operation** | [**OperationEnum**](#OperationEnum) |  |  |
|**clusterId** | **Integer** |  |  [optional] |
|**ascending** | **Boolean** |  |  [optional] |
|**order** | **String** |  |  [optional] |
|**backupRecordVersion** | **Integer** |  |  [optional] |
|**limit** | **Integer** |  |  [optional] |
|**offset** | **Integer** |  |  [optional] |
|**schedule** | [**BackupSchedule**](BackupSchedule.md) |  |  [optional] |
|**backupRecord** | [**BackupBackupRecord**](BackupBackupRecord.md) |  |  [optional] |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| GET_BACKUPS | &quot;getBackups&quot; |
| GET_BACKUP_SCHEDULES | &quot;getBackupSchedules&quot; |
| SCHEDULE_BACKUP | &quot;scheduleBackup&quot; |
| DELETE_BACKUP_RECORD | &quot;deleteBackupRecord&quot; |



