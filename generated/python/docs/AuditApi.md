# openapi_cc_client.AuditApi

All URIs are relative to *https://&lt;cchost&gt;:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**audit_post**](AuditApi.md#audit_post) | **POST** /audit | GetStatistics | GetAlarm | GetAlarms | IgnoreAlarm


# **audit_post**
> audit_post(audit)

GetStatistics | GetAlarm | GetAlarms | IgnoreAlarm

### Example

```python
from __future__ import print_function
import time
import openapi_cc_client
from openapi_cc_client.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to https://<cchost>:9501/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_cc_client.Configuration(
    host = "https://<cchost>:9501/v2"
)


# Enter a context with an instance of the API client
with openapi_cc_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_cc_client.AuditApi(api_client)
    audit = openapi_cc_client.Audit() # Audit | Used to get the audit log entries

    try:
        # GetStatistics | GetAlarm | GetAlarms | IgnoreAlarm
        api_instance.audit_post(audit)
    except ApiException as e:
        print("Exception when calling AuditApi->audit_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audit** | [**Audit**](Audit.md)| Used to get the audit log entries | 

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

