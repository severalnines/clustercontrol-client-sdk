# ClusterResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ClassName** | Pointer to **string** |  | [optional] 
**Operation** | Pointer to **string** |  | [optional] 
**ClusterId** | Pointer to **int32** |  | [optional] 
**ClusterName** | Pointer to **string** |  | [optional] 
**ClusterType** | Pointer to **string** |  | [optional] 
**Vendor** | Pointer to **string** |  | [optional] 
**Version** | Pointer to **string** |  | [optional] 
**Tags** | Pointer to **[]string** |  | [optional] 
**Hosts** | Pointer to [**[]ClusterResponseHostsInner**](ClusterResponseHostsInner.md) |  | [optional] 

## Methods

### NewClusterResponse

`func NewClusterResponse() *ClusterResponse`

NewClusterResponse instantiates a new ClusterResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewClusterResponseWithDefaults

`func NewClusterResponseWithDefaults() *ClusterResponse`

NewClusterResponseWithDefaults instantiates a new ClusterResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetClassName

`func (o *ClusterResponse) GetClassName() string`

GetClassName returns the ClassName field if non-nil, zero value otherwise.

### GetClassNameOk

`func (o *ClusterResponse) GetClassNameOk() (*string, bool)`

GetClassNameOk returns a tuple with the ClassName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClassName

`func (o *ClusterResponse) SetClassName(v string)`

SetClassName sets ClassName field to given value.

### HasClassName

`func (o *ClusterResponse) HasClassName() bool`

HasClassName returns a boolean if a field has been set.

### GetOperation

`func (o *ClusterResponse) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *ClusterResponse) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *ClusterResponse) SetOperation(v string)`

SetOperation sets Operation field to given value.

### HasOperation

`func (o *ClusterResponse) HasOperation() bool`

HasOperation returns a boolean if a field has been set.

### GetClusterId

`func (o *ClusterResponse) GetClusterId() int32`

GetClusterId returns the ClusterId field if non-nil, zero value otherwise.

### GetClusterIdOk

`func (o *ClusterResponse) GetClusterIdOk() (*int32, bool)`

GetClusterIdOk returns a tuple with the ClusterId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClusterId

`func (o *ClusterResponse) SetClusterId(v int32)`

SetClusterId sets ClusterId field to given value.

### HasClusterId

`func (o *ClusterResponse) HasClusterId() bool`

HasClusterId returns a boolean if a field has been set.

### GetClusterName

`func (o *ClusterResponse) GetClusterName() string`

GetClusterName returns the ClusterName field if non-nil, zero value otherwise.

### GetClusterNameOk

`func (o *ClusterResponse) GetClusterNameOk() (*string, bool)`

GetClusterNameOk returns a tuple with the ClusterName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClusterName

`func (o *ClusterResponse) SetClusterName(v string)`

SetClusterName sets ClusterName field to given value.

### HasClusterName

`func (o *ClusterResponse) HasClusterName() bool`

HasClusterName returns a boolean if a field has been set.

### GetClusterType

`func (o *ClusterResponse) GetClusterType() string`

GetClusterType returns the ClusterType field if non-nil, zero value otherwise.

### GetClusterTypeOk

`func (o *ClusterResponse) GetClusterTypeOk() (*string, bool)`

GetClusterTypeOk returns a tuple with the ClusterType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClusterType

`func (o *ClusterResponse) SetClusterType(v string)`

SetClusterType sets ClusterType field to given value.

### HasClusterType

`func (o *ClusterResponse) HasClusterType() bool`

HasClusterType returns a boolean if a field has been set.

### GetVendor

`func (o *ClusterResponse) GetVendor() string`

GetVendor returns the Vendor field if non-nil, zero value otherwise.

### GetVendorOk

`func (o *ClusterResponse) GetVendorOk() (*string, bool)`

GetVendorOk returns a tuple with the Vendor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVendor

`func (o *ClusterResponse) SetVendor(v string)`

SetVendor sets Vendor field to given value.

### HasVendor

`func (o *ClusterResponse) HasVendor() bool`

HasVendor returns a boolean if a field has been set.

### GetVersion

`func (o *ClusterResponse) GetVersion() string`

GetVersion returns the Version field if non-nil, zero value otherwise.

### GetVersionOk

`func (o *ClusterResponse) GetVersionOk() (*string, bool)`

GetVersionOk returns a tuple with the Version field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersion

`func (o *ClusterResponse) SetVersion(v string)`

SetVersion sets Version field to given value.

### HasVersion

`func (o *ClusterResponse) HasVersion() bool`

HasVersion returns a boolean if a field has been set.

### GetTags

`func (o *ClusterResponse) GetTags() []string`

GetTags returns the Tags field if non-nil, zero value otherwise.

### GetTagsOk

`func (o *ClusterResponse) GetTagsOk() (*[]string, bool)`

GetTagsOk returns a tuple with the Tags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTags

`func (o *ClusterResponse) SetTags(v []string)`

SetTags sets Tags field to given value.

### HasTags

`func (o *ClusterResponse) HasTags() bool`

HasTags returns a boolean if a field has been set.

### GetHosts

`func (o *ClusterResponse) GetHosts() []ClusterResponseHostsInner`

GetHosts returns the Hosts field if non-nil, zero value otherwise.

### GetHostsOk

`func (o *ClusterResponse) GetHostsOk() (*[]ClusterResponseHostsInner, bool)`

GetHostsOk returns a tuple with the Hosts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHosts

`func (o *ClusterResponse) SetHosts(v []ClusterResponseHostsInner)`

SetHosts sets Hosts field to given value.

### HasHosts

`func (o *ClusterResponse) HasHosts() bool`

HasHosts returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


