# Host


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | **str** |  | 
**servers** | [**List[HostServersInner]**](HostServersInner.md) |  | [optional] 
**cluster_id** | **int** |  | [optional] 
**dry_run** | **bool** |  | [optional] 
**host** | [**HostHost**](HostHost.md) |  | [optional] 

## Example

```python
from openapi_cc_client.models.host import Host

# TODO update the JSON string below
json = "{}"
# create an instance of Host from a JSON string
host_instance = Host.from_json(json)
# print the JSON string representation of the object
print Host.to_json()

# convert the object into a dict
host_dict = host_instance.to_dict()
# create an instance of Host from a dict
host_form_dict = host.from_dict(host_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


