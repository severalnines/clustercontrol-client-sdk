# SeveralninesClusterControl.BackupScheduleJobJobData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** |  | [optional] 
**backupFailover** | **Boolean** |  | [optional] 
**backupFailoverHost** | **String** |  | [optional] 
**backupMethod** | **String** |  | [optional] 
**backupRetention** | **Number** |  | [optional] 
**backupdir** | **String** |  | [optional] 
**backupsubdir** | **String** |  | [optional] 
**ccStorage** | **String** |  | [optional] 
**compression** | **Boolean** |  | [optional] 
**compresionLevel** | **Number** |  | [optional] 
**hostname** | **String** |  | [optional] 
**port** | **Number** |  | [optional] 
**verifyBackupDelay** | **Number** |  | [optional] 
**verifyBackup** | [**BackupScheduleJobJobDataVerifyBackup**](BackupScheduleJobJobDataVerifyBackup.md) |  | [optional] 



## Enum: BackupFailoverHostEnum


* `auto` (value: `"auto"`)





## Enum: BackupMethodEnum


* `pg_basebackup` (value: `"pg_basebackup"`)




