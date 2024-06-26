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

// checks if the BackupResponseBackupRecordsInnerCluster type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &BackupResponseBackupRecordsInnerCluster{}

// BackupResponseBackupRecordsInnerCluster struct for BackupResponseBackupRecordsInnerCluster
type BackupResponseBackupRecordsInnerCluster struct {
	ClusterName *string `json:"cluster_name,omitempty"`
	ClusterId *int32 `json:"cluster_id,omitempty"`
	ClusterAutoRecovery *bool `json:"cluster_auto_recovery,omitempty"`
	MaintenanceModeActive *bool `json:"maintenance_mode_active,omitempty"`
	MaintenancePeriods []BackupResponseBackupRecordsInnerClusterMaintenancePeriodsInner `json:"maintenance_periods,omitempty"`
}

// NewBackupResponseBackupRecordsInnerCluster instantiates a new BackupResponseBackupRecordsInnerCluster object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewBackupResponseBackupRecordsInnerCluster() *BackupResponseBackupRecordsInnerCluster {
	this := BackupResponseBackupRecordsInnerCluster{}
	return &this
}

// NewBackupResponseBackupRecordsInnerClusterWithDefaults instantiates a new BackupResponseBackupRecordsInnerCluster object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewBackupResponseBackupRecordsInnerClusterWithDefaults() *BackupResponseBackupRecordsInnerCluster {
	this := BackupResponseBackupRecordsInnerCluster{}
	return &this
}

// GetClusterName returns the ClusterName field value if set, zero value otherwise.
func (o *BackupResponseBackupRecordsInnerCluster) GetClusterName() string {
	if o == nil || IsNil(o.ClusterName) {
		var ret string
		return ret
	}
	return *o.ClusterName
}

// GetClusterNameOk returns a tuple with the ClusterName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BackupResponseBackupRecordsInnerCluster) GetClusterNameOk() (*string, bool) {
	if o == nil || IsNil(o.ClusterName) {
		return nil, false
	}
	return o.ClusterName, true
}

// HasClusterName returns a boolean if a field has been set.
func (o *BackupResponseBackupRecordsInnerCluster) HasClusterName() bool {
	if o != nil && !IsNil(o.ClusterName) {
		return true
	}

	return false
}

// SetClusterName gets a reference to the given string and assigns it to the ClusterName field.
func (o *BackupResponseBackupRecordsInnerCluster) SetClusterName(v string) {
	o.ClusterName = &v
}

// GetClusterId returns the ClusterId field value if set, zero value otherwise.
func (o *BackupResponseBackupRecordsInnerCluster) GetClusterId() int32 {
	if o == nil || IsNil(o.ClusterId) {
		var ret int32
		return ret
	}
	return *o.ClusterId
}

// GetClusterIdOk returns a tuple with the ClusterId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BackupResponseBackupRecordsInnerCluster) GetClusterIdOk() (*int32, bool) {
	if o == nil || IsNil(o.ClusterId) {
		return nil, false
	}
	return o.ClusterId, true
}

// HasClusterId returns a boolean if a field has been set.
func (o *BackupResponseBackupRecordsInnerCluster) HasClusterId() bool {
	if o != nil && !IsNil(o.ClusterId) {
		return true
	}

	return false
}

// SetClusterId gets a reference to the given int32 and assigns it to the ClusterId field.
func (o *BackupResponseBackupRecordsInnerCluster) SetClusterId(v int32) {
	o.ClusterId = &v
}

// GetClusterAutoRecovery returns the ClusterAutoRecovery field value if set, zero value otherwise.
func (o *BackupResponseBackupRecordsInnerCluster) GetClusterAutoRecovery() bool {
	if o == nil || IsNil(o.ClusterAutoRecovery) {
		var ret bool
		return ret
	}
	return *o.ClusterAutoRecovery
}

// GetClusterAutoRecoveryOk returns a tuple with the ClusterAutoRecovery field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BackupResponseBackupRecordsInnerCluster) GetClusterAutoRecoveryOk() (*bool, bool) {
	if o == nil || IsNil(o.ClusterAutoRecovery) {
		return nil, false
	}
	return o.ClusterAutoRecovery, true
}

// HasClusterAutoRecovery returns a boolean if a field has been set.
func (o *BackupResponseBackupRecordsInnerCluster) HasClusterAutoRecovery() bool {
	if o != nil && !IsNil(o.ClusterAutoRecovery) {
		return true
	}

	return false
}

// SetClusterAutoRecovery gets a reference to the given bool and assigns it to the ClusterAutoRecovery field.
func (o *BackupResponseBackupRecordsInnerCluster) SetClusterAutoRecovery(v bool) {
	o.ClusterAutoRecovery = &v
}

