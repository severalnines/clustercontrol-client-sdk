# SeveralninesClusterControlRestApiV2.ConfigApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**configPost**](ConfigApi.md#configPost) | **POST** /config | GetConfig | xxx | xxx | etc



## configPost

> configPost(config)

GetConfig | xxx | xxx | etc

### Example

```javascript
import SeveralninesClusterControlRestApiV2 from 'severalnines_cluster_control_rest_api__v2';

let apiInstance = new SeveralninesClusterControlRestApiV2.ConfigApi();
let config = new SeveralninesClusterControlRestApiV2.Config(); // Config | Provides access to various Cmon configuration files
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

