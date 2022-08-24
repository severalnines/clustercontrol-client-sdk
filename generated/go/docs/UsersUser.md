# UsersUser

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ClassName** | Pointer to **string** |  | [optional] 
**UserName** | Pointer to **string** |  | [optional] 
**UserId** | Pointer to **int32** |  | [optional] 
**FirstName** | Pointer to **string** |  | [optional] 
**LastName** | Pointer to **string** |  | [optional] 
**EmailAddress** | Pointer to **string** |  | [optional] 
**NewPassword** | Pointer to **string** |  | [optional] 
**OldPassword** | Pointer to **string** |  | [optional] 
**Groups** | Pointer to [**[]UsersUserGroupsInner**](UsersUserGroupsInner.md) |  | [optional] 
**Timezone** | Pointer to [**UsersUserTimezone**](UsersUserTimezone.md) |  | [optional] 
**PublicKeys** | Pointer to [**[]UsersUserPublicKeysInner**](UsersUserPublicKeysInner.md) |  | [optional] 
**PublicKey** | Pointer to [**[]UsersUserPublicKeysInner**](UsersUserPublicKeysInner.md) |  | [optional] 

## Methods

### NewUsersUser

`func NewUsersUser() *UsersUser`

NewUsersUser instantiates a new UsersUser object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUsersUserWithDefaults

`func NewUsersUserWithDefaults() *UsersUser`

NewUsersUserWithDefaults instantiates a new UsersUser object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetClassName

`func (o *UsersUser) GetClassName() string`

GetClassName returns the ClassName field if non-nil, zero value otherwise.

### GetClassNameOk

`func (o *UsersUser) GetClassNameOk() (*string, bool)`

GetClassNameOk returns a tuple with the ClassName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClassName

`func (o *UsersUser) SetClassName(v string)`

SetClassName sets ClassName field to given value.

### HasClassName

`func (o *UsersUser) HasClassName() bool`

HasClassName returns a boolean if a field has been set.

### GetUserName

`func (o *UsersUser) GetUserName() string`

GetUserName returns the UserName field if non-nil, zero value otherwise.

### GetUserNameOk

`func (o *UsersUser) GetUserNameOk() (*string, bool)`

GetUserNameOk returns a tuple with the UserName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserName

`func (o *UsersUser) SetUserName(v string)`

SetUserName sets UserName field to given value.

### HasUserName

`func (o *UsersUser) HasUserName() bool`

HasUserName returns a boolean if a field has been set.

### GetUserId

`func (o *UsersUser) GetUserId() int32`

GetUserId returns the UserId field if non-nil, zero value otherwise.

### GetUserIdOk

`func (o *UsersUser) GetUserIdOk() (*int32, bool)`

GetUserIdOk returns a tuple with the UserId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserId

`func (o *UsersUser) SetUserId(v int32)`

SetUserId sets UserId field to given value.

### HasUserId

`func (o *UsersUser) HasUserId() bool`

HasUserId returns a boolean if a field has been set.

### GetFirstName

`func (o *UsersUser) GetFirstName() string`

GetFirstName returns the FirstName field if non-nil, zero value otherwise.

### GetFirstNameOk

`func (o *UsersUser) GetFirstNameOk() (*string, bool)`

GetFirstNameOk returns a tuple with the FirstName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstName

`func (o *UsersUser) SetFirstName(v string)`

SetFirstName sets FirstName field to given value.

### HasFirstName

`func (o *UsersUser) HasFirstName() bool`

HasFirstName returns a boolean if a field has been set.

### GetLastName

`func (o *UsersUser) GetLastName() string`

GetLastName returns the LastName field if non-nil, zero value otherwise.

### GetLastNameOk

`func (o *UsersUser) GetLastNameOk() (*string, bool)`

GetLastNameOk returns a tuple with the LastName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastName

`func (o *UsersUser) SetLastName(v string)`

SetLastName sets LastName field to given value.

### HasLastName

`func (o *UsersUser) HasLastName() bool`

HasLastName returns a boolean if a field has been set.

### GetEmailAddress

`func (o *UsersUser) GetEmailAddress() string`

GetEmailAddress returns the EmailAddress field if non-nil, zero value otherwise.

