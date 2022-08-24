# openapi_cc_client.JobsApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**jobs_post**](JobsApi.md#jobs_post) | **POST** /jobs | CreateJobInstance | etc


# **jobs_post**
> jobs_post(jobs)

CreateJobInstance | etc

### Example


```python
import time
import openapi_cc_client
from openapi_cc_client.api import jobs_api
from openapi_cc_client.model.jobs import Jobs
from pprint import pprint
# Defining the host is optional and defaults to https://cchost:9501/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_cc_client.Configuration(
    host = "https://cchost:9501/v2"
)


# Enter a context with an instance of the API client
with openapi_cc_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = jobs_api.JobsApi(api_client)
    jobs = Jobs(
        operation="createJobInstance",
        cluster_id=1,
        job_id=1,
        signal=1,
        ascending=True,
        limit=1,
        offset=1,
        log_level="log_level_example",
        job=JobsJob(
            class_name="class_name_example",
            job_spec=JobsJobJobSpec(
                command="rolling_restart",
                id=1,
                job_data=JobsJobJobSpecJobData(
                    action="enable",
                    addnode=True,
                    admin_username="admin_username_example",
                    admin_user="admin_user_example",
                    admin_password="admin_password_example",
                    audit_events="audit_events_example",
                    archive_mode="always",
                    backupid=1,
                    backup_id=1,
                    build_from_source=True,
                    cluster_name="cluster_name_example",
                    clusterid=1,
                    cluster_type="mssql_single",
                    company_id="company_id_example",
                    config_template="config_template_example",
                    backup_failover=True,
                    backup_failover_host="auto",
                    backup_method="xtrabackupfull",
                    backup_mysqldump_type="Complete",
                    backup_individual_schemas=True,
                    backup_retention=1,
                    extended_insert=True,
                    backup_dir="backup_dir_example",
                    backupsubdir="backupsubdir_example",
                    cc_storage="cc_storage_example",
                    compression=True,
                    compression_level=1,
                    db_database="db_database_example",
                    db_password="db_password_example",
                    db_privs="db_privs_example",
                    db_username="db_username_example",
                    data_center=1,
                    exec_upgrade_script=True,
                    extended=True,
                    listening_port=1,
                    mask_passwords=True,
                    monitor_password="monitor_password_example",
                    monitor_user="monitor_user_example",
                    use_clustering=True,
                    use_rw_split=True,
                    hostname="hostname_example",
                    master_address="master_address_example",
                    include_databases="include_databases_example",
                    install_timescaledb=True,
                    update_lb=True,
                    use_package_for_data_dir=True,
                    encrypt_backup=True,
                    throttle_rate_netbw=1,
                    use_pigz=True,
                    use_qpress=True,
                    wsrep_desync=True,
                    xtrabackup_backup_locks=True,
                    xtrabackup_lock_ddl_per_table=True,
                    xtrabackup_parallellism=1,
                    verify_backup_delay=1,
                    data_dir="data_dir_example",
                    db_user="db_user_example",
                    disable_firewall=True,
                    disable_selinux=True,
                    enable_uninstall=True,
                    generate_token=True,
                    install_software=True,
                    use_internal_repos=True,
                    local_repository="local_repository_example",
                    enable_mysql_uninstall=True,
                    mysql_semi_sync=True,
                    enable_ssl=True,
                    mongos_conf_template="mongos_conf_template_example",
                    mongodb_authdb="mongodb_authdb_example",
                    node_type=1,
                    overwrite_mysqlchk=True,
                    port=1,
                    ssh_keyfile="ssh_keyfile_example",
                    ssh_port="ssh_port_example",
                    ssh_user="ssh_user_example",
                    sudo_password="sudo_password_example",
                    type="type_example",
                    user_id=1,
                    vendor="default",
                    version="version_example",
                    software_package="software_package_example",
                    server_address="server_address_example",
                    terminate_db_server=True,
                    xtrabackup_use_memory=1,
                    initial=True,
                    reboot=True,
                    slave_address="slave_address_example",
                    force=True,
                    force_stop=True,
                    stop_timeout=1,
                    pitr_stop_time="pitr_stop_time_example",
                    pitr_stop_log="pitr_stop_log_example",
                    pitr_stop_pos=1,
                    host_location_uuid="host_location_uuid_example",
                    bootstrap=True,
                    upload_backup_data_to_cloud_storage=JobsJobJobSpecJobDataUploadBackupDataToCloudStorage(
                        backup_retention=1,
                        bucket="bucket_example",
                        cloud_storage_credentials_id=1,
                        cloud_storage_provider="cloud_storage_provider_example",
                        cloud_storage_service="cloud_storage_service_example",
                        delete_after_upload=True,
                    ),
                    verify_backup=BackupScheduleJobJobDataVerifyBackup(
                        disable_firewall=True,
                        disable_selinux=True,
                        install_software=True,
                        server_address="server_address_example",
                        terminate_db_server=True,
                    ),
                    config_servers=JobsJobJobSpecJobDataConfigServers(
                        rs="rs_example",
                        members=[
                            JobsJobJobSpecJobDataConfigServersMembersInner(
                                hostname="hostname_example",
                                hostname_data="hostname_data_example",
                                hostname_internal="hostname_internal_example",
                                port="port_example",
                            ),
                        ],
                    ),
                    mongos_servers=[
                        JobsJobJobSpecJobDataConfigServersMembersInner(
                            hostname="hostname_example",
                            hostname_data="hostname_data_example",
                            hostname_internal="hostname_internal_example",
                            port="port_example",
                        ),
                    ],
                    node=JobsJobJobSpecJobDataNode(
                        backend_name_ro="backend_name_ro_example",
                        backend_name_rw="backend_name_rw_example",
                        data_retention="data_retention_example",
                        data_retention_size=1,
                        hostname="hostname_example",
                        lb_admin="lb_admin_example",
                        lb_password="lb_password_example",
                        lb_policy="lb_policy_example",
                        max_connection_be=1,
                        max_connection_fe=1,
                        port=1,
                        ro_port=1,
                        rw_port=1,
                        rw_splitting=True,
                        stats_socket="stats_socket_example",
                        timeout_client=1,
                        timeout_server=1,
                        xinetd_allow_from="xinetd_allow_from_example",
                        scrape_interval="scrape_interval_example",
                        configuration=[
                            JobsJobJobSpecJobDataNodeConfigurationInner(
                                arguments="arguments_example",
                                job="node",
                                scrape_interval="scrape_interval_example",
                            ),
                        ],
                    ),
                    nodes=[
                        JobsJobJobSpecJobDataNodesInner(
                            class_name="CmonRedisHost",
                            cdt_path="cdt_path_example",
                            acl="acl_example",
                            clusterid=1,
                            ip="ip_example",
                            maintenance_mode="none",
                            maintenance_mode_active=True,
                            timestamp=1,
                            unique_id=1,
                            hostname="hostname_example",
                            hostname_data="hostname_data_example",
                            hostname_internal="hostname_internal_example",
                            port="port_example",
                            nodetype="nodetype_example",
                            configfile="configfile_example",
                            datadir="datadir_example",
                            backup_dir="backup_dir_example",
                            synchronous=True,
                        ),
                    ],
                    node_adresses=[
                        JobsJobJobSpecJobDataNodeAdressesInner(
                            hostname="hostname_example",
                            max_connection=1,
                            max_replication_lag=1,
                            port=1,
                            weight=1,
                        ),
                    ],
                    topology=JobsJobJobSpecJobDataTopology(
                        master_slave_links=[
                            {
                                "key": "key_example",
                            },
                        ],
                    ),
                    replica_sets=[
                        JobsJobJobSpecJobDataReplicaSetsInner(
                            rs="rs_example",
                            members=[
                                JobsJobJobSpecJobDataReplicaSetsInnerMembersInner(
                                    hostname="hostname_example",
                                    hostname_data="hostname_data_example",
                                    hostname_internal="hostname_internal_example",
                                    port="port_example",
                                    arbiter_only=True,
                                    hidden=True,
                                    priority="priority_example",
                                    slave_delay="slave_delay_example",
                                ),
                            ],
                        ),
                    ],
                    with_tags=[
                        "with_tags_example",
                    ],
                ),
            ),
            recurrence="recurrence_example",
            tags=[
                "tags_example",
            ],
            title="Rolling Restart",
            status="PAUSED",
        ),
    ) # Jobs | Creating, manipulating, and obtaining information about jobs

    # example passing only required values which don't have defaults set
    try:
        # CreateJobInstance | etc
        api_instance.jobs_post(jobs)
    except openapi_cc_client.ApiException as e:
        print("Exception when calling JobsApi->jobs_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobs** | [**Jobs**](Jobs.md)| Creating, manipulating, and obtaining information about jobs |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**405** | Unauthorized |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

