

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
| CREATEUSER | &quot;createUser&quot; |
| GETUSERS | &quot;getUsers&quot; |
| SETUSER | &quot;setUser&quot; |
| DISABLE | &quot;disable&quot; |
| DELETEUSER | &quot;deleteUser&quot; |
| ENABLE | &quot;enable&quot; |
| CHANGEPASSWORD | &quot;changePassword&quot; |
| GETKEYS | &quot;getKeys&quot; |
| ADDKEY | &quot;addKey&quot; |
| DELETEKEY | &quot;deleteKey&quot; |
| CREATEGROUP | &quot;createGroup&quot; |
| DELETEGROUP | &quot;deleteGroup&quot; |
| GETGROUPS | &quot;getGroups&quot; |
| ADDTOGROUP | &quot;addToGroup&quot; |
| REMOVEFROMGROUP | &quot;removeFromGroup&quot; |
| CANCREATEUSER | &quot;canCreateUser&quot; |
| CANCREATEGROUP | &quot;canCreateGroup&quot; |



