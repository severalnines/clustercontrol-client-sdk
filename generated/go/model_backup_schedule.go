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
	if o == nil || o.ClassName == nil {
		var ret string
		return ret
	}
	return *o.ClassName
}

// GetClassNameOk returns a tuple with the ClassName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BackupSchedule) GetClassNameOk() (*string, bool) {
	if o == nil || o.ClassName == nil {
		return nil, false
	}
	return o.ClassName, true
}

// HasClassName returns a boolean if a field has been set.
func (o *BackupSchedule) HasClassName() bool {
	if o != nil && o.ClassName != nil {
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
	if o == nil || o.Enabled == nil {
		var ret bool
		return ret
	}
	return *o.Enabled
}

// GetEnabledOk returns a tuple with the Enabled field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BackupSchedule) GetEnabledOk() (*bool, bool) {
	if o == nil || o.Enabled == nil {
		return nil, false
	}
	return o.Enabled, true
}

// HasEnabled returns a boolean if a field has been set.
func (o *BackupSchedule) HasEnabled() bool {
	if o != nil && o.Enabled != nil {
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
	if o == nil || o.Schedule == nil {
		var ret string
		return ret
	}
	return *o.Schedule
}

// GetScheduleOk returns a tuple with the Schedule field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BackupSchedule) GetScheduleOk() (*string, bool) {
	if o == nil || o.Schedule == nil {
		return nil, false
	}
	return o.Schedule, true
}

// HasSchedule returns a boolean if a field has been set.
func (o *BackupSchedule) HasSchedule() bool {
	if o != nil && o.Schedule != nil {
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
	if o == nil || o.ScheduleId == nil {
		var ret int32
		return ret
	}
	return *o.ScheduleId
}

// GetScheduleIdOk returns a tuple with the ScheduleId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BackupSchedule) GetScheduleIdOk() (*int32, bool) {
	if o == nil || o.ScheduleId == nil {
		return nil, false
	}
	return o.ScheduleId, true
}

// HasScheduleId returns a boolean if a field has been set.
func (o *BackupSchedule) HasScheduleId() bool {
	if o != nil && o.ScheduleId != nil {
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
	if o == nil || o.Job == nil {
		var ret BackupScheduleJob
		return ret
	}
	return *o.Job
}

// GetJobOk returns a tuple with the Job field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BackupSchedule) GetJobOk() (*BackupScheduleJob, bool) {
	if o == nil || o.Job == nil {
		return nil, false
	}
	return o.Job, true
}

// HasJob returns a boolean if a field has been set.
func (o *BackupSchedule) HasJob() bool {
	if o != nil && o.Job != nil {
		return true
	}

	return false
}

// SetJob gets a reference to the given BackupScheduleJob and assigns it to the Job field.
func (o *BackupSchedule) SetJob(v BackupScheduleJob) {
	o.Job = &v
}

func (o BackupSchedule) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.ClassName != nil {
		toSerialize["class_name"] = o.ClassName
	}
	if o.Enabled != nil {
		toSerialize["enabled"] = o.Enabled
	}
	if o.Schedule != nil {
		toSerialize["schedule"] = o.Schedule
	}
	if o.ScheduleId != nil {
		toSerialize["schedule_id"] = o.ScheduleId
	}
	if o.Job != nil {
		toSerialize["job"] = o.Job
	}
	return json.Marshal(toSerialize)
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


