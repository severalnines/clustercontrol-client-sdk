#!/bin/sh

PYDIR=./generated/python
echo "Cleaning up Python code in $PYDIR"
/bin/rm -rf $PYDIR
echo "Generating Python code in $PYDIR"
openapi-generator generate --input-spec ./clustercontrol-v2.yaml --generator-name python -c config_py.json --output $PYDIR
#
DEST_BASE=./python2
#
echo "Cleaning up old content from $DEST_BASE - source code, test code and docs"
/bin/rm -rf $DEST_BASE/openapi_cc_client
/bin/rm -rf $DEST_BASE/test
/bin/rm -rf $DEST_BASE/docs
/bin/rm -rf $DEST_BASE/.openapi-generator
# Copy over newly generated files
echo "Copying over newly generated content to $DEST_BASE - source code, test code and docs"
cp -rp $PYDIR/openapi_cc_client $DEST_BASE
cp -rp $PYDIR/test $DEST_BASE/openapi_cc_client
cp -rp $PYDIR/docs $DEST_BASE/openapi_cc_client
cp -rp $PYDIR/.openapi-generator $DEST_BASE/openapi_cc_client
cp $PYDIR/setup.* $DEST_BASE
cp $PYDIR/*requirements.txt $DEST_BASE
#
