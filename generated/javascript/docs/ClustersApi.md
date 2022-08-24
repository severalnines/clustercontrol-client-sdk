# SeveralninesClusterControl.ClustersApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clustersPost**](ClustersApi.md#clustersPost) | **POST** /clusters | GetClusterInfo | Get/Set Config | etc



## clustersPost

> clustersPost(clusters)

GetClusterInfo | Get/Set Config | etc

### Example

```javascript
import SeveralninesClusterControl from 'severalnines_cluster_control';

let apiInstance = new SeveralninesClusterControl.ClustersApi();
let clusters = new SeveralninesClusterControl.Clusters(); // Clusters | Get cluster information
apiInstance.clustersPost(clusters, (error, data, response) => {
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
 **clusters** | [**Clusters**](Clusters.md)| Get cluster information | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

