

# StatPrometheus


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operation** | [**OperationEnum**](#OperationEnum) |  |  |
|**clusterId** | **Integer** |  |  [optional] |
|**clusterName** | **String** |  |  [optional] |
|**queries** | [**List&lt;StatPrometheusQueriesInner&gt;**](StatPrometheusQueriesInner.md) |  |  [optional] |
|**start** | **Integer** | Seconds since 1970. e.g. 1622105617 |  [optional] |
|**end** | **Integer** | Seconds since 1970. e.g. 1622108317 |  [optional] |
|**step** | **Integer** |  |  [optional] |
|**returnfrom** | **Integer** |  |  [optional] |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| _PROMETHEUS | &quot;/prometheus&quot; |



