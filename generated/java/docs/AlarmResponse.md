

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
| GETSTATISTICS | &quot;getStatistics&quot; |
| GETALARM | &quot;getAlarm&quot; |
| GETALARMS | &quot;getAlarms&quot; |
| IGNOREALARM | &quot;ignoreAlarm&quot; |



## Enum: ClassNameEnum

| Name | Value |
|---- | -----|
| CMONRPCREQUEST | &quot;CmonRpcRequest&quot; |



