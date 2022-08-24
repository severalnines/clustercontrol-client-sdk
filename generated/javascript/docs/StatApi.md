# SeveralninesClusterControl.StatApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**statPost**](StatApi.md#statPost) | **POST** /stat | GetInfo | etc



## statPost

> statPost(stat)

GetInfo | etc

### Example

```javascript
import SeveralninesClusterControl from 'severalnines_cluster_control';

let apiInstance = new SeveralninesClusterControl.StatApi();
let stat = new SeveralninesClusterControl.Stat(); // Stat | Provides calls to access various statistical information about the cluster
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

