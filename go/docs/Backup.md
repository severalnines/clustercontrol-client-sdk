# Backup

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Operation** | **string** |  | 
**ClusterId** | Pointer to **int32** |  | [optional] 
**Ascending** | Pointer to **bool** |  | [optional] 
**Order** | Pointer to **string** |  | [optional] 
**BackupRecordVersion** | Pointer to **int32** |  | [optional] 
**Limit** | Pointer to **int32** |  | [optional] 
**Offset** | Pointer to **int32** |  | [optional] 
**Schedule** | Pointer to [**BackupSchedule**](BackupSchedule.md) |  | [optional] 
**BackupRecord** | Pointer to [**BackupBackupRecord**](BackupBackupRecord.md) |  | [optional] 

## Methods

### NewBackup

`func NewBackup(operation string, ) *Backup`

NewBackup instantiates a new Backup object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBackupWithDefaults

`func NewBackupWithDefaults() *Backup`

NewBackupWithDefaults instantiates a new Backup object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOperation

`func (o *Backup) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *Backup) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *Backup) SetOperation(v string)`

SetOperation sets Operation field to given value.


### GetClusterId

`func (o *Backup) GetClusterId() int32`

GetClusterId returns the ClusterId field if non-nil, zero value otherwise.

### GetClusterIdOk

`func (o *Backup) GetClusterIdOk() (*int32, bool)`

GetClusterIdOk returns a tuple with the ClusterId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClusterId

`func (o *Backup) SetClusterId(v int32)`

SetClusterId sets ClusterId field to given value.

### HasClusterId

`func (o *Backup) HasClusterId() bool`

HasClusterId returns a boolean if a field has been set.

### GetAscending

`func (o *Backup) GetAscending() bool`

GetAscending returns the Ascending field if non-nil, zero value otherwise.

### GetAscendingOk

`func (o *Backup) GetAscendingOk() (*bool, bool)`

GetAscendingOk returns a tuple with the Ascending field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAscending

`func (o *Backup) SetAscending(v bool)`

SetAscending sets Ascending field to given value.

### HasAscending

`func (o *Backup) HasAscending() bool`

HasAscending returns a boolean if a field has been set.

### GetOrder

`func (o *Backup) GetOrder() string`

GetOrder returns the Order field if non-nil, zero value otherwise.

### GetOrderOk

`func (o *Backup) GetOrderOk() (*string, bool)`

GetOrderOk returns a tuple with the Order field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrder

`func (o *Backup) SetOrder(v string)`

SetOrder sets Order field to given value.

### HasOrder

`func (o *Backup) HasOrder() bool`

HasOrder returns a boolean if a field has been set.

### GetBackupRecordVersion

`func (o *Backup) GetBackupRecordVersion() int32`

GetBackupRecordVersion returns the BackupRecordVersion field if non-nil, zero value otherwise.

### GetBackupRecordVersionOk

`func (o *Backup) GetBackupRecordVersionOk() (*int32, bool)`

GetBackupRecordVersionOk returns a tuple with the BackupRecordVersion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBackupRecordVersion

`func (o *Backup) SetBackupRecordVersion(v int32)`

SetBackupRecordVersion sets BackupRecordVersion field to given value.

### HasBackupRecordVersion

`func (o *Backup) HasBackupRecordVersion() bool`

HasBackupRecordVersion returns a boolean if a field has been set.

### GetLimit

`func (o *Backup) GetLimit() int32`

GetLimit returns the Limit field if non-nil, zero value otherwise.

### GetLimitOk

`func (o *Backup) GetLimitOk() (*int32, bool)`

GetLimitOk returns a tuple with the Limit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimit

`func (o *Backup) SetLimit(v int32)`

SetLimit sets Limit field to given value.

### HasLimit

`func (o *Backup) HasLimit() bool`

HasLimit returns a boolean if a field has been set.

### GetOffset

`func (o *Backup) GetOffset() int32`

GetOffset returns the Offset field if non-nil, zero value otherwise.

### GetOffsetOk

`func (o *Backup) GetOffsetOk() (*int32, bool)`

GetOffsetOk returns a tuple with the Offset field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffset

`func (o *Backup) SetOffset(v int32)`

SetOffset sets Offset field to given value.

### HasOffset

`func (o *Backup) HasOffset() bool`

HasOffset returns a boolean if a field has been set.

### GetSchedule

`func (o *Backup) GetSchedule() BackupSchedule`

GetSchedule returns the Schedule field if non-nil, zero value otherwise.

### GetScheduleOk

`func (o *Backup) GetScheduleOk() (*BackupSchedule, bool)`

GetScheduleOk returns a tuple with the Schedule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSchedule

`func (o *Backup) SetSchedule(v BackupSchedule)`

SetSchedule sets Schedule field to given value.

### HasSchedule

`func (o *Backup) HasSchedule() bool`

HasSchedule returns a boolean if a field has been set.

### GetBackupRecord

`func (o *Backup) GetBackupRecord() BackupBackupRecord`

GetBackupRecord returns the BackupRecord field if non-nil, zero value otherwise.

### GetBackupRecordOk

`func (o *Backup) GetBackupRecordOk() (*BackupBackupRecord, bool)`

GetBackupRecordOk returns a tuple with the BackupRecord field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBackupRecord

`func (o *Backup) SetBackupRecord(v BackupBackupRecord)`

SetBackupRecord sets BackupRecord field to given value.

### HasBackupRecord

`func (o *Backup) HasBackupRecord() bool`

HasBackupRecord returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


