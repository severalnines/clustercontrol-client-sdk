# SeveralninesClusterControl.Discovery

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | **String** |  | 
**newClusterName** | **String** |  | [optional] 
**checkIfAlreadyRegistered** | **Boolean** |  | [optional] 
**checkJob** | **Boolean** |  | [optional] 
**checkSshSudo** | **Boolean** |  | [optional] 
**nodes** | [**[DiscoveryNodes]**](DiscoveryNodes.md) |  | [optional] 
**job** | [**DiscoveryJob**](DiscoveryJob.md) |  | [optional] 
**sshCredentials** | [**DiscoverySshCredentials**](DiscoverySshCredentials.md) |  | [optional] 



## Enum: OperationEnum


* `checkClusterName` (value: `"checkClusterName"`)

* `getSupportedClusterTypes` (value: `"getSupportedClusterTypes"`)

* `checkHosts` (value: `"checkHosts"`)




