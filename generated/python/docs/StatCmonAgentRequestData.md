# StatCmonAgentRequestData


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**begin** | **str** | e.g. \&quot;2021-06-07T09:41:43.636Z\&quot; | [optional] 
**class_name** | **str** |  | [optional] 
**end** | **str** | e.g. \&quot;2021-06-07T09:41:43.636Z\&quot; | [optional] 
**limit** | **int** |  | [optional] 
**mime_type** | **str** |  | [optional] 
**object_name** | **str** |  | [optional] 
**origin** | **str** |  | [optional] 

## Example

```python
from openapi_cc_client.models.stat_cmon_agent_request_data import StatCmonAgentRequestData

# TODO update the JSON string below
json = "{}"
# create an instance of StatCmonAgentRequestData from a JSON string
stat_cmon_agent_request_data_instance = StatCmonAgentRequestData.from_json(json)
# print the JSON string representation of the object
print StatCmonAgentRequestData.to_json()

# convert the object into a dict
stat_cmon_agent_request_data_dict = stat_cmon_agent_request_data_instance.to_dict()
# create an instance of StatCmonAgentRequestData from a dict
stat_cmon_agent_request_data_form_dict = stat_cmon_agent_request_data.from_dict(stat_cmon_agent_request_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


