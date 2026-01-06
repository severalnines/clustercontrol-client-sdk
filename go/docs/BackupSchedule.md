# BackupSchedule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ClassName** | Pointer to **string** |  | [optional] 
**Enabled** | Pointer to **bool** |  | [optional] 
**Schedule** | Pointer to **string** |  | [optional] 
**ScheduleId** | Pointer to **int32** |  | [optional] 
**Job** | Pointer to [**BackupScheduleJob**](BackupScheduleJob.md) |  | [optional] 

## Methods

### NewBackupSchedule

`func NewBackupSchedule() *BackupSchedule`

NewBackupSchedule instantiates a new BackupSchedule object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBackupScheduleWithDefaults

`func NewBackupScheduleWithDefaults() *BackupSchedule`

NewBackupScheduleWithDefaults instantiates a new BackupSchedule object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetClassName

`func (o *BackupSchedule) GetClassName() string`

GetClassName returns the ClassName field if non-nil, zero value otherwise.

### GetClassNameOk

`func (o *BackupSchedule) GetClassNameOk() (*string, bool)`

GetClassNameOk returns a tuple with the ClassName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClassName

`func (o *BackupSchedule) SetClassName(v string)`

SetClassName sets ClassName field to given value.

### HasClassName

`func (o *BackupSchedule) HasClassName() bool`

HasClassName returns a boolean if a field has been set.

### GetEnabled

`func (o *BackupSchedule) GetEnabled() bool`

GetEnabled returns the Enabled field if non-nil, zero value otherwise.

### GetEnabledOk

`func (o *BackupSchedule) GetEnabledOk() (*bool, bool)`

GetEnabledOk returns a tuple with the Enabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnabled

`func (o *BackupSchedule) SetEnabled(v bool)`

SetEnabled sets Enabled field to given value.

### HasEnabled

`func (o *BackupSchedule) HasEnabled() bool`

HasEnabled returns a boolean if a field has been set.

### GetSchedule

`func (o *BackupSchedule) GetSchedule() string`

GetSchedule returns the Schedule field if non-nil, zero value otherwise.

### GetScheduleOk

`func (o *BackupSchedule) GetScheduleOk() (*string, bool)`

GetScheduleOk returns a tuple with the Schedule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSchedule

`func (o *BackupSchedule) SetSchedule(v string)`

SetSchedule sets Schedule field to given value.

### HasSchedule

`func (o *BackupSchedule) HasSchedule() bool`

HasSchedule returns a boolean if a field has been set.

### GetScheduleId

`func (o *BackupSchedule) GetScheduleId() int32`

GetScheduleId returns the ScheduleId field if non-nil, zero value otherwise.

### GetScheduleIdOk

`func (o *BackupSchedule) GetScheduleIdOk() (*int32, bool)`

GetScheduleIdOk returns a tuple with the ScheduleId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScheduleId

`func (o *BackupSchedule) SetScheduleId(v int32)`

SetScheduleId sets ScheduleId field to given value.

### HasScheduleId

`func (o *BackupSchedule) HasScheduleId() bool`

HasScheduleId returns a boolean if a field has been set.

### GetJob

`func (o *BackupSchedule) GetJob() BackupScheduleJob`

GetJob returns the Job field if non-nil, zero value otherwise.

### GetJobOk

`func (o *BackupSchedule) GetJobOk() (*BackupScheduleJob, bool)`

GetJobOk returns a tuple with the Job field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetJob

`func (o *BackupSchedule) SetJob(v BackupScheduleJob)`

SetJob sets Job field to given value.

### HasJob

`func (o *BackupSchedule) HasJob() bool`

HasJob returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


