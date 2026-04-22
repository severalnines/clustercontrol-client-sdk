#!/bin/sh

GODIR=./generated/go
echo "Cleaning up GoLang code in $GODIR"
/bin/rm -rf $GODIR
echo "Generating GoLang code in $GODIR"
openapi-generator generate --input-spec ./clustercontrol-v2.yaml --generator-name go --output $GODIR --git-user-id severalnines --git-repo-id clustercontrol-client-sdk/go/pkg/openapi
#
DEST_BASE=./go/pkg/openapi
#
# Cleanup files
echo "Cleaning up old content from $DEST_BASE - source code, test code and docs"
/bin/rm $DEST_BASE/*.go
/bin/rm $DEST_BASE/test/*.go
/bin/rm $DEST_BASE/docs/*.md
# Copy over newly generated files
echo "Copying over newly generated content to $DEST_BASE - source code, test code and docs"
cp $GODIR/*.go $DEST_BASE
cp -rp $GODIR/test $DEST_BASE
cp -rp $GODIR/docs $DEST_BASE
cp -rp $GODIR/.openapi-generator $DEST_BASE
#
echo "Done."
#
