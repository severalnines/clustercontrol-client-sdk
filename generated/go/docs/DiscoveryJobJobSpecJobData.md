# DiscoveryJobJobSpecJobData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ClusterType** | Pointer to **string** |  | [optional] 
**MysqlVersion** | Pointer to **string** |  | [optional] 
**Vendor** | Pointer to **string** |  | [optional] 
**Nodes** | Pointer to [**[]DiscoveryJobJobSpecJobDataNodesInner**](DiscoveryJobJobSpecJobDataNodesInner.md) |  | [optional] 

## Methods

### NewDiscoveryJobJobSpecJobData

`func NewDiscoveryJobJobSpecJobData() *DiscoveryJobJobSpecJobData`

NewDiscoveryJobJobSpecJobData instantiates a new DiscoveryJobJobSpecJobData object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDiscoveryJobJobSpecJobDataWithDefaults

`func NewDiscoveryJobJobSpecJobDataWithDefaults() *DiscoveryJobJobSpecJobData`

NewDiscoveryJobJobSpecJobDataWithDefaults instantiates a new DiscoveryJobJobSpecJobData object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetClusterType

`func (o *DiscoveryJobJobSpecJobData) GetClusterType() string`

GetClusterType returns the ClusterType field if non-nil, zero value otherwise.

### GetClusterTypeOk

`func (o *DiscoveryJobJobSpecJobData) GetClusterTypeOk() (*string, bool)`

GetClusterTypeOk returns a tuple with the ClusterType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClusterType

`func (o *DiscoveryJobJobSpecJobData) SetClusterType(v string)`

SetClusterType sets ClusterType field to given value.

### HasClusterType

`func (o *DiscoveryJobJobSpecJobData) HasClusterType() bool`

HasClusterType returns a boolean if a field has been set.

### GetMysqlVersion

`func (o *DiscoveryJobJobSpecJobData) GetMysqlVersion() string`

GetMysqlVersion returns the MysqlVersion field if non-nil, zero value otherwise.

### GetMysqlVersionOk

`func (o *DiscoveryJobJobSpecJobData) GetMysqlVersionOk() (*string, bool)`

GetMysqlVersionOk returns a tuple with the MysqlVersion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMysqlVersion

`func (o *DiscoveryJobJobSpecJobData) SetMysqlVersion(v string)`

SetMysqlVersion sets MysqlVersion field to given value.

### HasMysqlVersion

`func (o *DiscoveryJobJobSpecJobData) HasMysqlVersion() bool`

HasMysqlVersion returns a boolean if a field has been set.

### GetVendor

`func (o *DiscoveryJobJobSpecJobData) GetVendor() string`

GetVendor returns the Vendor field if non-nil, zero value otherwise.

### GetVendorOk

`func (o *DiscoveryJobJobSpecJobData) GetVendorOk() (*string, bool)`

GetVendorOk returns a tuple with the Vendor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVendor

`func (o *DiscoveryJobJobSpecJobData) SetVendor(v string)`

SetVendor sets Vendor field to given value.

### HasVendor

`func (o *DiscoveryJobJobSpecJobData) HasVendor() bool`

HasVendor returns a boolean if a field has been set.

### GetNodes

`func (o *DiscoveryJobJobSpecJobData) GetNodes() []DiscoveryJobJobSpecJobDataNodesInner`

GetNodes returns the Nodes field if non-nil, zero value otherwise.

### GetNodesOk

`func (o *DiscoveryJobJobSpecJobData) GetNodesOk() (*[]DiscoveryJobJobSpecJobDataNodesInner, bool)`

GetNodesOk returns a tuple with the Nodes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNodes

`func (o *DiscoveryJobJobSpecJobData) SetNodes(v []DiscoveryJobJobSpecJobDataNodesInner)`

SetNodes sets Nodes field to given value.

### HasNodes

`func (o *DiscoveryJobJobSpecJobData) HasNodes() bool`

HasNodes returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


