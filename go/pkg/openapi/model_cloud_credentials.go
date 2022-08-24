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

// CloudCredentials struct for CloudCredentials
type CloudCredentials struct {
	AccessKeyId *string `json:"access_key_id,omitempty"`
	AccessKeySecret *string `json:"access_key_secret,omitempty"`
	AccessKeyRegion *string `json:"access_key_region,omitempty"`
}

// NewCloudCredentials instantiates a new CloudCredentials object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCloudCredentials() *CloudCredentials {
	this := CloudCredentials{}
	return &this
}

// NewCloudCredentialsWithDefaults instantiates a new CloudCredentials object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCloudCredentialsWithDefaults() *CloudCredentials {
	this := CloudCredentials{}
	return &this
}

// GetAccessKeyId returns the AccessKeyId field value if set, zero value otherwise.
func (o *CloudCredentials) GetAccessKeyId() string {
	if o == nil || o.AccessKeyId == nil {
		var ret string
		return ret
	}
	return *o.AccessKeyId
}

// GetAccessKeyIdOk returns a tuple with the AccessKeyId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CloudCredentials) GetAccessKeyIdOk() (*string, bool) {
	if o == nil || o.AccessKeyId == nil {
		return nil, false
	}
	return o.AccessKeyId, true
}

// HasAccessKeyId returns a boolean if a field has been set.
func (o *CloudCredentials) HasAccessKeyId() bool {
	if o != nil && o.AccessKeyId != nil {
		return true
	}

	return false
}

// SetAccessKeyId gets a reference to the given string and assigns it to the AccessKeyId field.
func (o *CloudCredentials) SetAccessKeyId(v string) {
	o.AccessKeyId = &v
}

// GetAccessKeySecret returns the AccessKeySecret field value if set, zero value otherwise.
func (o *CloudCredentials) GetAccessKeySecret() string {
	if o == nil || o.AccessKeySecret == nil {
		var ret string
		return ret
	}
	return *o.AccessKeySecret
}

// GetAccessKeySecretOk returns a tuple with the AccessKeySecret field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CloudCredentials) GetAccessKeySecretOk() (*string, bool) {
	if o == nil || o.AccessKeySecret == nil {
		return nil, false
	}
	return o.AccessKeySecret, true
}

// HasAccessKeySecret returns a boolean if a field has been set.
func (o *CloudCredentials) HasAccessKeySecret() bool {
	if o != nil && o.AccessKeySecret != nil {
		return true
	}

	return false
}

// SetAccessKeySecret gets a reference to the given string and assigns it to the AccessKeySecret field.
func (o *CloudCredentials) SetAccessKeySecret(v string) {
	o.AccessKeySecret = &v
}

// GetAccessKeyRegion returns the AccessKeyRegion field value if set, zero value otherwise.
func (o *CloudCredentials) GetAccessKeyRegion() string {
	if o == nil || o.AccessKeyRegion == nil {
		var ret string
		return ret
	}
	return *o.AccessKeyRegion
}

// GetAccessKeyRegionOk returns a tuple with the AccessKeyRegion field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CloudCredentials) GetAccessKeyRegionOk() (*string, bool) {
	if o == nil || o.AccessKeyRegion == nil {
		return nil, false
	}
	return o.AccessKeyRegion, true
}

// HasAccessKeyRegion returns a boolean if a field has been set.
func (o *CloudCredentials) HasAccessKeyRegion() bool {
	if o != nil && o.AccessKeyRegion != nil {
		return true
	}

	return false
}

// SetAccessKeyRegion gets a reference to the given string and assigns it to the AccessKeyRegion field.
func (o *CloudCredentials) SetAccessKeyRegion(v string) {
	o.AccessKeyRegion = &v
}

func (o CloudCredentials) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.AccessKeyId != nil {
		toSerialize["access_key_id"] = o.AccessKeyId
	}
	if o.AccessKeySecret != nil {
		toSerialize["access_key_secret"] = o.AccessKeySecret
	}
	if o.AccessKeyRegion != nil {
		toSerialize["access_key_region"] = o.AccessKeyRegion
	}
	return json.Marshal(toSerialize)
}

type NullableCloudCredentials struct {
	value *CloudCredentials
	isSet bool
}

func (v NullableCloudCredentials) Get() *CloudCredentials {
	return v.value
}

func (v *NullableCloudCredentials) Set(val *CloudCredentials) {
	v.value = val
	v.isSet = true
}

func (v NullableCloudCredentials) IsSet() bool {
	return v.isSet
}

func (v *NullableCloudCredentials) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCloudCredentials(val *CloudCredentials) *NullableCloudCredentials {
	return &NullableCloudCredentials{value: val, isSet: true}
}

func (v NullableCloudCredentials) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCloudCredentials) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


