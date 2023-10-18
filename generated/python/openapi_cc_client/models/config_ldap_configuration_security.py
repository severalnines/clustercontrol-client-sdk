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
from pydantic import BaseModel, Field, StrictStr

class ConfigLdapConfigurationSecurity(BaseModel):
    """
    ConfigLdapConfigurationSecurity
    """
    ca_cert_file: Optional[StrictStr] = Field(None, alias="caCertFile")
    cert_file: Optional[StrictStr] = Field(None, alias="certFile")
    key_file: Optional[StrictStr] = Field(None, alias="keyFile")
    __properties = ["caCertFile", "certFile", "keyFile"]

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
    def from_json(cls, json_str: str) -> ConfigLdapConfigurationSecurity:
        """Create an instance of ConfigLdapConfigurationSecurity from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> ConfigLdapConfigurationSecurity:
        """Create an instance of ConfigLdapConfigurationSecurity from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return ConfigLdapConfigurationSecurity.parse_obj(obj)

        _obj = ConfigLdapConfigurationSecurity.parse_obj({
            "ca_cert_file": obj.get("caCertFile"),
            "cert_file": obj.get("certFile"),
            "key_file": obj.get("keyFile")
        })
        return _obj


