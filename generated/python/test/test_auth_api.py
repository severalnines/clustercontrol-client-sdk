"""
    Severalnines ClusterControl

    This is a ...  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: sales@severalnines.com
    Generated by: https://openapi-generator.tech
"""


import unittest

import openapi_cc_client
from openapi_cc_client.api.auth_api import AuthApi  # noqa: E501


class TestAuthApi(unittest.TestCase):
    """AuthApi unit test stubs"""

    def setUp(self):
        self.api = AuthApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_auth_post(self):
        """Test case for auth_post

        Authenticate | Logout | Password Reset | Authenticate response (with challenge)  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
