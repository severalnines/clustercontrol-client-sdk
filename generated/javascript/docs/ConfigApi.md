# SeveralninesClusterControl.ConfigApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**configPost**](ConfigApi.md#configPost) | **POST** /config | GetConfig | xxx | xxx | etc



## configPost

> configPost(config)

GetConfig | xxx | xxx | etc

### Example

```javascript
import SeveralninesClusterControl from 'severalnines_cluster_control';

let apiInstance = new SeveralninesClusterControl.ConfigApi();
let config = new SeveralninesClusterControl.Config(); // Config | Provides access to various Cmon configuration files
apiInstance.configPost(config, (error, data, response) => {
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
 **config** | [**Config**](Config.md)| Provides access to various Cmon configuration files | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

