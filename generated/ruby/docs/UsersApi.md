# OpenapiClient::UsersApi

All URIs are relative to *https://cchost:9501/v2*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**users_post**](UsersApi.md#users_post) | **POST** /users | CreateUser | etc |


## users_post

> users_post(users)

CreateUser | etc

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::UsersApi.new
users = OpenapiClient::Users.new({operation: 'createUser'}) # Users | Manipulate Cmon Users, users that are maintained by the Cmon controller

begin
  # CreateUser | etc
  api_instance.users_post(users)
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->users_post: #{e}"
end
```

#### Using the users_post_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> users_post_with_http_info(users)

```ruby
begin
  # CreateUser | etc
  data, status_code, headers = api_instance.users_post_with_http_info(users)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->users_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **users** | [**Users**](Users.md) | Manipulate Cmon Users, users that are maintained by the Cmon controller |  |

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

