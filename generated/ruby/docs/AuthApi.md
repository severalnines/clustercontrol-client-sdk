# OpenapiClient::AuthApi

All URIs are relative to *https://cchost:9501/v2*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**auth_post**](AuthApi.md#auth_post) | **POST** /auth | Authenticate | Logout | Password Reset | Authenticate response (with challenge) |


## auth_post

> auth_post(authenticate)

Authenticate | Logout | Password Reset | Authenticate response (with challenge)

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::AuthApi.new
authenticate = OpenapiClient::Authenticate.new({operation: 'authenticateWithPassword'}) # Authenticate | Authentication parameters

begin
  # Authenticate | Logout | Password Reset | Authenticate response (with challenge)
  api_instance.auth_post(authenticate)
rescue OpenapiClient::ApiError => e
  puts "Error when calling AuthApi->auth_post: #{e}"
end
```

#### Using the auth_post_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> auth_post_with_http_info(authenticate)

```ruby
begin
  # Authenticate | Logout | Password Reset | Authenticate response (with challenge)
  data, status_code, headers = api_instance.auth_post_with_http_info(authenticate)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue OpenapiClient::ApiError => e
  puts "Error when calling AuthApi->auth_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **authenticate** | [**Authenticate**](Authenticate.md) | Authentication parameters |  |

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

