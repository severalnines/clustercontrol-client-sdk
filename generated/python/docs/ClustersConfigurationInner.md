# ClustersConfigurationInner


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | [optional] 
**value** | **str** |  | [optional] 

## Example

```python
from openapi_cc_client.models.clusters_configuration_inner import ClustersConfigurationInner

# TODO update the JSON string below
json = "{}"
# create an instance of ClustersConfigurationInner from a JSON string
clusters_configuration_inner_instance = ClustersConfigurationInner.from_json(json)
# print the JSON string representation of the object
print ClustersConfigurationInner.to_json()

# convert the object into a dict
clusters_configuration_inner_dict = clusters_configuration_inner_instance.to_dict()
# create an instance of ClustersConfigurationInner from a dict
clusters_configuration_inner_form_dict = clusters_configuration_inner.from_dict(clusters_configuration_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


