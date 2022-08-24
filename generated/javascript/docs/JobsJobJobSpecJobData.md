# SeveralninesClusterControl.JobsJobJobSpecJobData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **String** |  | [optional] 
**addnode** | **Boolean** |  | [optional] 
**adminUsername** | **String** |  | [optional] 
**adminUser** | **String** |  | [optional] 
**adminPassword** | **String** |  | [optional] 
**auditEvents** | **String** |  | [optional] 
**archiveMode** | **String** |  | [optional] 
**backupid** | **Number** |  | [optional] 
**backupId** | **Number** |  | [optional] 
**buildFromSource** | **Boolean** |  | [optional] 
**clusterName** | **String** |  | [optional] 
**clusterid** | **Number** |  | [optional] 
**clusterType** | **String** |  | [optional] 
**companyId** | **String** |  | [optional] 
**configTemplate** | **String** |  | [optional] 
**backupFailover** | **Boolean** |  | [optional] 
**backupFailoverHost** | **String** |  | [optional] 
**backupMethod** | **String** |  | [optional] 
**backupMysqldumpType** | **String** |  | [optional] 
**backupIndividualSchemas** | **Boolean** |  | [optional] 
**backupRetention** | **Number** |  | [optional] 
**extendedInsert** | **Boolean** |  | [optional] 
**backupDir** | **String** |  | [optional] 
**backupsubdir** | **String** |  | [optional] 
**ccStorage** | **String** |  | [optional] 
**compression** | **Boolean** |  | [optional] 
**compressionLevel** | **Number** |  | [optional] 
**dbDatabase** | **String** |  | [optional] 
**dbPassword** | **String** |  | [optional] 
**dbPrivs** | **String** |  | [optional] 
**dbUsername** | **String** |  | [optional] 
**dataCenter** | **Number** |  | [optional] 
**execUpgradeScript** | **Boolean** |  | [optional] 
**extended** | **Boolean** |  | [optional] 
**listeningPort** | **Number** |  | [optional] 
**maskPasswords** | **Boolean** |  | [optional] 
**monitorPassword** | **String** |  | [optional] 
**monitorUser** | **String** |  | [optional] 
**useClustering** | **Boolean** |  | [optional] 
**useRwSplit** | **Boolean** |  | [optional] 
**hostname** | **String** |  | [optional] 
**masterAddress** | **String** |  | [optional] 
**includeDatabases** | **String** |  | [optional] 
**installTimescaledb** | **Boolean** |  | [optional] 
**updateLb** | **Boolean** |  | [optional] 
**encryptBackup** | **Boolean** |  | [optional] 
**throttleRateNetbw** | **Number** |  | [optional] 
**usePigz** | **Boolean** |  | [optional] 
**useQpress** | **Boolean** |  | [optional] 
**wsrepDesync** | **Boolean** |  | [optional] 
**xtrabackupBackupLocks** | **Boolean** |  | [optional] 
**xtrabackupLockDdlPerTable** | **Boolean** |  | [optional] 
**xtrabackupParallellism** | **Number** |  | [optional] 
**verifyBackupDelay** | **Number** |  | [optional] 
**dataDir** | **String** |  | [optional] 
**dbUser** | **String** |  | [optional] 
**disableFirewall** | **Boolean** |  | [optional] 
**disableSelinux** | **Boolean** |  | [optional] 
**enablUninstall** | **Boolean** |  | [optional] 
**generateToken** | **Boolean** |  | [optional] 
**installSoftware** | **Boolean** |  | [optional] 
**enableMysqlUninstall** | **Boolean** |  | [optional] 
**mysqlSemiSync** | **Boolean** |  | [optional] 
**enableSsl** | **Boolean** |  | [optional] 
**mongosConfTemplate** | **String** |  | [optional] 
**mongodbAuthdb** | **String** |  | [optional] 
**nodeType** | **Number** |  | [optional] 
**overwriteMysqlchk** | **Boolean** |  | [optional] 
**port** | **Number** |  | [optional] 
**sshKeyfile** | **String** |  | [optional] 
**sshPort** | **String** |  | [optional] 
**sshUser** | **String** |  | [optional] 
**sudoPassword** | **String** |  | [optional] 
**type** | **String** |  | [optional] 
**userId** | **Number** |  | [optional] 
**vendor** | **String** |  | [optional] 
**version** | **String** |  | [optional] 
**softwarePackage** | **String** |  | [optional] 
**serverAddress** | **String** |  | [optional] 
**terminateDbServer** | **Boolean** |  | [optional] 
**xtrabackupUseMemory** | **Number** |  | [optional] 
**initial** | **Boolean** |  | [optional] 
**reboot** | **Boolean** |  | [optional] 
**slaveAddress** | **String** |  | [optional] 
**force** | **Boolean** |  | [optional] 
**forceStop** | **Boolean** |  | [optional] 
**stopTimeout** | **Number** |  | [optional] 
**verifyBackup** | [**BackupScheduleJobJobDataVerifyBackup**](BackupScheduleJobJobDataVerifyBackup.md) |  | [optional] 
**configServers** | [**JobsJobJobSpecJobDataConfigServers**](JobsJobJobSpecJobDataConfigServers.md) |  | [optional] 
**mongosServers** | [**[JobsJobJobSpecJobDataConfigServersMembers]**](JobsJobJobSpecJobDataConfigServersMembers.md) |  | [optional] 
**node** | [**JobsJobJobSpecJobDataNode**](JobsJobJobSpecJobDataNode.md) |  | [optional] 
**nodes** | [**[JobsJobJobSpecJobDataNodes]**](JobsJobJobSpecJobDataNodes.md) |  | [optional] 
**nodeAdresses** | [**[JobsJobJobSpecJobDataNodeAdresses]**](JobsJobJobSpecJobDataNodeAdresses.md) |  | [optional] 
**topology** | [**JobsJobJobSpecJobDataTopology**](JobsJobJobSpecJobDataTopology.md) |  | [optional] 
**replicaSets** | [**[JobsJobJobSpecJobDataReplicaSets]**](JobsJobJobSpecJobDataReplicaSets.md) |  | [optional] 
**withTags** | **[String]** |  | [optional] 



