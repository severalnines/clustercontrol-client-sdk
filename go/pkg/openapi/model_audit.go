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
	"bytes"
	"fmt"
)

// checks if the Audit type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &Audit{}

// Audit struct for Audit
type Audit struct {
	Operation string `json:"operation"`
	ClusterIds []int32 `json:"cluster_ids,omitempty"`
	Ascending *bool `json:"ascending,omitempty"`
}

type _Audit Audit

// NewAudit instantiates a new Audit object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAudit(operation string) *Audit {
	this := Audit{}
	this.Operation = operation
	return &this
}

// NewAuditWithDefaults instantiates a new Audit object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAuditWithDefaults() *Audit {
	this := Audit{}
	return &this
}

// GetOperation returns the Operation field value
func (o *Audit) GetOperation() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Operation
}

// GetOperationOk returns a tuple with the Operation field value
// and a boolean to check if the value has been set.
func (o *Audit) GetOperationOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Operation, true
}

// SetOperation sets field value
func (o *Audit) SetOperation(v string) {
	o.Operation = v
}

// GetClusterIds returns the ClusterIds field value if set, zero value otherwise.
func (o *Audit) GetClusterIds() []int32 {
	if o == nil || IsNil(o.ClusterIds) {
		var ret []int32
		return ret
	}
	return o.ClusterIds
}

// GetClusterIdsOk returns a tuple with the ClusterIds field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Audit) GetClusterIdsOk() ([]int32, bool) {
	if o == nil || IsNil(o.ClusterIds) {
		return nil, false
	}
	return o.ClusterIds, true
}

// HasClusterIds returns a boolean if a field has been set.
func (o *Audit) HasClusterIds() bool {
	if o != nil && !IsNil(o.ClusterIds) {
		return true
	}

	return false
}

// SetClusterIds gets a reference to the given []int32 and assigns it to the ClusterIds field.
func (o *Audit) SetClusterIds(v []int32) {
	o.ClusterIds = v
}

// GetAscending returns the Ascending field value if set, zero value otherwise.
func (o *Audit) GetAscending() bool {
	if o == nil || IsNil(o.Ascending) {
		var ret bool
		return ret
	}
	return *o.Ascending
}

// GetAscendingOk returns a tuple with the Ascending field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Audit) GetAscendingOk() (*bool, bool) {
	if o == nil || IsNil(o.Ascending) {
		return nil, false
	}
	return o.Ascending, true
}

// HasAscending returns a boolean if a field has been set.
func (o *Audit) HasAscending() bool {
	if o != nil && !IsNil(o.Ascending) {
		return true
	}

	return false
}

// SetAscending gets a reference to the given bool and assigns it to the Ascending field.
func (o *Audit) SetAscending(v bool) {
	o.Ascending = &v
}

func (o Audit) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o Audit) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["operation"] = o.Operation
	if !IsNil(o.ClusterIds) {
		toSerialize["cluster_ids"] = o.ClusterIds
	}
	if !IsNil(o.Ascending) {
		toSerialize["ascending"] = o.Ascending
	}
	return toSerialize, nil
}

func (o *Audit) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"operation",
	}

	allProperties := make(map[string]interface{})

	err = json.Unmarshal(data, &allProperties)

	if err != nil {
		return err;
	}

	for _, requiredProperty := range(requiredProperties) {
		if _, exists := allProperties[requiredProperty]; !exists {
			return fmt.Errorf("no value given for required property %v", requiredProperty)
		}
	}

	varAudit := _Audit{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varAudit)

	if err != nil {
		return err
	}

	*o = Audit(varAudit)

	return err
}

type NullableAudit struct {
	value *Audit
	isSet bool
}

func (v NullableAudit) Get() *Audit {
	return v.value
}

func (v *NullableAudit) Set(val *Audit) {
	v.value = val
	v.isSet = true
}

func (v NullableAudit) IsSet() bool {
	return v.isSet
}

func (v *NullableAudit) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAudit(val *Audit) *NullableAudit {
	return &NullableAudit{value: val, isSet: true}
}

func (v NullableAudit) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAudit) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


