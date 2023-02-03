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
	if o == nil || isNil(o.ClusterId) {
		var ret int32
		return ret
	}
	return *o.ClusterId
}

// GetClusterIdOk returns a tuple with the ClusterId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *StatPrometheus) GetClusterIdOk() (*int32, bool) {
	if o == nil || isNil(o.ClusterId) {
    return nil, false
	}
	return o.ClusterId, true
}

// HasClusterId returns a boolean if a field has been set.
func (o *StatPrometheus) HasClusterId() bool {
	if o != nil && !isNil(o.ClusterId) {
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
	if o == nil || isNil(o.ClusterName) {
		var ret string
		return ret
	}
	return *o.ClusterName
}

// GetClusterNameOk returns a tuple with the ClusterName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *StatPrometheus) GetClusterNameOk() (*string, bool) {
	if o == nil || isNil(o.ClusterName) {
    return nil, false
	}
	return o.ClusterName, true
}

// HasClusterName returns a boolean if a field has been set.
func (o *StatPrometheus) HasClusterName() bool {
	if o != nil && !isNil(o.ClusterName) {
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
	if o == nil || isNil(o.Queries) {
		var ret []StatPrometheusQueriesInner
		return ret
	}
	return o.Queries
}

// GetQueriesOk returns a tuple with the Queries field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *StatPrometheus) GetQueriesOk() ([]StatPrometheusQueriesInner, bool) {
	if o == nil || isNil(o.Queries) {
    return nil, false
	}
	return o.Queries, true
}

// HasQueries returns a boolean if a field has been set.
func (o *StatPrometheus) HasQueries() bool {
	if o != nil && !isNil(o.Queries) {
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
	if o == nil || isNil(o.Start) {
		var ret int32
		return ret
	}
	return *o.Start
}

// GetStartOk returns a tuple with the Start field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *StatPrometheus) GetStartOk() (*int32, bool) {
	if o == nil || isNil(o.Start) {
    return nil, false
	}
	return o.Start, true
}

// HasStart returns a boolean if a field has been set.
func (o *StatPrometheus) HasStart() bool {
	if o != nil && !isNil(o.Start) {
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
	if o == nil || isNil(o.End) {
		var ret int32
		return ret
	}
	return *o.End
}

// GetEndOk returns a tuple with the End field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *StatPrometheus) GetEndOk() (*int32, bool) {
	if o == nil || isNil(o.End) {
    return nil, false
	}
	return o.End, true
}

// HasEnd returns a boolean if a field has been set.
func (o *StatPrometheus) HasEnd() bool {
	if o != nil && !isNil(o.End) {
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
	if o == nil || isNil(o.Step) {
		var ret int32
		return ret
	}
	return *o.Step
}

// GetStepOk returns a tuple with the Step field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *StatPrometheus) GetStepOk() (*int32, bool) {
	if o == nil || isNil(o.Step) {
    return nil, false
	}
	return o.Step, true
}

// HasStep returns a boolean if a field has been set.
func (o *StatPrometheus) HasStep() bool {
	if o != nil && !isNil(o.Step) {
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
	if o == nil || isNil(o.Returnfrom) {
		var ret int32
		return ret
	}
	return *o.Returnfrom
}

// GetReturnfromOk returns a tuple with the Returnfrom field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *StatPrometheus) GetReturnfromOk() (*int32, bool) {
	if o == nil || isNil(o.Returnfrom) {
    return nil, false
	}
	return o.Returnfrom, true
}

// HasReturnfrom returns a boolean if a field has been set.
func (o *StatPrometheus) HasReturnfrom() bool {
	if o != nil && !isNil(o.Returnfrom) {
		return true
	}

	return false
}

// SetReturnfrom gets a reference to the given int32 and assigns it to the Returnfrom field.
func (o *StatPrometheus) SetReturnfrom(v int32) {
	o.Returnfrom = &v
}

func (o StatPrometheus) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["operation"] = o.Operation
	}
	if !isNil(o.ClusterId) {
		toSerialize["cluster_id"] = o.ClusterId
	}
	if !isNil(o.ClusterName) {
		toSerialize["cluster_name"] = o.ClusterName
	}
	if !isNil(o.Queries) {
		toSerialize["queries"] = o.Queries
	}
	if !isNil(o.Start) {
		toSerialize["start"] = o.Start
	}
	if !isNil(o.End) {
		toSerialize["end"] = o.End
	}
	if !isNil(o.Step) {
		toSerialize["step"] = o.Step
	}
	if !isNil(o.Returnfrom) {
		toSerialize["returnfrom"] = o.Returnfrom
	}
	return json.Marshal(toSerialize)
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


