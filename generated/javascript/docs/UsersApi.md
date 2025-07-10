# SeveralninesClusterControlRestApiV2.UsersApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usersPost**](UsersApi.md#usersPost) | **POST** /users | CreateUser | etc



## usersPost

> usersPost(users)

CreateUser | etc

### Example

```javascript
import SeveralninesClusterControlRestApiV2 from 'severalnines_cluster_control_rest_api__v2';

let apiInstance = new SeveralninesClusterControlRestApiV2.UsersApi();
let users = new SeveralninesClusterControlRestApiV2.Users(); // Users | Manipulate Cmon Users, users that are maintained by the Cmon controller
apiInstance.usersPost(users, (error, data, response) => {
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
 **users** | [**Users**](Users.md)| Manipulate Cmon Users, users that are maintained by the Cmon controller | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

