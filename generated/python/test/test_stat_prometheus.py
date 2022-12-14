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
from openapi_cc_client.models.stat_prometheus import StatPrometheus  # noqa: E501
from openapi_cc_client.rest import ApiException

class TestStatPrometheus(unittest.TestCase):
    """StatPrometheus unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test StatPrometheus
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = openapi_cc_client.models.stat_prometheus.StatPrometheus()  # noqa: E501
        if include_optional :
            return StatPrometheus(
                operation = '/prometheus', 
                cluster_id = 56, 
                cluster_name = '', 
                queries = [
                    openapi_cc_client.models.stat_prometheus_queries_inner.StatPrometheus_queries_inner(
                        query = '', 
                        step = 56, )
                    ], 
                start = 56, 
                end = 56, 
                step = 56, 
                returnfrom = 56
            )
        else :
            return StatPrometheus(
                operation = '/prometheus',
        )

    def testStatPrometheus(self):
        """Test StatPrometheus"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
