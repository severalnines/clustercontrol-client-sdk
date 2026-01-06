# openapi_cc_client.ControllerApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**controller_post**](ControllerApi.md#controller_post) | **POST** /controller | Ping | Heartbeat | etc


# **controller_post**
> controller_post(controller)

Ping | Heartbeat | etc

### Example


```python
import openapi_cc_client
from openapi_cc_client.models.controller import Controller
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
    api_instance = openapi_cc_client.ControllerApi(api_client)
    controller = openapi_cc_client.Controller() # Controller | Managing controller and operate the Cmon HA subsystem

    try:
        # Ping | Heartbeat | etc
        api_instance.controller_post(controller)
    except Exception as e:
        print("Exception when calling ControllerApi->controller_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controller** | [**Controller**](Controller.md)| Managing controller and operate the Cmon HA subsystem | 

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

