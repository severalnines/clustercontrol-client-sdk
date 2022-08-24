# OpenapiClient::Discovery

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **operation** | **String** |  |  |
| **new_cluster_name** | **String** |  | [optional] |
| **check_if_already_registered** | **Boolean** |  | [optional] |
| **check_job** | **Boolean** |  | [optional] |
| **check_ssh_sudo** | **Boolean** |  | [optional] |
| **nodes** | [**Array&lt;DiscoveryNodes&gt;**](DiscoveryNodes.md) |  | [optional] |
| **job** | [**DiscoveryJob**](DiscoveryJob.md) |  | [optional] |
| **ssh_credentials** | [**DiscoverySshCredentials**](DiscoverySshCredentials.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::Discovery.new(
  operation: null,
  new_cluster_name: null,
  check_if_already_registered: null,
  check_job: null,
  check_ssh_sudo: null,
  nodes: null,
  job: null,
  ssh_credentials: null
)
```

