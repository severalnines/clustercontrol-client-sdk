# openapi_cc_client.StatApi

All URIs are relative to *https://&lt;cchost&gt;:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**stat_post**](StatApi.md#stat_post) | **POST** /stat | GetInfo | etc


# **stat_post**
> stat_post(stat)

GetInfo | etc

### Example

```python
import time
import os
import openapi_cc_client
from openapi_cc_client.models.stat import Stat
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
    api_instance = openapi_cc_client.StatApi(api_client)
    stat = openapi_cc_client.Stat() # Stat | Provides calls to access various statistical information about the cluster

    try:
        # GetInfo | etc
        api_instance.stat_post(stat)
    except Exception as e:
        print("Exception when calling StatApi->stat_post: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stat** | [**Stat**](Stat.md)| Provides calls to access various statistical information about the cluster | 

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

