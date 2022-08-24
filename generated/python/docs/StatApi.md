# openapi_cc_client.StatApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**stat_post**](StatApi.md#stat_post) | **POST** /stat | GetInfo | etc


# **stat_post**
> stat_post(stat)

GetInfo | etc

### Example


```python
import time
import openapi_cc_client
from openapi_cc_client.api import stat_api
from openapi_cc_client.model.stat import Stat
from pprint import pprint
# Defining the host is optional and defaults to https://cchost:9501/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_cc_client.Configuration(
    host = "https://cchost:9501/v2"
)


# Enter a context with an instance of the API client
with openapi_cc_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = stat_api.StatApi(api_client)
    stat = Stat(
        operation="getInfo",
        cluster_id=1,
        name="cpustat",
        start_datetime="start_datetime_example",
        end_datetime="end_datetime_example",
        with_hosts=True,
        calculate_per_sec=True,
    ) # Stat | Provides calls to access various statistical information about the cluster

    # example passing only required values which don't have defaults set
    try:
        # GetInfo | etc
        api_instance.stat_post(stat)
    except openapi_cc_client.ApiException as e:
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
