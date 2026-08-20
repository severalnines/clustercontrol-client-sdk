# =============================================================================
# Makefile - clustercontrol-client-sdk / java
#
# Drop this file at:  clustercontrol-client-sdk/java/Makefile
#
# Thin wrapper around the existing Gradle multi-module build:
#   clustercontrol-api             - OpenAPI-generated low-level client
#   clustercontrol-api-abstraction - high-level facade
#   clustercontrol-api-example     - runnable demo app
#
# Gradle (via ./gradlew) is the primary/preferred build path here, per
# project convention. Equivalent Maven targets are also provided (each
# module also ships a pom.xml) in case Gradle isn't available.
#
# Tested against: Ubuntu 24.04 LTS, OpenJDK 21 (toolchain in build.gradle
# targets Java 8 bytecode; any modern JDK works as the *build* JDK).
# =============================================================================

SHELL := /bin/bash

ROOT_DIR   := $(abspath $(dir $(lastword $(MAKEFILE_LIST))))
GRADLEW    := $(ROOT_DIR)/gradlew
MVN        ?= mvn

EXAMPLE_MODULE := clustercontrol-api-example
EXAMPLE_MAIN   := com.severalnines.clustercontrol.clientsdk.cc.CcTest
EXAMPLE_JAR    := $(ROOT_DIR)/$(EXAMPLE_MODULE)/build/libs/$(EXAMPLE_MODULE)-1.0.0-all.jar

.DEFAULT_GOAL := build

.PHONY: all build test clean javadoc install run-example \
        build-mvn package-mvn install-mvn \
        wrapper-check help

## build: Build & test all subprojects (./gradlew build)
build: wrapper-check
	$(GRADLEW) build -x javadoc -x test

## test: Run unit tests for all subprojects
test: wrapper-check
	$(GRADLEW) test

## clean: Clean all subprojects
clean: wrapper-check
	$(GRADLEW) clean

## javadoc: Generate Javadoc for all subprojects
javadoc: wrapper-check
	$(GRADLEW) javadoc

## install: Publish clustercontrol-api / -abstraction to the local Maven cache (~/.m2)
install: wrapper-check
	$(GRADLEW) installAll

## run-example: Build the fat/shadow jar for clustercontrol-api-example and run it
##              Requires CC_URL / API_USER / API_USER_PW to be exported, e.g.:
##                export CC_URL="https://<cc-host>:9501/v2"
##                export API_USER="admin"
##                export API_USER_PW="secret"
run-example: wrapper-check
	@test -n "$$CC_URL" || (echo "CC_URL is not set (see 'make help')" && exit 1)
	$(GRADLEW) :$(EXAMPLE_MODULE):jar
	java -jar $(EXAMPLE_JAR)

wrapper-check:
	@test -x "$(GRADLEW)" || { echo "gradlew not found/executable at $(GRADLEW)"; exit 1; }

# --- Maven fallback (matches README's documented alternative build path) ----

## build-mvn: Build all modules with Maven instead of Gradle (skips tests)
build-mvn:
	cd $(ROOT_DIR) && $(MVN) -DskipTests clean package

## package-mvn: Package the example module's jar-with-dependencies via Maven
package-mvn: build-mvn

## install-mvn: Install all modules into the local Maven cache via Maven
install-mvn:
	cd $(ROOT_DIR) && $(MVN) -DskipTests clean install

## help: Show this help
help:
	@echo "clustercontrol-client-sdk/java targets (Gradle, preferred):"
	@grep -E '^## ' $(MAKEFILE_LIST) | sed 's/^## /  /'
	@echo ""
	@echo "Env vars for run-example: CC_URL, API_USER, API_USER_PW"