## Enum: ActionEnum


* `enable` (value: `"enable"`)

* `setup` (value: `"setup"`)

* `setupHaProxy` (value: `"setupHaProxy"`)

* `setupProxySql` (value: `"setupProxySql"`)





## Enum: ArchiveModeEnum


* `always` (value: `"always"`)





## Enum: ClusterTypeEnum


* `mssql_single` (value: `"mssql_single"`)

* `redis` (value: `"redis"`)

* `mongodb` (value: `"mongodb"`)

* `mssql_ao_async` (value: `"mssql_ao_async"`)

* `postgresql_single` (value: `"postgresql_single"`)

* `replication` (value: `"replication"`)

* `galera` (value: `"galera"`)





## Enum: BackupFailoverHostEnum


* `auto` (value: `"auto"`)





## Enum: BackupMethodEnum


* `xtrabackupfull` (value: `"xtrabackupfull"`)

* `xtrabackupincr` (value: `"xtrabackupincr"`)

* `pgbackrestfull` (value: `"pgbackrestfull"`)

* `pgbackrestincr` (value: `"pgbackrestincr"`)

* `pgbackrestdiff` (value: `"pgbackrestdiff"`)

* `pg_basebackup` (value: `"pg_basebackup"`)

* `mysqldump` (value: `"mysqldump"`)

* `percona-backup-mongodb` (value: `"percona-backup-mongodb"`)

* `mssqlcert` (value: `"mssqlcert"`)





## Enum: BackupMysqldumpTypeEnum


* `Complete` (value: `"Complete"`)

* `SchemaAndData` (value: `"SchemaAndData"`)

* `SchemaOnly` (value: `"SchemaOnly"`)

* `DataOnly` (value: `"DataOnly"`)

* `MySQLDbOnly` (value: `"MySQLDbOnly"`)





## Enum: VendorEnum


* `defalt` (value: `"defalt"`)

* `percona` (value: `"percona"`)

* `microsoft` (value: `"microsoft"`)

* `redis` (value: `"redis"`)




