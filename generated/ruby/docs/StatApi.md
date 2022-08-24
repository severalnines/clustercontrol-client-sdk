# OpenapiClient::StatApi

All URIs are relative to *https://cchost:9501/v2*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**stat_post**](StatApi.md#stat_post) | **POST** /stat | GetInfo | etc |


## stat_post

> stat_post(stat)

GetInfo | etc

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::StatApi.new
stat = OpenapiClient::Stat.new({operation: 'getInfo'}) # Stat | Provides calls to access various statistical information about the cluster

begin
  # GetInfo | etc
  api_instance.stat_post(stat)
rescue OpenapiClient::ApiError => e
  puts "Error when calling StatApi->stat_post: #{e}"
end
```

#### Using the stat_post_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> stat_post_with_http_info(stat)

```ruby
begin
  # GetInfo | etc
  data, status_code, headers = api_instance.stat_post_with_http_info(stat)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue OpenapiClient::ApiError => e
  puts "Error when calling StatApi->stat_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **stat** | [**Stat**](Stat.md) | Provides calls to access various statistical information about the cluster |  |

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

