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

public class BackupSpec {
    public BackupSpec() {}

    public int getClusterId() {
        return clusterId;
    }

    public void setClusterId(int clusterId) {
        this.clusterId = clusterId;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getBackupMethod() {
        return backupMethod;
    }

    public void setBackupMethod(String backupMethod) {
        this.backupMethod = backupMethod;
    }

    public int getBackupRetention() {
        return backupRetention;
    }

    public void setBackupRetention(int backupRetention) {
        this.backupRetention = backupRetention;
    }

    public String getBackupdir() {
        return backupdir;
    }

    public void setBackupdir(String backupdir) {
        this.backupdir = backupdir;
    }

    public String getBackupsubdir() {
        return backupsubdir;
    }

    public void setBackupsubdir(String backupsubdir) {
        this.backupsubdir = backupsubdir;
    }

    public String getCcStorage() {
        return ccStorage;
    }

    public void setCcStorage(String ccStorage) {
        this.ccStorage = ccStorage;
    }

    public boolean isCompression() {
        return compression;
    }

    public void setCompression(boolean compression) {
        this.compression = compression;
    }

    public int getCompressionLevel() {
        return compressionLevel;
    }

    public void setCompressionLevel(int compressionLevel) {
        this.compressionLevel = compressionLevel;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getServerAddress() {
        return serverAddress;
    }

    public void setServerAddress(String serverAddress) {
        this.serverAddress = serverAddress;
    }

    public boolean isEncryptBackup() {
        return encryptBackup;
    }

    public void setEncryptBackup(boolean encryptBackup) {
        this.encryptBackup = encryptBackup;
    }

    public int getBackupId() {
        return backupId;
    }

    public void setBackupId(int backupId) {
        this.backupId = backupId;
    }

    private int clusterId;
    private int backupId;
    private String schedule;
    private String backupMethod;
    private int backupRetention;
    private String backupdir;
    private String backupsubdir;
    private String ccStorage;
    private boolean compression;
    private int compressionLevel;
    private boolean encryptBackup;
    private String hostname;
    private int port;
    private String serverAddress; // backup verificaiton host

}
