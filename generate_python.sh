#!/bin/sh

PYDIR=./generated/python
echo "Cleaning up Python code in $PYDIR"
/bin/rm -rf $PYDIR
echo "Generating Python code in $PYDIR"
openapi-generator generate --input-spec ./clustercontrol-v2.yaml --generator-name python -c config_py.json --output $PYDIR
#
DEST_BASE=./python-openapi-generator-7.18.0
/bin/rm -rf $DEST_BASE
cp -rp $PYDIR $DEST_BASE
#
