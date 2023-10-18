# JobsJobJobSpecJobDataNodeAdressesInner


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hostname** | **str** |  | [optional] 
**max_connection** | **int** |  | [optional] 
**max_replication_lag** | **int** |  | [optional] 
**port** | **int** |  | [optional] 
**weight** | **int** |  | [optional] 

## Example

```python
from openapi_cc_client.models.jobs_job_job_spec_job_data_node_adresses_inner import JobsJobJobSpecJobDataNodeAdressesInner

# TODO update the JSON string below
json = "{}"
# create an instance of JobsJobJobSpecJobDataNodeAdressesInner from a JSON string
jobs_job_job_spec_job_data_node_adresses_inner_instance = JobsJobJobSpecJobDataNodeAdressesInner.from_json(json)
# print the JSON string representation of the object
print JobsJobJobSpecJobDataNodeAdressesInner.to_json()

# convert the object into a dict
jobs_job_job_spec_job_data_node_adresses_inner_dict = jobs_job_job_spec_job_data_node_adresses_inner_instance.to_dict()
# create an instance of JobsJobJobSpecJobDataNodeAdressesInner from a dict
jobs_job_job_spec_job_data_node_adresses_inner_form_dict = jobs_job_job_spec_job_data_node_adresses_inner.from_dict(jobs_job_job_spec_job_data_node_adresses_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


