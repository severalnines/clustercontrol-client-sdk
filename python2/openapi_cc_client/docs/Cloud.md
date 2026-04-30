# Cloud


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | **str** |  | 
**provider** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**comment** | **str** |  | [optional] 
**id** | **int** |  | [optional] 
**credentials** | [**CloudCredentials**](CloudCredentials.md) |  | [optional] 

## Example

```python
from openapi_cc_client.models.cloud import Cloud

# TODO update the JSON string below
json = "{}"
# create an instance of Cloud from a JSON string
cloud_instance = Cloud.from_json(json)
# print the JSON string representation of the object
print(Cloud.to_json())

# convert the object into a dict
cloud_dict = cloud_instance.to_dict()
# create an instance of Cloud from a dict
cloud_from_dict = Cloud.from_dict(cloud_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


