# JobsJobJobSpecJobDataNode

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BackendNameRo** | Pointer to **string** |  | [optional] 
**BackendNameRw** | Pointer to **string** |  | [optional] 
**DataRetention** | Pointer to **string** |  | [optional] 
**DataRetentionSize** | Pointer to **int32** |  | [optional] 
**Hostname** | Pointer to **string** |  | [optional] 
**LbAdmin** | Pointer to **string** |  | [optional] 
**LbPassword** | Pointer to **string** |  | [optional] 
**LbPolicy** | Pointer to **string** |  | [optional] 
**MaxConnectionBe** | Pointer to **int32** |  | [optional] 
**MaxConnectionFe** | Pointer to **int32** |  | [optional] 
**Port** | Pointer to **int32** |  | [optional] 
**RoPort** | Pointer to **int32** |  | [optional] 
**RwPort** | Pointer to **int32** |  | [optional] 
**RwSplitting** | Pointer to **bool** |  | [optional] 
**StatsSocket** | Pointer to **string** |  | [optional] 
**TimeoutClient** | Pointer to **int32** |  | [optional] 
**TimeoutServer** | Pointer to **int32** |  | [optional] 
**XinetdAllowFrom** | Pointer to **string** |  | [optional] 
**ScrapeInterval** | Pointer to **string** |  | [optional] 
**Configuration** | Pointer to [**[]JobsJobJobSpecJobDataNodeConfigurationInner**](JobsJobJobSpecJobDataNodeConfigurationInner.md) |  | [optional] 

## Methods

### NewJobsJobJobSpecJobDataNode

`func NewJobsJobJobSpecJobDataNode() *JobsJobJobSpecJobDataNode`

NewJobsJobJobSpecJobDataNode instantiates a new JobsJobJobSpecJobDataNode object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewJobsJobJobSpecJobDataNodeWithDefaults

`func NewJobsJobJobSpecJobDataNodeWithDefaults() *JobsJobJobSpecJobDataNode`

NewJobsJobJobSpecJobDataNodeWithDefaults instantiates a new JobsJobJobSpecJobDataNode object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBackendNameRo

`func (o *JobsJobJobSpecJobDataNode) GetBackendNameRo() string`

GetBackendNameRo returns the BackendNameRo field if non-nil, zero value otherwise.

### GetBackendNameRoOk

`func (o *JobsJobJobSpecJobDataNode) GetBackendNameRoOk() (*string, bool)`

GetBackendNameRoOk returns a tuple with the BackendNameRo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBackendNameRo

`func (o *JobsJobJobSpecJobDataNode) SetBackendNameRo(v string)`

SetBackendNameRo sets BackendNameRo field to given value.

### HasBackendNameRo

`func (o *JobsJobJobSpecJobDataNode) HasBackendNameRo() bool`

HasBackendNameRo returns a boolean if a field has been set.

### GetBackendNameRw

`func (o *JobsJobJobSpecJobDataNode) GetBackendNameRw() string`

GetBackendNameRw returns the BackendNameRw field if non-nil, zero value otherwise.

### GetBackendNameRwOk

`func (o *JobsJobJobSpecJobDataNode) GetBackendNameRwOk() (*string, bool)`

GetBackendNameRwOk returns a tuple with the BackendNameRw field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBackendNameRw

`func (o *JobsJobJobSpecJobDataNode) SetBackendNameRw(v string)`

SetBackendNameRw sets BackendNameRw field to given value.

### HasBackendNameRw

`func (o *JobsJobJobSpecJobDataNode) HasBackendNameRw() bool`

HasBackendNameRw returns a boolean if a field has been set.

### GetDataRetention

`func (o *JobsJobJobSpecJobDataNode) GetDataRetention() string`

GetDataRetention returns the DataRetention field if non-nil, zero value otherwise.

### GetDataRetentionOk

`func (o *JobsJobJobSpecJobDataNode) GetDataRetentionOk() (*string, bool)`

GetDataRetentionOk returns a tuple with the DataRetention field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDataRetention

`func (o *JobsJobJobSpecJobDataNode) SetDataRetention(v string)`

SetDataRetention sets DataRetention field to given value.

### HasDataRetention

`func (o *JobsJobJobSpecJobDataNode) HasDataRetention() bool`

