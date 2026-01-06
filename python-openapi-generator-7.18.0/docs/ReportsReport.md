# ReportsReport


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**class_name** | **str** |  | [optional] 
**recipients** | **str** | Email of recipient | [optional] 
**report_type** | **str** | TODO | [optional] 
**text_format** | **str** |  | [optional] 
**report_id** | **int** |  | [optional] 

## Example

```python
from openapi_cc_client.models.reports_report import ReportsReport

# TODO update the JSON string below
json = "{}"
# create an instance of ReportsReport from a JSON string
reports_report_instance = ReportsReport.from_json(json)
# print the JSON string representation of the object
print(ReportsReport.to_json())

# convert the object into a dict
reports_report_dict = reports_report_instance.to_dict()
# create an instance of ReportsReport from a dict
reports_report_from_dict = ReportsReport.from_dict(reports_report_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


