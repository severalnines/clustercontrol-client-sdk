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


class ConfigLdapConfigurationLdapSettings(object):
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
        'ldap_email_attributes': 'str',
        'ldap_group_class_name': 'str',
        'ldap_group_id_attributes': 'str',
        'ldap_group_name_attribute': 'str',
        'ldap_member_attributes': 'str',
        'ldap_network_timeout': 'str',
        'ldap_protocol_version': 'str',
        'ldap_query_time_limit': 'str',
        'ldap_realname_attributes': 'str',
        'ldap_user_class_name': 'str',
        'ldap_username_attributes': 'str'
    }

    attribute_map = {
        'ldap_email_attributes': 'ldapEmailAttributes',
        'ldap_group_class_name': 'ldapGroupClassName',
        'ldap_group_id_attributes': 'ldapGroupIdAttributes',
        'ldap_group_name_attribute': 'ldapGroupNameAttribute',
        'ldap_member_attributes': 'ldapMemberAttributes',
        'ldap_network_timeout': 'ldapNetworkTimeout',
        'ldap_protocol_version': 'ldapProtocolVersion',
        'ldap_query_time_limit': 'ldapQueryTimeLimit',
        'ldap_realname_attributes': 'ldapRealnameAttributes',
        'ldap_user_class_name': 'ldapUserClassName',
        'ldap_username_attributes': 'ldapUsernameAttributes'
    }

    def __init__(self, ldap_email_attributes=None, ldap_group_class_name=None, ldap_group_id_attributes=None, ldap_group_name_attribute=None, ldap_member_attributes=None, ldap_network_timeout=None, ldap_protocol_version=None, ldap_query_time_limit=None, ldap_realname_attributes=None, ldap_user_class_name=None, ldap_username_attributes=None, local_vars_configuration=None):  # noqa: E501
        """ConfigLdapConfigurationLdapSettings - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._ldap_email_attributes = None
        self._ldap_group_class_name = None
        self._ldap_group_id_attributes = None
        self._ldap_group_name_attribute = None
        self._ldap_member_attributes = None
        self._ldap_network_timeout = None
        self._ldap_protocol_version = None
        self._ldap_query_time_limit = None
        self._ldap_realname_attributes = None
        self._ldap_user_class_name = None
        self._ldap_username_attributes = None
        self.discriminator = None

        if ldap_email_attributes is not None:
            self.ldap_email_attributes = ldap_email_attributes
        if ldap_group_class_name is not None:
            self.ldap_group_class_name = ldap_group_class_name
        if ldap_group_id_attributes is not None:
            self.ldap_group_id_attributes = ldap_group_id_attributes
        if ldap_group_name_attribute is not None:
            self.ldap_group_name_attribute = ldap_group_name_attribute
        if ldap_member_attributes is not None:
            self.ldap_member_attributes = ldap_member_attributes
        if ldap_network_timeout is not None:
            self.ldap_network_timeout = ldap_network_timeout
        if ldap_protocol_version is not None:
            self.ldap_protocol_version = ldap_protocol_version
        if ldap_query_time_limit is not None:
            self.ldap_query_time_limit = ldap_query_time_limit
        if ldap_realname_attributes is not None:
            self.ldap_realname_attributes = ldap_realname_attributes
        if ldap_user_class_name is not None:
            self.ldap_user_class_name = ldap_user_class_name
        if ldap_username_attributes is not None:
            self.ldap_username_attributes = ldap_username_attributes

    @property
    def ldap_email_attributes(self):
        """Gets the ldap_email_attributes of this ConfigLdapConfigurationLdapSettings.  # noqa: E501


        :return: The ldap_email_attributes of this ConfigLdapConfigurationLdapSettings.  # noqa: E501
        :rtype: str
        """
        return self._ldap_email_attributes

    @ldap_email_attributes.setter
    def ldap_email_attributes(self, ldap_email_attributes):
        """Sets the ldap_email_attributes of this ConfigLdapConfigurationLdapSettings.


        :param ldap_email_attributes: The ldap_email_attributes of this ConfigLdapConfigurationLdapSettings.  # noqa: E501
        :type ldap_email_attributes: str
        """

        self._ldap_email_attributes = ldap_email_attributes

    @property
    def ldap_group_class_name(self):
        """Gets the ldap_group_class_name of this ConfigLdapConfigurationLdapSettings.  # noqa: E501


        :return: The ldap_group_class_name of this ConfigLdapConfigurationLdapSettings.  # noqa: E501
        :rtype: str
        """
        return self._ldap_group_class_name

    @ldap_group_class_name.setter
    def ldap_group_class_name(self, ldap_group_class_name):
        """Sets the ldap_group_class_name of this ConfigLdapConfigurationLdapSettings.


        :param ldap_group_class_name: The ldap_group_class_name of this ConfigLdapConfigurationLdapSettings.  # noqa: E501
        :type ldap_group_class_name: str
        """

        self._ldap_group_class_name = ldap_group_class_name

    @property
    def ldap_group_id_attributes(self):
        """Gets the ldap_group_id_attributes of this ConfigLdapConfigurationLdapSettings.  # noqa: E501


        :return: The ldap_group_id_attributes of this ConfigLdapConfigurationLdapSettings.  # noqa: E501
        :rtype: str
        """
        return self._ldap_group_id_attributes

    @ldap_group_id_attributes.setter
    def ldap_group_id_attributes(self, ldap_group_id_attributes):
        """Sets the ldap_group_id_attributes of this ConfigLdapConfigurationLdapSettings.


        :param ldap_group_id_attributes: The ldap_group_id_attributes of this ConfigLdapConfigurationLdapSettings.  # noqa: E501
        :type ldap_group_id_attributes: str
        """

        self._ldap_group_id_attributes = ldap_group_id_attributes

    @property
    def ldap_group_name_attribute(self):
        """Gets the ldap_group_name_attribute of this ConfigLdapConfigurationLdapSettings.  # noqa: E501


        :return: The ldap_group_name_attribute of this ConfigLdapConfigurationLdapSettings.  # noqa: E501
        :rtype: str
        """
        return self._ldap_group_name_attribute

    @ldap_group_name_attribute.setter
    def ldap_group_name_attribute(self, ldap_group_name_attribute):
        """Sets the ldap_group_name_attribute of this ConfigLdapConfigurationLdapSettings.


        :param ldap_group_name_attribute: The ldap_group_name_attribute of this ConfigLdapConfigurationLdapSettings.  # noqa: E501
        :type ldap_group_name_attribute: str
        """

        self._ldap_group_name_attribute = ldap_group_name_attribute

    @property
    def ldap_member_attributes(self):
        """Gets the ldap_member_attributes of this ConfigLdapConfigurationLdapSettings.  # noqa: E501


        :return: The ldap_member_attributes of this ConfigLdapConfigurationLdapSettings.  # noqa: E501
        :rtype: str
        """
        return self._ldap_member_attributes

    @ldap_member_attributes.setter
    def ldap_member_attributes(self, ldap_member_attributes):
        """Sets the ldap_member_attributes of this ConfigLdapConfigurationLdapSettings.


        :param ldap_member_attributes: The ldap_member_attributes of this ConfigLdapConfigurationLdapSettings.  # noqa: E501
        :type ldap_member_attributes: str
        """

        self._ldap_member_attributes = ldap_member_attributes

    @property
    def ldap_network_timeout(self):
        """Gets the ldap_network_timeout of this ConfigLdapConfigurationLdapSettings.  # noqa: E501


        :return: The ldap_network_timeout of this ConfigLdapConfigurationLdapSettings.  # noqa: E501
        :rtype: str
        """
        return self._ldap_network_timeout

    @ldap_network_timeout.setter
    def ldap_network_timeout(self, ldap_network_timeout):
        """Sets the ldap_network_timeout of this ConfigLdapConfigurationLdapSettings.


        :param ldap_network_timeout: The ldap_network_timeout of this ConfigLdapConfigurationLdapSettings.  # noqa: E501
        :type ldap_network_timeout: str
        """

        self._ldap_network_timeout = ldap_network_timeout

    @property
    def ldap_protocol_version(self):
        """Gets the ldap_protocol_version of this ConfigLdapConfigurationLdapSettings.  # noqa: E501


        :return: The ldap_protocol_version of this ConfigLdapConfigurationLdapSettings.  # noqa: E501
        :rtype: str
        """
        return self._ldap_protocol_version

    @ldap_protocol_version.setter
    def ldap_protocol_version(self, ldap_protocol_version):
        """Sets the ldap_protocol_version of this ConfigLdapConfigurationLdapSettings.


        :param ldap_protocol_version: The ldap_protocol_version of this ConfigLdapConfigurationLdapSettings.  # noqa: E501
        :type ldap_protocol_version: str
        """

        self._ldap_protocol_version = ldap_protocol_version

    @property
    def ldap_query_time_limit(self):
        """Gets the ldap_query_time_limit of this ConfigLdapConfigurationLdapSettings.  # noqa: E501


        :return: The ldap_query_time_limit of this ConfigLdapConfigurationLdapSettings.  # noqa: E501
        :rtype: str
        """
        return self._ldap_query_time_limit

    @ldap_query_time_limit.setter
    def ldap_query_time_limit(self, ldap_query_time_limit):
        """Sets the ldap_query_time_limit of this ConfigLdapConfigurationLdapSettings.


        :param ldap_query_time_limit: The ldap_query_time_limit of this ConfigLdapConfigurationLdapSettings.  # noqa: E501
        :type ldap_query_time_limit: str
        """

        self._ldap_query_time_limit = ldap_query_time_limit

    @property
    def ldap_realname_attributes(self):
        """Gets the ldap_realname_attributes of this ConfigLdapConfigurationLdapSettings.  # noqa: E501


        :return: The ldap_realname_attributes of this ConfigLdapConfigurationLdapSettings.  # noqa: E501
        :rtype: str
        """
        return self._ldap_realname_attributes

    @ldap_realname_attributes.setter
    def ldap_realname_attributes(self, ldap_realname_attributes):
        """Sets the ldap_realname_attributes of this ConfigLdapConfigurationLdapSettings.


        :param ldap_realname_attributes: The ldap_realname_attributes of this ConfigLdapConfigurationLdapSettings.  # noqa: E501
        :type ldap_realname_attributes: str
        """

        self._ldap_realname_attributes = ldap_realname_attributes

    @property
    def ldap_user_class_name(self):
        """Gets the ldap_user_class_name of this ConfigLdapConfigurationLdapSettings.  # noqa: E501


        :return: The ldap_user_class_name of this ConfigLdapConfigurationLdapSettings.  # noqa: E501
        :rtype: str
        """
        return self._ldap_user_class_name

    @ldap_user_class_name.setter
    def ldap_user_class_name(self, ldap_user_class_name):
        """Sets the ldap_user_class_name of this ConfigLdapConfigurationLdapSettings.


        :param ldap_user_class_name: The ldap_user_class_name of this ConfigLdapConfigurationLdapSettings.  # noqa: E501
        :type ldap_user_class_name: str
        """

        self._ldap_user_class_name = ldap_user_class_name

    @property
    def ldap_username_attributes(self):
        """Gets the ldap_username_attributes of this ConfigLdapConfigurationLdapSettings.  # noqa: E501


        :return: The ldap_username_attributes of this ConfigLdapConfigurationLdapSettings.  # noqa: E501
        :rtype: str
        """
        return self._ldap_username_attributes

    @ldap_username_attributes.setter
    def ldap_username_attributes(self, ldap_username_attributes):
        """Sets the ldap_username_attributes of this ConfigLdapConfigurationLdapSettings.


        :param ldap_username_attributes: The ldap_username_attributes of this ConfigLdapConfigurationLdapSettings.  # noqa: E501
        :type ldap_username_attributes: str
        """

        self._ldap_username_attributes = ldap_username_attributes

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
        if not isinstance(other, ConfigLdapConfigurationLdapSettings):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, ConfigLdapConfigurationLdapSettings):
            return True

        return self.to_dict() != other.to_dict()