HasDataRetention returns a boolean if a field has been set.

### GetDataRetentionSize

`func (o *JobsJobJobSpecJobDataNode) GetDataRetentionSize() int32`

GetDataRetentionSize returns the DataRetentionSize field if non-nil, zero value otherwise.

### GetDataRetentionSizeOk

`func (o *JobsJobJobSpecJobDataNode) GetDataRetentionSizeOk() (*int32, bool)`

GetDataRetentionSizeOk returns a tuple with the DataRetentionSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDataRetentionSize

`func (o *JobsJobJobSpecJobDataNode) SetDataRetentionSize(v int32)`

SetDataRetentionSize sets DataRetentionSize field to given value.

### HasDataRetentionSize

`func (o *JobsJobJobSpecJobDataNode) HasDataRetentionSize() bool`

HasDataRetentionSize returns a boolean if a field has been set.

### GetHostname

`func (o *JobsJobJobSpecJobDataNode) GetHostname() string`

GetHostname returns the Hostname field if non-nil, zero value otherwise.

### GetHostnameOk

`func (o *JobsJobJobSpecJobDataNode) GetHostnameOk() (*string, bool)`

GetHostnameOk returns a tuple with the Hostname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHostname

`func (o *JobsJobJobSpecJobDataNode) SetHostname(v string)`

SetHostname sets Hostname field to given value.

### HasHostname

`func (o *JobsJobJobSpecJobDataNode) HasHostname() bool`

HasHostname returns a boolean if a field has been set.

### GetLbAdmin

`func (o *JobsJobJobSpecJobDataNode) GetLbAdmin() string`

GetLbAdmin returns the LbAdmin field if non-nil, zero value otherwise.

### GetLbAdminOk

`func (o *JobsJobJobSpecJobDataNode) GetLbAdminOk() (*string, bool)`

GetLbAdminOk returns a tuple with the LbAdmin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLbAdmin

`func (o *JobsJobJobSpecJobDataNode) SetLbAdmin(v string)`

SetLbAdmin sets LbAdmin field to given value.

### HasLbAdmin

`func (o *JobsJobJobSpecJobDataNode) HasLbAdmin() bool`

HasLbAdmin returns a boolean if a field has been set.

### GetLbPassword

`func (o *JobsJobJobSpecJobDataNode) GetLbPassword() string`

GetLbPassword returns the LbPassword field if non-nil, zero value otherwise.

### GetLbPasswordOk

`func (o *JobsJobJobSpecJobDataNode) GetLbPasswordOk() (*string, bool)`

GetLbPasswordOk returns a tuple with the LbPassword field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLbPassword

`func (o *JobsJobJobSpecJobDataNode) SetLbPassword(v string)`

SetLbPassword sets LbPassword field to given value.

### HasLbPassword

`func (o *JobsJobJobSpecJobDataNode) HasLbPassword() bool`

HasLbPassword returns a boolean if a field has been set.

### GetLbPolicy

`func (o *JobsJobJobSpecJobDataNode) GetLbPolicy() string`

GetLbPolicy returns the LbPolicy field if non-nil, zero value otherwise.

### GetLbPolicyOk

`func (o *JobsJobJobSpecJobDataNode) GetLbPolicyOk() (*string, bool)`

GetLbPolicyOk returns a tuple with the LbPolicy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLbPolicy

`func (o *JobsJobJobSpecJobDataNode) SetLbPolicy(v string)`

SetLbPolicy sets LbPolicy field to given value.

### HasLbPolicy

`func (o *JobsJobJobSpecJobDataNode) HasLbPolicy() bool`

HasLbPolicy returns a boolean if a field has been set.

### GetMaxConnectionBe

`func (o *JobsJobJobSpecJobDataNode) GetMaxConnectionBe() int32`

GetMaxConnectionBe returns the MaxConnectionBe field if non-nil, zero value otherwise.

### GetMaxConnectionBeOk

`func (o *JobsJobJobSpecJobDataNode) GetMaxConnectionBeOk() (*int32, bool)`

GetMaxConnectionBeOk returns a tuple with the MaxConnectionBe field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxConnectionBe

`func (o *JobsJobJobSpecJobDataNode) SetMaxConnectionBe(v int32)`

