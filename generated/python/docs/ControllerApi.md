# openapi_cc_client.ControllerApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**controller_post**](ControllerApi.md#controller_post) | **POST** /controller | Ping | Heartbeat | etc


# **controller_post**
> controller_post(controller)

Ping | Heartbeat | etc

### Example


```python
import time
import openapi_cc_client
from openapi_cc_client.api import controller_api
from openapi_cc_client.model.controller import Controller
from pprint import pprint
# Defining the host is optional and defaults to https://cchost:9501/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_cc_client.Configuration(
    host = "https://cchost:9501/v2"
)


# Enter a context with an instance of the API client
with openapi_cc_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = controller_api.ControllerApi(api_client)
    controller = Controller(
        operation="ping",
        client_ip_address="client_ip_address_example",
        controller_key="controller_key_example",
    ) # Controller | Managing controller and operate the Cmon HA subsystem

    # example passing only required values which don't have defaults set
    try:
        # Ping | Heartbeat | etc
        api_instance.controller_post(controller)
    except openapi_cc_client.ApiException as e:
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
