# SeveralninesClusterControlRestApiV2.Stat

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | **String** |  | 
**clusterId** | **Number** |  | [optional] 
**name** | **String** | stat name. e.g. cpustat | [optional] 
**startDatetime** | **String** | e.g. \&quot;15:20\&quot; | [optional] 
**endDatetime** | **String** | e.g. \&quot;15:21\&quot; | [optional] 
**withHosts** | **Boolean** |  | [optional] 
**calculatePerSec** | **Boolean** |  | [optional] 



## Enum: OperationEnum


* `getInfo` (value: `"getInfo"`)

* `statByName` (value: `"statByName"`)

* `getCpuPhysicalInfo` (value: `"getCpuPhysicalInfo"`)

* `getDbGrowth` (value: `"getDbGrowth"`)





## Enum: NameEnum


* `cpustat` (value: `"cpustat"`)




