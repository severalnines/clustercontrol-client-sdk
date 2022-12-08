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


class StatCmonAgent(object):
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
        'api_key': 'str',
        'class_name': 'str',
        'request_data': 'StatCmonAgentRequestData'
    }

    attribute_map = {
        'operation': 'operation',
        'api_key': 'apiKey',
        'class_name': 'className',
        'request_data': 'requestData'
    }

    def __init__(self, operation=None, api_key=None, class_name=None, request_data=None, local_vars_configuration=None):  # noqa: E501
        """StatCmonAgent - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._operation = None
        self._api_key = None
        self._class_name = None
        self._request_data = None
        self.discriminator = None

        self.operation = operation
        if api_key is not None:
            self.api_key = api_key
        if class_name is not None:
            self.class_name = class_name
        if request_data is not None:
            self.request_data = request_data

    @property
    def operation(self):
        """Gets the operation of this StatCmonAgent.  # noqa: E501


        :return: The operation of this StatCmonAgent.  # noqa: E501
        :rtype: str
        """
        return self._operation

    @operation.setter
    def operation(self, operation):
        """Sets the operation of this StatCmonAgent.


        :param operation: The operation of this StatCmonAgent.  # noqa: E501
        :type operation: str
        """
        if self.local_vars_configuration.client_side_validation and operation is None:  # noqa: E501
            raise ValueError("Invalid value for `operation`, must not be `None`")  # noqa: E501
        allowed_values = ["/cmonagent"]  # noqa: E501
        if self.local_vars_configuration.client_side_validation and operation not in allowed_values:  # noqa: E501
            raise ValueError(
                "Invalid value for `operation` ({0}), must be one of {1}"  # noqa: E501
                .format(operation, allowed_values)
            )

        self._operation = operation

    @property
    def api_key(self):
        """Gets the api_key of this StatCmonAgent.  # noqa: E501


        :return: The api_key of this StatCmonAgent.  # noqa: E501
        :rtype: str
        """
        return self._api_key

    @api_key.setter
    def api_key(self, api_key):
        """Sets the api_key of this StatCmonAgent.


        :param api_key: The api_key of this StatCmonAgent.  # noqa: E501
        :type api_key: str
        """

        self._api_key = api_key

    @property
    def class_name(self):
        """Gets the class_name of this StatCmonAgent.  # noqa: E501


        :return: The class_name of this StatCmonAgent.  # noqa: E501
        :rtype: str
        """
        return self._class_name

    @class_name.setter
    def class_name(self, class_name):
        """Sets the class_name of this StatCmonAgent.


        :param class_name: The class_name of this StatCmonAgent.  # noqa: E501
        :type class_name: str
        """
        allowed_values = ["CmnRequest"]  # noqa: E501
        if self.local_vars_configuration.client_side_validation and class_name not in allowed_values:  # noqa: E501
            raise ValueError(
                "Invalid value for `class_name` ({0}), must be one of {1}"  # noqa: E501
                .format(class_name, allowed_values)
            )

        self._class_name = class_name

    @property
    def request_data(self):
        """Gets the request_data of this StatCmonAgent.  # noqa: E501


        :return: The request_data of this StatCmonAgent.  # noqa: E501
        :rtype: StatCmonAgentRequestData
        """
        return self._request_data

    @request_data.setter
    def request_data(self, request_data):
        """Sets the request_data of this StatCmonAgent.


        :param request_data: The request_data of this StatCmonAgent.  # noqa: E501
        :type request_data: StatCmonAgentRequestData
        """

        self._request_data = request_data

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
        if not isinstance(other, StatCmonAgent):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, StatCmonAgent):
            return True

        return self.to_dict() != other.to_dict()