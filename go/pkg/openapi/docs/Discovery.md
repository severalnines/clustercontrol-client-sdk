# Discovery

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Operation** | **string** |  | 
**NewClusterName** | Pointer to **string** |  | [optional] 
**CheckIfAlreadyRegistered** | Pointer to **bool** |  | [optional] 
**CheckJob** | Pointer to **bool** |  | [optional] 
**CheckSshSudo** | Pointer to **bool** |  | [optional] 
**Nodes** | Pointer to [**[]DiscoveryNodesInner**](DiscoveryNodesInner.md) |  | [optional] 
**Job** | Pointer to [**DiscoveryJob**](DiscoveryJob.md) |  | [optional] 
**SshCredentials** | Pointer to [**DiscoverySshCredentials**](DiscoverySshCredentials.md) |  | [optional] 

## Methods

### NewDiscovery

`func NewDiscovery(operation string, ) *Discovery`

NewDiscovery instantiates a new Discovery object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDiscoveryWithDefaults

`func NewDiscoveryWithDefaults() *Discovery`

NewDiscoveryWithDefaults instantiates a new Discovery object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOperation

`func (o *Discovery) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *Discovery) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *Discovery) SetOperation(v string)`

SetOperation sets Operation field to given value.


### GetNewClusterName

`func (o *Discovery) GetNewClusterName() string`

GetNewClusterName returns the NewClusterName field if non-nil, zero value otherwise.

### GetNewClusterNameOk

`func (o *Discovery) GetNewClusterNameOk() (*string, bool)`

GetNewClusterNameOk returns a tuple with the NewClusterName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNewClusterName

`func (o *Discovery) SetNewClusterName(v string)`

SetNewClusterName sets NewClusterName field to given value.

### HasNewClusterName

`func (o *Discovery) HasNewClusterName() bool`

HasNewClusterName returns a boolean if a field has been set.

### GetCheckIfAlreadyRegistered

`func (o *Discovery) GetCheckIfAlreadyRegistered() bool`

GetCheckIfAlreadyRegistered returns the CheckIfAlreadyRegistered field if non-nil, zero value otherwise.

### GetCheckIfAlreadyRegisteredOk

`func (o *Discovery) GetCheckIfAlreadyRegisteredOk() (*bool, bool)`

GetCheckIfAlreadyRegisteredOk returns a tuple with the CheckIfAlreadyRegistered field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCheckIfAlreadyRegistered

`func (o *Discovery) SetCheckIfAlreadyRegistered(v bool)`

SetCheckIfAlreadyRegistered sets CheckIfAlreadyRegistered field to given value.

### HasCheckIfAlreadyRegistered

`func (o *Discovery) HasCheckIfAlreadyRegistered() bool`

HasCheckIfAlreadyRegistered returns a boolean if a field has been set.

### GetCheckJob

`func (o *Discovery) GetCheckJob() bool`

GetCheckJob returns the CheckJob field if non-nil, zero value otherwise.

### GetCheckJobOk

`func (o *Discovery) GetCheckJobOk() (*bool, bool)`

GetCheckJobOk returns a tuple with the CheckJob field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCheckJob

`func (o *Discovery) SetCheckJob(v bool)`

SetCheckJob sets CheckJob field to given value.

### HasCheckJob

`func (o *Discovery) HasCheckJob() bool`

HasCheckJob returns a boolean if a field has been set.

### GetCheckSshSudo

`func (o *Discovery) GetCheckSshSudo() bool`

GetCheckSshSudo returns the CheckSshSudo field if non-nil, zero value otherwise.

### GetCheckSshSudoOk

`func (o *Discovery) GetCheckSshSudoOk() (*bool, bool)`

GetCheckSshSudoOk returns a tuple with the CheckSshSudo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCheckSshSudo

`func (o *Discovery) SetCheckSshSudo(v bool)`

SetCheckSshSudo sets CheckSshSudo field to given value.

### HasCheckSshSudo

`func (o *Discovery) HasCheckSshSudo() bool`

HasCheckSshSudo returns a boolean if a field has been set.

### GetNodes

`func (o *Discovery) GetNodes() []DiscoveryNodesInner`

GetNodes returns the Nodes field if non-nil, zero value otherwise.

### GetNodesOk

`func (o *Discovery) GetNodesOk() (*[]DiscoveryNodesInner, bool)`

GetNodesOk returns a tuple with the Nodes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNodes

`func (o *Discovery) SetNodes(v []DiscoveryNodesInner)`

SetNodes sets Nodes field to given value.

### HasNodes

`func (o *Discovery) HasNodes() bool`

HasNodes returns a boolean if a field has been set.

### GetJob

`func (o *Discovery) GetJob() DiscoveryJob`

GetJob returns the Job field if non-nil, zero value otherwise.

### GetJobOk

`func (o *Discovery) GetJobOk() (*DiscoveryJob, bool)`

GetJobOk returns a tuple with the Job field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetJob

`func (o *Discovery) SetJob(v DiscoveryJob)`

SetJob sets Job field to given value.

### HasJob

`func (o *Discovery) HasJob() bool`

HasJob returns a boolean if a field has been set.

### GetSshCredentials

`func (o *Discovery) GetSshCredentials() DiscoverySshCredentials`

GetSshCredentials returns the SshCredentials field if non-nil, zero value otherwise.

### GetSshCredentialsOk

`func (o *Discovery) GetSshCredentialsOk() (*DiscoverySshCredentials, bool)`

GetSshCredentialsOk returns a tuple with the SshCredentials field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSshCredentials

`func (o *Discovery) SetSshCredentials(v DiscoverySshCredentials)`

SetSshCredentials sets SshCredentials field to given value.

### HasSshCredentials

`func (o *Discovery) HasSshCredentials() bool`

HasSshCredentials returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


