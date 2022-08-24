# Jobs

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Operation** | **string** |  | 
**ClusterId** | Pointer to **int32** |  | [optional] 
**JobId** | Pointer to **int32** |  | [optional] 
**Signal** | Pointer to **int32** |  | [optional] 
**Ascending** | Pointer to **bool** |  | [optional] 
**Limit** | Pointer to **int32** |  | [optional] 
**Offset** | Pointer to **int32** |  | [optional] 
**LogLevel** | Pointer to **string** |  | [optional] 
**Job** | Pointer to [**JobsJob**](JobsJob.md) |  | [optional] 

## Methods

### NewJobs

`func NewJobs(operation string, ) *Jobs`

NewJobs instantiates a new Jobs object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewJobsWithDefaults

`func NewJobsWithDefaults() *Jobs`

NewJobsWithDefaults instantiates a new Jobs object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOperation

`func (o *Jobs) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *Jobs) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *Jobs) SetOperation(v string)`

SetOperation sets Operation field to given value.


### GetClusterId

`func (o *Jobs) GetClusterId() int32`

GetClusterId returns the ClusterId field if non-nil, zero value otherwise.

### GetClusterIdOk

`func (o *Jobs) GetClusterIdOk() (*int32, bool)`

GetClusterIdOk returns a tuple with the ClusterId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClusterId

`func (o *Jobs) SetClusterId(v int32)`

SetClusterId sets ClusterId field to given value.

### HasClusterId

`func (o *Jobs) HasClusterId() bool`

HasClusterId returns a boolean if a field has been set.

### GetJobId

`func (o *Jobs) GetJobId() int32`

GetJobId returns the JobId field if non-nil, zero value otherwise.

### GetJobIdOk

`func (o *Jobs) GetJobIdOk() (*int32, bool)`

GetJobIdOk returns a tuple with the JobId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetJobId

`func (o *Jobs) SetJobId(v int32)`

SetJobId sets JobId field to given value.

### HasJobId

`func (o *Jobs) HasJobId() bool`

HasJobId returns a boolean if a field has been set.

### GetSignal

`func (o *Jobs) GetSignal() int32`

GetSignal returns the Signal field if non-nil, zero value otherwise.

### GetSignalOk

`func (o *Jobs) GetSignalOk() (*int32, bool)`

GetSignalOk returns a tuple with the Signal field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSignal

`func (o *Jobs) SetSignal(v int32)`

SetSignal sets Signal field to given value.

### HasSignal

`func (o *Jobs) HasSignal() bool`

HasSignal returns a boolean if a field has been set.

### GetAscending

`func (o *Jobs) GetAscending() bool`

GetAscending returns the Ascending field if non-nil, zero value otherwise.

### GetAscendingOk

`func (o *Jobs) GetAscendingOk() (*bool, bool)`

GetAscendingOk returns a tuple with the Ascending field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAscending

`func (o *Jobs) SetAscending(v bool)`

SetAscending sets Ascending field to given value.

### HasAscending

`func (o *Jobs) HasAscending() bool`

HasAscending returns a boolean if a field has been set.

### GetLimit

`func (o *Jobs) GetLimit() int32`

GetLimit returns the Limit field if non-nil, zero value otherwise.

### GetLimitOk

`func (o *Jobs) GetLimitOk() (*int32, bool)`

GetLimitOk returns a tuple with the Limit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimit

`func (o *Jobs) SetLimit(v int32)`

SetLimit sets Limit field to given value.

### HasLimit

`func (o *Jobs) HasLimit() bool`

HasLimit returns a boolean if a field has been set.

### GetOffset

`func (o *Jobs) GetOffset() int32`

GetOffset returns the Offset field if non-nil, zero value otherwise.

### GetOffsetOk

`func (o *Jobs) GetOffsetOk() (*int32, bool)`

GetOffsetOk returns a tuple with the Offset field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffset

`func (o *Jobs) SetOffset(v int32)`

SetOffset sets Offset field to given value.

### HasOffset

`func (o *Jobs) HasOffset() bool`

HasOffset returns a boolean if a field has been set.

### GetLogLevel

`func (o *Jobs) GetLogLevel() string`

GetLogLevel returns the LogLevel field if non-nil, zero value otherwise.

### GetLogLevelOk

`func (o *Jobs) GetLogLevelOk() (*string, bool)`

GetLogLevelOk returns a tuple with the LogLevel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLogLevel

`func (o *Jobs) SetLogLevel(v string)`

SetLogLevel sets LogLevel field to given value.

### HasLogLevel

`func (o *Jobs) HasLogLevel() bool`

HasLogLevel returns a boolean if a field has been set.

### GetJob

`func (o *Jobs) GetJob() JobsJob`

GetJob returns the Job field if non-nil, zero value otherwise.

### GetJobOk

`func (o *Jobs) GetJobOk() (*JobsJob, bool)`

GetJobOk returns a tuple with the Job field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetJob

`func (o *Jobs) SetJob(v JobsJob)`

SetJob sets Job field to given value.

### HasJob

`func (o *Jobs) HasJob() bool`

HasJob returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


