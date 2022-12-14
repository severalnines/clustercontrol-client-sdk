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

// HostServersInner struct for HostServersInner
type HostServersInner struct {
	ClassName *string `json:"class_name,omitempty"`
	Hostname *string `json:"hostname,omitempty"`
	CdtPath *string `json:"cdt_path,omitempty"`
}

// NewHostServersInner instantiates a new HostServersInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewHostServersInner() *HostServersInner {
	this := HostServersInner{}
	return &this
}

// NewHostServersInnerWithDefaults instantiates a new HostServersInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewHostServersInnerWithDefaults() *HostServersInner {
	this := HostServersInner{}
	return &this
}

// GetClassName returns the ClassName field value if set, zero value otherwise.
func (o *HostServersInner) GetClassName() string {
	if o == nil || o.ClassName == nil {
		var ret string
		return ret
	}
	return *o.ClassName
}

// GetClassNameOk returns a tuple with the ClassName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *HostServersInner) GetClassNameOk() (*string, bool) {
	if o == nil || o.ClassName == nil {
		return nil, false
	}
	return o.ClassName, true
}

// HasClassName returns a boolean if a field has been set.
func (o *HostServersInner) HasClassName() bool {
	if o != nil && o.ClassName != nil {
		return true
	}

	return false
}

// SetClassName gets a reference to the given string and assigns it to the ClassName field.
func (o *HostServersInner) SetClassName(v string) {
	o.ClassName = &v
}

// GetHostname returns the Hostname field value if set, zero value otherwise.
func (o *HostServersInner) GetHostname() string {
	if o == nil || o.Hostname == nil {
		var ret string
		return ret
	}
	return *o.Hostname
}

// GetHostnameOk returns a tuple with the Hostname field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *HostServersInner) GetHostnameOk() (*string, bool) {
	if o == nil || o.Hostname == nil {
		return nil, false
	}
	return o.Hostname, true
}

// HasHostname returns a boolean if a field has been set.
func (o *HostServersInner) HasHostname() bool {
	if o != nil && o.Hostname != nil {
		return true
	}

	return false
}

// SetHostname gets a reference to the given string and assigns it to the Hostname field.
func (o *HostServersInner) SetHostname(v string) {
	o.Hostname = &v
}

// GetCdtPath returns the CdtPath field value if set, zero value otherwise.
func (o *HostServersInner) GetCdtPath() string {
	if o == nil || o.CdtPath == nil {
		var ret string
		return ret
	}
	return *o.CdtPath
}

// GetCdtPathOk returns a tuple with the CdtPath field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *HostServersInner) GetCdtPathOk() (*string, bool) {
	if o == nil || o.CdtPath == nil {
		return nil, false
	}
	return o.CdtPath, true
}

// HasCdtPath returns a boolean if a field has been set.
func (o *HostServersInner) HasCdtPath() bool {
	if o != nil && o.CdtPath != nil {
		return true
	}

	return false
}

// SetCdtPath gets a reference to the given string and assigns it to the CdtPath field.
func (o *HostServersInner) SetCdtPath(v string) {
	o.CdtPath = &v
}

func (o HostServersInner) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.ClassName != nil {
		toSerialize["class_name"] = o.ClassName
	}
	if o.Hostname != nil {
		toSerialize["hostname"] = o.Hostname
	}
	if o.CdtPath != nil {
		toSerialize["cdt_path"] = o.CdtPath
	}
	return json.Marshal(toSerialize)
}

type NullableHostServersInner struct {
	value *HostServersInner
	isSet bool
}

func (v NullableHostServersInner) Get() *HostServersInner {
	return v.value
}

func (v *NullableHostServersInner) Set(val *HostServersInner) {
	v.value = val
	v.isSet = true
}

func (v NullableHostServersInner) IsSet() bool {
	return v.isSet
}

func (v *NullableHostServersInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableHostServersInner(val *HostServersInner) *NullableHostServersInner {
	return &NullableHostServersInner{value: val, isSet: true}
}

func (v NullableHostServersInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableHostServersInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


