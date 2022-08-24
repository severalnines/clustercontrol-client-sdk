# Authenticate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Operation** | **string** |  | 
**UserName** | Pointer to **string** |  | [optional] 
**Password** | Pointer to **string** |  | [optional] 
**Signature** | Pointer to **string** |  | [optional] 
**NewPassword** | Pointer to **string** |  | [optional] 
**PasswordResetToken** | Pointer to **string** |  | [optional] 

## Methods

### NewAuthenticate

`func NewAuthenticate(operation string, ) *Authenticate`

NewAuthenticate instantiates a new Authenticate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAuthenticateWithDefaults

`func NewAuthenticateWithDefaults() *Authenticate`

NewAuthenticateWithDefaults instantiates a new Authenticate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOperation

`func (o *Authenticate) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *Authenticate) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *Authenticate) SetOperation(v string)`

SetOperation sets Operation field to given value.


### GetUserName

`func (o *Authenticate) GetUserName() string`

GetUserName returns the UserName field if non-nil, zero value otherwise.

### GetUserNameOk

`func (o *Authenticate) GetUserNameOk() (*string, bool)`

GetUserNameOk returns a tuple with the UserName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserName

`func (o *Authenticate) SetUserName(v string)`

SetUserName sets UserName field to given value.

### HasUserName

`func (o *Authenticate) HasUserName() bool`

HasUserName returns a boolean if a field has been set.

### GetPassword

`func (o *Authenticate) GetPassword() string`

GetPassword returns the Password field if non-nil, zero value otherwise.

### GetPasswordOk

`func (o *Authenticate) GetPasswordOk() (*string, bool)`

GetPasswordOk returns a tuple with the Password field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPassword

`func (o *Authenticate) SetPassword(v string)`

SetPassword sets Password field to given value.

### HasPassword

`func (o *Authenticate) HasPassword() bool`

HasPassword returns a boolean if a field has been set.

### GetSignature

`func (o *Authenticate) GetSignature() string`

GetSignature returns the Signature field if non-nil, zero value otherwise.

### GetSignatureOk

`func (o *Authenticate) GetSignatureOk() (*string, bool)`

GetSignatureOk returns a tuple with the Signature field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSignature

`func (o *Authenticate) SetSignature(v string)`

SetSignature sets Signature field to given value.

### HasSignature

`func (o *Authenticate) HasSignature() bool`

HasSignature returns a boolean if a field has been set.

### GetNewPassword

`func (o *Authenticate) GetNewPassword() string`

GetNewPassword returns the NewPassword field if non-nil, zero value otherwise.

### GetNewPasswordOk

`func (o *Authenticate) GetNewPasswordOk() (*string, bool)`

GetNewPasswordOk returns a tuple with the NewPassword field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNewPassword

`func (o *Authenticate) SetNewPassword(v string)`

SetNewPassword sets NewPassword field to given value.

### HasNewPassword

`func (o *Authenticate) HasNewPassword() bool`

HasNewPassword returns a boolean if a field has been set.

### GetPasswordResetToken

`func (o *Authenticate) GetPasswordResetToken() string`

GetPasswordResetToken returns the PasswordResetToken field if non-nil, zero value otherwise.

### GetPasswordResetTokenOk

`func (o *Authenticate) GetPasswordResetTokenOk() (*string, bool)`

GetPasswordResetTokenOk returns a tuple with the PasswordResetToken field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPasswordResetToken

`func (o *Authenticate) SetPasswordResetToken(v string)`

SetPasswordResetToken sets PasswordResetToken field to given value.

### HasPasswordResetToken

`func (o *Authenticate) HasPasswordResetToken() bool`

HasPasswordResetToken returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


