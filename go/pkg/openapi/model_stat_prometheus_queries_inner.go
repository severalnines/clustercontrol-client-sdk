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

// StatPrometheusQueriesInner struct for StatPrometheusQueriesInner
type StatPrometheusQueriesInner struct {
	// mysql_global_status_wsrep_cert_deps_distance{instance=~\"10.117.12.165(:[0-9]+)?\"}
	Query *string `json:"query,omitempty"`
	// e.g. 10
	Step *int32 `json:"step,omitempty"`
}

// NewStatPrometheusQueriesInner instantiates a new StatPrometheusQueriesInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewStatPrometheusQueriesInner() *StatPrometheusQueriesInner {
	this := StatPrometheusQueriesInner{}
	return &this
}

// NewStatPrometheusQueriesInnerWithDefaults instantiates a new StatPrometheusQueriesInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewStatPrometheusQueriesInnerWithDefaults() *StatPrometheusQueriesInner {
	this := StatPrometheusQueriesInner{}
	return &this
}

// GetQuery returns the Query field value if set, zero value otherwise.
func (o *StatPrometheusQueriesInner) GetQuery() string {
	if o == nil || o.Query == nil {
		var ret string
		return ret
	}
	return *o.Query
}

// GetQueryOk returns a tuple with the Query field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *StatPrometheusQueriesInner) GetQueryOk() (*string, bool) {
	if o == nil || o.Query == nil {
		return nil, false
	}
	return o.Query, true
}

// HasQuery returns a boolean if a field has been set.
func (o *StatPrometheusQueriesInner) HasQuery() bool {
	if o != nil && o.Query != nil {
		return true
	}

	return false
}

// SetQuery gets a reference to the given string and assigns it to the Query field.
func (o *StatPrometheusQueriesInner) SetQuery(v string) {
	o.Query = &v
}

// GetStep returns the Step field value if set, zero value otherwise.
func (o *StatPrometheusQueriesInner) GetStep() int32 {
	if o == nil || o.Step == nil {
		var ret int32
		return ret
	}
	return *o.Step
}

// GetStepOk returns a tuple with the Step field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *StatPrometheusQueriesInner) GetStepOk() (*int32, bool) {
	if o == nil || o.Step == nil {
		return nil, false
	}
	return o.Step, true
}

// HasStep returns a boolean if a field has been set.
func (o *StatPrometheusQueriesInner) HasStep() bool {
	if o != nil && o.Step != nil {
		return true
	}

	return false
}

// SetStep gets a reference to the given int32 and assigns it to the Step field.
func (o *StatPrometheusQueriesInner) SetStep(v int32) {
	o.Step = &v
}

func (o StatPrometheusQueriesInner) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Query != nil {
		toSerialize["query"] = o.Query
	}
	if o.Step != nil {
		toSerialize["step"] = o.Step
	}
	return json.Marshal(toSerialize)
}

type NullableStatPrometheusQueriesInner struct {
	value *StatPrometheusQueriesInner
	isSet bool
}

func (v NullableStatPrometheusQueriesInner) Get() *StatPrometheusQueriesInner {
	return v.value
}

func (v *NullableStatPrometheusQueriesInner) Set(val *StatPrometheusQueriesInner) {
	v.value = val
	v.isSet = true
}

func (v NullableStatPrometheusQueriesInner) IsSet() bool {
	return v.isSet
}

func (v *NullableStatPrometheusQueriesInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableStatPrometheusQueriesInner(val *StatPrometheusQueriesInner) *NullableStatPrometheusQueriesInner {
	return &NullableStatPrometheusQueriesInner{value: val, isSet: true}
}

func (v NullableStatPrometheusQueriesInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableStatPrometheusQueriesInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

