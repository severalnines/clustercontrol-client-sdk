# SeveralninesClusterControl.JobsApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**jobsPost**](JobsApi.md#jobsPost) | **POST** /jobs | CreateJobInstance | etc



## jobsPost

> jobsPost(jobs)

CreateJobInstance | etc

### Example

```javascript
import SeveralninesClusterControl from 'severalnines_cluster_control';

let apiInstance = new SeveralninesClusterControl.JobsApi();
let jobs = new SeveralninesClusterControl.Jobs(); // Jobs | Creating, manipulating, and obtaining information about jobs
apiInstance.jobsPost(jobs, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobs** | [**Jobs**](Jobs.md)| Creating, manipulating, and obtaining information about jobs | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

