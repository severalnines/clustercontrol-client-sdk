

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
| GETCONFIG | &quot;getConfig&quot; |
| SETCONFIG | &quot;setConfig&quot; |
| CREATEACCOUNT | &quot;createAccount&quot; |
| GETACCOUNTS | &quot;getAccounts&quot; |
| DELETEACCOUNT | &quot;deleteAccount&quot; |
| GRANTPRIVILEGES | &quot;grantPrivileges&quot; |
| REVOKEPRIVILEGES | &quot;revokePrivileges&quot; |
| REVOKEALLPRIVILEGES | &quot;revokeAllPrivileges&quot; |
| GETSQLPROCESSES | &quot;getSqlProcesses&quot; |
| GETTOPQUERIES | &quot;getTopQueries&quot; |
| CREATEDATABASE | &quot;createDatabase&quot; |
| PING | &quot;ping&quot; |
| AVAILABLEUPGRADES | &quot;availableUpgrades&quot; |



