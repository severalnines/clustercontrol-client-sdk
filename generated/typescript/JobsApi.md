# .JobsApi

All URIs are relative to *https://cchost:9501/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**jobsPost**](JobsApi.md#jobsPost) | **POST** /jobs | CreateJobInstance | etc


# **jobsPost**
> void jobsPost(jobs)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .JobsApi(configuration);

let body:.JobsApiJobsPostRequest = {
  // Jobs | Creating, manipulating, and obtaining information about jobs
  jobs: {
    operation: "createJobInstance",
    clusterId: 1,
    jobId: 1,
    signal: 1,
    ascending: true,
    limit: 1,
    offset: 1,
    logLevel: "logLevel_example",
    job: {
      className: "className_example",
      jobSpec: {
        command: "rolling_restart",
        id: 1,
        jobData: {
          action: "enable",
          addnode: true,
          adminUsername: "adminUsername_example",
          adminUser: "adminUser_example",
          adminPassword: "adminPassword_example",
          auditEvents: "auditEvents_example",
          archiveMode: "always",
          backupid: 1,
          backupId: 1,
          buildFromSource: true,
          clusterName: "clusterName_example",
          clusterid: 1,
          clusterType: "mssql_single",
          companyId: "companyId_example",
          configTemplate: "configTemplate_example",
          backupFailover: true,
          backupFailoverHost: "auto",
          backupMethod: "xtrabackupfull",
          backupMysqldumpType: "Complete",
          backupIndividualSchemas: true,
          backupRetention: 1,
          extendedInsert: true,
          backupDir: "backupDir_example",
          backupsubdir: "backupsubdir_example",
          ccStorage: "ccStorage_example",
          compression: true,
          compressionLevel: 1,
          dbDatabase: "dbDatabase_example",
          dbPassword: "dbPassword_example",
          dbPrivs: "dbPrivs_example",
          dbUsername: "dbUsername_example",
          dataCenter: 1,
          execUpgradeScript: true,
          extended: true,
          listeningPort: 1,
          maskPasswords: true,
          monitorPassword: "monitorPassword_example",
          monitorUser: "monitorUser_example",
          useClustering: true,
          useRwSplit: true,
          hostname: "hostname_example",
          masterAddress: "masterAddress_example",
          includeDatabases: "includeDatabases_example",
          installTimescaledb: true,
          updateLb: true,
          encryptBackup: true,
          throttleRateNetbw: 1,
          usePigz: true,
          useQpress: true,
          wsrepDesync: true,
          xtrabackupBackupLocks: true,
          xtrabackupLockDdlPerTable: true,
          xtrabackupParallellism: 1,
          verifyBackupDelay: 1,
          dataDir: "dataDir_example",
          dbUser: "dbUser_example",
          disableFirewall: true,
          disableSelinux: true,
          enablUninstall: true,
          generateToken: true,
          installSoftware: true,
          enableMysqlUninstall: true,
          mysqlSemiSync: true,
          enableSsl: true,
          mongosConfTemplate: "mongosConfTemplate_example",
          mongodbAuthdb: "mongodbAuthdb_example",
          nodeType: 1,
          overwriteMysqlchk: true,
          port: 1,
          sshKeyfile: "sshKeyfile_example",
          sshPort: "sshPort_example",
          sshUser: "sshUser_example",
          sudoPassword: "sudoPassword_example",
          type: "type_example",
          userId: 1,
          vendor: "defalt",
          version: "version_example",
          softwarePackage: "softwarePackage_example",
          serverAddress: "serverAddress_example",
          terminateDbServer: true,
          xtrabackupUseMemory: 1,
          initial: true,
          reboot: true,
          slaveAddress: "slaveAddress_example",
          force: true,
          forceStop: true,
          stopTimeout: 1,
          verifyBackup: {
            disableFirewall: true,
            disableSelinux: true,
            installSoftware: true,
            serverAddress: "serverAddress_example",
            terminateDbServer: true,
          },
          configServers: {
            rs: "rs_example",
            members: [
              {
                hostname: "hostname_example",
                hostnameData: "hostnameData_example",
                hostnameInternal: "hostnameInternal_example",
                port: "port_example",
              },
            ],
          },
          mongosServers: [
            {
              hostname: "hostname_example",
              hostnameData: "hostnameData_example",
              hostnameInternal: "hostnameInternal_example",
              port: "port_example",
            },
          ],
          node: {
            backendNameRo: "backendNameRo_example",
            backendNameRw: "backendNameRw_example",
            dataRetention: "dataRetention_example",
            dataRetentionSize: 1,
            hostname: "hostname_example",
            lbAdmin: "lbAdmin_example",
            lbPassword: "lbPassword_example",
            lbPolicy: "lbPolicy_example",
            maxConnectionBe: 1,
            maxConnectionFe: 1,
            port: 1,
            roPort: 1,
            rwPort: 1,
            rwSplitting: true,
            statsSocket: "statsSocket_example",
            timeoutClient: 1,
            timeoutServer: 1,
            xinetdAllowFrom: "xinetdAllowFrom_example",
            scrapeInterval: "scrapeInterval_example",
            configuration: [
              {
                arguments: "arguments_example",
                job: "node",
                scrapeInterval: "scrapeInterval_example",
              },
            ],
          },
          nodes: [
            {
              className: "CmonRedisHost",
              cdtPath: "cdtPath_example",
              acl: "acl_example",
              clusterid: 1,
              ip: "ip_example",
              maintenanceMode: "none",
              maintenanceModeActive: true,
              timestamp: 1,
              uniqueId: 1,
              hostname: "hostname_example",
              hostnameData: "hostnameData_example",
              hostnameInternal: "hostnameInternal_example",
              port: "port_example",
              nodetype: "nodetype_example",
              configfile: "configfile_example",
              datadir: "datadir_example",
              backupDir: "backupDir_example",
            },
          ],
          nodeAdresses: [
            {
              hostname: "hostname_example",
              maxConnection: 1,
              maxReplicationLag: 1,
              port: 1,
              weight: 1,
            },
          ],
          topology: {
            masterSlaveLinks: [
              {
                "key": "key_example",
              },
            ],
          },
          replicaSets: [
            {
              rs: "rs_example",
              members: [
                {
                  hostname: "hostname_example",
                  hostnameData: "hostnameData_example",
                  hostnameInternal: "hostnameInternal_example",
                  port: "port_example",
                  arbiterOnly: true,
                  hidden: true,
                  priority: "priority_example",
                  slaveDelay: "slaveDelay_example",
                },
              ],
            },
          ],
          withTags: [
            "withTags_example",
          ],
        },
      },
      recurrence: "recurrence_example",
      tags: [
        "tags_example",
      ],
      title: "Rolling Restart",
      status: "PAUSED",
    },
  },
};

apiInstance.jobsPost(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobs** | **Jobs**| Creating, manipulating, and obtaining information about jobs |


### Return type

**void**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**405** | Unauthorized |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


