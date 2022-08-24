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

// UsersUserTimezone struct for UsersUserTimezone
type UsersUserTimezone struct {
	ClassName *string `json:"class_name,omitempty"`
	Abbreviation *string `json:"abbreviation,omitempty"`
	Name *string `json:"name,omitempty"`
	Offset *int32 `json:"offset,omitempty"`
	UseDst *bool `json:"use_dst,omitempty"`
}

// NewUsersUserTimezone instantiates a new UsersUserTimezone object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUsersUserTimezone() *UsersUserTimezone {
	this := UsersUserTimezone{}
	return &this
}

// NewUsersUserTimezoneWithDefaults instantiates a new UsersUserTimezone object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUsersUserTimezoneWithDefaults() *UsersUserTimezone {
	this := UsersUserTimezone{}
	return &this
}

// GetClassName returns the ClassName field value if set, zero value otherwise.
func (o *UsersUserTimezone) GetClassName() string {
	if o == nil || o.ClassName == nil {
		var ret string
		return ret
	}
	return *o.ClassName
}

// GetClassNameOk returns a tuple with the ClassName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UsersUserTimezone) GetClassNameOk() (*string, bool) {
	if o == nil || o.ClassName == nil {
		return nil, false
	}
	return o.ClassName, true
}

// HasClassName returns a boolean if a field has been set.
func (o *UsersUserTimezone) HasClassName() bool {
	if o != nil && o.ClassName != nil {
		return true
	}

	return false
}

// SetClassName gets a reference to the given string and assigns it to the ClassName field.
func (o *UsersUserTimezone) SetClassName(v string) {
	o.ClassName = &v
}

// GetAbbreviation returns the Abbreviation field value if set, zero value otherwise.
func (o *UsersUserTimezone) GetAbbreviation() string {
	if o == nil || o.Abbreviation == nil {
		var ret string
		return ret
	}
	return *o.Abbreviation
}

// GetAbbreviationOk returns a tuple with the Abbreviation field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UsersUserTimezone) GetAbbreviationOk() (*string, bool) {
	if o == nil || o.Abbreviation == nil {
		return nil, false
	}
	return o.Abbreviation, true
}

// HasAbbreviation returns a boolean if a field has been set.
func (o *UsersUserTimezone) HasAbbreviation() bool {
	if o != nil && o.Abbreviation != nil {
		return true
	}

	return false
}

// SetAbbreviation gets a reference to the given string and assigns it to the Abbreviation field.
func (o *UsersUserTimezone) SetAbbreviation(v string) {
	o.Abbreviation = &v
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *UsersUserTimezone) GetName() string {
	if o == nil || o.Name == nil {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UsersUserTimezone) GetNameOk() (*string, bool) {
	if o == nil || o.Name == nil {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *UsersUserTimezone) HasName() bool {
	if o != nil && o.Name != nil {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *UsersUserTimezone) SetName(v string) {
	o.Name = &v
}

// GetOffset returns the Offset field value if set, zero value otherwise.
func (o *UsersUserTimezone) GetOffset() int32 {
	if o == nil || o.Offset == nil {
		var ret int32
		return ret
	}
	return *o.Offset
}

// GetOffsetOk returns a tuple with the Offset field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UsersUserTimezone) GetOffsetOk() (*int32, bool) {
	if o == nil || o.Offset == nil {
		return nil, false
	}
	return o.Offset, true
}

// HasOffset returns a boolean if a field has been set.
func (o *UsersUserTimezone) HasOffset() bool {
	if o != nil && o.Offset != nil {
		return true
	}

	return false
}

// SetOffset gets a reference to the given int32 and assigns it to the Offset field.
func (o *UsersUserTimezone) SetOffset(v int32) {
	o.Offset = &v
}

// GetUseDst returns the UseDst field value if set, zero value otherwise.
func (o *UsersUserTimezone) GetUseDst() bool {
	if o == nil || o.UseDst == nil {
		var ret bool
		return ret
	}
	return *o.UseDst
}

// GetUseDstOk returns a tuple with the UseDst field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UsersUserTimezone) GetUseDstOk() (*bool, bool) {
	if o == nil || o.UseDst == nil {
		return nil, false
	}
	return o.UseDst, true
}

// HasUseDst returns a boolean if a field has been set.
func (o *UsersUserTimezone) HasUseDst() bool {
	if o != nil && o.UseDst != nil {
		return true
	}

	return false
}

// SetUseDst gets a reference to the given bool and assigns it to the UseDst field.
func (o *UsersUserTimezone) SetUseDst(v bool) {
	o.UseDst = &v
}

func (o UsersUserTimezone) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.ClassName != nil {
		toSerialize["class_name"] = o.ClassName
	}
	if o.Abbreviation != nil {
		toSerialize["abbreviation"] = o.Abbreviation
	}
	if o.Name != nil {
		toSerialize["name"] = o.Name
	}
	if o.Offset != nil {
		toSerialize["offset"] = o.Offset
	}
	if o.UseDst != nil {
		toSerialize["use_dst"] = o.UseDst
	}
	return json.Marshal(toSerialize)
}

type NullableUsersUserTimezone struct {
	value *UsersUserTimezone
	isSet bool
}

func (v NullableUsersUserTimezone) Get() *UsersUserTimezone {
	return v.value
}

func (v *NullableUsersUserTimezone) Set(val *UsersUserTimezone) {
	v.value = val
	v.isSet = true
}

func (v NullableUsersUserTimezone) IsSet() bool {
	return v.isSet
}

func (v *NullableUsersUserTimezone) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUsersUserTimezone(val *UsersUserTimezone) *NullableUsersUserTimezone {
	return &NullableUsersUserTimezone{value: val, isSet: true}
}

func (v NullableUsersUserTimezone) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUsersUserTimezone) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

