# Jobs

Creating and manipulating jobs, reading information about jobs

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | **str** |  | 
**cluster_id** | **int** |  | [optional] 
**job_id** | **int** |  | [optional] 
**signal** | **int** |  | [optional] 
**ascending** | **bool** |  | [optional] 
**limit** | **int** |  | [optional] 
**offset** | **int** |  | [optional] 
**log_level** | **str** |  | [optional] 
**job** | [**JobsJob**](JobsJob.md) |  | [optional] 

## Example

```python
from openapi_cc_client.models.jobs import Jobs

# TODO update the JSON string below
json = "{}"
# create an instance of Jobs from a JSON string
jobs_instance = Jobs.from_json(json)
# print the JSON string representation of the object
print Jobs.to_json()

# convert the object into a dict
jobs_dict = jobs_instance.to_dict()
# create an instance of Jobs from a dict
jobs_form_dict = jobs.from_dict(jobs_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


