from clustercontrol_api_example import authenticate
import requests
from requests.packages.urllib3.exceptions import InsecureRequestWarning

requests.packages.urllib3.disable_warnings(category=InsecureRequestWarning)

# print("Starting....")

authenticate.authenticateWithCC()
authenticate.getClusterInfo()
# authenticate.getAllClusterInfo()

