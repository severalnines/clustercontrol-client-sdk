# HostHost


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**class_name** | **str** |  | [optional] 
**hostname** | **str** |  | [optional] 
**port** | **int** |  | [optional] 

## Example

```python
from openapi_cc_client.models.host_host import HostHost

# TODO update the JSON string below
json = "{}"
# create an instance of HostHost from a JSON string
host_host_instance = HostHost.from_json(json)
# print the JSON string representation of the object
print HostHost.to_json()

# convert the object into a dict
host_host_dict = host_host_instance.to_dict()
# create an instance of HostHost from a dict
host_host_form_dict = host_host.from_dict(host_host_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


