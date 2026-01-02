# StatCmonAgent


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | **str** |  | 
**api_key** | **str** |  | [optional] 
**class_name** | **str** |  | [optional] 
**request_data** | [**StatCmonAgentRequestData**](StatCmonAgentRequestData.md) |  | [optional] 

## Example

```python
from openapi_cc_client.models.stat_cmon_agent import StatCmonAgent

# TODO update the JSON string below
json = "{}"
# create an instance of StatCmonAgent from a JSON string
stat_cmon_agent_instance = StatCmonAgent.from_json(json)
# print the JSON string representation of the object
print(StatCmonAgent.to_json())

# convert the object into a dict
stat_cmon_agent_dict = stat_cmon_agent_instance.to_dict()
# create an instance of StatCmonAgent from a dict
stat_cmon_agent_from_dict = StatCmonAgent.from_dict(stat_cmon_agent_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


