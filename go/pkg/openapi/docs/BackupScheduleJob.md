# BackupScheduleJob

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Command** | Pointer to **string** |  | [optional] 
**JobData** | Pointer to [**BackupScheduleJobJobData**](BackupScheduleJobJobData.md) |  | [optional] 

## Methods

### NewBackupScheduleJob

`func NewBackupScheduleJob() *BackupScheduleJob`

NewBackupScheduleJob instantiates a new BackupScheduleJob object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBackupScheduleJobWithDefaults

`func NewBackupScheduleJobWithDefaults() *BackupScheduleJob`

NewBackupScheduleJobWithDefaults instantiates a new BackupScheduleJob object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCommand

`func (o *BackupScheduleJob) GetCommand() string`

GetCommand returns the Command field if non-nil, zero value otherwise.

### GetCommandOk

`func (o *BackupScheduleJob) GetCommandOk() (*string, bool)`

GetCommandOk returns a tuple with the Command field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCommand

`func (o *BackupScheduleJob) SetCommand(v string)`

SetCommand sets Command field to given value.

### HasCommand

`func (o *BackupScheduleJob) HasCommand() bool`

HasCommand returns a boolean if a field has been set.

### GetJobData

`func (o *BackupScheduleJob) GetJobData() BackupScheduleJobJobData`

GetJobData returns the JobData field if non-nil, zero value otherwise.

### GetJobDataOk

`func (o *BackupScheduleJob) GetJobDataOk() (*BackupScheduleJobJobData, bool)`

GetJobDataOk returns a tuple with the JobData field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetJobData

`func (o *BackupScheduleJob) SetJobData(v BackupScheduleJobJobData)`

SetJobData sets JobData field to given value.

### HasJobData

`func (o *BackupScheduleJob) HasJobData() bool`

HasJobData returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


