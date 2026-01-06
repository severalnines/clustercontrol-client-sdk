# CloudCredentials


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access_key_id** | **str** |  | [optional] 
**access_key_secret** | **str** |  | [optional] 
**access_key_region** | **str** |  | [optional] 

## Example

```python
from openapi_cc_client.models.cloud_credentials import CloudCredentials

# TODO update the JSON string below
json = "{}"
# create an instance of CloudCredentials from a JSON string
cloud_credentials_instance = CloudCredentials.from_json(json)
# print the JSON string representation of the object
print(CloudCredentials.to_json())

# convert the object into a dict
cloud_credentials_dict = cloud_credentials_instance.to_dict()
# create an instance of CloudCredentials from a dict
cloud_credentials_from_dict = CloudCredentials.from_dict(cloud_credentials_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


