# ClusterResponseHostsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**class_name** | **str** |  | [optional] 
**hostid** | **int** |  | [optional] 
**datadir** | **str** |  | [optional] 
**hostname** | **str** |  | [optional] 
**hostname_data** | **str** |  | [optional] 
**hostname_internal** | **str** |  | [optional] 
**role** | **str** |  | [optional] 
**synchronous** | **bool** |  | [optional] 
**member_role** | **str** |  | [optional] 
**roleid** | **int** |  | [optional] 
**rs** | **str** |  | [optional] 
**version** | **str** |  | [optional] 
**elastic_roles** | **str** |  | [optional] 

## Example

```python
from openapi_cc_client.models.cluster_response_hosts_inner import ClusterResponseHostsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ClusterResponseHostsInner from a JSON string
cluster_response_hosts_inner_instance = ClusterResponseHostsInner.from_json(json)
# print the JSON string representation of the object
print(ClusterResponseHostsInner.to_json())

# convert the object into a dict
cluster_response_hosts_inner_dict = cluster_response_hosts_inner_instance.to_dict()
# create an instance of ClusterResponseHostsInner from a dict
cluster_response_hosts_inner_from_dict = ClusterResponseHostsInner.from_dict(cluster_response_hosts_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


