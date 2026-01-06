# UsersUserTimezone


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**class_name** | **str** |  | [optional] 
**abbreviation** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**offset** | **int** |  | [optional] 
**use_dst** | **bool** |  | [optional] 

## Example

```python
from openapi_cc_client.models.users_user_timezone import UsersUserTimezone

# TODO update the JSON string below
json = "{}"
# create an instance of UsersUserTimezone from a JSON string
users_user_timezone_instance = UsersUserTimezone.from_json(json)
# print the JSON string representation of the object
print(UsersUserTimezone.to_json())

# convert the object into a dict
users_user_timezone_dict = users_user_timezone_instance.to_dict()
# create an instance of UsersUserTimezone from a dict
users_user_timezone_from_dict = UsersUserTimezone.from_dict(users_user_timezone_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


