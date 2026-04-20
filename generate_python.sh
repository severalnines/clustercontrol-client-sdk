#!/bin/sh

PYDIR=./generated/python
echo "Cleaning up Python code in $PYDIR"
/bin/rm -rf $PYDIR
echo "Generating Python code in $PYDIR"
openapi-generator generate --input-spec ./clustercontrol-v2.yaml --generator-name python -c config_py.json --output $PYDIR
#
/bin/rm -rf ./python-openapi-generator-7.18.0/openapi_cc_client
cp -rp $PYDIR ./python-openapi-generator-7.18.0
#
