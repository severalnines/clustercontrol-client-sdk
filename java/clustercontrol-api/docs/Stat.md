

# Stat


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operation** | [**OperationEnum**](#OperationEnum) |  |  |
|**clusterId** | **Integer** |  |  [optional] |
|**name** | [**NameEnum**](#NameEnum) | stat name. e.g. cpustat |  [optional] |
|**startDatetime** | **String** | e.g. \&quot;15:20\&quot; |  [optional] |
|**endDatetime** | **String** | e.g. \&quot;15:21\&quot; |  [optional] |
|**withHosts** | **Boolean** |  |  [optional] |
|**calculatePerSec** | **Boolean** |  |  [optional] |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| GET_INFO | &quot;getInfo&quot; |
| STAT_BY_NAME | &quot;statByName&quot; |
| GET_CPU_PHYSICAL_INFO | &quot;getCpuPhysicalInfo&quot; |
| GET_DB_GROWTH | &quot;getDbGrowth&quot; |



## Enum: NameEnum

| Name | Value |
|---- | -----|
| CPUSTAT | &quot;cpustat&quot; |



