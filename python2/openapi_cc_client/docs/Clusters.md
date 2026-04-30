# Clusters


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | **str** |  | 
**cluster_id** | **int** |  | [optional] 
**cluster_name** | **str** |  | [optional] 
**with_hosts** | **bool** |  | [optional] 
**with_sheet_info** | **bool** |  | [optional] 
**configuration** | [**List[ClustersConfigurationInner]**](ClustersConfigurationInner.md) |  | [optional] 
**account** | [**ClustersAccount**](ClustersAccount.md) |  | [optional] 
**filter_strings** | **str** |  | [optional] 
**limit** | **int** |  | [optional] 
**offset** | **int** |  | [optional] 
**database** | [**ClustersDatabase**](ClustersDatabase.md) |  | [optional] 
**nodes** | **List[str]** |  | [optional] 

## Example

```python
from openapi_cc_client.models.clusters import Clusters

# TODO update the JSON string below
json = "{}"
# create an instance of Clusters from a JSON string
clusters_instance = Clusters.from_json(json)
# print the JSON string representation of the object
print(Clusters.to_json())

# convert the object into a dict
clusters_dict = clusters_instance.to_dict()
# create an instance of Clusters from a dict
clusters_from_dict = Clusters.from_dict(clusters_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


