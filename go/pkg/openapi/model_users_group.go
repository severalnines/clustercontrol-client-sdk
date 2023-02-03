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

// UsersGroup struct for UsersGroup
type UsersGroup struct {
	ClassName *string `json:"class_name,omitempty"`
	GroupName *string `json:"group_name,omitempty"`
}

// NewUsersGroup instantiates a new UsersGroup object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUsersGroup() *UsersGroup {
	this := UsersGroup{}
	return &this
}

// NewUsersGroupWithDefaults instantiates a new UsersGroup object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUsersGroupWithDefaults() *UsersGroup {
	this := UsersGroup{}
	return &this
}

// GetClassName returns the ClassName field value if set, zero value otherwise.
func (o *UsersGroup) GetClassName() string {
	if o == nil || isNil(o.ClassName) {
		var ret string
		return ret
	}
	return *o.ClassName
}

// GetClassNameOk returns a tuple with the ClassName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UsersGroup) GetClassNameOk() (*string, bool) {
	if o == nil || isNil(o.ClassName) {
    return nil, false
	}
	return o.ClassName, true
}

// HasClassName returns a boolean if a field has been set.
func (o *UsersGroup) HasClassName() bool {
	if o != nil && !isNil(o.ClassName) {
		return true
	}

	return false
}

// SetClassName gets a reference to the given string and assigns it to the ClassName field.
func (o *UsersGroup) SetClassName(v string) {
	o.ClassName = &v
}

// GetGroupName returns the GroupName field value if set, zero value otherwise.
func (o *UsersGroup) GetGroupName() string {
	if o == nil || isNil(o.GroupName) {
		var ret string
		return ret
	}
	return *o.GroupName
}

// GetGroupNameOk returns a tuple with the GroupName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UsersGroup) GetGroupNameOk() (*string, bool) {
	if o == nil || isNil(o.GroupName) {
    return nil, false
	}
	return o.GroupName, true
}

// HasGroupName returns a boolean if a field has been set.
func (o *UsersGroup) HasGroupName() bool {
	if o != nil && !isNil(o.GroupName) {
		return true
	}

	return false
}

// SetGroupName gets a reference to the given string and assigns it to the GroupName field.
func (o *UsersGroup) SetGroupName(v string) {
	o.GroupName = &v
}

func (o UsersGroup) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.ClassName) {
		toSerialize["class_name"] = o.ClassName
	}
	if !isNil(o.GroupName) {
		toSerialize["group_name"] = o.GroupName
	}
	return json.Marshal(toSerialize)
}

type NullableUsersGroup struct {
	value *UsersGroup
	isSet bool
}

func (v NullableUsersGroup) Get() *UsersGroup {
	return v.value
}

func (v *NullableUsersGroup) Set(val *UsersGroup) {
	v.value = val
	v.isSet = true
}

func (v NullableUsersGroup) IsSet() bool {
	return v.isSet
}

func (v *NullableUsersGroup) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUsersGroup(val *UsersGroup) *NullableUsersGroup {
	return &NullableUsersGroup{value: val, isSet: true}
}

func (v NullableUsersGroup) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUsersGroup) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


