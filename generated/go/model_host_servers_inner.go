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

// checks if the HostServersInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &HostServersInner{}

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
	if o == nil || IsNil(o.ClassName) {
		var ret string
		return ret
	}
	return *o.ClassName
}

// GetClassNameOk returns a tuple with the ClassName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *HostServersInner) GetClassNameOk() (*string, bool) {
	if o == nil || IsNil(o.ClassName) {
		return nil, false
	}
	return o.ClassName, true
}

// HasClassName returns a boolean if a field has been set.
func (o *HostServersInner) HasClassName() bool {
	if o != nil && !IsNil(o.ClassName) {
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
	if o == nil || IsNil(o.Hostname) {
		var ret string
		return ret
	}
	return *o.Hostname
}

// GetHostnameOk returns a tuple with the Hostname field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *HostServersInner) GetHostnameOk() (*string, bool) {
	if o == nil || IsNil(o.Hostname) {
		return nil, false
	}
	return o.Hostname, true
}

// HasHostname returns a boolean if a field has been set.
func (o *HostServersInner) HasHostname() bool {
	if o != nil && !IsNil(o.Hostname) {
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
	if o == nil || IsNil(o.CdtPath) {
		var ret string
		return ret
	}
	return *o.CdtPath
}

// GetCdtPathOk returns a tuple with the CdtPath field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *HostServersInner) GetCdtPathOk() (*string, bool) {
	if o == nil || IsNil(o.CdtPath) {
		return nil, false
	}
	return o.CdtPath, true
}

// HasCdtPath returns a boolean if a field has been set.
func (o *HostServersInner) HasCdtPath() bool {
	if o != nil && !IsNil(o.CdtPath) {
		return true
	}

	return false
}

// SetCdtPath gets a reference to the given string and assigns it to the CdtPath field.
func (o *HostServersInner) SetCdtPath(v string) {
	o.CdtPath = &v
}

func (o HostServersInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o HostServersInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.ClassName) {
		toSerialize["class_name"] = o.ClassName
	}
	if !IsNil(o.Hostname) {
		toSerialize["hostname"] = o.Hostname
	}
	if !IsNil(o.CdtPath) {
		toSerialize["cdt_path"] = o.CdtPath
	}
	return toSerialize, nil
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


