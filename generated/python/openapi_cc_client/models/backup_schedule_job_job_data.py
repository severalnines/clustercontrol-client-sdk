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


from typing import Optional
from pydantic import BaseModel, StrictBool, StrictInt, StrictStr, validator
from openapi_cc_client.models.backup_schedule_job_job_data_verify_backup import BackupScheduleJobJobDataVerifyBackup

class BackupScheduleJobJobData(BaseModel):
    """
    BackupScheduleJobJobData
    """
    description: Optional[StrictStr] = None
    backup_failover: Optional[StrictBool] = None
    backup_failover_host: Optional[StrictStr] = None
    backup_method: Optional[StrictStr] = None
    backup_retention: Optional[StrictInt] = None
    backupdir: Optional[StrictStr] = None
    backupsubdir: Optional[StrictStr] = None
    cc_storage: Optional[StrictStr] = None
    compression: Optional[StrictBool] = None
    compresion_level: Optional[StrictInt] = None
    encrypt_backup: Optional[StrictBool] = None
    hostname: Optional[StrictStr] = None
    port: Optional[StrictInt] = None
    verify_backup_delay: Optional[StrictInt] = None
    verify_backup: Optional[BackupScheduleJobJobDataVerifyBackup] = None
    __properties = ["description", "backup_failover", "backup_failover_host", "backup_method", "backup_retention", "backupdir", "backupsubdir", "cc_storage", "compression", "compresion_level", "encrypt_backup", "hostname", "port", "verify_backup_delay", "verify_backup"]

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
    def from_json(cls, json_str: str) -> BackupScheduleJobJobData:
        """Create an instance of BackupScheduleJobJobData from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of verify_backup
        if self.verify_backup:
            _dict['verify_backup'] = self.verify_backup.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> BackupScheduleJobJobData:
        """Create an instance of BackupScheduleJobJobData from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return BackupScheduleJobJobData.parse_obj(obj)

        _obj = BackupScheduleJobJobData.parse_obj({
            "description": obj.get("description"),
            "backup_failover": obj.get("backup_failover"),
            "backup_failover_host": obj.get("backup_failover_host"),
            "backup_method": obj.get("backup_method"),
            "backup_retention": obj.get("backup_retention"),
            "backupdir": obj.get("backupdir"),
            "backupsubdir": obj.get("backupsubdir"),
            "cc_storage": obj.get("cc_storage"),
            "compression": obj.get("compression"),
            "compresion_level": obj.get("compresion_level"),
            "encrypt_backup": obj.get("encrypt_backup"),
            "hostname": obj.get("hostname"),
            "port": obj.get("port"),
            "verify_backup_delay": obj.get("verify_backup_delay"),
            "verify_backup": BackupScheduleJobJobDataVerifyBackup.from_dict(obj.get("verify_backup")) if obj.get("verify_backup") is not None else None
        })
        return _obj


