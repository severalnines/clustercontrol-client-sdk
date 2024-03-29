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

// checks if the StatPrometheus type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &StatPrometheus{}

// StatPrometheus struct for StatPrometheus
type StatPrometheus struct {
	Operation string `json:"operation"`
	ClusterId *int32 `json:"cluster_id,omitempty"`
	ClusterName *string `json:"cluster_name,omitempty"`
	Queries []StatPrometheusQueriesInner `json:"queries,omitempty"`
	// Seconds since 1970. e.g. 1622105617
	Start *int32 `json:"start,omitempty"`
	// Seconds since 1970. e.g. 1622108317
	End *int32 `json:"end,omitempty"`
	Step *int32 `json:"step,omitempty"`
	Returnfrom *int32 `json:"returnfrom,omitempty"`
}

type _StatPrometheus StatPrometheus

// NewStatPrometheus instantiates a new StatPrometheus object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewStatPrometheus(operation string) *StatPrometheus {
	this := StatPrometheus{}
	this.Operation = operation
	return &this
}

// NewStatPrometheusWithDefaults instantiates a new StatPrometheus object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewStatPrometheusWithDefaults() *StatPrometheus {
	this := StatPrometheus{}
	return &this
}

// GetOperation returns the Operation field value
func (o *StatPrometheus) GetOperation() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Operation
}

// GetOperationOk returns a tuple with the Operation field value
// and a boolean to check if the value has been set.
func (o *StatPrometheus) GetOperationOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Operation, true
}

// SetOperation sets field value
func (o *StatPrometheus) SetOperation(v string) {
	o.Operation = v
}

// GetClusterId returns the ClusterId field value if set, zero value otherwise.
func (o *StatPrometheus) GetClusterId() int32 {
	if o == nil || IsNil(o.ClusterId) {
		var ret int32
		return ret
	}
	return *o.ClusterId
}

// GetClusterIdOk returns a tuple with the ClusterId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *StatPrometheus) GetClusterIdOk() (*int32, bool) {
	if o == nil || IsNil(o.ClusterId) {
		return nil, false
	}
	return o.ClusterId, true
}

// HasClusterId returns a boolean if a field has been set.
func (o *StatPrometheus) HasClusterId() bool {
	if o != nil && !IsNil(o.ClusterId) {
		return true
	}

	return false
}

// SetClusterId gets a reference to the given int32 and assigns it to the ClusterId field.
func (o *StatPrometheus) SetClusterId(v int32) {
	o.ClusterId = &v
}

// GetClusterName returns the ClusterName field value if set, zero value otherwise.
func (o *StatPrometheus) GetClusterName() string {
	if o == nil || IsNil(o.ClusterName) {
		var ret string
		return ret
	}
	return *o.ClusterName
}

// GetClusterNameOk returns a tuple with the ClusterName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *StatPrometheus) GetClusterNameOk() (*string, bool) {
	if o == nil || IsNil(o.ClusterName) {
		return nil, false
	}
	return o.ClusterName, true
}

// HasClusterName returns a boolean if a field has been set.
func (o *StatPrometheus) HasClusterName() bool {
	if o != nil && !IsNil(o.ClusterName) {
		return true
	}

	return false
}

// SetClusterName gets a reference to the given string and assigns it to the ClusterName field.
func (o *StatPrometheus) SetClusterName(v string) {
	o.ClusterName = &v
}

// GetQueries returns the Queries field value if set, zero value otherwise.
func (o *StatPrometheus) GetQueries() []StatPrometheusQueriesInner {
	if o == nil || IsNil(o.Queries) {
		var ret []StatPrometheusQueriesInner
		return ret
	}
	return o.Queries
}

// GetQueriesOk returns a tuple with the Queries field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *StatPrometheus) GetQueriesOk() ([]StatPrometheusQueriesInner, bool) {
	if o == nil || IsNil(o.Queries) {
		return nil, false
	}
	return o.Queries, true
}

// HasQueries returns a boolean if a field has been set.
func (o *StatPrometheus) HasQueries() bool {
	if o != nil && !IsNil(o.Queries) {
		return true
	}

	return false
}

// SetQueries gets a reference to the given []StatPrometheusQueriesInner and assigns it to the Queries field.
func (o *StatPrometheus) SetQueries(v []StatPrometheusQueriesInner) {
	o.Queries = v
}

// GetStart returns the Start field value if set, zero value otherwise.
func (o *StatPrometheus) GetStart() int32 {
	if o == nil || IsNil(o.Start) {
		var ret int32
		return ret
	}
	return *o.Start
}

