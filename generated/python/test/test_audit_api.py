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

import openapi_cc_client
from openapi_cc_client.api.audit_api import AuditApi  # noqa: E501
from openapi_cc_client.rest import ApiException


class TestAuditApi(unittest.TestCase):
    """AuditApi unit test stubs"""

    def setUp(self):
        self.api = openapi_cc_client.api.audit_api.AuditApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_audit_post(self):
        """Test case for audit_post

        GetStatistics | GetAlarm | GetAlarms | IgnoreAlarm  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
