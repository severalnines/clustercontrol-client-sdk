# openapi_cc_client.CloudApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cloud_post**](CloudApi.md#cloud_post) | **POST** /cloud | VerifyCredentials | ListCredentials | etc


# **cloud_post**
> cloud_post(cloud)

VerifyCredentials | ListCredentials | etc

### Example


```python
import openapi_cc_client
from openapi_cc_client.models.cloud import Cloud
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
    api_instance = openapi_cc_client.CloudApi(api_client)
    cloud = openapi_cc_client.Cloud() # Cloud | calls to manage the cloud-credentials

    try:
        # VerifyCredentials | ListCredentials | etc
        api_instance.cloud_post(cloud)
    except Exception as e:
        print("Exception when calling CloudApi->cloud_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloud** | [**Cloud**](Cloud.md)| calls to manage the cloud-credentials | 

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

