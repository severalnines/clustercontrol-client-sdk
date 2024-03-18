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

// checks if the JobsJobJobSpecJobDataReplicaSetsInnerMembersInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &JobsJobJobSpecJobDataReplicaSetsInnerMembersInner{}

// JobsJobJobSpecJobDataReplicaSetsInnerMembersInner struct for JobsJobJobSpecJobDataReplicaSetsInnerMembersInner
type JobsJobJobSpecJobDataReplicaSetsInnerMembersInner struct {
	Hostname *string `json:"hostname,omitempty"`
	HostnameData *string `json:"hostname_data,omitempty"`
	HostnameInternal *string `json:"hostname_internal,omitempty"`
	Port *string `json:"port,omitempty"`
	ArbiterOnly *bool `json:"arbiter_only,omitempty"`
	Hidden *bool `json:"hidden,omitempty"`
	Priority *int32 `json:"priority,omitempty"`
	SlaveDelay *string `json:"slave_delay,omitempty"`
}

// NewJobsJobJobSpecJobDataReplicaSetsInnerMembersInner instantiates a new JobsJobJobSpecJobDataReplicaSetsInnerMembersInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewJobsJobJobSpecJobDataReplicaSetsInnerMembersInner() *JobsJobJobSpecJobDataReplicaSetsInnerMembersInner {
	this := JobsJobJobSpecJobDataReplicaSetsInnerMembersInner{}
	return &this
}

// NewJobsJobJobSpecJobDataReplicaSetsInnerMembersInnerWithDefaults instantiates a new JobsJobJobSpecJobDataReplicaSetsInnerMembersInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewJobsJobJobSpecJobDataReplicaSetsInnerMembersInnerWithDefaults() *JobsJobJobSpecJobDataReplicaSetsInnerMembersInner {
	this := JobsJobJobSpecJobDataReplicaSetsInnerMembersInner{}
	return &this
}

// GetHostname returns the Hostname field value if set, zero value otherwise.
func (o *JobsJobJobSpecJobDataReplicaSetsInnerMembersInner) GetHostname() string {
	if o == nil || IsNil(o.Hostname) {
		var ret string
		return ret
	}
	return *o.Hostname
}

// GetHostnameOk returns a tuple with the Hostname field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *JobsJobJobSpecJobDataReplicaSetsInnerMembersInner) GetHostnameOk() (*string, bool) {
	if o == nil || IsNil(o.Hostname) {
		return nil, false
	}
	return o.Hostname, true
}

// HasHostname returns a boolean if a field has been set.
func (o *JobsJobJobSpecJobDataReplicaSetsInnerMembersInner) HasHostname() bool {
	if o != nil && !IsNil(o.Hostname) {
		return true
	}

	return false
}

// SetHostname gets a reference to the given string and assigns it to the Hostname field.
func (o *JobsJobJobSpecJobDataReplicaSetsInnerMembersInner) SetHostname(v string) {
	o.Hostname = &v
}

// GetHostnameData returns the HostnameData field value if set, zero value otherwise.
func (o *JobsJobJobSpecJobDataReplicaSetsInnerMembersInner) GetHostnameData() string {
	if o == nil || IsNil(o.HostnameData) {
		var ret string
		return ret
	}
	return *o.HostnameData
}

// GetHostnameDataOk returns a tuple with the HostnameData field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *JobsJobJobSpecJobDataReplicaSetsInnerMembersInner) GetHostnameDataOk() (*string, bool) {
	if o == nil || IsNil(o.HostnameData) {
		return nil, false
	}
	return o.HostnameData, true
}

// HasHostnameData returns a boolean if a field has been set.
func (o *JobsJobJobSpecJobDataReplicaSetsInnerMembersInner) HasHostnameData() bool {
	if o != nil && !IsNil(o.HostnameData) {
		return true
	}

	return false
}

// SetHostnameData gets a reference to the given string and assigns it to the HostnameData field.
func (o *JobsJobJobSpecJobDataReplicaSetsInnerMembersInner) SetHostnameData(v string) {
	o.HostnameData = &v
}

// GetHostnameInternal returns the HostnameInternal field value if set, zero value otherwise.
func (o *JobsJobJobSpecJobDataReplicaSetsInnerMembersInner) GetHostnameInternal() string {
	if o == nil || IsNil(o.HostnameInternal) {
		var ret string
		return ret
	}
	return *o.HostnameInternal
}

