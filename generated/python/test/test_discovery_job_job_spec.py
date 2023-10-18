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

from openapi_cc_client.models.discovery_job_job_spec import DiscoveryJobJobSpec  # noqa: E501

class TestDiscoveryJobJobSpec(unittest.TestCase):
    """DiscoveryJobJobSpec unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> DiscoveryJobJobSpec:
        """Test DiscoveryJobJobSpec
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `DiscoveryJobJobSpec`
        """
        model = DiscoveryJobJobSpec()  # noqa: E501
        if include_optional:
            return DiscoveryJobJobSpec(
                command = 'create_cluster',
                job_data = openapi_cc_client.models.discovery_job_job_spec_job_data.Discovery_job_job_spec_job_data(
                    cluster_type = 'group_replication', 
                    mysql_version = '', 
                    vendor = '', 
                    nodes = [
                        openapi_cc_client.models.discovery_job_job_spec_job_data_nodes_inner.Discovery_job_job_spec_job_data_nodes_inner(
                            class_name = 'CmonHost', 
                            host_name = '', )
                        ], )
            )
        else:
            return DiscoveryJobJobSpec(
        )
        """

    def testDiscoveryJobJobSpec(self):
        """Test DiscoveryJobJobSpec"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
