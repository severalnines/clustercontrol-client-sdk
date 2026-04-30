# ClusterControl Clinet SDK
ClusterControl Client SDK built on ClusterControl's REST API.

| Directory   | Description of Content                                                                            |
|-------------|---------------------------------------------------------------------------------------------------|
| ./generated | The bindings for various probramming languages that are genereted by the openapi-generator        |
| ./go        | The GoLang binding of with minor modifications to work with ClusterControl                        |
| ./python    | The Python binding of with minor modifications to work with ClusterControl (generator v7.0.1)     |
| ./python2   | The Python binding of with minor modifications to work with ClusterControl (the newgen generator) |
| ./java      | The Java binding of with minor modifications to work with ClusterControl                          |

## Table of Contents
1. [How to use the client SDK - **For Developers and Consumers of the SDK**](#how-to-use-the-client-sdk)
2. [How to use the OpenAPI code generator to generate various language binding - **INTERNAL**](#how-to-generate-language-bindings-for-internal-purposes)

## How to use the client SDK
1. [How to use the GoLang binding](#how-to-use-the-golang-binding)

| Subdirectory                        | Description of Content                                                                |
|-------------------------------------|---------------------------------------------------------------------------------------|
| ./go/pkg/openapi                    | The openapi code used to programatically access ClusterControl REST API endpoints     |
| ./go/pkg/openapi/docs               | The API documentation                                                                 |
| ./go/pkg/openapi/test               | The API tests (needs work)                                                            |
| ./go/cmd/clustercontrol-api-example | A functioning example that uses the ClusterControl API to accomplish some basic tasks |

2. [How to use the Python binding](#how-to-use-the-python-binding)

| Subdirectory                             | Description of Content                                                                |
|------------------------------------------|---------------------------------------------------------------------------------------|
| ./python2/openapi_cc_client              | The openapi code used to programatically access ClusterControl REST API endpoints     |
| ./python2/docs                           | The API documentation                                                                 |
| ./python2/test                           | The API tests (needs work)                                                            |
| ./python2/cmd/clustercontrol_api_example | A functioning example that uses the ClusterControl API to accomplish some basic tasks |

3. [How to use the Java binding](#how-to-use-the-java-binding)

| Subdirectory                                        | Description of Content                                                                |
|-----------------------------------------------------|---------------------------------------------------------------------------------------|
| ./java/clustercontrol-api/src/main/java             | The openapi code used to programatically access ClusterControl REST API endpoints     |
| ./java/clustercontrol-api/docs                      | The API documentation                                                                 |
| ./java/clustercontrol-api/src/test/java             | The API tests (needs work)                                                            |
| ./java/clustercontrol-api-abstraction/src/main/java | API abstraction layer                                                                 |
| ./java/clustercontrol-api-example/src/main/java     | A functioning example that uses the ClusterControl API to accomplish some basic tasks |


### How to use the GoLang binding
#### Building & Running
Setup env variables for ClusterContorl authentication:
```shell
export CC_URL="https://<your-cc-host>:9501/v2"
export API_USER="your_user"
export API_USER_PW="your_password"
```

Build & Run...

```shell
cd ./go/cmd/clustercontrol-api-example
go run main.go
```
OR,
```shell
cd ./go/cmd/clustercontrol-api-example
#go build
go build -o ./bin/ .
./clustercontrol-api-example
```
OR,
```shell
cd ./go/cmd/clustercontrol-api-example
make
./bin/clustercontrol-api-example
```

### How to use the Python binding
#### Building
```shell
cd ./phthon2
```
Setup virtual environment
```shell
python3 -m venv .venv
source .venv/bin/activate
```
Get/Upgrade pip
```shell
pip3 install --upgrade pip
```
Install dependencies
```shell
# If you have a requirements.txt
pip3 install -r requirements.txt
```
OR,
```shell
# If you have setup.py
pip3 install -e .
```

```shell
cd ./clustercontrol_api_example
pip3 install -e .
```

#### Running
```shell
export CC_URL="https://<your-cc-host>:9501/v2"
export API_USER="your_user"
export API_USER_PW="your_password"
cc-api-example
```

### How to use the Java binding
#### Building
##### Building (Gradle)
```shell
cd java
clear && gradle clean build -x javadoc -x test
```
##### Building (Maven)
```shell
cd java
clear && mvn -DskipTests clean package
```

#### Running the test application
Gradle built jar::
```shell
export CC_URL="https://<your-cc-host>:9501/v2"
export API_USER="your_user"
export API_USER_PW="your_password"
java -cp clustercontrol-api-example/build/libs/clustercontrol-api-example-1.0.0-all.jar \
    com.severalnines.clustercontrol.clientsdk.cc.SampleMain
```
Maven built jar:
```shell
export CC_URL="https://<your-cc-host>:9501/v2"
export API_USER="your_user"
export API_USER_PW="your_password"
java -cp ccsdk-package/target/ccsdk-package-1.0.0-jar-with-dependencies.jar \
    com.severalnines.clustercontrol.clientsdk.cc.SampleMain
```

## How to generate language bindings (INTERNAL USE)
1. [How to generate GoLang binding](#how-to-generate-golang-binding)
2. [How to generate Python binding](#how-to-generate-python-binding)
3. [How to generate Java binding](#how-to-generate-java-binding)

### How to generate GoLang binding
### How to generate Python binding
### How to generate Java binding

