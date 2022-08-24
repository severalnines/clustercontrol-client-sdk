# SeveralninesClusterControl.AuditApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**auditPost**](AuditApi.md#auditPost) | **POST** /audit | GetStatistics | GetAlarm | GetAlarms | IgnoreAlarm



## auditPost

> auditPost(audit)

GetStatistics | GetAlarm | GetAlarms | IgnoreAlarm

### Example

```javascript
import SeveralninesClusterControl from 'severalnines_cluster_control';

let apiInstance = new SeveralninesClusterControl.AuditApi();
let audit = new SeveralninesClusterControl.Audit(); // Audit | Used to get the audit log entries
apiInstance.auditPost(audit, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audit** | [**Audit**](Audit.md)| Used to get the audit log entries | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