// GetHostnameInternalOk returns a tuple with the HostnameInternal field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *JobsJobJobSpecJobDataReplicaSetsInnerMembersInner) GetHostnameInternalOk() (*string, bool) {
	if o == nil || IsNil(o.HostnameInternal) {
		return nil, false
	}
	return o.HostnameInternal, true
}

// HasHostnameInternal returns a boolean if a field has been set.
func (o *JobsJobJobSpecJobDataReplicaSetsInnerMembersInner) HasHostnameInternal() bool {
	if o != nil && !IsNil(o.HostnameInternal) {
		return true
	}

	return false
}

// SetHostnameInternal gets a reference to the given string and assigns it to the HostnameInternal field.
func (o *JobsJobJobSpecJobDataReplicaSetsInnerMembersInner) SetHostnameInternal(v string) {
	o.HostnameInternal = &v
}

// GetPort returns the Port field value if set, zero value otherwise.
func (o *JobsJobJobSpecJobDataReplicaSetsInnerMembersInner) GetPort() string {
	if o == nil || IsNil(o.Port) {
		var ret string
		return ret
	}
	return *o.Port
}

// GetPortOk returns a tuple with the Port field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *JobsJobJobSpecJobDataReplicaSetsInnerMembersInner) GetPortOk() (*string, bool) {
	if o == nil || IsNil(o.Port) {
		return nil, false
	}
	return o.Port, true
}

// HasPort returns a boolean if a field has been set.
func (o *JobsJobJobSpecJobDataReplicaSetsInnerMembersInner) HasPort() bool {
	if o != nil && !IsNil(o.Port) {
		return true
	}

	return false
}

// SetPort gets a reference to the given string and assigns it to the Port field.
func (o *JobsJobJobSpecJobDataReplicaSetsInnerMembersInner) SetPort(v string) {
	o.Port = &v
}

// GetArbiterOnly returns the ArbiterOnly field value if set, zero value otherwise.
func (o *JobsJobJobSpecJobDataReplicaSetsInnerMembersInner) GetArbiterOnly() bool {
	if o == nil || IsNil(o.ArbiterOnly) {
		var ret bool
		return ret
	}
	return *o.ArbiterOnly
}

// GetArbiterOnlyOk returns a tuple with the ArbiterOnly field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *JobsJobJobSpecJobDataReplicaSetsInnerMembersInner) GetArbiterOnlyOk() (*bool, bool) {
	if o == nil || IsNil(o.ArbiterOnly) {
		return nil, false
	}
	return o.ArbiterOnly, true
}

// HasArbiterOnly returns a boolean if a field has been set.
func (o *JobsJobJobSpecJobDataReplicaSetsInnerMembersInner) HasArbiterOnly() bool {
	if o != nil && !IsNil(o.ArbiterOnly) {
		return true
	}

	return false
}

// SetArbiterOnly gets a reference to the given bool and assigns it to the ArbiterOnly field.
func (o *JobsJobJobSpecJobDataReplicaSetsInnerMembersInner) SetArbiterOnly(v bool) {
	o.ArbiterOnly = &v
}

// GetHidden returns the Hidden field value if set, zero value otherwise.
func (o *JobsJobJobSpecJobDataReplicaSetsInnerMembersInner) GetHidden() bool {
	if o == nil || IsNil(o.Hidden) {
		var ret bool
		return ret
	}
	return *o.Hidden
}

// GetHiddenOk returns a tuple with the Hidden field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *JobsJobJobSpecJobDataReplicaSetsInnerMembersInner) GetHiddenOk() (*bool, bool) {
	if o == nil || IsNil(o.Hidden) {
		return nil, false
	}
	return o.Hidden, true
}

// HasHidden returns a boolean if a field has been set.
func (o *JobsJobJobSpecJobDataReplicaSetsInnerMembersInner) HasHidden() bool {
	if o != nil && !IsNil(o.Hidden) {
		return true
	}

	return false
}

// SetHidden gets a reference to the given bool and assigns it to the Hidden field.
func (o *JobsJobJobSpecJobDataReplicaSetsInnerMembersInner) SetHidden(v bool) {
	o.Hidden = &v
}

// GetPriority returns the Priority field value if set, zero value otherwise.
func (o *JobsJobJobSpecJobDataReplicaSetsInnerMembersInner) GetPriority() int32 {
	if o == nil || IsNil(o.Priority) {
		var ret int32
		return ret
	}
	return *o.Priority
}

