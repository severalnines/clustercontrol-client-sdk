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


class JobsJobJobSpecJobDataNodeAdressesInner(object):
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
        'max_connection': 'int',
        'max_replication_lag': 'int',
        'port': 'int',
        'weight': 'int'
    }

    attribute_map = {
        'hostname': 'hostname',
        'max_connection': 'max_connection',
        'max_replication_lag': 'max_replication_lag',
        'port': 'port',
        'weight': 'weight'
    }

    def __init__(self, hostname=None, max_connection=None, max_replication_lag=None, port=None, weight=None, local_vars_configuration=None):  # noqa: E501
        """JobsJobJobSpecJobDataNodeAdressesInner - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._hostname = None
        self._max_connection = None
        self._max_replication_lag = None
        self._port = None
        self._weight = None
        self.discriminator = None

        if hostname is not None:
            self.hostname = hostname
        if max_connection is not None:
            self.max_connection = max_connection
        if max_replication_lag is not None:
            self.max_replication_lag = max_replication_lag
        if port is not None:
            self.port = port
        if weight is not None:
            self.weight = weight

    @property
    def hostname(self):
        """Gets the hostname of this JobsJobJobSpecJobDataNodeAdressesInner.  # noqa: E501


        :return: The hostname of this JobsJobJobSpecJobDataNodeAdressesInner.  # noqa: E501
        :rtype: str
        """
        return self._hostname

    @hostname.setter
    def hostname(self, hostname):
        """Sets the hostname of this JobsJobJobSpecJobDataNodeAdressesInner.


        :param hostname: The hostname of this JobsJobJobSpecJobDataNodeAdressesInner.  # noqa: E501
        :type hostname: str
        """

        self._hostname = hostname

    @property
    def max_connection(self):
        """Gets the max_connection of this JobsJobJobSpecJobDataNodeAdressesInner.  # noqa: E501


        :return: The max_connection of this JobsJobJobSpecJobDataNodeAdressesInner.  # noqa: E501
        :rtype: int
        """
        return self._max_connection

    @max_connection.setter
    def max_connection(self, max_connection):
        """Sets the max_connection of this JobsJobJobSpecJobDataNodeAdressesInner.


        :param max_connection: The max_connection of this JobsJobJobSpecJobDataNodeAdressesInner.  # noqa: E501
        :type max_connection: int
        """

        self._max_connection = max_connection

    @property
    def max_replication_lag(self):
        """Gets the max_replication_lag of this JobsJobJobSpecJobDataNodeAdressesInner.  # noqa: E501


        :return: The max_replication_lag of this JobsJobJobSpecJobDataNodeAdressesInner.  # noqa: E501
        :rtype: int
        """
        return self._max_replication_lag

    @max_replication_lag.setter
    def max_replication_lag(self, max_replication_lag):
        """Sets the max_replication_lag of this JobsJobJobSpecJobDataNodeAdressesInner.


        :param max_replication_lag: The max_replication_lag of this JobsJobJobSpecJobDataNodeAdressesInner.  # noqa: E501
        :type max_replication_lag: int
        """

        self._max_replication_lag = max_replication_lag

    @property
    def port(self):
        """Gets the port of this JobsJobJobSpecJobDataNodeAdressesInner.  # noqa: E501


        :return: The port of this JobsJobJobSpecJobDataNodeAdressesInner.  # noqa: E501
        :rtype: int
        """
        return self._port

    @port.setter
    def port(self, port):
        """Sets the port of this JobsJobJobSpecJobDataNodeAdressesInner.


        :param port: The port of this JobsJobJobSpecJobDataNodeAdressesInner.  # noqa: E501
        :type port: int
        """

        self._port = port

    @property
    def weight(self):
        """Gets the weight of this JobsJobJobSpecJobDataNodeAdressesInner.  # noqa: E501


        :return: The weight of this JobsJobJobSpecJobDataNodeAdressesInner.  # noqa: E501
        :rtype: int
        """
        return self._weight

    @weight.setter
    def weight(self, weight):
        """Sets the weight of this JobsJobJobSpecJobDataNodeAdressesInner.


        :param weight: The weight of this JobsJobJobSpecJobDataNodeAdressesInner.  # noqa: E501
        :type weight: int
        """

        self._weight = weight

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
        if not isinstance(other, JobsJobJobSpecJobDataNodeAdressesInner):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, JobsJobJobSpecJobDataNodeAdressesInner):
            return True

        return self.to_dict() != other.to_dict()
