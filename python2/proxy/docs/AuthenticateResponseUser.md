# AuthenticateResponseUser


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**username** | **str** |  | [optional] 
**email** | **str** |  | [optional] 
**firstname** | **str** |  | [optional] 
**lastname** | **str** |  | [optional] 
**cmon** | **bool** |  | [optional] 
**groups** | **List[str]** |  | [optional] 

## Example

```python
from openapi_cc_proxy_client.models.authenticate_response_user import AuthenticateResponseUser

# TODO update the JSON string below
json = "{}"
# create an instance of AuthenticateResponseUser from a JSON string
authenticate_response_user_instance = AuthenticateResponseUser.from_json(json)
# print the JSON string representation of the object
print(AuthenticateResponseUser.to_json())

# convert the object into a dict
authenticate_response_user_dict = authenticate_response_user_instance.to_dict()
# create an instance of AuthenticateResponseUser from a dict
authenticate_response_user_from_dict = AuthenticateResponseUser.from_dict(authenticate_response_user_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


