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


class BackupScheduleJobJobDataVerifyBackup(object):
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
        'disable_firewall': 'bool',
        'disable_selinux': 'bool',
        'install_software': 'bool',
        'server_address': 'str',
        'terminate_db_server': 'bool'
    }

    attribute_map = {
        'disable_firewall': 'disable_firewall',
        'disable_selinux': 'disable_selinux',
        'install_software': 'install_software',
        'server_address': 'server_address',
        'terminate_db_server': 'terminate_db_server'
    }

    def __init__(self, disable_firewall=None, disable_selinux=None, install_software=None, server_address=None, terminate_db_server=None, local_vars_configuration=None):  # noqa: E501
        """BackupScheduleJobJobDataVerifyBackup - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._disable_firewall = None
        self._disable_selinux = None
        self._install_software = None
        self._server_address = None
        self._terminate_db_server = None
        self.discriminator = None

        if disable_firewall is not None:
            self.disable_firewall = disable_firewall
        if disable_selinux is not None:
            self.disable_selinux = disable_selinux
        if install_software is not None:
            self.install_software = install_software
        if server_address is not None:
            self.server_address = server_address
        if terminate_db_server is not None:
            self.terminate_db_server = terminate_db_server

    @property
    def disable_firewall(self):
        """Gets the disable_firewall of this BackupScheduleJobJobDataVerifyBackup.  # noqa: E501


        :return: The disable_firewall of this BackupScheduleJobJobDataVerifyBackup.  # noqa: E501
        :rtype: bool
        """
        return self._disable_firewall

    @disable_firewall.setter
    def disable_firewall(self, disable_firewall):
        """Sets the disable_firewall of this BackupScheduleJobJobDataVerifyBackup.


        :param disable_firewall: The disable_firewall of this BackupScheduleJobJobDataVerifyBackup.  # noqa: E501
        :type disable_firewall: bool
        """

        self._disable_firewall = disable_firewall

    @property
    def disable_selinux(self):
        """Gets the disable_selinux of this BackupScheduleJobJobDataVerifyBackup.  # noqa: E501


        :return: The disable_selinux of this BackupScheduleJobJobDataVerifyBackup.  # noqa: E501
        :rtype: bool
        """
        return self._disable_selinux

    @disable_selinux.setter
    def disable_selinux(self, disable_selinux):
        """Sets the disable_selinux of this BackupScheduleJobJobDataVerifyBackup.


        :param disable_selinux: The disable_selinux of this BackupScheduleJobJobDataVerifyBackup.  # noqa: E501
        :type disable_selinux: bool
        """

        self._disable_selinux = disable_selinux

    @property
    def install_software(self):
        """Gets the install_software of this BackupScheduleJobJobDataVerifyBackup.  # noqa: E501


        :return: The install_software of this BackupScheduleJobJobDataVerifyBackup.  # noqa: E501
        :rtype: bool
        """
        return self._install_software

    @install_software.setter
    def install_software(self, install_software):
        """Sets the install_software of this BackupScheduleJobJobDataVerifyBackup.


        :param install_software: The install_software of this BackupScheduleJobJobDataVerifyBackup.  # noqa: E501
        :type install_software: bool
        """

        self._install_software = install_software

    @property
    def server_address(self):
        """Gets the server_address of this BackupScheduleJobJobDataVerifyBackup.  # noqa: E501


        :return: The server_address of this BackupScheduleJobJobDataVerifyBackup.  # noqa: E501
        :rtype: str
        """
        return self._server_address

    @server_address.setter
    def server_address(self, server_address):
        """Sets the server_address of this BackupScheduleJobJobDataVerifyBackup.


        :param server_address: The server_address of this BackupScheduleJobJobDataVerifyBackup.  # noqa: E501
        :type server_address: str
        """

        self._server_address = server_address

    @property
    def terminate_db_server(self):
        """Gets the terminate_db_server of this BackupScheduleJobJobDataVerifyBackup.  # noqa: E501


        :return: The terminate_db_server of this BackupScheduleJobJobDataVerifyBackup.  # noqa: E501
        :rtype: bool
        """
        return self._terminate_db_server

    @terminate_db_server.setter
    def terminate_db_server(self, terminate_db_server):
        """Sets the terminate_db_server of this BackupScheduleJobJobDataVerifyBackup.


        :param terminate_db_server: The terminate_db_server of this BackupScheduleJobJobDataVerifyBackup.  # noqa: E501
        :type terminate_db_server: bool
        """

        self._terminate_db_server = terminate_db_server

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
        if not isinstance(other, BackupScheduleJobJobDataVerifyBackup):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, BackupScheduleJobJobDataVerifyBackup):
            return True

        return self.to_dict() != other.to_dict()