import os
import openapi_cc_client


configuration = openapi_cc_client.Configuration(
    # host="https://cchost:9501/v2"
    host=os.environ.get("CC_URL"),
    verify_ssl=False,
)
