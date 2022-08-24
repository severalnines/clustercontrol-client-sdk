# Maintenance

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Operation** | **string** |  | 
**ClusterId** | Pointer to **int32** |  | [optional] 
**Deadline** | Pointer to **string** |  | [optional] 
**Initiate** | Pointer to **string** |  | [optional] 
**Hostname** | Pointer to **string** |  | [optional] 
**UUID** | Pointer to **string** |  | [optional] 

## Methods

### NewMaintenance

`func NewMaintenance(operation string, ) *Maintenance`

NewMaintenance instantiates a new Maintenance object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMaintenanceWithDefaults

`func NewMaintenanceWithDefaults() *Maintenance`

NewMaintenanceWithDefaults instantiates a new Maintenance object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOperation

`func (o *Maintenance) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *Maintenance) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *Maintenance) SetOperation(v string)`

SetOperation sets Operation field to given value.


### GetClusterId

`func (o *Maintenance) GetClusterId() int32`

GetClusterId returns the ClusterId field if non-nil, zero value otherwise.

### GetClusterIdOk

`func (o *Maintenance) GetClusterIdOk() (*int32, bool)`

GetClusterIdOk returns a tuple with the ClusterId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClusterId

`func (o *Maintenance) SetClusterId(v int32)`

SetClusterId sets ClusterId field to given value.

### HasClusterId

`func (o *Maintenance) HasClusterId() bool`

HasClusterId returns a boolean if a field has been set.

### GetDeadline

`func (o *Maintenance) GetDeadline() string`

GetDeadline returns the Deadline field if non-nil, zero value otherwise.

### GetDeadlineOk

`func (o *Maintenance) GetDeadlineOk() (*string, bool)`

GetDeadlineOk returns a tuple with the Deadline field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeadline

`func (o *Maintenance) SetDeadline(v string)`

SetDeadline sets Deadline field to given value.

### HasDeadline

`func (o *Maintenance) HasDeadline() bool`

HasDeadline returns a boolean if a field has been set.

### GetInitiate

`func (o *Maintenance) GetInitiate() string`

GetInitiate returns the Initiate field if non-nil, zero value otherwise.

### GetInitiateOk

`func (o *Maintenance) GetInitiateOk() (*string, bool)`

GetInitiateOk returns a tuple with the Initiate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInitiate

`func (o *Maintenance) SetInitiate(v string)`

SetInitiate sets Initiate field to given value.

### HasInitiate

`func (o *Maintenance) HasInitiate() bool`

HasInitiate returns a boolean if a field has been set.

### GetHostname

`func (o *Maintenance) GetHostname() string`

GetHostname returns the Hostname field if non-nil, zero value otherwise.

### GetHostnameOk

`func (o *Maintenance) GetHostnameOk() (*string, bool)`

GetHostnameOk returns a tuple with the Hostname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHostname

`func (o *Maintenance) SetHostname(v string)`

SetHostname sets Hostname field to given value.

### HasHostname

`func (o *Maintenance) HasHostname() bool`

HasHostname returns a boolean if a field has been set.

### GetUUID

`func (o *Maintenance) GetUUID() string`

GetUUID returns the UUID field if non-nil, zero value otherwise.

### GetUUIDOk

`func (o *Maintenance) GetUUIDOk() (*string, bool)`

GetUUIDOk returns a tuple with the UUID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUUID

`func (o *Maintenance) SetUUID(v string)`

SetUUID sets UUID field to given value.

### HasUUID

`func (o *Maintenance) HasUUID() bool`

HasUUID returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


