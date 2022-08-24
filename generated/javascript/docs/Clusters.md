# SeveralninesClusterControl.Clusters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | **String** |  | 
**clusterId** | **Number** |  | [optional] 
**clusterName** | **String** |  | [optional] 
**withHosts** | **Boolean** |  | [optional] 
**withSheetInfo** | **Boolean** |  | [optional] 
**configuration** | [**[ClustersConfiguration]**](ClustersConfiguration.md) |  | [optional] 
**account** | [**ClustersAccount**](ClustersAccount.md) |  | [optional] 
**filterStrings** | **String** |  | [optional] 
**limit** | **Number** |  | [optional] 
**offset** | **Number** |  | [optional] 
**database** | [**ClustersDatabase**](ClustersDatabase.md) |  | [optional] 
**nodes** | **[String]** |  | [optional] 



## Enum: OperationEnum


* `getallclusterinfo` (value: `"getallclusterinfo"`)

* `getclusterinfo` (value: `"getclusterinfo"`)

* `getConfig` (value: `"getConfig"`)

* `setConfig` (value: `"setConfig"`)

* `createAccount` (value: `"createAccount"`)

* `getAccounts` (value: `"getAccounts"`)

* `deleteAccount` (value: `"deleteAccount"`)

* `grantPrivileges` (value: `"grantPrivileges"`)

* `revokePrivileges` (value: `"revokePrivileges"`)

* `revokeAllPrivileges` (value: `"revokeAllPrivileges"`)

* `getSqlProcesses` (value: `"getSqlProcesses"`)

* `getTopQueries` (value: `"getTopQueries"`)

* `createDatabase` (value: `"createDatabase"`)

* `ping` (value: `"ping"`)

* `availableUpgrades` (value: `"availableUpgrades"`)




