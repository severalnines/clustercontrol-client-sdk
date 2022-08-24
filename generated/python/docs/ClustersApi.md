# openapi_cc_client.ClustersApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clusters_post**](ClustersApi.md#clusters_post) | **POST** /clusters | GetClusterInfo | Get/Set Config | etc


# **clusters_post**
> clusters_post(clusters)

GetClusterInfo | Get/Set Config | etc

### Example


```python
import time
import openapi_cc_client
from openapi_cc_client.api import clusters_api
from openapi_cc_client.model.clusters import Clusters
from pprint import pprint
# Defining the host is optional and defaults to https://cchost:9501/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_cc_client.Configuration(
    host = "https://cchost:9501/v2"
)


# Enter a context with an instance of the API client
with openapi_cc_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = clusters_api.ClustersApi(api_client)
    clusters = Clusters(
        operation="getallclusterinfo",
        cluster_id=1,
        cluster_name="cluster_name_example",
        with_hosts=True,
        with_sheet_info=True,
        configuration=[
            ClustersConfigurationInner(
                name="name_example",
                value="value_example",
            ),
        ],
        account=ClustersAccount(
            class_name="CmonAccount",
            grants="grants_example",
            host_allow="host_allow_example",
            own_database="own_database_example",
            privileges="privileges_example",
            user_name="user_name_example",
            password="password_example",
        ),
        filter_strings="filter_strings_example",
        limit=1,
        offset=1,
        database=ClustersDatabase(
            class_name="CmonDataBase",
            database_name="database_name_example",
        ),
        nodes=[
            "nodes_example",
        ],
    ) # Clusters | Get cluster information

    # example passing only required values which don't have defaults set
    try:
        # GetClusterInfo | Get/Set Config | etc
        api_instance.clusters_post(clusters)
    except openapi_cc_client.ApiException as e:
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

