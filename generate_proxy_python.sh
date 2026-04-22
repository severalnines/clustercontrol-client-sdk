#!/bin/sh

PYDIR=./generated/proxy/python
echo "Cleaning up Python code in $PYDIR"
/bin/rm -rf $PYDIR
echo "Generating Python code in $PYDIR"
openapi-generator generate --input-spec ./clustercontrol-proxy.yaml --generator-name python -c config_proxy_py.json --output $PYDIR
#
DEST_BASE=./python-openapi-generator-7.18.0/proxy
/bin/rm -rf $DEST_BASE
cp -rp $PYDIR $DEST_BASE
#