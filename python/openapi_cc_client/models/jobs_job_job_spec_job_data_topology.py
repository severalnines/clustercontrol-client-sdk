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


from typing import Dict, List, Optional
from pydantic import BaseModel, StrictStr, conlist

class JobsJobJobSpecJobDataTopology(BaseModel):
    """
    JobsJobJobSpecJobDataTopology
    """
    master_slave_links: Optional[conlist(Dict[str, StrictStr])] = None
    __properties = ["master_slave_links"]

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
    def from_json(cls, json_str: str) -> JobsJobJobSpecJobDataTopology:
        """Create an instance of JobsJobJobSpecJobDataTopology from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> JobsJobJobSpecJobDataTopology:
        """Create an instance of JobsJobJobSpecJobDataTopology from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return JobsJobJobSpecJobDataTopology.parse_obj(obj)

        _obj = JobsJobJobSpecJobDataTopology.parse_obj({
            "master_slave_links": obj.get("master_slave_links")
        })
        return _obj


