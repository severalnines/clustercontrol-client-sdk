# OpenapiClient::StatPrometheusQueries

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **query** | **String** | mysql_global_status_wsrep_cert_deps_distance{instance&#x3D;~\&quot;10.117.12.165(:[0-9]+)?\&quot;} | [optional] |
| **step** | **Integer** | e.g. 10 | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::StatPrometheusQueries.new(
  query: null,
  step: null
)
```

