

# JobsJobJobSpec


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**command** | [**CommandEnum**](#CommandEnum) |  |  [optional] |
|**id** | **Integer** |  |  [optional] |
|**jobData** | [**JobsJobJobSpecJobData**](JobsJobJobSpecJobData.md) |  |  [optional] |



## Enum: CommandEnum

| Name | Value |
|---- | -----|
| ROLLING_RESTART | &quot;rolling_restart&quot; |
| CREATE_CLUSTER | &quot;create_cluster&quot; |
| REMOVE_CLUSTER | &quot;remove_cluster&quot; |
| BACKUP | &quot;backup&quot; |
| VERIFY_BACKUP | &quot;verify_backup&quot; |
| DEPLOY_AGENTS | &quot;deploy_agents&quot; |
| PBMAGENT | &quot;pbmagent&quot; |
| ADDNODE | &quot;addnode&quot; |
| PGBOUNCER | &quot;pgbouncer&quot; |
| PROMOTE_REPLICATION_SLAVE | &quot;promote_replication_slave&quot; |
| SETUP_AUDIT_LOGGING | &quot;setup_audit_logging&quot; |
| DISABLE_RECOVERY | &quot;disable_recovery&quot; |
| ENABLE_RECOVERY | &quot;enable_recovery&quot; |
| RESTART | &quot;restart&quot; |
| ENABLE_DB_READONLY | &quot;enable_db_readonly&quot; |
| ERROR_REPORT | &quot;error_report&quot; |
| CALCULATE_DB_GROWTH | &quot;calculate_db_growth&quot; |
| ENABLE_NODE_RECOVERY | &quot;enable_node_recovery&quot; |
| DISABLE_NODE_RECOVERY | &quot;disable_node_recovery&quot; |
| CHECK_PKG_UPGRADES | &quot;check_pkg_upgrades&quot; |
| UPGRADE_CLUSTER | &quot;upgrade_cluster&quot; |
| SUCCESS | &quot;success&quot; |
| ADD_REPLICATION_SLAVE | &quot;add_replication_slave&quot; |
| DEPLOY_CMONAGENTS | &quot;deploy_cmonagents&quot; |



