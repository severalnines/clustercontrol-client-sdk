# JobsJob

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ClassName** | Pointer to **string** |  | [optional] 
**JobSpec** | Pointer to [**JobsJobJobSpec**](JobsJobJobSpec.md) |  | [optional] 
**Recurrence** | Pointer to **string** | e.g. \&quot;2 * * * *\&quot; | [optional] 
**Tags** | Pointer to **[]string** |  | [optional] 
**Title** | Pointer to **string** |  | [optional] 
**Status** | Pointer to **string** |  | [optional] 

## Methods

### NewJobsJob

`func NewJobsJob() *JobsJob`

NewJobsJob instantiates a new JobsJob object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewJobsJobWithDefaults

`func NewJobsJobWithDefaults() *JobsJob`

NewJobsJobWithDefaults instantiates a new JobsJob object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetClassName

`func (o *JobsJob) GetClassName() string`

GetClassName returns the ClassName field if non-nil, zero value otherwise.

### GetClassNameOk

`func (o *JobsJob) GetClassNameOk() (*string, bool)`

GetClassNameOk returns a tuple with the ClassName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClassName

`func (o *JobsJob) SetClassName(v string)`

SetClassName sets ClassName field to given value.

### HasClassName

`func (o *JobsJob) HasClassName() bool`

HasClassName returns a boolean if a field has been set.

### GetJobSpec

`func (o *JobsJob) GetJobSpec() JobsJobJobSpec`

GetJobSpec returns the JobSpec field if non-nil, zero value otherwise.

### GetJobSpecOk

`func (o *JobsJob) GetJobSpecOk() (*JobsJobJobSpec, bool)`

GetJobSpecOk returns a tuple with the JobSpec field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetJobSpec

`func (o *JobsJob) SetJobSpec(v JobsJobJobSpec)`

SetJobSpec sets JobSpec field to given value.

### HasJobSpec

`func (o *JobsJob) HasJobSpec() bool`

HasJobSpec returns a boolean if a field has been set.

### GetRecurrence

`func (o *JobsJob) GetRecurrence() string`

GetRecurrence returns the Recurrence field if non-nil, zero value otherwise.

### GetRecurrenceOk

`func (o *JobsJob) GetRecurrenceOk() (*string, bool)`

GetRecurrenceOk returns a tuple with the Recurrence field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecurrence

`func (o *JobsJob) SetRecurrence(v string)`

SetRecurrence sets Recurrence field to given value.

### HasRecurrence

`func (o *JobsJob) HasRecurrence() bool`

HasRecurrence returns a boolean if a field has been set.

### GetTags

`func (o *JobsJob) GetTags() []string`

GetTags returns the Tags field if non-nil, zero value otherwise.

### GetTagsOk

`func (o *JobsJob) GetTagsOk() (*[]string, bool)`

GetTagsOk returns a tuple with the Tags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTags

`func (o *JobsJob) SetTags(v []string)`

SetTags sets Tags field to given value.

### HasTags

`func (o *JobsJob) HasTags() bool`

HasTags returns a boolean if a field has been set.

### GetTitle

`func (o *JobsJob) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *JobsJob) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *JobsJob) SetTitle(v string)`

SetTitle sets Title field to given value.

### HasTitle

`func (o *JobsJob) HasTitle() bool`

HasTitle returns a boolean if a field has been set.

### GetStatus

`func (o *JobsJob) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *JobsJob) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *JobsJob) SetStatus(v string)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *JobsJob) HasStatus() bool`

HasStatus returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


