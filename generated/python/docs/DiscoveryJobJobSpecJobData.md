# DiscoveryJobJobSpecJobData


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cluster_type** | **str** |  | [optional] 
**mysql_version** | **str** |  | [optional] 
**vendor** | **str** |  | [optional] 
**nodes** | [**List[DiscoveryJobJobSpecJobDataNodesInner]**](DiscoveryJobJobSpecJobDataNodesInner.md) |  | [optional] 

## Example

```python
from openapi_cc_client.models.discovery_job_job_spec_job_data import DiscoveryJobJobSpecJobData

# TODO update the JSON string below
json = "{}"
# create an instance of DiscoveryJobJobSpecJobData from a JSON string
discovery_job_job_spec_job_data_instance = DiscoveryJobJobSpecJobData.from_json(json)
# print the JSON string representation of the object
print DiscoveryJobJobSpecJobData.to_json()

# convert the object into a dict
discovery_job_job_spec_job_data_dict = discovery_job_job_spec_job_data_instance.to_dict()
# create an instance of DiscoveryJobJobSpecJobData from a dict
discovery_job_job_spec_job_data_form_dict = discovery_job_job_spec_job_data.from_dict(discovery_job_job_spec_job_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


