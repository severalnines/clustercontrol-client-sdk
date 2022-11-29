

# BackupScheduleJobJobData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  |  [optional] |
|**backupFailover** | **Boolean** |  |  [optional] |
|**backupFailoverHost** | [**BackupFailoverHostEnum**](#BackupFailoverHostEnum) |  |  [optional] |
|**backupMethod** | [**BackupMethodEnum**](#BackupMethodEnum) |  |  [optional] |
|**backupRetention** | **Integer** |  |  [optional] |
|**backupdir** | **String** |  |  [optional] |
|**backupsubdir** | **String** |  |  [optional] |
|**ccStorage** | **String** |  |  [optional] |
|**compression** | **Boolean** |  |  [optional] |
|**compresionLevel** | **Integer** |  |  [optional] |
|**encryptBackup** | **Boolean** |  |  [optional] |
|**hostname** | **String** |  |  [optional] |
|**port** | **Integer** |  |  [optional] |
|**verifyBackupDelay** | **Integer** |  |  [optional] |
|**verifyBackup** | [**BackupScheduleJobJobDataVerifyBackup**](BackupScheduleJobJobDataVerifyBackup.md) |  |  [optional] |



## Enum: BackupFailoverHostEnum

| Name | Value |
|---- | -----|
| AUTO | &quot;auto&quot; |



## Enum: BackupMethodEnum

| Name | Value |
|---- | -----|
| PG_BASEBACKUP | &quot;pg_basebackup&quot; |
| XTRABACKUPFULL | &quot;xtrabackupfull&quot; |
| XTRABACKUPINCR | &quot;xtrabackupincr&quot; |
| PGBACKRESTFULL | &quot;pgbackrestfull&quot; |
| PGBACKRESTINCR | &quot;pgbackrestincr&quot; |
| PGBACKRESTDIFF | &quot;pgbackrestdiff&quot; |
| MYSQLDUMP | &quot;mysqldump&quot; |
| MONGODUMP | &quot;mongodump&quot; |
| PERCONA_BACKUP_MONGODB | &quot;percona-backup-mongodb&quot; |
| PGDUMPALL | &quot;pgdumpall&quot; |
| MARIABACKUPFULL | &quot;mariabackupfull&quot; |
| MARIABACKUPINCR | &quot;mariabackupincr&quot; |
| MSSQLCERT | &quot;mssqlcert&quot; |
| NDB | &quot;ndb&quot; |



