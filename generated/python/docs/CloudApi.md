# openapi_cc_client.CloudApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cloud_post**](CloudApi.md#cloud_post) | **POST** /cloud | VerifyCredentials | ListCredentials | etc


# **cloud_post**
> cloud_post(cloud)

VerifyCredentials | ListCredentials | etc

### Example


```python
import time
import openapi_cc_client
from openapi_cc_client.api import cloud_api
from openapi_cc_client.model.cloud import Cloud
from pprint import pprint
# Defining the host is optional and defaults to https://cchost:9501/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_cc_client.Configuration(
    host = "https://cchost:9501/v2"
)


# Enter a context with an instance of the API client
with openapi_cc_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = cloud_api.CloudApi(api_client)
    cloud = Cloud(
        operation="verifyCredentials",
        provider="provider_example",
        name="name_example",
        comment="comment_example",
        id=1,
        credentials=CloudCredentials(
            access_key_id="access_key_id_example",
            access_key_secret="access_key_secret_example",
            access_key_region="access_key_region_example",
        ),
    ) # Cloud | calls to manage the cloud-credentials

    # example passing only required values which don't have defaults set
    try:
        # VerifyCredentials | ListCredentials | etc
        api_instance.cloud_post(cloud)
    except openapi_cc_client.ApiException as e:
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

