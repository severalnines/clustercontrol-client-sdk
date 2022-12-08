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


class Discovery(object):
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
        'operation': 'str',
        'new_cluster_name': 'str',
        'check_if_already_registered': 'bool',
        'check_job': 'bool',
        'check_ssh_sudo': 'bool',
        'nodes': 'list[DiscoveryNodesInner]',
        'job': 'DiscoveryJob',
        'ssh_credentials': 'DiscoverySshCredentials'
    }

    attribute_map = {
        'operation': 'operation',
        'new_cluster_name': 'new_cluster_name',
        'check_if_already_registered': 'check_if_already_registered',
        'check_job': 'check_job',
        'check_ssh_sudo': 'check_ssh_sudo',
        'nodes': 'nodes',
        'job': 'job',
        'ssh_credentials': 'ssh_credentials'
    }

    def __init__(self, operation=None, new_cluster_name=None, check_if_already_registered=None, check_job=None, check_ssh_sudo=None, nodes=None, job=None, ssh_credentials=None, local_vars_configuration=None):  # noqa: E501
        """Discovery - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._operation = None
        self._new_cluster_name = None
        self._check_if_already_registered = None
        self._check_job = None
        self._check_ssh_sudo = None
        self._nodes = None
        self._job = None
        self._ssh_credentials = None
        self.discriminator = None

        self.operation = operation
        if new_cluster_name is not None:
            self.new_cluster_name = new_cluster_name
        if check_if_already_registered is not None:
            self.check_if_already_registered = check_if_already_registered
        if check_job is not None:
            self.check_job = check_job
        if check_ssh_sudo is not None:
            self.check_ssh_sudo = check_ssh_sudo
        if nodes is not None:
            self.nodes = nodes
        if job is not None:
            self.job = job
        if ssh_credentials is not None:
            self.ssh_credentials = ssh_credentials

    @property
    def operation(self):
        """Gets the operation of this Discovery.  # noqa: E501


        :return: The operation of this Discovery.  # noqa: E501
        :rtype: str
        """
        return self._operation

    @operation.setter
    def operation(self, operation):
        """Sets the operation of this Discovery.


        :param operation: The operation of this Discovery.  # noqa: E501
        :type operation: str
        """
        if self.local_vars_configuration.client_side_validation and operation is None:  # noqa: E501
            raise ValueError("Invalid value for `operation`, must not be `None`")  # noqa: E501
        allowed_values = ["checkClusterName", "getSupportedClusterTypes", "checkHosts"]  # noqa: E501
        if self.local_vars_configuration.client_side_validation and operation not in allowed_values:  # noqa: E501
            raise ValueError(
                "Invalid value for `operation` ({0}), must be one of {1}"  # noqa: E501
                .format(operation, allowed_values)
            )

        self._operation = operation

    @property
    def new_cluster_name(self):
        """Gets the new_cluster_name of this Discovery.  # noqa: E501


        :return: The new_cluster_name of this Discovery.  # noqa: E501
        :rtype: str
        """
        return self._new_cluster_name

    @new_cluster_name.setter
    def new_cluster_name(self, new_cluster_name):
        """Sets the new_cluster_name of this Discovery.


        :param new_cluster_name: The new_cluster_name of this Discovery.  # noqa: E501
        :type new_cluster_name: str
        """

        self._new_cluster_name = new_cluster_name

    @property
    def check_if_already_registered(self):
        """Gets the check_if_already_registered of this Discovery.  # noqa: E501


        :return: The check_if_already_registered of this Discovery.  # noqa: E501
        :rtype: bool
        """
        return self._check_if_already_registered

    @check_if_already_registered.setter
    def check_if_already_registered(self, check_if_already_registered):
        """Sets the check_if_already_registered of this Discovery.


        :param check_if_already_registered: The check_if_already_registered of this Discovery.  # noqa: E501
        :type check_if_already_registered: bool
        """

        self._check_if_already_registered = check_if_already_registered

    @property
    def check_job(self):
        """Gets the check_job of this Discovery.  # noqa: E501


        :return: The check_job of this Discovery.  # noqa: E501
        :rtype: bool
        """
        return self._check_job

    @check_job.setter
    def check_job(self, check_job):
        """Sets the check_job of this Discovery.


        :param check_job: The check_job of this Discovery.  # noqa: E501
        :type check_job: bool
        """

        self._check_job = check_job

    @property
    def check_ssh_sudo(self):
        """Gets the check_ssh_sudo of this Discovery.  # noqa: E501


        :return: The check_ssh_sudo of this Discovery.  # noqa: E501
        :rtype: bool
        """
        return self._check_ssh_sudo

    @check_ssh_sudo.setter
    def check_ssh_sudo(self, check_ssh_sudo):
        """Sets the check_ssh_sudo of this Discovery.


        :param check_ssh_sudo: The check_ssh_sudo of this Discovery.  # noqa: E501
        :type check_ssh_sudo: bool
        """

        self._check_ssh_sudo = check_ssh_sudo

    @property
    def nodes(self):
        """Gets the nodes of this Discovery.  # noqa: E501


        :return: The nodes of this Discovery.  # noqa: E501
        :rtype: list[DiscoveryNodesInner]
        """
        return self._nodes

    @nodes.setter
    def nodes(self, nodes):
        """Sets the nodes of this Discovery.


        :param nodes: The nodes of this Discovery.  # noqa: E501
        :type nodes: list[DiscoveryNodesInner]
        """

        self._nodes = nodes

    @property
    def job(self):
        """Gets the job of this Discovery.  # noqa: E501


        :return: The job of this Discovery.  # noqa: E501
        :rtype: DiscoveryJob
        """
        return self._job

    @job.setter
    def job(self, job):
        """Sets the job of this Discovery.


        :param job: The job of this Discovery.  # noqa: E501
        :type job: DiscoveryJob
        """

        self._job = job

    @property
    def ssh_credentials(self):
        """Gets the ssh_credentials of this Discovery.  # noqa: E501


        :return: The ssh_credentials of this Discovery.  # noqa: E501
        :rtype: DiscoverySshCredentials
        """
        return self._ssh_credentials

    @ssh_credentials.setter
    def ssh_credentials(self, ssh_credentials):
        """Sets the ssh_credentials of this Discovery.


        :param ssh_credentials: The ssh_credentials of this Discovery.  # noqa: E501
        :type ssh_credentials: DiscoverySshCredentials
        """

        self._ssh_credentials = ssh_credentials

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
        if not isinstance(other, Discovery):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Discovery):
            return True

        return self.to_dict() != other.to_dict()