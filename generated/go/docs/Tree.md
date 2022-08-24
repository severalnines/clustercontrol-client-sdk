# Tree

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Operation** | **string** |  | 
**Acl** | Pointer to **string** |  | [optional] 
**Path** | Pointer to **string** |  | [optional] 

## Methods

### NewTree

`func NewTree(operation string, ) *Tree`

NewTree instantiates a new Tree object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTreeWithDefaults

`func NewTreeWithDefaults() *Tree`

NewTreeWithDefaults instantiates a new Tree object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOperation

`func (o *Tree) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *Tree) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *Tree) SetOperation(v string)`

SetOperation sets Operation field to given value.


### GetAcl

`func (o *Tree) GetAcl() string`

GetAcl returns the Acl field if non-nil, zero value otherwise.

### GetAclOk

`func (o *Tree) GetAclOk() (*string, bool)`

GetAclOk returns a tuple with the Acl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAcl

`func (o *Tree) SetAcl(v string)`

SetAcl sets Acl field to given value.

### HasAcl

`func (o *Tree) HasAcl() bool`

HasAcl returns a boolean if a field has been set.

### GetPath

`func (o *Tree) GetPath() string`

GetPath returns the Path field if non-nil, zero value otherwise.

### GetPathOk

`func (o *Tree) GetPathOk() (*string, bool)`

GetPathOk returns a tuple with the Path field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPath

`func (o *Tree) SetPath(v string)`

SetPath sets Path field to given value.

### HasPath

`func (o *Tree) HasPath() bool`

HasPath returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


