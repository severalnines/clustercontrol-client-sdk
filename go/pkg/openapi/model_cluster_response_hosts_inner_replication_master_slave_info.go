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

// checks if the ClusterResponseHostsInnerReplicationMasterSlaveInfo type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ClusterResponseHostsInnerReplicationMasterSlaveInfo{}

// ClusterResponseHostsInnerReplicationMasterSlaveInfo struct for ClusterResponseHostsInnerReplicationMasterSlaveInfo
type ClusterResponseHostsInnerReplicationMasterSlaveInfo struct {
	Slaves []ClusterResponseHostsInnerReplicationMasterSlaveInfoSlavesInner `json:"slaves,omitempty"`
}

// NewClusterResponseHostsInnerReplicationMasterSlaveInfo instantiates a new ClusterResponseHostsInnerReplicationMasterSlaveInfo object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewClusterResponseHostsInnerReplicationMasterSlaveInfo() *ClusterResponseHostsInnerReplicationMasterSlaveInfo {
	this := ClusterResponseHostsInnerReplicationMasterSlaveInfo{}
	return &this
}

// NewClusterResponseHostsInnerReplicationMasterSlaveInfoWithDefaults instantiates a new ClusterResponseHostsInnerReplicationMasterSlaveInfo object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewClusterResponseHostsInnerReplicationMasterSlaveInfoWithDefaults() *ClusterResponseHostsInnerReplicationMasterSlaveInfo {
	this := ClusterResponseHostsInnerReplicationMasterSlaveInfo{}
	return &this
}

// GetSlaves returns the Slaves field value if set, zero value otherwise.
func (o *ClusterResponseHostsInnerReplicationMasterSlaveInfo) GetSlaves() []ClusterResponseHostsInnerReplicationMasterSlaveInfoSlavesInner {
	if o == nil || IsNil(o.Slaves) {
		var ret []ClusterResponseHostsInnerReplicationMasterSlaveInfoSlavesInner
		return ret
	}
	return o.Slaves
}

// GetSlavesOk returns a tuple with the Slaves field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ClusterResponseHostsInnerReplicationMasterSlaveInfo) GetSlavesOk() ([]ClusterResponseHostsInnerReplicationMasterSlaveInfoSlavesInner, bool) {
	if o == nil || IsNil(o.Slaves) {
		return nil, false
	}
	return o.Slaves, true
}

// HasSlaves returns a boolean if a field has been set.
func (o *ClusterResponseHostsInnerReplicationMasterSlaveInfo) HasSlaves() bool {
	if o != nil && !IsNil(o.Slaves) {
		return true
	}

	return false
}

// SetSlaves gets a reference to the given []ClusterResponseHostsInnerReplicationMasterSlaveInfoSlavesInner and assigns it to the Slaves field.
func (o *ClusterResponseHostsInnerReplicationMasterSlaveInfo) SetSlaves(v []ClusterResponseHostsInnerReplicationMasterSlaveInfoSlavesInner) {
	o.Slaves = v
}

func (o ClusterResponseHostsInnerReplicationMasterSlaveInfo) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ClusterResponseHostsInnerReplicationMasterSlaveInfo) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Slaves) {
		toSerialize["slaves"] = o.Slaves
	}
	return toSerialize, nil
}

type NullableClusterResponseHostsInnerReplicationMasterSlaveInfo struct {
	value *ClusterResponseHostsInnerReplicationMasterSlaveInfo
	isSet bool
}

func (v NullableClusterResponseHostsInnerReplicationMasterSlaveInfo) Get() *ClusterResponseHostsInnerReplicationMasterSlaveInfo {
	return v.value
}

func (v *NullableClusterResponseHostsInnerReplicationMasterSlaveInfo) Set(val *ClusterResponseHostsInnerReplicationMasterSlaveInfo) {
	v.value = val
	v.isSet = true
}

func (v NullableClusterResponseHostsInnerReplicationMasterSlaveInfo) IsSet() bool {
	return v.isSet
}

func (v *NullableClusterResponseHostsInnerReplicationMasterSlaveInfo) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableClusterResponseHostsInnerReplicationMasterSlaveInfo(val *ClusterResponseHostsInnerReplicationMasterSlaveInfo) *NullableClusterResponseHostsInnerReplicationMasterSlaveInfo {
	return &NullableClusterResponseHostsInnerReplicationMasterSlaveInfo{value: val, isSet: true}
}

func (v NullableClusterResponseHostsInnerReplicationMasterSlaveInfo) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableClusterResponseHostsInnerReplicationMasterSlaveInfo) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

