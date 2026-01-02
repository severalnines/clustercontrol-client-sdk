# UsersUserGroupsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**class_name** | **str** |  | [optional] 
**group_name** | **str** |  | [optional] 
**group_id** | **int** |  | [optional] 

## Example

```python
from openapi_cc_client.models.users_user_groups_inner import UsersUserGroupsInner

# TODO update the JSON string below
json = "{}"
# create an instance of UsersUserGroupsInner from a JSON string
users_user_groups_inner_instance = UsersUserGroupsInner.from_json(json)
# print the JSON string representation of the object
print(UsersUserGroupsInner.to_json())

# convert the object into a dict
users_user_groups_inner_dict = users_user_groups_inner_instance.to_dict()
# create an instance of UsersUserGroupsInner from a dict
users_user_groups_inner_from_dict = UsersUserGroupsInner.from_dict(users_user_groups_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