SetMaxConnectionBe sets MaxConnectionBe field to given value.

### HasMaxConnectionBe

`func (o *JobsJobJobSpecJobDataNode) HasMaxConnectionBe() bool`

HasMaxConnectionBe returns a boolean if a field has been set.

### GetMaxConnectionFe

`func (o *JobsJobJobSpecJobDataNode) GetMaxConnectionFe() int32`

GetMaxConnectionFe returns the MaxConnectionFe field if non-nil, zero value otherwise.

### GetMaxConnectionFeOk

`func (o *JobsJobJobSpecJobDataNode) GetMaxConnectionFeOk() (*int32, bool)`

GetMaxConnectionFeOk returns a tuple with the MaxConnectionFe field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxConnectionFe

`func (o *JobsJobJobSpecJobDataNode) SetMaxConnectionFe(v int32)`

SetMaxConnectionFe sets MaxConnectionFe field to given value.

### HasMaxConnectionFe

`func (o *JobsJobJobSpecJobDataNode) HasMaxConnectionFe() bool`

HasMaxConnectionFe returns a boolean if a field has been set.

### GetPort

`func (o *JobsJobJobSpecJobDataNode) GetPort() int32`

GetPort returns the Port field if non-nil, zero value otherwise.

### GetPortOk

`func (o *JobsJobJobSpecJobDataNode) GetPortOk() (*int32, bool)`

GetPortOk returns a tuple with the Port field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPort

`func (o *JobsJobJobSpecJobDataNode) SetPort(v int32)`

SetPort sets Port field to given value.

### HasPort

`func (o *JobsJobJobSpecJobDataNode) HasPort() bool`

HasPort returns a boolean if a field has been set.

### GetRoPort

`func (o *JobsJobJobSpecJobDataNode) GetRoPort() int32`

GetRoPort returns the RoPort field if non-nil, zero value otherwise.

### GetRoPortOk

`func (o *JobsJobJobSpecJobDataNode) GetRoPortOk() (*int32, bool)`

GetRoPortOk returns a tuple with the RoPort field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoPort

`func (o *JobsJobJobSpecJobDataNode) SetRoPort(v int32)`

SetRoPort sets RoPort field to given value.

### HasRoPort

`func (o *JobsJobJobSpecJobDataNode) HasRoPort() bool`

HasRoPort returns a boolean if a field has been set.

### GetRwPort

`func (o *JobsJobJobSpecJobDataNode) GetRwPort() int32`

GetRwPort returns the RwPort field if non-nil, zero value otherwise.

### GetRwPortOk

`func (o *JobsJobJobSpecJobDataNode) GetRwPortOk() (*int32, bool)`

GetRwPortOk returns a tuple with the RwPort field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRwPort

`func (o *JobsJobJobSpecJobDataNode) SetRwPort(v int32)`

SetRwPort sets RwPort field to given value.

### HasRwPort

`func (o *JobsJobJobSpecJobDataNode) HasRwPort() bool`

HasRwPort returns a boolean if a field has been set.

### GetRwSplitting

`func (o *JobsJobJobSpecJobDataNode) GetRwSplitting() bool`

GetRwSplitting returns the RwSplitting field if non-nil, zero value otherwise.

### GetRwSplittingOk

`func (o *JobsJobJobSpecJobDataNode) GetRwSplittingOk() (*bool, bool)`

GetRwSplittingOk returns a tuple with the RwSplitting field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRwSplitting

`func (o *JobsJobJobSpecJobDataNode) SetRwSplitting(v bool)`

SetRwSplitting sets RwSplitting field to given value.

### HasRwSplitting

`func (o *JobsJobJobSpecJobDataNode) HasRwSplitting() bool`

HasRwSplitting returns a boolean if a field has been set.

### GetStatsSocket

`func (o *JobsJobJobSpecJobDataNode) GetStatsSocket() string`

GetStatsSocket returns the StatsSocket field if non-nil, zero value otherwise.

### GetStatsSocketOk

`func (o *JobsJobJobSpecJobDataNode) GetStatsSocketOk() (*string, bool)`

GetStatsSocketOk returns a tuple with the StatsSocket field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatsSocket

`func (o *JobsJobJobSpecJobDataNode) SetStatsSocket(v string)`

