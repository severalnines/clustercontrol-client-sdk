# DiscoveryJobJobSpec


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**command** | **str** |  | [optional] 
**job_data** | [**DiscoveryJobJobSpecJobData**](DiscoveryJobJobSpecJobData.md) |  | [optional] 

## Example

```python
from openapi_cc_client.models.discovery_job_job_spec import DiscoveryJobJobSpec

# TODO update the JSON string below
json = "{}"
# create an instance of DiscoveryJobJobSpec from a JSON string
discovery_job_job_spec_instance = DiscoveryJobJobSpec.from_json(json)
# print the JSON string representation of the object
print(DiscoveryJobJobSpec.to_json())

# convert the object into a dict
discovery_job_job_spec_dict = discovery_job_job_spec_instance.to_dict()
# create an instance of DiscoveryJobJobSpec from a dict
discovery_job_job_spec_from_dict = DiscoveryJobJobSpec.from_dict(discovery_job_job_spec_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


