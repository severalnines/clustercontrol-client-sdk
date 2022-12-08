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


class StatPrometheus(object):
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
        'cluster_id': 'int',
        'cluster_name': 'str',
        'queries': 'list[StatPrometheusQueriesInner]',
        'start': 'int',
        'end': 'int',
        'step': 'int',
        'returnfrom': 'int'
    }

    attribute_map = {
        'operation': 'operation',
        'cluster_id': 'cluster_id',
        'cluster_name': 'cluster_name',
        'queries': 'queries',
        'start': 'start',
        'end': 'end',
        'step': 'step',
        'returnfrom': 'returnfrom'
    }

    def __init__(self, operation=None, cluster_id=None, cluster_name=None, queries=None, start=None, end=None, step=None, returnfrom=None, local_vars_configuration=None):  # noqa: E501
        """StatPrometheus - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._operation = None
        self._cluster_id = None
        self._cluster_name = None
        self._queries = None
        self._start = None
        self._end = None
        self._step = None
        self._returnfrom = None
        self.discriminator = None

        self.operation = operation
        if cluster_id is not None:
            self.cluster_id = cluster_id
        if cluster_name is not None:
            self.cluster_name = cluster_name
        if queries is not None:
            self.queries = queries
        if start is not None:
            self.start = start
        if end is not None:
            self.end = end
        if step is not None:
            self.step = step
        if returnfrom is not None:
            self.returnfrom = returnfrom

    @property
    def operation(self):
        """Gets the operation of this StatPrometheus.  # noqa: E501


        :return: The operation of this StatPrometheus.  # noqa: E501
        :rtype: str
        """
        return self._operation

    @operation.setter
    def operation(self, operation):
        """Sets the operation of this StatPrometheus.


        :param operation: The operation of this StatPrometheus.  # noqa: E501
        :type operation: str
        """
        if self.local_vars_configuration.client_side_validation and operation is None:  # noqa: E501
            raise ValueError("Invalid value for `operation`, must not be `None`")  # noqa: E501
        allowed_values = ["/prometheus"]  # noqa: E501
        if self.local_vars_configuration.client_side_validation and operation not in allowed_values:  # noqa: E501
            raise ValueError(
                "Invalid value for `operation` ({0}), must be one of {1}"  # noqa: E501
                .format(operation, allowed_values)
            )

        self._operation = operation

    @property
    def cluster_id(self):
        """Gets the cluster_id of this StatPrometheus.  # noqa: E501


        :return: The cluster_id of this StatPrometheus.  # noqa: E501
        :rtype: int
        """
        return self._cluster_id

    @cluster_id.setter
    def cluster_id(self, cluster_id):
        """Sets the cluster_id of this StatPrometheus.


        :param cluster_id: The cluster_id of this StatPrometheus.  # noqa: E501
        :type cluster_id: int
        """

        self._cluster_id = cluster_id

    @property
    def cluster_name(self):
        """Gets the cluster_name of this StatPrometheus.  # noqa: E501


        :return: The cluster_name of this StatPrometheus.  # noqa: E501
        :rtype: str
        """
        return self._cluster_name

    @cluster_name.setter
    def cluster_name(self, cluster_name):
        """Sets the cluster_name of this StatPrometheus.


        :param cluster_name: The cluster_name of this StatPrometheus.  # noqa: E501
        :type cluster_name: str
        """

        self._cluster_name = cluster_name

    @property
    def queries(self):
        """Gets the queries of this StatPrometheus.  # noqa: E501


        :return: The queries of this StatPrometheus.  # noqa: E501
        :rtype: list[StatPrometheusQueriesInner]
        """
        return self._queries

    @queries.setter
    def queries(self, queries):
        """Sets the queries of this StatPrometheus.


        :param queries: The queries of this StatPrometheus.  # noqa: E501
        :type queries: list[StatPrometheusQueriesInner]
        """

        self._queries = queries

    @property
    def start(self):
        """Gets the start of this StatPrometheus.  # noqa: E501

        Seconds since 1970. e.g. 1622105617  # noqa: E501

        :return: The start of this StatPrometheus.  # noqa: E501
        :rtype: int
        """
        return self._start

    @start.setter
    def start(self, start):
        """Sets the start of this StatPrometheus.

        Seconds since 1970. e.g. 1622105617  # noqa: E501

        :param start: The start of this StatPrometheus.  # noqa: E501
        :type start: int
        """

        self._start = start

    @property
    def end(self):
        """Gets the end of this StatPrometheus.  # noqa: E501

        Seconds since 1970. e.g. 1622108317  # noqa: E501

        :return: The end of this StatPrometheus.  # noqa: E501
        :rtype: int
        """
        return self._end

    @end.setter
    def end(self, end):
        """Sets the end of this StatPrometheus.

        Seconds since 1970. e.g. 1622108317  # noqa: E501

        :param end: The end of this StatPrometheus.  # noqa: E501
        :type end: int
        """

        self._end = end

    @property
    def step(self):
        """Gets the step of this StatPrometheus.  # noqa: E501


        :return: The step of this StatPrometheus.  # noqa: E501
        :rtype: int
        """
        return self._step

    @step.setter
    def step(self, step):
        """Sets the step of this StatPrometheus.


        :param step: The step of this StatPrometheus.  # noqa: E501
        :type step: int
        """

        self._step = step

    @property
    def returnfrom(self):
        """Gets the returnfrom of this StatPrometheus.  # noqa: E501


        :return: The returnfrom of this StatPrometheus.  # noqa: E501
        :rtype: int
        """
        return self._returnfrom

    @returnfrom.setter
    def returnfrom(self, returnfrom):
        """Sets the returnfrom of this StatPrometheus.


        :param returnfrom: The returnfrom of this StatPrometheus.  # noqa: E501
        :type returnfrom: int
        """

        self._returnfrom = returnfrom

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
        if not isinstance(other, StatPrometheus):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, StatPrometheus):
            return True

        return self.to_dict() != other.to_dict()