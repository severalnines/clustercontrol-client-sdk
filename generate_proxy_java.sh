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
JAVADIR=./generated/proxy/java
echo "Cleaning up Java code in $JAVADIR"
/bin/rm -rf $JAVADIR
echo "Generating Java code in $JAVADIR"
openapi-generator generate --input-spec ./clustercontrol-proxy.yaml --generator-name java -c config_proxy_java.json --output $JAVADIR
#
/bin/rm -rf ./java/proxy/src
cp -rp $JAVADIR/src ./java/proxy
