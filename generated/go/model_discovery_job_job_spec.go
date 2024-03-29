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

// checks if the DiscoveryJobJobSpec type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &DiscoveryJobJobSpec{}

// DiscoveryJobJobSpec struct for DiscoveryJobJobSpec
type DiscoveryJobJobSpec struct {
	Command *string `json:"command,omitempty"`
	JobData *DiscoveryJobJobSpecJobData `json:"job_data,omitempty"`
}

// NewDiscoveryJobJobSpec instantiates a new DiscoveryJobJobSpec object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewDiscoveryJobJobSpec() *DiscoveryJobJobSpec {
	this := DiscoveryJobJobSpec{}
	return &this
}

// NewDiscoveryJobJobSpecWithDefaults instantiates a new DiscoveryJobJobSpec object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewDiscoveryJobJobSpecWithDefaults() *DiscoveryJobJobSpec {
	this := DiscoveryJobJobSpec{}
	return &this
}

// GetCommand returns the Command field value if set, zero value otherwise.
func (o *DiscoveryJobJobSpec) GetCommand() string {
	if o == nil || IsNil(o.Command) {
		var ret string
		return ret
	}
	return *o.Command
}

// GetCommandOk returns a tuple with the Command field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DiscoveryJobJobSpec) GetCommandOk() (*string, bool) {
	if o == nil || IsNil(o.Command) {
		return nil, false
	}
	return o.Command, true
}

// HasCommand returns a boolean if a field has been set.
func (o *DiscoveryJobJobSpec) HasCommand() bool {
	if o != nil && !IsNil(o.Command) {
		return true
	}

	return false
}

// SetCommand gets a reference to the given string and assigns it to the Command field.
func (o *DiscoveryJobJobSpec) SetCommand(v string) {
	o.Command = &v
}

// GetJobData returns the JobData field value if set, zero value otherwise.
func (o *DiscoveryJobJobSpec) GetJobData() DiscoveryJobJobSpecJobData {
	if o == nil || IsNil(o.JobData) {
		var ret DiscoveryJobJobSpecJobData
		return ret
	}
	return *o.JobData
}

// GetJobDataOk returns a tuple with the JobData field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DiscoveryJobJobSpec) GetJobDataOk() (*DiscoveryJobJobSpecJobData, bool) {
	if o == nil || IsNil(o.JobData) {
		return nil, false
	}
	return o.JobData, true
}

// HasJobData returns a boolean if a field has been set.
func (o *DiscoveryJobJobSpec) HasJobData() bool {
	if o != nil && !IsNil(o.JobData) {
		return true
	}

	return false
}

// SetJobData gets a reference to the given DiscoveryJobJobSpecJobData and assigns it to the JobData field.
func (o *DiscoveryJobJobSpec) SetJobData(v DiscoveryJobJobSpecJobData) {
	o.JobData = &v
}

func (o DiscoveryJobJobSpec) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o DiscoveryJobJobSpec) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Command) {
		toSerialize["command"] = o.Command
	}
	if !IsNil(o.JobData) {
		toSerialize["job_data"] = o.JobData
	}
	return toSerialize, nil
}

type NullableDiscoveryJobJobSpec struct {
	value *DiscoveryJobJobSpec
	isSet bool
}

func (v NullableDiscoveryJobJobSpec) Get() *DiscoveryJobJobSpec {
	return v.value
}

func (v *NullableDiscoveryJobJobSpec) Set(val *DiscoveryJobJobSpec) {
	v.value = val
	v.isSet = true
}

func (v NullableDiscoveryJobJobSpec) IsSet() bool {
	return v.isSet
}

func (v *NullableDiscoveryJobJobSpec) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableDiscoveryJobJobSpec(val *DiscoveryJobJobSpec) *NullableDiscoveryJobJobSpec {
	return &NullableDiscoveryJobJobSpec{value: val, isSet: true}
}

func (v NullableDiscoveryJobJobSpec) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableDiscoveryJobJobSpec) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


