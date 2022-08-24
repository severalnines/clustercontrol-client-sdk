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

// DiscoveryJobJobSpecJobData struct for DiscoveryJobJobSpecJobData
type DiscoveryJobJobSpecJobData struct {
	ClusterType *string `json:"cluster_type,omitempty"`
	MysqlVersion *string `json:"mysql_version,omitempty"`
	Vendor *string `json:"vendor,omitempty"`
	Nodes []DiscoveryJobJobSpecJobDataNodesInner `json:"nodes,omitempty"`
}

// NewDiscoveryJobJobSpecJobData instantiates a new DiscoveryJobJobSpecJobData object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewDiscoveryJobJobSpecJobData() *DiscoveryJobJobSpecJobData {
	this := DiscoveryJobJobSpecJobData{}
	return &this
}

// NewDiscoveryJobJobSpecJobDataWithDefaults instantiates a new DiscoveryJobJobSpecJobData object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewDiscoveryJobJobSpecJobDataWithDefaults() *DiscoveryJobJobSpecJobData {
	this := DiscoveryJobJobSpecJobData{}
	return &this
}

// GetClusterType returns the ClusterType field value if set, zero value otherwise.
func (o *DiscoveryJobJobSpecJobData) GetClusterType() string {
	if o == nil || o.ClusterType == nil {
		var ret string
		return ret
	}
	return *o.ClusterType
}

// GetClusterTypeOk returns a tuple with the ClusterType field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DiscoveryJobJobSpecJobData) GetClusterTypeOk() (*string, bool) {
	if o == nil || o.ClusterType == nil {
		return nil, false
	}
	return o.ClusterType, true
}

// HasClusterType returns a boolean if a field has been set.
func (o *DiscoveryJobJobSpecJobData) HasClusterType() bool {
	if o != nil && o.ClusterType != nil {
		return true
	}

	return false
}

// SetClusterType gets a reference to the given string and assigns it to the ClusterType field.
func (o *DiscoveryJobJobSpecJobData) SetClusterType(v string) {
	o.ClusterType = &v
}

// GetMysqlVersion returns the MysqlVersion field value if set, zero value otherwise.
func (o *DiscoveryJobJobSpecJobData) GetMysqlVersion() string {
	if o == nil || o.MysqlVersion == nil {
		var ret string
		return ret
	}
	return *o.MysqlVersion
}

// GetMysqlVersionOk returns a tuple with the MysqlVersion field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DiscoveryJobJobSpecJobData) GetMysqlVersionOk() (*string, bool) {
	if o == nil || o.MysqlVersion == nil {
		return nil, false
	}
	return o.MysqlVersion, true
}

// HasMysqlVersion returns a boolean if a field has been set.
func (o *DiscoveryJobJobSpecJobData) HasMysqlVersion() bool {
	if o != nil && o.MysqlVersion != nil {
		return true
	}

	return false
}

// SetMysqlVersion gets a reference to the given string and assigns it to the MysqlVersion field.
func (o *DiscoveryJobJobSpecJobData) SetMysqlVersion(v string) {
	o.MysqlVersion = &v
}

// GetVendor returns the Vendor field value if set, zero value otherwise.
func (o *DiscoveryJobJobSpecJobData) GetVendor() string {
	if o == nil || o.Vendor == nil {
		var ret string
		return ret
	}
	return *o.Vendor
}

// GetVendorOk returns a tuple with the Vendor field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DiscoveryJobJobSpecJobData) GetVendorOk() (*string, bool) {
	if o == nil || o.Vendor == nil {
		return nil, false
	}
	return o.Vendor, true
}

// HasVendor returns a boolean if a field has been set.
func (o *DiscoveryJobJobSpecJobData) HasVendor() bool {
	if o != nil && o.Vendor != nil {
		return true
	}

	return false
}

// SetVendor gets a reference to the given string and assigns it to the Vendor field.
func (o *DiscoveryJobJobSpecJobData) SetVendor(v string) {
	o.Vendor = &v
}

// GetNodes returns the Nodes field value if set, zero value otherwise.
func (o *DiscoveryJobJobSpecJobData) GetNodes() []DiscoveryJobJobSpecJobDataNodesInner {
	if o == nil || o.Nodes == nil {
		var ret []DiscoveryJobJobSpecJobDataNodesInner
		return ret
	}
	return o.Nodes
}

// GetNodesOk returns a tuple with the Nodes field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DiscoveryJobJobSpecJobData) GetNodesOk() ([]DiscoveryJobJobSpecJobDataNodesInner, bool) {
	if o == nil || o.Nodes == nil {
		return nil, false
	}
	return o.Nodes, true
}

// HasNodes returns a boolean if a field has been set.
func (o *DiscoveryJobJobSpecJobData) HasNodes() bool {
	if o != nil && o.Nodes != nil {
		return true
	}

	return false
}

// SetNodes gets a reference to the given []DiscoveryJobJobSpecJobDataNodesInner and assigns it to the Nodes field.
func (o *DiscoveryJobJobSpecJobData) SetNodes(v []DiscoveryJobJobSpecJobDataNodesInner) {
	o.Nodes = v
}

func (o DiscoveryJobJobSpecJobData) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.ClusterType != nil {
		toSerialize["cluster_type"] = o.ClusterType
	}
	if o.MysqlVersion != nil {
		toSerialize["mysql_version"] = o.MysqlVersion
	}
	if o.Vendor != nil {
		toSerialize["vendor"] = o.Vendor
	}
	if o.Nodes != nil {
		toSerialize["nodes"] = o.Nodes
	}
	return json.Marshal(toSerialize)
}

type NullableDiscoveryJobJobSpecJobData struct {
	value *DiscoveryJobJobSpecJobData
	isSet bool
}

func (v NullableDiscoveryJobJobSpecJobData) Get() *DiscoveryJobJobSpecJobData {
	return v.value
}

func (v *NullableDiscoveryJobJobSpecJobData) Set(val *DiscoveryJobJobSpecJobData) {
	v.value = val
	v.isSet = true
}

func (v NullableDiscoveryJobJobSpecJobData) IsSet() bool {
	return v.isSet
}

func (v *NullableDiscoveryJobJobSpecJobData) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableDiscoveryJobJobSpecJobData(val *DiscoveryJobJobSpecJobData) *NullableDiscoveryJobJobSpecJobData {
	return &NullableDiscoveryJobJobSpecJobData{value: val, isSet: true}
}

func (v NullableDiscoveryJobJobSpecJobData) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableDiscoveryJobJobSpecJobData) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