// GetMaintenanceModeActive returns the MaintenanceModeActive field value if set, zero value otherwise.
func (o *BackupResponseBackupRecordsInnerCluster) GetMaintenanceModeActive() bool {
	if o == nil || IsNil(o.MaintenanceModeActive) {
		var ret bool
		return ret
	}
	return *o.MaintenanceModeActive
}

// GetMaintenanceModeActiveOk returns a tuple with the MaintenanceModeActive field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BackupResponseBackupRecordsInnerCluster) GetMaintenanceModeActiveOk() (*bool, bool) {
	if o == nil || IsNil(o.MaintenanceModeActive) {
		return nil, false
	}
	return o.MaintenanceModeActive, true
}

// HasMaintenanceModeActive returns a boolean if a field has been set.
func (o *BackupResponseBackupRecordsInnerCluster) HasMaintenanceModeActive() bool {
	if o != nil && !IsNil(o.MaintenanceModeActive) {
		return true
	}

	return false
}

// SetMaintenanceModeActive gets a reference to the given bool and assigns it to the MaintenanceModeActive field.
func (o *BackupResponseBackupRecordsInnerCluster) SetMaintenanceModeActive(v bool) {
	o.MaintenanceModeActive = &v
}

// GetMaintenancePeriods returns the MaintenancePeriods field value if set, zero value otherwise.
func (o *BackupResponseBackupRecordsInnerCluster) GetMaintenancePeriods() []BackupResponseBackupRecordsInnerClusterMaintenancePeriodsInner {
	if o == nil || IsNil(o.MaintenancePeriods) {
		var ret []BackupResponseBackupRecordsInnerClusterMaintenancePeriodsInner
		return ret
	}
	return o.MaintenancePeriods
}

// GetMaintenancePeriodsOk returns a tuple with the MaintenancePeriods field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BackupResponseBackupRecordsInnerCluster) GetMaintenancePeriodsOk() ([]BackupResponseBackupRecordsInnerClusterMaintenancePeriodsInner, bool) {
	if o == nil || IsNil(o.MaintenancePeriods) {
		return nil, false
	}
	return o.MaintenancePeriods, true
}

// HasMaintenancePeriods returns a boolean if a field has been set.
func (o *BackupResponseBackupRecordsInnerCluster) HasMaintenancePeriods() bool {
	if o != nil && !IsNil(o.MaintenancePeriods) {
		return true
	}

	return false
}

// SetMaintenancePeriods gets a reference to the given []BackupResponseBackupRecordsInnerClusterMaintenancePeriodsInner and assigns it to the MaintenancePeriods field.
func (o *BackupResponseBackupRecordsInnerCluster) SetMaintenancePeriods(v []BackupResponseBackupRecordsInnerClusterMaintenancePeriodsInner) {
	o.MaintenancePeriods = v
}

func (o BackupResponseBackupRecordsInnerCluster) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o BackupResponseBackupRecordsInnerCluster) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.ClusterName) {
		toSerialize["cluster_name"] = o.ClusterName
	}
	if !IsNil(o.ClusterId) {
		toSerialize["cluster_id"] = o.ClusterId
	}
	if !IsNil(o.ClusterAutoRecovery) {
		toSerialize["cluster_auto_recovery"] = o.ClusterAutoRecovery
	}
	if !IsNil(o.MaintenanceModeActive) {
		toSerialize["maintenance_mode_active"] = o.MaintenanceModeActive
	}
	if !IsNil(o.MaintenancePeriods) {
		toSerialize["maintenance_periods"] = o.MaintenancePeriods
	}
	return toSerialize, nil
}

type NullableBackupResponseBackupRecordsInnerCluster struct {
	value *BackupResponseBackupRecordsInnerCluster
	isSet bool
}

func (v NullableBackupResponseBackupRecordsInnerCluster) Get() *BackupResponseBackupRecordsInnerCluster {
	return v.value
}

func (v *NullableBackupResponseBackupRecordsInnerCluster) Set(val *BackupResponseBackupRecordsInnerCluster) {
	v.value = val
	v.isSet = true
}

func (v NullableBackupResponseBackupRecordsInnerCluster) IsSet() bool {
	return v.isSet
}

func (v *NullableBackupResponseBackupRecordsInnerCluster) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableBackupResponseBackupRecordsInnerCluster(val *BackupResponseBackupRecordsInnerCluster) *NullableBackupResponseBackupRecordsInnerCluster {
	return &NullableBackupResponseBackupRecordsInnerCluster{value: val, isSet: true}
}

func (v NullableBackupResponseBackupRecordsInnerCluster) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableBackupResponseBackupRecordsInnerCluster) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


