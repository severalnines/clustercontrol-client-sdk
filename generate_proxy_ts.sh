#!/bin/sh

# GODIR=./generated/proxy/go
# echo "Cleaning up GoLang code in $GODIR"
# /bin/rm -rf $GODIR
# echo "Generating GoLang code in $GODIR"
# openapi-generator generate --input-spec ./clustercontrol-proxy.yaml --generator-name go --output $GODIR
# #
# /bin/rm -rf ./go/proxy/pkg/openapi
## /bin/rm -rf ./go/proxy/pkg/openapi/test
# cp -rp $GODIR ./go/proxy/pkg/openapi
## cp -rp $GODIR/test ./go/proxy/pkg/openapi/
## cp -rp $GODIR/docs ./go/proxy/pkg/openapi/
#
#
TSDIR=./generated/proxy/javascript 
echo "Cleaning up TypeScript code in $TSDIR"
/bin/rm -rf $TSDIR
echo "Generating TypeScript code in $TSDIR"
openapi-generator generate --input-spec ./clustercontrol-proxy.yaml --generator-name typescript --output $TSDIR
#