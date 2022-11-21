/*
 *     Copyright 2022 Severalnines Inc. @ https://severalnines.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.severalnines.clustercontrol.clientsdk.cc;

import com.severalnines.clustercontrol.api.abstraction.common.JsonSerializeDeserialize;
import com.severalnines.clustercontrol.api.abstraction.pojo.ClusterControlApiResponse;
import org.openapitools.ccapi.client.ApiClient;
import org.openapitools.ccapi.client.ApiException;
import org.openapitools.ccapi.client.ApiResponse;
import org.openapitools.ccapi.client.Configuration;
import org.openapitools.ccapi.client.api.AuthApi;
import org.openapitools.ccapi.client.api.ClustersApi;
import org.openapitools.ccapi.client.api.DiscoveryApi;
import org.openapitools.ccapi.client.api.JobsApi;
import org.openapitools.ccapi.client.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CcTest {

    private static final Logger logger
            = LoggerFactory.getLogger(CcTest.class);

    public CcTest() {
    }

    public void authenticateWithCmon() {
        String URL = System.getenv("CC_URL");
        String API_USER = System.getenv("CC_API_USER");
        // String API_USER = System.getenv("CC_API_USER") + "f";
        String API_USER_PW = System.getenv("CC_API_USER_PW");
        logger.info("CC_URL: {}", URL);
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // defaultClient.setDebugging(true);
        defaultClient.setBasePath(URL);
        defaultClient.setVerifyingSsl(false);

        AuthApi authApiInstance = new AuthApi(defaultClient);
        Authenticate authenticate = new Authenticate(); // Authenticate | Authentication parameters
        authenticate.operation(Authenticate.OperationEnum.AUTHENTICATEWITHPASSWORD);
        authenticate.userName(API_USER);
        authenticate.password(API_USER_PW);
        try {
            // logger.trace("Auth request: {}", authenticate.toString());
            ApiResponse<Void> resp = authApiInstance.authPostWithHttpInfo(authenticate);
            String sResp = String.valueOf(resp.getData());
            // logger.info("Auth response: {}", resp.getData());
            // logger.info("Auth response: {}", sResp);
            System.out.println(sResp);
            ClusterControlApiResponse respPojo = JsonSerializeDeserialize.jsonToObject(
                    sResp, ClusterControlApiResponse.class);
            logger.info("Controller:{}, Request status:{}", respPojo.getControllerId(), respPojo.getRequestStatus());
            if (!respPojo.isRequestStatusOk()) {
                logger.warn("Authentication failed: {}", sResp);
                Authenticate newAuth = new Authenticate();
                newAuth.setUserName(authenticate.getUserName());
                StringBuffer pw = new StringBuffer("XXXXXXXX")
                        .append(authenticate.getPassword().substring(authenticate.getPassword().length()-4));
                logger.info("Authentication details: {}", pw);
            }
        } catch (Exception e) {
            logger.warn("Exception in AuthenticatePost:", e);
        }
    }

    private void discoveryTest() {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        DiscoveryApi discovApiInstance = new DiscoveryApi(defaultClient);
        Discovery discovery = new Discovery(); // Discovery | All things related to Clusters and cluster Hosts
        discovery.setOperation(Discovery.OperationEnum.GETSUPPORTEDCLUSTERTYPES);
        try {
            // discovApiInstance.discoveryPost(discovery);
            logger.debug("Discovery request: {}", discovery.toString());
            ApiResponse<Void> resp = discovApiInstance.discoveryPostWithHttpInfo(discovery);
            logger.debug("Discovery response: {}", resp.getData());
            // String respStr = String.valueOf(resp.getData());
            // System.out.println(respStr);
        } catch (ApiException e) {
            // System.err.println("Exception when calling DiscoveryApi#discoveryPost");
            // System.err.println("Status code: " + e.getCode());
            // System.err.println("Reason: " + e.getResponseBody());
            // System.err.println("Response headers: " + e.getResponseHeaders());
            // e.printStackTrace();
            logger.warn("Exception:", e);
        }
    }


    public String createClusterMySQLreplication(String jsonStr) throws Exception {
        CcTest.Job in = JsonSerializeDeserialize.jsonToObject(jsonStr, CcTest.Job.class);

        ApiClient defaultClient = Configuration.getDefaultApiClient();
        JobsApi apiInstance = new JobsApi(defaultClient);
        Jobs jobs = new Jobs();
        jobs.setOperation(Jobs.OperationEnum.CREATEJOBINSTANCE);

        JobsJob jj = new JobsJob();
        jj.setClassName("CmonJobInstance");

        JobsJobJobSpec jSpec = new JobsJobJobSpec();
        jSpec.setCommand(JobsJobJobSpec.CommandEnum.CREATE_CLUSTER);

        JobsJobJobSpecJobData jsjD = new JobsJobJobSpecJobData();
        // jsjD.setClusterName("test-mysql");
        jsjD.setClusterName(in.cluster_name);
        jsjD.setClusterType(JobsJobJobSpecJobData.ClusterTypeEnum.REPLICATION);
        jsjD.setConfigTemplate("my.cnf.repl80");
        jsjD.setDataDir("/var/lib/mysql");
        jsjD.setDbPassword("Xxxx123Yyyy456Zzzz");
        jsjD.setDisableFirewall(true);
        jsjD.setDisableSelinux(true);
        jsjD.setGenerateToken(true);
        jsjD.setInstallSoftware(true);
        jsjD.setMysqlSemiSync(true);
        jsjD.setPort(3306);
        jsjD.setSshKeyfile("/root/.ssh/id_rsa");
        jsjD.setSshPort("22");
        jsjD.setSshUser("root");
        // jsjD.setUserId(5);
        jsjD.setVendor(JobsJobJobSpecJobData.VendorEnum.PERCONA);
        jsjD.setVersion("8.0");

        JobsJobJobSpecJobDataNode jsjdN = new JobsJobJobSpecJobDataNode();
        // jsjdN.setHostname("10.0.0.4");
        jsjdN.setHostname(in.hostname);
        jsjdN.setPort(3306);
        // jsjdN.setHostname_Data();

        JobsJobJobSpecJobDataTopology jsjdT = new JobsJobJobSpecJobDataTopology();

        jsjD.setNode(jsjdN);
        jsjD.setTopology(jsjdT);
        jSpec.setJobData(jsjD);
        jj.setJobSpec(jSpec);
        jobs.setJob(jj);

        String ret = null;

        try {
            // apiInstance.jobsPost(jobs);
            ApiResponse<Void> resp = apiInstance.jobsPostWithHttpInfo(jobs);
            // System.out.println("CreateCluster job response: " + resp.getData());
            ret = String.valueOf(resp.getData());
        } catch (ApiException e) {
            // System.err.println("Exception when calling JobsApi#jobsPost");
            // System.err.println("Status code: " + e.getCode());
            // System.err.println("Reason: " + e.getResponseBody());
            // System.err.println("Response headers: " + e.getResponseHeaders());
            // e.printStackTrace();
            logger.warn("Exception:", e);
        }

        return ret;
    }

    public String getJobStatus(String jsonStr) throws Exception {
        System.out.println("Job request: " + jsonStr);
        CcTest.Job in = JsonSerializeDeserialize.jsonToObject(jsonStr, CcTest.Job.class);

        ApiClient defaultClient = Configuration.getDefaultApiClient();
        JobsApi apiInstance = new JobsApi(defaultClient);
        Jobs jobs = new Jobs();
        // jobs.operation(Jobs.OperationEnum.GETJOBINSTANCE);
        jobs.setOperation(Jobs.OperationEnum.GETJOBINSTANCE);
        jobs.setJobId(in.job_id);

        String ret = null;

        try {
            // apiInstance.jobsPost(jobs);
            ApiResponse<Void> resp = apiInstance.jobsPostWithHttpInfo(jobs);
            // System.out.println("CreateCluster job response: " + resp.getData());
            ret = String.valueOf(resp.getData());
            ;
            // System.out.println("Get Job response:" + ret);
        } catch (ApiException e) {
            // System.err.println("Exception when calling JobsApi#jobsPost");
            // System.err.println("Status code: " + e.getCode());
            // System.err.println("Reason: " + e.getResponseBody());
            // System.err.println("Response headers: " + e.getResponseHeaders());
            // e.printStackTrace();
            logger.warn("Exception:", e);
        }

        return ret;
    }

    public String getClusterInfo(String jsonStr) throws Exception {
        String ret = null;

        CcTest.ClusterInfo ci = JsonSerializeDeserialize.jsonToObject(jsonStr, CcTest.ClusterInfo.class);

        ApiClient defaultClient = Configuration.getDefaultApiClient();
        ClustersApi apiInstance = new ClustersApi(defaultClient);
        Clusters clusters = new Clusters();
        clusters.setOperation(Clusters.OperationEnum.GETCLUSTERINFO);
        clusters.setClusterName(ci.cluster_name);

        try {
            ApiResponse<Void> resp = apiInstance.clustersPostWithHttpInfo(clusters);
            // System.out.println("ClusterInfo response: " + resp.getData());
            ret = String.valueOf(resp.getData());
        } catch (ApiException e) {
            // System.err.println("Exception when calling JobsApi#jobsPost");
            // System.err.println("Status code: " + e.getCode());
            // System.err.println("Reason: " + e.getResponseBody());
            // System.err.println("Response headers: " + e.getResponseHeaders());
            // e.printStackTrace();
            logger.warn("Exception:", e);
        }

        return ret;
    }

    public static class ResponseBase {
        public String controller_id;
        public String request_status;
    }

    public static class Job {
        public int job_id;
        public String status;
        public String status_text;
        public String cluster_name;
        public int cluster_id;
        public String hostname;
    }

    public static class JobResponse extends ResponseBase {
        public Job job;
    }

    public static class ClusterInfo {
        public int cluster_id;
        public String cluster_name;
    }

    public static class ClustersResponse extends ResponseBase {
        public ClusterInfo cluster;
    }

    public static void main(String[] args) {
        JsonSerializeDeserialize.SetSnakeNaming();
        CcTest cct = new CcTest();
        cct.authenticateWithCmon();
        cct.discoveryTest();
/*
        Job in = new Job();
        in.cluster_name = "test-mysql";
        in.hostname = "10.0.0.4";
        try {
            String responseStr = cct.createClusterMySQLreplication(JsonSerializeDeserialize.objectToJson(in));
            JobResponse jobResp = JsonSerializeDeserialize.jsonToObject(responseStr, CcTest.JobResponse.class);
            int MAX_TIME = 1000*60*15;
            int SLEEP_TIME = 1000*5;
            Job job = new Job();
            job.job_id = jobResp.job.job_id;
            while (MAX_TIME > 0) {
                if (jobResp.job.status.equals("FINISHED")) {
                    break;
                } else {
                    Thread.sleep(SLEEP_TIME);
                    responseStr = cct.getJobStatus(JsonSerializeDeserialize.objectToJson(job));
                    jobResp = JsonSerializeDeserialize.jsonToObject(responseStr, CcTest.JobResponse.class);
                }
            }

            if (MAX_TIME > 0) {
                // Job finishsed successfully
                ClusterInfo ci = new ClusterInfo();
                ci.cluster_name = in.cluster_name;
                responseStr = cct.getClusterInfo(JsonSerializeDeserialize.objectToJson(ci));
                ClustersResponse clusResp = JsonSerializeDeserialize.jsonToObject(responseStr, CcTest.ClustersResponse.class);
                System.out.println("Cluster ID:" + clusResp.cluster.cluster_id);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
*/
    }
}
