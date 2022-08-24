# OpenapiClient::JobsJobJobSpecJobDataNode

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **backend_name_ro** | **String** |  | [optional] |
| **backend_name_rw** | **String** |  | [optional] |
| **data_retention** | **String** |  | [optional] |
| **data_retention_size** | **Integer** |  | [optional] |
| **hostname** | **String** |  | [optional] |
| **lb_admin** | **String** |  | [optional] |
| **lb_password** | **String** |  | [optional] |
| **lb_policy** | **String** |  | [optional] |
| **max_connection_be** | **Integer** |  | [optional] |
| **max_connection_fe** | **Integer** |  | [optional] |
| **port** | **Integer** |  | [optional] |
| **ro_port** | **Integer** |  | [optional] |
| **rw_port** | **Integer** |  | [optional] |
| **rw_splitting** | **Boolean** |  | [optional] |
| **stats_socket** | **String** |  | [optional] |
| **timeout_client** | **Integer** |  | [optional] |
| **timeout_server** | **Integer** |  | [optional] |
| **xinetd_allow_from** | **String** |  | [optional] |
| **scrape_interval** | **String** |  | [optional] |
| **configuration** | [**Array&lt;JobsJobJobSpecJobDataNodeConfiguration&gt;**](JobsJobJobSpecJobDataNodeConfiguration.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::JobsJobJobSpecJobDataNode.new(
  backend_name_ro: null,
  backend_name_rw: null,
  data_retention: null,
  data_retention_size: null,
  hostname: null,
  lb_admin: null,
  lb_password: null,
  lb_policy: null,
  max_connection_be: null,
  max_connection_fe: null,
  port: null,
  ro_port: null,
  rw_port: null,
  rw_splitting: null,
  stats_socket: null,
  timeout_client: null,
  timeout_server: null,
  xinetd_allow_from: null,
  scrape_interval: null,
  configuration: null
)
```

