# JobsJobJobSpecJobDataUploadBackupDataToCloudStorage


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backup_retention** | **int** |  | [optional] 
**bucket** | **str** |  | [optional] 
**cloud_storage_credentials_id** | **int** |  | [optional] 
**cloud_storage_provider** | **str** |  | [optional] 
**cloud_storage_service** | **str** |  | [optional] 
**delete_after_upload** | **bool** |  | [optional] 

## Example

```python
from openapi_cc_client.models.jobs_job_job_spec_job_data_upload_backup_data_to_cloud_storage import JobsJobJobSpecJobDataUploadBackupDataToCloudStorage

# TODO update the JSON string below
json = "{}"
# create an instance of JobsJobJobSpecJobDataUploadBackupDataToCloudStorage from a JSON string
jobs_job_job_spec_job_data_upload_backup_data_to_cloud_storage_instance = JobsJobJobSpecJobDataUploadBackupDataToCloudStorage.from_json(json)
# print the JSON string representation of the object
print(JobsJobJobSpecJobDataUploadBackupDataToCloudStorage.to_json())

# convert the object into a dict
jobs_job_job_spec_job_data_upload_backup_data_to_cloud_storage_dict = jobs_job_job_spec_job_data_upload_backup_data_to_cloud_storage_instance.to_dict()
# create an instance of JobsJobJobSpecJobDataUploadBackupDataToCloudStorage from a dict
jobs_job_job_spec_job_data_upload_backup_data_to_cloud_storage_from_dict = JobsJobJobSpecJobDataUploadBackupDataToCloudStorage.from_dict(jobs_job_job_spec_job_data_upload_backup_data_to_cloud_storage_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


