#!/bin/sh

GODIR=./generated/proxy/go
echo "Cleaning up GO code in $GODIR"
/bin/rm -rf $GODIR
echo "Generating GO code in $GODIR"
openapi-generator generate --input-spec ./clustercontrol-proxy.yaml --generator-name go --output $GODIR --git-user-id severalnines --git-repo-id clustercontrol-client-sdk/go/proxy/pkg/openapi
#
DEST_BASE=./go/proxy/pkg/openapi
/bin/rm -rf .$DEST_BASE
cp -rp $GODIR $DEST_BASE
#