# ClustersAccount


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**class_name** | **str** |  | [optional] 
**grants** | **str** | e.g. \&quot;john:ALL;pipas:INSERT\&quot; | [optional] 
**host_allow** | **str** | e.g. \&quot;1.2.3.4\&quot; | [optional] 
**own_database** | **str** |  | [optional] 
**privileges** | **str** | e.g. \&quot;testCreateDatabase.*:DELETE,TRUNCATE\&quot; | [optional] 
**user_name** | **str** | e.g. \&quot;pipas\&quot; | [optional] 
**password** | **str** |  | [optional] 

## Example

```python
from openapi_cc_client.models.clusters_account import ClustersAccount

# TODO update the JSON string below
json = "{}"
# create an instance of ClustersAccount from a JSON string
clusters_account_instance = ClustersAccount.from_json(json)
# print the JSON string representation of the object
print(ClustersAccount.to_json())

# convert the object into a dict
clusters_account_dict = clusters_account_instance.to_dict()
# create an instance of ClustersAccount from a dict
clusters_account_from_dict = ClustersAccount.from_dict(clusters_account_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


