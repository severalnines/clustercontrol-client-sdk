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

// checks if the AlarmResponse type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &AlarmResponse{}

// AlarmResponse struct for AlarmResponse
type AlarmResponse struct {
	Operation *string `json:"operation,omitempty"`
	ClusterId *int32 `json:"cluster_id,omitempty"`
	AlarmId *int32 `json:"alarm_id,omitempty"`
	ClassName *string `json:"class_name,omitempty"`
	Ignore *bool `json:"ignore,omitempty"`
}

// NewAlarmResponse instantiates a new AlarmResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAlarmResponse() *AlarmResponse {
	this := AlarmResponse{}
	return &this
}

// NewAlarmResponseWithDefaults instantiates a new AlarmResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAlarmResponseWithDefaults() *AlarmResponse {
	this := AlarmResponse{}
	return &this
}

// GetOperation returns the Operation field value if set, zero value otherwise.
func (o *AlarmResponse) GetOperation() string {
	if o == nil || IsNil(o.Operation) {
		var ret string
		return ret
	}
	return *o.Operation
}

// GetOperationOk returns a tuple with the Operation field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AlarmResponse) GetOperationOk() (*string, bool) {
	if o == nil || IsNil(o.Operation) {
		return nil, false
	}
	return o.Operation, true
}

// HasOperation returns a boolean if a field has been set.
func (o *AlarmResponse) HasOperation() bool {
	if o != nil && !IsNil(o.Operation) {
		return true
	}

	return false
}

// SetOperation gets a reference to the given string and assigns it to the Operation field.
func (o *AlarmResponse) SetOperation(v string) {
	o.Operation = &v
}

// GetClusterId returns the ClusterId field value if set, zero value otherwise.
func (o *AlarmResponse) GetClusterId() int32 {
	if o == nil || IsNil(o.ClusterId) {
		var ret int32
		return ret
	}
	return *o.ClusterId
}

// GetClusterIdOk returns a tuple with the ClusterId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AlarmResponse) GetClusterIdOk() (*int32, bool) {
	if o == nil || IsNil(o.ClusterId) {
		return nil, false
	}
	return o.ClusterId, true
}

// HasClusterId returns a boolean if a field has been set.
func (o *AlarmResponse) HasClusterId() bool {
	if o != nil && !IsNil(o.ClusterId) {
		return true
	}

	return false
}

// SetClusterId gets a reference to the given int32 and assigns it to the ClusterId field.
func (o *AlarmResponse) SetClusterId(v int32) {
	o.ClusterId = &v
}

// GetAlarmId returns the AlarmId field value if set, zero value otherwise.
func (o *AlarmResponse) GetAlarmId() int32 {
	if o == nil || IsNil(o.AlarmId) {
		var ret int32
		return ret
	}
	return *o.AlarmId
}

// GetAlarmIdOk returns a tuple with the AlarmId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AlarmResponse) GetAlarmIdOk() (*int32, bool) {
	if o == nil || IsNil(o.AlarmId) {
		return nil, false
	}
	return o.AlarmId, true
}

// HasAlarmId returns a boolean if a field has been set.
func (o *AlarmResponse) HasAlarmId() bool {
	if o != nil && !IsNil(o.AlarmId) {
		return true
	}

	return false
}

// SetAlarmId gets a reference to the given int32 and assigns it to the AlarmId field.
func (o *AlarmResponse) SetAlarmId(v int32) {
	o.AlarmId = &v
}

// GetClassName returns the ClassName field value if set, zero value otherwise.
func (o *AlarmResponse) GetClassName() string {
	if o == nil || IsNil(o.ClassName) {
		var ret string
		return ret
	}
	return *o.ClassName
}

// GetClassNameOk returns a tuple with the ClassName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AlarmResponse) GetClassNameOk() (*string, bool) {
	if o == nil || IsNil(o.ClassName) {
		return nil, false
	}
	return o.ClassName, true
}

// HasClassName returns a boolean if a field has been set.
func (o *AlarmResponse) HasClassName() bool {
	if o != nil && !IsNil(o.ClassName) {
		return true
	}

	return false
}

// SetClassName gets a reference to the given string and assigns it to the ClassName field.
func (o *AlarmResponse) SetClassName(v string) {
	o.ClassName = &v
}

// GetIgnore returns the Ignore field value if set, zero value otherwise.
func (o *AlarmResponse) GetIgnore() bool {
	if o == nil || IsNil(o.Ignore) {
		var ret bool
		return ret
	}
	return *o.Ignore
}

// GetIgnoreOk returns a tuple with the Ignore field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AlarmResponse) GetIgnoreOk() (*bool, bool) {
	if o == nil || IsNil(o.Ignore) {
		return nil, false
	}
	return o.Ignore, true
}

// HasIgnore returns a boolean if a field has been set.
func (o *AlarmResponse) HasIgnore() bool {
	if o != nil && !IsNil(o.Ignore) {
		return true
	}

	return false
}

// SetIgnore gets a reference to the given bool and assigns it to the Ignore field.
func (o *AlarmResponse) SetIgnore(v bool) {
	o.Ignore = &v
}

func (o AlarmResponse) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o AlarmResponse) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Operation) {
		toSerialize["operation"] = o.Operation
	}
	if !IsNil(o.ClusterId) {
		toSerialize["cluster_id"] = o.ClusterId
	}
	if !IsNil(o.AlarmId) {
		toSerialize["alarm_id"] = o.AlarmId
	}
	if !IsNil(o.ClassName) {
		toSerialize["class_name"] = o.ClassName
	}
	if !IsNil(o.Ignore) {
		toSerialize["ignore"] = o.Ignore
	}
	return toSerialize, nil
}

type NullableAlarmResponse struct {
	value *AlarmResponse
	isSet bool
}

func (v NullableAlarmResponse) Get() *AlarmResponse {
	return v.value
}

func (v *NullableAlarmResponse) Set(val *AlarmResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableAlarmResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableAlarmResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAlarmResponse(val *AlarmResponse) *NullableAlarmResponse {
	return &NullableAlarmResponse{value: val, isSet: true}
}

func (v NullableAlarmResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAlarmResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


