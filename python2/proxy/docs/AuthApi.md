# openapi_cc_proxy_client.AuthApi

All URIs are relative to *https://cchost/proxy*

Method | HTTP request | Description
------------- | ------------- | -------------
[**auth_login_post**](AuthApi.md#auth_login_post) | **POST** /auth/login | Authenticate


# **auth_login_post**
> AuthenticateResponse auth_login_post(authenticate)

Authenticate

### Example


```python
import openapi_cc_proxy_client
from openapi_cc_proxy_client.models.authenticate import Authenticate
from openapi_cc_proxy_client.models.authenticate_response import AuthenticateResponse
from openapi_cc_proxy_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://cchost/proxy
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_cc_proxy_client.Configuration(
    host = "https://cchost/proxy"
)


# Enter a context with an instance of the API client
with openapi_cc_proxy_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_cc_proxy_client.AuthApi(api_client)
    authenticate = openapi_cc_proxy_client.Authenticate() # Authenticate | Authentication parameters

    try:
        # Authenticate
        api_response = api_instance.auth_login_post(authenticate)
        print("The response of AuthApi->auth_login_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuthApi->auth_login_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authenticate** | [**Authenticate**](Authenticate.md)| Authentication parameters | 

### Return type

[**AuthenticateResponse**](AuthenticateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**405** | Unauthorized |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

