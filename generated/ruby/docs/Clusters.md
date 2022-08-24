# OpenapiClient::Clusters

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **operation** | **String** |  |  |
| **cluster_id** | **Integer** |  | [optional] |
| **cluster_name** | **String** |  | [optional] |
| **with_hosts** | **Boolean** |  | [optional] |
| **with_sheet_info** | **Boolean** |  | [optional] |
| **configuration** | [**Array&lt;ClustersConfiguration&gt;**](ClustersConfiguration.md) |  | [optional] |
| **account** | [**ClustersAccount**](ClustersAccount.md) |  | [optional] |
| **filter_strings** | **String** |  | [optional] |
| **limit** | **Integer** |  | [optional] |
| **offset** | **Integer** |  | [optional] |
| **database** | [**ClustersDatabase**](ClustersDatabase.md) |  | [optional] |
| **nodes** | **Array&lt;String&gt;** |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::Clusters.new(
  operation: null,
  cluster_id: null,
  cluster_name: null,
  with_hosts: null,
  with_sheet_info: null,
  configuration: null,
  account: null,
  filter_strings: null,
  limit: null,
  offset: null,
  database: null,
  nodes: null
)
```

