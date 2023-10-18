# coding: utf-8

"""
    Severalnines ClusterControl REST API (V2)

    REST API (V2) specification for ClusterControl - AI Powered Database automation tool for multi/hybrid cloud database deployment.

    The version of the OpenAPI document: OpenAPI specification v1.0.0
    Contact: sales@severalnines.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from openapi_cc_client.models.jobs import Jobs  # noqa: E501

class TestJobs(unittest.TestCase):
    """Jobs unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Jobs:
        """Test Jobs
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Jobs`
        """
        model = Jobs()  # noqa: E501
        if include_optional:
            return Jobs(
                operation = 'createJobInstance',
                cluster_id = 56,
                job_id = 56,
                signal = 56,
                ascending = True,
                limit = 56,
                offset = 56,
                log_level = '',
                job = openapi_cc_client.models.jobs_job.Jobs_job(
                    class_name = '', 
                    job_spec = openapi_cc_client.models.jobs_job_job_spec.Jobs_job_job_spec(
                        command = 'rolling_restart', 
                        id = 56, 
                        job_data = openapi_cc_client.models.jobs_job_job_spec_job_data.Jobs_job_job_spec_job_data(
                            action = 'enable', 
                            addnode = True, 
                            admin_username = '', 
                            admin_user = '', 
                            admin_password = '', 
                            audit_events = '', 
                            archive_mode = 'always', 
                            backupid = 56, 
                            backup_id = 56, 
                            build_from_source = True, 
                            cluster_name = '', 
                            clusterid = 56, 
                            cluster_type = 'mssql_single', 
                            company_id = '', 
                            config_template = '', 
                            backup_failover = True, 
                            backup_failover_host = 'auto', 
                            backup_method = 'pg_basebackup', 
                            backup_mysqldump_type = 'Complete', 
                            backup_individual_schemas = True, 
                            backup_retention = 56, 
                            extended_insert = True, 
                            backup_dir = '', 
                            backupsubdir = '', 
                            cc_storage = '', 
                            compression = True, 
                            compression_level = 56, 
                            db_database = '', 
                            db_password = '', 
                            db_privs = '', 
                            db_username = '', 
                            data_center = 56, 
                            exec_upgrade_script = True, 
                            extended = True, 
                            listening_port = 56, 
                            mask_passwords = True, 
                            monitor_password = '', 
                            monitor_user = '', 
                            use_clustering = True, 
                            use_rw_split = True, 
                            hostname = '', 
                            master_address = '', 
                            include_databases = '', 
                            install_timescaledb = True, 
                            update_lb = True, 
                            use_package_for_data_dir = True, 
                            encrypt_backup = True, 
                            throttle_rate_netbw = 56, 
                            use_pigz = True, 
                            use_qpress = True, 
                            wsrep_desync = True, 
                            xtrabackup_backup_locks = True, 
                            xtrabackup_lock_ddl_per_table = True, 
                            xtrabackup_parallellism = 56, 
                            verify_backup_delay = 56, 
                            data_dir = '', 
                            db_user = '', 
                            disable_firewall = True, 
                            disable_selinux = True, 
                            enable_uninstall = True, 
                            generate_token = True, 
                            install_software = True, 
                            use_internal_repos = True, 
                            local_repository = '', 
                            enable_mysql_uninstall = True, 
                            mysql_semi_sync = True, 
                            enable_ssl = True, 
                            mongos_conf_template = '', 
                            mongodb_authdb = '', 
                            node_type = 56, 
                            overwrite_mysqlchk = True, 
                            port = 56, 
                            ssh_keyfile = '', 
                            ssh_port = '', 
                            ssh_user = '', 
                            sudo_password = '', 
                            user_id = 56, 
                            vendor = 'default', 
                            type = 'postgresql', 
                            version = '', 
                            software_package = '', 
                            server_address = '', 
                            terminate_db_server = True, 
                            xtrabackup_use_memory = 56, 
                            initial = True, 
                            reboot = True, 
                            slave_address = '', 
                            force = True, 
                            force_stop = True, 
                            stop_timeout = 56, 
                            pitr_stop_time = '', 
                            pitr_stop_log = '', 
                            pitr_stop_pos = 56, 
                            host_location_uuid = '', 
                            bootstrap = True, 
                            snapshot_locaiton = '', 
                            snapshot_repository = '', 
                            storage_host = '', 
                            upload_backup_data_to_cloud_storage = openapi_cc_client.models.jobs_job_job_spec_job_data_upload_backup_data_to_cloud_storage.Jobs_job_job_spec_job_data_upload_backup_data_to_cloud_storage(
                                backup_retention = 56, 
                                bucket = '', 
                                cloud_storage_credentials_id = 56, 
                                cloud_storage_provider = '', 
                                cloud_storage_service = '', 
                                delete_after_upload = True, ), 
                            verify_backup = openapi_cc_client.models.backup_schedule_job_job_data_verify_backup.Backup_schedule_job_job_data_verify_backup(
                                disable_firewall = True, 
                                disable_selinux = True, 
                                install_software = True, 
                                server_address = '', 
                                terminate_db_server = True, ), 
                            config_servers = openapi_cc_client.models.jobs_job_job_spec_job_data_config_servers.Jobs_job_job_spec_job_data_config_servers(
                                rs = '', 
                                members = [
                                    openapi_cc_client.models.jobs_job_job_spec_job_data_config_servers_members_inner.Jobs_job_job_spec_job_data_config_servers_members_inner(
                                        hostname = '', 
                                        hostname_data = '', 
                                        hostname_internal = '', 
                                        port = '', )
                                    ], ), 
                            mongos_servers = [
                                openapi_cc_client.models.jobs_job_job_spec_job_data_config_servers_members_inner.Jobs_job_job_spec_job_data_config_servers_members_inner(
                                    hostname = '', 
                                    hostname_data = '', 
                                    hostname_internal = '', 
                                    port = '', )
                                ], 
                            node = openapi_cc_client.models.jobs_job_job_spec_job_data_node.Jobs_job_job_spec_job_data_node(
                                backend_name_ro = '', 
                                backend_name_rw = '', 
                                data_retention = '', 
                                data_retention_size = 56, 
                                hostname = '', 
                                lb_admin = '', 
                                lb_password = '', 
                                lb_policy = '', 
                                max_connection_be = 56, 
                                max_connection_fe = 56, 
                                port = 56, 
                                ro_port = 56, 
                                rw_port = 56, 
                                rw_splitting = True, 
                                stats_socket = '', 
                                timeout_client = 56, 
                                timeout_server = 56, 
                                xinetd_allow_from = '', 
                                scrape_interval = '', 
                                configuration = [
                                    openapi_cc_client.models.jobs_job_job_spec_job_data_node_configuration_inner.Jobs_job_job_spec_job_data_node_configuration_inner(
                                        arguments = '', 
                                        job = 'node', 
                                        scrape_interval = '', )
                                    ], ), 
                            nodes = [
                                openapi_cc_client.models.jobs_job_job_spec_job_data_nodes_inner.Jobs_job_job_spec_job_data_nodes_inner(
                                    class_name = 'CmonRedisHost', 
                                    cdt_path = '', 
                                    acl = '', 
                                    clusterid = 56, 
                                    ip = '', 
                                    maintenance_mode = 'none', 
                                    maintenance_mode_active = True, 
                                    timestamp = 56, 
                                    unique_id = 56, 
                                    hostname = '', 
                                    hostname_data = '', 
                                    hostname_internal = '', 
                                    port = '', 
                                    nodetype = '', 
                                    configfile = '', 
                                    datadir = '', 
                                    backup_dir = '', 
                                    synchronous = True, 
                                    protocol = 'elastic', 
                                    roles = 'master', )
                                ], 
                            node_adresses = [
                                openapi_cc_client.models.jobs_job_job_spec_job_data_node_adresses_inner.Jobs_job_job_spec_job_data_node_adresses_inner(
                                    hostname = '', 
                                    max_connection = 56, 
                                    max_replication_lag = 56, 
                                    port = 56, 
                                    weight = 56, )
                                ], 
                            topology = openapi_cc_client.models.jobs_job_job_spec_job_data_topology.Jobs_job_job_spec_job_data_topology(
                                master_slave_links = [
                                    {
                                        'key' : ''
                                        }
                                    ], ), 
                            replica_sets = [
                                openapi_cc_client.models.jobs_job_job_spec_job_data_replica_sets_inner.Jobs_job_job_spec_job_data_replica_sets_inner(
                                    rs = '', )
                                ], 
                            with_tags = [
                                ''
                                ], ), ), 
                    recurrence = '', 
                    tags = [
                        ''
                        ], 
                    title = 'Rolling Restart', 
                    status = 'PAUSED', )
            )
        else:
            return Jobs(
                operation = 'createJobInstance',
        )
        """

    def testJobs(self):
        """Test Jobs"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
