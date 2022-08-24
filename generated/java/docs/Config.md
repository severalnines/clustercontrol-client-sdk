

# Config


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operation** | [**OperationEnum**](#OperationEnum) |  |  |
|**hostname** | **String** |  |  [optional] |
|**port** | **Integer** |  |  [optional] |
|**_configuration** | [**List&lt;ConfigConfigurationInner&gt;**](ConfigConfigurationInner.md) |  |  [optional] |
|**ldapConfiguration** | [**ConfigLdapConfiguration**](ConfigLdapConfiguration.md) |  |  [optional] |
|**licensedata** | **String** |  |  [optional] |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| GETCONFIG | &quot;getConfig&quot; |
| SETCONFIG | &quot;setConfig&quot; |
| UNSETCONFIG | &quot;unsetConfig&quot; |
| GETLDAPCONFIG | &quot;getLdapConfig&quot; |
| SETLDAPCONFIG | &quot;setLdapConfig&quot; |
| SETLICENSE | &quot;setLicense&quot; |
| GETLICENSE | &quot;getLicense&quot; |
| LISTTEMPLATES | &quot;listTemplates&quot; |



