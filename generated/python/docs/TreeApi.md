# openapi_cc_client.TreeApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tree_post**](TreeApi.md#tree_post) | **POST** /tree | AddACL | RemoveAcl | etc


# **tree_post**
> tree_post(tree)

AddACL | RemoveAcl | etc

### Example


```python
import time
import openapi_cc_client
from openapi_cc_client.api import tree_api
from openapi_cc_client.model.tree import Tree
from pprint import pprint
# Defining the host is optional and defaults to https://cchost:9501/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_cc_client.Configuration(
    host = "https://cchost:9501/v2"
)


# Enter a context with an instance of the API client
with openapi_cc_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = tree_api.TreeApi(api_client)
    tree = Tree(
        operation="addAcl",
        acl="acl_example",
        path="path_example",
    ) # Tree | Manipulate ACLs for Groups and Users that are maintained by the Cmon controller

    # example passing only required values which don't have defaults set
    try:
        # AddACL | RemoveAcl | etc
        api_instance.tree_post(tree)
    except openapi_cc_client.ApiException as e:
        print("Exception when calling TreeApi->tree_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tree** | [**Tree**](Tree.md)| Manipulate ACLs for Groups and Users that are maintained by the Cmon controller |

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

