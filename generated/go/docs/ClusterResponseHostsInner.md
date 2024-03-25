# ClusterResponseHostsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ClassName** | Pointer to **string** |  | [optional] 
**Hostid** | Pointer to **int32** |  | [optional] 
**Datadir** | Pointer to **string** |  | [optional] 
**Hostname** | Pointer to **string** |  | [optional] 
**HostnameData** | Pointer to **string** |  | [optional] 
**HostnameInternal** | Pointer to **string** |  | [optional] 
**Port** | Pointer to **int32** |  | [optional] 
**Role** | Pointer to **string** |  | [optional] 
**Synchronous** | Pointer to **bool** |  | [optional] 
**MemberRole** | Pointer to **string** |  | [optional] 
**Roleid** | Pointer to **int32** |  | [optional] 
**Rs** | Pointer to **string** |  | [optional] 
**Version** | Pointer to **string** |  | [optional] 
**ElasticRoles** | Pointer to **string** |  | [optional] 
**Replica** | Pointer to [**ClusterResponseHostsInnerReplica**](ClusterResponseHostsInnerReplica.md) |  | [optional] 
**ReplicationSlave** | Pointer to [**ClusterResponseHostsInnerReplicationSlave**](ClusterResponseHostsInnerReplicationSlave.md) |  | [optional] 
**ReplicationMaster** | Pointer to [**ClusterResponseHostsInnerReplicationMaster**](ClusterResponseHostsInnerReplicationMaster.md) |  | [optional] 

## Methods

### NewClusterResponseHostsInner

`func NewClusterResponseHostsInner() *ClusterResponseHostsInner`

NewClusterResponseHostsInner instantiates a new ClusterResponseHostsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewClusterResponseHostsInnerWithDefaults

`func NewClusterResponseHostsInnerWithDefaults() *ClusterResponseHostsInner`

NewClusterResponseHostsInnerWithDefaults instantiates a new ClusterResponseHostsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetClassName

`func (o *ClusterResponseHostsInner) GetClassName() string`

GetClassName returns the ClassName field if non-nil, zero value otherwise.

### GetClassNameOk

`func (o *ClusterResponseHostsInner) GetClassNameOk() (*string, bool)`

GetClassNameOk returns a tuple with the ClassName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClassName

`func (o *ClusterResponseHostsInner) SetClassName(v string)`

SetClassName sets ClassName field to given value.

### HasClassName

`func (o *ClusterResponseHostsInner) HasClassName() bool`

HasClassName returns a boolean if a field has been set.

### GetHostid

`func (o *ClusterResponseHostsInner) GetHostid() int32`

GetHostid returns the Hostid field if non-nil, zero value otherwise.

### GetHostidOk

`func (o *ClusterResponseHostsInner) GetHostidOk() (*int32, bool)`

GetHostidOk returns a tuple with the Hostid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHostid

`func (o *ClusterResponseHostsInner) SetHostid(v int32)`

SetHostid sets Hostid field to given value.

### HasHostid

`func (o *ClusterResponseHostsInner) HasHostid() bool`

HasHostid returns a boolean if a field has been set.

### GetDatadir

`func (o *ClusterResponseHostsInner) GetDatadir() string`

GetDatadir returns the Datadir field if non-nil, zero value otherwise.

### GetDatadirOk

`func (o *ClusterResponseHostsInner) GetDatadirOk() (*string, bool)`

GetDatadirOk returns a tuple with the Datadir field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDatadir

`func (o *ClusterResponseHostsInner) SetDatadir(v string)`

SetDatadir sets Datadir field to given value.

### HasDatadir

`func (o *ClusterResponseHostsInner) HasDatadir() bool`

HasDatadir returns a boolean if a field has been set.

### GetHostname

`func (o *ClusterResponseHostsInner) GetHostname() string`

GetHostname returns the Hostname field if non-nil, zero value otherwise.

### GetHostnameOk

`func (o *ClusterResponseHostsInner) GetHostnameOk() (*string, bool)`

GetHostnameOk returns a tuple with the Hostname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHostname

`func (o *ClusterResponseHostsInner) SetHostname(v string)`

SetHostname sets Hostname field to given value.

### HasHostname

`func (o *ClusterResponseHostsInner) HasHostname() bool`

HasHostname returns a boolean if a field has been set.

