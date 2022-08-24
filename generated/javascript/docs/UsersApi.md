# SeveralninesClusterControl.UsersApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usersPost**](UsersApi.md#usersPost) | **POST** /users | CreateUser | etc



## usersPost

> usersPost(users)

CreateUser | etc

### Example

```javascript
import SeveralninesClusterControl from 'severalnines_cluster_control';

let apiInstance = new SeveralninesClusterControl.UsersApi();
let users = new SeveralninesClusterControl.Users(); // Users | Manipulate Cmon Users, users that are maintained by the Cmon controller
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

