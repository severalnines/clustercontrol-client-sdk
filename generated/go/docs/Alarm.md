# Alarm

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Operation** | **string** |  | 
**ClusterId** | Pointer to **int32** |  | [optional] 
**AlarmId** | Pointer to **int32** |  | [optional] 
**ClassName** | Pointer to **string** |  | [optional] 
**Ignore** | Pointer to **bool** |  | [optional] 

## Methods

### NewAlarm

`func NewAlarm(operation string, ) *Alarm`

NewAlarm instantiates a new Alarm object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAlarmWithDefaults

`func NewAlarmWithDefaults() *Alarm`

NewAlarmWithDefaults instantiates a new Alarm object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOperation

`func (o *Alarm) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *Alarm) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *Alarm) SetOperation(v string)`

SetOperation sets Operation field to given value.


### GetClusterId

`func (o *Alarm) GetClusterId() int32`

GetClusterId returns the ClusterId field if non-nil, zero value otherwise.

### GetClusterIdOk

`func (o *Alarm) GetClusterIdOk() (*int32, bool)`

GetClusterIdOk returns a tuple with the ClusterId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClusterId

`func (o *Alarm) SetClusterId(v int32)`

SetClusterId sets ClusterId field to given value.

### HasClusterId

`func (o *Alarm) HasClusterId() bool`

HasClusterId returns a boolean if a field has been set.

### GetAlarmId

`func (o *Alarm) GetAlarmId() int32`

GetAlarmId returns the AlarmId field if non-nil, zero value otherwise.

### GetAlarmIdOk

`func (o *Alarm) GetAlarmIdOk() (*int32, bool)`

GetAlarmIdOk returns a tuple with the AlarmId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAlarmId

`func (o *Alarm) SetAlarmId(v int32)`

SetAlarmId sets AlarmId field to given value.

### HasAlarmId

`func (o *Alarm) HasAlarmId() bool`

HasAlarmId returns a boolean if a field has been set.

### GetClassName

`func (o *Alarm) GetClassName() string`

GetClassName returns the ClassName field if non-nil, zero value otherwise.

### GetClassNameOk

`func (o *Alarm) GetClassNameOk() (*string, bool)`

GetClassNameOk returns a tuple with the ClassName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClassName

`func (o *Alarm) SetClassName(v string)`

SetClassName sets ClassName field to given value.

### HasClassName

`func (o *Alarm) HasClassName() bool`

HasClassName returns a boolean if a field has been set.

### GetIgnore

`func (o *Alarm) GetIgnore() bool`

GetIgnore returns the Ignore field if non-nil, zero value otherwise.

### GetIgnoreOk

`func (o *Alarm) GetIgnoreOk() (*bool, bool)`

GetIgnoreOk returns a tuple with the Ignore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIgnore

`func (o *Alarm) SetIgnore(v bool)`

SetIgnore sets Ignore field to given value.

### HasIgnore

`func (o *Alarm) HasIgnore() bool`

HasIgnore returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


