import os
import openapi_cc_client
from openapi_cc_client.api import auth_api
from openapi_cc_client.models.authenticate import Authenticate
from openapi_cc_client.api import clusters_api
from openapi_cc_client.models.clusters import Clusters

configuration = openapi_cc_client.Configuration(
    # host="https://cchost:9501/v2"
    host=os.environ.get("CC_URL"),
    verify_ssl=False,
)

def authenticateWithCC():
# Enter a context with an instance of the API client
#     print("authenticateWithCC():")
    with openapi_cc_client.ApiClient(configuration) as api_client:
        # Create an instance of the API class
        api_instance = auth_api.AuthApi(api_client)
        authenticate = Authenticate(
            operation="authenticateWithPassword",
            user_name = os.environ.get("API_USER"),
            password = os.environ.get("API_USER_PW"),
        ) # Authenticate | Authentication parameters

        # example passing only required values which don't have defaults set
        try:
            #kwargs = {"async_req": False}
            # Authenticate | Logout | Password Reset | Authenticate response (with challenge)
            # resp = api_instance.auth_post(authenticate, async_req=False)
            # resp = api_instance.auth_post(authenticate)
            resp = api_instance.auth_post_with_http_info(authenticate)
            print(resp.raw_data.decode('utf8'))
        except openapi_cc_client.ApiException as e:
            print("Exception when calling AuthApi->auth_post: %s\n" % e)

def getClusterInfo():
    # print("getClusterInfo():")
    with openapi_cc_client.ApiClient(configuration) as api_client:
        # Create an instance of the API class
        api_instance = clusters_api.ClustersApi(api_client)
        clusters = Clusters(
            operation="getclusterinfo",
            cluster_name="galera",
            with_hosts=False,
            with_sheet_info=False,
        )  # Clusters | Get cluster information

        # example passing only required values which don't have defaults set
        try:
            # GetClusterInfo | Get/Set Config | etc
            #resp = api_instance.clusters_post(clusters, async_req=False)
            resp = api_instance.clusters_post_with_http_info(clusters)
            print(resp.raw_data.decode('utf8'))
        except openapi_cc_client.ApiException as e:
            print("Exception when calling ClustersApi->clusters_post: %s\n" % e)

def getAllClusterInfo():
    # print("getAllClusterInfo():")
    with openapi_cc_client.ApiClient(configuration) as api_client:
        # Create an instance of the API class
        api_instance = clusters_api.ClustersApi(api_client)
        clusters = Clusters(
            operation="getallclusterinfo",
            with_hosts=False,
            with_sheet_info=False,
        )  # Clusters | Get cluster information

        # example passing only required values which don't have defaults set
        try:
            # GetClusterInfo | Get/Set Config | etc
            #resp = api_instance.clusters_post(clusters, async_req=False)
            resp = api_instance.clusters_post_with_http_info(clusters)
            print(resp.raw_data.decode('utf8'))
        except openapi_cc_client.ApiException as e:
            print("Exception when calling ClustersApi->clusters_post: %s\n" % e)
