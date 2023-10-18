# JobsJobJobSpecJobDataNode


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backend_name_ro** | **str** |  | [optional] 
**backend_name_rw** | **str** |  | [optional] 
**data_retention** | **str** |  | [optional] 
**data_retention_size** | **int** |  | [optional] 
**hostname** | **str** |  | [optional] 
**lb_admin** | **str** |  | [optional] 
**lb_password** | **str** |  | [optional] 
**lb_policy** | **str** |  | [optional] 
**max_connection_be** | **int** |  | [optional] 
**max_connection_fe** | **int** |  | [optional] 
**port** | **int** |  | [optional] 
**ro_port** | **int** |  | [optional] 
**rw_port** | **int** |  | [optional] 
**rw_splitting** | **bool** |  | [optional] 
**stats_socket** | **str** |  | [optional] 
**timeout_client** | **int** |  | [optional] 
**timeout_server** | **int** |  | [optional] 
**xinetd_allow_from** | **str** |  | [optional] 
**scrape_interval** | **str** |  | [optional] 
**configuration** | [**List[JobsJobJobSpecJobDataNodeConfigurationInner]**](JobsJobJobSpecJobDataNodeConfigurationInner.md) |  | [optional] 

## Example

```python
from openapi_cc_client.models.jobs_job_job_spec_job_data_node import JobsJobJobSpecJobDataNode

# TODO update the JSON string below
json = "{}"
# create an instance of JobsJobJobSpecJobDataNode from a JSON string
jobs_job_job_spec_job_data_node_instance = JobsJobJobSpecJobDataNode.from_json(json)
# print the JSON string representation of the object
print JobsJobJobSpecJobDataNode.to_json()

# convert the object into a dict
jobs_job_job_spec_job_data_node_dict = jobs_job_job_spec_job_data_node_instance.to_dict()
# create an instance of JobsJobJobSpecJobDataNode from a dict
jobs_job_job_spec_job_data_node_form_dict = jobs_job_job_spec_job_data_node.from_dict(jobs_job_job_spec_job_data_node_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


