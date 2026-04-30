# JobsJob


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**class_name** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**status** | **str** |  | [optional] 
**recurrence** | **str** | e.g. \&quot;2 * * * *\&quot; | [optional] 
**tags** | **List[str]** |  | [optional] 
**job_spec** | [**JobsJobJobSpec**](JobsJobJobSpec.md) |  | [optional] 

## Example

```python
from openapi_cc_client.models.jobs_job import JobsJob

# TODO update the JSON string below
json = "{}"
# create an instance of JobsJob from a JSON string
jobs_job_instance = JobsJob.from_json(json)
# print the JSON string representation of the object
print(JobsJob.to_json())

# convert the object into a dict
jobs_job_dict = jobs_job_instance.to_dict()
# create an instance of JobsJob from a dict
jobs_job_from_dict = JobsJob.from_dict(jobs_job_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


