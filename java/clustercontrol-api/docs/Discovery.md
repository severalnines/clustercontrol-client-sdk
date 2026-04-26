

# Discovery


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operation** | [**OperationEnum**](#OperationEnum) |  |  |
|**newClusterName** | **String** |  |  [optional] |
|**checkIfAlreadyRegistered** | **Boolean** |  |  [optional] |
|**checkJob** | **Boolean** |  |  [optional] |
|**checkSshSudo** | **Boolean** |  |  [optional] |
|**nodes** | [**List&lt;DiscoveryNodesInner&gt;**](DiscoveryNodesInner.md) |  |  [optional] |
|**job** | [**DiscoveryJob**](DiscoveryJob.md) |  |  [optional] |
|**sshCredentials** | [**DiscoverySshCredentials**](DiscoverySshCredentials.md) |  |  [optional] |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| CHECK_CLUSTER_NAME | &quot;checkClusterName&quot; |
| GET_SUPPORTED_CLUSTER_TYPES | &quot;getSupportedClusterTypes&quot; |
| CHECK_HOSTS | &quot;checkHosts&quot; |



