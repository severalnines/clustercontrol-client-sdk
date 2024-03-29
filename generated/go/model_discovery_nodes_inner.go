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

// checks if the DiscoveryNodesInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &DiscoveryNodesInner{}

// DiscoveryNodesInner struct for DiscoveryNodesInner
type DiscoveryNodesInner struct {
	ClassName *string `json:"class_name,omitempty"`
	// IP address or Hostname
	HostName *string `json:"host_name,omitempty"`
	Port *int32 `json:"port,omitempty"`
}

// NewDiscoveryNodesInner instantiates a new DiscoveryNodesInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewDiscoveryNodesInner() *DiscoveryNodesInner {
	this := DiscoveryNodesInner{}
	return &this
}

// NewDiscoveryNodesInnerWithDefaults instantiates a new DiscoveryNodesInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewDiscoveryNodesInnerWithDefaults() *DiscoveryNodesInner {
	this := DiscoveryNodesInner{}
	return &this
}

// GetClassName returns the ClassName field value if set, zero value otherwise.
func (o *DiscoveryNodesInner) GetClassName() string {
	if o == nil || IsNil(o.ClassName) {
		var ret string
		return ret
	}
	return *o.ClassName
}

// GetClassNameOk returns a tuple with the ClassName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DiscoveryNodesInner) GetClassNameOk() (*string, bool) {
	if o == nil || IsNil(o.ClassName) {
		return nil, false
	}
	return o.ClassName, true
}

// HasClassName returns a boolean if a field has been set.
func (o *DiscoveryNodesInner) HasClassName() bool {
	if o != nil && !IsNil(o.ClassName) {
		return true
	}

	return false
}

// SetClassName gets a reference to the given string and assigns it to the ClassName field.
func (o *DiscoveryNodesInner) SetClassName(v string) {
	o.ClassName = &v
}

// GetHostName returns the HostName field value if set, zero value otherwise.
func (o *DiscoveryNodesInner) GetHostName() string {
	if o == nil || IsNil(o.HostName) {
		var ret string
		return ret
	}
	return *o.HostName
}

// GetHostNameOk returns a tuple with the HostName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DiscoveryNodesInner) GetHostNameOk() (*string, bool) {
	if o == nil || IsNil(o.HostName) {
		return nil, false
	}
	return o.HostName, true
}

// HasHostName returns a boolean if a field has been set.
func (o *DiscoveryNodesInner) HasHostName() bool {
	if o != nil && !IsNil(o.HostName) {
		return true
	}

	return false
}

// SetHostName gets a reference to the given string and assigns it to the HostName field.
func (o *DiscoveryNodesInner) SetHostName(v string) {
	o.HostName = &v
}

// GetPort returns the Port field value if set, zero value otherwise.
func (o *DiscoveryNodesInner) GetPort() int32 {
	if o == nil || IsNil(o.Port) {
		var ret int32
		return ret
	}
	return *o.Port
}

// GetPortOk returns a tuple with the Port field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DiscoveryNodesInner) GetPortOk() (*int32, bool) {
	if o == nil || IsNil(o.Port) {
		return nil, false
	}
	return o.Port, true
}

// HasPort returns a boolean if a field has been set.
func (o *DiscoveryNodesInner) HasPort() bool {
	if o != nil && !IsNil(o.Port) {
		return true
	}

	return false
}

// SetPort gets a reference to the given int32 and assigns it to the Port field.
func (o *DiscoveryNodesInner) SetPort(v int32) {
	o.Port = &v
}

func (o DiscoveryNodesInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o DiscoveryNodesInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.ClassName) {
		toSerialize["class_name"] = o.ClassName
	}
	if !IsNil(o.HostName) {
		toSerialize["host_name"] = o.HostName
	}
	if !IsNil(o.Port) {
		toSerialize["port"] = o.Port
	}
	return toSerialize, nil
}

type NullableDiscoveryNodesInner struct {
	value *DiscoveryNodesInner
	isSet bool
}

func (v NullableDiscoveryNodesInner) Get() *DiscoveryNodesInner {
	return v.value
}

func (v *NullableDiscoveryNodesInner) Set(val *DiscoveryNodesInner) {
	v.value = val
	v.isSet = true
}

func (v NullableDiscoveryNodesInner) IsSet() bool {
	return v.isSet
}

func (v *NullableDiscoveryNodesInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableDiscoveryNodesInner(val *DiscoveryNodesInner) *NullableDiscoveryNodesInner {
	return &NullableDiscoveryNodesInner{value: val, isSet: true}
}

func (v NullableDiscoveryNodesInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableDiscoveryNodesInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


