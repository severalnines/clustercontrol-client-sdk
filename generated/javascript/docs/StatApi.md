# SeveralninesClusterControlRestApiV2.StatApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**statPost**](StatApi.md#statPost) | **POST** /stat | GetInfo | etc



## statPost

> statPost(stat)

GetInfo | etc

### Example

```javascript
import SeveralninesClusterControlRestApiV2 from 'severalnines_cluster_control_rest_api__v2';

let apiInstance = new SeveralninesClusterControlRestApiV2.StatApi();
let stat = new SeveralninesClusterControlRestApiV2.Stat(); // Stat | Provides calls to access various statistical information about the cluster
apiInstance.statPost(stat, (error, data, response) => {
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
 **stat** | [**Stat**](Stat.md)| Provides calls to access various statistical information about the cluster | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

