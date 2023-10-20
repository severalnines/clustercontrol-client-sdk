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

class Audit(BaseModel):
    """
    Audit
    """
    operation: StrictStr = Field(...)
    cluster_ids: Optional[conlist(StrictInt)] = None
    ascending: Optional[StrictBool] = None
    __properties = ["operation", "cluster_ids", "ascending"]

    @validator('operation')
    def operation_validate_enum(cls, value):
        """Validates the enum"""
        if value not in ('getEntries'):
            raise ValueError("must be one of enum values ('getEntries')")
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
    def from_json(cls, json_str: str) -> Audit:
        """Create an instance of Audit from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> Audit:
        """Create an instance of Audit from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return Audit.parse_obj(obj)

        _obj = Audit.parse_obj({
            "operation": obj.get("operation"),
            "cluster_ids": obj.get("cluster_ids"),
            "ascending": obj.get("ascending")
        })
        return _obj


