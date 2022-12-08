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
from openapi_cc_client.models.backup_schedule import BackupSchedule  # noqa: E501
from openapi_cc_client.rest import ApiException

class TestBackupSchedule(unittest.TestCase):
    """BackupSchedule unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test BackupSchedule
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = openapi_cc_client.models.backup_schedule.BackupSchedule()  # noqa: E501
        if include_optional :
            return BackupSchedule(
                class_name = 'CmonBackupSchedule', 
                enabled = True, 
                schedule = '', 
                schedule_id = 56, 
                job = openapi_cc_client.models.backup_schedule_job.Backup_schedule_job(
                    command = 'backup', 
                    job_data = openapi_cc_client.models.backup_schedule_job_job_data.Backup_schedule_job_job_data(
                        description = '', 
                        backup_failover = True, 
                        backup_failover_host = 'auto', 
                        backup_method = 'pg_basebackup', 
                        backup_retention = 56, 
                        backupdir = '', 
                        backupsubdir = '', 
                        cc_storage = '', 
                        compression = True, 
                        compresion_level = 56, 
                        encrypt_backup = True, 
                        hostname = '', 
                        port = 56, 
                        verify_backup_delay = 56, 
                        verify_backup = openapi_cc_client.models.backup_schedule_job_job_data_verify_backup.Backup_schedule_job_job_data_verify_backup(
                            disable_firewall = True, 
                            disable_selinux = True, 
                            install_software = True, 
                            server_address = '', 
                            terminate_db_server = True, ), ), )
            )
        else :
            return BackupSchedule(
        )

    def testBackupSchedule(self):
        """Test BackupSchedule"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
