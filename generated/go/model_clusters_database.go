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

// ClustersDatabase struct for ClustersDatabase
type ClustersDatabase struct {
	ClassName *string `json:"class_name,omitempty"`
	DatabaseName *string `json:"database_name,omitempty"`
}

// NewClustersDatabase instantiates a new ClustersDatabase object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewClustersDatabase() *ClustersDatabase {
	this := ClustersDatabase{}
	return &this
}

// NewClustersDatabaseWithDefaults instantiates a new ClustersDatabase object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewClustersDatabaseWithDefaults() *ClustersDatabase {
	this := ClustersDatabase{}
	return &this
}

// GetClassName returns the ClassName field value if set, zero value otherwise.
func (o *ClustersDatabase) GetClassName() string {
	if o == nil || isNil(o.ClassName) {
		var ret string
		return ret
	}
	return *o.ClassName
}

// GetClassNameOk returns a tuple with the ClassName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ClustersDatabase) GetClassNameOk() (*string, bool) {
	if o == nil || isNil(o.ClassName) {
    return nil, false
	}
	return o.ClassName, true
}

// HasClassName returns a boolean if a field has been set.
func (o *ClustersDatabase) HasClassName() bool {
	if o != nil && !isNil(o.ClassName) {
		return true
	}

	return false
}

// SetClassName gets a reference to the given string and assigns it to the ClassName field.
func (o *ClustersDatabase) SetClassName(v string) {
	o.ClassName = &v
}

// GetDatabaseName returns the DatabaseName field value if set, zero value otherwise.
func (o *ClustersDatabase) GetDatabaseName() string {
	if o == nil || isNil(o.DatabaseName) {
		var ret string
		return ret
	}
	return *o.DatabaseName
}

// GetDatabaseNameOk returns a tuple with the DatabaseName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ClustersDatabase) GetDatabaseNameOk() (*string, bool) {
	if o == nil || isNil(o.DatabaseName) {
    return nil, false
	}
	return o.DatabaseName, true
}

// HasDatabaseName returns a boolean if a field has been set.
func (o *ClustersDatabase) HasDatabaseName() bool {
	if o != nil && !isNil(o.DatabaseName) {
		return true
	}

	return false
}

// SetDatabaseName gets a reference to the given string and assigns it to the DatabaseName field.
func (o *ClustersDatabase) SetDatabaseName(v string) {
	o.DatabaseName = &v
}

func (o ClustersDatabase) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.ClassName) {
		toSerialize["class_name"] = o.ClassName
	}
	if !isNil(o.DatabaseName) {
		toSerialize["database_name"] = o.DatabaseName
	}
	return json.Marshal(toSerialize)
}

type NullableClustersDatabase struct {
	value *ClustersDatabase
	isSet bool
}

func (v NullableClustersDatabase) Get() *ClustersDatabase {
	return v.value
}

func (v *NullableClustersDatabase) Set(val *ClustersDatabase) {
	v.value = val
	v.isSet = true
}

func (v NullableClustersDatabase) IsSet() bool {
	return v.isSet
}

func (v *NullableClustersDatabase) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableClustersDatabase(val *ClustersDatabase) *NullableClustersDatabase {
	return &NullableClustersDatabase{value: val, isSet: true}
}

func (v NullableClustersDatabase) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableClustersDatabase) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


