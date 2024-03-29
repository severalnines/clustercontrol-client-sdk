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

from openapi_cc_client.models.discovery import Discovery  # noqa: E501

class TestDiscovery(unittest.TestCase):
    """Discovery unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Discovery:
        """Test Discovery
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Discovery`
        """
        model = Discovery()  # noqa: E501
        if include_optional:
            return Discovery(
                operation = 'checkClusterName',
                new_cluster_name = '',
                check_if_already_registered = True,
                check_job = True,
                check_ssh_sudo = True,
                nodes = [
                    openapi_cc_client.models.discovery_nodes_inner.Discovery_nodes_inner(
                        class_name = 'CmonHost', 
                        host_name = '', 
                        port = 56, )
                    ],
                job = openapi_cc_client.models.discovery_job.Discovery_job(
                    class_name = 'CmonJobInstance', 
                    job_spec = openapi_cc_client.models.discovery_job_job_spec.Discovery_job_job_spec(
                        command = 'create_cluster', 
                        job_data = openapi_cc_client.models.discovery_job_job_spec_job_data.Discovery_job_job_spec_job_data(
                            cluster_type = 'group_replication', 
                            mysql_version = '', 
                            vendor = '', 
                            nodes = [
                                openapi_cc_client.models.discovery_job_job_spec_job_data_nodes_inner.Discovery_job_job_spec_job_data_nodes_inner(
                                    class_name = 'CmonHost', 
                                    host_name = '', )
                                ], ), ), ),
                ssh_credentials = openapi_cc_client.models.discovery_ssh_credentials.Discovery_ssh_credentials(
                    class_name = '', 
                    user_name = '', 
                    password = '', 
                    ssh_keyfile = '', )
            )
        else:
            return Discovery(
                operation = 'checkClusterName',
        )
        """

    def testDiscovery(self):
        """Test Discovery"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
