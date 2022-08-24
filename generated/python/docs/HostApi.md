# openapi_cc_client.HostApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**host_post**](HostApi.md#host_post) | **POST** /host | Path for managing servers


# **host_post**
> host_post(host)

Path for managing servers

### Example


```python
import time
import openapi_cc_client
from openapi_cc_client.api import host_api
from openapi_cc_client.model.host import Host
from pprint import pprint
# Defining the host is optional and defaults to https://cchost:9501/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_cc_client.Configuration(
    host = "https://cchost:9501/v2"
)


# Enter a context with an instance of the API client
with openapi_cc_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = host_api.HostApi(api_client)
    host = Host(
        operation="startServers",
        servers=[
            HostServersInner(
                class_name="CmonContainerServer",
                hostname="hostname_example",
                cdt_path="cdt_path_example",
            ),
        ],
        cluster_id=1,
        dry_run=True,
        host=HostHost(
            class_name="class_name_example",
            hostname="hostname_example",
            port=1,
        ),
    ) # Host | (Un)Register servers, Shutdown servers, etc

    # example passing only required values which don't have defaults set
    try:
        # Path for managing servers
        api_instance.host_post(host)
    except openapi_cc_client.ApiException as e:
        print("Exception when calling HostApi->host_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **host** | [**Host**](Host.md)| (Un)Register servers, Shutdown servers, etc |

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

