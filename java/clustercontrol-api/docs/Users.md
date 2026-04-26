

# Users


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operation** | [**OperationEnum**](#OperationEnum) |  |  |
|**createGroup** | **Boolean** |  |  [optional] |
|**newPassword** | **String** |  |  [optional] |
|**oldPassword** | **String** |  |  [optional] |
|**groupName** | **String** |  |  [optional] |
|**replacePrimaryGroup** | **Boolean** |  |  [optional] |
|**withTags** | **List&lt;String&gt;** |  |  [optional] |
|**user** | [**UsersUser**](UsersUser.md) |  |  [optional] |
|**group** | [**UsersGroup**](UsersGroup.md) |  |  [optional] |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| CREATE_USER | &quot;createUser&quot; |
| GET_USERS | &quot;getUsers&quot; |
| SET_USER | &quot;setUser&quot; |
| DISABLE | &quot;disable&quot; |
| DELETE_USER | &quot;deleteUser&quot; |
| ENABLE | &quot;enable&quot; |
| CHANGE_PASSWORD | &quot;changePassword&quot; |
| GET_KEYS | &quot;getKeys&quot; |
| ADD_KEY | &quot;addKey&quot; |
| DELETE_KEY | &quot;deleteKey&quot; |
| CREATE_GROUP | &quot;createGroup&quot; |
| DELETE_GROUP | &quot;deleteGroup&quot; |
| GET_GROUPS | &quot;getGroups&quot; |
| ADD_TO_GROUP | &quot;addToGroup&quot; |
| REMOVE_FROM_GROUP | &quot;removeFromGroup&quot; |
| CAN_CREATE_USER | &quot;canCreateUser&quot; |
| CAN_CREATE_GROUP | &quot;canCreateGroup&quot; |



