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

// ConfigLdapConfigurationGroupMappingsInner struct for ConfigLdapConfigurationGroupMappingsInner
type ConfigLdapConfigurationGroupMappingsInner struct {
	CmonGroupName *string `json:"cmonGroupName,omitempty"`
	LdapGroupId *string `json:"ldapGroupId,omitempty"`
	SectionName *string `json:"sectionName,omitempty"`
}

// NewConfigLdapConfigurationGroupMappingsInner instantiates a new ConfigLdapConfigurationGroupMappingsInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewConfigLdapConfigurationGroupMappingsInner() *ConfigLdapConfigurationGroupMappingsInner {
	this := ConfigLdapConfigurationGroupMappingsInner{}
	return &this
}

// NewConfigLdapConfigurationGroupMappingsInnerWithDefaults instantiates a new ConfigLdapConfigurationGroupMappingsInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewConfigLdapConfigurationGroupMappingsInnerWithDefaults() *ConfigLdapConfigurationGroupMappingsInner {
	this := ConfigLdapConfigurationGroupMappingsInner{}
	return &this
}

// GetCmonGroupName returns the CmonGroupName field value if set, zero value otherwise.
func (o *ConfigLdapConfigurationGroupMappingsInner) GetCmonGroupName() string {
	if o == nil || isNil(o.CmonGroupName) {
		var ret string
		return ret
	}
	return *o.CmonGroupName
}

// GetCmonGroupNameOk returns a tuple with the CmonGroupName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConfigLdapConfigurationGroupMappingsInner) GetCmonGroupNameOk() (*string, bool) {
	if o == nil || isNil(o.CmonGroupName) {
    return nil, false
	}
	return o.CmonGroupName, true
}

// HasCmonGroupName returns a boolean if a field has been set.
func (o *ConfigLdapConfigurationGroupMappingsInner) HasCmonGroupName() bool {
	if o != nil && !isNil(o.CmonGroupName) {
		return true
	}

	return false
}

// SetCmonGroupName gets a reference to the given string and assigns it to the CmonGroupName field.
func (o *ConfigLdapConfigurationGroupMappingsInner) SetCmonGroupName(v string) {
	o.CmonGroupName = &v
}

// GetLdapGroupId returns the LdapGroupId field value if set, zero value otherwise.
func (o *ConfigLdapConfigurationGroupMappingsInner) GetLdapGroupId() string {
	if o == nil || isNil(o.LdapGroupId) {
		var ret string
		return ret
	}
	return *o.LdapGroupId
}

// GetLdapGroupIdOk returns a tuple with the LdapGroupId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConfigLdapConfigurationGroupMappingsInner) GetLdapGroupIdOk() (*string, bool) {
	if o == nil || isNil(o.LdapGroupId) {
    return nil, false
	}
	return o.LdapGroupId, true
}

// HasLdapGroupId returns a boolean if a field has been set.
func (o *ConfigLdapConfigurationGroupMappingsInner) HasLdapGroupId() bool {
	if o != nil && !isNil(o.LdapGroupId) {
		return true
	}

	return false
}

// SetLdapGroupId gets a reference to the given string and assigns it to the LdapGroupId field.
func (o *ConfigLdapConfigurationGroupMappingsInner) SetLdapGroupId(v string) {
	o.LdapGroupId = &v
}

// GetSectionName returns the SectionName field value if set, zero value otherwise.
func (o *ConfigLdapConfigurationGroupMappingsInner) GetSectionName() string {
	if o == nil || isNil(o.SectionName) {
		var ret string
		return ret
	}
	return *o.SectionName
}

// GetSectionNameOk returns a tuple with the SectionName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConfigLdapConfigurationGroupMappingsInner) GetSectionNameOk() (*string, bool) {
	if o == nil || isNil(o.SectionName) {
    return nil, false
	}
	return o.SectionName, true
}

// HasSectionName returns a boolean if a field has been set.
func (o *ConfigLdapConfigurationGroupMappingsInner) HasSectionName() bool {
	if o != nil && !isNil(o.SectionName) {
		return true
	}

	return false
}

// SetSectionName gets a reference to the given string and assigns it to the SectionName field.
func (o *ConfigLdapConfigurationGroupMappingsInner) SetSectionName(v string) {
	o.SectionName = &v
}

func (o ConfigLdapConfigurationGroupMappingsInner) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.CmonGroupName) {
		toSerialize["cmonGroupName"] = o.CmonGroupName
	}
	if !isNil(o.LdapGroupId) {
		toSerialize["ldapGroupId"] = o.LdapGroupId
	}
	if !isNil(o.SectionName) {
		toSerialize["sectionName"] = o.SectionName
	}
	return json.Marshal(toSerialize)
}

type NullableConfigLdapConfigurationGroupMappingsInner struct {
	value *ConfigLdapConfigurationGroupMappingsInner
	isSet bool
}

func (v NullableConfigLdapConfigurationGroupMappingsInner) Get() *ConfigLdapConfigurationGroupMappingsInner {
	return v.value
}

func (v *NullableConfigLdapConfigurationGroupMappingsInner) Set(val *ConfigLdapConfigurationGroupMappingsInner) {
	v.value = val
	v.isSet = true
}

func (v NullableConfigLdapConfigurationGroupMappingsInner) IsSet() bool {
	return v.isSet
}

func (v *NullableConfigLdapConfigurationGroupMappingsInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableConfigLdapConfigurationGroupMappingsInner(val *ConfigLdapConfigurationGroupMappingsInner) *NullableConfigLdapConfigurationGroupMappingsInner {
	return &NullableConfigLdapConfigurationGroupMappingsInner{value: val, isSet: true}
}

func (v NullableConfigLdapConfigurationGroupMappingsInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableConfigLdapConfigurationGroupMappingsInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


