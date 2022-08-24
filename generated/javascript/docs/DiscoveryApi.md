# SeveralninesClusterControl.DiscoveryApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**discoveryPost**](DiscoveryApi.md#discoveryPost) | **POST** /discovery | CheckClusterName | CheckHosts | GetSupportedClusterTypes



## discoveryPost

> discoveryPost(discovery)

CheckClusterName | CheckHosts | GetSupportedClusterTypes

### Example

```javascript
import SeveralninesClusterControl from 'severalnines_cluster_control';

let apiInstance = new SeveralninesClusterControl.DiscoveryApi();
let discovery = new SeveralninesClusterControl.Discovery(); // Discovery | All things related to Clusters and cluster Hosts
apiInstance.discoveryPost(discovery, (error, data, response) => {
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
 **discovery** | [**Discovery**](Discovery.md)| All things related to Clusters and cluster Hosts | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

