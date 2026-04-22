#!/bin/sh

GODIR=./generated/go
echo "Cleaning up GoLang code in $GODIR"
/bin/rm -rf $GODIR
echo "Generating GoLang code in $GODIR"
openapi-generator generate --input-spec ./clustercontrol-v2.yaml --generator-name go --output $GODIR --git-user-id severalnines --git-repo-id clustercontrol-client-sdk/go/pkg/openapi
#
DEST_BASE=./go/pkg/openapi
/bin/rm -rf $DEST_BASE
cp -rp $GODIR $DEST_BASE
#
