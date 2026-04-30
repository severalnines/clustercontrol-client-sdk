#!/bin/sh

#
JSDIR=./generated/javascript
echo "Cleaning up JavaScript code in $JSDIR"
/bin/rm -rf $JSDIR
echo "Generating JavaScript code in $JSDIR"
openapi-generator generate --input-spec ./clustercontrol-v2.yaml --generator-name javascript --output $JSDIR
#
