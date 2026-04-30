"""
    Severalnines ClusterControl API Example Application

    Example application demonstrating the use of the ClusterControl REST API (V2)
    SDK for Python. Covers authentication, cluster info retrieval, and cluster
    creation via the Jobs API.

    Contact: sales@severalnines.com
    Repository: https://github.com/severalnines/clustercontrol-client-sdk
"""

from setuptools import setup, find_packages

NAME = "clustercontrol-api-example"
VERSION = "1.0.0"
PYTHON_REQUIRES = ">= 3.9"

# Runtime dependencies
# - openapi_cc_client: the generated ClusterControl API client (sibling package)
# - urllib3: HTTP client used by the OpenAPI client
# - python-dateutil: date/time parsing used by the OpenAPI client models
# - pydantic: data validation used by the OpenAPI client models
# - typing-extensions: backported typing features required by pydantic/openapi client
# - requests: used in main.py to suppress InsecureRequestWarning for self-signed certs
REQUIRES = [
    "cc-api >= 1.0.0",           # openapi_cc_client package (built from python2/setup.py)
    "urllib3 >= 2.1.0, < 3.0.0",
    "python-dateutil >= 2.8.2",
    "pydantic >= 2.11",
    "typing-extensions >= 4.7.1",
    "requests >= 2.28.0",
]

setup(
    name=NAME,
    version=VERSION,
    description="ClusterControl API Example Application",
    long_description="""\
Example application demonstrating how to use the Severalnines ClusterControl
REST API (V2) Python SDK to authenticate, retrieve cluster information, and
create database clusters programmatically.
    """,
    long_description_content_type="text/plain",
    author="Severalnines",
    author_email="sales@severalnines.com",
    url="https://github.com/severalnines/clustercontrol-client-sdk",
    keywords=[
        "ClusterControl",
        "Severalnines",
        "Database Automation",
        "OpenAPI",
    ],
    python_requires=PYTHON_REQUIRES,
    install_requires=REQUIRES,
    packages=find_packages(exclude=["test", "tests"]),
    include_package_data=True,
    # Expose main.py as a runnable console script
    entry_points={
        "console_scripts": [
            "cc-api-example=clustercontrol_api_example.main:main",
        ],
    },
    classifiers=[
        "Programming Language :: Python :: 3",
        "Programming Language :: Python :: 3.9",
        "Programming Language :: Python :: 3.10",
        "Programming Language :: Python :: 3.11",
        "Programming Language :: Python :: 3.12",
        "Intended Audience :: Developers",
        "Topic :: Database",
        "Topic :: Software Development :: Libraries :: Python Modules",
    ],
)
