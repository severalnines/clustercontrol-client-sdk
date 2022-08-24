# OpenapiClient::ClustersApi

All URIs are relative to *https://cchost:9501/v2*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**clusters_post**](ClustersApi.md#clusters_post) | **POST** /clusters | GetClusterInfo | Get/Set Config | etc |


## clusters_post

> clusters_post(clusters)

GetClusterInfo | Get/Set Config | etc

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::ClustersApi.new
clusters = OpenapiClient::Clusters.new({operation: 'getallclusterinfo'}) # Clusters | Get cluster information

begin
  # GetClusterInfo | Get/Set Config | etc
  api_instance.clusters_post(clusters)
rescue OpenapiClient::ApiError => e
  puts "Error when calling ClustersApi->clusters_post: #{e}"
end
```

#### Using the clusters_post_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> clusters_post_with_http_info(clusters)

```ruby
begin
  # GetClusterInfo | Get/Set Config | etc
  data, status_code, headers = api_instance.clusters_post_with_http_info(clusters)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue OpenapiClient::ApiError => e
  puts "Error when calling ClustersApi->clusters_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **clusters** | [**Clusters**](Clusters.md) | Get cluster information |  |

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

