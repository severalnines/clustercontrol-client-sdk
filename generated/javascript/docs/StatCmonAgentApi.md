# SeveralninesClusterControl.StatCmonAgentApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**statCmonagentPost**](StatCmonAgentApi.md#statCmonagentPost) | **POST** /stat/cmonagent | GetInfo | etc



## statCmonagentPost

> statCmonagentPost(statCmonAgent)

GetInfo | etc

### Example

```javascript
import SeveralninesClusterControl from 'severalnines_cluster_control';

let apiInstance = new SeveralninesClusterControl.StatCmonAgentApi();
let statCmonAgent = new SeveralninesClusterControl.StatCmonAgent(); // StatCmonAgent | Provides calls to access various statistical information about the cluster
apiInstance.statCmonagentPost(statCmonAgent, (error, data, response) => {
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
 **statCmonAgent** | [**StatCmonAgent**](StatCmonAgent.md)| Provides calls to access various statistical information about the cluster | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

