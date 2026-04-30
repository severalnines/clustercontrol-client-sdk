# JobsJobJobSpecJobDataReplicaSetsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rs** | **str** |  | [optional] 
**members** | [**List[JobsJobJobSpecJobDataReplicaSetsInnerMembersInner]**](JobsJobJobSpecJobDataReplicaSetsInnerMembersInner.md) |  | [optional] 

## Example

```python
from openapi_cc_client.models.jobs_job_job_spec_job_data_replica_sets_inner import JobsJobJobSpecJobDataReplicaSetsInner

# TODO update the JSON string below
json = "{}"
# create an instance of JobsJobJobSpecJobDataReplicaSetsInner from a JSON string
jobs_job_job_spec_job_data_replica_sets_inner_instance = JobsJobJobSpecJobDataReplicaSetsInner.from_json(json)
# print the JSON string representation of the object
print(JobsJobJobSpecJobDataReplicaSetsInner.to_json())

# convert the object into a dict
jobs_job_job_spec_job_data_replica_sets_inner_dict = jobs_job_job_spec_job_data_replica_sets_inner_instance.to_dict()
# create an instance of JobsJobJobSpecJobDataReplicaSetsInner from a dict
jobs_job_job_spec_job_data_replica_sets_inner_from_dict = JobsJobJobSpecJobDataReplicaSetsInner.from_dict(jobs_job_job_spec_job_data_replica_sets_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


