

# Jobs

Creating and manipulating jobs, reading information about jobs

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operation** | [**OperationEnum**](#OperationEnum) |  |  |
|**clusterId** | **Integer** |  |  [optional] |
|**jobId** | **Integer** |  |  [optional] |
|**signal** | **Integer** |  |  [optional] |
|**ascending** | **Boolean** |  |  [optional] |
|**limit** | **Integer** |  |  [optional] |
|**offset** | **Integer** |  |  [optional] |
|**logLevel** | **String** |  |  [optional] |
|**job** | [**JobsJob**](JobsJob.md) |  |  [optional] |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| CREATEJOBINSTANCE | &quot;createJobInstance&quot; |
| UPDATEJOBINSTANCE | &quot;updateJobInstance&quot; |
| DELETEJOBINSTANCE | &quot;deleteJobInstance&quot; |
| KILLJOBINSTANCE | &quot;killJobInstance&quot; |
| CLONEJOBINSTANCE | &quot;cloneJobInstance&quot; |
| GETJOBINSTANCE | &quot;getJobInstance&quot; |
| GETJOBINSTANCES | &quot;getJobInstances&quot; |
| GETJOBLOG | &quot;getJobLog&quot; |



