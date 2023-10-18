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

from openapi_cc_client.models.jobs_job_job_spec_job_data_upload_backup_data_to_cloud_storage import JobsJobJobSpecJobDataUploadBackupDataToCloudStorage  # noqa: E501

class TestJobsJobJobSpecJobDataUploadBackupDataToCloudStorage(unittest.TestCase):
    """JobsJobJobSpecJobDataUploadBackupDataToCloudStorage unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> JobsJobJobSpecJobDataUploadBackupDataToCloudStorage:
        """Test JobsJobJobSpecJobDataUploadBackupDataToCloudStorage
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `JobsJobJobSpecJobDataUploadBackupDataToCloudStorage`
        """
        model = JobsJobJobSpecJobDataUploadBackupDataToCloudStorage()  # noqa: E501
        if include_optional:
            return JobsJobJobSpecJobDataUploadBackupDataToCloudStorage(
                backup_retention = 56,
                bucket = '',
                cloud_storage_credentials_id = 56,
                cloud_storage_provider = '',
                cloud_storage_service = '',
                delete_after_upload = True
            )
        else:
            return JobsJobJobSpecJobDataUploadBackupDataToCloudStorage(
        )
        """

    def testJobsJobJobSpecJobDataUploadBackupDataToCloudStorage(self):
        """Test JobsJobJobSpecJobDataUploadBackupDataToCloudStorage"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
