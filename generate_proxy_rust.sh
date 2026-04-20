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
PYDIR=./generated/proxy/python
echo "Cleaning up Python code in $PYDIR"
/bin/rm -rf $PYDIR
echo "Generating Python code in $PYDIR"
openapi-generator generate --input-spec ./clustercontrol-proxy.yaml --generator-name python -c config_proxy_py.json --output $PYDIR
#
/bin/rm -rf ./python-openapi-generator-7.18.0/proxy/openapi_proxy_client
cp -rp $PYDIR ./python-openapi-generator-7.18.0/proxy
