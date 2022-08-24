# SeveralninesClusterControl.CloudApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cloudPost**](CloudApi.md#cloudPost) | **POST** /cloud | VerifyCredentials | ListCredentials | etc



## cloudPost

> cloudPost(cloud)

VerifyCredentials | ListCredentials | etc

### Example

```javascript
import SeveralninesClusterControl from 'severalnines_cluster_control';

let apiInstance = new SeveralninesClusterControl.CloudApi();
let cloud = new SeveralninesClusterControl.Cloud(); // Cloud | calls to manage the cloud-credentials
apiInstance.cloudPost(cloud, (error, data, response) => {
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
 **cloud** | [**Cloud**](Cloud.md)| calls to manage the cloud-credentials | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

