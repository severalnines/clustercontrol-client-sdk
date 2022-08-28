SHELL := /bin/bash
export PATH :=/bin:/usr/bin:/bin:./bin/openapitools:./apache-maven-3.8.6/bin:$PATH

GODIR=./generated/go
PYDIR=./generated/pyton
JAVADIR=./generated/java

all: go

go: go-clean
	$(info *** Generating Go code in ${GODIR} ...)
	openapi-generator-cli.sh generate --input-spec ./clustercontrol-v2.yaml --generator-name go --output ${GODIR}
go-clean:
	$(info *** Cleaning up Go code in ${GODIR} ...)
	rm -rf ${GODIR}

python: python-clean
	$(info *** Generating Python code in ${PYDIR} ...)
	openapi-generator-cli.sh generate --input-spec ./clustercontrol-v2.yaml --generator-name python -c config_py.json --output ${PYDIR}

python-clean:
	$(info ** Cleaning up Python code in ${PYDIR} ...)
	rm -rf ${PYDIR}

java: java-clean
	$(info *** Generating Java code in ${JAVADIR} ...)
	openapi-generator-cli.sh generate --input-spec ./clustercontrol-v2.yaml --generator-name python -c config_java.json --output ${JAVADIR}
java-clean:
	$(info *** Cleaning up Java code in ${JAVADIR} ...)
	rm -rf ${JAVADIR}
