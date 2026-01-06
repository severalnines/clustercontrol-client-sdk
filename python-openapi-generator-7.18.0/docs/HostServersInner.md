# HostServersInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**class_name** | **str** |  | [optional] 
**hostname** | **str** |  | [optional] 
**cdt_path** | **str** |  | [optional] 

## Example

```python
from openapi_cc_client.models.host_servers_inner import HostServersInner

# TODO update the JSON string below
json = "{}"
# create an instance of HostServersInner from a JSON string
host_servers_inner_instance = HostServersInner.from_json(json)
# print the JSON string representation of the object
print(HostServersInner.to_json())

# convert the object into a dict
host_servers_inner_dict = host_servers_inner_instance.to_dict()
# create an instance of HostServersInner from a dict
host_servers_inner_from_dict = HostServersInner.from_dict(host_servers_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


