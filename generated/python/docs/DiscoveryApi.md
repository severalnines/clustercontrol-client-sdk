# openapi_cc_client.DiscoveryApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**discovery_post**](DiscoveryApi.md#discovery_post) | **POST** /discovery | CheckClusterName | CheckHosts | GetSupportedClusterTypes


# **discovery_post**
> discovery_post(discovery)

CheckClusterName | CheckHosts | GetSupportedClusterTypes

### Example


```python
import time
import openapi_cc_client
from openapi_cc_client.api import discovery_api
from openapi_cc_client.model.discovery import Discovery
from pprint import pprint
# Defining the host is optional and defaults to https://cchost:9501/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_cc_client.Configuration(
    host = "https://cchost:9501/v2"
)


# Enter a context with an instance of the API client
with openapi_cc_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = discovery_api.DiscoveryApi(api_client)
    discovery = Discovery(
        operation="checkClusterName",
        new_cluster_name="new_cluster_name_example",
        check_if_already_registered=True,
        check_job=True,
        check_ssh_sudo=True,
        nodes=[
            DiscoveryNodesInner(
                class_name="CmonHost",
                host_name="host_name_example",
                port=1,
            ),
        ],
        job=DiscoveryJob(
            class_name="CmonJobInstance",
            job_spec=DiscoveryJobJobSpec(
                command="create_cluster",
                job_data=DiscoveryJobJobSpecJobData(
                    cluster_type="group_replication",
                    mysql_version="mysql_version_example",
                    vendor="vendor_example",
                    nodes=[
                        DiscoveryJobJobSpecJobDataNodesInner(
                            class_name="CmonHost",
                            host_name="host_name_example",
                        ),
                    ],
                ),
            ),
        ),
        ssh_credentials=DiscoverySshCredentials(
            class_name="class_name_example",
            user_name="user_name_example",
            password="password_example",
            ssh_keyfile="ssh_keyfile_example",
        ),
    ) # Discovery | All things related to Clusters and cluster Hosts

    # example passing only required values which don't have defaults set
    try:
        # CheckClusterName | CheckHosts | GetSupportedClusterTypes
        api_instance.discovery_post(discovery)
    except openapi_cc_client.ApiException as e:
        print("Exception when calling DiscoveryApi->discovery_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **discovery** | [**Discovery**](Discovery.md)| All things related to Clusters and cluster Hosts |

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

