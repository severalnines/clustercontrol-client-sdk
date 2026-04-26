

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
| CREATE_JOB_INSTANCE | &quot;createJobInstance&quot; |
| UPDATE_JOB_INSTANCE | &quot;updateJobInstance&quot; |
| DELETE_JOB_INSTANCE | &quot;deleteJobInstance&quot; |
| KILL_JOB_INSTANCE | &quot;killJobInstance&quot; |
| CLONE_JOB_INSTANCE | &quot;cloneJobInstance&quot; |
| GET_JOB_INSTANCE | &quot;getJobInstance&quot; |
| GET_JOB_INSTANCES | &quot;getJobInstances&quot; |
| GET_JOB_LOG | &quot;getJobLog&quot; |



