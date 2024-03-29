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

// checks if the BackupSchedule type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &BackupSchedule{}

// BackupSchedule struct for BackupSchedule
type BackupSchedule struct {
	ClassName *string `json:"class_name,omitempty"`
	Enabled *bool `json:"enabled,omitempty"`
	Schedule *string `json:"schedule,omitempty"`
	ScheduleId *int32 `json:"schedule_id,omitempty"`
	Job *BackupScheduleJob `json:"job,omitempty"`
}

// NewBackupSchedule instantiates a new BackupSchedule object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewBackupSchedule() *BackupSchedule {
	this := BackupSchedule{}
	return &this
}

// NewBackupScheduleWithDefaults instantiates a new BackupSchedule object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewBackupScheduleWithDefaults() *BackupSchedule {
	this := BackupSchedule{}
	return &this
}

// GetClassName returns the ClassName field value if set, zero value otherwise.
func (o *BackupSchedule) GetClassName() string {
	if o == nil || IsNil(o.ClassName) {
		var ret string
		return ret
	}
	return *o.ClassName
}

// GetClassNameOk returns a tuple with the ClassName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BackupSchedule) GetClassNameOk() (*string, bool) {
	if o == nil || IsNil(o.ClassName) {
		return nil, false
	}
	return o.ClassName, true
}

// HasClassName returns a boolean if a field has been set.
func (o *BackupSchedule) HasClassName() bool {
	if o != nil && !IsNil(o.ClassName) {
		return true
	}

	return false
}

// SetClassName gets a reference to the given string and assigns it to the ClassName field.
func (o *BackupSchedule) SetClassName(v string) {
	o.ClassName = &v
}

// GetEnabled returns the Enabled field value if set, zero value otherwise.
func (o *BackupSchedule) GetEnabled() bool {
	if o == nil || IsNil(o.Enabled) {
		var ret bool
		return ret
	}
	return *o.Enabled
}

// GetEnabledOk returns a tuple with the Enabled field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BackupSchedule) GetEnabledOk() (*bool, bool) {
	if o == nil || IsNil(o.Enabled) {
		return nil, false
	}
	return o.Enabled, true
}

// HasEnabled returns a boolean if a field has been set.
func (o *BackupSchedule) HasEnabled() bool {
	if o != nil && !IsNil(o.Enabled) {
		return true
	}

	return false
}

// SetEnabled gets a reference to the given bool and assigns it to the Enabled field.
func (o *BackupSchedule) SetEnabled(v bool) {
	o.Enabled = &v
}

// GetSchedule returns the Schedule field value if set, zero value otherwise.
func (o *BackupSchedule) GetSchedule() string {
	if o == nil || IsNil(o.Schedule) {
		var ret string
		return ret
	}
	return *o.Schedule
}

// GetScheduleOk returns a tuple with the Schedule field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BackupSchedule) GetScheduleOk() (*string, bool) {
	if o == nil || IsNil(o.Schedule) {
		return nil, false
	}
	return o.Schedule, true
}

// HasSchedule returns a boolean if a field has been set.
func (o *BackupSchedule) HasSchedule() bool {
	if o != nil && !IsNil(o.Schedule) {
		return true
	}

	return false
}

// SetSchedule gets a reference to the given string and assigns it to the Schedule field.
func (o *BackupSchedule) SetSchedule(v string) {
	o.Schedule = &v
}

// GetScheduleId returns the ScheduleId field value if set, zero value otherwise.
func (o *BackupSchedule) GetScheduleId() int32 {
	if o == nil || IsNil(o.ScheduleId) {
		var ret int32
		return ret
	}
	return *o.ScheduleId
}

// GetScheduleIdOk returns a tuple with the ScheduleId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BackupSchedule) GetScheduleIdOk() (*int32, bool) {
	if o == nil || IsNil(o.ScheduleId) {
		return nil, false
	}
	return o.ScheduleId, true
}

// HasScheduleId returns a boolean if a field has been set.
func (o *BackupSchedule) HasScheduleId() bool {
	if o != nil && !IsNil(o.ScheduleId) {
		return true
	}

	return false
}

// SetScheduleId gets a reference to the given int32 and assigns it to the ScheduleId field.
func (o *BackupSchedule) SetScheduleId(v int32) {
	o.ScheduleId = &v
}

// GetJob returns the Job field value if set, zero value otherwise.
func (o *BackupSchedule) GetJob() BackupScheduleJob {
	if o == nil || IsNil(o.Job) {
		var ret BackupScheduleJob
		return ret
	}
	return *o.Job
}

// GetJobOk returns a tuple with the Job field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BackupSchedule) GetJobOk() (*BackupScheduleJob, bool) {
	if o == nil || IsNil(o.Job) {
		return nil, false
	}
	return o.Job, true
}

// HasJob returns a boolean if a field has been set.
func (o *BackupSchedule) HasJob() bool {
	if o != nil && !IsNil(o.Job) {
		return true
	}

	return false
}

// SetJob gets a reference to the given BackupScheduleJob and assigns it to the Job field.
func (o *BackupSchedule) SetJob(v BackupScheduleJob) {
	o.Job = &v
}

func (o BackupSchedule) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o BackupSchedule) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.ClassName) {
		toSerialize["class_name"] = o.ClassName
	}
	if !IsNil(o.Enabled) {
		toSerialize["enabled"] = o.Enabled
	}
	if !IsNil(o.Schedule) {
		toSerialize["schedule"] = o.Schedule
	}
	if !IsNil(o.ScheduleId) {
		toSerialize["schedule_id"] = o.ScheduleId
	}
	if !IsNil(o.Job) {
		toSerialize["job"] = o.Job
	}
	return toSerialize, nil
}

type NullableBackupSchedule struct {
	value *BackupSchedule
	isSet bool
}

func (v NullableBackupSchedule) Get() *BackupSchedule {
	return v.value
}

func (v *NullableBackupSchedule) Set(val *BackupSchedule) {
	v.value = val
	v.isSet = true
}

func (v NullableBackupSchedule) IsSet() bool {
	return v.isSet
}

func (v *NullableBackupSchedule) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableBackupSchedule(val *BackupSchedule) *NullableBackupSchedule {
	return &NullableBackupSchedule{value: val, isSet: true}
}

func (v NullableBackupSchedule) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableBackupSchedule) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


