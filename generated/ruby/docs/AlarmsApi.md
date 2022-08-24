# OpenapiClient::AlarmsApi

All URIs are relative to *https://cchost:9501/v2*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**alarm_post**](AlarmsApi.md#alarm_post) | **POST** /alarm | GetStatistics | GetAlarm | GetAlarms | IgnoreAlarm |


## alarm_post

> alarm_post(alarm)

GetStatistics | GetAlarm | GetAlarms | IgnoreAlarm

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::AlarmsApi.new
alarm = OpenapiClient::Alarm.new({operation: 'getStatistics'}) # Alarm | All things related to Alarms and Stats

begin
  # GetStatistics | GetAlarm | GetAlarms | IgnoreAlarm
  api_instance.alarm_post(alarm)
rescue OpenapiClient::ApiError => e
  puts "Error when calling AlarmsApi->alarm_post: #{e}"
end
```

#### Using the alarm_post_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> alarm_post_with_http_info(alarm)

```ruby
begin
  # GetStatistics | GetAlarm | GetAlarms | IgnoreAlarm
  data, status_code, headers = api_instance.alarm_post_with_http_info(alarm)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue OpenapiClient::ApiError => e
  puts "Error when calling AlarmsApi->alarm_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **alarm** | [**Alarm**](Alarm.md) | All things related to Alarms and Stats |  |

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

