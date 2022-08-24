# SeveralninesClusterControl.ControllerApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**controllerPost**](ControllerApi.md#controllerPost) | **POST** /controller | Ping | Heartbeat | etc



## controllerPost

> controllerPost(controller)

Ping | Heartbeat | etc

### Example

```javascript
import SeveralninesClusterControl from 'severalnines_cluster_control';

let apiInstance = new SeveralninesClusterControl.ControllerApi();
let controller = new SeveralninesClusterControl.Controller(); // Controller | Managing controller and operate the Cmon HA subsystem
apiInstance.controllerPost(controller, (error, data, response) => {
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
 **controller** | [**Controller**](Controller.md)| Managing controller and operate the Cmon HA subsystem | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

