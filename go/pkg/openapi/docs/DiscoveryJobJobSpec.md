# DiscoveryJobJobSpec

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Command** | Pointer to **string** |  | [optional] 
**JobData** | Pointer to [**DiscoveryJobJobSpecJobData**](DiscoveryJobJobSpecJobData.md) |  | [optional] 

## Methods

### NewDiscoveryJobJobSpec

`func NewDiscoveryJobJobSpec() *DiscoveryJobJobSpec`

NewDiscoveryJobJobSpec instantiates a new DiscoveryJobJobSpec object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDiscoveryJobJobSpecWithDefaults

`func NewDiscoveryJobJobSpecWithDefaults() *DiscoveryJobJobSpec`

NewDiscoveryJobJobSpecWithDefaults instantiates a new DiscoveryJobJobSpec object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCommand

`func (o *DiscoveryJobJobSpec) GetCommand() string`

GetCommand returns the Command field if non-nil, zero value otherwise.

### GetCommandOk

`func (o *DiscoveryJobJobSpec) GetCommandOk() (*string, bool)`

GetCommandOk returns a tuple with the Command field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCommand

`func (o *DiscoveryJobJobSpec) SetCommand(v string)`

SetCommand sets Command field to given value.

### HasCommand

`func (o *DiscoveryJobJobSpec) HasCommand() bool`

HasCommand returns a boolean if a field has been set.

### GetJobData

`func (o *DiscoveryJobJobSpec) GetJobData() DiscoveryJobJobSpecJobData`

GetJobData returns the JobData field if non-nil, zero value otherwise.

### GetJobDataOk

`func (o *DiscoveryJobJobSpec) GetJobDataOk() (*DiscoveryJobJobSpecJobData, bool)`

GetJobDataOk returns a tuple with the JobData field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetJobData

`func (o *DiscoveryJobJobSpec) SetJobData(v DiscoveryJobJobSpecJobData)`

SetJobData sets JobData field to given value.

### HasJobData

`func (o *DiscoveryJobJobSpec) HasJobData() bool`

HasJobData returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


