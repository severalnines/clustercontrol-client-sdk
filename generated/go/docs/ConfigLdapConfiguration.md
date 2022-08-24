# ConfigLdapConfiguration

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Enabled** | Pointer to **bool** |  | [optional] 
**LdapAdminPassword** | Pointer to **string** |  | [optional] 
**LdapAdminUser** | Pointer to **string** |  | [optional] 
**LdapGroupSearchRoot** | Pointer to **string** |  | [optional] 
**LdapServerUri** | Pointer to **string** |  | [optional] 
**LdapUserSearchRoot** | Pointer to **string** |  | [optional] 
**GroupMappings** | Pointer to [**[]ConfigLdapConfigurationGroupMappingsInner**](ConfigLdapConfigurationGroupMappingsInner.md) |  | [optional] 
**LdapSettings** | Pointer to [**ConfigLdapConfigurationLdapSettings**](ConfigLdapConfigurationLdapSettings.md) |  | [optional] 
**Security** | Pointer to [**ConfigLdapConfigurationSecurity**](ConfigLdapConfigurationSecurity.md) |  | [optional] 

## Methods

### NewConfigLdapConfiguration

`func NewConfigLdapConfiguration() *ConfigLdapConfiguration`

NewConfigLdapConfiguration instantiates a new ConfigLdapConfiguration object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConfigLdapConfigurationWithDefaults

`func NewConfigLdapConfigurationWithDefaults() *ConfigLdapConfiguration`

NewConfigLdapConfigurationWithDefaults instantiates a new ConfigLdapConfiguration object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEnabled

`func (o *ConfigLdapConfiguration) GetEnabled() bool`

GetEnabled returns the Enabled field if non-nil, zero value otherwise.

### GetEnabledOk

`func (o *ConfigLdapConfiguration) GetEnabledOk() (*bool, bool)`

GetEnabledOk returns a tuple with the Enabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnabled

`func (o *ConfigLdapConfiguration) SetEnabled(v bool)`

SetEnabled sets Enabled field to given value.

### HasEnabled

`func (o *ConfigLdapConfiguration) HasEnabled() bool`

HasEnabled returns a boolean if a field has been set.

### GetLdapAdminPassword

`func (o *ConfigLdapConfiguration) GetLdapAdminPassword() string`

GetLdapAdminPassword returns the LdapAdminPassword field if non-nil, zero value otherwise.

### GetLdapAdminPasswordOk

`func (o *ConfigLdapConfiguration) GetLdapAdminPasswordOk() (*string, bool)`

GetLdapAdminPasswordOk returns a tuple with the LdapAdminPassword field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLdapAdminPassword

`func (o *ConfigLdapConfiguration) SetLdapAdminPassword(v string)`

SetLdapAdminPassword sets LdapAdminPassword field to given value.

### HasLdapAdminPassword

`func (o *ConfigLdapConfiguration) HasLdapAdminPassword() bool`

HasLdapAdminPassword returns a boolean if a field has been set.

### GetLdapAdminUser

`func (o *ConfigLdapConfiguration) GetLdapAdminUser() string`

GetLdapAdminUser returns the LdapAdminUser field if non-nil, zero value otherwise.

### GetLdapAdminUserOk

`func (o *ConfigLdapConfiguration) GetLdapAdminUserOk() (*string, bool)`

GetLdapAdminUserOk returns a tuple with the LdapAdminUser field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLdapAdminUser

`func (o *ConfigLdapConfiguration) SetLdapAdminUser(v string)`

SetLdapAdminUser sets LdapAdminUser field to given value.

### HasLdapAdminUser

`func (o *ConfigLdapConfiguration) HasLdapAdminUser() bool`

HasLdapAdminUser returns a boolean if a field has been set.

### GetLdapGroupSearchRoot

`func (o *ConfigLdapConfiguration) GetLdapGroupSearchRoot() string`

GetLdapGroupSearchRoot returns the LdapGroupSearchRoot field if non-nil, zero value otherwise.

### GetLdapGroupSearchRootOk

`func (o *ConfigLdapConfiguration) GetLdapGroupSearchRootOk() (*string, bool)`

GetLdapGroupSearchRootOk returns a tuple with the LdapGroupSearchRoot field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLdapGroupSearchRoot

