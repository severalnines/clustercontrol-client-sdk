# StatPrometheusQueriesInner


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**query** | **str** | mysql_global_status_wsrep_cert_deps_distance{instance&#x3D;~\&quot;10.117.12.165(:[0-9]+)?\&quot;} | [optional] 
**step** | **int** | e.g. 10 | [optional] 

## Example

```python
from openapi_cc_client.models.stat_prometheus_queries_inner import StatPrometheusQueriesInner

# TODO update the JSON string below
json = "{}"
# create an instance of StatPrometheusQueriesInner from a JSON string
stat_prometheus_queries_inner_instance = StatPrometheusQueriesInner.from_json(json)
# print the JSON string representation of the object
print StatPrometheusQueriesInner.to_json()

# convert the object into a dict
stat_prometheus_queries_inner_dict = stat_prometheus_queries_inner_instance.to_dict()
# create an instance of StatPrometheusQueriesInner from a dict
stat_prometheus_queries_inner_form_dict = stat_prometheus_queries_inner.from_dict(stat_prometheus_queries_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


