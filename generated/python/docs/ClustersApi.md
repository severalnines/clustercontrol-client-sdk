# openapi_cc_client.ClustersApi

All URIs are relative to *https://&lt;cchost&gt;:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clusters_post**](ClustersApi.md#clusters_post) | **POST** /clusters | GetClusterInfo | Get/Set Config | etc


# **clusters_post**
> clusters_post(clusters)

GetClusterInfo | Get/Set Config | etc

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
    api_instance = openapi_cc_client.ClustersApi(api_client)
    clusters = openapi_cc_client.Clusters() # Clusters | Get cluster information

    try:
        # GetClusterInfo | Get/Set Config | etc
        api_instance.clusters_post(clusters)
    except ApiException as e:
        print("Exception when calling ClustersApi->clusters_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusters** | [**Clusters**](Clusters.md)| Get cluster information | 

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