### GetHostnameData

`func (o *ClusterResponseHostsInner) GetHostnameData() string`

GetHostnameData returns the HostnameData field if non-nil, zero value otherwise.

### GetHostnameDataOk

`func (o *ClusterResponseHostsInner) GetHostnameDataOk() (*string, bool)`

GetHostnameDataOk returns a tuple with the HostnameData field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHostnameData

`func (o *ClusterResponseHostsInner) SetHostnameData(v string)`

SetHostnameData sets HostnameData field to given value.

### HasHostnameData

`func (o *ClusterResponseHostsInner) HasHostnameData() bool`

HasHostnameData returns a boolean if a field has been set.

### GetHostnameInternal

`func (o *ClusterResponseHostsInner) GetHostnameInternal() string`

GetHostnameInternal returns the HostnameInternal field if non-nil, zero value otherwise.

### GetHostnameInternalOk

`func (o *ClusterResponseHostsInner) GetHostnameInternalOk() (*string, bool)`

GetHostnameInternalOk returns a tuple with the HostnameInternal field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHostnameInternal

`func (o *ClusterResponseHostsInner) SetHostnameInternal(v string)`

SetHostnameInternal sets HostnameInternal field to given value.

### HasHostnameInternal

`func (o *ClusterResponseHostsInner) HasHostnameInternal() bool`

HasHostnameInternal returns a boolean if a field has been set.

### GetPort

`func (o *ClusterResponseHostsInner) GetPort() int32`

GetPort returns the Port field if non-nil, zero value otherwise.

### GetPortOk

`func (o *ClusterResponseHostsInner) GetPortOk() (*int32, bool)`

GetPortOk returns a tuple with the Port field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPort

`func (o *ClusterResponseHostsInner) SetPort(v int32)`

SetPort sets Port field to given value.

### HasPort

`func (o *ClusterResponseHostsInner) HasPort() bool`

HasPort returns a boolean if a field has been set.

### GetRole

`func (o *ClusterResponseHostsInner) GetRole() string`

GetRole returns the Role field if non-nil, zero value otherwise.

### GetRoleOk

`func (o *ClusterResponseHostsInner) GetRoleOk() (*string, bool)`

GetRoleOk returns a tuple with the Role field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRole

`func (o *ClusterResponseHostsInner) SetRole(v string)`

SetRole sets Role field to given value.

### HasRole

`func (o *ClusterResponseHostsInner) HasRole() bool`

HasRole returns a boolean if a field has been set.

### GetSynchronous

`func (o *ClusterResponseHostsInner) GetSynchronous() bool`

GetSynchronous returns the Synchronous field if non-nil, zero value otherwise.

### GetSynchronousOk

`func (o *ClusterResponseHostsInner) GetSynchronousOk() (*bool, bool)`

GetSynchronousOk returns a tuple with the Synchronous field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSynchronous

`func (o *ClusterResponseHostsInner) SetSynchronous(v bool)`

SetSynchronous sets Synchronous field to given value.

### HasSynchronous

`func (o *ClusterResponseHostsInner) HasSynchronous() bool`

HasSynchronous returns a boolean if a field has been set.

### GetMemberRole

`func (o *ClusterResponseHostsInner) GetMemberRole() string`

GetMemberRole returns the MemberRole field if non-nil, zero value otherwise.

### GetMemberRoleOk

`func (o *ClusterResponseHostsInner) GetMemberRoleOk() (*string, bool)`

GetMemberRoleOk returns a tuple with the MemberRole field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMemberRole

`func (o *ClusterResponseHostsInner) SetMemberRole(v string)`

SetMemberRole sets MemberRole field to given value.

### HasMemberRole

`func (o *ClusterResponseHostsInner) HasMemberRole() bool`

HasMemberRole returns a boolean if a field has been set.

### GetRoleid

`func (o *ClusterResponseHostsInner) GetRoleid() int32`

GetRoleid returns the Roleid field if non-nil, zero value otherwise.

### GetRoleidOk

`func (o *ClusterResponseHostsInner) GetRoleidOk() (*int32, bool)`

GetRoleidOk returns a tuple with the Roleid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoleid

`func (o *ClusterResponseHostsInner) SetRoleid(v int32)`

SetRoleid sets Roleid field to given value.

### HasRoleid

`func (o *ClusterResponseHostsInner) HasRoleid() bool`

