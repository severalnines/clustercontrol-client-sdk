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

// checks if the ConfigConfigurationInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ConfigConfigurationInner{}

// ConfigConfigurationInner struct for ConfigConfigurationInner
type ConfigConfigurationInner struct {
	Name *string `json:"name,omitempty"`
	Value *string `json:"value,omitempty"`
	// Group name
	Group *string `json:"group,omitempty"`
}

// NewConfigConfigurationInner instantiates a new ConfigConfigurationInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewConfigConfigurationInner() *ConfigConfigurationInner {
	this := ConfigConfigurationInner{}
	return &this
}

// NewConfigConfigurationInnerWithDefaults instantiates a new ConfigConfigurationInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewConfigConfigurationInnerWithDefaults() *ConfigConfigurationInner {
	this := ConfigConfigurationInner{}
	return &this
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *ConfigConfigurationInner) GetName() string {
	if o == nil || IsNil(o.Name) {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConfigConfigurationInner) GetNameOk() (*string, bool) {
	if o == nil || IsNil(o.Name) {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *ConfigConfigurationInner) HasName() bool {
	if o != nil && !IsNil(o.Name) {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *ConfigConfigurationInner) SetName(v string) {
	o.Name = &v
}

// GetValue returns the Value field value if set, zero value otherwise.
func (o *ConfigConfigurationInner) GetValue() string {
	if o == nil || IsNil(o.Value) {
		var ret string
		return ret
	}
	return *o.Value
}

// GetValueOk returns a tuple with the Value field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConfigConfigurationInner) GetValueOk() (*string, bool) {
	if o == nil || IsNil(o.Value) {
		return nil, false
	}
	return o.Value, true
}

// HasValue returns a boolean if a field has been set.
func (o *ConfigConfigurationInner) HasValue() bool {
	if o != nil && !IsNil(o.Value) {
		return true
	}

	return false
}

// SetValue gets a reference to the given string and assigns it to the Value field.
func (o *ConfigConfigurationInner) SetValue(v string) {
	o.Value = &v
}

// GetGroup returns the Group field value if set, zero value otherwise.
func (o *ConfigConfigurationInner) GetGroup() string {
	if o == nil || IsNil(o.Group) {
		var ret string
		return ret
	}
	return *o.Group
}

// GetGroupOk returns a tuple with the Group field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConfigConfigurationInner) GetGroupOk() (*string, bool) {
	if o == nil || IsNil(o.Group) {
		return nil, false
	}
	return o.Group, true
}

// HasGroup returns a boolean if a field has been set.
func (o *ConfigConfigurationInner) HasGroup() bool {
	if o != nil && !IsNil(o.Group) {
		return true
	}

	return false
}

// SetGroup gets a reference to the given string and assigns it to the Group field.
func (o *ConfigConfigurationInner) SetGroup(v string) {
	o.Group = &v
}

func (o ConfigConfigurationInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ConfigConfigurationInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Name) {
		toSerialize["name"] = o.Name
	}
	if !IsNil(o.Value) {
		toSerialize["value"] = o.Value
	}
	if !IsNil(o.Group) {
		toSerialize["group"] = o.Group
	}
	return toSerialize, nil
}

type NullableConfigConfigurationInner struct {
	value *ConfigConfigurationInner
	isSet bool
}

func (v NullableConfigConfigurationInner) Get() *ConfigConfigurationInner {
	return v.value
}

func (v *NullableConfigConfigurationInner) Set(val *ConfigConfigurationInner) {
	v.value = val
	v.isSet = true
}

func (v NullableConfigConfigurationInner) IsSet() bool {
	return v.isSet
}

func (v *NullableConfigConfigurationInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableConfigConfigurationInner(val *ConfigConfigurationInner) *NullableConfigConfigurationInner {
	return &NullableConfigConfigurationInner{value: val, isSet: true}
}

func (v NullableConfigConfigurationInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableConfigConfigurationInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


