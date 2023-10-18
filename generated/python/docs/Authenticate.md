# Authenticate


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | **str** |  | 
**user_name** | **str** |  | [optional] 
**password** | **str** |  | [optional] 
**signature** | **str** |  | [optional] 
**new_password** | **str** |  | [optional] 
**password_reset_token** | **str** |  | [optional] 

## Example

```python
from openapi_cc_client.models.authenticate import Authenticate

# TODO update the JSON string below
json = "{}"
# create an instance of Authenticate from a JSON string
authenticate_instance = Authenticate.from_json(json)
# print the JSON string representation of the object
print Authenticate.to_json()

# convert the object into a dict
authenticate_dict = authenticate_instance.to_dict()
# create an instance of Authenticate from a dict
authenticate_form_dict = authenticate.from_dict(authenticate_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


