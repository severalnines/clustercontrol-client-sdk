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

// DiscoveryJobJobSpecJobDataNodesInner struct for DiscoveryJobJobSpecJobDataNodesInner
type DiscoveryJobJobSpecJobDataNodesInner struct {
	ClassName *string `json:"class_name,omitempty"`
	// IP address or Hostname
	HostName *string `json:"host_name,omitempty"`
}

// NewDiscoveryJobJobSpecJobDataNodesInner instantiates a new DiscoveryJobJobSpecJobDataNodesInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewDiscoveryJobJobSpecJobDataNodesInner() *DiscoveryJobJobSpecJobDataNodesInner {
	this := DiscoveryJobJobSpecJobDataNodesInner{}
	return &this
}

// NewDiscoveryJobJobSpecJobDataNodesInnerWithDefaults instantiates a new DiscoveryJobJobSpecJobDataNodesInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewDiscoveryJobJobSpecJobDataNodesInnerWithDefaults() *DiscoveryJobJobSpecJobDataNodesInner {
	this := DiscoveryJobJobSpecJobDataNodesInner{}
	return &this
}

// GetClassName returns the ClassName field value if set, zero value otherwise.
func (o *DiscoveryJobJobSpecJobDataNodesInner) GetClassName() string {
	if o == nil || o.ClassName == nil {
		var ret string
		return ret
	}
	return *o.ClassName
}

// GetClassNameOk returns a tuple with the ClassName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DiscoveryJobJobSpecJobDataNodesInner) GetClassNameOk() (*string, bool) {
	if o == nil || o.ClassName == nil {
		return nil, false
	}
	return o.ClassName, true
}

// HasClassName returns a boolean if a field has been set.
func (o *DiscoveryJobJobSpecJobDataNodesInner) HasClassName() bool {
	if o != nil && o.ClassName != nil {
		return true
	}

	return false
}

// SetClassName gets a reference to the given string and assigns it to the ClassName field.
func (o *DiscoveryJobJobSpecJobDataNodesInner) SetClassName(v string) {
	o.ClassName = &v
}

// GetHostName returns the HostName field value if set, zero value otherwise.
func (o *DiscoveryJobJobSpecJobDataNodesInner) GetHostName() string {
	if o == nil || o.HostName == nil {
		var ret string
		return ret
	}
	return *o.HostName
}

// GetHostNameOk returns a tuple with the HostName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DiscoveryJobJobSpecJobDataNodesInner) GetHostNameOk() (*string, bool) {
	if o == nil || o.HostName == nil {
		return nil, false
	}
	return o.HostName, true
}

// HasHostName returns a boolean if a field has been set.
func (o *DiscoveryJobJobSpecJobDataNodesInner) HasHostName() bool {
	if o != nil && o.HostName != nil {
		return true
	}

	return false
}

// SetHostName gets a reference to the given string and assigns it to the HostName field.
func (o *DiscoveryJobJobSpecJobDataNodesInner) SetHostName(v string) {
	o.HostName = &v
}

func (o DiscoveryJobJobSpecJobDataNodesInner) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.ClassName != nil {
		toSerialize["class_name"] = o.ClassName
	}
	if o.HostName != nil {
		toSerialize["host_name"] = o.HostName
	}
	return json.Marshal(toSerialize)
}

type NullableDiscoveryJobJobSpecJobDataNodesInner struct {
	value *DiscoveryJobJobSpecJobDataNodesInner
	isSet bool
}

func (v NullableDiscoveryJobJobSpecJobDataNodesInner) Get() *DiscoveryJobJobSpecJobDataNodesInner {
	return v.value
}

func (v *NullableDiscoveryJobJobSpecJobDataNodesInner) Set(val *DiscoveryJobJobSpecJobDataNodesInner) {
	v.value = val
	v.isSet = true
}

func (v NullableDiscoveryJobJobSpecJobDataNodesInner) IsSet() bool {
	return v.isSet
}

func (v *NullableDiscoveryJobJobSpecJobDataNodesInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableDiscoveryJobJobSpecJobDataNodesInner(val *DiscoveryJobJobSpecJobDataNodesInner) *NullableDiscoveryJobJobSpecJobDataNodesInner {
	return &NullableDiscoveryJobJobSpecJobDataNodesInner{value: val, isSet: true}
}

func (v NullableDiscoveryJobJobSpecJobDataNodesInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableDiscoveryJobJobSpecJobDataNodesInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

