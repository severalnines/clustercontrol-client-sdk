# SeveralninesClusterControl.MaintenanceApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**maintenancePost**](MaintenanceApi.md#maintenancePost) | **POST** /maintenance | CreateJobInstance | etc



## maintenancePost

> maintenancePost(maintenance)

CreateJobInstance | etc

### Example

```javascript
import SeveralninesClusterControl from 'severalnines_cluster_control';

let apiInstance = new SeveralninesClusterControl.MaintenanceApi();
let maintenance = new SeveralninesClusterControl.Maintenance(); // Maintenance | Creating, deleting and obtaining maintenance periods
apiInstance.maintenancePost(maintenance, (error, data, response) => {
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
 **maintenance** | [**Maintenance**](Maintenance.md)| Creating, deleting and obtaining maintenance periods | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

