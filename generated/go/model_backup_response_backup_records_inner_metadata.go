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

// checks if the BackupResponseBackupRecordsInnerMetadata type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &BackupResponseBackupRecordsInnerMetadata{}

// BackupResponseBackupRecordsInnerMetadata struct for BackupResponseBackupRecordsInnerMetadata
type BackupResponseBackupRecordsInnerMetadata struct {
	Id *int32 `json:"id,omitempty"`
	JobId *int32 `json:"job_id,omitempty"`
}

// NewBackupResponseBackupRecordsInnerMetadata instantiates a new BackupResponseBackupRecordsInnerMetadata object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewBackupResponseBackupRecordsInnerMetadata() *BackupResponseBackupRecordsInnerMetadata {
	this := BackupResponseBackupRecordsInnerMetadata{}
	return &this
}

// NewBackupResponseBackupRecordsInnerMetadataWithDefaults instantiates a new BackupResponseBackupRecordsInnerMetadata object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewBackupResponseBackupRecordsInnerMetadataWithDefaults() *BackupResponseBackupRecordsInnerMetadata {
	this := BackupResponseBackupRecordsInnerMetadata{}
	return &this
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *BackupResponseBackupRecordsInnerMetadata) GetId() int32 {
	if o == nil || IsNil(o.Id) {
		var ret int32
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BackupResponseBackupRecordsInnerMetadata) GetIdOk() (*int32, bool) {
	if o == nil || IsNil(o.Id) {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *BackupResponseBackupRecordsInnerMetadata) HasId() bool {
	if o != nil && !IsNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given int32 and assigns it to the Id field.
func (o *BackupResponseBackupRecordsInnerMetadata) SetId(v int32) {
	o.Id = &v
}

// GetJobId returns the JobId field value if set, zero value otherwise.
func (o *BackupResponseBackupRecordsInnerMetadata) GetJobId() int32 {
	if o == nil || IsNil(o.JobId) {
		var ret int32
		return ret
	}
	return *o.JobId
}

// GetJobIdOk returns a tuple with the JobId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BackupResponseBackupRecordsInnerMetadata) GetJobIdOk() (*int32, bool) {
	if o == nil || IsNil(o.JobId) {
		return nil, false
	}
	return o.JobId, true
}

// HasJobId returns a boolean if a field has been set.
func (o *BackupResponseBackupRecordsInnerMetadata) HasJobId() bool {
	if o != nil && !IsNil(o.JobId) {
		return true
	}

	return false
}

// SetJobId gets a reference to the given int32 and assigns it to the JobId field.
func (o *BackupResponseBackupRecordsInnerMetadata) SetJobId(v int32) {
	o.JobId = &v
}

func (o BackupResponseBackupRecordsInnerMetadata) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o BackupResponseBackupRecordsInnerMetadata) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Id) {
		toSerialize["id"] = o.Id
	}
	if !IsNil(o.JobId) {
		toSerialize["job_id"] = o.JobId
	}
	return toSerialize, nil
}

type NullableBackupResponseBackupRecordsInnerMetadata struct {
	value *BackupResponseBackupRecordsInnerMetadata
	isSet bool
}

func (v NullableBackupResponseBackupRecordsInnerMetadata) Get() *BackupResponseBackupRecordsInnerMetadata {
	return v.value
}

func (v *NullableBackupResponseBackupRecordsInnerMetadata) Set(val *BackupResponseBackupRecordsInnerMetadata) {
	v.value = val
	v.isSet = true
}

func (v NullableBackupResponseBackupRecordsInnerMetadata) IsSet() bool {
	return v.isSet
}

func (v *NullableBackupResponseBackupRecordsInnerMetadata) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableBackupResponseBackupRecordsInnerMetadata(val *BackupResponseBackupRecordsInnerMetadata) *NullableBackupResponseBackupRecordsInnerMetadata {
	return &NullableBackupResponseBackupRecordsInnerMetadata{value: val, isSet: true}
}

func (v NullableBackupResponseBackupRecordsInnerMetadata) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableBackupResponseBackupRecordsInnerMetadata) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


