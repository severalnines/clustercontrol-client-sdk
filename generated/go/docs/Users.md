# Users

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Operation** | **string** |  | 
**CreateGroup** | Pointer to **bool** |  | [optional] 
**NewPassword** | Pointer to **string** |  | [optional] 
**OldPassword** | Pointer to **string** |  | [optional] 
**GroupName** | Pointer to **string** |  | [optional] 
**ReplacePrimaryGroup** | Pointer to **bool** |  | [optional] 
**WithTags** | Pointer to **[]string** |  | [optional] 
**User** | Pointer to [**UsersUser**](UsersUser.md) |  | [optional] 
**Group** | Pointer to [**UsersGroup**](UsersGroup.md) |  | [optional] 

## Methods

### NewUsers

`func NewUsers(operation string, ) *Users`

NewUsers instantiates a new Users object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUsersWithDefaults

`func NewUsersWithDefaults() *Users`

NewUsersWithDefaults instantiates a new Users object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOperation

`func (o *Users) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *Users) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *Users) SetOperation(v string)`

SetOperation sets Operation field to given value.


### GetCreateGroup

`func (o *Users) GetCreateGroup() bool`

GetCreateGroup returns the CreateGroup field if non-nil, zero value otherwise.

### GetCreateGroupOk

`func (o *Users) GetCreateGroupOk() (*bool, bool)`

GetCreateGroupOk returns a tuple with the CreateGroup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreateGroup

`func (o *Users) SetCreateGroup(v bool)`

SetCreateGroup sets CreateGroup field to given value.

### HasCreateGroup

`func (o *Users) HasCreateGroup() bool`

HasCreateGroup returns a boolean if a field has been set.

### GetNewPassword

`func (o *Users) GetNewPassword() string`

GetNewPassword returns the NewPassword field if non-nil, zero value otherwise.

### GetNewPasswordOk

`func (o *Users) GetNewPasswordOk() (*string, bool)`

GetNewPasswordOk returns a tuple with the NewPassword field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNewPassword

`func (o *Users) SetNewPassword(v string)`

SetNewPassword sets NewPassword field to given value.

### HasNewPassword

`func (o *Users) HasNewPassword() bool`

HasNewPassword returns a boolean if a field has been set.

### GetOldPassword

`func (o *Users) GetOldPassword() string`

GetOldPassword returns the OldPassword field if non-nil, zero value otherwise.

### GetOldPasswordOk

`func (o *Users) GetOldPasswordOk() (*string, bool)`

GetOldPasswordOk returns a tuple with the OldPassword field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOldPassword

`func (o *Users) SetOldPassword(v string)`

SetOldPassword sets OldPassword field to given value.

### HasOldPassword

`func (o *Users) HasOldPassword() bool`

HasOldPassword returns a boolean if a field has been set.

### GetGroupName

`func (o *Users) GetGroupName() string`

GetGroupName returns the GroupName field if non-nil, zero value otherwise.

### GetGroupNameOk

`func (o *Users) GetGroupNameOk() (*string, bool)`

GetGroupNameOk returns a tuple with the GroupName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupName

`func (o *Users) SetGroupName(v string)`

SetGroupName sets GroupName field to given value.

### HasGroupName

`func (o *Users) HasGroupName() bool`

HasGroupName returns a boolean if a field has been set.

### GetReplacePrimaryGroup

`func (o *Users) GetReplacePrimaryGroup() bool`

GetReplacePrimaryGroup returns the ReplacePrimaryGroup field if non-nil, zero value otherwise.

### GetReplacePrimaryGroupOk

`func (o *Users) GetReplacePrimaryGroupOk() (*bool, bool)`

GetReplacePrimaryGroupOk returns a tuple with the ReplacePrimaryGroup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReplacePrimaryGroup

`func (o *Users) SetReplacePrimaryGroup(v bool)`

SetReplacePrimaryGroup sets ReplacePrimaryGroup field to given value.

### HasReplacePrimaryGroup

`func (o *Users) HasReplacePrimaryGroup() bool`

HasReplacePrimaryGroup returns a boolean if a field has been set.

### GetWithTags

`func (o *Users) GetWithTags() []string`

GetWithTags returns the WithTags field if non-nil, zero value otherwise.

### GetWithTagsOk

`func (o *Users) GetWithTagsOk() (*[]string, bool)`

GetWithTagsOk returns a tuple with the WithTags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWithTags

`func (o *Users) SetWithTags(v []string)`

SetWithTags sets WithTags field to given value.

### HasWithTags

`func (o *Users) HasWithTags() bool`

HasWithTags returns a boolean if a field has been set.

### GetUser

`func (o *Users) GetUser() UsersUser`

GetUser returns the User field if non-nil, zero value otherwise.

### GetUserOk

`func (o *Users) GetUserOk() (*UsersUser, bool)`

GetUserOk returns a tuple with the User field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUser

`func (o *Users) SetUser(v UsersUser)`

SetUser sets User field to given value.

### HasUser

`func (o *Users) HasUser() bool`

HasUser returns a boolean if a field has been set.

### GetGroup

`func (o *Users) GetGroup() UsersGroup`

GetGroup returns the Group field if non-nil, zero value otherwise.

### GetGroupOk

`func (o *Users) GetGroupOk() (*UsersGroup, bool)`

GetGroupOk returns a tuple with the Group field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroup

`func (o *Users) SetGroup(v UsersGroup)`

SetGroup sets Group field to given value.

### HasGroup

`func (o *Users) HasGroup() bool`

HasGroup returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


