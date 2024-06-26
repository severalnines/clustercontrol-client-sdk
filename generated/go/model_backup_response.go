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

// checks if the BackupResponse type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &BackupResponse{}

// BackupResponse struct for BackupResponse
type BackupResponse struct {
	BackupRecords []BackupResponseBackupRecordsInner `json:"backup_records,omitempty"`
}

// NewBackupResponse instantiates a new BackupResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewBackupResponse() *BackupResponse {
	this := BackupResponse{}
	return &this
}

// NewBackupResponseWithDefaults instantiates a new BackupResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewBackupResponseWithDefaults() *BackupResponse {
	this := BackupResponse{}
	return &this
}

// GetBackupRecords returns the BackupRecords field value if set, zero value otherwise.
func (o *BackupResponse) GetBackupRecords() []BackupResponseBackupRecordsInner {
	if o == nil || IsNil(o.BackupRecords) {
		var ret []BackupResponseBackupRecordsInner
		return ret
	}
	return o.BackupRecords
}

// GetBackupRecordsOk returns a tuple with the BackupRecords field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BackupResponse) GetBackupRecordsOk() ([]BackupResponseBackupRecordsInner, bool) {
	if o == nil || IsNil(o.BackupRecords) {
		return nil, false
	}
	return o.BackupRecords, true
}

// HasBackupRecords returns a boolean if a field has been set.
func (o *BackupResponse) HasBackupRecords() bool {
	if o != nil && !IsNil(o.BackupRecords) {
		return true
	}

	return false
}

// SetBackupRecords gets a reference to the given []BackupResponseBackupRecordsInner and assigns it to the BackupRecords field.
func (o *BackupResponse) SetBackupRecords(v []BackupResponseBackupRecordsInner) {
	o.BackupRecords = v
}

func (o BackupResponse) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o BackupResponse) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.BackupRecords) {
		toSerialize["backup_records"] = o.BackupRecords
	}
	return toSerialize, nil
}

type NullableBackupResponse struct {
	value *BackupResponse
	isSet bool
}

func (v NullableBackupResponse) Get() *BackupResponse {
	return v.value
}

func (v *NullableBackupResponse) Set(val *BackupResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableBackupResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableBackupResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableBackupResponse(val *BackupResponse) *NullableBackupResponse {
	return &NullableBackupResponse{value: val, isSet: true}
}

func (v NullableBackupResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableBackupResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


