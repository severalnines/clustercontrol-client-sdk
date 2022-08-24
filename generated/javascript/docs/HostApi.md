# SeveralninesClusterControl.HostApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**hostPost**](HostApi.md#hostPost) | **POST** /host | Path for managing servers



## hostPost

> hostPost(host)

Path for managing servers

### Example

```javascript
import SeveralninesClusterControl from 'severalnines_cluster_control';

let apiInstance = new SeveralninesClusterControl.HostApi();
let host = new SeveralninesClusterControl.Host(); // Host | (Un)Register servers, Shutdown servers, etc
apiInstance.hostPost(host, (error, data, response) => {
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
 **host** | [**Host**](Host.md)| (Un)Register servers, Shutdown servers, etc | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

