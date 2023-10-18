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
from pydantic import BaseModel, StrictBool, StrictStr

class JobsJobJobSpecJobDataReplicaSetsInnerMembersInner(BaseModel):
    """
    JobsJobJobSpecJobDataReplicaSetsInnerMembersInner
    """
    hostname: Optional[StrictStr] = None
    hostname_data: Optional[StrictStr] = None
    hostname_internal: Optional[StrictStr] = None
    port: Optional[StrictStr] = None
    arbiter_only: Optional[StrictBool] = None
    hidden: Optional[StrictBool] = None
    priority: Optional[StrictStr] = None
    slave_delay: Optional[StrictStr] = None
    __properties = ["hostname", "hostname_data", "hostname_internal", "port", "arbiter_only", "hidden", "priority", "slave_delay"]

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
    def from_json(cls, json_str: str) -> JobsJobJobSpecJobDataReplicaSetsInnerMembersInner:
        """Create an instance of JobsJobJobSpecJobDataReplicaSetsInnerMembersInner from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> JobsJobJobSpecJobDataReplicaSetsInnerMembersInner:
        """Create an instance of JobsJobJobSpecJobDataReplicaSetsInnerMembersInner from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return JobsJobJobSpecJobDataReplicaSetsInnerMembersInner.parse_obj(obj)

        _obj = JobsJobJobSpecJobDataReplicaSetsInnerMembersInner.parse_obj({
            "hostname": obj.get("hostname"),
            "hostname_data": obj.get("hostname_data"),
            "hostname_internal": obj.get("hostname_internal"),
            "port": obj.get("port"),
            "arbiter_only": obj.get("arbiter_only"),
            "hidden": obj.get("hidden"),
            "priority": obj.get("priority"),
            "slave_delay": obj.get("slave_delay")
        })
        return _obj


