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

// checks if the JobsJobJobSpecJobDataReplicaSetsInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &JobsJobJobSpecJobDataReplicaSetsInner{}

// JobsJobJobSpecJobDataReplicaSetsInner struct for JobsJobJobSpecJobDataReplicaSetsInner
type JobsJobJobSpecJobDataReplicaSetsInner struct {
	Rs *string `json:"rs,omitempty"`
	Members []JobsJobJobSpecJobDataReplicaSetsInnerMembersInner `json:"members,omitempty"`
}

// NewJobsJobJobSpecJobDataReplicaSetsInner instantiates a new JobsJobJobSpecJobDataReplicaSetsInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewJobsJobJobSpecJobDataReplicaSetsInner() *JobsJobJobSpecJobDataReplicaSetsInner {
	this := JobsJobJobSpecJobDataReplicaSetsInner{}
	return &this
}

// NewJobsJobJobSpecJobDataReplicaSetsInnerWithDefaults instantiates a new JobsJobJobSpecJobDataReplicaSetsInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewJobsJobJobSpecJobDataReplicaSetsInnerWithDefaults() *JobsJobJobSpecJobDataReplicaSetsInner {
	this := JobsJobJobSpecJobDataReplicaSetsInner{}
	return &this
}

// GetRs returns the Rs field value if set, zero value otherwise.
func (o *JobsJobJobSpecJobDataReplicaSetsInner) GetRs() string {
	if o == nil || IsNil(o.Rs) {
		var ret string
		return ret
	}
	return *o.Rs
}

// GetRsOk returns a tuple with the Rs field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *JobsJobJobSpecJobDataReplicaSetsInner) GetRsOk() (*string, bool) {
	if o == nil || IsNil(o.Rs) {
		return nil, false
	}
	return o.Rs, true
}

// HasRs returns a boolean if a field has been set.
func (o *JobsJobJobSpecJobDataReplicaSetsInner) HasRs() bool {
	if o != nil && !IsNil(o.Rs) {
		return true
	}

	return false
}

// SetRs gets a reference to the given string and assigns it to the Rs field.
func (o *JobsJobJobSpecJobDataReplicaSetsInner) SetRs(v string) {
	o.Rs = &v
}

// GetMembers returns the Members field value if set, zero value otherwise.
func (o *JobsJobJobSpecJobDataReplicaSetsInner) GetMembers() []JobsJobJobSpecJobDataReplicaSetsInnerMembersInner {
	if o == nil || IsNil(o.Members) {
		var ret []JobsJobJobSpecJobDataReplicaSetsInnerMembersInner
		return ret
	}
	return o.Members
}

// GetMembersOk returns a tuple with the Members field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *JobsJobJobSpecJobDataReplicaSetsInner) GetMembersOk() ([]JobsJobJobSpecJobDataReplicaSetsInnerMembersInner, bool) {
	if o == nil || IsNil(o.Members) {
		return nil, false
	}
	return o.Members, true
}

// HasMembers returns a boolean if a field has been set.
func (o *JobsJobJobSpecJobDataReplicaSetsInner) HasMembers() bool {
	if o != nil && !IsNil(o.Members) {
		return true
	}

	return false
}

// SetMembers gets a reference to the given []JobsJobJobSpecJobDataReplicaSetsInnerMembersInner and assigns it to the Members field.
func (o *JobsJobJobSpecJobDataReplicaSetsInner) SetMembers(v []JobsJobJobSpecJobDataReplicaSetsInnerMembersInner) {
	o.Members = v
}

func (o JobsJobJobSpecJobDataReplicaSetsInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o JobsJobJobSpecJobDataReplicaSetsInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Rs) {
		toSerialize["rs"] = o.Rs
	}
	if !IsNil(o.Members) {
		toSerialize["members"] = o.Members
	}
	return toSerialize, nil
}

type NullableJobsJobJobSpecJobDataReplicaSetsInner struct {
	value *JobsJobJobSpecJobDataReplicaSetsInner
	isSet bool
}

func (v NullableJobsJobJobSpecJobDataReplicaSetsInner) Get() *JobsJobJobSpecJobDataReplicaSetsInner {
	return v.value
}

func (v *NullableJobsJobJobSpecJobDataReplicaSetsInner) Set(val *JobsJobJobSpecJobDataReplicaSetsInner) {
	v.value = val
	v.isSet = true
}

func (v NullableJobsJobJobSpecJobDataReplicaSetsInner) IsSet() bool {
	return v.isSet
}

func (v *NullableJobsJobJobSpecJobDataReplicaSetsInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableJobsJobJobSpecJobDataReplicaSetsInner(val *JobsJobJobSpecJobDataReplicaSetsInner) *NullableJobsJobJobSpecJobDataReplicaSetsInner {
	return &NullableJobsJobJobSpecJobDataReplicaSetsInner{value: val, isSet: true}
}

func (v NullableJobsJobJobSpecJobDataReplicaSetsInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableJobsJobJobSpecJobDataReplicaSetsInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


