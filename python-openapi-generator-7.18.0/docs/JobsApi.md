# openapi_cc_client.JobsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**jobs_post**](JobsApi.md#jobs_post) | **POST** /jobs | CreateJobInstance | etc


# **jobs_post**
> jobs_post(jobs)

CreateJobInstance | etc

### Example


```python
import openapi_cc_client
from openapi_cc_client.models.jobs import Jobs
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
    api_instance = openapi_cc_client.JobsApi(api_client)
    jobs = openapi_cc_client.Jobs() # Jobs | Creating, manipulating, and obtaining information about jobs

    try:
        # CreateJobInstance | etc
        api_instance.jobs_post(jobs)
    except Exception as e:
        print("Exception when calling JobsApi->jobs_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobs** | [**Jobs**](Jobs.md)| Creating, manipulating, and obtaining information about jobs | 

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

