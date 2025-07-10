# SeveralninesClusterControlRestApiV2.JobsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**jobsPost**](JobsApi.md#jobsPost) | **POST** /jobs | CreateJobInstance | etc



## jobsPost

> jobsPost(jobs)

CreateJobInstance | etc

### Example

```javascript
import SeveralninesClusterControlRestApiV2 from 'severalnines_cluster_control_rest_api__v2';

let apiInstance = new SeveralninesClusterControlRestApiV2.JobsApi();
let jobs = new SeveralninesClusterControlRestApiV2.Jobs(); // Jobs | Creating, manipulating, and obtaining information about jobs
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

