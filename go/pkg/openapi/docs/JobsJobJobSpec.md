# JobsJobJobSpec

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Command** | Pointer to **string** |  | [optional] 
**Id** | Pointer to **int32** |  | [optional] 
**JobData** | Pointer to [**JobsJobJobSpecJobData**](JobsJobJobSpecJobData.md) |  | [optional] 

## Methods

### NewJobsJobJobSpec

`func NewJobsJobJobSpec() *JobsJobJobSpec`

NewJobsJobJobSpec instantiates a new JobsJobJobSpec object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewJobsJobJobSpecWithDefaults

`func NewJobsJobJobSpecWithDefaults() *JobsJobJobSpec`

NewJobsJobJobSpecWithDefaults instantiates a new JobsJobJobSpec object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCommand

`func (o *JobsJobJobSpec) GetCommand() string`

GetCommand returns the Command field if non-nil, zero value otherwise.

### GetCommandOk

`func (o *JobsJobJobSpec) GetCommandOk() (*string, bool)`

GetCommandOk returns a tuple with the Command field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCommand

`func (o *JobsJobJobSpec) SetCommand(v string)`

SetCommand sets Command field to given value.

### HasCommand

`func (o *JobsJobJobSpec) HasCommand() bool`

HasCommand returns a boolean if a field has been set.

### GetId

`func (o *JobsJobJobSpec) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *JobsJobJobSpec) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *JobsJobJobSpec) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *JobsJobJobSpec) HasId() bool`

HasId returns a boolean if a field has been set.

### GetJobData

`func (o *JobsJobJobSpec) GetJobData() JobsJobJobSpecJobData`

GetJobData returns the JobData field if non-nil, zero value otherwise.

### GetJobDataOk

`func (o *JobsJobJobSpec) GetJobDataOk() (*JobsJobJobSpecJobData, bool)`

GetJobDataOk returns a tuple with the JobData field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetJobData

`func (o *JobsJobJobSpec) SetJobData(v JobsJobJobSpecJobData)`

SetJobData sets JobData field to given value.

### HasJobData

`func (o *JobsJobJobSpec) HasJobData() bool`

HasJobData returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


