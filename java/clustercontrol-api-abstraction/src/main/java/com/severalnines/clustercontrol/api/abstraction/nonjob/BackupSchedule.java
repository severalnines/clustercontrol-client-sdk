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
package com.severalnines.clustercontrol.api.abstraction.nonjob;

import com.severalnines.clustercontrol.api.abstraction.common.*;
import com.severalnines.clustercontrol.api.abstraction.pojo.BackupSpec;
import org.openapitools.ccapi.client.ApiClient;
import org.openapitools.ccapi.client.ApiException;
import org.openapitools.ccapi.client.ApiResponse;
import org.openapitools.ccapi.client.api.BackupApi;
import org.openapitools.ccapi.client.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BackupSchedule extends AbstractClusterControlOperation {

    private static final Logger logger
            = LoggerFactory.getLogger(BackupSchedule.class);

    private Backup.OperationEnum opType;

    protected Backup.OperationEnum getOpType() {
        return opType;
    }

    public BackupSchedule(AbstractAuthenticationStrategy authStrategy, String jsonStr,
                          Backup.OperationEnum opType) {
        super(authStrategy, jsonStr);
        this.opType = opType;
    }

    @Override
    public String execute() throws ClusterControlApiException {
        switch (getOpType()) {
            case SCHEDULEBACKUP:
                return scheduleBackup();

            // TODO: need to implement
/*
            case GETBACKUPSCHEDULES:
                break;
            case GETBACKUPS:
                break;
            case DELETEBACKUPRECORD:
                break;
*/
            default:
                logger.warn("Unsupported Op (enum:{})", getOpType());
                break;
        }
        return null;
    }

    protected String scheduleBackup() throws ClusterControlApiException {
        String ret = null;

        BackupSpec backupSpec = formBackupDetails(getJsonInput());

        try {
            ApiClient defaultClient = getAuthStrategy().getApiClient();
            BackupApi backupApiInstance = new BackupApi(defaultClient);
            Backup backup = new Backup();
            backup.setOperation(Backup.OperationEnum.SCHEDULEBACKUP);
            backup.setClusterId(backupSpec.getClusterId());

            org.openapitools.ccapi.client.model.BackupSchedule backupSchedule = new org.openapitools.ccapi.client.model.BackupSchedule();
            backupSchedule.setClassName(org.openapitools.ccapi.client.model.BackupSchedule.ClassNameEnum.CMONBACKUPSCHEDULE);
            backupSchedule.setEnabled(true);
            backupSchedule.setSchedule(backupSpec.getSchedule());

            BackupScheduleJob scheduleJob = new BackupScheduleJob();
            scheduleJob.setCommand(BackupScheduleJob.CommandEnum.BACKUP);

            BackupScheduleJobJobData jobData = new BackupScheduleJobJobData();
            jobData.setBackupFailover(true);
            jobData.setBackupFailoverHost(BackupScheduleJobJobData.BackupFailoverHostEnum.AUTO);

            // TODO: need to implement

            jobData.setBackupFailover(false);
/*
            jobData.setBackupFailoverHost();
*/

            setBackupMethod(jobData, backupSpec);

            // TODO: need to implement
/*
 */
            jobData.setBackupRetention(31);
            jobData.setBackupdir("/root/backups");
            jobData.setBackupsubdir("BACKUP-%I");
            jobData.setCcStorage("0");
            jobData.setCompression(true);
            jobData.setCompresionLevel(6);
            jobData.setHostname(backupSpec.getHostname());
            jobData.setPort(backupSpec.getPort());
            jobData.setVerifyBackupDelay(0);

            BackupScheduleJobJobDataVerifyBackup verifyBackup = new BackupScheduleJobJobDataVerifyBackup();
            verifyBackup.setServerAddress("");
            verifyBackup.setTerminateDbServer(false);

            jobData.setVerifyBackup(verifyBackup);
            scheduleJob.setJobData(jobData);
            backupSchedule.setJob(scheduleJob);
            backup.setSchedule(backupSchedule);

            logger.debug("ScheduleBackupPost request: {}", backup);
            if (!AbstractAuthenticationStrategy.IsDebugMode()) {
                ApiResponse<Void> resp = backupApiInstance.backupPostWithHttpInfo(backup);
                ret = String.valueOf(resp.getData());
                logger.debug("ScheduleBackupPost response: {}", ret);
            }
        } catch (ApiException e) {
            logger.warn("Exception:", e);
            handleException(e);
        }

        return ret;
    }

    protected void setBackupMethod(BackupScheduleJobJobData jobData, BackupSpec backupSpec)
            throws ClusterControlInputException {
        // TODO: need a smart way figure out the appropriate backup option for each DB type
        // jobData.setBackupMethod(BackupScheduleJobJobData.BackupMethodEnum.XTRABACKUPFULL);
        jobData.setBackupMethod(BackupScheduleJobJobData.BackupMethodEnum.fromValue(backupSpec.getBackupMethod()));
    }
}
