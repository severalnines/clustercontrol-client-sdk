# ClusterResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**class_name** | **str** |  | [optional] 
**operation** | **str** |  | [optional] 
**cluster_id** | **int** |  | [optional] 
**cluster_name** | **str** |  | [optional] 
**cluster_type** | **str** |  | [optional] 
**vendor** | **str** |  | [optional] 
**version** | **str** |  | [optional] 
**tags** | **List[str]** |  | [optional] 
**hosts** | [**List[ClusterResponseHostsInner]**](ClusterResponseHostsInner.md) |  | [optional] 

## Example

```python
from openapi_cc_client.models.cluster_response import ClusterResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ClusterResponse from a JSON string
cluster_response_instance = ClusterResponse.from_json(json)
# print the JSON string representation of the object
print(ClusterResponse.to_json())

# convert the object into a dict
cluster_response_dict = cluster_response_instance.to_dict()
# create an instance of ClusterResponse from a dict
cluster_response_from_dict = ClusterResponse.from_dict(cluster_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


