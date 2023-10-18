# DiscoverySshCredentials


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**class_name** | **str** |  | [optional] 
**user_name** | **str** |  | [optional] 
**password** | **str** |  | [optional] 
**ssh_keyfile** | **str** |  | [optional] 

## Example

```python
from openapi_cc_client.models.discovery_ssh_credentials import DiscoverySshCredentials

# TODO update the JSON string below
json = "{}"
# create an instance of DiscoverySshCredentials from a JSON string
discovery_ssh_credentials_instance = DiscoverySshCredentials.from_json(json)
# print the JSON string representation of the object
print DiscoverySshCredentials.to_json()

# convert the object into a dict
discovery_ssh_credentials_dict = discovery_ssh_credentials_instance.to_dict()
# create an instance of DiscoverySshCredentials from a dict
discovery_ssh_credentials_form_dict = discovery_ssh_credentials.from_dict(discovery_ssh_credentials_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


