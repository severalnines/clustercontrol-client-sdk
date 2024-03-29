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

// checks if the Authenticate type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &Authenticate{}

// Authenticate struct for Authenticate
type Authenticate struct {
	Operation string `json:"operation"`
	UserName *string `json:"user_name,omitempty"`
	Password *string `json:"password,omitempty"`
	Signature *string `json:"signature,omitempty"`
	NewPassword *string `json:"new_password,omitempty"`
	PasswordResetToken *string `json:"password_reset_token,omitempty"`
}

type _Authenticate Authenticate

// NewAuthenticate instantiates a new Authenticate object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAuthenticate(operation string) *Authenticate {
	this := Authenticate{}
	this.Operation = operation
	return &this
}

// NewAuthenticateWithDefaults instantiates a new Authenticate object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAuthenticateWithDefaults() *Authenticate {
	this := Authenticate{}
	return &this
}

// GetOperation returns the Operation field value
func (o *Authenticate) GetOperation() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Operation
}

// GetOperationOk returns a tuple with the Operation field value
// and a boolean to check if the value has been set.
func (o *Authenticate) GetOperationOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Operation, true
}

// SetOperation sets field value
func (o *Authenticate) SetOperation(v string) {
	o.Operation = v
}

// GetUserName returns the UserName field value if set, zero value otherwise.
func (o *Authenticate) GetUserName() string {
	if o == nil || IsNil(o.UserName) {
		var ret string
		return ret
	}
	return *o.UserName
}

// GetUserNameOk returns a tuple with the UserName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Authenticate) GetUserNameOk() (*string, bool) {
	if o == nil || IsNil(o.UserName) {
		return nil, false
	}
	return o.UserName, true
}

// HasUserName returns a boolean if a field has been set.
func (o *Authenticate) HasUserName() bool {
	if o != nil && !IsNil(o.UserName) {
		return true
	}

	return false
}

// SetUserName gets a reference to the given string and assigns it to the UserName field.
func (o *Authenticate) SetUserName(v string) {
	o.UserName = &v
}

// GetPassword returns the Password field value if set, zero value otherwise.
func (o *Authenticate) GetPassword() string {
	if o == nil || IsNil(o.Password) {
		var ret string
		return ret
	}
	return *o.Password
}

// GetPasswordOk returns a tuple with the Password field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Authenticate) GetPasswordOk() (*string, bool) {
	if o == nil || IsNil(o.Password) {
		return nil, false
	}
	return o.Password, true
}

// HasPassword returns a boolean if a field has been set.
func (o *Authenticate) HasPassword() bool {
	if o != nil && !IsNil(o.Password) {
		return true
	}

	return false
}

// SetPassword gets a reference to the given string and assigns it to the Password field.
func (o *Authenticate) SetPassword(v string) {
	o.Password = &v
}

// GetSignature returns the Signature field value if set, zero value otherwise.
func (o *Authenticate) GetSignature() string {
	if o == nil || IsNil(o.Signature) {
		var ret string
		return ret
	}
	return *o.Signature
}

// GetSignatureOk returns a tuple with the Signature field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Authenticate) GetSignatureOk() (*string, bool) {
	if o == nil || IsNil(o.Signature) {
		return nil, false
	}
	return o.Signature, true
}

// HasSignature returns a boolean if a field has been set.
func (o *Authenticate) HasSignature() bool {
	if o != nil && !IsNil(o.Signature) {
		return true
	}

	return false
}

// SetSignature gets a reference to the given string and assigns it to the Signature field.
func (o *Authenticate) SetSignature(v string) {
	o.Signature = &v
}

// GetNewPassword returns the NewPassword field value if set, zero value otherwise.
func (o *Authenticate) GetNewPassword() string {
	if o == nil || IsNil(o.NewPassword) {
		var ret string
		return ret
	}
	return *o.NewPassword
}

// GetNewPasswordOk returns a tuple with the NewPassword field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Authenticate) GetNewPasswordOk() (*string, bool) {
	if o == nil || IsNil(o.NewPassword) {
		return nil, false
	}
	return o.NewPassword, true
}

// HasNewPassword returns a boolean if a field has been set.
func (o *Authenticate) HasNewPassword() bool {
	if o != nil && !IsNil(o.NewPassword) {
		return true
	}

	return false
}

// SetNewPassword gets a reference to the given string and assigns it to the NewPassword field.
func (o *Authenticate) SetNewPassword(v string) {
	o.NewPassword = &v
}

// GetPasswordResetToken returns the PasswordResetToken field value if set, zero value otherwise.
func (o *Authenticate) GetPasswordResetToken() string {
	if o == nil || IsNil(o.PasswordResetToken) {
		var ret string
		return ret
	}
	return *o.PasswordResetToken
}

// GetPasswordResetTokenOk returns a tuple with the PasswordResetToken field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Authenticate) GetPasswordResetTokenOk() (*string, bool) {
	if o == nil || IsNil(o.PasswordResetToken) {
		return nil, false
	}
	return o.PasswordResetToken, true
}

// HasPasswordResetToken returns a boolean if a field has been set.
func (o *Authenticate) HasPasswordResetToken() bool {
	if o != nil && !IsNil(o.PasswordResetToken) {
		return true
	}

	return false
}

// SetPasswordResetToken gets a reference to the given string and assigns it to the PasswordResetToken field.
func (o *Authenticate) SetPasswordResetToken(v string) {
	o.PasswordResetToken = &v
}

func (o Authenticate) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o Authenticate) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["operation"] = o.Operation
	if !IsNil(o.UserName) {
		toSerialize["user_name"] = o.UserName
	}
	if !IsNil(o.Password) {
		toSerialize["password"] = o.Password
	}
	if !IsNil(o.Signature) {
		toSerialize["signature"] = o.Signature
	}
	if !IsNil(o.NewPassword) {
		toSerialize["new_password"] = o.NewPassword
	}
	if !IsNil(o.PasswordResetToken) {
		toSerialize["password_reset_token"] = o.PasswordResetToken
	}
	return toSerialize, nil
}

func (o *Authenticate) UnmarshalJSON(data []byte) (err error) {
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

	varAuthenticate := _Authenticate{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varAuthenticate)

	if err != nil {
		return err
	}

	*o = Authenticate(varAuthenticate)

	return err
}

type NullableAuthenticate struct {
	value *Authenticate
	isSet bool
}

func (v NullableAuthenticate) Get() *Authenticate {
	return v.value
}

func (v *NullableAuthenticate) Set(val *Authenticate) {
	v.value = val
	v.isSet = true
}

func (v NullableAuthenticate) IsSet() bool {
	return v.isSet
}

func (v *NullableAuthenticate) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAuthenticate(val *Authenticate) *NullableAuthenticate {
	return &NullableAuthenticate{value: val, isSet: true}
}

func (v NullableAuthenticate) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAuthenticate) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


