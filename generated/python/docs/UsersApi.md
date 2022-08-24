# openapi_cc_client.UsersApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**users_post**](UsersApi.md#users_post) | **POST** /users | CreateUser | etc


# **users_post**
> users_post(users)

CreateUser | etc

### Example


```python
import time
import openapi_cc_client
from openapi_cc_client.api import users_api
from openapi_cc_client.model.users import Users
from pprint import pprint
# Defining the host is optional and defaults to https://cchost:9501/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_cc_client.Configuration(
    host = "https://cchost:9501/v2"
)


# Enter a context with an instance of the API client
with openapi_cc_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = users_api.UsersApi(api_client)
    users = Users(
        operation="createUser",
        create_group=True,
        new_password="new_password_example",
        old_password="old_password_example",
        group_name="group_name_example",
        replace_primary_group=True,
        with_tags=[
            "with_tags_example",
        ],
        user=UsersUser(
            class_name="CmonUser",
            user_name="user_name_example",
            user_id=1,
            first_name="first_name_example",
            last_name="last_name_example",
            email_address="email_address_example",
            new_password="new_password_example",
            old_password="old_password_example",
            groups=[
                UsersUserGroupsInner(
                    class_name="class_name_example",
                    group_name="group_name_example",
                    group_id=1,
                ),
            ],
            timezone=UsersUserTimezone(
                class_name="class_name_example",
                abbreviation="abbreviation_example",
                name="name_example",
                offset=1,
                use_dst=True,
            ),
            public_keys=[
                UsersUserPublicKeysInner(
                    key="key_example",
                    name="name_example",
                ),
            ],
            public_key=[
                UsersUserPublicKeysInner(
                    key="key_example",
                    name="name_example",
                ),
            ],
        ),
        group=UsersGroup(
            class_name="CmonGroup",
            group_name="group_name_example",
        ),
    ) # Users | Manipulate Cmon Users, users that are maintained by the Cmon controller

    # example passing only required values which don't have defaults set
    try:
        # CreateUser | etc
        api_instance.users_post(users)
    except openapi_cc_client.ApiException as e:
        print("Exception when calling UsersApi->users_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **users** | [**Users**](Users.md)| Manipulate Cmon Users, users that are maintained by the Cmon controller |

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

