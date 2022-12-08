# coding: utf-8

"""
    Severalnines ClusterControl REST API (V2)

    REST API (V2) specification for ClusterControl - AI Powered Database automation tool for multi/hybrid cloud database deployment.  # noqa: E501

    The version of the OpenAPI document: OpenAPI specification v1.0.0
    Contact: sales@severalnines.com
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import unittest
import datetime

import openapi_cc_client
from openapi_cc_client.models.host_host import HostHost  # noqa: E501
from openapi_cc_client.rest import ApiException

class TestHostHost(unittest.TestCase):
    """HostHost unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test HostHost
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = openapi_cc_client.models.host_host.HostHost()  # noqa: E501
        if include_optional :
            return HostHost(
                class_name = '', 
                hostname = '', 
                port = 56
            )
        else :
            return HostHost(
        )

    def testHostHost(self):
        """Test HostHost"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
