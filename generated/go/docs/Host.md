# Host

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Operation** | **string** |  | 
**Servers** | Pointer to [**[]HostServersInner**](HostServersInner.md) |  | [optional] 
**ClusterId** | Pointer to **int32** |  | [optional] 
**DryRun** | Pointer to **bool** |  | [optional] 
**Host** | Pointer to [**HostHost**](HostHost.md) |  | [optional] 

## Methods

### NewHost

`func NewHost(operation string, ) *Host`

NewHost instantiates a new Host object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewHostWithDefaults

`func NewHostWithDefaults() *Host`

NewHostWithDefaults instantiates a new Host object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOperation

`func (o *Host) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *Host) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *Host) SetOperation(v string)`

SetOperation sets Operation field to given value.


### GetServers

`func (o *Host) GetServers() []HostServersInner`

GetServers returns the Servers field if non-nil, zero value otherwise.

### GetServersOk

`func (o *Host) GetServersOk() (*[]HostServersInner, bool)`

GetServersOk returns a tuple with the Servers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetServers

`func (o *Host) SetServers(v []HostServersInner)`

SetServers sets Servers field to given value.

### HasServers

`func (o *Host) HasServers() bool`

HasServers returns a boolean if a field has been set.

### GetClusterId

`func (o *Host) GetClusterId() int32`

GetClusterId returns the ClusterId field if non-nil, zero value otherwise.

### GetClusterIdOk

`func (o *Host) GetClusterIdOk() (*int32, bool)`

GetClusterIdOk returns a tuple with the ClusterId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClusterId

`func (o *Host) SetClusterId(v int32)`

SetClusterId sets ClusterId field to given value.

### HasClusterId

`func (o *Host) HasClusterId() bool`

HasClusterId returns a boolean if a field has been set.

### GetDryRun

`func (o *Host) GetDryRun() bool`

GetDryRun returns the DryRun field if non-nil, zero value otherwise.

### GetDryRunOk

`func (o *Host) GetDryRunOk() (*bool, bool)`

GetDryRunOk returns a tuple with the DryRun field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDryRun

`func (o *Host) SetDryRun(v bool)`

SetDryRun sets DryRun field to given value.

### HasDryRun

`func (o *Host) HasDryRun() bool`

HasDryRun returns a boolean if a field has been set.

### GetHost

`func (o *Host) GetHost() HostHost`

GetHost returns the Host field if non-nil, zero value otherwise.

### GetHostOk

`func (o *Host) GetHostOk() (*HostHost, bool)`

GetHostOk returns a tuple with the Host field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHost

`func (o *Host) SetHost(v HostHost)`

SetHost sets Host field to given value.

### HasHost

`func (o *Host) HasHost() bool`

HasHost returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


