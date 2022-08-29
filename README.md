# clustercontrol-client-sdk
ClusterControl Client SDK built on ClusterControl's REST API using OpenAPI spec and code generator.

# Introduction
ClusterControl is a platrform which has a HTTPS based 'RPC' API to provide complete access and control of the CMON Controller which is our workflow engine.
The CMON API documentation is readily available [here](https://severalnines.com/downloads/cmon/cmon-docs/current/rpcv2.html)

Using the CMON RPCv2 API directly though requires that clients are passing JSON documents of jobs specs to be executed.
Creating these CMON JSON job specs are straightforward however cumbersome given its text based nature where correct syntax and manual validations is needed in order for the jobs to be executed.

A more user (developer) friendly way of using the CMON RPCv2 API is to use the OpenAPI specification to document and generate API client libraries for various system languages.
The OpenAPI documentation is machine readable and makes it easy formally describe an API and also use tools such as the [openapi-generator](https://github.com/OpenAPITools/openapi-generator) to generate client libraries.

You can use your favourite system language such as Go or Pyton to create applications which integrates with ClusterControl to manage and monitor your databases.

# Generate Client API libraries with the OpenAPI Generator 

* Install Java Runtime 8. Skip these steps if you already have the latest generated language bindings.

Follow the instructions for Linux at https://docs.datastax.com/en/jdk-install/doc/jdk-install/installOpenJdkDeb.html
Follow the instructions for MacOS at https://docs.oracle.com/javase/8/docs/technotes/guides/install/mac_jdk.html

* Download and setup the openapi-generator
```
$ cd clustercontrol-client-sdk
$ mkdir -p $PWD/bin/openapitools
$ curl -o $PWD/bin/openapitools/openapi-generator-cli.sh https://raw.githubusercontent.com/OpenAPITools/openapi-generator/master/bin/utils/openapi-generator-cli.sh
$ chmod +x $PWD/bin/openapitools/openapi-generator-cli.sh
$ export PATH=$PATH:$PWD/bin/openapitools

```
* Install Apache Maven. 
Follow the instructions [here](https://maven.apache.org/install.html) for your favourite OS.
```
$ curl -o apache-maven-3.8.6-bin.tar.gz https://dlcdn.apache.org/maven/maven-3/3.8.6/binaries/apache-maven-3.8.6-bin.tar.gz
$ tar xzvf apache-maven-3.8.6-bin.tar.gz
$ export PATH=apache-maven-3.8.6/bin:$PATH
```

* Check if openapi-generator.sh is setup properly
```
$ openapi-generator.sh version
6.0.1
```

* Generate API language bindings

```
# install make with 'apt install make'
#make python
#make java
make go
...
[main] INFO  o.o.codegen.TemplateManager - writing file /root/clustercontrol-client-sdk/./generated/go/.openapi-generator/FILES
################################################################################
# Thanks for using OpenAPI Generator.                                          #
# Please consider donation to help us maintain this project 🙏                 #
# https://opencollective.com/openapi_generator/donate                          #
################################################################################
```
The next step is to write your first applicaton which calls upon these generated client API stubs.

# Get Started
## User Authentication - RPC Key
TBD
## Deploy a Cluster
TBD
## List Clusters
TBD
