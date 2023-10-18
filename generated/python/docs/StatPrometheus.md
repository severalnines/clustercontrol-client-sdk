# StatPrometheus


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | **str** |  | 
**cluster_id** | **int** |  | [optional] 
**cluster_name** | **str** |  | [optional] 
**queries** | [**List[StatPrometheusQueriesInner]**](StatPrometheusQueriesInner.md) |  | [optional] 
**start** | **int** | Seconds since 1970. e.g. 1622105617 | [optional] 
**end** | **int** | Seconds since 1970. e.g. 1622108317 | [optional] 
**step** | **int** |  | [optional] 
**returnfrom** | **int** |  | [optional] 

## Example

```python
from openapi_cc_client.models.stat_prometheus import StatPrometheus

# TODO update the JSON string below
json = "{}"
# create an instance of StatPrometheus from a JSON string
stat_prometheus_instance = StatPrometheus.from_json(json)
# print the JSON string representation of the object
print StatPrometheus.to_json()

# convert the object into a dict
stat_prometheus_dict = stat_prometheus_instance.to_dict()
# create an instance of StatPrometheus from a dict
stat_prometheus_form_dict = stat_prometheus.from_dict(stat_prometheus_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


