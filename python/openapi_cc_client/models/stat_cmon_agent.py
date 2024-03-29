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
from pydantic import BaseModel, Field, StrictStr, validator
from openapi_cc_client.models.stat_cmon_agent_request_data import StatCmonAgentRequestData

class StatCmonAgent(BaseModel):
    """
    StatCmonAgent
    """
    operation: StrictStr = Field(...)
    api_key: Optional[StrictStr] = Field(None, alias="apiKey")
    class_name: Optional[StrictStr] = Field(None, alias="className")
    request_data: Optional[StatCmonAgentRequestData] = Field(None, alias="requestData")
    __properties = ["operation", "apiKey", "className", "requestData"]

    @validator('operation')
    def operation_validate_enum(cls, value):
        """Validates the enum"""
        if value not in ('/cmonagent'):
            raise ValueError("must be one of enum values ('/cmonagent')")
        return value

    @validator('class_name')
    def class_name_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in ('CmnRequest'):
            raise ValueError("must be one of enum values ('CmnRequest')")
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
    def from_json(cls, json_str: str) -> StatCmonAgent:
        """Create an instance of StatCmonAgent from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of request_data
        if self.request_data:
            _dict['requestData'] = self.request_data.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> StatCmonAgent:
        """Create an instance of StatCmonAgent from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return StatCmonAgent.parse_obj(obj)

        _obj = StatCmonAgent.parse_obj({
            "operation": obj.get("operation"),
            "api_key": obj.get("apiKey"),
            "class_name": obj.get("className"),
            "request_data": StatCmonAgentRequestData.from_dict(obj.get("requestData")) if obj.get("requestData") is not None else None
        })
        return _obj


