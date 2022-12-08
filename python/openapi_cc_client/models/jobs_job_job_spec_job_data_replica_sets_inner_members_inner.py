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


class JobsJobJobSpecJobDataReplicaSetsInnerMembersInner(object):
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
        'hostname': 'str',
        'hostname_data': 'str',
        'hostname_internal': 'str',
        'port': 'str',
        'arbiter_only': 'bool',
        'hidden': 'bool',
        'priority': 'str',
        'slave_delay': 'str'
    }

    attribute_map = {
        'hostname': 'hostname',
        'hostname_data': 'hostname_data',
        'hostname_internal': 'hostname_internal',
        'port': 'port',
        'arbiter_only': 'arbiter_only',
        'hidden': 'hidden',
        'priority': 'priority',
        'slave_delay': 'slave_delay'
    }

    def __init__(self, hostname=None, hostname_data=None, hostname_internal=None, port=None, arbiter_only=None, hidden=None, priority=None, slave_delay=None, local_vars_configuration=None):  # noqa: E501
        """JobsJobJobSpecJobDataReplicaSetsInnerMembersInner - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._hostname = None
        self._hostname_data = None
        self._hostname_internal = None
        self._port = None
        self._arbiter_only = None
        self._hidden = None
        self._priority = None
        self._slave_delay = None
        self.discriminator = None

        if hostname is not None:
            self.hostname = hostname
        if hostname_data is not None:
            self.hostname_data = hostname_data
        if hostname_internal is not None:
            self.hostname_internal = hostname_internal
        if port is not None:
            self.port = port
        if arbiter_only is not None:
            self.arbiter_only = arbiter_only
        if hidden is not None:
            self.hidden = hidden
        if priority is not None:
            self.priority = priority
        if slave_delay is not None:
            self.slave_delay = slave_delay

    @property
    def hostname(self):
        """Gets the hostname of this JobsJobJobSpecJobDataReplicaSetsInnerMembersInner.  # noqa: E501


        :return: The hostname of this JobsJobJobSpecJobDataReplicaSetsInnerMembersInner.  # noqa: E501
        :rtype: str
        """
        return self._hostname

    @hostname.setter
    def hostname(self, hostname):
        """Sets the hostname of this JobsJobJobSpecJobDataReplicaSetsInnerMembersInner.


        :param hostname: The hostname of this JobsJobJobSpecJobDataReplicaSetsInnerMembersInner.  # noqa: E501
        :type hostname: str
        """

        self._hostname = hostname

    @property
    def hostname_data(self):
        """Gets the hostname_data of this JobsJobJobSpecJobDataReplicaSetsInnerMembersInner.  # noqa: E501


        :return: The hostname_data of this JobsJobJobSpecJobDataReplicaSetsInnerMembersInner.  # noqa: E501
        :rtype: str
        """
        return self._hostname_data

    @hostname_data.setter
    def hostname_data(self, hostname_data):
        """Sets the hostname_data of this JobsJobJobSpecJobDataReplicaSetsInnerMembersInner.


        :param hostname_data: The hostname_data of this JobsJobJobSpecJobDataReplicaSetsInnerMembersInner.  # noqa: E501
        :type hostname_data: str
        """

        self._hostname_data = hostname_data

    @property
    def hostname_internal(self):
        """Gets the hostname_internal of this JobsJobJobSpecJobDataReplicaSetsInnerMembersInner.  # noqa: E501


        :return: The hostname_internal of this JobsJobJobSpecJobDataReplicaSetsInnerMembersInner.  # noqa: E501
        :rtype: str
        """
        return self._hostname_internal

    @hostname_internal.setter
    def hostname_internal(self, hostname_internal):
        """Sets the hostname_internal of this JobsJobJobSpecJobDataReplicaSetsInnerMembersInner.


        :param hostname_internal: The hostname_internal of this JobsJobJobSpecJobDataReplicaSetsInnerMembersInner.  # noqa: E501
        :type hostname_internal: str
        """

        self._hostname_internal = hostname_internal

    @property
    def port(self):
        """Gets the port of this JobsJobJobSpecJobDataReplicaSetsInnerMembersInner.  # noqa: E501


        :return: The port of this JobsJobJobSpecJobDataReplicaSetsInnerMembersInner.  # noqa: E501
        :rtype: str
        """
        return self._port

    @port.setter
    def port(self, port):
        """Sets the port of this JobsJobJobSpecJobDataReplicaSetsInnerMembersInner.


        :param port: The port of this JobsJobJobSpecJobDataReplicaSetsInnerMembersInner.  # noqa: E501
        :type port: str
        """

        self._port = port

    @property
    def arbiter_only(self):
        """Gets the arbiter_only of this JobsJobJobSpecJobDataReplicaSetsInnerMembersInner.  # noqa: E501


        :return: The arbiter_only of this JobsJobJobSpecJobDataReplicaSetsInnerMembersInner.  # noqa: E501
        :rtype: bool
        """
        return self._arbiter_only

    @arbiter_only.setter
    def arbiter_only(self, arbiter_only):
        """Sets the arbiter_only of this JobsJobJobSpecJobDataReplicaSetsInnerMembersInner.


        :param arbiter_only: The arbiter_only of this JobsJobJobSpecJobDataReplicaSetsInnerMembersInner.  # noqa: E501
        :type arbiter_only: bool
        """

        self._arbiter_only = arbiter_only

    @property
    def hidden(self):
        """Gets the hidden of this JobsJobJobSpecJobDataReplicaSetsInnerMembersInner.  # noqa: E501


        :return: The hidden of this JobsJobJobSpecJobDataReplicaSetsInnerMembersInner.  # noqa: E501
        :rtype: bool
        """
        return self._hidden

    @hidden.setter
    def hidden(self, hidden):
        """Sets the hidden of this JobsJobJobSpecJobDataReplicaSetsInnerMembersInner.


        :param hidden: The hidden of this JobsJobJobSpecJobDataReplicaSetsInnerMembersInner.  # noqa: E501
        :type hidden: bool
        """

        self._hidden = hidden

    @property
    def priority(self):
        """Gets the priority of this JobsJobJobSpecJobDataReplicaSetsInnerMembersInner.  # noqa: E501


        :return: The priority of this JobsJobJobSpecJobDataReplicaSetsInnerMembersInner.  # noqa: E501
        :rtype: str
        """
        return self._priority

    @priority.setter
    def priority(self, priority):
        """Sets the priority of this JobsJobJobSpecJobDataReplicaSetsInnerMembersInner.


        :param priority: The priority of this JobsJobJobSpecJobDataReplicaSetsInnerMembersInner.  # noqa: E501
        :type priority: str
        """

        self._priority = priority

    @property
    def slave_delay(self):
        """Gets the slave_delay of this JobsJobJobSpecJobDataReplicaSetsInnerMembersInner.  # noqa: E501


        :return: The slave_delay of this JobsJobJobSpecJobDataReplicaSetsInnerMembersInner.  # noqa: E501
        :rtype: str
        """
        return self._slave_delay

    @slave_delay.setter
    def slave_delay(self, slave_delay):
        """Sets the slave_delay of this JobsJobJobSpecJobDataReplicaSetsInnerMembersInner.


        :param slave_delay: The slave_delay of this JobsJobJobSpecJobDataReplicaSetsInnerMembersInner.  # noqa: E501
        :type slave_delay: str
        """

        self._slave_delay = slave_delay

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
        if not isinstance(other, JobsJobJobSpecJobDataReplicaSetsInnerMembersInner):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, JobsJobJobSpecJobDataReplicaSetsInnerMembersInner):
            return True

        return self.to_dict() != other.to_dict()
