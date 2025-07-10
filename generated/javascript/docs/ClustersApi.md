# SeveralninesClusterControlRestApiV2.ClustersApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clustersPost**](ClustersApi.md#clustersPost) | **POST** /clusters | GetClusterInfo | Get/Set Config | etc



## clustersPost

> clustersPost(clusters)

GetClusterInfo | Get/Set Config | etc

### Example

```javascript
import SeveralninesClusterControlRestApiV2 from 'severalnines_cluster_control_rest_api__v2';

let apiInstance = new SeveralninesClusterControlRestApiV2.ClustersApi();
let clusters = new SeveralninesClusterControlRestApiV2.Clusters(); // Clusters | Get cluster information
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

