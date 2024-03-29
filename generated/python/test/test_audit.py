# coding: utf-8

"""
    Severalnines ClusterControl REST API (V2)

    REST API (V2) specification for ClusterControl - AI Powered Database automation tool for multi/hybrid cloud database deployment.

    The version of the OpenAPI document: OpenAPI specification v1.0.0
    Contact: sales@severalnines.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from openapi_cc_client.models.audit import Audit  # noqa: E501

class TestAudit(unittest.TestCase):
    """Audit unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Audit:
        """Test Audit
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Audit`
        """
        model = Audit()  # noqa: E501
        if include_optional:
            return Audit(
                operation = 'getEntries',
                cluster_ids = [
                    56
                    ],
                ascending = True
            )
        else:
            return Audit(
                operation = 'getEntries',
        )
        """

    def testAudit(self):
        """Test Audit"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
