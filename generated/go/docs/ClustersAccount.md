# ClustersAccount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ClassName** | Pointer to **string** |  | [optional] 
**Grants** | Pointer to **string** | e.g. \&quot;john:ALL;pipas:INSERT\&quot; | [optional] 
**HostAllow** | Pointer to **string** | e.g. \&quot;1.2.3.4\&quot; | [optional] 
**OwnDatabase** | Pointer to **string** |  | [optional] 
**Privileges** | Pointer to **string** | e.g. \&quot;testCreateDatabase.*:DELETE,TRUNCATE\&quot; | [optional] 
**UserName** | Pointer to **string** | e.g. \&quot;pipas\&quot; | [optional] 
**Password** | Pointer to **string** |  | [optional] 

## Methods

### NewClustersAccount

`func NewClustersAccount() *ClustersAccount`

NewClustersAccount instantiates a new ClustersAccount object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewClustersAccountWithDefaults

`func NewClustersAccountWithDefaults() *ClustersAccount`

NewClustersAccountWithDefaults instantiates a new ClustersAccount object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetClassName

`func (o *ClustersAccount) GetClassName() string`

GetClassName returns the ClassName field if non-nil, zero value otherwise.

### GetClassNameOk

`func (o *ClustersAccount) GetClassNameOk() (*string, bool)`

GetClassNameOk returns a tuple with the ClassName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClassName

`func (o *ClustersAccount) SetClassName(v string)`

SetClassName sets ClassName field to given value.

### HasClassName

`func (o *ClustersAccount) HasClassName() bool`

HasClassName returns a boolean if a field has been set.

### GetGrants

`func (o *ClustersAccount) GetGrants() string`

GetGrants returns the Grants field if non-nil, zero value otherwise.

### GetGrantsOk

`func (o *ClustersAccount) GetGrantsOk() (*string, bool)`

GetGrantsOk returns a tuple with the Grants field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrants

`func (o *ClustersAccount) SetGrants(v string)`

SetGrants sets Grants field to given value.

### HasGrants

`func (o *ClustersAccount) HasGrants() bool`

HasGrants returns a boolean if a field has been set.

### GetHostAllow

`func (o *ClustersAccount) GetHostAllow() string`

GetHostAllow returns the HostAllow field if non-nil, zero value otherwise.

### GetHostAllowOk

`func (o *ClustersAccount) GetHostAllowOk() (*string, bool)`

GetHostAllowOk returns a tuple with the HostAllow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHostAllow

`func (o *ClustersAccount) SetHostAllow(v string)`

SetHostAllow sets HostAllow field to given value.

### HasHostAllow

`func (o *ClustersAccount) HasHostAllow() bool`

HasHostAllow returns a boolean if a field has been set.

### GetOwnDatabase

`func (o *ClustersAccount) GetOwnDatabase() string`

GetOwnDatabase returns the OwnDatabase field if non-nil, zero value otherwise.

### GetOwnDatabaseOk

`func (o *ClustersAccount) GetOwnDatabaseOk() (*string, bool)`

GetOwnDatabaseOk returns a tuple with the OwnDatabase field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOwnDatabase

`func (o *ClustersAccount) SetOwnDatabase(v string)`

SetOwnDatabase sets OwnDatabase field to given value.

### HasOwnDatabase

`func (o *ClustersAccount) HasOwnDatabase() bool`

HasOwnDatabase returns a boolean if a field has been set.

### GetPrivileges

`func (o *ClustersAccount) GetPrivileges() string`

GetPrivileges returns the Privileges field if non-nil, zero value otherwise.

### GetPrivilegesOk

`func (o *ClustersAccount) GetPrivilegesOk() (*string, bool)`

GetPrivilegesOk returns a tuple with the Privileges field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrivileges

`func (o *ClustersAccount) SetPrivileges(v string)`

SetPrivileges sets Privileges field to given value.

### HasPrivileges

`func (o *ClustersAccount) HasPrivileges() bool`

HasPrivileges returns a boolean if a field has been set.

### GetUserName

`func (o *ClustersAccount) GetUserName() string`

GetUserName returns the UserName field if non-nil, zero value otherwise.

### GetUserNameOk

`func (o *ClustersAccount) GetUserNameOk() (*string, bool)`

GetUserNameOk returns a tuple with the UserName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserName

`func (o *ClustersAccount) SetUserName(v string)`

SetUserName sets UserName field to given value.

### HasUserName

`func (o *ClustersAccount) HasUserName() bool`

HasUserName returns a boolean if a field has been set.

### GetPassword

`func (o *ClustersAccount) GetPassword() string`

GetPassword returns the Password field if non-nil, zero value otherwise.

### GetPasswordOk

`func (o *ClustersAccount) GetPasswordOk() (*string, bool)`

GetPasswordOk returns a tuple with the Password field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPassword

`func (o *ClustersAccount) SetPassword(v string)`

SetPassword sets Password field to given value.

### HasPassword

`func (o *ClustersAccount) HasPassword() bool`

HasPassword returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


