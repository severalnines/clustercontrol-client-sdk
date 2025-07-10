# SeveralninesClusterControlRestApiV2.Users

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | **String** |  | 
**createGroup** | **Boolean** |  | [optional] 
**newPassword** | **String** |  | [optional] 
**oldPassword** | **String** |  | [optional] 
**groupName** | **String** |  | [optional] 
**replacePrimaryGroup** | **Boolean** |  | [optional] 
**withTags** | **[String]** |  | [optional] 
**user** | [**UsersUser**](UsersUser.md) |  | [optional] 
**group** | [**UsersGroup**](UsersGroup.md) |  | [optional] 



## Enum: OperationEnum


* `createUser` (value: `"createUser"`)

* `getUsers` (value: `"getUsers"`)

* `setUser` (value: `"setUser"`)

* `disable` (value: `"disable"`)

* `deleteUser` (value: `"deleteUser"`)

* `enable` (value: `"enable"`)

* `changePassword` (value: `"changePassword"`)

* `getKeys` (value: `"getKeys"`)

* `addKey` (value: `"addKey"`)

* `deleteKey` (value: `"deleteKey"`)

* `createGroup` (value: `"createGroup"`)

* `deleteGroup` (value: `"deleteGroup"`)

* `getGroups` (value: `"getGroups"`)

* `addToGroup` (value: `"addToGroup"`)

* `removeFromGroup` (value: `"removeFromGroup"`)

* `canCreateUser` (value: `"canCreateUser"`)

* `canCreateGroup` (value: `"canCreateGroup"`)




