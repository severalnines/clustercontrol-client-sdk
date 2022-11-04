
```mvn clean package```

``` export CC_API_USER_PW=XXX```

``` export CC_URL=https://10.63.1.217:9501/v2```

``` export CC_API_USER=prem```

```java -cp ./target/vsphere-samples-X.X.X.X.jar com.severalnines.vmware.test.ListVMs --server <> --datacenter <> --cluster <> --vmfolder <> --skip-server-verification```

e.g. ```java -cp ./ccsdk-package/target/ccsdk-package-1.0.0-jar-with-dependencies.jar com.severalnines.clustercontrol.clientsdk.cc.CcTest``` 


