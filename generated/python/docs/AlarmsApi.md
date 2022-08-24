# openapi_cc_client.AlarmsApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**alarm_post**](AlarmsApi.md#alarm_post) | **POST** /alarm | GetStatistics | GetAlarm | GetAlarms | IgnoreAlarm


# **alarm_post**
> AlarmResponse alarm_post(alarm)

GetStatistics | GetAlarm | GetAlarms | IgnoreAlarm

### Example


```python
import time
import openapi_cc_client
from openapi_cc_client.api import alarms_api
from openapi_cc_client.model.alarm import Alarm
from openapi_cc_client.model.alarm_response import AlarmResponse
from pprint import pprint
# Defining the host is optional and defaults to https://cchost:9501/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_cc_client.Configuration(
    host = "https://cchost:9501/v2"
)


# Enter a context with an instance of the API client
with openapi_cc_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = alarms_api.AlarmsApi(api_client)
    alarm = Alarm(
        operation="getStatistics",
        cluster_id=1,
        alarm_id=1,
        class_name="CmonRpcRequest",
        ignore=True,
    ) # Alarm | All things related to Alarms and Stats

    # example passing only required values which don't have defaults set
    try:
        # GetStatistics | GetAlarm | GetAlarms | IgnoreAlarm
        api_response = api_instance.alarm_post(alarm)
        pprint(api_response)
    except openapi_cc_client.ApiException as e:
        print("Exception when calling AlarmsApi->alarm_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alarm** | [**Alarm**](Alarm.md)| All things related to Alarms and Stats |

### Return type

[**AlarmResponse**](AlarmResponse.md)

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

