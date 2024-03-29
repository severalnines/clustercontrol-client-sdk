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

// checks if the StatCmonAgent type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &StatCmonAgent{}

// StatCmonAgent struct for StatCmonAgent
type StatCmonAgent struct {
	Operation string `json:"operation"`
	ApiKey *string `json:"apiKey,omitempty"`
	ClassName *string `json:"className,omitempty"`
	RequestData *StatCmonAgentRequestData `json:"requestData,omitempty"`
}

type _StatCmonAgent StatCmonAgent

// NewStatCmonAgent instantiates a new StatCmonAgent object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewStatCmonAgent(operation string) *StatCmonAgent {
	this := StatCmonAgent{}
	this.Operation = operation
	return &this
}

// NewStatCmonAgentWithDefaults instantiates a new StatCmonAgent object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewStatCmonAgentWithDefaults() *StatCmonAgent {
	this := StatCmonAgent{}
	return &this
}

// GetOperation returns the Operation field value
func (o *StatCmonAgent) GetOperation() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Operation
}

// GetOperationOk returns a tuple with the Operation field value
// and a boolean to check if the value has been set.
func (o *StatCmonAgent) GetOperationOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Operation, true
}

// SetOperation sets field value
func (o *StatCmonAgent) SetOperation(v string) {
	o.Operation = v
}

// GetApiKey returns the ApiKey field value if set, zero value otherwise.
func (o *StatCmonAgent) GetApiKey() string {
	if o == nil || IsNil(o.ApiKey) {
		var ret string
		return ret
	}
	return *o.ApiKey
}

// GetApiKeyOk returns a tuple with the ApiKey field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *StatCmonAgent) GetApiKeyOk() (*string, bool) {
	if o == nil || IsNil(o.ApiKey) {
		return nil, false
	}
	return o.ApiKey, true
}

// HasApiKey returns a boolean if a field has been set.
func (o *StatCmonAgent) HasApiKey() bool {
	if o != nil && !IsNil(o.ApiKey) {
		return true
	}

	return false
}

// SetApiKey gets a reference to the given string and assigns it to the ApiKey field.
func (o *StatCmonAgent) SetApiKey(v string) {
	o.ApiKey = &v
}

// GetClassName returns the ClassName field value if set, zero value otherwise.
func (o *StatCmonAgent) GetClassName() string {
	if o == nil || IsNil(o.ClassName) {
		var ret string
		return ret
	}
	return *o.ClassName
}

// GetClassNameOk returns a tuple with the ClassName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *StatCmonAgent) GetClassNameOk() (*string, bool) {
	if o == nil || IsNil(o.ClassName) {
		return nil, false
	}
	return o.ClassName, true
}

// HasClassName returns a boolean if a field has been set.
func (o *StatCmonAgent) HasClassName() bool {
	if o != nil && !IsNil(o.ClassName) {
		return true
	}

	return false
}

// SetClassName gets a reference to the given string and assigns it to the ClassName field.
func (o *StatCmonAgent) SetClassName(v string) {
	o.ClassName = &v
}

// GetRequestData returns the RequestData field value if set, zero value otherwise.
func (o *StatCmonAgent) GetRequestData() StatCmonAgentRequestData {
	if o == nil || IsNil(o.RequestData) {
		var ret StatCmonAgentRequestData
		return ret
	}
	return *o.RequestData
}

// GetRequestDataOk returns a tuple with the RequestData field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *StatCmonAgent) GetRequestDataOk() (*StatCmonAgentRequestData, bool) {
	if o == nil || IsNil(o.RequestData) {
		return nil, false
	}
	return o.RequestData, true
}

// HasRequestData returns a boolean if a field has been set.
func (o *StatCmonAgent) HasRequestData() bool {
	if o != nil && !IsNil(o.RequestData) {
		return true
	}

	return false
}

// SetRequestData gets a reference to the given StatCmonAgentRequestData and assigns it to the RequestData field.
func (o *StatCmonAgent) SetRequestData(v StatCmonAgentRequestData) {
	o.RequestData = &v
}

func (o StatCmonAgent) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o StatCmonAgent) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["operation"] = o.Operation
	if !IsNil(o.ApiKey) {
		toSerialize["apiKey"] = o.ApiKey
	}
	if !IsNil(o.ClassName) {
		toSerialize["className"] = o.ClassName
	}
	if !IsNil(o.RequestData) {
		toSerialize["requestData"] = o.RequestData
	}
	return toSerialize, nil
}

func (o *StatCmonAgent) UnmarshalJSON(data []byte) (err error) {
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

	varStatCmonAgent := _StatCmonAgent{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varStatCmonAgent)

	if err != nil {
		return err
	}

	*o = StatCmonAgent(varStatCmonAgent)

	return err
}

type NullableStatCmonAgent struct {
	value *StatCmonAgent
	isSet bool
}

func (v NullableStatCmonAgent) Get() *StatCmonAgent {
	return v.value
}

func (v *NullableStatCmonAgent) Set(val *StatCmonAgent) {
	v.value = val
	v.isSet = true
}

func (v NullableStatCmonAgent) IsSet() bool {
	return v.isSet
}

func (v *NullableStatCmonAgent) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableStatCmonAgent(val *StatCmonAgent) *NullableStatCmonAgent {
	return &NullableStatCmonAgent{value: val, isSet: true}
}

func (v NullableStatCmonAgent) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableStatCmonAgent) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


