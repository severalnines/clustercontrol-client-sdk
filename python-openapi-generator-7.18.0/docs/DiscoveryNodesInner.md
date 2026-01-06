# DiscoveryNodesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**class_name** | **str** |  | [optional] 
**host_name** | **str** | IP address or Hostname | [optional] 
**port** | **int** |  | [optional] 

## Example

```python
from openapi_cc_client.models.discovery_nodes_inner import DiscoveryNodesInner

# TODO update the JSON string below
json = "{}"
# create an instance of DiscoveryNodesInner from a JSON string
discovery_nodes_inner_instance = DiscoveryNodesInner.from_json(json)
# print the JSON string representation of the object
print(DiscoveryNodesInner.to_json())

# convert the object into a dict
discovery_nodes_inner_dict = discovery_nodes_inner_instance.to_dict()
# create an instance of DiscoveryNodesInner from a dict
discovery_nodes_inner_from_dict = DiscoveryNodesInner.from_dict(discovery_nodes_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


