# BackupResponseBackupRecordsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Version** | Pointer to **int32** |  | [optional] 
**CloudLocations** | Pointer to [**[]BackupResponseBackupRecordsInnerCloudLocationsInner**](BackupResponseBackupRecordsInnerCloudLocationsInner.md) |  | [optional] 
**HostLocations** | Pointer to [**[]BackupResponseBackupRecordsInnerHostLocationsInner**](BackupResponseBackupRecordsInnerHostLocationsInner.md) |  | [optional] 
**Metadata** | Pointer to [**BackupResponseBackupRecordsInnerMetadata**](BackupResponseBackupRecordsInnerMetadata.md) |  | [optional] 
**Cluster** | Pointer to [**BackupResponseBackupRecordsInnerCluster**](BackupResponseBackupRecordsInnerCluster.md) |  | [optional] 

## Methods

### NewBackupResponseBackupRecordsInner

`func NewBackupResponseBackupRecordsInner() *BackupResponseBackupRecordsInner`

NewBackupResponseBackupRecordsInner instantiates a new BackupResponseBackupRecordsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBackupResponseBackupRecordsInnerWithDefaults

`func NewBackupResponseBackupRecordsInnerWithDefaults() *BackupResponseBackupRecordsInner`

NewBackupResponseBackupRecordsInnerWithDefaults instantiates a new BackupResponseBackupRecordsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetVersion

`func (o *BackupResponseBackupRecordsInner) GetVersion() int32`

GetVersion returns the Version field if non-nil, zero value otherwise.

### GetVersionOk

`func (o *BackupResponseBackupRecordsInner) GetVersionOk() (*int32, bool)`

GetVersionOk returns a tuple with the Version field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersion

`func (o *BackupResponseBackupRecordsInner) SetVersion(v int32)`

SetVersion sets Version field to given value.

### HasVersion

`func (o *BackupResponseBackupRecordsInner) HasVersion() bool`

HasVersion returns a boolean if a field has been set.

### GetCloudLocations

`func (o *BackupResponseBackupRecordsInner) GetCloudLocations() []BackupResponseBackupRecordsInnerCloudLocationsInner`

GetCloudLocations returns the CloudLocations field if non-nil, zero value otherwise.

### GetCloudLocationsOk

`func (o *BackupResponseBackupRecordsInner) GetCloudLocationsOk() (*[]BackupResponseBackupRecordsInnerCloudLocationsInner, bool)`

GetCloudLocationsOk returns a tuple with the CloudLocations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCloudLocations

`func (o *BackupResponseBackupRecordsInner) SetCloudLocations(v []BackupResponseBackupRecordsInnerCloudLocationsInner)`

SetCloudLocations sets CloudLocations field to given value.

### HasCloudLocations

`func (o *BackupResponseBackupRecordsInner) HasCloudLocations() bool`

HasCloudLocations returns a boolean if a field has been set.

### GetHostLocations

`func (o *BackupResponseBackupRecordsInner) GetHostLocations() []BackupResponseBackupRecordsInnerHostLocationsInner`

GetHostLocations returns the HostLocations field if non-nil, zero value otherwise.

### GetHostLocationsOk

`func (o *BackupResponseBackupRecordsInner) GetHostLocationsOk() (*[]BackupResponseBackupRecordsInnerHostLocationsInner, bool)`

GetHostLocationsOk returns a tuple with the HostLocations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHostLocations

`func (o *BackupResponseBackupRecordsInner) SetHostLocations(v []BackupResponseBackupRecordsInnerHostLocationsInner)`

SetHostLocations sets HostLocations field to given value.

### HasHostLocations

`func (o *BackupResponseBackupRecordsInner) HasHostLocations() bool`

HasHostLocations returns a boolean if a field has been set.

### GetMetadata

`func (o *BackupResponseBackupRecordsInner) GetMetadata() BackupResponseBackupRecordsInnerMetadata`

GetMetadata returns the Metadata field if non-nil, zero value otherwise.

### GetMetadataOk

`func (o *BackupResponseBackupRecordsInner) GetMetadataOk() (*BackupResponseBackupRecordsInnerMetadata, bool)`

GetMetadataOk returns a tuple with the Metadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetadata

`func (o *BackupResponseBackupRecordsInner) SetMetadata(v BackupResponseBackupRecordsInnerMetadata)`

SetMetadata sets Metadata field to given value.

### HasMetadata

`func (o *BackupResponseBackupRecordsInner) HasMetadata() bool`

HasMetadata returns a boolean if a field has been set.

### GetCluster

`func (o *BackupResponseBackupRecordsInner) GetCluster() BackupResponseBackupRecordsInnerCluster`

GetCluster returns the Cluster field if non-nil, zero value otherwise.

### GetClusterOk

`func (o *BackupResponseBackupRecordsInner) GetClusterOk() (*BackupResponseBackupRecordsInnerCluster, bool)`

GetClusterOk returns a tuple with the Cluster field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCluster

`func (o *BackupResponseBackupRecordsInner) SetCluster(v BackupResponseBackupRecordsInnerCluster)`

SetCluster sets Cluster field to given value.

### HasCluster

`func (o *BackupResponseBackupRecordsInner) HasCluster() bool`

HasCluster returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


