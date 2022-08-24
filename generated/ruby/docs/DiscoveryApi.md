# OpenapiClient::DiscoveryApi

All URIs are relative to *https://cchost:9501/v2*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**backup_post**](DiscoveryApi.md#backup_post) | **POST** /backup | GetBackups | GetBackupSchedules | ScheduleBackup | DeleteBackupRecord |
| [**discovery_post**](DiscoveryApi.md#discovery_post) | **POST** /discovery | CheckClusterName | CheckHosts | GetSupportedClusterTypes |


## backup_post

> backup_post(backup)

GetBackups | GetBackupSchedules | ScheduleBackup | DeleteBackupRecord

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::DiscoveryApi.new
backup = OpenapiClient::Backup.new({operation: 'getBackups'}) # Backup | All things related to Backups

begin
  # GetBackups | GetBackupSchedules | ScheduleBackup | DeleteBackupRecord
  api_instance.backup_post(backup)
rescue OpenapiClient::ApiError => e
  puts "Error when calling DiscoveryApi->backup_post: #{e}"
end
```

#### Using the backup_post_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> backup_post_with_http_info(backup)

```ruby
begin
  # GetBackups | GetBackupSchedules | ScheduleBackup | DeleteBackupRecord
  data, status_code, headers = api_instance.backup_post_with_http_info(backup)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue OpenapiClient::ApiError => e
  puts "Error when calling DiscoveryApi->backup_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **backup** | [**Backup**](Backup.md) | All things related to Backups |  |

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


## discovery_post

> discovery_post(discovery)

CheckClusterName | CheckHosts | GetSupportedClusterTypes

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::DiscoveryApi.new
discovery = OpenapiClient::Discovery.new({operation: 'checkClusterName'}) # Discovery | All things related to Clusters and cluster Hosts

begin
  # CheckClusterName | CheckHosts | GetSupportedClusterTypes
  api_instance.discovery_post(discovery)
rescue OpenapiClient::ApiError => e
  puts "Error when calling DiscoveryApi->discovery_post: #{e}"
end
```

#### Using the discovery_post_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> discovery_post_with_http_info(discovery)

```ruby
begin
  # CheckClusterName | CheckHosts | GetSupportedClusterTypes
  data, status_code, headers = api_instance.discovery_post_with_http_info(discovery)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue OpenapiClient::ApiError => e
  puts "Error when calling DiscoveryApi->discovery_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **discovery** | [**Discovery**](Discovery.md) | All things related to Clusters and cluster Hosts |  |

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

