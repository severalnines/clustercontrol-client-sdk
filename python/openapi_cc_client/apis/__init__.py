
# flake8: noqa

# Import all APIs into this package.
# If you have many APIs here with many many models used in each API this may
# raise a `RecursionError`.
# In order to avoid this, import only the API that you directly need like:
#
#   from openapi_cc_client.api.alarms_api import AlarmsApi
#
# or import this package, but before doing it, use:
#
#   import sys
#   sys.setrecursionlimit(n)

# Import APIs into API package:
from openapi_cc_client.api.alarms_api import AlarmsApi
from openapi_cc_client.api.audit_api import AuditApi
from openapi_cc_client.api.auth_api import AuthApi
from openapi_cc_client.api.backup_api import BackupApi
from openapi_cc_client.api.cloud_api import CloudApi
from openapi_cc_client.api.clusters_api import ClustersApi
from openapi_cc_client.api.config_api import ConfigApi
from openapi_cc_client.api.controller_api import ControllerApi
from openapi_cc_client.api.discovery_api import DiscoveryApi
from openapi_cc_client.api.host_api import HostApi
from openapi_cc_client.api.jobs_api import JobsApi
from openapi_cc_client.api.maintenance_api import MaintenanceApi
from openapi_cc_client.api.reports_api import ReportsApi
from openapi_cc_client.api.stat_api import StatApi
from openapi_cc_client.api.stat_cmon_agent_api import StatCmonAgentApi
from openapi_cc_client.api.stat_prometheus_api import StatPrometheusApi
from openapi_cc_client.api.tree_api import TreeApi
from openapi_cc_client.api.users_api import UsersApi
