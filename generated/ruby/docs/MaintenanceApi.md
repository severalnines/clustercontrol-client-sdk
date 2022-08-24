# OpenapiClient::MaintenanceApi

All URIs are relative to *https://cchost:9501/v2*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**maintenance_post**](MaintenanceApi.md#maintenance_post) | **POST** /maintenance | CreateJobInstance | etc |


## maintenance_post

> maintenance_post(maintenance)

CreateJobInstance | etc

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::MaintenanceApi.new
maintenance = OpenapiClient::Maintenance.new({operation: 'addMaintenance'}) # Maintenance | Creating, deleting and obtaining maintenance periods

begin
  # CreateJobInstance | etc
  api_instance.maintenance_post(maintenance)
rescue OpenapiClient::ApiError => e
  puts "Error when calling MaintenanceApi->maintenance_post: #{e}"
end
```

#### Using the maintenance_post_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> maintenance_post_with_http_info(maintenance)

```ruby
begin
  # CreateJobInstance | etc
  data, status_code, headers = api_instance.maintenance_post_with_http_info(maintenance)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue OpenapiClient::ApiError => e
  puts "Error when calling MaintenanceApi->maintenance_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **maintenance** | [**Maintenance**](Maintenance.md) | Creating, deleting and obtaining maintenance periods |  |

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

