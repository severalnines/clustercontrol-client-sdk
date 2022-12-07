# clustercontrol-client-sdk
ClusterControl Client SDK built on ClusterControl's REST API.

## Table of Contents
- [Introduction](#introduction)
- [SDK for various programming languages](#sdk-for-various-proramming-languages)
  - [API binding for Java](#api-binding-for-java)
  - [API binding for Python](#api-binding-for-python)
  - [API binding for GoLang](#api-binding-for-golang)
- [Generating Sources from the API definition](#generating-sources-from-api-definition)

## Introduction
ClusterControl is a platrform which has a HTTPS based 'RPC' API to provide complete access and control of the CMON Controller which is our workflow engine.
The CMON API documentation is readily available [here](https://severalnines.com/downloads/cmon/cmon-docs/current/rpcv2.html)

Using the CMON RPCv2 API directly though requires that clients are passing JSON documents of jobs specs to be executed.
Creating these CMON JSON job specs are straightforward however cumbersome given its text based nature where correct syntax and manual validations is needed in order for the jobs to be executed.

A more user (developer) friendly way of using the CMON RPCv2 API is to use the OpenAPI specification to document and generate API client libraries for various system languages.
The OpenAPI documentation is machine readable and makes it easy formally describe an API and also use tools such as the [openapi-generator](https://github.com/OpenAPITools/openapi-generator) to generate client libraries.

You can use your favourite system language such as Go or Pyton to create applications which integrates with ClusterControl to manage and monitor your databases.

## SDK for various programming languages
ClusterControl API (v2) SDK has bindings for various programming languages.

### API binding for Java
API binding for Java is available in the `java` subdirectory. It requires Apache Maven to build. Here are the build instructions.

Setting up Apache Maven
Here are instructions on how to setup Maven.
1. Download the latest maven from <https://maven.apache.org/download.cgi> and extract it to your machine.
2. Install JDK 8 and set JAVA_HOME to the directory where JDK is installed.
   ```` bash
   export JAVA_HOME=<jdk-install-dir>
   ````
3. Update PATH environment variable to include the maven and jdk "bin" directories.
   ```` bash
   export PATH=<maven-bin-dir>:$JAVA_HOME/bin:$PATH
   ````

Building Java bindings:

   ```` bash
   git clone https://github.com/severalnines/clustercontrol-client-sdk.git
   cd clustercontrol-client-sdk/java
   mvn -DskipTests clean package
   ````

We also provide an API Abstraction Layer above the underlying low-level API bindings. This makes it super easy to use the API SDK. Please check-out the instructions [here](https://github.com/severalnines/clustercontrol-client-sdk/tree/main/java).

### API binding for Python
API binding for Python is available in the `python` subdirectory.

We hope to provide in the very near future an API Abstraction Layer above the underlying low-level API bindings. This makes it super easy to use the API SDK. Please check-out the instructions [here](https://github.com/severalnines/clustercontrol-client-sdk/tree/main/python).


### API binding for GoLang
API binding for GoLang is available in the `go` subdirectory.

We hope to provide in the very near future an API Abstraction Layer above the underlying low-level API bindings. This makes it super easy to use the API SDK. Please check-out the instructions [here](https://github.com/severalnines/clustercontrol-client-sdk/tree/main/go).


## Generating Sources from the API definition 
(**NOTE:** It is not required for you to generate new sources from the API definition. However, if you happend to modify the API definition, then you will have to generate new sources from the definition in order for the sources to reflect changes to the definition.)

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

## Get Started
### User Authentication - RPC Key
TBD
### Deploy a Cluster
TBD
### List Clusters
TBD
