# OpenapiClient::ControllerApi

All URIs are relative to *https://cchost:9501/v2*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**controller_post**](ControllerApi.md#controller_post) | **POST** /controller | Ping | Heartbeat | etc |


## controller_post

> controller_post(controller)

Ping | Heartbeat | etc

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::ControllerApi.new
controller = OpenapiClient::Controller.new({operation: 'ping'}) # Controller | Managing controller and operate the Cmon HA subsystem

begin
  # Ping | Heartbeat | etc
  api_instance.controller_post(controller)
rescue OpenapiClient::ApiError => e
  puts "Error when calling ControllerApi->controller_post: #{e}"
end
```

#### Using the controller_post_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> controller_post_with_http_info(controller)

```ruby
begin
  # Ping | Heartbeat | etc
  data, status_code, headers = api_instance.controller_post_with_http_info(controller)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue OpenapiClient::ApiError => e
  puts "Error when calling ControllerApi->controller_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **controller** | [**Controller**](Controller.md) | Managing controller and operate the Cmon HA subsystem |  |

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

