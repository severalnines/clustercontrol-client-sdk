# Reports


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | **str** |  | 
**cluster_id** | **int** |  | [optional] 
**report** | [**ReportsReport**](ReportsReport.md) |  | [optional] 

## Example

```python
from openapi_cc_client.models.reports import Reports

# TODO update the JSON string below
json = "{}"
# create an instance of Reports from a JSON string
reports_instance = Reports.from_json(json)
# print the JSON string representation of the object
print(Reports.to_json())

# convert the object into a dict
reports_dict = reports_instance.to_dict()
# create an instance of Reports from a dict
reports_from_dict = Reports.from_dict(reports_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


