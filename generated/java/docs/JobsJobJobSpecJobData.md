

# JobsJobJobSpecJobData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**ActionEnum**](#ActionEnum) |  |  [optional] |
|**addnode** | **Boolean** |  |  [optional] |
|**adminUsername** | **String** |  |  [optional] |
|**adminUser** | **String** |  |  [optional] |
|**adminPassword** | **String** |  |  [optional] |
|**auditEvents** | **String** |  |  [optional] |
|**archiveMode** | [**ArchiveModeEnum**](#ArchiveModeEnum) |  |  [optional] |
|**backupid** | **Integer** |  |  [optional] |
|**backupId** | **Integer** |  |  [optional] |
|**buildFromSource** | **Boolean** |  |  [optional] |
|**clusterName** | **String** |  |  [optional] |
|**clusterid** | **Integer** |  |  [optional] |
|**clusterType** | [**ClusterTypeEnum**](#ClusterTypeEnum) |  |  [optional] |
|**companyId** | **String** |  |  [optional] |
|**configTemplate** | **String** |  |  [optional] |
|**backupFailover** | **Boolean** |  |  [optional] |
|**backupFailoverHost** | [**BackupFailoverHostEnum**](#BackupFailoverHostEnum) |  |  [optional] |
|**backupMethod** | [**BackupMethodEnum**](#BackupMethodEnum) |  |  [optional] |
|**backupMysqldumpType** | [**BackupMysqldumpTypeEnum**](#BackupMysqldumpTypeEnum) |  |  [optional] |
|**backupIndividualSchemas** | **Boolean** |  |  [optional] |
|**backupRetention** | **Integer** |  |  [optional] |
|**extendedInsert** | **Boolean** |  |  [optional] |
|**backupDir** | **String** |  |  [optional] |
|**backupsubdir** | **String** |  |  [optional] |
|**ccStorage** | **String** |  |  [optional] |
|**compression** | **Boolean** |  |  [optional] |
|**compressionLevel** | **Integer** |  |  [optional] |
|**dbDatabase** | **String** |  |  [optional] |
|**dbPassword** | **String** |  |  [optional] |
|**dbPrivs** | **String** |  |  [optional] |
|**dbUsername** | **String** |  |  [optional] |
|**dataCenter** | **Integer** |  |  [optional] |
|**execUpgradeScript** | **Boolean** |  |  [optional] |
|**extended** | **Boolean** |  |  [optional] |
|**listeningPort** | **Integer** |  |  [optional] |
|**maskPasswords** | **Boolean** |  |  [optional] |
|**monitorPassword** | **String** |  |  [optional] |
|**monitorUser** | **String** |  |  [optional] |
|**useClustering** | **Boolean** |  |  [optional] |
|**useRwSplit** | **Boolean** |  |  [optional] |
|**hostname** | **String** |  |  [optional] |
|**masterAddress** | **String** |  |  [optional] |
|**includeDatabases** | **String** |  |  [optional] |
|**installTimescaledb** | **Boolean** |  |  [optional] |
|**updateLb** | **Boolean** |  |  [optional] |
|**usePackageForDataDir** | **Boolean** |  |  [optional] |
|**encryptBackup** | **Boolean** |  |  [optional] |
|**throttleRateNetbw** | **Integer** |  |  [optional] |
|**usePigz** | **Boolean** |  |  [optional] |
|**useQpress** | **Boolean** |  |  [optional] |
|**wsrepDesync** | **Boolean** |  |  [optional] |
|**xtrabackupBackupLocks** | **Boolean** |  |  [optional] |
|**xtrabackupLockDdlPerTable** | **Boolean** |  |  [optional] |
|**xtrabackupParallellism** | **Integer** |  |  [optional] |
|**verifyBackupDelay** | **Integer** |  |  [optional] |
|**dataDir** | **String** |  |  [optional] |
|**dbUser** | **String** |  |  [optional] |
|**disableFirewall** | **Boolean** |  |  [optional] |
|**disableSelinux** | **Boolean** |  |  [optional] |
|**enableUninstall** | **Boolean** |  |  [optional] |
|**generateToken** | **Boolean** |  |  [optional] |
|**installSoftware** | **Boolean** |  |  [optional] |
|**useInternalRepos** | **Boolean** |  |  [optional] |
|**localRepository** | **String** |  |  [optional] |
|**enableMysqlUninstall** | **Boolean** |  |  [optional] |
|**mysqlSemiSync** | **Boolean** |  |  [optional] |
|**enableSsl** | **Boolean** |  |  [optional] |
|**mongosConfTemplate** | **String** |  |  [optional] |
|**mongodbAuthdb** | **String** |  |  [optional] |
|**nodeType** | **Integer** |  |  [optional] |
|**overwriteMysqlchk** | **Boolean** |  |  [optional] |
|**port** | **Integer** |  |  [optional] |
|**sshKeyfile** | **String** |  |  [optional] |
|**sshPort** | **String** |  |  [optional] |
|**sshUser** | **String** |  |  [optional] |
|**sudoPassword** | **String** |  |  [optional] |
|**userId** | **Integer** |  |  [optional] |
|**vendor** | [**VendorEnum**](#VendorEnum) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**version** | **String** |  |  [optional] |
|**softwarePackage** | **String** |  |  [optional] |
|**serverAddress** | **String** |  |  [optional] |
|**terminateDbServer** | **Boolean** |  |  [optional] |
|**xtrabackupUseMemory** | **Integer** |  |  [optional] |
|**initial** | **Boolean** |  |  [optional] |
|**reboot** | **Boolean** |  |  [optional] |
|**slaveAddress** | **String** |  |  [optional] |
|**force** | **Boolean** |  |  [optional] |
|**forceStop** | **Boolean** |  |  [optional] |
|**stopTimeout** | **Integer** |  |  [optional] |
|**pitrStopTime** | **String** |  |  [optional] |
|**pitrStopLog** | **String** |  |  [optional] |
|**pitrStopPos** | **Integer** |  |  [optional] |
|**hostLocationUuid** | **String** |  |  [optional] |
|**bootstrap** | **Boolean** |  |  [optional] |
|**uploadBackupDataToCloudStorage** | [**JobsJobJobSpecJobDataUploadBackupDataToCloudStorage**](JobsJobJobSpecJobDataUploadBackupDataToCloudStorage.md) |  |  [optional] |
|**verifyBackup** | [**BackupScheduleJobJobDataVerifyBackup**](BackupScheduleJobJobDataVerifyBackup.md) |  |  [optional] |
|**configServers** | [**JobsJobJobSpecJobDataConfigServers**](JobsJobJobSpecJobDataConfigServers.md) |  |  [optional] |
|**mongosServers** | [**List&lt;JobsJobJobSpecJobDataConfigServersMembersInner&gt;**](JobsJobJobSpecJobDataConfigServersMembersInner.md) |  |  [optional] |
|**node** | [**JobsJobJobSpecJobDataNode**](JobsJobJobSpecJobDataNode.md) |  |  [optional] |
|**nodes** | [**List&lt;JobsJobJobSpecJobDataNodesInner&gt;**](JobsJobJobSpecJobDataNodesInner.md) |  |  [optional] |
|**nodeAdresses** | [**List&lt;JobsJobJobSpecJobDataNodeAdressesInner&gt;**](JobsJobJobSpecJobDataNodeAdressesInner.md) |  |  [optional] |
|**topology** | [**JobsJobJobSpecJobDataTopology**](JobsJobJobSpecJobDataTopology.md) |  |  [optional] |
|**replicaSets** | [**List&lt;JobsJobJobSpecJobDataReplicaSetsInner&gt;**](JobsJobJobSpecJobDataReplicaSetsInner.md) |  |  [optional] |
|**withTags** | **List&lt;String&gt;** |  |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| ENABLE | &quot;enable&quot; |
| SETUP | &quot;setup&quot; |
| SETUPHAPROXY | &quot;setupHaProxy&quot; |
| SETUPPROXYSQL | &quot;setupProxySql&quot; |



## Enum: ArchiveModeEnum

| Name | Value |
|---- | -----|
| ALWAYS | &quot;always&quot; |



## Enum: ClusterTypeEnum

| Name | Value |
|---- | -----|
| MSSQL_SINGLE | &quot;mssql_single&quot; |
| REDIS | &quot;redis&quot; |
| MONGODB | &quot;mongodb&quot; |
| MSSQL_AO_ASYNC | &quot;mssql_ao_async&quot; |
| POSTGRESQL_SINGLE | &quot;postgresql_single&quot; |
| REPLICATION | &quot;replication&quot; |
| GALERA | &quot;galera&quot; |
| ELASTIC | &quot;elastic&quot; |



## Enum: BackupFailoverHostEnum

| Name | Value |
|---- | -----|
| AUTO | &quot;auto&quot; |



## Enum: BackupMethodEnum

| Name | Value |
|---- | -----|
| XTRABACKUPFULL | &quot;xtrabackupfull&quot; |
| XTRABACKUPINCR | &quot;xtrabackupincr&quot; |
| PGBACKRESTFULL | &quot;pgbackrestfull&quot; |
| PGBACKRESTINCR | &quot;pgbackrestincr&quot; |
| PGBACKRESTDIFF | &quot;pgbackrestdiff&quot; |
| PG_BASEBACKUP | &quot;pg_basebackup&quot; |
| MYSQLDUMP | &quot;mysqldump&quot; |
| PERCONA_BACKUP_MONGODB | &quot;percona-backup-mongodb&quot; |
| MSSQLCERT | &quot;mssqlcert&quot; |



## Enum: BackupMysqldumpTypeEnum

| Name | Value |
|---- | -----|
| COMPLETE | &quot;Complete&quot; |
| SCHEMAANDDATA | &quot;SchemaAndData&quot; |
| SCHEMAONLY | &quot;SchemaOnly&quot; |
| DATAONLY | &quot;DataOnly&quot; |
| MYSQLDBONLY | &quot;MySQLDbOnly&quot; |



## Enum: VendorEnum

| Name | Value |
|---- | -----|
| DEFAULT | &quot;default&quot; |
| PERCONA | &quot;percona&quot; |
| MICROSOFT | &quot;microsoft&quot; |
| REDIS | &quot;redis&quot; |
| ORACLE | &quot;oracle&quot; |
| MARIADB | &quot;mariadb&quot; |
| ELASTICSEARCH | &quot;elasticsearch&quot; |
| _10GEN | &quot;10gen&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| POSTGRESQL | &quot;postgresql&quot; |
| REDIS | &quot;redis&quot; |
| MICROSOFT | &quot;microsoft&quot; |
| ELASTICSEARCH | &quot;elasticsearch&quot; |
| MYSQL | &quot;mysql&quot; |
| MONGODB | &quot;mongodb&quot; |



