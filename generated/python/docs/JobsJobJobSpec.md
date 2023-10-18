# JobsJobJobSpec


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**command** | **str** |  | [optional] 
**id** | **int** |  | [optional] 
**job_data** | [**JobsJobJobSpecJobData**](JobsJobJobSpecJobData.md) |  | [optional] 

## Example

```python
from openapi_cc_client.models.jobs_job_job_spec import JobsJobJobSpec

# TODO update the JSON string below
json = "{}"
# create an instance of JobsJobJobSpec from a JSON string
jobs_job_job_spec_instance = JobsJobJobSpec.from_json(json)
# print the JSON string representation of the object
print JobsJobJobSpec.to_json()

# convert the object into a dict
jobs_job_job_spec_dict = jobs_job_job_spec_instance.to_dict()
# create an instance of JobsJobJobSpec from a dict
jobs_job_job_spec_form_dict = jobs_job_job_spec.from_dict(jobs_job_job_spec_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


