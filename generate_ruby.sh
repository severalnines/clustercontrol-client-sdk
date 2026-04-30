#!/bin/sh

#
RUBYDIR=./generated/ruby
echo "Cleaning up Ruby code in $RUBYDIR"
/bin/rm -rf $RUBYDIR
echo "Generating Ruby code in $RUBYDIR"
openapi-generator generate --input-spec ./clustercontrol-v2.yaml --generator-name ruby --output $RUBYDIR
#
