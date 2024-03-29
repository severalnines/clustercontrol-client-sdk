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

from openapi_cc_client.models.reports_report import ReportsReport  # noqa: E501

class TestReportsReport(unittest.TestCase):
    """ReportsReport unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ReportsReport:
        """Test ReportsReport
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ReportsReport`
        """
        model = ReportsReport()  # noqa: E501
        if include_optional:
            return ReportsReport(
                class_name = 'CmonReport',
                recipients = '',
                report_type = '',
                text_format = 'AnsiTerminal',
                report_id = 56
            )
        else:
            return ReportsReport(
        )
        """

    def testReportsReport(self):
        """Test ReportsReport"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
