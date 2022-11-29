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
package com.severalnines.clustercontrol.api.abstraction.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DbCluster {
    public DbCluster() {}

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public int getClusterId() {
        return clusterId;
    }

    public void setClusterId(int clusterId) {
        this.clusterId = clusterId;
    }

    public String getDbAdminUser() {
        return dbAdminUser;
    }

    public void setDbAdminUser(String dbAdminUser) {
        this.dbAdminUser = dbAdminUser;
    }

    public String getDbAdminUserPw() {
        return dbAdminUserPw;
    }

    public void setDbAdminUserPw(String dbAdminUserPw) {
        this.dbAdminUserPw = dbAdminUserPw;
    }

    public String getDataDir() {
        return dataDir;
    }

    public void setDataDir(String dataDir) {
        this.dataDir = dataDir;
    }

    public List<Host> getHosts() {
        return hosts;
    }
//    public void setHosts(List<Host> hosts) {
//        this.hosts = hosts;
//    }

    public void addHost(Host h) {
        this.hosts.add(h);
    }

    public void setConfigServers(MongoServer cs) {
        this.configServers = cs;
    }

    public void addMongosServer(Host h) {
        this.mongosServers.add(h);
    }

    public List<Host> getMongosServers() {
        return this.mongosServers;
    }

    public MongoServer getConfigServers() {
        return this.configServers;
    }

    public List<MongoReplicaset> getReplicaSets() {
        return this.replicaSets;
    }

    public void addReplicaset(MongoReplicaset rs) {
        this.replicaSets.add(rs);
    }

    public List<Map<String, String>> getMasterSlaveLinks() {
        return masterSlaveLinks;
    }

    public void addMasterSlaveLink(Map<String,String> link) {
        this.masterSlaveLinks.add(link);
    }

//    public void setMasterSlaveLinks(List<Map<String, String>> masterSlaveLinks) {
//        this.masterSlaveLinks = masterSlaveLinks;
//    }

    public String getDbVersion() {
        return dbVersion;
    }

    public void setDbVersion(String dbVersion) {
        this.dbVersion = dbVersion;
    }

    public String getDbVendor() {
        return dbVendor;
    }

    public void setDbVendor(String dbVendor) {
        this.dbVendor = dbVendor;
    }

    public String getDbType() {
        return dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType;
    }

    public String getClusterType() {
        return clusterType;
    }

    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getSshPort() {
        return sshPort;
    }

    public void setSshPort(String sshPort) {
        this.sshPort = sshPort;
    }

    public String getSshUser() {
        return sshUser;
    }

    public void setSshUser(String sshUser) {
        this.sshUser = sshUser;
    }

    public String getSshKeyfile() {
        return sshKeyfile;
    }

    public void setSshKeyfile(String sshKeyfile) {
        this.sshKeyfile = sshKeyfile;
    }

    public String getSudoPassword() {
        return sudoPassword;
    }

    public void setSudoPassword(String sudoPassword) {
        this.sudoPassword = sudoPassword;
    }

    public String getSnapshotLocaiton() {
        return snapshotLocaiton;
    }

    public void setSnapshotLocaiton(String snapshotLocaiton) {
        this.snapshotLocaiton = snapshotLocaiton;
    }

    public String getSnapshotRepository() {
        return snapshotRepository;
    }

    public void setSnapshotRepository(String snapshotRepository) {
        this.snapshotRepository = snapshotRepository;
    }

    public String getStorageHost() {
        return storageHost;
    }

    public void setStorageHost(String storageHost) {
        this.storageHost = storageHost;
    }

    String clusterName;
    int clusterId;
    String dbAdminUser;
    String dbAdminUserPw;
    String dataDir;
    List<Host> hosts = new ArrayList<>();
    List<Map<String, String>> masterSlaveLinks = new ArrayList<>();
    String dbVersion;
    String dbVendor;
    String dbType;
    String clusterType;
    String port;
    String sshPort = "22";
    String sshUser = "root";
    String sshKeyfile = "/root/.ssh/id_rsa";
    String sudoPassword;
    MongoServer configServers;
    List<Host> mongosServers = new ArrayList<>();
    List<MongoReplicaset> replicaSets = new ArrayList<>();
    String snapshotLocaiton;
    String snapshotRepository;
    String storageHost;

}
