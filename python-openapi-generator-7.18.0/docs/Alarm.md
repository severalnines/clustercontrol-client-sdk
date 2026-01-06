# Alarm


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | **str** |  | 
**cluster_id** | **int** |  | [optional] 
**alarm_id** | **int** |  | [optional] 
**class_name** | **str** |  | [optional] 
**ignore** | **bool** |  | [optional] 

## Example

```python
from openapi_cc_client.models.alarm import Alarm

# TODO update the JSON string below
json = "{}"
# create an instance of Alarm from a JSON string
alarm_instance = Alarm.from_json(json)
# print the JSON string representation of the object
print(Alarm.to_json())

# convert the object into a dict
alarm_dict = alarm_instance.to_dict()
# create an instance of Alarm from a dict
alarm_from_dict = Alarm.from_dict(alarm_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


