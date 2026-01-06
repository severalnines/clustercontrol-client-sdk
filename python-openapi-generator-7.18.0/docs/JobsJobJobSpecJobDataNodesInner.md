# JobsJobJobSpecJobDataNodesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**class_name** | **str** |  | [optional] 
**cdt_path** | **str** |  | [optional] 
**acl** | **str** |  | [optional] 
**clusterid** | **int** |  | [optional] 
**ip** | **str** |  | [optional] 
**maintenance_mode** | **str** |  | [optional] 
**maintenance_mode_active** | **bool** |  | [optional] 
**timestamp** | **int** |  | [optional] 
**unique_id** | **int** |  | [optional] 
**hostname** | **str** |  | [optional] 
**hostname_data** | **str** |  | [optional] 
**hostname_internal** | **str** |  | [optional] 
**port** | **str** |  | [optional] 
**nodetype** | **str** |  | [optional] 
**configfile** | **str** |  | [optional] 
**datadir** | **str** |  | [optional] 
**backup_dir** | **str** |  | [optional] 
**synchronous** | **bool** |  | [optional] 
**protocol** | **str** |  | [optional] 
**roles** | **str** |  | [optional] 
**role** | **str** |  | [optional] 

## Example

```python
from openapi_cc_client.models.jobs_job_job_spec_job_data_nodes_inner import JobsJobJobSpecJobDataNodesInner

# TODO update the JSON string below
json = "{}"
# create an instance of JobsJobJobSpecJobDataNodesInner from a JSON string
jobs_job_job_spec_job_data_nodes_inner_instance = JobsJobJobSpecJobDataNodesInner.from_json(json)
# print the JSON string representation of the object
print(JobsJobJobSpecJobDataNodesInner.to_json())

# convert the object into a dict
jobs_job_job_spec_job_data_nodes_inner_dict = jobs_job_job_spec_job_data_nodes_inner_instance.to_dict()
# create an instance of JobsJobJobSpecJobDataNodesInner from a dict
jobs_job_job_spec_job_data_nodes_inner_from_dict = JobsJobJobSpecJobDataNodesInner.from_dict(jobs_job_job_spec_job_data_nodes_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


