# SeveralninesClusterControlRestApiV2.MaintenanceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**maintenancePost**](MaintenanceApi.md#maintenancePost) | **POST** /maintenance | Set a maintenance window for a managed database cluster



## maintenancePost

> maintenancePost(maintenance)

Set a maintenance window for a managed database cluster

### Example

```javascript
import SeveralninesClusterControlRestApiV2 from 'severalnines_cluster_control_rest_api__v2';

let apiInstance = new SeveralninesClusterControlRestApiV2.MaintenanceApi();
let maintenance = new SeveralninesClusterControlRestApiV2.Maintenance(); // Maintenance | Creating, deleting and obtaining maintenance periods
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

