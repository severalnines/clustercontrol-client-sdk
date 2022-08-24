# openapi_cc_client.MaintenanceApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**maintenance_post**](MaintenanceApi.md#maintenance_post) | **POST** /maintenance | CreateJobInstance | etc


# **maintenance_post**
> maintenance_post(maintenance)

CreateJobInstance | etc

### Example


```python
import time
import openapi_cc_client
from openapi_cc_client.api import maintenance_api
from openapi_cc_client.model.maintenance import Maintenance
from pprint import pprint
# Defining the host is optional and defaults to https://cchost:9501/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_cc_client.Configuration(
    host = "https://cchost:9501/v2"
)


# Enter a context with an instance of the API client
with openapi_cc_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = maintenance_api.MaintenanceApi(api_client)
    maintenance = Maintenance(
        operation="addMaintenance",
        cluster_id=1,
        deadline="deadline_example",
        initiate="initiate_example",
        hostname="hostname_example",
        uuid="uuid_example",
    ) # Maintenance | Creating, deleting and obtaining maintenance periods

    # example passing only required values which don't have defaults set
    try:
        # CreateJobInstance | etc
        api_instance.maintenance_post(maintenance)
    except openapi_cc_client.ApiException as e:
        print("Exception when calling MaintenanceApi->maintenance_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **maintenance** | [**Maintenance**](Maintenance.md)| Creating, deleting and obtaining maintenance periods |

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

