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
from pydantic import BaseModel, Field, StrictBool, StrictInt, StrictStr, validator
from openapi_cc_client.models.backup_backup_record import BackupBackupRecord
from openapi_cc_client.models.backup_schedule import BackupSchedule

class Backup(BaseModel):
    """
    Backup
    """
    operation: StrictStr = Field(...)
    cluster_id: Optional[StrictInt] = None
    ascending: Optional[StrictBool] = None
    schedule: Optional[BackupSchedule] = None
    backup_record: Optional[BackupBackupRecord] = None
    __properties = ["operation", "cluster_id", "ascending", "schedule", "backup_record"]

    @validator('operation')
    def operation_validate_enum(cls, value):
        """Validates the enum"""
        if value not in ('getBackups', 'getBackupSchedules', 'scheduleBackup', 'deleteBackupRecord'):
            raise ValueError("must be one of enum values ('getBackups', 'getBackupSchedules', 'scheduleBackup', 'deleteBackupRecord')")
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
    def from_json(cls, json_str: str) -> Backup:
        """Create an instance of Backup from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of schedule
        if self.schedule:
            _dict['schedule'] = self.schedule.to_dict()
        # override the default output from pydantic by calling `to_dict()` of backup_record
        if self.backup_record:
            _dict['backup_record'] = self.backup_record.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> Backup:
        """Create an instance of Backup from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return Backup.parse_obj(obj)

        _obj = Backup.parse_obj({
            "operation": obj.get("operation"),
            "cluster_id": obj.get("cluster_id"),
            "ascending": obj.get("ascending"),
            "schedule": BackupSchedule.from_dict(obj.get("schedule")) if obj.get("schedule") is not None else None,
            "backup_record": BackupBackupRecord.from_dict(obj.get("backup_record")) if obj.get("backup_record") is not None else None
        })
        return _obj


