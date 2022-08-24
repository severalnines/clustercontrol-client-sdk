# BackupScheduleJobJobData


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** |  | [optional] 
**backup_failover** | **bool** |  | [optional] 
**backup_failover_host** | **str** |  | [optional]  if omitted the server will use the default value of "auto"
**backup_method** | **str** |  | [optional]  if omitted the server will use the default value of "pg_basebackup"
**backup_retention** | **int** |  | [optional] 
**backupdir** | **str** |  | [optional] 
**backupsubdir** | **str** |  | [optional] 
**cc_storage** | **str** |  | [optional] 
**compression** | **bool** |  | [optional] 
**compresion_level** | **int** |  | [optional] 
**encrypt_backup** | **bool** |  | [optional] 
**hostname** | **str** |  | [optional] 
**port** | **int** |  | [optional] 
**verify_backup_delay** | **int** |  | [optional] 
**verify_backup** | [**BackupScheduleJobJobDataVerifyBackup**](BackupScheduleJobJobDataVerifyBackup.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


