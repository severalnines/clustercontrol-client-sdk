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
from openapi_cc_client.api.jobs_api import JobsApi  # noqa: E501
from openapi_cc_client.rest import ApiException


class TestJobsApi(unittest.TestCase):
    """JobsApi unit test stubs"""

    def setUp(self):
        self.api = openapi_cc_client.api.jobs_api.JobsApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_jobs_post(self):
        """Test case for jobs_post

        CreateJobInstance | etc  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
