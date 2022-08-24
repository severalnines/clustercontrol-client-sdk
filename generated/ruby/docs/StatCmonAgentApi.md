# OpenapiClient::StatCmonAgentApi

All URIs are relative to *https://cchost:9501/v2*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**stat_cmonagent_post**](StatCmonAgentApi.md#stat_cmonagent_post) | **POST** /stat/cmonagent | GetInfo | etc |


## stat_cmonagent_post

> stat_cmonagent_post(stat_cmon_agent)

GetInfo | etc

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::StatCmonAgentApi.new
stat_cmon_agent = OpenapiClient::StatCmonAgent.new({operation: '/cmonagent'}) # StatCmonAgent | Provides calls to access various statistical information about the cluster

begin
  # GetInfo | etc
  api_instance.stat_cmonagent_post(stat_cmon_agent)
rescue OpenapiClient::ApiError => e
  puts "Error when calling StatCmonAgentApi->stat_cmonagent_post: #{e}"
end
```

#### Using the stat_cmonagent_post_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> stat_cmonagent_post_with_http_info(stat_cmon_agent)

```ruby
begin
  # GetInfo | etc
  data, status_code, headers = api_instance.stat_cmonagent_post_with_http_info(stat_cmon_agent)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue OpenapiClient::ApiError => e
  puts "Error when calling StatCmonAgentApi->stat_cmonagent_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **stat_cmon_agent** | [**StatCmonAgent**](StatCmonAgent.md) | Provides calls to access various statistical information about the cluster |  |

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

