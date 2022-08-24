# SeveralninesClusterControl.StatPrometheusApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**statPrometheusQueryPost**](StatPrometheusApi.md#statPrometheusQueryPost) | **POST** /stat/prometheus/query | GetInfo | etc



## statPrometheusQueryPost

> statPrometheusQueryPost(statPrometheus)

GetInfo | etc

### Example

```javascript
import SeveralninesClusterControl from 'severalnines_cluster_control';

let apiInstance = new SeveralninesClusterControl.StatPrometheusApi();
let statPrometheus = new SeveralninesClusterControl.StatPrometheus(); // StatPrometheus | Provides calls to access various statistical information about the cluster
apiInstance.statPrometheusQueryPost(statPrometheus, (error, data, response) => {
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
 **statPrometheus** | [**StatPrometheus**](StatPrometheus.md)| Provides calls to access various statistical information about the cluster | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

