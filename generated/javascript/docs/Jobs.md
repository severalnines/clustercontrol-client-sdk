# SeveralninesClusterControlRestApiV2.Jobs

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | **String** |  | 
**clusterId** | **Number** |  | [optional] 
**jobId** | **Number** |  | [optional] 
**signal** | **Number** |  | [optional] 
**ascending** | **Boolean** |  | [optional] 
**limit** | **Number** |  | [optional] 
**offset** | **Number** |  | [optional] 
**logLevel** | **String** |  | [optional] 
**job** | [**JobsJob**](JobsJob.md) |  | [optional] 



## Enum: OperationEnum


* `createJobInstance` (value: `"createJobInstance"`)

* `updateJobInstance` (value: `"updateJobInstance"`)

* `deleteJobInstance` (value: `"deleteJobInstance"`)

* `killJobInstance` (value: `"killJobInstance"`)

* `cloneJobInstance` (value: `"cloneJobInstance"`)

* `getJobInstance` (value: `"getJobInstance"`)

* `getJobInstances` (value: `"getJobInstances"`)

* `getJobLog` (value: `"getJobLog"`)




