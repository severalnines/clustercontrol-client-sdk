# Controller

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Operation** | **string** |  | 
**ClientIpAddress** | Pointer to **string** |  | [optional] 
**ControllerKey** | Pointer to **string** |  | [optional] 

## Methods

### NewController

`func NewController(operation string, ) *Controller`

NewController instantiates a new Controller object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewControllerWithDefaults

`func NewControllerWithDefaults() *Controller`

NewControllerWithDefaults instantiates a new Controller object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOperation

`func (o *Controller) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *Controller) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *Controller) SetOperation(v string)`

SetOperation sets Operation field to given value.


### GetClientIpAddress

`func (o *Controller) GetClientIpAddress() string`

GetClientIpAddress returns the ClientIpAddress field if non-nil, zero value otherwise.

### GetClientIpAddressOk

`func (o *Controller) GetClientIpAddressOk() (*string, bool)`

GetClientIpAddressOk returns a tuple with the ClientIpAddress field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClientIpAddress

`func (o *Controller) SetClientIpAddress(v string)`

SetClientIpAddress sets ClientIpAddress field to given value.

### HasClientIpAddress

`func (o *Controller) HasClientIpAddress() bool`

HasClientIpAddress returns a boolean if a field has been set.

### GetControllerKey

`func (o *Controller) GetControllerKey() string`

GetControllerKey returns the ControllerKey field if non-nil, zero value otherwise.

### GetControllerKeyOk

`func (o *Controller) GetControllerKeyOk() (*string, bool)`

GetControllerKeyOk returns a tuple with the ControllerKey field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetControllerKey

`func (o *Controller) SetControllerKey(v string)`

SetControllerKey sets ControllerKey field to given value.

### HasControllerKey

`func (o *Controller) HasControllerKey() bool`

HasControllerKey returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


