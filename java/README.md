# clustercontrol-client-sdk for Java
ClusterControl Client SDK for Java built on ClusterControl's REST API.

## Table of Contents
- [Introduction](#introduction)
- [API binding for Java](#api-binding-for-java)
- [Prerequisites](#prerequisites)
  - [Setting up Apache Maven](#setting-up-apache-maven)
- [Building from sources](#building-from-sources)

## Introduction

[Introduction](https://github.com/severalnines/clustercontrol-client-sdk)

## API binding for Java
This is the API binding for Java. It requires Apache Maven to build. Here are the build instructions.

## Prerequuisites

### Setting up Apache Maven
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

## Building from sources

   ```` bash
   git clone https://github.com/severalnines/clustercontrol-client-sdk.git
   cd clustercontrol-client-sdk/java
   mvn -DskipTests clean package
   ````

We also provide an API Abstraction Layer above the underlying low-level API bindings. This makes it super easy to use the API SDK. Please check-out the instructions [here](https://github.com/severalnines/clustercontrol-client-sdk/tree/main/java).
