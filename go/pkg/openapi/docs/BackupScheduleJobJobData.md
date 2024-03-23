# BackupScheduleJobJobData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | Pointer to **string** |  | [optional] 
**BackupFailover** | Pointer to **bool** |  | [optional] 
**BackupFailoverHost** | Pointer to **string** |  | [optional] 
**BackupMethod** | Pointer to **string** |  | [optional] 
**BackupRetention** | Pointer to **int32** |  | [optional] 
**Backupdir** | Pointer to **string** |  | [optional] 
**Backupsubdir** | Pointer to **string** |  | [optional] 
**CcStorage** | Pointer to **string** |  | [optional] 
**Compression** | Pointer to **bool** |  | [optional] 
**CompresionLevel** | Pointer to **int32** |  | [optional] 
**EncryptBackup** | Pointer to **bool** |  | [optional] 
**Hostname** | Pointer to **string** |  | [optional] 
**Port** | Pointer to **int32** |  | [optional] 
**VerifyBackupDelay** | Pointer to **int32** |  | [optional] 
**VerifyBackup** | Pointer to [**BackupScheduleJobJobDataVerifyBackup**](BackupScheduleJobJobDataVerifyBackup.md) |  | [optional] 

## Methods

### NewBackupScheduleJobJobData

`func NewBackupScheduleJobJobData() *BackupScheduleJobJobData`

NewBackupScheduleJobJobData instantiates a new BackupScheduleJobJobData object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBackupScheduleJobJobDataWithDefaults

`func NewBackupScheduleJobJobDataWithDefaults() *BackupScheduleJobJobData`

NewBackupScheduleJobJobDataWithDefaults instantiates a new BackupScheduleJobJobData object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDescription

