

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
| START_SERVERS | &quot;startServers&quot; |
| SHUTDOWN_SERVERS | &quot;shutdownServers&quot; |
| REGISTER_SERVERS | &quot;registerServers&quot; |
| UNREGISTER_SERVERS | &quot;unregisterServers&quot; |
| UNREGISTER_HOST | &quot;unregisterHost&quot; |



