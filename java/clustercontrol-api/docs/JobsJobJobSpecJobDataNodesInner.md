

# JobsJobJobSpecJobDataNodesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**className** | [**ClassNameEnum**](#ClassNameEnum) |  |  [optional] |
|**cdtPath** | **String** |  |  [optional] |
|**acl** | **String** |  |  [optional] |
|**clusterid** | **Integer** |  |  [optional] |
|**ip** | **String** |  |  [optional] |
|**maintenanceMode** | [**MaintenanceModeEnum**](#MaintenanceModeEnum) |  |  [optional] |
|**maintenanceModeActive** | **Boolean** |  |  [optional] |
|**timestamp** | **Integer** |  |  [optional] |
|**uniqueId** | **Integer** |  |  [optional] |
|**hostname** | **String** |  |  [optional] |
|**hostnameData** | **String** |  |  [optional] |
|**hostnameInternal** | **String** |  |  [optional] |
|**port** | **String** |  |  [optional] |
|**nodetype** | **String** |  |  [optional] |
|**configfile** | **String** |  |  [optional] |
|**datadir** | **String** |  |  [optional] |
|**backupDir** | **String** |  |  [optional] |
|**synchronous** | **Boolean** |  |  [optional] |
|**protocol** | [**ProtocolEnum**](#ProtocolEnum) |  |  [optional] |
|**roles** | [**RolesEnum**](#RolesEnum) |  |  [optional] |
|**role** | [**RoleEnum**](#RoleEnum) |  |  [optional] |



## Enum: ClassNameEnum

| Name | Value |
|---- | -----|
| CMON_REDIS_HOST | &quot;CmonRedisHost&quot; |
| CMON_REDIS_SENTINEL_HOST | &quot;CmonRedisSentinelHost&quot; |
| CMON_HOST | &quot;CmonHost&quot; |
| CMON_PBM_AGENT_HOST | &quot;CmonPBMAgentHost&quot; |
| CMON_PG_BOUNCER_HOST | &quot;CmonPgBouncerHost&quot; |
| CMON_MS_SQL_HOST | &quot;CmonMsSqlHost&quot; |
| CMON_ELASTIC_HOST | &quot;CmonElasticHost&quot; |
| REDIS_SHARDED_HOST | &quot;RedisShardedHost&quot; |



## Enum: MaintenanceModeEnum

| Name | Value |
|---- | -----|
| NONE | &quot;none&quot; |



## Enum: ProtocolEnum

| Name | Value |
|---- | -----|
| ELASTIC | &quot;elastic&quot; |
| REDIS_SHARDED | &quot;redis-sharded&quot; |



## Enum: RolesEnum

| Name | Value |
|---- | -----|
| MASTER | &quot;master&quot; |
| DATA | &quot;data&quot; |
| MASTER_DATA | &quot;master-data&quot; |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| PRIMARY | &quot;primary&quot; |
| REPLICA | &quot;replica&quot; |



