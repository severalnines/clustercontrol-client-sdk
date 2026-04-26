

# Clusters


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operation** | [**OperationEnum**](#OperationEnum) |  |  |
|**clusterId** | **Integer** |  |  [optional] |
|**clusterName** | **String** |  |  [optional] |
|**withHosts** | **Boolean** |  |  [optional] |
|**withSheetInfo** | **Boolean** |  |  [optional] |
|**_configuration** | [**List&lt;ClustersConfigurationInner&gt;**](ClustersConfigurationInner.md) |  |  [optional] |
|**account** | [**ClustersAccount**](ClustersAccount.md) |  |  [optional] |
|**filterStrings** | **String** |  |  [optional] |
|**limit** | **Integer** |  |  [optional] |
|**offset** | **Integer** |  |  [optional] |
|**database** | [**ClustersDatabase**](ClustersDatabase.md) |  |  [optional] |
|**nodes** | **List&lt;String&gt;** |  |  [optional] |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| GETALLCLUSTERINFO | &quot;getallclusterinfo&quot; |
| GETCLUSTERINFO | &quot;getclusterinfo&quot; |
| GET_CONFIG | &quot;getConfig&quot; |
| SET_CONFIG | &quot;setConfig&quot; |
| CREATE_ACCOUNT | &quot;createAccount&quot; |
| GET_ACCOUNTS | &quot;getAccounts&quot; |
| DELETE_ACCOUNT | &quot;deleteAccount&quot; |
| GRANT_PRIVILEGES | &quot;grantPrivileges&quot; |
| REVOKE_PRIVILEGES | &quot;revokePrivileges&quot; |
| REVOKE_ALL_PRIVILEGES | &quot;revokeAllPrivileges&quot; |
| GET_SQL_PROCESSES | &quot;getSqlProcesses&quot; |
| GET_TOP_QUERIES | &quot;getTopQueries&quot; |
| CREATE_DATABASE | &quot;createDatabase&quot; |
| PING | &quot;ping&quot; |
| AVAILABLE_UPGRADES | &quot;availableUpgrades&quot; |



