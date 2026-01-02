# openapi_cc_client.AlarmsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**alarm_post**](AlarmsApi.md#alarm_post) | **POST** /alarm | GetStatistics | GetAlarm | GetAlarms | IgnoreAlarm


# **alarm_post**
> AlarmResponse alarm_post(alarm)

GetStatistics | GetAlarm | GetAlarms | IgnoreAlarm

### Example


```python
import openapi_cc_client
from openapi_cc_client.models.alarm import Alarm
from openapi_cc_client.models.alarm_response import AlarmResponse
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
    api_instance = openapi_cc_client.AlarmsApi(api_client)
    alarm = openapi_cc_client.Alarm() # Alarm | All things related to Alarms and Stats

    try:
        # GetStatistics | GetAlarm | GetAlarms | IgnoreAlarm
        api_response = api_instance.alarm_post(alarm)
        print("The response of AlarmsApi->alarm_post:\n")
        pprint(api_response)
    except Exception as e:
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

