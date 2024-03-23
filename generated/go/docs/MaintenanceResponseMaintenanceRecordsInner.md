# MaintenanceResponseMaintenanceRecordsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ClusterId** | Pointer to **int32** |  | [optional] 
**IsActive** | Pointer to **bool** |  | [optional] 
**Cluster** | Pointer to [**BackupResponseBackupRecordsInnerCluster**](BackupResponseBackupRecordsInnerCluster.md) |  | [optional] 

## Methods

### NewMaintenanceResponseMaintenanceRecordsInner

`func NewMaintenanceResponseMaintenanceRecordsInner() *MaintenanceResponseMaintenanceRecordsInner`

NewMaintenanceResponseMaintenanceRecordsInner instantiates a new MaintenanceResponseMaintenanceRecordsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMaintenanceResponseMaintenanceRecordsInnerWithDefaults

`func NewMaintenanceResponseMaintenanceRecordsInnerWithDefaults() *MaintenanceResponseMaintenanceRecordsInner`

NewMaintenanceResponseMaintenanceRecordsInnerWithDefaults instantiates a new MaintenanceResponseMaintenanceRecordsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetClusterId

`func (o *MaintenanceResponseMaintenanceRecordsInner) GetClusterId() int32`

GetClusterId returns the ClusterId field if non-nil, zero value otherwise.

### GetClusterIdOk

`func (o *MaintenanceResponseMaintenanceRecordsInner) GetClusterIdOk() (*int32, bool)`

GetClusterIdOk returns a tuple with the ClusterId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClusterId

`func (o *MaintenanceResponseMaintenanceRecordsInner) SetClusterId(v int32)`

SetClusterId sets ClusterId field to given value.

### HasClusterId

`func (o *MaintenanceResponseMaintenanceRecordsInner) HasClusterId() bool`

HasClusterId returns a boolean if a field has been set.

### GetIsActive

`func (o *MaintenanceResponseMaintenanceRecordsInner) GetIsActive() bool`

GetIsActive returns the IsActive field if non-nil, zero value otherwise.

### GetIsActiveOk

`func (o *MaintenanceResponseMaintenanceRecordsInner) GetIsActiveOk() (*bool, bool)`

GetIsActiveOk returns a tuple with the IsActive field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsActive

`func (o *MaintenanceResponseMaintenanceRecordsInner) SetIsActive(v bool)`

SetIsActive sets IsActive field to given value.

### HasIsActive

`func (o *MaintenanceResponseMaintenanceRecordsInner) HasIsActive() bool`

HasIsActive returns a boolean if a field has been set.

### GetCluster

`func (o *MaintenanceResponseMaintenanceRecordsInner) GetCluster() BackupResponseBackupRecordsInnerCluster`

GetCluster returns the Cluster field if non-nil, zero value otherwise.

### GetClusterOk

`func (o *MaintenanceResponseMaintenanceRecordsInner) GetClusterOk() (*BackupResponseBackupRecordsInnerCluster, bool)`

GetClusterOk returns a tuple with the Cluster field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCluster

`func (o *MaintenanceResponseMaintenanceRecordsInner) SetCluster(v BackupResponseBackupRecordsInnerCluster)`

SetCluster sets Cluster field to given value.

### HasCluster

`func (o *MaintenanceResponseMaintenanceRecordsInner) HasCluster() bool`

HasCluster returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


