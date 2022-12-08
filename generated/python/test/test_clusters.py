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
from openapi_cc_client.models.clusters import Clusters  # noqa: E501
from openapi_cc_client.rest import ApiException

class TestClusters(unittest.TestCase):
    """Clusters unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test Clusters
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = openapi_cc_client.models.clusters.Clusters()  # noqa: E501
        if include_optional :
            return Clusters(
                operation = 'getallclusterinfo', 
                cluster_id = 56, 
                cluster_name = '', 
                with_hosts = True, 
                with_sheet_info = True, 
                configuration = [
                    openapi_cc_client.models.clusters_configuration_inner.Clusters_configuration_inner(
                        name = '', 
                        value = '', )
                    ], 
                account = openapi_cc_client.models.clusters_account.Clusters_account(
                    class_name = 'CmonAccount', 
                    grants = '', 
                    host_allow = '', 
                    own_database = '', 
                    privileges = '', 
                    user_name = '', 
                    password = '', ), 
                filter_strings = '', 
                limit = 56, 
                offset = 56, 
                database = openapi_cc_client.models.clusters_database.Clusters_database(
                    class_name = 'CmonDataBase', 
                    database_name = '', ), 
                nodes = [
                    ''
                    ]
            )
        else :
            return Clusters(
                operation = 'getallclusterinfo',
        )

    def testClusters(self):
        """Test Clusters"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
