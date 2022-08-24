# openapi_cc_client.StatPrometheusApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**stat_prometheus_query_post**](StatPrometheusApi.md#stat_prometheus_query_post) | **POST** /stat/prometheus/query | GetInfo | etc


# **stat_prometheus_query_post**
> stat_prometheus_query_post(stat_prometheus)

GetInfo | etc

### Example


```python
import time
import openapi_cc_client
from openapi_cc_client.api import stat_prometheus_api
from openapi_cc_client.model.stat_prometheus import StatPrometheus
from pprint import pprint
# Defining the host is optional and defaults to https://cchost:9501/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_cc_client.Configuration(
    host = "https://cchost:9501/v2"
)


# Enter a context with an instance of the API client
with openapi_cc_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = stat_prometheus_api.StatPrometheusApi(api_client)
    stat_prometheus = StatPrometheus(
        operation="/prometheus",
        cluster_id=1,
        cluster_name="cluster_name_example",
        queries=[
            StatPrometheusQueriesInner(
                query="query_example",
                step=1,
            ),
        ],
        start=1,
        end=1,
        step=1,
        returnfrom=1,
    ) # StatPrometheus | Provides calls to access various statistical information about the cluster

    # example passing only required values which don't have defaults set
    try:
        # GetInfo | etc
        api_instance.stat_prometheus_query_post(stat_prometheus)
    except openapi_cc_client.ApiException as e:
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

