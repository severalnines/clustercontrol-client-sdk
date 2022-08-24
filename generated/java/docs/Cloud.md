

# Cloud


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operation** | [**OperationEnum**](#OperationEnum) |  |  |
|**provider** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**comment** | **String** |  |  [optional] |
|**id** | **Integer** |  |  [optional] |
|**credentials** | [**CloudCredentials**](CloudCredentials.md) |  |  [optional] |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| VERIFYCREDENTIALS | &quot;verifyCredentials&quot; |
| LISTCREDENTIALS | &quot;listCredentials&quot; |
| GETCREDENTIALS | &quot;getCredentials&quot; |
| ADDCREDENTIALS | &quot;addCredentials&quot; |
| UPDATECREDENTIALS | &quot;updateCredentials&quot; |
| REMOVECREDENTIALS | &quot;removeCredentials&quot; |



