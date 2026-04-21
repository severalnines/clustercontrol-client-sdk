#!/bin/sh

GODIR=./generated/go
echo "Cleaning up GoLang code in $GODIR"
/bin/rm -rf $GODIR
echo "Generating GoLang code in $GODIR"
openapi-generator generate --input-spec ./clustercontrol-v2.yaml --generator-name go --output $GODIR --git-user-id severalnines --git-repo-id clustercontrol-client-sdk/go/pkg/openapi
#
/bin/rm -rf ./go/pkg/openapi
/bin/rm -rf ./go/pkg/openapi/test
cp -rp $GODIR ./go/pkg/openapi
cp -rp $GODIR/test ./go/pkg/openapi/
cp -rp $GODIR/docs ./go/pkg/openapi/
#
