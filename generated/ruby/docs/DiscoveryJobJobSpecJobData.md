# OpenapiClient::DiscoveryJobJobSpecJobData

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **cluster_type** | **String** |  | [optional] |
| **mysql_version** | **String** |  | [optional] |
| **vendor** | **String** |  | [optional] |
| **nodes** | [**Array&lt;DiscoveryJobJobSpecJobDataNodes&gt;**](DiscoveryJobJobSpecJobDataNodes.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::DiscoveryJobJobSpecJobData.new(
  cluster_type: null,
  mysql_version: null,
  vendor: null,
  nodes: null
)
```

