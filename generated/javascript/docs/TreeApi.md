# SeveralninesClusterControlRestApiV2.TreeApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**treePost**](TreeApi.md#treePost) | **POST** /tree | AddACL | RemoveAcl | etc



## treePost

> treePost(tree)

AddACL | RemoveAcl | etc

### Example

```javascript
import SeveralninesClusterControlRestApiV2 from 'severalnines_cluster_control_rest_api__v2';

let apiInstance = new SeveralninesClusterControlRestApiV2.TreeApi();
let tree = new SeveralninesClusterControlRestApiV2.Tree(); // Tree | Manipulate ACLs for Groups and Users that are maintained by the Cmon controller
apiInstance.treePost(tree, (error, data, response) => {
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
 **tree** | [**Tree**](Tree.md)| Manipulate ACLs for Groups and Users that are maintained by the Cmon controller | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

