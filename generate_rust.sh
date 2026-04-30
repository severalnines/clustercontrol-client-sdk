#!/bin/sh

#
RUSTDIR=./generated/rust
echo "Cleaning up Rust code in $RUSTDIR"
/bin/rm -rf $RUSTDIR
echo "Generating Rust code in $RUSTDIR"
openapi-generator generate --input-spec ./clustercontrol-v2.yaml --generator-name rust --output $RUSTDIR
#