// GetPriorityOk returns a tuple with the Priority field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *JobsJobJobSpecJobDataReplicaSetsInnerMembersInner) GetPriorityOk() (*int32, bool) {
	if o == nil || IsNil(o.Priority) {
		return nil, false
	}
	return o.Priority, true
}

// HasPriority returns a boolean if a field has been set.
func (o *JobsJobJobSpecJobDataReplicaSetsInnerMembersInner) HasPriority() bool {
	if o != nil && !IsNil(o.Priority) {
		return true
	}

	return false
}

// SetPriority gets a reference to the given int32 and assigns it to the Priority field.
func (o *JobsJobJobSpecJobDataReplicaSetsInnerMembersInner) SetPriority(v int32) {
	o.Priority = &v
}

// GetSlaveDelay returns the SlaveDelay field value if set, zero value otherwise.
func (o *JobsJobJobSpecJobDataReplicaSetsInnerMembersInner) GetSlaveDelay() string {
	if o == nil || IsNil(o.SlaveDelay) {
		var ret string
		return ret
	}
	return *o.SlaveDelay
}

// GetSlaveDelayOk returns a tuple with the SlaveDelay field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *JobsJobJobSpecJobDataReplicaSetsInnerMembersInner) GetSlaveDelayOk() (*string, bool) {
	if o == nil || IsNil(o.SlaveDelay) {
		return nil, false
	}
	return o.SlaveDelay, true
}

// HasSlaveDelay returns a boolean if a field has been set.
func (o *JobsJobJobSpecJobDataReplicaSetsInnerMembersInner) HasSlaveDelay() bool {
	if o != nil && !IsNil(o.SlaveDelay) {
		return true
	}

	return false
}

// SetSlaveDelay gets a reference to the given string and assigns it to the SlaveDelay field.
func (o *JobsJobJobSpecJobDataReplicaSetsInnerMembersInner) SetSlaveDelay(v string) {
	o.SlaveDelay = &v
}

func (o JobsJobJobSpecJobDataReplicaSetsInnerMembersInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o JobsJobJobSpecJobDataReplicaSetsInnerMembersInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Hostname) {
		toSerialize["hostname"] = o.Hostname
	}
	if !IsNil(o.HostnameData) {
		toSerialize["hostname_data"] = o.HostnameData
	}
	if !IsNil(o.HostnameInternal) {
		toSerialize["hostname_internal"] = o.HostnameInternal
	}
	if !IsNil(o.Port) {
		toSerialize["port"] = o.Port
	}
	if !IsNil(o.ArbiterOnly) {
		toSerialize["arbiter_only"] = o.ArbiterOnly
	}
	if !IsNil(o.Hidden) {
		toSerialize["hidden"] = o.Hidden
	}
	if !IsNil(o.Priority) {
		toSerialize["priority"] = o.Priority
	}
	if !IsNil(o.SlaveDelay) {
		toSerialize["slave_delay"] = o.SlaveDelay
	}
	return toSerialize, nil
}

type NullableJobsJobJobSpecJobDataReplicaSetsInnerMembersInner struct {
	value *JobsJobJobSpecJobDataReplicaSetsInnerMembersInner
	isSet bool
}

func (v NullableJobsJobJobSpecJobDataReplicaSetsInnerMembersInner) Get() *JobsJobJobSpecJobDataReplicaSetsInnerMembersInner {
	return v.value
}

func (v *NullableJobsJobJobSpecJobDataReplicaSetsInnerMembersInner) Set(val *JobsJobJobSpecJobDataReplicaSetsInnerMembersInner) {
	v.value = val
	v.isSet = true
}

func (v NullableJobsJobJobSpecJobDataReplicaSetsInnerMembersInner) IsSet() bool {
	return v.isSet
}

func (v *NullableJobsJobJobSpecJobDataReplicaSetsInnerMembersInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableJobsJobJobSpecJobDataReplicaSetsInnerMembersInner(val *JobsJobJobSpecJobDataReplicaSetsInnerMembersInner) *NullableJobsJobJobSpecJobDataReplicaSetsInnerMembersInner {
	return &NullableJobsJobJobSpecJobDataReplicaSetsInnerMembersInner{value: val, isSet: true}
}

func (v NullableJobsJobJobSpecJobDataReplicaSetsInnerMembersInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableJobsJobJobSpecJobDataReplicaSetsInnerMembersInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


