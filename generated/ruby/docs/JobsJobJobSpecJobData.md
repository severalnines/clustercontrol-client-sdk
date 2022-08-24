# OpenapiClient::JobsJobJobSpecJobData

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **action** | **String** |  | [optional] |
| **addnode** | **Boolean** |  | [optional] |
| **admin_username** | **String** |  | [optional] |
| **admin_user** | **String** |  | [optional] |
| **admin_password** | **String** |  | [optional] |
| **audit_events** | **String** |  | [optional] |
| **backupid** | **Integer** |  | [optional] |
| **backup_id** | **Integer** |  | [optional] |
| **build_from_source** | **Boolean** |  | [optional] |
| **cluster_name** | **String** |  | [optional] |
| **clusterid** | **Integer** |  | [optional] |
| **cluster_type** | **String** |  | [optional] |
| **company_id** | **String** |  | [optional] |
| **config_template** | **String** |  | [optional] |
| **backup_failover** | **Boolean** |  | [optional] |
| **backup_failover_host** | **String** |  | [optional] |
| **backup_method** | **String** |  | [optional] |
| **backup_mysqldump_type** | **String** |  | [optional] |
| **backup_individual_schemas** | **Boolean** |  | [optional] |
| **backup_retention** | **Integer** |  | [optional] |
| **extended_insert** | **Boolean** |  | [optional] |
| **backup_dir** | **String** |  | [optional] |
| **backupsubdir** | **String** |  | [optional] |
| **cc_storage** | **String** |  | [optional] |
| **compression** | **Boolean** |  | [optional] |
| **compression_level** | **Integer** |  | [optional] |
| **db_database** | **String** |  | [optional] |
| **db_password** | **String** |  | [optional] |
| **db_privs** | **String** |  | [optional] |
| **db_username** | **String** |  | [optional] |
| **exec_upgrade_script** | **Boolean** |  | [optional] |
| **listening_port** | **Integer** |  | [optional] |
| **monitor_password** | **String** |  | [optional] |
| **monitor_user** | **String** |  | [optional] |
| **use_clustering** | **Boolean** |  | [optional] |
| **use_rw_split** | **Boolean** |  | [optional] |
| **hostname** | **String** |  | [optional] |
| **master_address** | **String** |  | [optional] |
| **include_databases** | **String** |  | [optional] |
| **install_timescaledb** | **Boolean** |  | [optional] |
| **update_lb** | **Boolean** |  | [optional] |
| **encrypt_backup** | **Boolean** |  | [optional] |
| **throttle_rate_netbw** | **Integer** |  | [optional] |
| **use_pigz** | **Boolean** |  | [optional] |
| **use_qpress** | **Boolean** |  | [optional] |
| **wsrep_desync** | **Boolean** |  | [optional] |
| **xtrabackup_backup_locks** | **Boolean** |  | [optional] |
| **xtrabackup_lock_ddl_per_table** | **Boolean** |  | [optional] |
| **xtrabackup_parallellism** | **Integer** |  | [optional] |
| **verify_backup_delay** | **Integer** |  | [optional] |
| **data_dir** | **String** |  | [optional] |
| **db_user** | **String** |  | [optional] |
| **disable_firewall** | **Boolean** |  | [optional] |
| **disable_selinux** | **Boolean** |  | [optional] |
| **enabl_uninstall** | **Boolean** |  | [optional] |
| **generate_token** | **Boolean** |  | [optional] |
| **install_software** | **Boolean** |  | [optional] |
| **enable_mysql_uninstall** | **Boolean** |  | [optional] |
| **mysql_semi_sync** | **Boolean** |  | [optional] |
| **enable_ssl** | **Boolean** |  | [optional] |
| **mongos_conf_template** | **String** |  | [optional] |
| **mongodb_authdb** | **String** |  | [optional] |
| **node_type** | **Integer** |  | [optional] |
| **overwrite_mysqlchk** | **Boolean** |  | [optional] |
| **port** | **Integer** |  | [optional] |
| **ssh_keyfile** | **String** |  | [optional] |
| **ssh_port** | **String** |  | [optional] |
| **ssh_user** | **String** |  | [optional] |
| **sudo_password** | **String** |  | [optional] |
| **user_id** | **Integer** |  | [optional] |
| **vendor** | **String** |  | [optional] |
| **version** | **String** |  | [optional] |
| **software_package** | **String** |  | [optional] |
| **server_address** | **String** |  | [optional] |
| **terminate_db_server** | **Boolean** |  | [optional] |
| **xtrabackup_use_memory** | **Integer** |  | [optional] |
| **initial** | **Boolean** |  | [optional] |
| **reboot** | **Boolean** |  | [optional] |
| **slave_address** | **String** |  | [optional] |
| **force** | **Boolean** |  | [optional] |
| **force_stop** | **Boolean** |  | [optional] |
| **stop_timeout** | **Integer** |  | [optional] |
| **verify_backup** | [**JobsJobJobSpecJobDataVerifyBackup**](JobsJobJobSpecJobDataVerifyBackup.md) |  | [optional] |
| **config_servers** | [**JobsJobJobSpecJobDataConfigServers**](JobsJobJobSpecJobDataConfigServers.md) |  | [optional] |
| **mongos_servers2** | [**Array&lt;JobsJobJobSpecJobDataConfigServersMembers&gt;**](JobsJobJobSpecJobDataConfigServersMembers.md) |  | [optional] |
| **node** | [**JobsJobJobSpecJobDataNode**](JobsJobJobSpecJobDataNode.md) |  | [optional] |
| **nodes** | [**Array&lt;JobsJobJobSpecJobDataNodes&gt;**](JobsJobJobSpecJobDataNodes.md) |  | [optional] |
| **node_adresses** | [**Array&lt;JobsJobJobSpecJobDataNodeAdresses&gt;**](JobsJobJobSpecJobDataNodeAdresses.md) |  | [optional] |
| **topology** | [**JobsJobJobSpecJobDataTopology**](JobsJobJobSpecJobDataTopology.md) |  | [optional] |
| **replica_sets** | [**Array&lt;JobsJobJobSpecJobDataReplicaSets&gt;**](JobsJobJobSpecJobDataReplicaSets.md) |  | [optional] |
| **with_tags** | **Array&lt;String&gt;** |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::JobsJobJobSpecJobData.new(
  action: null,
  addnode: null,
  admin_username: null,
  admin_user: null,
  admin_password: null,
  audit_events: null,
  backupid: null,
  backup_id: null,
  build_from_source: null,
  cluster_name: null,
  clusterid: null,
  cluster_type: null,
  company_id: null,
  config_template: null,
  backup_failover: null,
  backup_failover_host: null,
  backup_method: null,
  backup_mysqldump_type: null,
  backup_individual_schemas: null,
  backup_retention: null,
  extended_insert: null,
  backup_dir: null,
  backupsubdir: null,
  cc_storage: null,
  compression: null,
  compression_level: null,
  db_database: null,
  db_password: null,
  db_privs: null,
  db_username: null,
  exec_upgrade_script: null,
  listening_port: null,
  monitor_password: null,
  monitor_user: null,
  use_clustering: null,
  use_rw_split: null,
  hostname: null,
  master_address: null,
  include_databases: null,
  install_timescaledb: null,
  update_lb: null,
  encrypt_backup: null,
  throttle_rate_netbw: null,
  use_pigz: null,
  use_qpress: null,
  wsrep_desync: null,
  xtrabackup_backup_locks: null,
  xtrabackup_lock_ddl_per_table: null,
  xtrabackup_parallellism: null,
  verify_backup_delay: null,
  data_dir: null,
  db_user: null,
  disable_firewall: null,
  disable_selinux: null,
  enabl_uninstall: null,
  generate_token: null,
  install_software: null,
  enable_mysql_uninstall: null,
  mysql_semi_sync: null,
  enable_ssl: null,
  mongos_conf_template: null,
  mongodb_authdb: null,
  node_type: null,
  overwrite_mysqlchk: null,
  port: null,
  ssh_keyfile: null,
  ssh_port: null,
  ssh_user: null,
  sudo_password: null,
  user_id: null,
  vendor: null,
  version: null,
  software_package: null,
  server_address: null,
  terminate_db_server: null,
  xtrabackup_use_memory: null,
  initial: null,
  reboot: null,
  slave_address: null,
  force: null,
  force_stop: null,
  stop_timeout: null,
  verify_backup: null,
  config_servers: null,
  mongos_servers2: null,
  node: null,
  nodes: null,
  node_adresses: null,
  topology: null,
  replica_sets: null,
  with_tags: null
)
```

