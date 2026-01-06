# Clusters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Operation** | **string** |  | 
**ClusterId** | Pointer to **int32** |  | [optional] 
**ClusterName** | Pointer to **string** |  | [optional] 
**WithHosts** | Pointer to **bool** |  | [optional] 
**WithSheetInfo** | Pointer to **bool** |  | [optional] 
**Configuration** | Pointer to [**[]ClustersConfigurationInner**](ClustersConfigurationInner.md) |  | [optional] 
**Account** | Pointer to [**ClustersAccount**](ClustersAccount.md) |  | [optional] 
**FilterStrings** | Pointer to **string** |  | [optional] 
**Limit** | Pointer to **int32** |  | [optional] 
**Offset** | Pointer to **int32** |  | [optional] 
**Database** | Pointer to [**ClustersDatabase**](ClustersDatabase.md) |  | [optional] 
**Nodes** | Pointer to **[]string** |  | [optional] 

## Methods

### NewClusters

`func NewClusters(operation string, ) *Clusters`

NewClusters instantiates a new Clusters object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewClustersWithDefaults

`func NewClustersWithDefaults() *Clusters`

NewClustersWithDefaults instantiates a new Clusters object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOperation

`func (o *Clusters) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *Clusters) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *Clusters) SetOperation(v string)`

SetOperation sets Operation field to given value.


### GetClusterId

`func (o *Clusters) GetClusterId() int32`

GetClusterId returns the ClusterId field if non-nil, zero value otherwise.

### GetClusterIdOk

`func (o *Clusters) GetClusterIdOk() (*int32, bool)`

GetClusterIdOk returns a tuple with the ClusterId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClusterId

`func (o *Clusters) SetClusterId(v int32)`

SetClusterId sets ClusterId field to given value.

### HasClusterId

`func (o *Clusters) HasClusterId() bool`

HasClusterId returns a boolean if a field has been set.

### GetClusterName

`func (o *Clusters) GetClusterName() string`

GetClusterName returns the ClusterName field if non-nil, zero value otherwise.

### GetClusterNameOk

`func (o *Clusters) GetClusterNameOk() (*string, bool)`

GetClusterNameOk returns a tuple with the ClusterName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClusterName

`func (o *Clusters) SetClusterName(v string)`

SetClusterName sets ClusterName field to given value.

### HasClusterName

`func (o *Clusters) HasClusterName() bool`

HasClusterName returns a boolean if a field has been set.

### GetWithHosts

`func (o *Clusters) GetWithHosts() bool`

GetWithHosts returns the WithHosts field if non-nil, zero value otherwise.

### GetWithHostsOk

`func (o *Clusters) GetWithHostsOk() (*bool, bool)`

GetWithHostsOk returns a tuple with the WithHosts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWithHosts

`func (o *Clusters) SetWithHosts(v bool)`

SetWithHosts sets WithHosts field to given value.

### HasWithHosts

`func (o *Clusters) HasWithHosts() bool`

HasWithHosts returns a boolean if a field has been set.

### GetWithSheetInfo

`func (o *Clusters) GetWithSheetInfo() bool`

GetWithSheetInfo returns the WithSheetInfo field if non-nil, zero value otherwise.

### GetWithSheetInfoOk

`func (o *Clusters) GetWithSheetInfoOk() (*bool, bool)`

GetWithSheetInfoOk returns a tuple with the WithSheetInfo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWithSheetInfo

`func (o *Clusters) SetWithSheetInfo(v bool)`

SetWithSheetInfo sets WithSheetInfo field to given value.

### HasWithSheetInfo

`func (o *Clusters) HasWithSheetInfo() bool`

HasWithSheetInfo returns a boolean if a field has been set.

### GetConfiguration

`func (o *Clusters) GetConfiguration() []ClustersConfigurationInner`

GetConfiguration returns the Configuration field if non-nil, zero value otherwise.

### GetConfigurationOk

`func (o *Clusters) GetConfigurationOk() (*[]ClustersConfigurationInner, bool)`

GetConfigurationOk returns a tuple with the Configuration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConfiguration

`func (o *Clusters) SetConfiguration(v []ClustersConfigurationInner)`

SetConfiguration sets Configuration field to given value.

### HasConfiguration

`func (o *Clusters) HasConfiguration() bool`

HasConfiguration returns a boolean if a field has been set.

### GetAccount

`func (o *Clusters) GetAccount() ClustersAccount`

GetAccount returns the Account field if non-nil, zero value otherwise.

### GetAccountOk

`func (o *Clusters) GetAccountOk() (*ClustersAccount, bool)`

GetAccountOk returns a tuple with the Account field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccount

`func (o *Clusters) SetAccount(v ClustersAccount)`

SetAccount sets Account field to given value.

### HasAccount

`func (o *Clusters) HasAccount() bool`

HasAccount returns a boolean if a field has been set.

### GetFilterStrings

`func (o *Clusters) GetFilterStrings() string`

GetFilterStrings returns the FilterStrings field if non-nil, zero value otherwise.

### GetFilterStringsOk

`func (o *Clusters) GetFilterStringsOk() (*string, bool)`

GetFilterStringsOk returns a tuple with the FilterStrings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilterStrings

`func (o *Clusters) SetFilterStrings(v string)`

SetFilterStrings sets FilterStrings field to given value.

### HasFilterStrings

`func (o *Clusters) HasFilterStrings() bool`

HasFilterStrings returns a boolean if a field has been set.

### GetLimit

`func (o *Clusters) GetLimit() int32`

GetLimit returns the Limit field if non-nil, zero value otherwise.

### GetLimitOk

`func (o *Clusters) GetLimitOk() (*int32, bool)`

GetLimitOk returns a tuple with the Limit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimit

`func (o *Clusters) SetLimit(v int32)`

SetLimit sets Limit field to given value.

### HasLimit

`func (o *Clusters) HasLimit() bool`

HasLimit returns a boolean if a field has been set.

### GetOffset

`func (o *Clusters) GetOffset() int32`

GetOffset returns the Offset field if non-nil, zero value otherwise.

### GetOffsetOk

`func (o *Clusters) GetOffsetOk() (*int32, bool)`

GetOffsetOk returns a tuple with the Offset field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffset

`func (o *Clusters) SetOffset(v int32)`

SetOffset sets Offset field to given value.

### HasOffset

`func (o *Clusters) HasOffset() bool`

HasOffset returns a boolean if a field has been set.

### GetDatabase

`func (o *Clusters) GetDatabase() ClustersDatabase`

GetDatabase returns the Database field if non-nil, zero value otherwise.

### GetDatabaseOk

`func (o *Clusters) GetDatabaseOk() (*ClustersDatabase, bool)`

GetDatabaseOk returns a tuple with the Database field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDatabase

`func (o *Clusters) SetDatabase(v ClustersDatabase)`

SetDatabase sets Database field to given value.

### HasDatabase

`func (o *Clusters) HasDatabase() bool`

HasDatabase returns a boolean if a field has been set.

### GetNodes

`func (o *Clusters) GetNodes() []string`

GetNodes returns the Nodes field if non-nil, zero value otherwise.

### GetNodesOk

`func (o *Clusters) GetNodesOk() (*[]string, bool)`

GetNodesOk returns a tuple with the Nodes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNodes

`func (o *Clusters) SetNodes(v []string)`

SetNodes sets Nodes field to given value.

### HasNodes

`func (o *Clusters) HasNodes() bool`

HasNodes returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


