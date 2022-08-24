# \DiscoveryApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**backup_post**](DiscoveryApi.md#backup_post) | **POST** /backup | GetBackups | GetBackupSchedules | ScheduleBackup | DeleteBackupRecord
[**discovery_post**](DiscoveryApi.md#discovery_post) | **POST** /discovery | CheckClusterName | CheckHosts | GetSupportedClusterTypes



## backup_post

> backup_post(backup)
GetBackups | GetBackupSchedules | ScheduleBackup | DeleteBackupRecord

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**backup** | [**Backup**](Backup.md) | All things related to Backups | [required] |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## discovery_post

> discovery_post(discovery)
CheckClusterName | CheckHosts | GetSupportedClusterTypes

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**discovery** | [**Discovery**](Discovery.md) | All things related to Clusters and cluster Hosts | [required] |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

