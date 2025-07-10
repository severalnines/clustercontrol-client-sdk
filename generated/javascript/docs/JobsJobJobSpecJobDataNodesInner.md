# SeveralninesClusterControlRestApiV2.JobsJobJobSpecJobDataNodesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**className** | **String** |  | [optional] 
**cdtPath** | **String** |  | [optional] 
**acl** | **String** |  | [optional] 
**clusterid** | **Number** |  | [optional] 
**ip** | **String** |  | [optional] 
**maintenanceMode** | **String** |  | [optional] 
**maintenanceModeActive** | **Boolean** |  | [optional] 
**timestamp** | **Number** |  | [optional] 
**uniqueId** | **Number** |  | [optional] 
**hostname** | **String** |  | [optional] 
**hostnameData** | **String** |  | [optional] 
**hostnameInternal** | **String** |  | [optional] 
**port** | **String** |  | [optional] 
**nodetype** | **String** |  | [optional] 
**configfile** | **String** |  | [optional] 
**datadir** | **String** |  | [optional] 
**backupDir** | **String** |  | [optional] 
**synchronous** | **Boolean** |  | [optional] 
**protocol** | **String** |  | [optional] 
**roles** | **String** |  | [optional] 
**role** | **String** |  | [optional] 



## Enum: ClassNameEnum


* `CmonRedisHost` (value: `"CmonRedisHost"`)

* `CmonRedisSentinelHost` (value: `"CmonRedisSentinelHost"`)

* `CmonHost` (value: `"CmonHost"`)

* `CmonPBMAgentHost` (value: `"CmonPBMAgentHost"`)

* `CmonPgBouncerHost` (value: `"CmonPgBouncerHost"`)

* `CmonMsSqlHost` (value: `"CmonMsSqlHost"`)

* `CmonElasticHost` (value: `"CmonElasticHost"`)

* `RedisShardedHost` (value: `"RedisShardedHost"`)





## Enum: MaintenanceModeEnum


* `none` (value: `"none"`)





## Enum: ProtocolEnum


* `elastic` (value: `"elastic"`)

* `redis-sharded` (value: `"redis-sharded"`)





## Enum: RolesEnum


* `master` (value: `"master"`)

* `data` (value: `"data"`)

* `master-data` (value: `"master-data"`)





## Enum: RoleEnum


* `primary` (value: `"primary"`)

* `replica` (value: `"replica"`)




