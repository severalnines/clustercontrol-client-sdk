# openapi_cc_client.DiscoveryApi

All URIs are relative to *https://&lt;cchost&gt;:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**discovery_post**](DiscoveryApi.md#discovery_post) | **POST** /discovery | CheckClusterName | CheckHosts | GetSupportedClusterTypes


# **discovery_post**
> discovery_post(discovery)

CheckClusterName | CheckHosts | GetSupportedClusterTypes

### Example

```python
import time
import os
import openapi_cc_client
from openapi_cc_client.models.discovery import Discovery
from openapi_cc_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://<cchost>:9501/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_cc_client.Configuration(
    host = "https://<cchost>:9501/v2"
)


# Enter a context with an instance of the API client
with openapi_cc_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_cc_client.DiscoveryApi(api_client)
    discovery = openapi_cc_client.Discovery() # Discovery | All things related to Clusters and cluster Hosts

    try:
        # CheckClusterName | CheckHosts | GetSupportedClusterTypes
        api_instance.discovery_post(discovery)
    except Exception as e:
        print("Exception when calling DiscoveryApi->discovery_post: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **discovery** | [**Discovery**](Discovery.md)| All things related to Clusters and cluster Hosts | 

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

