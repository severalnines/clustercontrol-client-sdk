

# Host


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operation** | [**OperationEnum**](#OperationEnum) |  |  |
|**servers** | [**List&lt;HostServersInner&gt;**](HostServersInner.md) |  |  [optional] |
|**clusterId** | **Integer** |  |  [optional] |
|**dryRun** | **Boolean** |  |  [optional] |
|**host** | [**HostHost**](HostHost.md) |  |  [optional] |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| STARTSERVERS | &quot;startServers&quot; |
| SHUTDOWNSERVERS | &quot;shutdownServers&quot; |
| REGISTERSERVERS | &quot;registerServers&quot; |
| UNREGISTERSERVERS | &quot;unregisterServers&quot; |
| UNREGISTERHOST | &quot;unregisterHost&quot; |



