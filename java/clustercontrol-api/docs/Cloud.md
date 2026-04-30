

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
| VERIFY_CREDENTIALS | &quot;verifyCredentials&quot; |
| LIST_CREDENTIALS | &quot;listCredentials&quot; |
| GET_CREDENTIALS | &quot;getCredentials&quot; |
| ADD_CREDENTIALS | &quot;addCredentials&quot; |
| UPDATE_CREDENTIALS | &quot;updateCredentials&quot; |
| REMOVE_CREDENTIALS | &quot;removeCredentials&quot; |



