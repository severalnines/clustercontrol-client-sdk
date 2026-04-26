

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
| GET_CONFIG | &quot;getConfig&quot; |
| SET_CONFIG | &quot;setConfig&quot; |
| UNSET_CONFIG | &quot;unsetConfig&quot; |
| GET_LDAP_CONFIG | &quot;getLdapConfig&quot; |
| SET_LDAP_CONFIG | &quot;setLdapConfig&quot; |
| SET_LICENSE | &quot;setLicense&quot; |
| GET_LICENSE | &quot;getLicense&quot; |
| LIST_TEMPLATES | &quot;listTemplates&quot; |



