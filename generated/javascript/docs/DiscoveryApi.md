# SeveralninesClusterControlRestApiV2.DiscoveryApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**discoveryPost**](DiscoveryApi.md#discoveryPost) | **POST** /discovery | CheckClusterName | CheckHosts | GetSupportedClusterTypes



## discoveryPost

> discoveryPost(discovery)

CheckClusterName | CheckHosts | GetSupportedClusterTypes

### Example

```javascript
import SeveralninesClusterControlRestApiV2 from 'severalnines_cluster_control_rest_api__v2';

let apiInstance = new SeveralninesClusterControlRestApiV2.DiscoveryApi();
let discovery = new SeveralninesClusterControlRestApiV2.Discovery(); // Discovery | All things related to Clusters and cluster Hosts
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