`func (o *ConfigLdapConfiguration) SetLdapGroupSearchRoot(v string)`

SetLdapGroupSearchRoot sets LdapGroupSearchRoot field to given value.

### HasLdapGroupSearchRoot

`func (o *ConfigLdapConfiguration) HasLdapGroupSearchRoot() bool`

HasLdapGroupSearchRoot returns a boolean if a field has been set.

### GetLdapServerUri

`func (o *ConfigLdapConfiguration) GetLdapServerUri() string`

GetLdapServerUri returns the LdapServerUri field if non-nil, zero value otherwise.

### GetLdapServerUriOk

`func (o *ConfigLdapConfiguration) GetLdapServerUriOk() (*string, bool)`

GetLdapServerUriOk returns a tuple with the LdapServerUri field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLdapServerUri

`func (o *ConfigLdapConfiguration) SetLdapServerUri(v string)`

SetLdapServerUri sets LdapServerUri field to given value.

### HasLdapServerUri

`func (o *ConfigLdapConfiguration) HasLdapServerUri() bool`

HasLdapServerUri returns a boolean if a field has been set.

### GetLdapUserSearchRoot

`func (o *ConfigLdapConfiguration) GetLdapUserSearchRoot() string`

GetLdapUserSearchRoot returns the LdapUserSearchRoot field if non-nil, zero value otherwise.

### GetLdapUserSearchRootOk

`func (o *ConfigLdapConfiguration) GetLdapUserSearchRootOk() (*string, bool)`

GetLdapUserSearchRootOk returns a tuple with the LdapUserSearchRoot field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLdapUserSearchRoot

`func (o *ConfigLdapConfiguration) SetLdapUserSearchRoot(v string)`

SetLdapUserSearchRoot sets LdapUserSearchRoot field to given value.

### HasLdapUserSearchRoot

`func (o *ConfigLdapConfiguration) HasLdapUserSearchRoot() bool`

HasLdapUserSearchRoot returns a boolean if a field has been set.

### GetGroupMappings

`func (o *ConfigLdapConfiguration) GetGroupMappings() []ConfigLdapConfigurationGroupMappingsInner`

GetGroupMappings returns the GroupMappings field if non-nil, zero value otherwise.

### GetGroupMappingsOk

`func (o *ConfigLdapConfiguration) GetGroupMappingsOk() (*[]ConfigLdapConfigurationGroupMappingsInner, bool)`

GetGroupMappingsOk returns a tuple with the GroupMappings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupMappings

`func (o *ConfigLdapConfiguration) SetGroupMappings(v []ConfigLdapConfigurationGroupMappingsInner)`

SetGroupMappings sets GroupMappings field to given value.

### HasGroupMappings

`func (o *ConfigLdapConfiguration) HasGroupMappings() bool`

HasGroupMappings returns a boolean if a field has been set.

### GetLdapSettings

`func (o *ConfigLdapConfiguration) GetLdapSettings() ConfigLdapConfigurationLdapSettings`

GetLdapSettings returns the LdapSettings field if non-nil, zero value otherwise.

### GetLdapSettingsOk

`func (o *ConfigLdapConfiguration) GetLdapSettingsOk() (*ConfigLdapConfigurationLdapSettings, bool)`

GetLdapSettingsOk returns a tuple with the LdapSettings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLdapSettings

`func (o *ConfigLdapConfiguration) SetLdapSettings(v ConfigLdapConfigurationLdapSettings)`

SetLdapSettings sets LdapSettings field to given value.

### HasLdapSettings

`func (o *ConfigLdapConfiguration) HasLdapSettings() bool`

HasLdapSettings returns a boolean if a field has been set.

### GetSecurity

`func (o *ConfigLdapConfiguration) GetSecurity() ConfigLdapConfigurationSecurity`

GetSecurity returns the Security field if non-nil, zero value otherwise.

### GetSecurityOk

`func (o *ConfigLdapConfiguration) GetSecurityOk() (*ConfigLdapConfigurationSecurity, bool)`

GetSecurityOk returns a tuple with the Security field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSecurity

`func (o *ConfigLdapConfiguration) SetSecurity(v ConfigLdapConfigurationSecurity)`

SetSecurity sets Security field to given value.

### HasSecurity

`func (o *ConfigLdapConfiguration) HasSecurity() bool`

HasSecurity returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


