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


class JobsJobJobSpecJobDataNode(object):
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
        'backend_name_ro': 'str',
        'backend_name_rw': 'str',
        'data_retention': 'str',
        'data_retention_size': 'int',
        'hostname': 'str',
        'lb_admin': 'str',
        'lb_password': 'str',
        'lb_policy': 'str',
        'max_connection_be': 'int',
        'max_connection_fe': 'int',
        'port': 'int',
        'ro_port': 'int',
        'rw_port': 'int',
        'rw_splitting': 'bool',
        'stats_socket': 'str',
        'timeout_client': 'int',
        'timeout_server': 'int',
        'xinetd_allow_from': 'str',
        'scrape_interval': 'str',
        'configuration': 'list[JobsJobJobSpecJobDataNodeConfigurationInner]'
    }

    attribute_map = {
        'backend_name_ro': 'backend_name_ro',
        'backend_name_rw': 'backend_name_rw',
        'data_retention': 'data_retention',
        'data_retention_size': 'data_retention_size',
        'hostname': 'hostname',
        'lb_admin': 'lb_admin',
        'lb_password': 'lb_password',
        'lb_policy': 'lb_policy',
        'max_connection_be': 'max_connection_be',
        'max_connection_fe': 'max_connection_fe',
        'port': 'port',
        'ro_port': 'ro_port',
        'rw_port': 'rw_port',
        'rw_splitting': 'rw_splitting',
        'stats_socket': 'stats_socket',
        'timeout_client': 'timeout_client',
        'timeout_server': 'timeout_server',
        'xinetd_allow_from': 'xinetd_allow_from',
        'scrape_interval': 'scrape_interval',
        'configuration': 'configuration'
    }

    def __init__(self, backend_name_ro=None, backend_name_rw=None, data_retention=None, data_retention_size=None, hostname=None, lb_admin=None, lb_password=None, lb_policy=None, max_connection_be=None, max_connection_fe=None, port=None, ro_port=None, rw_port=None, rw_splitting=None, stats_socket=None, timeout_client=None, timeout_server=None, xinetd_allow_from=None, scrape_interval=None, configuration=None, local_vars_configuration=None):  # noqa: E501
        """JobsJobJobSpecJobDataNode - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._backend_name_ro = None
        self._backend_name_rw = None
        self._data_retention = None
        self._data_retention_size = None
        self._hostname = None
        self._lb_admin = None
        self._lb_password = None
        self._lb_policy = None
        self._max_connection_be = None
        self._max_connection_fe = None
        self._port = None
        self._ro_port = None
        self._rw_port = None
        self._rw_splitting = None
        self._stats_socket = None
        self._timeout_client = None
        self._timeout_server = None
        self._xinetd_allow_from = None
        self._scrape_interval = None
        self._configuration = None
        self.discriminator = None

        if backend_name_ro is not None:
            self.backend_name_ro = backend_name_ro
        if backend_name_rw is not None:
            self.backend_name_rw = backend_name_rw
        if data_retention is not None:
            self.data_retention = data_retention
        if data_retention_size is not None:
            self.data_retention_size = data_retention_size
        if hostname is not None:
            self.hostname = hostname
        if lb_admin is not None:
            self.lb_admin = lb_admin
        if lb_password is not None:
            self.lb_password = lb_password
        if lb_policy is not None:
            self.lb_policy = lb_policy
        if max_connection_be is not None:
            self.max_connection_be = max_connection_be
        if max_connection_fe is not None:
            self.max_connection_fe = max_connection_fe
        if port is not None:
            self.port = port
        if ro_port is not None:
            self.ro_port = ro_port
        if rw_port is not None:
            self.rw_port = rw_port
        if rw_splitting is not None:
            self.rw_splitting = rw_splitting
        if stats_socket is not None:
            self.stats_socket = stats_socket
        if timeout_client is not None:
            self.timeout_client = timeout_client
        if timeout_server is not None:
            self.timeout_server = timeout_server
        if xinetd_allow_from is not None:
            self.xinetd_allow_from = xinetd_allow_from
        if scrape_interval is not None:
            self.scrape_interval = scrape_interval
        if configuration is not None:
            self.configuration = configuration

    @property
    def backend_name_ro(self):
        """Gets the backend_name_ro of this JobsJobJobSpecJobDataNode.  # noqa: E501


        :return: The backend_name_ro of this JobsJobJobSpecJobDataNode.  # noqa: E501
        :rtype: str
        """
        return self._backend_name_ro

    @backend_name_ro.setter
    def backend_name_ro(self, backend_name_ro):
        """Sets the backend_name_ro of this JobsJobJobSpecJobDataNode.


        :param backend_name_ro: The backend_name_ro of this JobsJobJobSpecJobDataNode.  # noqa: E501
        :type backend_name_ro: str
        """

        self._backend_name_ro = backend_name_ro

    @property
    def backend_name_rw(self):
        """Gets the backend_name_rw of this JobsJobJobSpecJobDataNode.  # noqa: E501


        :return: The backend_name_rw of this JobsJobJobSpecJobDataNode.  # noqa: E501
        :rtype: str
        """
        return self._backend_name_rw

    @backend_name_rw.setter
    def backend_name_rw(self, backend_name_rw):
        """Sets the backend_name_rw of this JobsJobJobSpecJobDataNode.


        :param backend_name_rw: The backend_name_rw of this JobsJobJobSpecJobDataNode.  # noqa: E501
        :type backend_name_rw: str
        """

        self._backend_name_rw = backend_name_rw

    @property
    def data_retention(self):
        """Gets the data_retention of this JobsJobJobSpecJobDataNode.  # noqa: E501


        :return: The data_retention of this JobsJobJobSpecJobDataNode.  # noqa: E501
        :rtype: str
        """
        return self._data_retention

    @data_retention.setter
    def data_retention(self, data_retention):
        """Sets the data_retention of this JobsJobJobSpecJobDataNode.


        :param data_retention: The data_retention of this JobsJobJobSpecJobDataNode.  # noqa: E501
        :type data_retention: str
        """

        self._data_retention = data_retention

    @property
    def data_retention_size(self):
        """Gets the data_retention_size of this JobsJobJobSpecJobDataNode.  # noqa: E501


        :return: The data_retention_size of this JobsJobJobSpecJobDataNode.  # noqa: E501
        :rtype: int
        """
        return self._data_retention_size

    @data_retention_size.setter
    def data_retention_size(self, data_retention_size):
        """Sets the data_retention_size of this JobsJobJobSpecJobDataNode.


        :param data_retention_size: The data_retention_size of this JobsJobJobSpecJobDataNode.  # noqa: E501
        :type data_retention_size: int
        """

        self._data_retention_size = data_retention_size

    @property
    def hostname(self):
        """Gets the hostname of this JobsJobJobSpecJobDataNode.  # noqa: E501


        :return: The hostname of this JobsJobJobSpecJobDataNode.  # noqa: E501
        :rtype: str
        """
        return self._hostname

    @hostname.setter
    def hostname(self, hostname):
        """Sets the hostname of this JobsJobJobSpecJobDataNode.


        :param hostname: The hostname of this JobsJobJobSpecJobDataNode.  # noqa: E501
        :type hostname: str
        """

        self._hostname = hostname

    @property
    def lb_admin(self):
        """Gets the lb_admin of this JobsJobJobSpecJobDataNode.  # noqa: E501


        :return: The lb_admin of this JobsJobJobSpecJobDataNode.  # noqa: E501
        :rtype: str
        """
        return self._lb_admin

    @lb_admin.setter
    def lb_admin(self, lb_admin):
        """Sets the lb_admin of this JobsJobJobSpecJobDataNode.


        :param lb_admin: The lb_admin of this JobsJobJobSpecJobDataNode.  # noqa: E501
        :type lb_admin: str
        """

        self._lb_admin = lb_admin

    @property
    def lb_password(self):
        """Gets the lb_password of this JobsJobJobSpecJobDataNode.  # noqa: E501


        :return: The lb_password of this JobsJobJobSpecJobDataNode.  # noqa: E501
        :rtype: str
        """
        return self._lb_password

    @lb_password.setter
    def lb_password(self, lb_password):
        """Sets the lb_password of this JobsJobJobSpecJobDataNode.


        :param lb_password: The lb_password of this JobsJobJobSpecJobDataNode.  # noqa: E501
        :type lb_password: str
        """

        self._lb_password = lb_password

    @property
    def lb_policy(self):
        """Gets the lb_policy of this JobsJobJobSpecJobDataNode.  # noqa: E501


        :return: The lb_policy of this JobsJobJobSpecJobDataNode.  # noqa: E501
        :rtype: str
        """
        return self._lb_policy

    @lb_policy.setter
    def lb_policy(self, lb_policy):
        """Sets the lb_policy of this JobsJobJobSpecJobDataNode.


        :param lb_policy: The lb_policy of this JobsJobJobSpecJobDataNode.  # noqa: E501
        :type lb_policy: str
        """

        self._lb_policy = lb_policy

    @property
    def max_connection_be(self):
        """Gets the max_connection_be of this JobsJobJobSpecJobDataNode.  # noqa: E501


        :return: The max_connection_be of this JobsJobJobSpecJobDataNode.  # noqa: E501
        :rtype: int
        """
        return self._max_connection_be

    @max_connection_be.setter
    def max_connection_be(self, max_connection_be):
        """Sets the max_connection_be of this JobsJobJobSpecJobDataNode.


        :param max_connection_be: The max_connection_be of this JobsJobJobSpecJobDataNode.  # noqa: E501
        :type max_connection_be: int
        """

        self._max_connection_be = max_connection_be

    @property
    def max_connection_fe(self):
        """Gets the max_connection_fe of this JobsJobJobSpecJobDataNode.  # noqa: E501


        :return: The max_connection_fe of this JobsJobJobSpecJobDataNode.  # noqa: E501
        :rtype: int
        """
        return self._max_connection_fe

    @max_connection_fe.setter
    def max_connection_fe(self, max_connection_fe):
        """Sets the max_connection_fe of this JobsJobJobSpecJobDataNode.


        :param max_connection_fe: The max_connection_fe of this JobsJobJobSpecJobDataNode.  # noqa: E501
        :type max_connection_fe: int
        """

        self._max_connection_fe = max_connection_fe

    @property
    def port(self):
        """Gets the port of this JobsJobJobSpecJobDataNode.  # noqa: E501


        :return: The port of this JobsJobJobSpecJobDataNode.  # noqa: E501
        :rtype: int
        """
        return self._port

    @port.setter
    def port(self, port):
        """Sets the port of this JobsJobJobSpecJobDataNode.


        :param port: The port of this JobsJobJobSpecJobDataNode.  # noqa: E501
        :type port: int
        """

        self._port = port

    @property
    def ro_port(self):
        """Gets the ro_port of this JobsJobJobSpecJobDataNode.  # noqa: E501


        :return: The ro_port of this JobsJobJobSpecJobDataNode.  # noqa: E501
        :rtype: int
        """
        return self._ro_port

    @ro_port.setter
    def ro_port(self, ro_port):
        """Sets the ro_port of this JobsJobJobSpecJobDataNode.


        :param ro_port: The ro_port of this JobsJobJobSpecJobDataNode.  # noqa: E501
        :type ro_port: int
        """

        self._ro_port = ro_port

    @property
    def rw_port(self):
        """Gets the rw_port of this JobsJobJobSpecJobDataNode.  # noqa: E501


        :return: The rw_port of this JobsJobJobSpecJobDataNode.  # noqa: E501
        :rtype: int
        """
        return self._rw_port

    @rw_port.setter
    def rw_port(self, rw_port):
        """Sets the rw_port of this JobsJobJobSpecJobDataNode.


        :param rw_port: The rw_port of this JobsJobJobSpecJobDataNode.  # noqa: E501
        :type rw_port: int
        """

        self._rw_port = rw_port

    @property
    def rw_splitting(self):
        """Gets the rw_splitting of this JobsJobJobSpecJobDataNode.  # noqa: E501


        :return: The rw_splitting of this JobsJobJobSpecJobDataNode.  # noqa: E501
        :rtype: bool
        """
        return self._rw_splitting

    @rw_splitting.setter
    def rw_splitting(self, rw_splitting):
        """Sets the rw_splitting of this JobsJobJobSpecJobDataNode.


        :param rw_splitting: The rw_splitting of this JobsJobJobSpecJobDataNode.  # noqa: E501
        :type rw_splitting: bool
        """

        self._rw_splitting = rw_splitting

    @property
    def stats_socket(self):
        """Gets the stats_socket of this JobsJobJobSpecJobDataNode.  # noqa: E501


        :return: The stats_socket of this JobsJobJobSpecJobDataNode.  # noqa: E501
        :rtype: str
        """
        return self._stats_socket

    @stats_socket.setter
    def stats_socket(self, stats_socket):
        """Sets the stats_socket of this JobsJobJobSpecJobDataNode.


        :param stats_socket: The stats_socket of this JobsJobJobSpecJobDataNode.  # noqa: E501
        :type stats_socket: str
        """

        self._stats_socket = stats_socket

    @property
    def timeout_client(self):
        """Gets the timeout_client of this JobsJobJobSpecJobDataNode.  # noqa: E501


        :return: The timeout_client of this JobsJobJobSpecJobDataNode.  # noqa: E501
        :rtype: int
        """
        return self._timeout_client

    @timeout_client.setter
    def timeout_client(self, timeout_client):
        """Sets the timeout_client of this JobsJobJobSpecJobDataNode.


        :param timeout_client: The timeout_client of this JobsJobJobSpecJobDataNode.  # noqa: E501
        :type timeout_client: int
        """

        self._timeout_client = timeout_client

    @property
    def timeout_server(self):
        """Gets the timeout_server of this JobsJobJobSpecJobDataNode.  # noqa: E501


        :return: The timeout_server of this JobsJobJobSpecJobDataNode.  # noqa: E501
        :rtype: int
        """
        return self._timeout_server

    @timeout_server.setter
    def timeout_server(self, timeout_server):
        """Sets the timeout_server of this JobsJobJobSpecJobDataNode.


        :param timeout_server: The timeout_server of this JobsJobJobSpecJobDataNode.  # noqa: E501
        :type timeout_server: int
        """

        self._timeout_server = timeout_server

    @property
    def xinetd_allow_from(self):
        """Gets the xinetd_allow_from of this JobsJobJobSpecJobDataNode.  # noqa: E501


        :return: The xinetd_allow_from of this JobsJobJobSpecJobDataNode.  # noqa: E501
        :rtype: str
        """
        return self._xinetd_allow_from

    @xinetd_allow_from.setter
    def xinetd_allow_from(self, xinetd_allow_from):
        """Sets the xinetd_allow_from of this JobsJobJobSpecJobDataNode.


        :param xinetd_allow_from: The xinetd_allow_from of this JobsJobJobSpecJobDataNode.  # noqa: E501
        :type xinetd_allow_from: str
        """

        self._xinetd_allow_from = xinetd_allow_from

    @property
    def scrape_interval(self):
        """Gets the scrape_interval of this JobsJobJobSpecJobDataNode.  # noqa: E501


        :return: The scrape_interval of this JobsJobJobSpecJobDataNode.  # noqa: E501
        :rtype: str
        """
        return self._scrape_interval

    @scrape_interval.setter
    def scrape_interval(self, scrape_interval):
        """Sets the scrape_interval of this JobsJobJobSpecJobDataNode.


        :param scrape_interval: The scrape_interval of this JobsJobJobSpecJobDataNode.  # noqa: E501
        :type scrape_interval: str
        """

        self._scrape_interval = scrape_interval

    @property
    def configuration(self):
        """Gets the configuration of this JobsJobJobSpecJobDataNode.  # noqa: E501


        :return: The configuration of this JobsJobJobSpecJobDataNode.  # noqa: E501
        :rtype: list[JobsJobJobSpecJobDataNodeConfigurationInner]
        """
        return self._configuration

    @configuration.setter
    def configuration(self, configuration):
        """Sets the configuration of this JobsJobJobSpecJobDataNode.


        :param configuration: The configuration of this JobsJobJobSpecJobDataNode.  # noqa: E501
        :type configuration: list[JobsJobJobSpecJobDataNodeConfigurationInner]
        """

        self._configuration = configuration

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
        if not isinstance(other, JobsJobJobSpecJobDataNode):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, JobsJobJobSpecJobDataNode):
            return True

        return self.to_dict() != other.to_dict()