HasRoleid returns a boolean if a field has been set.

### GetRs

`func (o *ClusterResponseHostsInner) GetRs() string`

GetRs returns the Rs field if non-nil, zero value otherwise.

### GetRsOk

`func (o *ClusterResponseHostsInner) GetRsOk() (*string, bool)`

GetRsOk returns a tuple with the Rs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRs

`func (o *ClusterResponseHostsInner) SetRs(v string)`

SetRs sets Rs field to given value.

### HasRs

`func (o *ClusterResponseHostsInner) HasRs() bool`

HasRs returns a boolean if a field has been set.

### GetVersion

`func (o *ClusterResponseHostsInner) GetVersion() string`

GetVersion returns the Version field if non-nil, zero value otherwise.

### GetVersionOk

`func (o *ClusterResponseHostsInner) GetVersionOk() (*string, bool)`

GetVersionOk returns a tuple with the Version field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersion

`func (o *ClusterResponseHostsInner) SetVersion(v string)`

SetVersion sets Version field to given value.

### HasVersion

`func (o *ClusterResponseHostsInner) HasVersion() bool`

HasVersion returns a boolean if a field has been set.

### GetElasticRoles

`func (o *ClusterResponseHostsInner) GetElasticRoles() string`

GetElasticRoles returns the ElasticRoles field if non-nil, zero value otherwise.

### GetElasticRolesOk

`func (o *ClusterResponseHostsInner) GetElasticRolesOk() (*string, bool)`

GetElasticRolesOk returns a tuple with the ElasticRoles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetElasticRoles

`func (o *ClusterResponseHostsInner) SetElasticRoles(v string)`

SetElasticRoles sets ElasticRoles field to given value.

### HasElasticRoles

`func (o *ClusterResponseHostsInner) HasElasticRoles() bool`

HasElasticRoles returns a boolean if a field has been set.

### GetReplica

`func (o *ClusterResponseHostsInner) GetReplica() ClusterResponseHostsInnerReplica`

GetReplica returns the Replica field if non-nil, zero value otherwise.

### GetReplicaOk

`func (o *ClusterResponseHostsInner) GetReplicaOk() (*ClusterResponseHostsInnerReplica, bool)`

GetReplicaOk returns a tuple with the Replica field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReplica

`func (o *ClusterResponseHostsInner) SetReplica(v ClusterResponseHostsInnerReplica)`

SetReplica sets Replica field to given value.

### HasReplica

`func (o *ClusterResponseHostsInner) HasReplica() bool`

HasReplica returns a boolean if a field has been set.

### GetReplicationSlave

`func (o *ClusterResponseHostsInner) GetReplicationSlave() ClusterResponseHostsInnerReplicationSlave`

GetReplicationSlave returns the ReplicationSlave field if non-nil, zero value otherwise.

### GetReplicationSlaveOk

`func (o *ClusterResponseHostsInner) GetReplicationSlaveOk() (*ClusterResponseHostsInnerReplicationSlave, bool)`

GetReplicationSlaveOk returns a tuple with the ReplicationSlave field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReplicationSlave

`func (o *ClusterResponseHostsInner) SetReplicationSlave(v ClusterResponseHostsInnerReplicationSlave)`

SetReplicationSlave sets ReplicationSlave field to given value.

### HasReplicationSlave

`func (o *ClusterResponseHostsInner) HasReplicationSlave() bool`

HasReplicationSlave returns a boolean if a field has been set.

### GetReplicationMaster

`func (o *ClusterResponseHostsInner) GetReplicationMaster() ClusterResponseHostsInnerReplicationMaster`

GetReplicationMaster returns the ReplicationMaster field if non-nil, zero value otherwise.

### GetReplicationMasterOk

`func (o *ClusterResponseHostsInner) GetReplicationMasterOk() (*ClusterResponseHostsInnerReplicationMaster, bool)`

GetReplicationMasterOk returns a tuple with the ReplicationMaster field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReplicationMaster

`func (o *ClusterResponseHostsInner) SetReplicationMaster(v ClusterResponseHostsInnerReplicationMaster)`

SetReplicationMaster sets ReplicationMaster field to given value.

### HasReplicationMaster

`func (o *ClusterResponseHostsInner) HasReplicationMaster() bool`

HasReplicationMaster returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


