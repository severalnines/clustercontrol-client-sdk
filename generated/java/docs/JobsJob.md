

# JobsJob


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**className** | **String** |  |  [optional] |
|**jobSpec** | [**JobsJobJobSpec**](JobsJobJobSpec.md) |  |  [optional] |
|**recurrence** | **String** | e.g. \&quot;2 * * * *\&quot; |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**title** | [**TitleEnum**](#TitleEnum) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |



## Enum: TitleEnum

| Name | Value |
|---- | -----|
| ROLLING_RESTART | &quot;Rolling Restart&quot; |
| SIMULATED_SUCCESS | &quot;Simulated Success&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PAUSED | &quot;PAUSED&quot; |
| SCHEDULED | &quot;SCHEDULED&quot; |



