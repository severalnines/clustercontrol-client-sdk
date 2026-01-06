# Config

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Operation** | **string** |  | 
**Hostname** | Pointer to **string** |  | [optional] 
**Port** | Pointer to **int32** |  | [optional] 
**Configuration** | Pointer to [**[]ConfigConfigurationInner**](ConfigConfigurationInner.md) |  | [optional] 
**LdapConfiguration** | Pointer to [**ConfigLdapConfiguration**](ConfigLdapConfiguration.md) |  | [optional] 
**Licensedata** | Pointer to **string** |  | [optional] 

## Methods

### NewConfig

`func NewConfig(operation string, ) *Config`

NewConfig instantiates a new Config object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConfigWithDefaults

`func NewConfigWithDefaults() *Config`

NewConfigWithDefaults instantiates a new Config object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOperation

`func (o *Config) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *Config) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *Config) SetOperation(v string)`

SetOperation sets Operation field to given value.


### GetHostname

`func (o *Config) GetHostname() string`

GetHostname returns the Hostname field if non-nil, zero value otherwise.

### GetHostnameOk

`func (o *Config) GetHostnameOk() (*string, bool)`

GetHostnameOk returns a tuple with the Hostname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHostname

`func (o *Config) SetHostname(v string)`

SetHostname sets Hostname field to given value.

### HasHostname

`func (o *Config) HasHostname() bool`

HasHostname returns a boolean if a field has been set.

### GetPort

`func (o *Config) GetPort() int32`

GetPort returns the Port field if non-nil, zero value otherwise.

### GetPortOk

`func (o *Config) GetPortOk() (*int32, bool)`

GetPortOk returns a tuple with the Port field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPort

`func (o *Config) SetPort(v int32)`

SetPort sets Port field to given value.

### HasPort

`func (o *Config) HasPort() bool`

HasPort returns a boolean if a field has been set.

### GetConfiguration

`func (o *Config) GetConfiguration() []ConfigConfigurationInner`

GetConfiguration returns the Configuration field if non-nil, zero value otherwise.

### GetConfigurationOk

`func (o *Config) GetConfigurationOk() (*[]ConfigConfigurationInner, bool)`

GetConfigurationOk returns a tuple with the Configuration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConfiguration

`func (o *Config) SetConfiguration(v []ConfigConfigurationInner)`

SetConfiguration sets Configuration field to given value.

### HasConfiguration

`func (o *Config) HasConfiguration() bool`

HasConfiguration returns a boolean if a field has been set.

### GetLdapConfiguration

`func (o *Config) GetLdapConfiguration() ConfigLdapConfiguration`

GetLdapConfiguration returns the LdapConfiguration field if non-nil, zero value otherwise.

### GetLdapConfigurationOk

`func (o *Config) GetLdapConfigurationOk() (*ConfigLdapConfiguration, bool)`

GetLdapConfigurationOk returns a tuple with the LdapConfiguration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLdapConfiguration

`func (o *Config) SetLdapConfiguration(v ConfigLdapConfiguration)`

SetLdapConfiguration sets LdapConfiguration field to given value.

### HasLdapConfiguration

`func (o *Config) HasLdapConfiguration() bool`

HasLdapConfiguration returns a boolean if a field has been set.

### GetLicensedata

`func (o *Config) GetLicensedata() string`

GetLicensedata returns the Licensedata field if non-nil, zero value otherwise.

### GetLicensedataOk

`func (o *Config) GetLicensedataOk() (*string, bool)`

GetLicensedataOk returns a tuple with the Licensedata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLicensedata

`func (o *Config) SetLicensedata(v string)`

SetLicensedata sets Licensedata field to given value.

### HasLicensedata

`func (o *Config) HasLicensedata() bool`

HasLicensedata returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


