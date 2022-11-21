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
package com.severalnines.clustercontrol.api.abstraction.common;

import org.openapitools.ccapi.client.model.JobsJobJobSpecJobData;

import java.util.HashMap;
import java.util.Map;

public class DbConstants {

    private DbConstants() {
        this.cTypeVendorVerTemplateMap = new HashMap<>();

        Map<JobsJobJobSpecJobData.VendorEnum, Map<String, String>> vendorMap;

        // MySQL/Maria replication, percona, 5.7
        Map<String, String> perconaOracleRepl = new HashMap<>();
        perconaOracleRepl.put("5.7", "my.cnf.repl57");
        perconaOracleRepl.put("8.0", "my.cnf.repl80");

        Map<String, String> mariaRepl = new HashMap<>();
        mariaRepl.put("10.6", "my.cnf.mdb10x-replication");
        mariaRepl.put("10.5", "my.cnf.mdb10x-replication");
        mariaRepl.put("10.4", "my.cnf.mdb10x-replication");
        mariaRepl.put("10.3", "my.cnf.mdb10x-replication");
        mariaRepl.put("10.2", "my.cnf.mdb10x-replication");

        vendorMap = new HashMap<>();
        vendorMap.put(JobsJobJobSpecJobData.VendorEnum.PERCONA, perconaOracleRepl);
        vendorMap.put(JobsJobJobSpecJobData.VendorEnum.ORACLE, perconaOracleRepl);
        vendorMap.put(JobsJobJobSpecJobData.VendorEnum.MARIADB, mariaRepl);
        this.cTypeVendorVerTemplateMap.put(JobsJobJobSpecJobData.ClusterTypeEnum.REPLICATION, vendorMap);

        Map<String, String> pxcGalera = new HashMap<>();
        pxcGalera.put("5.7", "my57.cnf.galera");
        pxcGalera.put("8.0", "my.cnf.80-pxc");

        Map<String, String> mariaGalera = new HashMap<>();
        mariaGalera.put("10.6", "my.cnf.mdb106+-galera");
        mariaGalera.put("10.5", "my.cnf.mdb10x-galera");
        mariaGalera.put("10.4", "my.cnf.mdb10x-galera");
        mariaGalera.put("10.3", "my.cnf.mdb10x-galera");
        mariaGalera.put("10.2", "my.cnf.mdb10x-galera");

        vendorMap = new HashMap<>();
        vendorMap.put(JobsJobJobSpecJobData.VendorEnum.PERCONA, pxcGalera);
        vendorMap.put(JobsJobJobSpecJobData.VendorEnum.MARIADB, mariaGalera);
        this.cTypeVendorVerTemplateMap.put(JobsJobJobSpecJobData.ClusterTypeEnum.GALERA, vendorMap);

        Map<String, String> mongoPercona = new HashMap<>();
        mongoPercona.put("4.0", "mongodb.conf.percona");
        mongoPercona.put("4.2", "mongodb.conf.4.2.percona");
        mongoPercona.put("4.4", "mongodb.conf.4.4.percona");
        mongoPercona.put("5.0", "mongodb.conf.5.0.percona");

        Map<String, String> mongoOrg = new HashMap<>();
        mongoOrg.put("4.0", "mongodb.conf.5.0.org");
        mongoOrg.put("4.2", "mongodb.conf.5.0.org");
        mongoOrg.put("4.4", "mongodb.conf.4.4.org");
        mongoOrg.put("5.0", "mongodb.conf.5.0.org");

        vendorMap = new HashMap<>();
        vendorMap.put(JobsJobJobSpecJobData.VendorEnum.PERCONA, mongoPercona);
        vendorMap.put(JobsJobJobSpecJobData.VendorEnum._10GEN, mongoOrg);
        this.cTypeVendorVerTemplateMap.put(JobsJobJobSpecJobData.ClusterTypeEnum.MONGODB, vendorMap);

        // TODO: need to add Redis, MSSQL, Easticsearch
    }

    public String getTemplate(
            JobsJobJobSpecJobData.ClusterTypeEnum clusterType,
            JobsJobJobSpecJobData.VendorEnum vendor,
            String dbVersion) throws ClusterControlApiException {

        Map<JobsJobJobSpecJobData.VendorEnum, Map<String, String>> vendorMap = this.cTypeVendorVerTemplateMap.get(clusterType);
        if (vendorMap == null) {
            throw new ClusterControlEntryNotFoundException("No entry found for: " + clusterType.getValue());
        }

        Map<String, String> entry = vendorMap.get(vendor);
        if (entry == null) {
            throw new ClusterControlEntryNotFoundException("No entry found for: " + vendor.getValue());
        }

        return entry.get(dbVersion);
    }

    private Map<JobsJobJobSpecJobData.ClusterTypeEnum,
            Map<JobsJobJobSpecJobData.VendorEnum, Map<String, String>>> cTypeVendorVerTemplateMap;
    private static DbConstants me;

    public static DbConstants Instance() {
        if (me == null) {
            me = new DbConstants();
        }

        return me;
    }

}
