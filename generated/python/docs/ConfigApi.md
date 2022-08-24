# openapi_cc_client.ConfigApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**config_post**](ConfigApi.md#config_post) | **POST** /config | GetConfig | xxx | xxx | etc


# **config_post**
> config_post(config)

GetConfig | xxx | xxx | etc

### Example


```python
import time
import openapi_cc_client
from openapi_cc_client.api import config_api
from openapi_cc_client.model.config import Config
from pprint import pprint
# Defining the host is optional and defaults to https://cchost:9501/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_cc_client.Configuration(
    host = "https://cchost:9501/v2"
)


# Enter a context with an instance of the API client
with openapi_cc_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = config_api.ConfigApi(api_client)
    config = Config(
        operation="getConfig",
        hostname="hostname_example",
        port=1,
        configuration=[
            ConfigConfigurationInner(
                name="name_example",
                value="value_example",
                group="group_example",
            ),
        ],
        ldap_configuration=ConfigLdapConfiguration(
            enabled=True,
            ldap_admin_password="ldap_admin_password_example",
            ldap_admin_user="ldap_admin_user_example",
            ldap_group_search_root="ldap_group_search_root_example",
            ldap_server_uri="ldap_server_uri_example",
            ldap_user_search_root="ldap_user_search_root_example",
            group_mappings=[
                ConfigLdapConfigurationGroupMappingsInner(
                    cmon_group_name="cmon_group_name_example",
                    ldap_group_id="ldap_group_id_example",
                    section_name="section_name_example",
                ),
            ],
            ldap_settings=ConfigLdapConfigurationLdapSettings(
                ldap_email_attributes="ldap_email_attributes_example",
                ldap_group_class_name="ldap_group_class_name_example",
                ldap_group_id_attributes="ldap_group_id_attributes_example",
                ldap_group_name_attribute="ldap_group_name_attribute_example",
                ldap_member_attributes="ldap_member_attributes_example",
                ldap_network_timeout="ldap_network_timeout_example",
                ldap_protocol_version="ldap_protocol_version_example",
                ldap_query_time_limit="ldap_query_time_limit_example",
                ldap_realname_attributes="ldap_realname_attributes_example",
                ldap_user_class_name="ldap_user_class_name_example",
                ldap_username_attributes="ldap_username_attributes_example",
            ),
            security=ConfigLdapConfigurationSecurity(
                ca_cert_file="ca_cert_file_example",
                cert_file="cert_file_example",
                key_file="key_file_example",
            ),
        ),
        licensedata="licensedata_example",
    ) # Config | Provides access to various Cmon configuration files

    # example passing only required values which don't have defaults set
    try:
        # GetConfig | xxx | xxx | etc
        api_instance.config_post(config)
    except openapi_cc_client.ApiException as e:
        print("Exception when calling ConfigApi->config_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **config** | [**Config**](Config.md)| Provides access to various Cmon configuration files |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**405** | Unauthorized |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

