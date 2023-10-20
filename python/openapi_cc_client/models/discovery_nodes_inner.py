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
from pydantic import BaseModel, Field, StrictInt, StrictStr, validator

class DiscoveryNodesInner(BaseModel):
    """
    DiscoveryNodesInner
    """
    class_name: Optional[StrictStr] = None
    host_name: Optional[StrictStr] = Field(None, description="IP address or Hostname")
    port: Optional[StrictInt] = None
    __properties = ["class_name", "host_name", "port"]

    @validator('class_name')
    def class_name_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in ('CmonHost', 'CmonMySqlHost', 'CmonPostgreSqlHost', 'CmonProxySqlHost', 'CmonHaProxyHost'):
            raise ValueError("must be one of enum values ('CmonHost', 'CmonMySqlHost', 'CmonPostgreSqlHost', 'CmonProxySqlHost', 'CmonHaProxyHost')")
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
    def from_json(cls, json_str: str) -> DiscoveryNodesInner:
        """Create an instance of DiscoveryNodesInner from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> DiscoveryNodesInner:
        """Create an instance of DiscoveryNodesInner from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return DiscoveryNodesInner.parse_obj(obj)

        _obj = DiscoveryNodesInner.parse_obj({
            "class_name": obj.get("class_name"),
            "host_name": obj.get("host_name"),
            "port": obj.get("port")
        })
        return _obj


