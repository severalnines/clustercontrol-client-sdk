# openapi_cc_client.StatCmonAgentApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**stat_cmonagent_post**](StatCmonAgentApi.md#stat_cmonagent_post) | **POST** /stat/cmonagent | GetInfo | etc


# **stat_cmonagent_post**
> stat_cmonagent_post(stat_cmon_agent)

GetInfo | etc

### Example


```python
import time
import openapi_cc_client
from openapi_cc_client.api import stat_cmon_agent_api
from openapi_cc_client.model.stat_cmon_agent import StatCmonAgent
from pprint import pprint
# Defining the host is optional and defaults to https://cchost:9501/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_cc_client.Configuration(
    host = "https://cchost:9501/v2"
)


# Enter a context with an instance of the API client
with openapi_cc_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = stat_cmon_agent_api.StatCmonAgentApi(api_client)
    stat_cmon_agent = StatCmonAgent(
        operation="/cmonagent",
        api_key="api_key_example",
        class_name="CmnRequest",
        request_data=StatCmonAgentRequestData(
            begin="begin_example",
            class_name="CmnReadParam",
            end="end_example",
            limit=1,
            mime_type="mime_type_example",
            object_name="object_name_example",
            origin="timeline",
        ),
    ) # StatCmonAgent | Provides calls to access various statistical information about the cluster

    # example passing only required values which don't have defaults set
    try:
        # GetInfo | etc
        api_instance.stat_cmonagent_post(stat_cmon_agent)
    except openapi_cc_client.ApiException as e:
        print("Exception when calling StatCmonAgentApi->stat_cmonagent_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stat_cmon_agent** | [**StatCmonAgent**](StatCmonAgent.md)| Provides calls to access various statistical information about the cluster |

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

