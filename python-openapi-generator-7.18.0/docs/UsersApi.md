# openapi_cc_client.UsersApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**users_post**](UsersApi.md#users_post) | **POST** /users | CreateUser | etc


# **users_post**
> users_post(users)

CreateUser | etc

### Example


```python
import openapi_cc_client
from openapi_cc_client.models.users import Users
from openapi_cc_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_cc_client.Configuration(
    host = "http://localhost"
)


# Enter a context with an instance of the API client
with openapi_cc_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_cc_client.UsersApi(api_client)
    users = openapi_cc_client.Users() # Users | Manipulate Cmon Users, users that are maintained by the Cmon controller

    try:
        # CreateUser | etc
        api_instance.users_post(users)
    except Exception as e:
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

