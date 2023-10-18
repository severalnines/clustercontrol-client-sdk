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

from openapi_cc_client.models.backup_schedule_job_job_data_verify_backup import BackupScheduleJobJobDataVerifyBackup  # noqa: E501

class TestBackupScheduleJobJobDataVerifyBackup(unittest.TestCase):
    """BackupScheduleJobJobDataVerifyBackup unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> BackupScheduleJobJobDataVerifyBackup:
        """Test BackupScheduleJobJobDataVerifyBackup
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `BackupScheduleJobJobDataVerifyBackup`
        """
        model = BackupScheduleJobJobDataVerifyBackup()  # noqa: E501
        if include_optional:
            return BackupScheduleJobJobDataVerifyBackup(
                disable_firewall = True,
                disable_selinux = True,
                install_software = True,
                server_address = '',
                terminate_db_server = True
            )
        else:
            return BackupScheduleJobJobDataVerifyBackup(
        )
        """

    def testBackupScheduleJobJobDataVerifyBackup(self):
        """Test BackupScheduleJobJobDataVerifyBackup"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