// GetStartOk returns a tuple with the Start field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *StatPrometheus) GetStartOk() (*int32, bool) {
	if o == nil || IsNil(o.Start) {
		return nil, false
	}
	return o.Start, true
}

// HasStart returns a boolean if a field has been set.
func (o *StatPrometheus) HasStart() bool {
	if o != nil && !IsNil(o.Start) {
		return true
	}

	return false
}

// SetStart gets a reference to the given int32 and assigns it to the Start field.
func (o *StatPrometheus) SetStart(v int32) {
	o.Start = &v
}

// GetEnd returns the End field value if set, zero value otherwise.
func (o *StatPrometheus) GetEnd() int32 {
	if o == nil || IsNil(o.End) {
		var ret int32
		return ret
	}
	return *o.End
}

// GetEndOk returns a tuple with the End field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *StatPrometheus) GetEndOk() (*int32, bool) {
	if o == nil || IsNil(o.End) {
		return nil, false
	}
	return o.End, true
}

// HasEnd returns a boolean if a field has been set.
func (o *StatPrometheus) HasEnd() bool {
	if o != nil && !IsNil(o.End) {
		return true
	}

	return false
}

// SetEnd gets a reference to the given int32 and assigns it to the End field.
func (o *StatPrometheus) SetEnd(v int32) {
	o.End = &v
}

// GetStep returns the Step field value if set, zero value otherwise.
func (o *StatPrometheus) GetStep() int32 {
	if o == nil || IsNil(o.Step) {
		var ret int32
		return ret
	}
	return *o.Step
}

// GetStepOk returns a tuple with the Step field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *StatPrometheus) GetStepOk() (*int32, bool) {
	if o == nil || IsNil(o.Step) {
		return nil, false
	}
	return o.Step, true
}

// HasStep returns a boolean if a field has been set.
func (o *StatPrometheus) HasStep() bool {
	if o != nil && !IsNil(o.Step) {
		return true
	}

	return false
}

// SetStep gets a reference to the given int32 and assigns it to the Step field.
func (o *StatPrometheus) SetStep(v int32) {
	o.Step = &v
}

// GetReturnfrom returns the Returnfrom field value if set, zero value otherwise.
func (o *StatPrometheus) GetReturnfrom() int32 {
	if o == nil || IsNil(o.Returnfrom) {
		var ret int32
		return ret
	}
	return *o.Returnfrom
}

// GetReturnfromOk returns a tuple with the Returnfrom field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *StatPrometheus) GetReturnfromOk() (*int32, bool) {
	if o == nil || IsNil(o.Returnfrom) {
		return nil, false
	}
	return o.Returnfrom, true
}

// HasReturnfrom returns a boolean if a field has been set.
func (o *StatPrometheus) HasReturnfrom() bool {
	if o != nil && !IsNil(o.Returnfrom) {
		return true
	}

	return false
}

// SetReturnfrom gets a reference to the given int32 and assigns it to the Returnfrom field.
func (o *StatPrometheus) SetReturnfrom(v int32) {
	o.Returnfrom = &v
}

func (o StatPrometheus) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o StatPrometheus) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["operation"] = o.Operation
	if !IsNil(o.ClusterId) {
		toSerialize["cluster_id"] = o.ClusterId
	}
	if !IsNil(o.ClusterName) {
		toSerialize["cluster_name"] = o.ClusterName
	}
	if !IsNil(o.Queries) {
		toSerialize["queries"] = o.Queries
	}
	if !IsNil(o.Start) {
		toSerialize["start"] = o.Start
	}
	if !IsNil(o.End) {
		toSerialize["end"] = o.End
	}
	if !IsNil(o.Step) {
		toSerialize["step"] = o.Step
	}
	if !IsNil(o.Returnfrom) {
		toSerialize["returnfrom"] = o.Returnfrom
	}
	return toSerialize, nil
}

func (o *StatPrometheus) UnmarshalJSON(data []byte) (err error) {
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

	varStatPrometheus := _StatPrometheus{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varStatPrometheus)

	if err != nil {
		return err
	}

	*o = StatPrometheus(varStatPrometheus)

	return err
}

type NullableStatPrometheus struct {
	value *StatPrometheus
	isSet bool
}

func (v NullableStatPrometheus) Get() *StatPrometheus {
	return v.value
}

func (v *NullableStatPrometheus) Set(val *StatPrometheus) {
	v.value = val
	v.isSet = true
}

func (v NullableStatPrometheus) IsSet() bool {
	return v.isSet
}

func (v *NullableStatPrometheus) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableStatPrometheus(val *StatPrometheus) *NullableStatPrometheus {
	return &NullableStatPrometheus{value: val, isSet: true}
}

func (v NullableStatPrometheus) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableStatPrometheus) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


