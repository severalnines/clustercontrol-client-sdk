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

// checks if the DiscoverySshCredentials type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &DiscoverySshCredentials{}

// DiscoverySshCredentials struct for DiscoverySshCredentials
type DiscoverySshCredentials struct {
	ClassName *string `json:"class_name,omitempty"`
	UserName *string `json:"user_name,omitempty"`
	Password *string `json:"password,omitempty"`
	SshKeyfile *string `json:"ssh_keyfile,omitempty"`
}

// NewDiscoverySshCredentials instantiates a new DiscoverySshCredentials object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewDiscoverySshCredentials() *DiscoverySshCredentials {
	this := DiscoverySshCredentials{}
	return &this
}

// NewDiscoverySshCredentialsWithDefaults instantiates a new DiscoverySshCredentials object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewDiscoverySshCredentialsWithDefaults() *DiscoverySshCredentials {
	this := DiscoverySshCredentials{}
	return &this
}

// GetClassName returns the ClassName field value if set, zero value otherwise.
func (o *DiscoverySshCredentials) GetClassName() string {
	if o == nil || IsNil(o.ClassName) {
		var ret string
		return ret
	}
	return *o.ClassName
}

// GetClassNameOk returns a tuple with the ClassName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DiscoverySshCredentials) GetClassNameOk() (*string, bool) {
	if o == nil || IsNil(o.ClassName) {
		return nil, false
	}
	return o.ClassName, true
}

// HasClassName returns a boolean if a field has been set.
func (o *DiscoverySshCredentials) HasClassName() bool {
	if o != nil && !IsNil(o.ClassName) {
		return true
	}

	return false
}

// SetClassName gets a reference to the given string and assigns it to the ClassName field.
func (o *DiscoverySshCredentials) SetClassName(v string) {
	o.ClassName = &v
}

// GetUserName returns the UserName field value if set, zero value otherwise.
func (o *DiscoverySshCredentials) GetUserName() string {
	if o == nil || IsNil(o.UserName) {
		var ret string
		return ret
	}
	return *o.UserName
}

// GetUserNameOk returns a tuple with the UserName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DiscoverySshCredentials) GetUserNameOk() (*string, bool) {
	if o == nil || IsNil(o.UserName) {
		return nil, false
	}
	return o.UserName, true
}

// HasUserName returns a boolean if a field has been set.
func (o *DiscoverySshCredentials) HasUserName() bool {
	if o != nil && !IsNil(o.UserName) {
		return true
	}

	return false
}

// SetUserName gets a reference to the given string and assigns it to the UserName field.
func (o *DiscoverySshCredentials) SetUserName(v string) {
	o.UserName = &v
}

// GetPassword returns the Password field value if set, zero value otherwise.
func (o *DiscoverySshCredentials) GetPassword() string {
	if o == nil || IsNil(o.Password) {
		var ret string
		return ret
	}
	return *o.Password
}

// GetPasswordOk returns a tuple with the Password field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DiscoverySshCredentials) GetPasswordOk() (*string, bool) {
	if o == nil || IsNil(o.Password) {
		return nil, false
	}
	return o.Password, true
}

// HasPassword returns a boolean if a field has been set.
func (o *DiscoverySshCredentials) HasPassword() bool {
	if o != nil && !IsNil(o.Password) {
		return true
	}

	return false
}

// SetPassword gets a reference to the given string and assigns it to the Password field.
func (o *DiscoverySshCredentials) SetPassword(v string) {
	o.Password = &v
}

// GetSshKeyfile returns the SshKeyfile field value if set, zero value otherwise.
func (o *DiscoverySshCredentials) GetSshKeyfile() string {
	if o == nil || IsNil(o.SshKeyfile) {
		var ret string
		return ret
	}
	return *o.SshKeyfile
}

// GetSshKeyfileOk returns a tuple with the SshKeyfile field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DiscoverySshCredentials) GetSshKeyfileOk() (*string, bool) {
	if o == nil || IsNil(o.SshKeyfile) {
		return nil, false
	}
	return o.SshKeyfile, true
}

// HasSshKeyfile returns a boolean if a field has been set.
func (o *DiscoverySshCredentials) HasSshKeyfile() bool {
	if o != nil && !IsNil(o.SshKeyfile) {
		return true
	}

	return false
}

// SetSshKeyfile gets a reference to the given string and assigns it to the SshKeyfile field.
func (o *DiscoverySshCredentials) SetSshKeyfile(v string) {
	o.SshKeyfile = &v
}

func (o DiscoverySshCredentials) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o DiscoverySshCredentials) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.ClassName) {
		toSerialize["class_name"] = o.ClassName
	}
	if !IsNil(o.UserName) {
		toSerialize["user_name"] = o.UserName
	}
	if !IsNil(o.Password) {
		toSerialize["password"] = o.Password
	}
	if !IsNil(o.SshKeyfile) {
		toSerialize["ssh_keyfile"] = o.SshKeyfile
	}
	return toSerialize, nil
}

type NullableDiscoverySshCredentials struct {
	value *DiscoverySshCredentials
	isSet bool
}

func (v NullableDiscoverySshCredentials) Get() *DiscoverySshCredentials {
	return v.value
}

func (v *NullableDiscoverySshCredentials) Set(val *DiscoverySshCredentials) {
	v.value = val
	v.isSet = true
}

func (v NullableDiscoverySshCredentials) IsSet() bool {
	return v.isSet
}

func (v *NullableDiscoverySshCredentials) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableDiscoverySshCredentials(val *DiscoverySshCredentials) *NullableDiscoverySshCredentials {
	return &NullableDiscoverySshCredentials{value: val, isSet: true}
}

func (v NullableDiscoverySshCredentials) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableDiscoverySshCredentials) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


