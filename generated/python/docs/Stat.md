# Stat


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | **str** |  | 
**cluster_id** | **int** |  | [optional] 
**name** | **str** | stat name. e.g. cpustat | [optional] 
**start_datetime** | **str** | e.g. \&quot;15:20\&quot; | [optional] 
**end_datetime** | **str** | e.g. \&quot;15:21\&quot; | [optional] 
**with_hosts** | **bool** |  | [optional] 
**calculate_per_sec** | **bool** |  | [optional] 

## Example

```python
from openapi_cc_client.models.stat import Stat

# TODO update the JSON string below
json = "{}"
# create an instance of Stat from a JSON string
stat_instance = Stat.from_json(json)
# print the JSON string representation of the object
print(Stat.to_json())

# convert the object into a dict
stat_dict = stat_instance.to_dict()
# create an instance of Stat from a dict
stat_from_dict = Stat.from_dict(stat_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


