# DiscoveryJob

Also ckeck the passed create_cluster job

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**class_name** | **str** |  | [optional] 
**job_spec** | [**DiscoveryJobJobSpec**](DiscoveryJobJobSpec.md) |  | [optional] 

## Example

```python
from openapi_cc_client.models.discovery_job import DiscoveryJob

# TODO update the JSON string below
json = "{}"
# create an instance of DiscoveryJob from a JSON string
discovery_job_instance = DiscoveryJob.from_json(json)
# print the JSON string representation of the object
print(DiscoveryJob.to_json())

# convert the object into a dict
discovery_job_dict = discovery_job_instance.to_dict()
# create an instance of DiscoveryJob from a dict
discovery_job_from_dict = DiscoveryJob.from_dict(discovery_job_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


