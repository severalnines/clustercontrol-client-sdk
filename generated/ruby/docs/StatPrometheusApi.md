# OpenapiClient::StatPrometheusApi

All URIs are relative to *https://cchost:9501/v2*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**stat_prometheus_query_post**](StatPrometheusApi.md#stat_prometheus_query_post) | **POST** /stat/prometheus/query | GetInfo | etc |


## stat_prometheus_query_post

> stat_prometheus_query_post(stat_prometheus)

GetInfo | etc

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::StatPrometheusApi.new
stat_prometheus = OpenapiClient::StatPrometheus.new({operation: '/prometheus'}) # StatPrometheus | Provides calls to access various statistical information about the cluster

begin
  # GetInfo | etc
  api_instance.stat_prometheus_query_post(stat_prometheus)
rescue OpenapiClient::ApiError => e
  puts "Error when calling StatPrometheusApi->stat_prometheus_query_post: #{e}"
end
```

#### Using the stat_prometheus_query_post_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> stat_prometheus_query_post_with_http_info(stat_prometheus)

```ruby
begin
  # GetInfo | etc
  data, status_code, headers = api_instance.stat_prometheus_query_post_with_http_info(stat_prometheus)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue OpenapiClient::ApiError => e
  puts "Error when calling StatPrometheusApi->stat_prometheus_query_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **stat_prometheus** | [**StatPrometheus**](StatPrometheus.md) | Provides calls to access various statistical information about the cluster |  |

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

