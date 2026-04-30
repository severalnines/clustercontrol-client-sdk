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
RUBYDIR=./generated/proxy/ruby
echo "Cleaning up Ruby code in $RUBYDIR"
/bin/rm -rf $RUBYDIR
echo "Generating Ruby code in $RUBYDIR"
openapi-generator generate --input-spec ./clustercontrol-proxy.yaml --generator-name ruby --output $RUBYDIR
#