# Stat

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Operation** | **string** |  | 
**ClusterId** | Pointer to **int32** |  | [optional] 
**Name** | Pointer to **string** | stat name. e.g. cpustat | [optional] 
**StartDatetime** | Pointer to **string** | e.g. \&quot;15:20\&quot; | [optional] 
**EndDatetime** | Pointer to **string** | e.g. \&quot;15:21\&quot; | [optional] 
**WithHosts** | Pointer to **bool** |  | [optional] 
**CalculatePerSec** | Pointer to **bool** |  | [optional] 

## Methods

### NewStat

`func NewStat(operation string, ) *Stat`

NewStat instantiates a new Stat object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewStatWithDefaults

`func NewStatWithDefaults() *Stat`

NewStatWithDefaults instantiates a new Stat object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOperation

`func (o *Stat) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *Stat) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *Stat) SetOperation(v string)`

SetOperation sets Operation field to given value.


### GetClusterId

`func (o *Stat) GetClusterId() int32`

GetClusterId returns the ClusterId field if non-nil, zero value otherwise.

### GetClusterIdOk

`func (o *Stat) GetClusterIdOk() (*int32, bool)`

GetClusterIdOk returns a tuple with the ClusterId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClusterId

`func (o *Stat) SetClusterId(v int32)`

SetClusterId sets ClusterId field to given value.

### HasClusterId

`func (o *Stat) HasClusterId() bool`

HasClusterId returns a boolean if a field has been set.

### GetName

`func (o *Stat) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *Stat) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *Stat) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *Stat) HasName() bool`

HasName returns a boolean if a field has been set.

### GetStartDatetime

`func (o *Stat) GetStartDatetime() string`

GetStartDatetime returns the StartDatetime field if non-nil, zero value otherwise.

### GetStartDatetimeOk

`func (o *Stat) GetStartDatetimeOk() (*string, bool)`

GetStartDatetimeOk returns a tuple with the StartDatetime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartDatetime

`func (o *Stat) SetStartDatetime(v string)`

SetStartDatetime sets StartDatetime field to given value.

### HasStartDatetime

`func (o *Stat) HasStartDatetime() bool`

HasStartDatetime returns a boolean if a field has been set.

### GetEndDatetime

`func (o *Stat) GetEndDatetime() string`

GetEndDatetime returns the EndDatetime field if non-nil, zero value otherwise.

### GetEndDatetimeOk

`func (o *Stat) GetEndDatetimeOk() (*string, bool)`

GetEndDatetimeOk returns a tuple with the EndDatetime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndDatetime

`func (o *Stat) SetEndDatetime(v string)`

SetEndDatetime sets EndDatetime field to given value.

### HasEndDatetime

`func (o *Stat) HasEndDatetime() bool`

HasEndDatetime returns a boolean if a field has been set.

### GetWithHosts

`func (o *Stat) GetWithHosts() bool`

GetWithHosts returns the WithHosts field if non-nil, zero value otherwise.

### GetWithHostsOk

`func (o *Stat) GetWithHostsOk() (*bool, bool)`

GetWithHostsOk returns a tuple with the WithHosts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWithHosts

`func (o *Stat) SetWithHosts(v bool)`

SetWithHosts sets WithHosts field to given value.

### HasWithHosts

`func (o *Stat) HasWithHosts() bool`

HasWithHosts returns a boolean if a field has been set.

### GetCalculatePerSec

`func (o *Stat) GetCalculatePerSec() bool`

GetCalculatePerSec returns the CalculatePerSec field if non-nil, zero value otherwise.

### GetCalculatePerSecOk

`func (o *Stat) GetCalculatePerSecOk() (*bool, bool)`

GetCalculatePerSecOk returns a tuple with the CalculatePerSec field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCalculatePerSec

`func (o *Stat) SetCalculatePerSec(v bool)`

SetCalculatePerSec sets CalculatePerSec field to given value.

### HasCalculatePerSec

`func (o *Stat) HasCalculatePerSec() bool`

HasCalculatePerSec returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