`func (o *BackupScheduleJobJobData) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *BackupScheduleJobJobData) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *BackupScheduleJobJobData) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *BackupScheduleJobJobData) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetBackupFailover

`func (o *BackupScheduleJobJobData) GetBackupFailover() bool`

GetBackupFailover returns the BackupFailover field if non-nil, zero value otherwise.

### GetBackupFailoverOk

`func (o *BackupScheduleJobJobData) GetBackupFailoverOk() (*bool, bool)`

GetBackupFailoverOk returns a tuple with the BackupFailover field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBackupFailover

`func (o *BackupScheduleJobJobData) SetBackupFailover(v bool)`

SetBackupFailover sets BackupFailover field to given value.

### HasBackupFailover

`func (o *BackupScheduleJobJobData) HasBackupFailover() bool`

HasBackupFailover returns a boolean if a field has been set.

### GetBackupFailoverHost

`func (o *BackupScheduleJobJobData) GetBackupFailoverHost() string`

GetBackupFailoverHost returns the BackupFailoverHost field if non-nil, zero value otherwise.

### GetBackupFailoverHostOk

`func (o *BackupScheduleJobJobData) GetBackupFailoverHostOk() (*string, bool)`

GetBackupFailoverHostOk returns a tuple with the BackupFailoverHost field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBackupFailoverHost

`func (o *BackupScheduleJobJobData) SetBackupFailoverHost(v string)`

SetBackupFailoverHost sets BackupFailoverHost field to given value.

### HasBackupFailoverHost

`func (o *BackupScheduleJobJobData) HasBackupFailoverHost() bool`

HasBackupFailoverHost returns a boolean if a field has been set.

### GetBackupMethod

`func (o *BackupScheduleJobJobData) GetBackupMethod() string`

GetBackupMethod returns the BackupMethod field if non-nil, zero value otherwise.

### GetBackupMethodOk

`func (o *BackupScheduleJobJobData) GetBackupMethodOk() (*string, bool)`

GetBackupMethodOk returns a tuple with the BackupMethod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBackupMethod

`func (o *BackupScheduleJobJobData) SetBackupMethod(v string)`

SetBackupMethod sets BackupMethod field to given value.

### HasBackupMethod

`func (o *BackupScheduleJobJobData) HasBackupMethod() bool`

HasBackupMethod returns a boolean if a field has been set.

### GetBackupRetention

`func (o *BackupScheduleJobJobData) GetBackupRetention() int32`

GetBackupRetention returns the BackupRetention field if non-nil, zero value otherwise.

### GetBackupRetentionOk

`func (o *BackupScheduleJobJobData) GetBackupRetentionOk() (*int32, bool)`

GetBackupRetentionOk returns a tuple with the BackupRetention field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBackupRetention

`func (o *BackupScheduleJobJobData) SetBackupRetention(v int32)`

SetBackupRetention sets BackupRetention field to given value.

### HasBackupRetention

`func (o *BackupScheduleJobJobData) HasBackupRetention() bool`

HasBackupRetention returns a boolean if a field has been set.

### GetBackupdir

`func (o *BackupScheduleJobJobData) GetBackupdir() string`

GetBackupdir returns the Backupdir field if non-nil, zero value otherwise.

### GetBackupdirOk

`func (o *BackupScheduleJobJobData) GetBackupdirOk() (*string, bool)`

GetBackupdirOk returns a tuple with the Backupdir field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBackupdir

`func (o *BackupScheduleJobJobData) SetBackupdir(v string)`

SetBackupdir sets Backupdir field to given value.

### HasBackupdir

`func (o *BackupScheduleJobJobData) HasBackupdir() bool`

HasBackupdir returns a boolean if a field has been set.

### GetBackupsubdir

`func (o *BackupScheduleJobJobData) GetBackupsubdir() string`

GetBackupsubdir returns the Backupsubdir field if non-nil, zero value otherwise.

### GetBackupsubdirOk

`func (o *BackupScheduleJobJobData) GetBackupsubdirOk() (*string, bool)`

GetBackupsubdirOk returns a tuple with the Backupsubdir field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBackupsubdir

`func (o *BackupScheduleJobJobData) SetBackupsubdir(v string)`

SetBackupsubdir sets Backupsubdir field to given value.

### HasBackupsubdir

`func (o *BackupScheduleJobJobData) HasBackupsubdir() bool`

HasBackupsubdir returns a boolean if a field has been set.

### GetCcStorage

`func (o *BackupScheduleJobJobData) GetCcStorage() string`

GetCcStorage returns the CcStorage field if non-nil, zero value otherwise.

### GetCcStorageOk

`func (o *BackupScheduleJobJobData) GetCcStorageOk() (*string, bool)`

GetCcStorageOk returns a tuple with the CcStorage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCcStorage

`func (o *BackupScheduleJobJobData) SetCcStorage(v string)`

SetCcStorage sets CcStorage field to given value.

### HasCcStorage

`func (o *BackupScheduleJobJobData) HasCcStorage() bool`

HasCcStorage returns a boolean if a field has been set.

### GetCompression

`func (o *BackupScheduleJobJobData) GetCompression() bool`

GetCompression returns the Compression field if non-nil, zero value otherwise.

### GetCompressionOk

`func (o *BackupScheduleJobJobData) GetCompressionOk() (*bool, bool)`

GetCompressionOk returns a tuple with the Compression field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompression

`func (o *BackupScheduleJobJobData) SetCompression(v bool)`

SetCompression sets Compression field to given value.

### HasCompression

`func (o *BackupScheduleJobJobData) HasCompression() bool`

HasCompression returns a boolean if a field has been set.

### GetCompresionLevel

`func (o *BackupScheduleJobJobData) GetCompresionLevel() int32`

GetCompresionLevel returns the CompresionLevel field if non-nil, zero value otherwise.

### GetCompresionLevelOk

`func (o *BackupScheduleJobJobData) GetCompresionLevelOk() (*int32, bool)`

GetCompresionLevelOk returns a tuple with the CompresionLevel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompresionLevel

`func (o *BackupScheduleJobJobData) SetCompresionLevel(v int32)`

SetCompresionLevel sets CompresionLevel field to given value.

### HasCompresionLevel

`func (o *BackupScheduleJobJobData) HasCompresionLevel() bool`

HasCompresionLevel returns a boolean if a field has been set.

### GetEncryptBackup

`func (o *BackupScheduleJobJobData) GetEncryptBackup() bool`

GetEncryptBackup returns the EncryptBackup field if non-nil, zero value otherwise.

### GetEncryptBackupOk

`func (o *BackupScheduleJobJobData) GetEncryptBackupOk() (*bool, bool)`

GetEncryptBackupOk returns a tuple with the EncryptBackup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEncryptBackup

`func (o *BackupScheduleJobJobData) SetEncryptBackup(v bool)`

SetEncryptBackup sets EncryptBackup field to given value.

### HasEncryptBackup

`func (o *BackupScheduleJobJobData) HasEncryptBackup() bool`

HasEncryptBackup returns a boolean if a field has been set.

### GetHostname

`func (o *BackupScheduleJobJobData) GetHostname() string`

GetHostname returns the Hostname field if non-nil, zero value otherwise.

### GetHostnameOk

`func (o *BackupScheduleJobJobData) GetHostnameOk() (*string, bool)`

GetHostnameOk returns a tuple with the Hostname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHostname

`func (o *BackupScheduleJobJobData) SetHostname(v string)`

SetHostname sets Hostname field to given value.

### HasHostname

`func (o *BackupScheduleJobJobData) HasHostname() bool`

HasHostname returns a boolean if a field has been set.

### GetPort

`func (o *BackupScheduleJobJobData) GetPort() int32`

GetPort returns the Port field if non-nil, zero value otherwise.

### GetPortOk

`func (o *BackupScheduleJobJobData) GetPortOk() (*int32, bool)`

GetPortOk returns a tuple with the Port field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPort

`func (o *BackupScheduleJobJobData) SetPort(v int32)`

SetPort sets Port field to given value.

### HasPort

`func (o *BackupScheduleJobJobData) HasPort() bool`

HasPort returns a boolean if a field has been set.

### GetVerifyBackupDelay

`func (o *BackupScheduleJobJobData) GetVerifyBackupDelay() int32`

GetVerifyBackupDelay returns the VerifyBackupDelay field if non-nil, zero value otherwise.

### GetVerifyBackupDelayOk

`func (o *BackupScheduleJobJobData) GetVerifyBackupDelayOk() (*int32, bool)`

GetVerifyBackupDelayOk returns a tuple with the VerifyBackupDelay field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVerifyBackupDelay

`func (o *BackupScheduleJobJobData) SetVerifyBackupDelay(v int32)`

SetVerifyBackupDelay sets VerifyBackupDelay field to given value.

### HasVerifyBackupDelay

`func (o *BackupScheduleJobJobData) HasVerifyBackupDelay() bool`

HasVerifyBackupDelay returns a boolean if a field has been set.

### GetVerifyBackup

`func (o *BackupScheduleJobJobData) GetVerifyBackup() BackupScheduleJobJobDataVerifyBackup`

GetVerifyBackup returns the VerifyBackup field if non-nil, zero value otherwise.

### GetVerifyBackupOk

`func (o *BackupScheduleJobJobData) GetVerifyBackupOk() (*BackupScheduleJobJobDataVerifyBackup, bool)`

GetVerifyBackupOk returns a tuple with the VerifyBackup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVerifyBackup

`func (o *BackupScheduleJobJobData) SetVerifyBackup(v BackupScheduleJobJobDataVerifyBackup)`

SetVerifyBackup sets VerifyBackup field to given value.

### HasVerifyBackup

`func (o *BackupScheduleJobJobData) HasVerifyBackup() bool`

HasVerifyBackup returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


