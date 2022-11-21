# AlarmsApi

All URIs are relative to *https://&lt;cchost&gt;:9501/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**alarmPost**](AlarmsApi.md#alarmPost) | **POST** /alarm | GetStatistics | GetAlarm | GetAlarms | IgnoreAlarm |


<a name="alarmPost"></a>
# **alarmPost**
> AlarmResponse alarmPost(alarm)

GetStatistics | GetAlarm | GetAlarms | IgnoreAlarm

### Example
```java
// Import classes:
import org.openapitools.ccapi.client.ApiClient;
import org.openapitools.ccapi.client.ApiException;
import org.openapitools.ccapi.client.Configuration;
import org.openapitools.ccapi.client.models.*;
import org.openapitools.ccapi.client.api.AlarmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://<cchost>:9501/v2");

    AlarmsApi apiInstance = new AlarmsApi(defaultClient);
    Alarm alarm = new Alarm(); // Alarm | All things related to Alarms and Stats
    try {
      AlarmResponse result = apiInstance.alarmPost(alarm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlarmsApi#alarmPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **alarm** | [**Alarm**](Alarm.md)| All things related to Alarms and Stats | |

### Return type

[**AlarmResponse**](AlarmResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **405** | Unauthorized |  -  |

