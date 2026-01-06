# StatCmonAgent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Operation** | **string** |  | 
**ApiKey** | Pointer to **string** |  | [optional] 
**ClassName** | Pointer to **string** |  | [optional] 
**RequestData** | Pointer to [**StatCmonAgentRequestData**](StatCmonAgentRequestData.md) |  | [optional] 

## Methods

### NewStatCmonAgent

`func NewStatCmonAgent(operation string, ) *StatCmonAgent`

NewStatCmonAgent instantiates a new StatCmonAgent object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewStatCmonAgentWithDefaults

`func NewStatCmonAgentWithDefaults() *StatCmonAgent`

NewStatCmonAgentWithDefaults instantiates a new StatCmonAgent object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOperation

`func (o *StatCmonAgent) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *StatCmonAgent) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *StatCmonAgent) SetOperation(v string)`

SetOperation sets Operation field to given value.


### GetApiKey

`func (o *StatCmonAgent) GetApiKey() string`

GetApiKey returns the ApiKey field if non-nil, zero value otherwise.

### GetApiKeyOk

`func (o *StatCmonAgent) GetApiKeyOk() (*string, bool)`

GetApiKeyOk returns a tuple with the ApiKey field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetApiKey

`func (o *StatCmonAgent) SetApiKey(v string)`

SetApiKey sets ApiKey field to given value.

### HasApiKey

`func (o *StatCmonAgent) HasApiKey() bool`

HasApiKey returns a boolean if a field has been set.

### GetClassName

`func (o *StatCmonAgent) GetClassName() string`

GetClassName returns the ClassName field if non-nil, zero value otherwise.

### GetClassNameOk

`func (o *StatCmonAgent) GetClassNameOk() (*string, bool)`

GetClassNameOk returns a tuple with the ClassName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClassName

`func (o *StatCmonAgent) SetClassName(v string)`

SetClassName sets ClassName field to given value.

### HasClassName

`func (o *StatCmonAgent) HasClassName() bool`

HasClassName returns a boolean if a field has been set.

### GetRequestData

`func (o *StatCmonAgent) GetRequestData() StatCmonAgentRequestData`

GetRequestData returns the RequestData field if non-nil, zero value otherwise.

### GetRequestDataOk

`func (o *StatCmonAgent) GetRequestDataOk() (*StatCmonAgentRequestData, bool)`

GetRequestDataOk returns a tuple with the RequestData field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequestData

`func (o *StatCmonAgent) SetRequestData(v StatCmonAgentRequestData)`

SetRequestData sets RequestData field to given value.

### HasRequestData

`func (o *StatCmonAgent) HasRequestData() bool`

HasRequestData returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


