# Users


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | **str** |  | 
**create_group** | **bool** |  | [optional] 
**new_password** | **str** |  | [optional] 
**old_password** | **str** |  | [optional] 
**group_name** | **str** |  | [optional] 
**replace_primary_group** | **bool** |  | [optional] 
**with_tags** | **List[str]** |  | [optional] 
**user** | [**UsersUser**](UsersUser.md) |  | [optional] 
**group** | [**UsersGroup**](UsersGroup.md) |  | [optional] 

## Example

```python
from openapi_cc_client.models.users import Users

# TODO update the JSON string below
json = "{}"
# create an instance of Users from a JSON string
users_instance = Users.from_json(json)
# print the JSON string representation of the object
print(Users.to_json())

# convert the object into a dict
users_dict = users_instance.to_dict()
# create an instance of Users from a dict
users_from_dict = Users.from_dict(users_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


