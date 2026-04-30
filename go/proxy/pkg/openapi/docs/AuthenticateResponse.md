# AuthenticateResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestCreated** | Pointer to **string** |  | [optional] 
**RequestProcessed** | Pointer to **string** |  | [optional] 
**RequestStatus** | Pointer to **string** |  | [optional] 
**User** | Pointer to [**AuthenticateResponseUser**](AuthenticateResponseUser.md) |  | [optional] 

## Methods

### NewAuthenticateResponse

`func NewAuthenticateResponse() *AuthenticateResponse`

NewAuthenticateResponse instantiates a new AuthenticateResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAuthenticateResponseWithDefaults

`func NewAuthenticateResponseWithDefaults() *AuthenticateResponse`

NewAuthenticateResponseWithDefaults instantiates a new AuthenticateResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetRequestCreated

`func (o *AuthenticateResponse) GetRequestCreated() string`

GetRequestCreated returns the RequestCreated field if non-nil, zero value otherwise.

### GetRequestCreatedOk

`func (o *AuthenticateResponse) GetRequestCreatedOk() (*string, bool)`

GetRequestCreatedOk returns a tuple with the RequestCreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequestCreated

`func (o *AuthenticateResponse) SetRequestCreated(v string)`

SetRequestCreated sets RequestCreated field to given value.

### HasRequestCreated

`func (o *AuthenticateResponse) HasRequestCreated() bool`

HasRequestCreated returns a boolean if a field has been set.

### GetRequestProcessed

`func (o *AuthenticateResponse) GetRequestProcessed() string`

GetRequestProcessed returns the RequestProcessed field if non-nil, zero value otherwise.

### GetRequestProcessedOk

`func (o *AuthenticateResponse) GetRequestProcessedOk() (*string, bool)`

GetRequestProcessedOk returns a tuple with the RequestProcessed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequestProcessed

`func (o *AuthenticateResponse) SetRequestProcessed(v string)`

SetRequestProcessed sets RequestProcessed field to given value.

### HasRequestProcessed

`func (o *AuthenticateResponse) HasRequestProcessed() bool`

HasRequestProcessed returns a boolean if a field has been set.

### GetRequestStatus

`func (o *AuthenticateResponse) GetRequestStatus() string`

GetRequestStatus returns the RequestStatus field if non-nil, zero value otherwise.

### GetRequestStatusOk

`func (o *AuthenticateResponse) GetRequestStatusOk() (*string, bool)`

GetRequestStatusOk returns a tuple with the RequestStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequestStatus

`func (o *AuthenticateResponse) SetRequestStatus(v string)`

SetRequestStatus sets RequestStatus field to given value.

### HasRequestStatus

`func (o *AuthenticateResponse) HasRequestStatus() bool`

HasRequestStatus returns a boolean if a field has been set.

### GetUser

`func (o *AuthenticateResponse) GetUser() AuthenticateResponseUser`

GetUser returns the User field if non-nil, zero value otherwise.

### GetUserOk

`func (o *AuthenticateResponse) GetUserOk() (*AuthenticateResponseUser, bool)`

GetUserOk returns a tuple with the User field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUser

`func (o *AuthenticateResponse) SetUser(v AuthenticateResponseUser)`

SetUser sets User field to given value.

### HasUser

`func (o *AuthenticateResponse) HasUser() bool`

HasUser returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


