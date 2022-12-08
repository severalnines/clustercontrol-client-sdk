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


class Config(object):
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
        'hostname': 'str',
        'port': 'int',
        'configuration': 'list[ConfigConfigurationInner]',
        'ldap_configuration': 'ConfigLdapConfiguration',
        'licensedata': 'str'
    }

    attribute_map = {
        'operation': 'operation',
        'hostname': 'hostname',
        'port': 'port',
        'configuration': 'configuration',
        'ldap_configuration': 'ldap_configuration',
        'licensedata': 'licensedata'
    }

    def __init__(self, operation=None, hostname=None, port=None, configuration=None, ldap_configuration=None, licensedata=None, local_vars_configuration=None):  # noqa: E501
        """Config - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._operation = None
        self._hostname = None
        self._port = None
        self._configuration = None
        self._ldap_configuration = None
        self._licensedata = None
        self.discriminator = None

        self.operation = operation
        if hostname is not None:
            self.hostname = hostname
        if port is not None:
            self.port = port
        if configuration is not None:
            self.configuration = configuration
        if ldap_configuration is not None:
            self.ldap_configuration = ldap_configuration
        if licensedata is not None:
            self.licensedata = licensedata

    @property
    def operation(self):
        """Gets the operation of this Config.  # noqa: E501


        :return: The operation of this Config.  # noqa: E501
        :rtype: str
        """
        return self._operation

    @operation.setter
    def operation(self, operation):
        """Sets the operation of this Config.


        :param operation: The operation of this Config.  # noqa: E501
        :type operation: str
        """
        if self.local_vars_configuration.client_side_validation and operation is None:  # noqa: E501
            raise ValueError("Invalid value for `operation`, must not be `None`")  # noqa: E501
        allowed_values = ["getConfig", "setConfig", "unsetConfig", "getLdapConfig", "setLdapConfig", "setLicense", "getLicense", "listTemplates"]  # noqa: E501
        if self.local_vars_configuration.client_side_validation and operation not in allowed_values:  # noqa: E501
            raise ValueError(
                "Invalid value for `operation` ({0}), must be one of {1}"  # noqa: E501
                .format(operation, allowed_values)
            )

        self._operation = operation

    @property
    def hostname(self):
        """Gets the hostname of this Config.  # noqa: E501


        :return: The hostname of this Config.  # noqa: E501
        :rtype: str
        """
        return self._hostname

    @hostname.setter
    def hostname(self, hostname):
        """Sets the hostname of this Config.


        :param hostname: The hostname of this Config.  # noqa: E501
        :type hostname: str
        """

        self._hostname = hostname

    @property
    def port(self):
        """Gets the port of this Config.  # noqa: E501


        :return: The port of this Config.  # noqa: E501
        :rtype: int
        """
        return self._port

    @port.setter
    def port(self, port):
        """Sets the port of this Config.


        :param port: The port of this Config.  # noqa: E501
        :type port: int
        """

        self._port = port

    @property
    def configuration(self):
        """Gets the configuration of this Config.  # noqa: E501


        :return: The configuration of this Config.  # noqa: E501
        :rtype: list[ConfigConfigurationInner]
        """
        return self._configuration

    @configuration.setter
    def configuration(self, configuration):
        """Sets the configuration of this Config.


        :param configuration: The configuration of this Config.  # noqa: E501
        :type configuration: list[ConfigConfigurationInner]
        """

        self._configuration = configuration

    @property
    def ldap_configuration(self):
        """Gets the ldap_configuration of this Config.  # noqa: E501


        :return: The ldap_configuration of this Config.  # noqa: E501
        :rtype: ConfigLdapConfiguration
        """
        return self._ldap_configuration

    @ldap_configuration.setter
    def ldap_configuration(self, ldap_configuration):
        """Sets the ldap_configuration of this Config.


        :param ldap_configuration: The ldap_configuration of this Config.  # noqa: E501
        :type ldap_configuration: ConfigLdapConfiguration
        """

        self._ldap_configuration = ldap_configuration

    @property
    def licensedata(self):
        """Gets the licensedata of this Config.  # noqa: E501


        :return: The licensedata of this Config.  # noqa: E501
        :rtype: str
        """
        return self._licensedata

    @licensedata.setter
    def licensedata(self, licensedata):
        """Sets the licensedata of this Config.


        :param licensedata: The licensedata of this Config.  # noqa: E501
        :type licensedata: str
        """

        self._licensedata = licensedata

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
        if not isinstance(other, Config):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Config):
            return True

        return self.to_dict() != other.to_dict()