SetStatsSocket sets StatsSocket field to given value.

### HasStatsSocket

`func (o *JobsJobJobSpecJobDataNode) HasStatsSocket() bool`

HasStatsSocket returns a boolean if a field has been set.

### GetTimeoutClient

`func (o *JobsJobJobSpecJobDataNode) GetTimeoutClient() int32`

GetTimeoutClient returns the TimeoutClient field if non-nil, zero value otherwise.

### GetTimeoutClientOk

`func (o *JobsJobJobSpecJobDataNode) GetTimeoutClientOk() (*int32, bool)`

GetTimeoutClientOk returns a tuple with the TimeoutClient field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeoutClient

`func (o *JobsJobJobSpecJobDataNode) SetTimeoutClient(v int32)`

SetTimeoutClient sets TimeoutClient field to given value.

### HasTimeoutClient

`func (o *JobsJobJobSpecJobDataNode) HasTimeoutClient() bool`

HasTimeoutClient returns a boolean if a field has been set.

### GetTimeoutServer

`func (o *JobsJobJobSpecJobDataNode) GetTimeoutServer() int32`

GetTimeoutServer returns the TimeoutServer field if non-nil, zero value otherwise.

### GetTimeoutServerOk

`func (o *JobsJobJobSpecJobDataNode) GetTimeoutServerOk() (*int32, bool)`

GetTimeoutServerOk returns a tuple with the TimeoutServer field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeoutServer

`func (o *JobsJobJobSpecJobDataNode) SetTimeoutServer(v int32)`

SetTimeoutServer sets TimeoutServer field to given value.

### HasTimeoutServer

`func (o *JobsJobJobSpecJobDataNode) HasTimeoutServer() bool`

HasTimeoutServer returns a boolean if a field has been set.

### GetXinetdAllowFrom

`func (o *JobsJobJobSpecJobDataNode) GetXinetdAllowFrom() string`

GetXinetdAllowFrom returns the XinetdAllowFrom field if non-nil, zero value otherwise.

### GetXinetdAllowFromOk

`func (o *JobsJobJobSpecJobDataNode) GetXinetdAllowFromOk() (*string, bool)`

GetXinetdAllowFromOk returns a tuple with the XinetdAllowFrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetXinetdAllowFrom

`func (o *JobsJobJobSpecJobDataNode) SetXinetdAllowFrom(v string)`

SetXinetdAllowFrom sets XinetdAllowFrom field to given value.

### HasXinetdAllowFrom

`func (o *JobsJobJobSpecJobDataNode) HasXinetdAllowFrom() bool`

HasXinetdAllowFrom returns a boolean if a field has been set.

### GetScrapeInterval

`func (o *JobsJobJobSpecJobDataNode) GetScrapeInterval() string`

GetScrapeInterval returns the ScrapeInterval field if non-nil, zero value otherwise.

### GetScrapeIntervalOk

`func (o *JobsJobJobSpecJobDataNode) GetScrapeIntervalOk() (*string, bool)`

GetScrapeIntervalOk returns a tuple with the ScrapeInterval field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScrapeInterval

`func (o *JobsJobJobSpecJobDataNode) SetScrapeInterval(v string)`

SetScrapeInterval sets ScrapeInterval field to given value.

### HasScrapeInterval

`func (o *JobsJobJobSpecJobDataNode) HasScrapeInterval() bool`

HasScrapeInterval returns a boolean if a field has been set.

### GetConfiguration

`func (o *JobsJobJobSpecJobDataNode) GetConfiguration() []JobsJobJobSpecJobDataNodeConfigurationInner`

GetConfiguration returns the Configuration field if non-nil, zero value otherwise.

### GetConfigurationOk

`func (o *JobsJobJobSpecJobDataNode) GetConfigurationOk() (*[]JobsJobJobSpecJobDataNodeConfigurationInner, bool)`

GetConfigurationOk returns a tuple with the Configuration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConfiguration

`func (o *JobsJobJobSpecJobDataNode) SetConfiguration(v []JobsJobJobSpecJobDataNodeConfigurationInner)`

SetConfiguration sets Configuration field to given value.

### HasConfiguration

`func (o *JobsJobJobSpecJobDataNode) HasConfiguration() bool`

HasConfiguration returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


