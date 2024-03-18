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

// checks if the ClusterResponseHostsInnerReplicationMaster type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ClusterResponseHostsInnerReplicationMaster{}

// ClusterResponseHostsInnerReplicationMaster struct for ClusterResponseHostsInnerReplicationMaster
type ClusterResponseHostsInnerReplicationMaster struct {
	SlaveInfo *ClusterResponseHostsInnerReplicationMasterSlaveInfo `json:"slave_info,omitempty"`
}

// NewClusterResponseHostsInnerReplicationMaster instantiates a new ClusterResponseHostsInnerReplicationMaster object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewClusterResponseHostsInnerReplicationMaster() *ClusterResponseHostsInnerReplicationMaster {
	this := ClusterResponseHostsInnerReplicationMaster{}
	return &this
}

// NewClusterResponseHostsInnerReplicationMasterWithDefaults instantiates a new ClusterResponseHostsInnerReplicationMaster object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewClusterResponseHostsInnerReplicationMasterWithDefaults() *ClusterResponseHostsInnerReplicationMaster {
	this := ClusterResponseHostsInnerReplicationMaster{}
	return &this
}

// GetSlaveInfo returns the SlaveInfo field value if set, zero value otherwise.
func (o *ClusterResponseHostsInnerReplicationMaster) GetSlaveInfo() ClusterResponseHostsInnerReplicationMasterSlaveInfo {
	if o == nil || IsNil(o.SlaveInfo) {
		var ret ClusterResponseHostsInnerReplicationMasterSlaveInfo
		return ret
	}
	return *o.SlaveInfo
}

// GetSlaveInfoOk returns a tuple with the SlaveInfo field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ClusterResponseHostsInnerReplicationMaster) GetSlaveInfoOk() (*ClusterResponseHostsInnerReplicationMasterSlaveInfo, bool) {
	if o == nil || IsNil(o.SlaveInfo) {
		return nil, false
	}
	return o.SlaveInfo, true
}

// HasSlaveInfo returns a boolean if a field has been set.
func (o *ClusterResponseHostsInnerReplicationMaster) HasSlaveInfo() bool {
	if o != nil && !IsNil(o.SlaveInfo) {
		return true
	}

	return false
}

// SetSlaveInfo gets a reference to the given ClusterResponseHostsInnerReplicationMasterSlaveInfo and assigns it to the SlaveInfo field.
func (o *ClusterResponseHostsInnerReplicationMaster) SetSlaveInfo(v ClusterResponseHostsInnerReplicationMasterSlaveInfo) {
	o.SlaveInfo = &v
}

func (o ClusterResponseHostsInnerReplicationMaster) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ClusterResponseHostsInnerReplicationMaster) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.SlaveInfo) {
		toSerialize["slave_info"] = o.SlaveInfo
	}
	return toSerialize, nil
}

type NullableClusterResponseHostsInnerReplicationMaster struct {
	value *ClusterResponseHostsInnerReplicationMaster
	isSet bool
}

func (v NullableClusterResponseHostsInnerReplicationMaster) Get() *ClusterResponseHostsInnerReplicationMaster {
	return v.value
}

func (v *NullableClusterResponseHostsInnerReplicationMaster) Set(val *ClusterResponseHostsInnerReplicationMaster) {
	v.value = val
	v.isSet = true
}

func (v NullableClusterResponseHostsInnerReplicationMaster) IsSet() bool {
	return v.isSet
}

func (v *NullableClusterResponseHostsInnerReplicationMaster) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableClusterResponseHostsInnerReplicationMaster(val *ClusterResponseHostsInnerReplicationMaster) *NullableClusterResponseHostsInnerReplicationMaster {
	return &NullableClusterResponseHostsInnerReplicationMaster{value: val, isSet: true}
}

func (v NullableClusterResponseHostsInnerReplicationMaster) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableClusterResponseHostsInnerReplicationMaster) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


