# SeveralninesClusterControlRestApiV2.StatCmonAgentApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**statCmonagentPost**](StatCmonAgentApi.md#statCmonagentPost) | **POST** /stat/cmonagent | GetInfo | etc



## statCmonagentPost

> statCmonagentPost(statCmonAgent)

GetInfo | etc

### Example

```javascript
import SeveralninesClusterControlRestApiV2 from 'severalnines_cluster_control_rest_api__v2';

let apiInstance = new SeveralninesClusterControlRestApiV2.StatCmonAgentApi();
let statCmonAgent = new SeveralninesClusterControlRestApiV2.StatCmonAgent(); // StatCmonAgent | Provides calls to access various statistical information about the cluster
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

