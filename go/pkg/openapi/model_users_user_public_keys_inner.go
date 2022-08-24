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

// UsersUserPublicKeysInner struct for UsersUserPublicKeysInner
type UsersUserPublicKeysInner struct {
	Key *string `json:"key,omitempty"`
	Name *string `json:"name,omitempty"`
}

// NewUsersUserPublicKeysInner instantiates a new UsersUserPublicKeysInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUsersUserPublicKeysInner() *UsersUserPublicKeysInner {
	this := UsersUserPublicKeysInner{}
	return &this
}

// NewUsersUserPublicKeysInnerWithDefaults instantiates a new UsersUserPublicKeysInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUsersUserPublicKeysInnerWithDefaults() *UsersUserPublicKeysInner {
	this := UsersUserPublicKeysInner{}
	return &this
}

// GetKey returns the Key field value if set, zero value otherwise.
func (o *UsersUserPublicKeysInner) GetKey() string {
	if o == nil || o.Key == nil {
		var ret string
		return ret
	}
	return *o.Key
}

// GetKeyOk returns a tuple with the Key field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UsersUserPublicKeysInner) GetKeyOk() (*string, bool) {
	if o == nil || o.Key == nil {
		return nil, false
	}
	return o.Key, true
}

// HasKey returns a boolean if a field has been set.
func (o *UsersUserPublicKeysInner) HasKey() bool {
	if o != nil && o.Key != nil {
		return true
	}

	return false
}

// SetKey gets a reference to the given string and assigns it to the Key field.
func (o *UsersUserPublicKeysInner) SetKey(v string) {
	o.Key = &v
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *UsersUserPublicKeysInner) GetName() string {
	if o == nil || o.Name == nil {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UsersUserPublicKeysInner) GetNameOk() (*string, bool) {
	if o == nil || o.Name == nil {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *UsersUserPublicKeysInner) HasName() bool {
	if o != nil && o.Name != nil {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *UsersUserPublicKeysInner) SetName(v string) {
	o.Name = &v
}

func (o UsersUserPublicKeysInner) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Key != nil {
		toSerialize["key"] = o.Key
	}
	if o.Name != nil {
		toSerialize["name"] = o.Name
	}
	return json.Marshal(toSerialize)
}

type NullableUsersUserPublicKeysInner struct {
	value *UsersUserPublicKeysInner
	isSet bool
}

func (v NullableUsersUserPublicKeysInner) Get() *UsersUserPublicKeysInner {
	return v.value
}

func (v *NullableUsersUserPublicKeysInner) Set(val *UsersUserPublicKeysInner) {
	v.value = val
	v.isSet = true
}

func (v NullableUsersUserPublicKeysInner) IsSet() bool {
	return v.isSet
}

func (v *NullableUsersUserPublicKeysInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUsersUserPublicKeysInner(val *UsersUserPublicKeysInner) *NullableUsersUserPublicKeysInner {
	return &NullableUsersUserPublicKeysInner{value: val, isSet: true}
}

func (v NullableUsersUserPublicKeysInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUsersUserPublicKeysInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

