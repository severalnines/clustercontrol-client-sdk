# SeveralninesClusterControlRestApiV2.Backup

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | **String** |  | 
**clusterId** | **Number** |  | [optional] 
**ascending** | **Boolean** |  | [optional] 
**order** | **String** |  | [optional] 
**backupRecordVersion** | **Number** |  | [optional] 
**limit** | **Number** |  | [optional] 
**offset** | **Number** |  | [optional] 
**schedule** | [**BackupSchedule**](BackupSchedule.md) |  | [optional] 
**backupRecord** | [**BackupBackupRecord**](BackupBackupRecord.md) |  | [optional] 



## Enum: OperationEnum


* `getBackups` (value: `"getBackups"`)

* `getBackupSchedules` (value: `"getBackupSchedules"`)

* `scheduleBackup` (value: `"scheduleBackup"`)

* `deleteBackupRecord` (value: `"deleteBackupRecord"`)




