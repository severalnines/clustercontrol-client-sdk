# AlarmResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | **str** |  | [optional] 
**cluster_id** | **int** |  | [optional] 
**alarm_id** | **int** |  | [optional] 
**class_name** | **str** |  | [optional] 
**ignore** | **bool** |  | [optional] 

## Example

```python
from openapi_cc_client.models.alarm_response import AlarmResponse

# TODO update the JSON string below
json = "{}"
# create an instance of AlarmResponse from a JSON string
alarm_response_instance = AlarmResponse.from_json(json)
# print the JSON string representation of the object
print AlarmResponse.to_json()

# convert the object into a dict
alarm_response_dict = alarm_response_instance.to_dict()
# create an instance of AlarmResponse from a dict
alarm_response_form_dict = alarm_response.from_dict(alarm_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


