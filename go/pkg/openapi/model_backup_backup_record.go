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

// checks if the BackupBackupRecord type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &BackupBackupRecord{}

// BackupBackupRecord struct for BackupBackupRecord
type BackupBackupRecord struct {
	BackupId *int32 `json:"backup_id,omitempty"`
}

// NewBackupBackupRecord instantiates a new BackupBackupRecord object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewBackupBackupRecord() *BackupBackupRecord {
	this := BackupBackupRecord{}
	return &this
}

// NewBackupBackupRecordWithDefaults instantiates a new BackupBackupRecord object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewBackupBackupRecordWithDefaults() *BackupBackupRecord {
	this := BackupBackupRecord{}
	return &this
}

// GetBackupId returns the BackupId field value if set, zero value otherwise.
func (o *BackupBackupRecord) GetBackupId() int32 {
	if o == nil || IsNil(o.BackupId) {
		var ret int32
		return ret
	}
	return *o.BackupId
}

// GetBackupIdOk returns a tuple with the BackupId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BackupBackupRecord) GetBackupIdOk() (*int32, bool) {
	if o == nil || IsNil(o.BackupId) {
		return nil, false
	}
	return o.BackupId, true
}

// HasBackupId returns a boolean if a field has been set.
func (o *BackupBackupRecord) HasBackupId() bool {
	if o != nil && !IsNil(o.BackupId) {
		return true
	}

	return false
}

// SetBackupId gets a reference to the given int32 and assigns it to the BackupId field.
func (o *BackupBackupRecord) SetBackupId(v int32) {
	o.BackupId = &v
}

func (o BackupBackupRecord) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o BackupBackupRecord) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.BackupId) {
		toSerialize["backup_id"] = o.BackupId
	}
	return toSerialize, nil
}

type NullableBackupBackupRecord struct {
	value *BackupBackupRecord
	isSet bool
}

func (v NullableBackupBackupRecord) Get() *BackupBackupRecord {
	return v.value
}

func (v *NullableBackupBackupRecord) Set(val *BackupBackupRecord) {
	v.value = val
	v.isSet = true
}

func (v NullableBackupBackupRecord) IsSet() bool {
	return v.isSet
}

func (v *NullableBackupBackupRecord) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableBackupBackupRecord(val *BackupBackupRecord) *NullableBackupBackupRecord {
	return &NullableBackupBackupRecord{value: val, isSet: true}
}

func (v NullableBackupBackupRecord) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableBackupBackupRecord) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


