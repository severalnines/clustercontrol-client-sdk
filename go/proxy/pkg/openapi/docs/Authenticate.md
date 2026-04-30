# Authenticate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Username** | Pointer to **string** |  | [optional] 
**Password** | Pointer to **string** |  | [optional] 

## Methods

### NewAuthenticate

`func NewAuthenticate() *Authenticate`

NewAuthenticate instantiates a new Authenticate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAuthenticateWithDefaults

`func NewAuthenticateWithDefaults() *Authenticate`

NewAuthenticateWithDefaults instantiates a new Authenticate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUsername

`func (o *Authenticate) GetUsername() string`

GetUsername returns the Username field if non-nil, zero value otherwise.

### GetUsernameOk

`func (o *Authenticate) GetUsernameOk() (*string, bool)`

GetUsernameOk returns a tuple with the Username field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsername

`func (o *Authenticate) SetUsername(v string)`

SetUsername sets Username field to given value.

### HasUsername

`func (o *Authenticate) HasUsername() bool`

HasUsername returns a boolean if a field has been set.

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


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


