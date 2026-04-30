# AuthenticateResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_created** | **str** |  | [optional] 
**request_processed** | **str** |  | [optional] 
**request_status** | **str** |  | [optional] 
**user** | [**AuthenticateResponseUser**](AuthenticateResponseUser.md) |  | [optional] 

## Example

```python
from openapi_proxy_client.models.authenticate_response import AuthenticateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of AuthenticateResponse from a JSON string
authenticate_response_instance = AuthenticateResponse.from_json(json)
# print the JSON string representation of the object
print(AuthenticateResponse.to_json())

# convert the object into a dict
authenticate_response_dict = authenticate_response_instance.to_dict()
# create an instance of AuthenticateResponse from a dict
authenticate_response_from_dict = AuthenticateResponse.from_dict(authenticate_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


