# UsersUser


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**class_name** | **str** |  | [optional] 
**user_name** | **str** |  | [optional] 
**user_id** | **int** |  | [optional] 
**first_name** | **str** |  | [optional] 
**last_name** | **str** |  | [optional] 
**email_address** | **str** |  | [optional] 
**new_password** | **str** |  | [optional] 
**old_password** | **str** |  | [optional] 
**groups** | [**List[UsersUserGroupsInner]**](UsersUserGroupsInner.md) |  | [optional] 
**timezone** | [**UsersUserTimezone**](UsersUserTimezone.md) |  | [optional] 
**public_keys** | [**List[UsersUserPublicKeysInner]**](UsersUserPublicKeysInner.md) |  | [optional] 
**public_key** | [**List[UsersUserPublicKeysInner]**](UsersUserPublicKeysInner.md) |  | [optional] 

## Example

```python
from openapi_cc_client.models.users_user import UsersUser

# TODO update the JSON string below
json = "{}"
# create an instance of UsersUser from a JSON string
users_user_instance = UsersUser.from_json(json)
# print the JSON string representation of the object
print(UsersUser.to_json())

# convert the object into a dict
users_user_dict = users_user_instance.to_dict()
# create an instance of UsersUser from a dict
users_user_from_dict = UsersUser.from_dict(users_user_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


