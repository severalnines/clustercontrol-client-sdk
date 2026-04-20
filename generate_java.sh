#!/bin/sh

#
JAVADIR=./generated/java
echo "Cleaning up Java code in $JAVADIR"
/bin/rm -rf $JAVADIR
echo "Generating Java code in $JAVADIR"
openapi-generator generate --input-spec ./clustercontrol-v2.yaml --generator-name java -c config_java.json --output $JAVADIR
#
/bin/rm -rf ./java/src
cp -rp $JAVADIR/src ./java
#
