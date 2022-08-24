# .ConfigApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**configPost**](ConfigApi.md#configPost) | **POST** /config | GetConfig | xxx | xxx | etc


# **configPost**
> void configPost(config)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ConfigApi(configuration);

let body:.ConfigApiConfigPostRequest = {
  // Config | Provides access to various Cmon configuration files
  config: {
    operation: "getConfig",
    hostname: "hostname_example",
    port: 1,
    configuration: [
      {
        name: "name_example",
        value: "value_example",
        group: "group_example",
      },
    ],
    ldapConfiguration: {
      enabled: true,
      ldapAdminPassword: "ldapAdminPassword_example",
      ldapAdminUser: "ldapAdminUser_example",
      ldapGroupSearchRoot: "ldapGroupSearchRoot_example",
      ldapServerUri: "ldapServerUri_example",
      ldapUserSearchRoot: "ldapUserSearchRoot_example",
      groupMappings: [
        {
          cmonGroupName: "cmonGroupName_example",
          ldapGroupId: "ldapGroupId_example",
          sectionName: "sectionName_example",
        },
      ],
      ldapSettings: {
        ldapEmailAttributes: "ldapEmailAttributes_example",
        ldapGroupClassName: "ldapGroupClassName_example",
        ldapGroupIdAttributes: "ldapGroupIdAttributes_example",
        ldapGroupNameAttribute: "ldapGroupNameAttribute_example",
        ldapMemberAttributes: "ldapMemberAttributes_example",
        ldapNetworkTimeout: "ldapNetworkTimeout_example",
        ldapProtocolVersion: "ldapProtocolVersion_example",
        ldapQueryTimeLimit: "ldapQueryTimeLimit_example",
        ldapRealnameAttributes: "ldapRealnameAttributes_example",
        ldapUserClassName: "ldapUserClassName_example",
        ldapUsernameAttributes: "ldapUsernameAttributes_example",
      },
      security: {
        caCertFile: "caCertFile_example",
        certFile: "certFile_example",
        keyFile: "keyFile_example",
      },
    },
    licensedata: "licensedata_example",
  },
};

apiInstance.configPost(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **config** | **Config**| Provides access to various Cmon configuration files |


### Return type

**void**

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

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


