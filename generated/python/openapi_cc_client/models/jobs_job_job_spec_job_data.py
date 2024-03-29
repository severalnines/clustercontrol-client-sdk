# coding: utf-8

"""
    Severalnines ClusterControl REST API (V2)

    REST API (V2) specification for ClusterControl - AI Powered Database automation tool for multi/hybrid cloud database deployment.

    The version of the OpenAPI document: OpenAPI specification v1.0.0
    Contact: sales@severalnines.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json


from typing import List, Optional
from pydantic import BaseModel, Field, StrictBool, StrictInt, StrictStr, conlist, validator
from openapi_cc_client.models.backup_schedule_job_job_data_verify_backup import BackupScheduleJobJobDataVerifyBackup
from openapi_cc_client.models.jobs_job_job_spec_job_data_config_servers import JobsJobJobSpecJobDataConfigServers
from openapi_cc_client.models.jobs_job_job_spec_job_data_config_servers_members_inner import JobsJobJobSpecJobDataConfigServersMembersInner
from openapi_cc_client.models.jobs_job_job_spec_job_data_node import JobsJobJobSpecJobDataNode
from openapi_cc_client.models.jobs_job_job_spec_job_data_node_adresses_inner import JobsJobJobSpecJobDataNodeAdressesInner
from openapi_cc_client.models.jobs_job_job_spec_job_data_nodes_inner import JobsJobJobSpecJobDataNodesInner
from openapi_cc_client.models.jobs_job_job_spec_job_data_replica_sets_inner import JobsJobJobSpecJobDataReplicaSetsInner
from openapi_cc_client.models.jobs_job_job_spec_job_data_topology import JobsJobJobSpecJobDataTopology
from openapi_cc_client.models.jobs_job_job_spec_job_data_upload_backup_data_to_cloud_storage import JobsJobJobSpecJobDataUploadBackupDataToCloudStorage

class JobsJobJobSpecJobData(BaseModel):
    """
    JobsJobJobSpecJobData
    """
    action: Optional[StrictStr] = None
    addnode: Optional[StrictBool] = None
    admin_username: Optional[StrictStr] = None
    admin_user: Optional[StrictStr] = None
    admin_password: Optional[StrictStr] = None
    audit_events: Optional[StrictStr] = None
    archive_mode: Optional[StrictStr] = None
    backupid: Optional[StrictInt] = None
    backup_id: Optional[StrictInt] = None
    build_from_source: Optional[StrictBool] = None
    cluster_name: Optional[StrictStr] = None
    clusterid: Optional[StrictInt] = None
    cluster_type: Optional[StrictStr] = None
    company_id: Optional[StrictStr] = None
    config_template: Optional[StrictStr] = None
    backup_failover: Optional[StrictBool] = None
    backup_failover_host: Optional[StrictStr] = None
    backup_method: Optional[StrictStr] = None
    backup_mysqldump_type: Optional[StrictStr] = None
    backup_individual_schemas: Optional[StrictBool] = None
    backup_retention: Optional[StrictInt] = None
    extended_insert: Optional[StrictBool] = None
    backup_dir: Optional[StrictStr] = None
    backupsubdir: Optional[StrictStr] = None
    cc_storage: Optional[StrictStr] = None
    compression: Optional[StrictBool] = None
    compression_level: Optional[StrictInt] = None
    db_database: Optional[StrictStr] = None
    db_password: Optional[StrictStr] = None
    db_privs: Optional[StrictStr] = None
    db_username: Optional[StrictStr] = None
    data_center: Optional[StrictInt] = None
    exec_upgrade_script: Optional[StrictBool] = None
    extended: Optional[StrictBool] = None
    listening_port: Optional[StrictInt] = None
    mask_passwords: Optional[StrictBool] = None
    monitor_password: Optional[StrictStr] = None
    monitor_user: Optional[StrictStr] = None
    use_clustering: Optional[StrictBool] = None
    use_rw_split: Optional[StrictBool] = None
    hostname: Optional[StrictStr] = None
    master_address: Optional[StrictStr] = None
    include_databases: Optional[StrictStr] = None
    install_timescaledb: Optional[StrictBool] = None
    update_lb: Optional[StrictBool] = None
    use_package_for_data_dir: Optional[StrictBool] = Field(None, alias="usePackageForDataDir")
    encrypt_backup: Optional[StrictBool] = None
    throttle_rate_netbw: Optional[StrictInt] = None
    use_pigz: Optional[StrictBool] = None
    use_qpress: Optional[StrictBool] = None
    wsrep_desync: Optional[StrictBool] = None
    xtrabackup_backup_locks: Optional[StrictBool] = None
    xtrabackup_lock_ddl_per_table: Optional[StrictBool] = None
    xtrabackup_parallellism: Optional[StrictInt] = None
    verify_backup_delay: Optional[StrictInt] = None
    data_dir: Optional[StrictStr] = None
    db_user: Optional[StrictStr] = None
    disable_firewall: Optional[StrictBool] = None
    disable_selinux: Optional[StrictBool] = None
    enable_uninstall: Optional[StrictBool] = None
    generate_token: Optional[StrictBool] = None
    install_software: Optional[StrictBool] = None
    use_internal_repos: Optional[StrictBool] = None
    local_repository: Optional[StrictStr] = None
    enable_mysql_uninstall: Optional[StrictBool] = None
    mysql_semi_sync: Optional[StrictBool] = None
    enable_ssl: Optional[StrictBool] = None
    mongos_conf_template: Optional[StrictStr] = None
    mongodb_authdb: Optional[StrictStr] = None
    node_type: Optional[StrictInt] = None
    overwrite_mysqlchk: Optional[StrictBool] = None
    port: Optional[StrictInt] = None
    ssh_keyfile: Optional[StrictStr] = None
    ssh_port: Optional[StrictStr] = None
    ssh_user: Optional[StrictStr] = None
    sudo_password: Optional[StrictStr] = None
    user_id: Optional[StrictInt] = None
    vendor: Optional[StrictStr] = None
    type: Optional[StrictStr] = None
    version: Optional[StrictStr] = None
    software_package: Optional[StrictStr] = None
    server_address: Optional[StrictStr] = None
    terminate_db_server: Optional[StrictBool] = None
    xtrabackup_use_memory: Optional[StrictInt] = None
    initial: Optional[StrictBool] = None
    reboot: Optional[StrictBool] = None
    slave_address: Optional[StrictStr] = None
    force: Optional[StrictBool] = None
    force_stop: Optional[StrictBool] = None
    stop_timeout: Optional[StrictInt] = None
    pitr_stop_time: Optional[StrictStr] = None
    pitr_stop_log: Optional[StrictStr] = None
    pitr_stop_pos: Optional[StrictInt] = None
    host_location_uuid: Optional[StrictStr] = None
    bootstrap: Optional[StrictBool] = None
    snapshot_locaiton: Optional[StrictStr] = None
    snapshot_repository: Optional[StrictStr] = None
    storage_host: Optional[StrictStr] = None
    upload_backup_data_to_cloud_storage: Optional[JobsJobJobSpecJobDataUploadBackupDataToCloudStorage] = None
    verify_backup: Optional[BackupScheduleJobJobDataVerifyBackup] = None
    config_servers: Optional[JobsJobJobSpecJobDataConfigServers] = None
    mongos_servers: Optional[conlist(JobsJobJobSpecJobDataConfigServersMembersInner)] = None
    node: Optional[JobsJobJobSpecJobDataNode] = None
    nodes: Optional[conlist(JobsJobJobSpecJobDataNodesInner)] = None
    node_adresses: Optional[conlist(JobsJobJobSpecJobDataNodeAdressesInner)] = None
    topology: Optional[JobsJobJobSpecJobDataTopology] = None
    replica_sets: Optional[conlist(JobsJobJobSpecJobDataReplicaSetsInner)] = None
    with_tags: Optional[conlist(StrictStr)] = None
    __properties = ["action", "addnode", "admin_username", "admin_user", "admin_password", "audit_events", "archive_mode", "backupid", "backup_id", "build_from_source", "cluster_name", "clusterid", "cluster_type", "company_id", "config_template", "backup_failover", "backup_failover_host", "backup_method", "backup_mysqldump_type", "backup_individual_schemas", "backup_retention", "extended_insert", "backup_dir", "backupsubdir", "cc_storage", "compression", "compression_level", "db_database", "db_password", "db_privs", "db_username", "data_center", "exec_upgrade_script", "extended", "listening_port", "mask_passwords", "monitor_password", "monitor_user", "use_clustering", "use_rw_split", "hostname", "master_address", "include_databases", "install_timescaledb", "update_lb", "usePackageForDataDir", "encrypt_backup", "throttle_rate_netbw", "use_pigz", "use_qpress", "wsrep_desync", "xtrabackup_backup_locks", "xtrabackup_lock_ddl_per_table", "xtrabackup_parallellism", "verify_backup_delay", "data_dir", "db_user", "disable_firewall", "disable_selinux", "enable_uninstall", "generate_token", "install_software", "use_internal_repos", "local_repository", "enable_mysql_uninstall", "mysql_semi_sync", "enable_ssl", "mongos_conf_template", "mongodb_authdb", "node_type", "overwrite_mysqlchk", "port", "ssh_keyfile", "ssh_port", "ssh_user", "sudo_password", "user_id", "vendor", "type", "version", "software_package", "server_address", "terminate_db_server", "xtrabackup_use_memory", "initial", "reboot", "slave_address", "force", "force_stop", "stop_timeout", "pitr_stop_time", "pitr_stop_log", "pitr_stop_pos", "host_location_uuid", "bootstrap", "snapshot_locaiton", "snapshot_repository", "storage_host", "upload_backup_data_to_cloud_storage", "verify_backup", "config_servers", "mongos_servers", "node", "nodes", "node_adresses", "topology", "replica_sets", "with_tags"]

    @validator('action')
    def action_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in ('enable', 'setup', 'setupHaProxy', 'setupProxySql'):
            raise ValueError("must be one of enum values ('enable', 'setup', 'setupHaProxy', 'setupProxySql')")
        return value

    @validator('archive_mode')
    def archive_mode_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in ('always'):
            raise ValueError("must be one of enum values ('always')")
        return value

    @validator('cluster_type')
    def cluster_type_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in ('mssql_single', 'redis', 'mongodb', 'mssql_ao_async', 'postgresql_single', 'replication', 'galera', 'elastic'):
            raise ValueError("must be one of enum values ('mssql_single', 'redis', 'mongodb', 'mssql_ao_async', 'postgresql_single', 'replication', 'galera', 'elastic')")
        return value

    @validator('backup_failover_host')
    def backup_failover_host_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in ('auto'):
            raise ValueError("must be one of enum values ('auto')")
        return value

    @validator('backup_method')
    def backup_method_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in ('pg_basebackup', 'xtrabackupfull', 'xtrabackupincr', 'pgbackrestfull', 'pgbackrestincr', 'pgbackrestdiff', 'mysqldump', 'mongodump', 'percona-backup-mongodb', 'pgdumpall', 'mariabackupfull', 'mariabackupincr', 'mssqlcert', 'ndb'):
            raise ValueError("must be one of enum values ('pg_basebackup', 'xtrabackupfull', 'xtrabackupincr', 'pgbackrestfull', 'pgbackrestincr', 'pgbackrestdiff', 'mysqldump', 'mongodump', 'percona-backup-mongodb', 'pgdumpall', 'mariabackupfull', 'mariabackupincr', 'mssqlcert', 'ndb')")
        return value

    @validator('backup_mysqldump_type')
    def backup_mysqldump_type_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in ('Complete', 'SchemaAndData', 'SchemaOnly', 'DataOnly', 'MySQLDbOnly'):
            raise ValueError("must be one of enum values ('Complete', 'SchemaAndData', 'SchemaOnly', 'DataOnly', 'MySQLDbOnly')")
        return value

    @validator('vendor')
    def vendor_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in ('default', 'percona', 'microsoft', 'redis', 'oracle', 'mariadb', 'elasticsearch', '10gen'):
            raise ValueError("must be one of enum values ('default', 'percona', 'microsoft', 'redis', 'oracle', 'mariadb', 'elasticsearch', '10gen')")
        return value

    @validator('type')
    def type_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in ('postgresql', 'redis', 'microsoft', 'elasticsearch', 'mysql', 'mongodb'):
            raise ValueError("must be one of enum values ('postgresql', 'redis', 'microsoft', 'elasticsearch', 'mysql', 'mongodb')")
        return value

    class Config:
        """Pydantic configuration"""
        allow_population_by_field_name = True
        validate_assignment = True

    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.dict(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> JobsJobJobSpecJobData:
        """Create an instance of JobsJobJobSpecJobData from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of upload_backup_data_to_cloud_storage
        if self.upload_backup_data_to_cloud_storage:
            _dict['upload_backup_data_to_cloud_storage'] = self.upload_backup_data_to_cloud_storage.to_dict()
        # override the default output from pydantic by calling `to_dict()` of verify_backup
        if self.verify_backup:
            _dict['verify_backup'] = self.verify_backup.to_dict()
        # override the default output from pydantic by calling `to_dict()` of config_servers
        if self.config_servers:
            _dict['config_servers'] = self.config_servers.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in mongos_servers (list)
        _items = []
        if self.mongos_servers:
            for _item in self.mongos_servers:
                if _item:
                    _items.append(_item.to_dict())
            _dict['mongos_servers'] = _items
        # override the default output from pydantic by calling `to_dict()` of node
        if self.node:
            _dict['node'] = self.node.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in nodes (list)
        _items = []
        if self.nodes:
            for _item in self.nodes:
                if _item:
                    _items.append(_item.to_dict())
            _dict['nodes'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in node_adresses (list)
        _items = []
        if self.node_adresses:
            for _item in self.node_adresses:
                if _item:
                    _items.append(_item.to_dict())
            _dict['node_adresses'] = _items
        # override the default output from pydantic by calling `to_dict()` of topology
        if self.topology:
            _dict['topology'] = self.topology.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in replica_sets (list)
        _items = []
        if self.replica_sets:
            for _item in self.replica_sets:
                if _item:
                    _items.append(_item.to_dict())
            _dict['replica_sets'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> JobsJobJobSpecJobData:
        """Create an instance of JobsJobJobSpecJobData from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return JobsJobJobSpecJobData.parse_obj(obj)

        _obj = JobsJobJobSpecJobData.parse_obj({
            "action": obj.get("action"),
            "addnode": obj.get("addnode"),
            "admin_username": obj.get("admin_username"),
            "admin_user": obj.get("admin_user"),
            "admin_password": obj.get("admin_password"),
            "audit_events": obj.get("audit_events"),
            "archive_mode": obj.get("archive_mode"),
            "backupid": obj.get("backupid"),
            "backup_id": obj.get("backup_id"),
            "build_from_source": obj.get("build_from_source"),
            "cluster_name": obj.get("cluster_name"),
            "clusterid": obj.get("clusterid"),
            "cluster_type": obj.get("cluster_type"),
            "company_id": obj.get("company_id"),
            "config_template": obj.get("config_template"),
            "backup_failover": obj.get("backup_failover"),
            "backup_failover_host": obj.get("backup_failover_host"),
            "backup_method": obj.get("backup_method"),
            "backup_mysqldump_type": obj.get("backup_mysqldump_type"),
            "backup_individual_schemas": obj.get("backup_individual_schemas"),
            "backup_retention": obj.get("backup_retention"),
            "extended_insert": obj.get("extended_insert"),
            "backup_dir": obj.get("backup_dir"),
            "backupsubdir": obj.get("backupsubdir"),
            "cc_storage": obj.get("cc_storage"),
            "compression": obj.get("compression"),
            "compression_level": obj.get("compression_level"),
            "db_database": obj.get("db_database"),
            "db_password": obj.get("db_password"),
            "db_privs": obj.get("db_privs"),
            "db_username": obj.get("db_username"),
            "data_center": obj.get("data_center"),
            "exec_upgrade_script": obj.get("exec_upgrade_script"),
            "extended": obj.get("extended"),
            "listening_port": obj.get("listening_port"),
            "mask_passwords": obj.get("mask_passwords"),
            "monitor_password": obj.get("monitor_password"),
            "monitor_user": obj.get("monitor_user"),
            "use_clustering": obj.get("use_clustering"),
            "use_rw_split": obj.get("use_rw_split"),
            "hostname": obj.get("hostname"),
            "master_address": obj.get("master_address"),
            "include_databases": obj.get("include_databases"),
            "install_timescaledb": obj.get("install_timescaledb"),
            "update_lb": obj.get("update_lb"),
            "use_package_for_data_dir": obj.get("usePackageForDataDir"),
            "encrypt_backup": obj.get("encrypt_backup"),
            "throttle_rate_netbw": obj.get("throttle_rate_netbw"),
            "use_pigz": obj.get("use_pigz"),
            "use_qpress": obj.get("use_qpress"),
            "wsrep_desync": obj.get("wsrep_desync"),
            "xtrabackup_backup_locks": obj.get("xtrabackup_backup_locks"),
            "xtrabackup_lock_ddl_per_table": obj.get("xtrabackup_lock_ddl_per_table"),
            "xtrabackup_parallellism": obj.get("xtrabackup_parallellism"),
            "verify_backup_delay": obj.get("verify_backup_delay"),
            "data_dir": obj.get("data_dir"),
            "db_user": obj.get("db_user"),
            "disable_firewall": obj.get("disable_firewall"),
            "disable_selinux": obj.get("disable_selinux"),
            "enable_uninstall": obj.get("enable_uninstall"),
            "generate_token": obj.get("generate_token"),
            "install_software": obj.get("install_software"),
            "use_internal_repos": obj.get("use_internal_repos"),
            "local_repository": obj.get("local_repository"),
            "enable_mysql_uninstall": obj.get("enable_mysql_uninstall"),
            "mysql_semi_sync": obj.get("mysql_semi_sync"),
            "enable_ssl": obj.get("enable_ssl"),
            "mongos_conf_template": obj.get("mongos_conf_template"),
            "mongodb_authdb": obj.get("mongodb_authdb"),
            "node_type": obj.get("node_type"),
            "overwrite_mysqlchk": obj.get("overwrite_mysqlchk"),
            "port": obj.get("port"),
            "ssh_keyfile": obj.get("ssh_keyfile"),
            "ssh_port": obj.get("ssh_port"),
            "ssh_user": obj.get("ssh_user"),
            "sudo_password": obj.get("sudo_password"),
            "user_id": obj.get("user_id"),
            "vendor": obj.get("vendor"),
            "type": obj.get("type"),
            "version": obj.get("version"),
            "software_package": obj.get("software_package"),
            "server_address": obj.get("server_address"),
            "terminate_db_server": obj.get("terminate_db_server"),
            "xtrabackup_use_memory": obj.get("xtrabackup_use_memory"),
            "initial": obj.get("initial"),
            "reboot": obj.get("reboot"),
            "slave_address": obj.get("slave_address"),
            "force": obj.get("force"),
            "force_stop": obj.get("force_stop"),
            "stop_timeout": obj.get("stop_timeout"),
            "pitr_stop_time": obj.get("pitr_stop_time"),
            "pitr_stop_log": obj.get("pitr_stop_log"),
            "pitr_stop_pos": obj.get("pitr_stop_pos"),
            "host_location_uuid": obj.get("host_location_uuid"),
            "bootstrap": obj.get("bootstrap"),
            "snapshot_locaiton": obj.get("snapshot_locaiton"),
            "snapshot_repository": obj.get("snapshot_repository"),
            "storage_host": obj.get("storage_host"),
            "upload_backup_data_to_cloud_storage": JobsJobJobSpecJobDataUploadBackupDataToCloudStorage.from_dict(obj.get("upload_backup_data_to_cloud_storage")) if obj.get("upload_backup_data_to_cloud_storage") is not None else None,
            "verify_backup": BackupScheduleJobJobDataVerifyBackup.from_dict(obj.get("verify_backup")) if obj.get("verify_backup") is not None else None,
            "config_servers": JobsJobJobSpecJobDataConfigServers.from_dict(obj.get("config_servers")) if obj.get("config_servers") is not None else None,
            "mongos_servers": [JobsJobJobSpecJobDataConfigServersMembersInner.from_dict(_item) for _item in obj.get("mongos_servers")] if obj.get("mongos_servers") is not None else None,
            "node": JobsJobJobSpecJobDataNode.from_dict(obj.get("node")) if obj.get("node") is not None else None,
            "nodes": [JobsJobJobSpecJobDataNodesInner.from_dict(_item) for _item in obj.get("nodes")] if obj.get("nodes") is not None else None,
            "node_adresses": [JobsJobJobSpecJobDataNodeAdressesInner.from_dict(_item) for _item in obj.get("node_adresses")] if obj.get("node_adresses") is not None else None,
            "topology": JobsJobJobSpecJobDataTopology.from_dict(obj.get("topology")) if obj.get("topology") is not None else None,
            "replica_sets": [JobsJobJobSpecJobDataReplicaSetsInner.from_dict(_item) for _item in obj.get("replica_sets")] if obj.get("replica_sets") is not None else None,
            "with_tags": obj.get("with_tags")
        })
        return _obj


