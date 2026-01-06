# openapi_cc_client.StatPrometheusApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**stat_prometheus_query_post**](StatPrometheusApi.md#stat_prometheus_query_post) | **POST** /stat/prometheus/query | GetInfo | etc


# **stat_prometheus_query_post**
> stat_prometheus_query_post(stat_prometheus)

GetInfo | etc

### Example


```python
import openapi_cc_client
from openapi_cc_client.models.stat_prometheus import StatPrometheus
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
    api_instance = openapi_cc_client.StatPrometheusApi(api_client)
    stat_prometheus = openapi_cc_client.StatPrometheus() # StatPrometheus | Provides calls to access various statistical information about the cluster

    try:
        # GetInfo | etc
        api_instance.stat_prometheus_query_post(stat_prometheus)
    except Exception as e:
        print("Exception when calling StatPrometheusApi->stat_prometheus_query_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stat_prometheus** | [**StatPrometheus**](StatPrometheus.md)| Provides calls to access various statistical information about the cluster | 

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

