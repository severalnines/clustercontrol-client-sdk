#!/bin/sh

#
JAVADIR=./generated/java
echo "Cleaning up Java code in $JAVADIR"
/bin/rm -rf $JAVADIR
echo "Generating Java code in $JAVADIR"
openapi-generator generate --input-spec ./clustercontrol-v2.yaml --generator-name java -c config_java.json --output $JAVADIR
#
DEST_BASE=./java/clustercontrol-api
#
# Cleanup files
echo "Cleaning up old content from $DEST_BASE - source code, test code and docs"
/bin/rm -rf $DEST_BASE/src
/bin/rm -rf $DEST_BASE/docs
# Copy over newly generated files
echo "Copying over newly generated content to $DEST_BASE - source code, test code and docs"
cp -rp $JAVADIR/src $DEST_BASE
cp -rp $JAVADIR/docs $DEST_BASE
cp -rp $GODIR/.openapi-generator $DEST_BASE
rm $DEST_BASE/src/main/AndroidManifest.xml
#
echo "Done."
#
