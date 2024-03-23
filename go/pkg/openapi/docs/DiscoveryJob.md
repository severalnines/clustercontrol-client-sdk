# DiscoveryJob

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ClassName** | Pointer to **string** |  | [optional] 
**JobSpec** | Pointer to [**DiscoveryJobJobSpec**](DiscoveryJobJobSpec.md) |  | [optional] 

## Methods

### NewDiscoveryJob

`func NewDiscoveryJob() *DiscoveryJob`

NewDiscoveryJob instantiates a new DiscoveryJob object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDiscoveryJobWithDefaults

`func NewDiscoveryJobWithDefaults() *DiscoveryJob`

NewDiscoveryJobWithDefaults instantiates a new DiscoveryJob object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetClassName

`func (o *DiscoveryJob) GetClassName() string`

GetClassName returns the ClassName field if non-nil, zero value otherwise.

### GetClassNameOk

`func (o *DiscoveryJob) GetClassNameOk() (*string, bool)`

GetClassNameOk returns a tuple with the ClassName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClassName

`func (o *DiscoveryJob) SetClassName(v string)`

SetClassName sets ClassName field to given value.

### HasClassName

`func (o *DiscoveryJob) HasClassName() bool`

HasClassName returns a boolean if a field has been set.

### GetJobSpec

`func (o *DiscoveryJob) GetJobSpec() DiscoveryJobJobSpec`

GetJobSpec returns the JobSpec field if non-nil, zero value otherwise.

### GetJobSpecOk

`func (o *DiscoveryJob) GetJobSpecOk() (*DiscoveryJobJobSpec, bool)`

GetJobSpecOk returns a tuple with the JobSpec field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetJobSpec

`func (o *DiscoveryJob) SetJobSpec(v DiscoveryJobJobSpec)`

SetJobSpec sets JobSpec field to given value.

### HasJobSpec

`func (o *DiscoveryJob) HasJobSpec() bool`

HasJobSpec returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


