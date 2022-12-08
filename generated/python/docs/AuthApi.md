# openapi_cc_client.AuthApi

All URIs are relative to *https://&lt;cchost&gt;:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**auth_post**](AuthApi.md#auth_post) | **POST** /auth | Authenticate | Logout | Password Reset | Authenticate response (with challenge)


# **auth_post**
> auth_post(authenticate)

Authenticate | Logout | Password Reset | Authenticate response (with challenge)

### Example

```python
from __future__ import print_function
import time
import openapi_cc_client
from openapi_cc_client.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to https://<cchost>:9501/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_cc_client.Configuration(
    host = "https://<cchost>:9501/v2"
)


# Enter a context with an instance of the API client
with openapi_cc_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_cc_client.AuthApi(api_client)
    authenticate = openapi_cc_client.Authenticate() # Authenticate | Authentication parameters

    try:
        # Authenticate | Logout | Password Reset | Authenticate response (with challenge)
        api_instance.auth_post(authenticate)
    except ApiException as e:
        print("Exception when calling AuthApi->auth_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authenticate** | [**Authenticate**](Authenticate.md)| Authentication parameters | 

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
**200** | Successful authentication |  -  |
**405** | Invalid input |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

