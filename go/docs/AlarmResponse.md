# AlarmResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Operation** | Pointer to **string** |  | [optional] 
**ClusterId** | Pointer to **int32** |  | [optional] 
**AlarmId** | Pointer to **int32** |  | [optional] 
**ClassName** | Pointer to **string** |  | [optional] 
**Ignore** | Pointer to **bool** |  | [optional] 

## Methods

### NewAlarmResponse

`func NewAlarmResponse() *AlarmResponse`

NewAlarmResponse instantiates a new AlarmResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAlarmResponseWithDefaults

`func NewAlarmResponseWithDefaults() *AlarmResponse`

NewAlarmResponseWithDefaults instantiates a new AlarmResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOperation

`func (o *AlarmResponse) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *AlarmResponse) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *AlarmResponse) SetOperation(v string)`

SetOperation sets Operation field to given value.

### HasOperation

`func (o *AlarmResponse) HasOperation() bool`

HasOperation returns a boolean if a field has been set.

### GetClusterId

`func (o *AlarmResponse) GetClusterId() int32`

GetClusterId returns the ClusterId field if non-nil, zero value otherwise.

### GetClusterIdOk

`func (o *AlarmResponse) GetClusterIdOk() (*int32, bool)`

GetClusterIdOk returns a tuple with the ClusterId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClusterId

`func (o *AlarmResponse) SetClusterId(v int32)`

SetClusterId sets ClusterId field to given value.

### HasClusterId

`func (o *AlarmResponse) HasClusterId() bool`

HasClusterId returns a boolean if a field has been set.

### GetAlarmId

`func (o *AlarmResponse) GetAlarmId() int32`

GetAlarmId returns the AlarmId field if non-nil, zero value otherwise.

### GetAlarmIdOk

`func (o *AlarmResponse) GetAlarmIdOk() (*int32, bool)`

GetAlarmIdOk returns a tuple with the AlarmId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAlarmId

`func (o *AlarmResponse) SetAlarmId(v int32)`

SetAlarmId sets AlarmId field to given value.

### HasAlarmId

`func (o *AlarmResponse) HasAlarmId() bool`

HasAlarmId returns a boolean if a field has been set.

### GetClassName

`func (o *AlarmResponse) GetClassName() string`

GetClassName returns the ClassName field if non-nil, zero value otherwise.

### GetClassNameOk

`func (o *AlarmResponse) GetClassNameOk() (*string, bool)`

GetClassNameOk returns a tuple with the ClassName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClassName

`func (o *AlarmResponse) SetClassName(v string)`

SetClassName sets ClassName field to given value.

### HasClassName

`func (o *AlarmResponse) HasClassName() bool`

HasClassName returns a boolean if a field has been set.

### GetIgnore

`func (o *AlarmResponse) GetIgnore() bool`

GetIgnore returns the Ignore field if non-nil, zero value otherwise.

### GetIgnoreOk

`func (o *AlarmResponse) GetIgnoreOk() (*bool, bool)`

GetIgnoreOk returns a tuple with the Ignore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIgnore

`func (o *AlarmResponse) SetIgnore(v bool)`

SetIgnore sets Ignore field to given value.

### HasIgnore

`func (o *AlarmResponse) HasIgnore() bool`

HasIgnore returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


