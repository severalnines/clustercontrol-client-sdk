# .UsersApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usersPost**](UsersApi.md#usersPost) | **POST** /users | CreateUser | etc


# **usersPost**
> void usersPost(users)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .UsersApi(configuration);

let body:.UsersApiUsersPostRequest = {
  // Users | Manipulate Cmon Users, users that are maintained by the Cmon controller
  users: {
    operation: "createUser",
    createGroup: true,
    newPassword: "newPassword_example",
    oldPassword: "oldPassword_example",
    groupName: "groupName_example",
    replacePrimaryGroup: true,
    withTags: [
      "withTags_example",
    ],
    user: {
      className: "CmonUser",
      userName: "userName_example",
      emailAddress: "emailAddress_example",
      newPassword: "newPassword_example",
      oldPassword: "oldPassword_example",
      groups: [
        {
          className: "className_example",
          groupName: "groupName_example",
        },
      ],
      publicKeys: [
        {
          key: "key_example",
          name: "name_example",
        },
      ],
      publicKey: [
        {
          key: "key_example",
          name: "name_example",
        },
      ],
    },
    group: {
      className: "CmonGroup",
      groupName: "groupName_example",
    },
  },
};

apiInstance.usersPost(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **users** | **Users**| Manipulate Cmon Users, users that are maintained by the Cmon controller |


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


