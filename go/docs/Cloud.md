# Cloud

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Operation** | **string** |  | 
**Provider** | Pointer to **string** |  | [optional] 
**Name** | Pointer to **string** |  | [optional] 
**Comment** | Pointer to **string** |  | [optional] 
**Id** | Pointer to **int32** |  | [optional] 
**Credentials** | Pointer to [**CloudCredentials**](CloudCredentials.md) |  | [optional] 

## Methods

### NewCloud

`func NewCloud(operation string, ) *Cloud`

NewCloud instantiates a new Cloud object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCloudWithDefaults

`func NewCloudWithDefaults() *Cloud`

NewCloudWithDefaults instantiates a new Cloud object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOperation

`func (o *Cloud) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *Cloud) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *Cloud) SetOperation(v string)`

SetOperation sets Operation field to given value.


### GetProvider

`func (o *Cloud) GetProvider() string`

GetProvider returns the Provider field if non-nil, zero value otherwise.

### GetProviderOk

`func (o *Cloud) GetProviderOk() (*string, bool)`

GetProviderOk returns a tuple with the Provider field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProvider

`func (o *Cloud) SetProvider(v string)`

SetProvider sets Provider field to given value.

### HasProvider

`func (o *Cloud) HasProvider() bool`

HasProvider returns a boolean if a field has been set.

### GetName

`func (o *Cloud) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *Cloud) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *Cloud) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *Cloud) HasName() bool`

HasName returns a boolean if a field has been set.

### GetComment

`func (o *Cloud) GetComment() string`

GetComment returns the Comment field if non-nil, zero value otherwise.

### GetCommentOk

`func (o *Cloud) GetCommentOk() (*string, bool)`

GetCommentOk returns a tuple with the Comment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComment

`func (o *Cloud) SetComment(v string)`

SetComment sets Comment field to given value.

### HasComment

`func (o *Cloud) HasComment() bool`

HasComment returns a boolean if a field has been set.

### GetId

`func (o *Cloud) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Cloud) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Cloud) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *Cloud) HasId() bool`

HasId returns a boolean if a field has been set.

### GetCredentials

`func (o *Cloud) GetCredentials() CloudCredentials`

GetCredentials returns the Credentials field if non-nil, zero value otherwise.

### GetCredentialsOk

`func (o *Cloud) GetCredentialsOk() (*CloudCredentials, bool)`

GetCredentialsOk returns a tuple with the Credentials field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCredentials

`func (o *Cloud) SetCredentials(v CloudCredentials)`

SetCredentials sets Credentials field to given value.

### HasCredentials

`func (o *Cloud) HasCredentials() bool`

HasCredentials returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


