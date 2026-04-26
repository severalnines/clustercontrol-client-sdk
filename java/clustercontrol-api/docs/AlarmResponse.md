

# AlarmResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operation** | [**OperationEnum**](#OperationEnum) |  |  [optional] |
|**clusterId** | **Integer** |  |  [optional] |
|**alarmId** | **Integer** |  |  [optional] |
|**className** | [**ClassNameEnum**](#ClassNameEnum) |  |  [optional] |
|**ignore** | **Boolean** |  |  [optional] |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| GET_STATISTICS | &quot;getStatistics&quot; |
| GET_ALARM | &quot;getAlarm&quot; |
| GET_ALARMS | &quot;getAlarms&quot; |
| IGNORE_ALARM | &quot;ignoreAlarm&quot; |



## Enum: ClassNameEnum

| Name | Value |
|---- | -----|
| CMON_RPC_REQUEST | &quot;CmonRpcRequest&quot; |



