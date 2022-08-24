

# Backup


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operation** | [**OperationEnum**](#OperationEnum) |  |  |
|**clusterId** | **Integer** |  |  [optional] |
|**ascending** | **Boolean** |  |  [optional] |
|**schedule** | [**BackupSchedule**](BackupSchedule.md) |  |  [optional] |
|**backupRecord** | [**BackupBackupRecord**](BackupBackupRecord.md) |  |  [optional] |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| GETBACKUPS | &quot;getBackups&quot; |
| GETBACKUPSCHEDULES | &quot;getBackupSchedules&quot; |
| SCHEDULEBACKUP | &quot;scheduleBackup&quot; |
| DELETEBACKUPRECORD | &quot;deleteBackupRecord&quot; |



