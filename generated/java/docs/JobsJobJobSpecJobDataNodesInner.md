

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



## Enum: ClassNameEnum

| Name | Value |
|---- | -----|
| CMONREDISHOST | &quot;CmonRedisHost&quot; |
| CMONREDISSENTINELHOST | &quot;CmonRedisSentinelHost&quot; |
| CMONHOST | &quot;CmonHost&quot; |
| CMONPBMAGENTHOST | &quot;CmonPBMAgentHost&quot; |
| CMONPGBOUNCERHOST | &quot;CmonPgBouncerHost&quot; |
| CMONMSSQLHOST | &quot;CmonMsSqlHost&quot; |
| CMONELASTICHOST | &quot;CmonElasticHost&quot; |



## Enum: MaintenanceModeEnum

| Name | Value |
|---- | -----|
| NONE | &quot;none&quot; |



## Enum: ProtocolEnum

| Name | Value |
|---- | -----|
| ELASTIC | &quot;elastic&quot; |



## Enum: RolesEnum

| Name | Value |
|---- | -----|
| MASTER | &quot;master&quot; |
| DATA | &quot;data&quot; |
| MASTER_DATA | &quot;master-data&quot; |



