# OpenapiClient::JobsApi

All URIs are relative to *https://cchost:9501/v2*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**jobs_post**](JobsApi.md#jobs_post) | **POST** /jobs | CreateJobInstance | etc |


## jobs_post

> jobs_post(jobs)

CreateJobInstance | etc

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::JobsApi.new
jobs = OpenapiClient::Jobs.new({operation: 'createJobInstance'}) # Jobs | Creating, manipulating, and obtaining information about jobs

begin
  # CreateJobInstance | etc
  api_instance.jobs_post(jobs)
rescue OpenapiClient::ApiError => e
  puts "Error when calling JobsApi->jobs_post: #{e}"
end
```

#### Using the jobs_post_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> jobs_post_with_http_info(jobs)

```ruby
begin
  # CreateJobInstance | etc
  data, status_code, headers = api_instance.jobs_post_with_http_info(jobs)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue OpenapiClient::ApiError => e
  puts "Error when calling JobsApi->jobs_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **jobs** | [**Jobs**](Jobs.md) | Creating, manipulating, and obtaining information about jobs |  |

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