### GetEmailAddressOk

`func (o *UsersUser) GetEmailAddressOk() (*string, bool)`

GetEmailAddressOk returns a tuple with the EmailAddress field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmailAddress

`func (o *UsersUser) SetEmailAddress(v string)`

SetEmailAddress sets EmailAddress field to given value.

### HasEmailAddress

`func (o *UsersUser) HasEmailAddress() bool`

HasEmailAddress returns a boolean if a field has been set.

### GetNewPassword

`func (o *UsersUser) GetNewPassword() string`

GetNewPassword returns the NewPassword field if non-nil, zero value otherwise.

### GetNewPasswordOk

`func (o *UsersUser) GetNewPasswordOk() (*string, bool)`

GetNewPasswordOk returns a tuple with the NewPassword field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNewPassword

`func (o *UsersUser) SetNewPassword(v string)`

SetNewPassword sets NewPassword field to given value.

### HasNewPassword

`func (o *UsersUser) HasNewPassword() bool`

HasNewPassword returns a boolean if a field has been set.

### GetOldPassword

`func (o *UsersUser) GetOldPassword() string`

GetOldPassword returns the OldPassword field if non-nil, zero value otherwise.

### GetOldPasswordOk

`func (o *UsersUser) GetOldPasswordOk() (*string, bool)`

GetOldPasswordOk returns a tuple with the OldPassword field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOldPassword

`func (o *UsersUser) SetOldPassword(v string)`

SetOldPassword sets OldPassword field to given value.

### HasOldPassword

`func (o *UsersUser) HasOldPassword() bool`

HasOldPassword returns a boolean if a field has been set.

### GetGroups

`func (o *UsersUser) GetGroups() []UsersUserGroupsInner`

GetGroups returns the Groups field if non-nil, zero value otherwise.

### GetGroupsOk

`func (o *UsersUser) GetGroupsOk() (*[]UsersUserGroupsInner, bool)`

GetGroupsOk returns a tuple with the Groups field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroups

`func (o *UsersUser) SetGroups(v []UsersUserGroupsInner)`

SetGroups sets Groups field to given value.

### HasGroups

`func (o *UsersUser) HasGroups() bool`

HasGroups returns a boolean if a field has been set.

### GetTimezone

`func (o *UsersUser) GetTimezone() UsersUserTimezone`

GetTimezone returns the Timezone field if non-nil, zero value otherwise.

### GetTimezoneOk

`func (o *UsersUser) GetTimezoneOk() (*UsersUserTimezone, bool)`

GetTimezoneOk returns a tuple with the Timezone field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimezone

`func (o *UsersUser) SetTimezone(v UsersUserTimezone)`

SetTimezone sets Timezone field to given value.

### HasTimezone

`func (o *UsersUser) HasTimezone() bool`

HasTimezone returns a boolean if a field has been set.

### GetPublicKeys

`func (o *UsersUser) GetPublicKeys() []UsersUserPublicKeysInner`

GetPublicKeys returns the PublicKeys field if non-nil, zero value otherwise.

### GetPublicKeysOk

`func (o *UsersUser) GetPublicKeysOk() (*[]UsersUserPublicKeysInner, bool)`

GetPublicKeysOk returns a tuple with the PublicKeys field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPublicKeys

`func (o *UsersUser) SetPublicKeys(v []UsersUserPublicKeysInner)`

SetPublicKeys sets PublicKeys field to given value.

### HasPublicKeys

`func (o *UsersUser) HasPublicKeys() bool`

HasPublicKeys returns a boolean if a field has been set.

### GetPublicKey

`func (o *UsersUser) GetPublicKey() []UsersUserPublicKeysInner`

GetPublicKey returns the PublicKey field if non-nil, zero value otherwise.

### GetPublicKeyOk

`func (o *UsersUser) GetPublicKeyOk() (*[]UsersUserPublicKeysInner, bool)`

GetPublicKeyOk returns a tuple with the PublicKey field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPublicKey

`func (o *UsersUser) SetPublicKey(v []UsersUserPublicKeysInner)`

SetPublicKey sets PublicKey field to given value.

### HasPublicKey

`func (o *UsersUser) HasPublicKey() bool`

HasPublicKey returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


