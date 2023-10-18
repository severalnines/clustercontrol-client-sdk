# JobsJobJobSpecJobData


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **str** |  | [optional] 
**addnode** | **bool** |  | [optional] 
**admin_username** | **str** |  | [optional] 
**admin_user** | **str** |  | [optional] 
**admin_password** | **str** |  | [optional] 
**audit_events** | **str** |  | [optional] 
**archive_mode** | **str** |  | [optional] 
**backupid** | **int** |  | [optional] 
**backup_id** | **int** |  | [optional] 
**build_from_source** | **bool** |  | [optional] 
**cluster_name** | **str** |  | [optional] 
**clusterid** | **int** |  | [optional] 
**cluster_type** | **str** |  | [optional] 
**company_id** | **str** |  | [optional] 
**config_template** | **str** |  | [optional] 
**backup_failover** | **bool** |  | [optional] 
**backup_failover_host** | **str** |  | [optional] 
**backup_method** | **str** |  | [optional] 
**backup_mysqldump_type** | **str** |  | [optional] 
**backup_individual_schemas** | **bool** |  | [optional] 
**backup_retention** | **int** |  | [optional] 
**extended_insert** | **bool** |  | [optional] 
**backup_dir** | **str** |  | [optional] 
**backupsubdir** | **str** |  | [optional] 
**cc_storage** | **str** |  | [optional] 
**compression** | **bool** |  | [optional] 
**compression_level** | **int** |  | [optional] 
**db_database** | **str** |  | [optional] 
**db_password** | **str** |  | [optional] 
**db_privs** | **str** |  | [optional] 
**db_username** | **str** |  | [optional] 
**data_center** | **int** |  | [optional] 
**exec_upgrade_script** | **bool** |  | [optional] 
**extended** | **bool** |  | [optional] 
**listening_port** | **int** |  | [optional] 
**mask_passwords** | **bool** |  | [optional] 
**monitor_password** | **str** |  | [optional] 
**monitor_user** | **str** |  | [optional] 
**use_clustering** | **bool** |  | [optional] 
**use_rw_split** | **bool** |  | [optional] 
**hostname** | **str** |  | [optional] 
**master_address** | **str** |  | [optional] 
**include_databases** | **str** |  | [optional] 
**install_timescaledb** | **bool** |  | [optional] 
**update_lb** | **bool** |  | [optional] 
**use_package_for_data_dir** | **bool** |  | [optional] 
**encrypt_backup** | **bool** |  | [optional] 
**throttle_rate_netbw** | **int** |  | [optional] 
**use_pigz** | **bool** |  | [optional] 
**use_qpress** | **bool** |  | [optional] 
**wsrep_desync** | **bool** |  | [optional] 
**xtrabackup_backup_locks** | **bool** |  | [optional] 
**xtrabackup_lock_ddl_per_table** | **bool** |  | [optional] 
**xtrabackup_parallellism** | **int** |  | [optional] 
**verify_backup_delay** | **int** |  | [optional] 
**data_dir** | **str** |  | [optional] 
**db_user** | **str** |  | [optional] 
**disable_firewall** | **bool** |  | [optional] 
**disable_selinux** | **bool** |  | [optional] 
**enable_uninstall** | **bool** |  | [optional] 
**generate_token** | **bool** |  | [optional] 
**install_software** | **bool** |  | [optional] 
**use_internal_repos** | **bool** |  | [optional] 
**local_repository** | **str** |  | [optional] 
**enable_mysql_uninstall** | **bool** |  | [optional] 
**mysql_semi_sync** | **bool** |  | [optional] 
**enable_ssl** | **bool** |  | [optional] 
**mongos_conf_template** | **str** |  | [optional] 
**mongodb_authdb** | **str** |  | [optional] 
**node_type** | **int** |  | [optional] 
**overwrite_mysqlchk** | **bool** |  | [optional] 
**port** | **int** |  | [optional] 
**ssh_keyfile** | **str** |  | [optional] 
**ssh_port** | **str** |  | [optional] 
**ssh_user** | **str** |  | [optional] 
**sudo_password** | **str** |  | [optional] 
**user_id** | **int** |  | [optional] 
**vendor** | **str** |  | [optional] 
**type** | **str** |  | [optional] 
**version** | **str** |  | [optional] 
**software_package** | **str** |  | [optional] 
**server_address** | **str** |  | [optional] 
**terminate_db_server** | **bool** |  | [optional] 
**xtrabackup_use_memory** | **int** |  | [optional] 
**initial** | **bool** |  | [optional] 
**reboot** | **bool** |  | [optional] 
**slave_address** | **str** |  | [optional] 
**force** | **bool** |  | [optional] 
**force_stop** | **bool** |  | [optional] 
**stop_timeout** | **int** |  | [optional] 
**pitr_stop_time** | **str** |  | [optional] 
**pitr_stop_log** | **str** |  | [optional] 
**pitr_stop_pos** | **int** |  | [optional] 
**host_location_uuid** | **str** |  | [optional] 
**bootstrap** | **bool** |  | [optional] 
**snapshot_locaiton** | **str** |  | [optional] 
**snapshot_repository** | **str** |  | [optional] 
**storage_host** | **str** |  | [optional] 
**upload_backup_data_to_cloud_storage** | [**JobsJobJobSpecJobDataUploadBackupDataToCloudStorage**](JobsJobJobSpecJobDataUploadBackupDataToCloudStorage.md) |  | [optional] 
**verify_backup** | [**BackupScheduleJobJobDataVerifyBackup**](BackupScheduleJobJobDataVerifyBackup.md) |  | [optional] 
**config_servers** | [**JobsJobJobSpecJobDataConfigServers**](JobsJobJobSpecJobDataConfigServers.md) |  | [optional] 
**mongos_servers** | [**List[JobsJobJobSpecJobDataConfigServersMembersInner]**](JobsJobJobSpecJobDataConfigServersMembersInner.md) |  | [optional] 
**node** | [**JobsJobJobSpecJobDataNode**](JobsJobJobSpecJobDataNode.md) |  | [optional] 
**nodes** | [**List[JobsJobJobSpecJobDataNodesInner]**](JobsJobJobSpecJobDataNodesInner.md) |  | [optional] 
**node_adresses** | [**List[JobsJobJobSpecJobDataNodeAdressesInner]**](JobsJobJobSpecJobDataNodeAdressesInner.md) |  | [optional] 
**topology** | [**JobsJobJobSpecJobDataTopology**](JobsJobJobSpecJobDataTopology.md) |  | [optional] 
**replica_sets** | [**List[JobsJobJobSpecJobDataReplicaSetsInner]**](JobsJobJobSpecJobDataReplicaSetsInner.md) |  | [optional] 
**with_tags** | **List[str]** |  | [optional] 

## Example

```python
from openapi_cc_client.models.jobs_job_job_spec_job_data import JobsJobJobSpecJobData

# TODO update the JSON string below
json = "{}"
# create an instance of JobsJobJobSpecJobData from a JSON string
jobs_job_job_spec_job_data_instance = JobsJobJobSpecJobData.from_json(json)
# print the JSON string representation of the object
print JobsJobJobSpecJobData.to_json()

# convert the object into a dict
jobs_job_job_spec_job_data_dict = jobs_job_job_spec_job_data_instance.to_dict()
# create an instance of JobsJobJobSpecJobData from a dict
jobs_job_job_spec_job_data_form_dict = jobs_job_job_spec_job_data.from_dict(jobs_job_job_spec_job_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


