# SeveralninesClusterControlRestApiV2.BackupScheduleJobJobData

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
**ccStorage** | **Boolean** |  | [optional] 
**compression** | **Boolean** |  | [optional] 
**compresionLevel** | **Number** |  | [optional] 
**encryptBackup** | **Boolean** |  | [optional] 
**hostname** | **String** |  | [optional] 
**port** | **Number** |  | [optional] 
**verifyBackupDelay** | **Number** |  | [optional] 
**verifyBackup** | [**BackupScheduleJobJobDataVerifyBackup**](BackupScheduleJobJobDataVerifyBackup.md) |  | [optional] 



## Enum: BackupFailoverHostEnum


* `auto` (value: `"auto"`)





## Enum: BackupMethodEnum


* `pg_basebackup` (value: `"pg_basebackup"`)

* `xtrabackupfull` (value: `"xtrabackupfull"`)

* `xtrabackupincr` (value: `"xtrabackupincr"`)

* `pgbackrestfull` (value: `"pgbackrestfull"`)

* `pgbackrestincr` (value: `"pgbackrestincr"`)

* `pgbackrestdiff` (value: `"pgbackrestdiff"`)

* `mysqldump` (value: `"mysqldump"`)

* `mongodump` (value: `"mongodump"`)

* `percona-backup-mongodb` (value: `"percona-backup-mongodb"`)

* `pgdumpall` (value: `"pgdumpall"`)

* `mariabackupfull` (value: `"mariabackupfull"`)

* `mariabackupincr` (value: `"mariabackupincr"`)

* `mssqlcert` (value: `"mssqlcert"`)

* `ndb` (value: `"ndb"`)




