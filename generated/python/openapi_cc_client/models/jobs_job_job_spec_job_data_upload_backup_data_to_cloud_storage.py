# coding: utf-8

"""
    Severalnines ClusterControl REST API (V2)

    REST API (V2) specification for ClusterControl - AI Powered Database automation tool for multi/hybrid cloud database deployment.  # noqa: E501

    The version of the OpenAPI document: OpenAPI specification v1.0.0
    Contact: sales@severalnines.com
    Generated by: https://openapi-generator.tech
"""


try:
    from inspect import getfullargspec
except ImportError:
    from inspect import getargspec as getfullargspec
import pprint
import re  # noqa: F401
import six

from openapi_cc_client.configuration import Configuration


class JobsJobJobSpecJobDataUploadBackupDataToCloudStorage(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'backup_retention': 'int',
        'bucket': 'str',
        'cloud_storage_credentials_id': 'int',
        'cloud_storage_provider': 'str',
        'cloud_storage_service': 'str',
        'delete_after_upload': 'bool'
    }

    attribute_map = {
        'backup_retention': 'backup_retention',
        'bucket': 'bucket',
        'cloud_storage_credentials_id': 'cloud_storage_credentials_id',
        'cloud_storage_provider': 'cloud_storage_provider',
        'cloud_storage_service': 'cloud_storage_service',
        'delete_after_upload': 'delete_after_upload'
    }

    def __init__(self, backup_retention=None, bucket=None, cloud_storage_credentials_id=None, cloud_storage_provider=None, cloud_storage_service=None, delete_after_upload=None, local_vars_configuration=None):  # noqa: E501
        """JobsJobJobSpecJobDataUploadBackupDataToCloudStorage - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._backup_retention = None
        self._bucket = None
        self._cloud_storage_credentials_id = None
        self._cloud_storage_provider = None
        self._cloud_storage_service = None
        self._delete_after_upload = None
        self.discriminator = None

        if backup_retention is not None:
            self.backup_retention = backup_retention
        if bucket is not None:
            self.bucket = bucket
        if cloud_storage_credentials_id is not None:
            self.cloud_storage_credentials_id = cloud_storage_credentials_id
        if cloud_storage_provider is not None:
            self.cloud_storage_provider = cloud_storage_provider
        if cloud_storage_service is not None:
            self.cloud_storage_service = cloud_storage_service
        if delete_after_upload is not None:
            self.delete_after_upload = delete_after_upload

    @property
    def backup_retention(self):
        """Gets the backup_retention of this JobsJobJobSpecJobDataUploadBackupDataToCloudStorage.  # noqa: E501


        :return: The backup_retention of this JobsJobJobSpecJobDataUploadBackupDataToCloudStorage.  # noqa: E501
        :rtype: int
        """
        return self._backup_retention

    @backup_retention.setter
    def backup_retention(self, backup_retention):
        """Sets the backup_retention of this JobsJobJobSpecJobDataUploadBackupDataToCloudStorage.


        :param backup_retention: The backup_retention of this JobsJobJobSpecJobDataUploadBackupDataToCloudStorage.  # noqa: E501
        :type backup_retention: int
        """

        self._backup_retention = backup_retention

    @property
    def bucket(self):
        """Gets the bucket of this JobsJobJobSpecJobDataUploadBackupDataToCloudStorage.  # noqa: E501


        :return: The bucket of this JobsJobJobSpecJobDataUploadBackupDataToCloudStorage.  # noqa: E501
        :rtype: str
        """
        return self._bucket

    @bucket.setter
    def bucket(self, bucket):
        """Sets the bucket of this JobsJobJobSpecJobDataUploadBackupDataToCloudStorage.


        :param bucket: The bucket of this JobsJobJobSpecJobDataUploadBackupDataToCloudStorage.  # noqa: E501
        :type bucket: str
        """

        self._bucket = bucket

    @property
    def cloud_storage_credentials_id(self):
        """Gets the cloud_storage_credentials_id of this JobsJobJobSpecJobDataUploadBackupDataToCloudStorage.  # noqa: E501


        :return: The cloud_storage_credentials_id of this JobsJobJobSpecJobDataUploadBackupDataToCloudStorage.  # noqa: E501
        :rtype: int
        """
        return self._cloud_storage_credentials_id

    @cloud_storage_credentials_id.setter
    def cloud_storage_credentials_id(self, cloud_storage_credentials_id):
        """Sets the cloud_storage_credentials_id of this JobsJobJobSpecJobDataUploadBackupDataToCloudStorage.


        :param cloud_storage_credentials_id: The cloud_storage_credentials_id of this JobsJobJobSpecJobDataUploadBackupDataToCloudStorage.  # noqa: E501
        :type cloud_storage_credentials_id: int
        """

        self._cloud_storage_credentials_id = cloud_storage_credentials_id

    @property
    def cloud_storage_provider(self):
        """Gets the cloud_storage_provider of this JobsJobJobSpecJobDataUploadBackupDataToCloudStorage.  # noqa: E501


        :return: The cloud_storage_provider of this JobsJobJobSpecJobDataUploadBackupDataToCloudStorage.  # noqa: E501
        :rtype: str
        """
        return self._cloud_storage_provider

    @cloud_storage_provider.setter
    def cloud_storage_provider(self, cloud_storage_provider):
        """Sets the cloud_storage_provider of this JobsJobJobSpecJobDataUploadBackupDataToCloudStorage.


        :param cloud_storage_provider: The cloud_storage_provider of this JobsJobJobSpecJobDataUploadBackupDataToCloudStorage.  # noqa: E501
        :type cloud_storage_provider: str
        """

        self._cloud_storage_provider = cloud_storage_provider

    @property
    def cloud_storage_service(self):
        """Gets the cloud_storage_service of this JobsJobJobSpecJobDataUploadBackupDataToCloudStorage.  # noqa: E501


        :return: The cloud_storage_service of this JobsJobJobSpecJobDataUploadBackupDataToCloudStorage.  # noqa: E501
        :rtype: str
        """
        return self._cloud_storage_service

    @cloud_storage_service.setter
    def cloud_storage_service(self, cloud_storage_service):
        """Sets the cloud_storage_service of this JobsJobJobSpecJobDataUploadBackupDataToCloudStorage.


        :param cloud_storage_service: The cloud_storage_service of this JobsJobJobSpecJobDataUploadBackupDataToCloudStorage.  # noqa: E501
        :type cloud_storage_service: str
        """

        self._cloud_storage_service = cloud_storage_service

    @property
    def delete_after_upload(self):
        """Gets the delete_after_upload of this JobsJobJobSpecJobDataUploadBackupDataToCloudStorage.  # noqa: E501


        :return: The delete_after_upload of this JobsJobJobSpecJobDataUploadBackupDataToCloudStorage.  # noqa: E501
        :rtype: bool
        """
        return self._delete_after_upload

    @delete_after_upload.setter
    def delete_after_upload(self, delete_after_upload):
        """Sets the delete_after_upload of this JobsJobJobSpecJobDataUploadBackupDataToCloudStorage.


        :param delete_after_upload: The delete_after_upload of this JobsJobJobSpecJobDataUploadBackupDataToCloudStorage.  # noqa: E501
        :type delete_after_upload: bool
        """

        self._delete_after_upload = delete_after_upload

    def to_dict(self, serialize=False):
        """Returns the model properties as a dict"""
        result = {}

        def convert(x):
            if hasattr(x, "to_dict"):
                args = getfullargspec(x.to_dict).args
                if len(args) == 1:
                    return x.to_dict()
                else:
                    return x.to_dict(serialize)
            else:
                return x

        for attr, _ in six.iteritems(self.openapi_types):
            value = getattr(self, attr)
            attr = self.attribute_map.get(attr, attr) if serialize else attr
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: convert(x),
                    value
                ))
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], convert(item[1])),
                    value.items()
                ))
            else:
                result[attr] = convert(value)

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, JobsJobJobSpecJobDataUploadBackupDataToCloudStorage):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, JobsJobJobSpecJobDataUploadBackupDataToCloudStorage):
            return True

        return self.to_dict() != other.to_dict()
