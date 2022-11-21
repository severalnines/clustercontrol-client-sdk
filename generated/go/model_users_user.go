/*
Severalnines ClusterControl REST API (V2)

REST API (V2) specification for ClusterControl - AI Powered Database automation tool for multi/hybrid cloud database deployment.

API version: OpenAPI specification v1.0.0
Contact: sales@severalnines.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
)

// UsersUser struct for UsersUser
type UsersUser struct {
	ClassName *string `json:"class_name,omitempty"`
	UserName *string `json:"user_name,omitempty"`
	UserId *int32 `json:"user_id,omitempty"`
	FirstName *string `json:"first_name,omitempty"`
	LastName *string `json:"last_name,omitempty"`
	EmailAddress *string `json:"email_address,omitempty"`
	NewPassword *string `json:"new_password,omitempty"`
	OldPassword *string `json:"old_password,omitempty"`
	Groups []UsersUserGroupsInner `json:"groups,omitempty"`
	Timezone *UsersUserTimezone `json:"timezone,omitempty"`
	PublicKeys []UsersUserPublicKeysInner `json:"public_keys,omitempty"`
	PublicKey []UsersUserPublicKeysInner `json:"public_key,omitempty"`
}

// NewUsersUser instantiates a new UsersUser object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUsersUser() *UsersUser {
	this := UsersUser{}
	return &this
}

// NewUsersUserWithDefaults instantiates a new UsersUser object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUsersUserWithDefaults() *UsersUser {
	this := UsersUser{}
	return &this
}

// GetClassName returns the ClassName field value if set, zero value otherwise.
func (o *UsersUser) GetClassName() string {
	if o == nil || isNil(o.ClassName) {
		var ret string
		return ret
	}
	return *o.ClassName
}

// GetClassNameOk returns a tuple with the ClassName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UsersUser) GetClassNameOk() (*string, bool) {
	if o == nil || isNil(o.ClassName) {
    return nil, false
	}
	return o.ClassName, true
}

// HasClassName returns a boolean if a field has been set.
func (o *UsersUser) HasClassName() bool {
	if o != nil && !isNil(o.ClassName) {
		return true
	}

	return false
}

// SetClassName gets a reference to the given string and assigns it to the ClassName field.
func (o *UsersUser) SetClassName(v string) {
	o.ClassName = &v
}

// GetUserName returns the UserName field value if set, zero value otherwise.
func (o *UsersUser) GetUserName() string {
	if o == nil || isNil(o.UserName) {
		var ret string
		return ret
	}
	return *o.UserName
}

// GetUserNameOk returns a tuple with the UserName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UsersUser) GetUserNameOk() (*string, bool) {
	if o == nil || isNil(o.UserName) {
    return nil, false
	}
	return o.UserName, true
}

// HasUserName returns a boolean if a field has been set.
func (o *UsersUser) HasUserName() bool {
	if o != nil && !isNil(o.UserName) {
		return true
	}

	return false
}

// SetUserName gets a reference to the given string and assigns it to the UserName field.
func (o *UsersUser) SetUserName(v string) {
	o.UserName = &v
}

// GetUserId returns the UserId field value if set, zero value otherwise.
func (o *UsersUser) GetUserId() int32 {
	if o == nil || isNil(o.UserId) {
		var ret int32
		return ret
	}
	return *o.UserId
}

// GetUserIdOk returns a tuple with the UserId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UsersUser) GetUserIdOk() (*int32, bool) {
	if o == nil || isNil(o.UserId) {
    return nil, false
	}
	return o.UserId, true
}

// HasUserId returns a boolean if a field has been set.
func (o *UsersUser) HasUserId() bool {
	if o != nil && !isNil(o.UserId) {
		return true
	}

	return false
}

// SetUserId gets a reference to the given int32 and assigns it to the UserId field.
func (o *UsersUser) SetUserId(v int32) {
	o.UserId = &v
}

// GetFirstName returns the FirstName field value if set, zero value otherwise.
func (o *UsersUser) GetFirstName() string {
	if o == nil || isNil(o.FirstName) {
		var ret string
		return ret
	}
	return *o.FirstName
}

// GetFirstNameOk returns a tuple with the FirstName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UsersUser) GetFirstNameOk() (*string, bool) {
	if o == nil || isNil(o.FirstName) {
    return nil, false
	}
	return o.FirstName, true
}

// HasFirstName returns a boolean if a field has been set.
func (o *UsersUser) HasFirstName() bool {
	if o != nil && !isNil(o.FirstName) {
		return true
	}

	return false
}

// SetFirstName gets a reference to the given string and assigns it to the FirstName field.
func (o *UsersUser) SetFirstName(v string) {
	o.FirstName = &v
}

// GetLastName returns the LastName field value if set, zero value otherwise.
func (o *UsersUser) GetLastName() string {
	if o == nil || isNil(o.LastName) {
		var ret string
		return ret
	}
	return *o.LastName
}

// GetLastNameOk returns a tuple with the LastName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UsersUser) GetLastNameOk() (*string, bool) {
	if o == nil || isNil(o.LastName) {
    return nil, false
	}
	return o.LastName, true
}

// HasLastName returns a boolean if a field has been set.
func (o *UsersUser) HasLastName() bool {
	if o != nil && !isNil(o.LastName) {
		return true
	}

	return false
}

// SetLastName gets a reference to the given string and assigns it to the LastName field.
func (o *UsersUser) SetLastName(v string) {
	o.LastName = &v
}

// GetEmailAddress returns the EmailAddress field value if set, zero value otherwise.
func (o *UsersUser) GetEmailAddress() string {
	if o == nil || isNil(o.EmailAddress) {
		var ret string
		return ret
	}
	return *o.EmailAddress
}

// GetEmailAddressOk returns a tuple with the EmailAddress field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UsersUser) GetEmailAddressOk() (*string, bool) {
	if o == nil || isNil(o.EmailAddress) {
    return nil, false
	}
	return o.EmailAddress, true
}

// HasEmailAddress returns a boolean if a field has been set.
func (o *UsersUser) HasEmailAddress() bool {
	if o != nil && !isNil(o.EmailAddress) {
		return true
	}

	return false
}

// SetEmailAddress gets a reference to the given string and assigns it to the EmailAddress field.
func (o *UsersUser) SetEmailAddress(v string) {
	o.EmailAddress = &v
}

// GetNewPassword returns the NewPassword field value if set, zero value otherwise.
func (o *UsersUser) GetNewPassword() string {
	if o == nil || isNil(o.NewPassword) {
		var ret string
		return ret
	}
	return *o.NewPassword
}

// GetNewPasswordOk returns a tuple with the NewPassword field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UsersUser) GetNewPasswordOk() (*string, bool) {
	if o == nil || isNil(o.NewPassword) {
    return nil, false
	}
	return o.NewPassword, true
}

// HasNewPassword returns a boolean if a field has been set.
func (o *UsersUser) HasNewPassword() bool {
	if o != nil && !isNil(o.NewPassword) {
		return true
	}

	return false
}

// SetNewPassword gets a reference to the given string and assigns it to the NewPassword field.
func (o *UsersUser) SetNewPassword(v string) {
	o.NewPassword = &v
}

// GetOldPassword returns the OldPassword field value if set, zero value otherwise.
func (o *UsersUser) GetOldPassword() string {
	if o == nil || isNil(o.OldPassword) {
		var ret string
		return ret
	}
	return *o.OldPassword
}

// GetOldPasswordOk returns a tuple with the OldPassword field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UsersUser) GetOldPasswordOk() (*string, bool) {
	if o == nil || isNil(o.OldPassword) {
    return nil, false
	}
	return o.OldPassword, true
}

// HasOldPassword returns a boolean if a field has been set.
func (o *UsersUser) HasOldPassword() bool {
	if o != nil && !isNil(o.OldPassword) {
		return true
	}

	return false
}

// SetOldPassword gets a reference to the given string and assigns it to the OldPassword field.
func (o *UsersUser) SetOldPassword(v string) {
	o.OldPassword = &v
}

// GetGroups returns the Groups field value if set, zero value otherwise.
func (o *UsersUser) GetGroups() []UsersUserGroupsInner {
	if o == nil || isNil(o.Groups) {
		var ret []UsersUserGroupsInner
		return ret
	}
	return o.Groups
}

// GetGroupsOk returns a tuple with the Groups field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UsersUser) GetGroupsOk() ([]UsersUserGroupsInner, bool) {
	if o == nil || isNil(o.Groups) {
    return nil, false
	}
	return o.Groups, true
}

// HasGroups returns a boolean if a field has been set.
func (o *UsersUser) HasGroups() bool {
	if o != nil && !isNil(o.Groups) {
		return true
	}

	return false
}

// SetGroups gets a reference to the given []UsersUserGroupsInner and assigns it to the Groups field.
func (o *UsersUser) SetGroups(v []UsersUserGroupsInner) {
	o.Groups = v
}

// GetTimezone returns the Timezone field value if set, zero value otherwise.
func (o *UsersUser) GetTimezone() UsersUserTimezone {
	if o == nil || isNil(o.Timezone) {
		var ret UsersUserTimezone
		return ret
	}
	return *o.Timezone
}

// GetTimezoneOk returns a tuple with the Timezone field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UsersUser) GetTimezoneOk() (*UsersUserTimezone, bool) {
	if o == nil || isNil(o.Timezone) {
    return nil, false
	}
	return o.Timezone, true
}

// HasTimezone returns a boolean if a field has been set.
func (o *UsersUser) HasTimezone() bool {
	if o != nil && !isNil(o.Timezone) {
		return true
	}

	return false
}

// SetTimezone gets a reference to the given UsersUserTimezone and assigns it to the Timezone field.
func (o *UsersUser) SetTimezone(v UsersUserTimezone) {
	o.Timezone = &v
}

// GetPublicKeys returns the PublicKeys field value if set, zero value otherwise.
func (o *UsersUser) GetPublicKeys() []UsersUserPublicKeysInner {
	if o == nil || isNil(o.PublicKeys) {
		var ret []UsersUserPublicKeysInner
		return ret
	}
	return o.PublicKeys
}

// GetPublicKeysOk returns a tuple with the PublicKeys field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UsersUser) GetPublicKeysOk() ([]UsersUserPublicKeysInner, bool) {
	if o == nil || isNil(o.PublicKeys) {
    return nil, false
	}
	return o.PublicKeys, true
}

// HasPublicKeys returns a boolean if a field has been set.
func (o *UsersUser) HasPublicKeys() bool {
	if o != nil && !isNil(o.PublicKeys) {
		return true
	}

	return false
}

// SetPublicKeys gets a reference to the given []UsersUserPublicKeysInner and assigns it to the PublicKeys field.
func (o *UsersUser) SetPublicKeys(v []UsersUserPublicKeysInner) {
	o.PublicKeys = v
}

// GetPublicKey returns the PublicKey field value if set, zero value otherwise.
func (o *UsersUser) GetPublicKey() []UsersUserPublicKeysInner {
	if o == nil || isNil(o.PublicKey) {
		var ret []UsersUserPublicKeysInner
		return ret
	}
	return o.PublicKey
}

// GetPublicKeyOk returns a tuple with the PublicKey field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UsersUser) GetPublicKeyOk() ([]UsersUserPublicKeysInner, bool) {
	if o == nil || isNil(o.PublicKey) {
    return nil, false
	}
	return o.PublicKey, true
}

// HasPublicKey returns a boolean if a field has been set.
func (o *UsersUser) HasPublicKey() bool {
	if o != nil && !isNil(o.PublicKey) {
		return true
	}

	return false
}

// SetPublicKey gets a reference to the given []UsersUserPublicKeysInner and assigns it to the PublicKey field.
func (o *UsersUser) SetPublicKey(v []UsersUserPublicKeysInner) {
	o.PublicKey = v
}

func (o UsersUser) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.ClassName) {
		toSerialize["class_name"] = o.ClassName
	}
	if !isNil(o.UserName) {
		toSerialize["user_name"] = o.UserName
	}
	if !isNil(o.UserId) {
		toSerialize["user_id"] = o.UserId
	}
	if !isNil(o.FirstName) {
		toSerialize["first_name"] = o.FirstName
	}
	if !isNil(o.LastName) {
		toSerialize["last_name"] = o.LastName
	}
	if !isNil(o.EmailAddress) {
		toSerialize["email_address"] = o.EmailAddress
	}
	if !isNil(o.NewPassword) {
		toSerialize["new_password"] = o.NewPassword
	}
	if !isNil(o.OldPassword) {
		toSerialize["old_password"] = o.OldPassword
	}
	if !isNil(o.Groups) {
		toSerialize["groups"] = o.Groups
	}
	if !isNil(o.Timezone) {
		toSerialize["timezone"] = o.Timezone
	}
	if !isNil(o.PublicKeys) {
		toSerialize["public_keys"] = o.PublicKeys
	}
	if !isNil(o.PublicKey) {
		toSerialize["public_key"] = o.PublicKey
	}
	return json.Marshal(toSerialize)
}

type NullableUsersUser struct {
	value *UsersUser
	isSet bool
}

func (v NullableUsersUser) Get() *UsersUser {
	return v.value
}

func (v *NullableUsersUser) Set(val *UsersUser) {
	v.value = val
	v.isSet = true
}

func (v NullableUsersUser) IsSet() bool {
	return v.isSet
}

func (v *NullableUsersUser) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUsersUser(val *UsersUser) *NullableUsersUser {
	return &NullableUsersUser{value: val, isSet: true}
}

func (v NullableUsersUser) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUsersUser) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


