#!/bin/sh

#GODIR=./generated/go
#echo "Cleaning up GoLang code in $GODIR"
#/bin/rm -rf $GODIR
#echo "Generating GoLang code in $GODIR"
#openapi-generator generate --input-spec ./clustercontrol-v2.yaml --generator-name go --output $GODIR
#
#/bin/rm ./go/pkg/openapi/*.go
#/bin/rm -rf ./go/pkg/openapi/test
#cp $GODIR/*.go ./go/pkg/openapi/
#cp -rp $GODIR/test ./go/pkg/openapi/
#cp -rp $GODIR/docs ./go/pkg/openapi/
#
#
#PYDIR=./generated/python
#echo "Cleaning up Python code in $PYDIR"
#/bin/rm -rf $PYDIR
#echo "Generating Python code in $PYDIR"
#openapi-generator generate --input-spec ./clustercontrol-v2.yaml --generator-name python -c config_py.json --output $PYDIR
#
#/bin/rm -rf ./python/openapi_cc_client
#cp -rp $PYDIR/openapi_cc_client ./python
#
#
#JAVADIR=./generated/java
#echo "Cleaning up Java code in $JAVADIR"
#/bin/rm -rf $JAVADIR
#echo "Generating Java code in $JAVADIR"
#openapi-generator generate --input-spec ./clustercontrol-v2.yaml --generator-name java -c config_java.json --output $JAVADIR
#
#/bin/rm -rf ./java/src
#cp -rp $JAVADIR/src ./java
#
JSDIR=./generated/javascript
JSDIR=./generated/javascript 
echo "Cleaning up JavaScript code in $JSDIR"
/bin/rm -rf $JSDIR
echo "Generating JavaScript code in $JSDIR"
openapi-generator generate --input-spec ./clustercontrol-v2.yaml --generator-name javascript --output $JSDIR
#
#
#TSDIR=./generated/typescript
#TSDIR=./generated/javascript 
#echo "Cleaning up TypeScript code in $TSDIR"
#/bin/rm -rf $TSDIR
#echo "Generating TypeScript code in $TSDIR"
#openapi-generator generate --input-spec ./clustercontrol-v2.yaml --generator-name typescript --output $TSDIR
#
#
#RUBYDIR=./generated/ruby
#echo "Cleaning up Ruby code in $RUBYDIR"
#/bin/rm -rf $RUBYDIR
#echo "Generating Ruby code in $RUBYDIR"
#openapi-generator generate --input-spec ./clustercontrol-v2.yaml --generator-name ruby --output $RUBYDIR
#
#
#RUSTDIR=./generated/rust
#echo "Cleaning up Rust code in $RUSTDIR"
#/bin/rm -rf $RUSTDIR
#echo "Generating Rust code in $RUSTDIR"
#openapi-generator generate --input-spec ./clustercontrol-v2.yaml --generator-name rust --output $RUSTDIR
