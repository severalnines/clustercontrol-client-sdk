/*
Severalnines ClusterControl

This is a ...

API version: 1.0.0
Contact: sales@severalnines.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
)

// Users struct for Users
type Users struct {
	Operation string `json:"operation"`
	CreateGroup *bool `json:"create_group,omitempty"`
	NewPassword *string `json:"new_password,omitempty"`
	OldPassword *string `json:"old_password,omitempty"`
	GroupName *string `json:"group_name,omitempty"`
	ReplacePrimaryGroup *bool `json:"replace_primary_group,omitempty"`
	WithTags []string `json:"with_tags,omitempty"`
	User *UsersUser `json:"user,omitempty"`
	Group *UsersGroup `json:"group,omitempty"`
}

// NewUsers instantiates a new Users object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUsers(operation string) *Users {
	this := Users{}
	this.Operation = operation
	return &this
}

// NewUsersWithDefaults instantiates a new Users object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUsersWithDefaults() *Users {
	this := Users{}
	return &this
}

// GetOperation returns the Operation field value
func (o *Users) GetOperation() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Operation
}

// GetOperationOk returns a tuple with the Operation field value
// and a boolean to check if the value has been set.
func (o *Users) GetOperationOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Operation, true
}

// SetOperation sets field value
func (o *Users) SetOperation(v string) {
	o.Operation = v
}

// GetCreateGroup returns the CreateGroup field value if set, zero value otherwise.
func (o *Users) GetCreateGroup() bool {
	if o == nil || o.CreateGroup == nil {
		var ret bool
		return ret
	}
	return *o.CreateGroup
}

// GetCreateGroupOk returns a tuple with the CreateGroup field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Users) GetCreateGroupOk() (*bool, bool) {
	if o == nil || o.CreateGroup == nil {
		return nil, false
	}
	return o.CreateGroup, true
}

// HasCreateGroup returns a boolean if a field has been set.
func (o *Users) HasCreateGroup() bool {
	if o != nil && o.CreateGroup != nil {
		return true
	}

	return false
}

// SetCreateGroup gets a reference to the given bool and assigns it to the CreateGroup field.
func (o *Users) SetCreateGroup(v bool) {
	o.CreateGroup = &v
}

// GetNewPassword returns the NewPassword field value if set, zero value otherwise.
func (o *Users) GetNewPassword() string {
	if o == nil || o.NewPassword == nil {
		var ret string
		return ret
	}
	return *o.NewPassword
}

// GetNewPasswordOk returns a tuple with the NewPassword field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Users) GetNewPasswordOk() (*string, bool) {
	if o == nil || o.NewPassword == nil {
		return nil, false
	}
	return o.NewPassword, true
}

// HasNewPassword returns a boolean if a field has been set.
func (o *Users) HasNewPassword() bool {
	if o != nil && o.NewPassword != nil {
		return true
	}

	return false
}

// SetNewPassword gets a reference to the given string and assigns it to the NewPassword field.
func (o *Users) SetNewPassword(v string) {
	o.NewPassword = &v
}

// GetOldPassword returns the OldPassword field value if set, zero value otherwise.
func (o *Users) GetOldPassword() string {
	if o == nil || o.OldPassword == nil {
		var ret string
		return ret
	}
	return *o.OldPassword
}

// GetOldPasswordOk returns a tuple with the OldPassword field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Users) GetOldPasswordOk() (*string, bool) {
	if o == nil || o.OldPassword == nil {
		return nil, false
	}
	return o.OldPassword, true
}

// HasOldPassword returns a boolean if a field has been set.
func (o *Users) HasOldPassword() bool {
	if o != nil && o.OldPassword != nil {
		return true
	}

	return false
}

// SetOldPassword gets a reference to the given string and assigns it to the OldPassword field.
func (o *Users) SetOldPassword(v string) {
	o.OldPassword = &v
}

// GetGroupName returns the GroupName field value if set, zero value otherwise.
func (o *Users) GetGroupName() string {
	if o == nil || o.GroupName == nil {
		var ret string
		return ret
	}
	return *o.GroupName
}

// GetGroupNameOk returns a tuple with the GroupName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Users) GetGroupNameOk() (*string, bool) {
	if o == nil || o.GroupName == nil {
		return nil, false
	}
	return o.GroupName, true
}

// HasGroupName returns a boolean if a field has been set.
func (o *Users) HasGroupName() bool {
	if o != nil && o.GroupName != nil {
		return true
	}

	return false
}

// SetGroupName gets a reference to the given string and assigns it to the GroupName field.
func (o *Users) SetGroupName(v string) {
	o.GroupName = &v
}

// GetReplacePrimaryGroup returns the ReplacePrimaryGroup field value if set, zero value otherwise.
func (o *Users) GetReplacePrimaryGroup() bool {
	if o == nil || o.ReplacePrimaryGroup == nil {
		var ret bool
		return ret
	}
	return *o.ReplacePrimaryGroup
}

// GetReplacePrimaryGroupOk returns a tuple with the ReplacePrimaryGroup field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Users) GetReplacePrimaryGroupOk() (*bool, bool) {
	if o == nil || o.ReplacePrimaryGroup == nil {
		return nil, false
	}
	return o.ReplacePrimaryGroup, true
}

// HasReplacePrimaryGroup returns a boolean if a field has been set.
func (o *Users) HasReplacePrimaryGroup() bool {
	if o != nil && o.ReplacePrimaryGroup != nil {
		return true
	}

	return false
}

// SetReplacePrimaryGroup gets a reference to the given bool and assigns it to the ReplacePrimaryGroup field.
func (o *Users) SetReplacePrimaryGroup(v bool) {
	o.ReplacePrimaryGroup = &v
}

// GetWithTags returns the WithTags field value if set, zero value otherwise.
func (o *Users) GetWithTags() []string {
	if o == nil || o.WithTags == nil {
		var ret []string
		return ret
	}
	return o.WithTags
}

// GetWithTagsOk returns a tuple with the WithTags field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Users) GetWithTagsOk() ([]string, bool) {
	if o == nil || o.WithTags == nil {
		return nil, false
	}
	return o.WithTags, true
}

// HasWithTags returns a boolean if a field has been set.
func (o *Users) HasWithTags() bool {
	if o != nil && o.WithTags != nil {
		return true
	}

	return false
}

// SetWithTags gets a reference to the given []string and assigns it to the WithTags field.
func (o *Users) SetWithTags(v []string) {
	o.WithTags = v
}

// GetUser returns the User field value if set, zero value otherwise.
func (o *Users) GetUser() UsersUser {
	if o == nil || o.User == nil {
		var ret UsersUser
		return ret
	}
	return *o.User
}

// GetUserOk returns a tuple with the User field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Users) GetUserOk() (*UsersUser, bool) {
	if o == nil || o.User == nil {
		return nil, false
	}
	return o.User, true
}

// HasUser returns a boolean if a field has been set.
func (o *Users) HasUser() bool {
	if o != nil && o.User != nil {
		return true
	}

	return false
}

// SetUser gets a reference to the given UsersUser and assigns it to the User field.
func (o *Users) SetUser(v UsersUser) {
	o.User = &v
}

// GetGroup returns the Group field value if set, zero value otherwise.
func (o *Users) GetGroup() UsersGroup {
	if o == nil || o.Group == nil {
		var ret UsersGroup
		return ret
	}
	return *o.Group
}

// GetGroupOk returns a tuple with the Group field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Users) GetGroupOk() (*UsersGroup, bool) {
	if o == nil || o.Group == nil {
		return nil, false
	}
	return o.Group, true
}

// HasGroup returns a boolean if a field has been set.
func (o *Users) HasGroup() bool {
	if o != nil && o.Group != nil {
		return true
	}

	return false
}

// SetGroup gets a reference to the given UsersGroup and assigns it to the Group field.
func (o *Users) SetGroup(v UsersGroup) {
	o.Group = &v
}

func (o Users) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["operation"] = o.Operation
	}
	if o.CreateGroup != nil {
		toSerialize["create_group"] = o.CreateGroup
	}
	if o.NewPassword != nil {
		toSerialize["new_password"] = o.NewPassword
	}
	if o.OldPassword != nil {
		toSerialize["old_password"] = o.OldPassword
	}
	if o.GroupName != nil {
		toSerialize["group_name"] = o.GroupName
	}
	if o.ReplacePrimaryGroup != nil {
		toSerialize["replace_primary_group"] = o.ReplacePrimaryGroup
	}
	if o.WithTags != nil {
		toSerialize["with_tags"] = o.WithTags
	}
	if o.User != nil {
		toSerialize["user"] = o.User
	}
	if o.Group != nil {
		toSerialize["group"] = o.Group
	}
	return json.Marshal(toSerialize)
}

type NullableUsers struct {
	value *Users
	isSet bool
}

func (v NullableUsers) Get() *Users {
	return v.value
}

func (v *NullableUsers) Set(val *Users) {
	v.value = val
	v.isSet = true
}

func (v NullableUsers) IsSet() bool {
	return v.isSet
}

func (v *NullableUsers) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUsers(val *Users) *NullableUsers {
	return &NullableUsers{value: val, isSet: true}
}

func (v NullableUsers) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUsers) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


