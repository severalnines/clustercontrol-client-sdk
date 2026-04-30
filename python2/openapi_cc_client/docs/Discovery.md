# Discovery


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | **str** |  | 
**new_cluster_name** | **str** |  | [optional] 
**check_if_already_registered** | **bool** |  | [optional] 
**check_job** | **bool** |  | [optional] 
**check_ssh_sudo** | **bool** |  | [optional] 
**nodes** | [**List[DiscoveryNodesInner]**](DiscoveryNodesInner.md) |  | [optional] 
**job** | [**DiscoveryJob**](DiscoveryJob.md) |  | [optional] 
**ssh_credentials** | [**DiscoverySshCredentials**](DiscoverySshCredentials.md) |  | [optional] 

## Example

```python
from openapi_cc_client.models.discovery import Discovery

# TODO update the JSON string below
json = "{}"
# create an instance of Discovery from a JSON string
discovery_instance = Discovery.from_json(json)
# print the JSON string representation of the object
print(Discovery.to_json())

# convert the object into a dict
discovery_dict = discovery_instance.to_dict()
# create an instance of Discovery from a dict
discovery_from_dict = Discovery.from_dict(discovery_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


