# OpenapiClient::AuditApi

All URIs are relative to *https://cchost:9501/v2*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**audit_post**](AuditApi.md#audit_post) | **POST** /audit | GetStatistics | GetAlarm | GetAlarms | IgnoreAlarm |


## audit_post

> audit_post(audit)

GetStatistics | GetAlarm | GetAlarms | IgnoreAlarm

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::AuditApi.new
audit = OpenapiClient::Audit.new({operation: 'getEntries'}) # Audit | Used to get the audit log entries

begin
  # GetStatistics | GetAlarm | GetAlarms | IgnoreAlarm
  api_instance.audit_post(audit)
rescue OpenapiClient::ApiError => e
  puts "Error when calling AuditApi->audit_post: #{e}"
end
```

#### Using the audit_post_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> audit_post_with_http_info(audit)

```ruby
begin
  # GetStatistics | GetAlarm | GetAlarms | IgnoreAlarm
  data, status_code, headers = api_instance.audit_post_with_http_info(audit)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue OpenapiClient::ApiError => e
  puts "Error when calling AuditApi->audit_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **audit** | [**Audit**](Audit.md) | Used to get the audit log entries |  |

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

