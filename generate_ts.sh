#!/bin/sh

#
TSDIR=./generated/javascript 
echo "Cleaning up TypeScript code in $TSDIR"
/bin/rm -rf $TSDIR
echo "Generating TypeScript code in $TSDIR"
openapi-generator generate --input-spec ./clustercontrol-v2.yaml --generator-name typescript --output $TSDIR
#
