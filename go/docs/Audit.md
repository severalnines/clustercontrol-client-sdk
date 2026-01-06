# Audit

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Operation** | **string** |  | 
**ClusterIds** | Pointer to **[]int32** |  | [optional] 
**Ascending** | Pointer to **bool** |  | [optional] 

## Methods

### NewAudit

`func NewAudit(operation string, ) *Audit`

NewAudit instantiates a new Audit object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAuditWithDefaults

`func NewAuditWithDefaults() *Audit`

NewAuditWithDefaults instantiates a new Audit object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOperation

`func (o *Audit) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *Audit) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *Audit) SetOperation(v string)`

SetOperation sets Operation field to given value.


### GetClusterIds

`func (o *Audit) GetClusterIds() []int32`

GetClusterIds returns the ClusterIds field if non-nil, zero value otherwise.

### GetClusterIdsOk

`func (o *Audit) GetClusterIdsOk() (*[]int32, bool)`

GetClusterIdsOk returns a tuple with the ClusterIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClusterIds

`func (o *Audit) SetClusterIds(v []int32)`

SetClusterIds sets ClusterIds field to given value.

### HasClusterIds

`func (o *Audit) HasClusterIds() bool`

HasClusterIds returns a boolean if a field has been set.

### GetAscending

`func (o *Audit) GetAscending() bool`

GetAscending returns the Ascending field if non-nil, zero value otherwise.

### GetAscendingOk

`func (o *Audit) GetAscendingOk() (*bool, bool)`

GetAscendingOk returns a tuple with the Ascending field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAscending

`func (o *Audit) SetAscending(v bool)`

SetAscending sets Ascending field to given value.

### HasAscending

`func (o *Audit) HasAscending() bool`

HasAscending returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


