# OpenapiClient::ConfigApi

All URIs are relative to *https://cchost:9501/v2*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**config_post**](ConfigApi.md#config_post) | **POST** /config | GetConfig | xxx | xxx | etc |


## config_post

> config_post(config)

GetConfig | xxx | xxx | etc

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::ConfigApi.new
config = OpenapiClient::Config.new({operation: 'getConfig'}) # Config | Provides access to various Cmon configuration files

begin
  # GetConfig | xxx | xxx | etc
  api_instance.config_post(config)
rescue OpenapiClient::ApiError => e
  puts "Error when calling ConfigApi->config_post: #{e}"
end
```

#### Using the config_post_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> config_post_with_http_info(config)

```ruby
begin
  # GetConfig | xxx | xxx | etc
  data, status_code, headers = api_instance.config_post_with_http_info(config)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue OpenapiClient::ApiError => e
  puts "Error when calling ConfigApi->config_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **config** | [**Config**](Config.md) | Provides access to various Cmon configuration files |  |

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

