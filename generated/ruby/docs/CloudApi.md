# OpenapiClient::CloudApi

All URIs are relative to *https://cchost:9501/v2*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**cloud_post**](CloudApi.md#cloud_post) | **POST** /cloud | VerifyCredentials | ListCredentials | etc |


## cloud_post

> cloud_post(cloud)

VerifyCredentials | ListCredentials | etc

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::CloudApi.new
cloud = OpenapiClient::Cloud.new({operation: 'verifyCredentials'}) # Cloud | calls to manage the cloud-credentials

begin
  # VerifyCredentials | ListCredentials | etc
  api_instance.cloud_post(cloud)
rescue OpenapiClient::ApiError => e
  puts "Error when calling CloudApi->cloud_post: #{e}"
end
```

#### Using the cloud_post_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> cloud_post_with_http_info(cloud)

```ruby
begin
  # VerifyCredentials | ListCredentials | etc
  data, status_code, headers = api_instance.cloud_post_with_http_info(cloud)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue OpenapiClient::ApiError => e
  puts "Error when calling CloudApi->cloud_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **cloud** | [**Cloud**](Cloud.md) | calls to manage the cloud-credentials |  |

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

