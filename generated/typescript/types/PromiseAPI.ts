import { ResponseContext, RequestContext, HttpFile } from '../http/http';
import * as models from '../models/all';
import { Configuration} from '../configuration'

import { Alarm } from '../models/Alarm';
import { AlarmResponse } from '../models/AlarmResponse';
import { Audit } from '../models/Audit';
import { Authenticate } from '../models/Authenticate';
import { Backup } from '../models/Backup';
import { BackupBackupRecord } from '../models/BackupBackupRecord';
import { BackupSchedule } from '../models/BackupSchedule';
import { BackupScheduleJob } from '../models/BackupScheduleJob';
import { BackupScheduleJobJobData } from '../models/BackupScheduleJobJobData';
import { BackupScheduleJobJobDataVerifyBackup } from '../models/BackupScheduleJobJobDataVerifyBackup';
import { Cloud } from '../models/Cloud';
import { CloudCredentials } from '../models/CloudCredentials';
import { Clusters } from '../models/Clusters';
import { ClustersAccount } from '../models/ClustersAccount';
import { ClustersConfiguration } from '../models/ClustersConfiguration';
import { ClustersDatabase } from '../models/ClustersDatabase';
import { Config } from '../models/Config';
import { ConfigConfiguration } from '../models/ConfigConfiguration';
import { ConfigLdapConfiguration } from '../models/ConfigLdapConfiguration';
import { ConfigLdapConfigurationGroupMappings } from '../models/ConfigLdapConfigurationGroupMappings';
import { ConfigLdapConfigurationLdapSettings } from '../models/ConfigLdapConfigurationLdapSettings';
import { ConfigLdapConfigurationSecurity } from '../models/ConfigLdapConfigurationSecurity';
import { Controller } from '../models/Controller';
import { Discovery } from '../models/Discovery';
import { DiscoveryJob } from '../models/DiscoveryJob';
import { DiscoveryJobJobSpec } from '../models/DiscoveryJobJobSpec';
import { DiscoveryJobJobSpecJobData } from '../models/DiscoveryJobJobSpecJobData';
import { DiscoveryJobJobSpecJobDataNodes } from '../models/DiscoveryJobJobSpecJobDataNodes';
import { DiscoveryNodes } from '../models/DiscoveryNodes';
import { DiscoverySshCredentials } from '../models/DiscoverySshCredentials';
import { Host } from '../models/Host';
import { HostHost } from '../models/HostHost';
import { HostServers } from '../models/HostServers';
import { Jobs } from '../models/Jobs';
import { JobsJob } from '../models/JobsJob';
import { JobsJobJobSpec } from '../models/JobsJobJobSpec';
import { JobsJobJobSpecJobData } from '../models/JobsJobJobSpecJobData';
import { JobsJobJobSpecJobDataConfigServers } from '../models/JobsJobJobSpecJobDataConfigServers';
import { JobsJobJobSpecJobDataConfigServersMembers } from '../models/JobsJobJobSpecJobDataConfigServersMembers';
import { JobsJobJobSpecJobDataMembers } from '../models/JobsJobJobSpecJobDataMembers';
import { JobsJobJobSpecJobDataNode } from '../models/JobsJobJobSpecJobDataNode';
import { JobsJobJobSpecJobDataNodeAdresses } from '../models/JobsJobJobSpecJobDataNodeAdresses';
import { JobsJobJobSpecJobDataNodeConfiguration } from '../models/JobsJobJobSpecJobDataNodeConfiguration';
import { JobsJobJobSpecJobDataNodes } from '../models/JobsJobJobSpecJobDataNodes';
import { JobsJobJobSpecJobDataReplicaSets } from '../models/JobsJobJobSpecJobDataReplicaSets';
import { JobsJobJobSpecJobDataTopology } from '../models/JobsJobJobSpecJobDataTopology';
import { Maintenance } from '../models/Maintenance';
import { Reports } from '../models/Reports';
import { ReportsReport } from '../models/ReportsReport';
import { Stat } from '../models/Stat';
import { StatCmonAgent } from '../models/StatCmonAgent';
import { StatCmonAgentRequestData } from '../models/StatCmonAgentRequestData';
import { StatPrometheus } from '../models/StatPrometheus';
import { StatPrometheusQueries } from '../models/StatPrometheusQueries';
import { Users } from '../models/Users';
import { UsersGroup } from '../models/UsersGroup';
import { UsersUser } from '../models/UsersUser';
import { UsersUserGroups } from '../models/UsersUserGroups';
import { UsersUserPublicKeys } from '../models/UsersUserPublicKeys';
import { ObservableAlarmsApi } from './ObservableAPI';

import { AlarmsApiRequestFactory, AlarmsApiResponseProcessor} from "../apis/AlarmsApi";
export class PromiseAlarmsApi {
    private api: ObservableAlarmsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: AlarmsApiRequestFactory,
        responseProcessor?: AlarmsApiResponseProcessor
    ) {
        this.api = new ObservableAlarmsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * GetStatistics | GetAlarm | GetAlarms | IgnoreAlarm
     * @param alarm All things related to Alarms and Stats
     */
    public alarmPost(alarm: Alarm, _options?: Configuration): Promise<AlarmResponse> {
        const result = this.api.alarmPost(alarm, _options);
        return result.toPromise();
    }


}



import { ObservableAuditApi } from './ObservableAPI';

import { AuditApiRequestFactory, AuditApiResponseProcessor} from "../apis/AuditApi";
export class PromiseAuditApi {
    private api: ObservableAuditApi

    public constructor(
        configuration: Configuration,
        requestFactory?: AuditApiRequestFactory,
        responseProcessor?: AuditApiResponseProcessor
    ) {
        this.api = new ObservableAuditApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * GetStatistics | GetAlarm | GetAlarms | IgnoreAlarm
     * @param audit Used to get the audit log entries
     */
    public auditPost(audit: Audit, _options?: Configuration): Promise<void> {
        const result = this.api.auditPost(audit, _options);
        return result.toPromise();
    }


}



import { ObservableAuthApi } from './ObservableAPI';

import { AuthApiRequestFactory, AuthApiResponseProcessor} from "../apis/AuthApi";
export class PromiseAuthApi {
    private api: ObservableAuthApi

    public constructor(
        configuration: Configuration,
        requestFactory?: AuthApiRequestFactory,
        responseProcessor?: AuthApiResponseProcessor
    ) {
        this.api = new ObservableAuthApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Authenticate | Logout | Password Reset | Authenticate response (with challenge)
     * @param authenticate Authentication parameters
     */
    public authPost(authenticate: Authenticate, _options?: Configuration): Promise<void> {
        const result = this.api.authPost(authenticate, _options);
        return result.toPromise();
    }


}



import { ObservableBackupApi } from './ObservableAPI';

import { BackupApiRequestFactory, BackupApiResponseProcessor} from "../apis/BackupApi";
export class PromiseBackupApi {
    private api: ObservableBackupApi

    public constructor(
        configuration: Configuration,
        requestFactory?: BackupApiRequestFactory,
        responseProcessor?: BackupApiResponseProcessor
    ) {
        this.api = new ObservableBackupApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * GetBackups | GetBackupSchedules | ScheduleBackup | DeleteBackupRecord
     * @param backup All things related to Backups
     */
    public backupPost(backup: Backup, _options?: Configuration): Promise<void> {
        const result = this.api.backupPost(backup, _options);
        return result.toPromise();
    }


}



import { ObservableCloudApi } from './ObservableAPI';

import { CloudApiRequestFactory, CloudApiResponseProcessor} from "../apis/CloudApi";
export class PromiseCloudApi {
    private api: ObservableCloudApi

    public constructor(
        configuration: Configuration,
        requestFactory?: CloudApiRequestFactory,
        responseProcessor?: CloudApiResponseProcessor
    ) {
        this.api = new ObservableCloudApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * VerifyCredentials | ListCredentials | etc
     * @param cloud calls to manage the cloud-credentials
     */
    public cloudPost(cloud: Cloud, _options?: Configuration): Promise<void> {
        const result = this.api.cloudPost(cloud, _options);
        return result.toPromise();
    }


}



import { ObservableClustersApi } from './ObservableAPI';

import { ClustersApiRequestFactory, ClustersApiResponseProcessor} from "../apis/ClustersApi";
export class PromiseClustersApi {
    private api: ObservableClustersApi

    public constructor(
        configuration: Configuration,
        requestFactory?: ClustersApiRequestFactory,
        responseProcessor?: ClustersApiResponseProcessor
    ) {
        this.api = new ObservableClustersApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * GetClusterInfo | Get/Set Config | etc
     * @param clusters Get cluster information
     */
    public clustersPost(clusters: Clusters, _options?: Configuration): Promise<void> {
        const result = this.api.clustersPost(clusters, _options);
        return result.toPromise();
    }


}



import { ObservableConfigApi } from './ObservableAPI';

import { ConfigApiRequestFactory, ConfigApiResponseProcessor} from "../apis/ConfigApi";
export class PromiseConfigApi {
    private api: ObservableConfigApi

    public constructor(
        configuration: Configuration,
        requestFactory?: ConfigApiRequestFactory,
        responseProcessor?: ConfigApiResponseProcessor
    ) {
        this.api = new ObservableConfigApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * GetConfig | xxx | xxx | etc
     * @param config Provides access to various Cmon configuration files
     */
    public configPost(config: Config, _options?: Configuration): Promise<void> {
        const result = this.api.configPost(config, _options);
        return result.toPromise();
    }


}



import { ObservableControllerApi } from './ObservableAPI';

import { ControllerApiRequestFactory, ControllerApiResponseProcessor} from "../apis/ControllerApi";
export class PromiseControllerApi {
    private api: ObservableControllerApi

    public constructor(
        configuration: Configuration,
        requestFactory?: ControllerApiRequestFactory,
        responseProcessor?: ControllerApiResponseProcessor
    ) {
        this.api = new ObservableControllerApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Ping | Heartbeat | etc
     * @param controller Managing controller and operate the Cmon HA subsystem
     */
    public controllerPost(controller: Controller, _options?: Configuration): Promise<void> {
        const result = this.api.controllerPost(controller, _options);
        return result.toPromise();
    }


}



import { ObservableDiscoveryApi } from './ObservableAPI';

import { DiscoveryApiRequestFactory, DiscoveryApiResponseProcessor} from "../apis/DiscoveryApi";
export class PromiseDiscoveryApi {
    private api: ObservableDiscoveryApi

    public constructor(
        configuration: Configuration,
        requestFactory?: DiscoveryApiRequestFactory,
        responseProcessor?: DiscoveryApiResponseProcessor
    ) {
        this.api = new ObservableDiscoveryApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * CheckClusterName | CheckHosts | GetSupportedClusterTypes
     * @param discovery All things related to Clusters and cluster Hosts
     */
    public discoveryPost(discovery: Discovery, _options?: Configuration): Promise<void> {
        const result = this.api.discoveryPost(discovery, _options);
        return result.toPromise();
    }


}



import { ObservableHostApi } from './ObservableAPI';

import { HostApiRequestFactory, HostApiResponseProcessor} from "../apis/HostApi";
export class PromiseHostApi {
    private api: ObservableHostApi

    public constructor(
        configuration: Configuration,
        requestFactory?: HostApiRequestFactory,
        responseProcessor?: HostApiResponseProcessor
    ) {
        this.api = new ObservableHostApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Path for managing servers
     * @param host (Un)Register servers, Shutdown servers, etc
     */
    public hostPost(host: Host, _options?: Configuration): Promise<void> {
        const result = this.api.hostPost(host, _options);
        return result.toPromise();
    }


}



import { ObservableJobsApi } from './ObservableAPI';

import { JobsApiRequestFactory, JobsApiResponseProcessor} from "../apis/JobsApi";
export class PromiseJobsApi {
    private api: ObservableJobsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: JobsApiRequestFactory,
        responseProcessor?: JobsApiResponseProcessor
    ) {
        this.api = new ObservableJobsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * CreateJobInstance | etc
     * @param jobs Creating, manipulating, and obtaining information about jobs
     */
    public jobsPost(jobs: Jobs, _options?: Configuration): Promise<void> {
        const result = this.api.jobsPost(jobs, _options);
        return result.toPromise();
    }


}



import { ObservableMaintenanceApi } from './ObservableAPI';

import { MaintenanceApiRequestFactory, MaintenanceApiResponseProcessor} from "../apis/MaintenanceApi";
export class PromiseMaintenanceApi {
    private api: ObservableMaintenanceApi

    public constructor(
        configuration: Configuration,
        requestFactory?: MaintenanceApiRequestFactory,
        responseProcessor?: MaintenanceApiResponseProcessor
    ) {
        this.api = new ObservableMaintenanceApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * CreateJobInstance | etc
     * @param maintenance Creating, deleting and obtaining maintenance periods
     */
    public maintenancePost(maintenance: Maintenance, _options?: Configuration): Promise<void> {
        const result = this.api.maintenancePost(maintenance, _options);
        return result.toPromise();
    }


}



import { ObservableReportsApi } from './ObservableAPI';

import { ReportsApiRequestFactory, ReportsApiResponseProcessor} from "../apis/ReportsApi";
export class PromiseReportsApi {
    private api: ObservableReportsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: ReportsApiRequestFactory,
        responseProcessor?: ReportsApiResponseProcessor
    ) {
        this.api = new ObservableReportsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * GenerateReport | etc
     * @param reports Provides access to reports generated by the Cmon controller
     */
    public reportsPost(reports: Reports, _options?: Configuration): Promise<void> {
        const result = this.api.reportsPost(reports, _options);
        return result.toPromise();
    }


}



import { ObservableStatApi } from './ObservableAPI';

import { StatApiRequestFactory, StatApiResponseProcessor} from "../apis/StatApi";
export class PromiseStatApi {
    private api: ObservableStatApi

    public constructor(
        configuration: Configuration,
        requestFactory?: StatApiRequestFactory,
        responseProcessor?: StatApiResponseProcessor
    ) {
        this.api = new ObservableStatApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * GetInfo | etc
     * @param stat Provides calls to access various statistical information about the cluster
     */
    public statPost(stat: Stat, _options?: Configuration): Promise<void> {
        const result = this.api.statPost(stat, _options);
        return result.toPromise();
    }


}



import { ObservableStatCmonAgentApi } from './ObservableAPI';

import { StatCmonAgentApiRequestFactory, StatCmonAgentApiResponseProcessor} from "../apis/StatCmonAgentApi";
export class PromiseStatCmonAgentApi {
    private api: ObservableStatCmonAgentApi

    public constructor(
        configuration: Configuration,
        requestFactory?: StatCmonAgentApiRequestFactory,
        responseProcessor?: StatCmonAgentApiResponseProcessor
    ) {
        this.api = new ObservableStatCmonAgentApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * GetInfo | etc
     * @param statCmonAgent Provides calls to access various statistical information about the cluster
     */
    public statCmonagentPost(statCmonAgent: StatCmonAgent, _options?: Configuration): Promise<void> {
        const result = this.api.statCmonagentPost(statCmonAgent, _options);
        return result.toPromise();
    }


}



import { ObservableStatPrometheusApi } from './ObservableAPI';

import { StatPrometheusApiRequestFactory, StatPrometheusApiResponseProcessor} from "../apis/StatPrometheusApi";
export class PromiseStatPrometheusApi {
    private api: ObservableStatPrometheusApi

    public constructor(
        configuration: Configuration,
        requestFactory?: StatPrometheusApiRequestFactory,
        responseProcessor?: StatPrometheusApiResponseProcessor
    ) {
        this.api = new ObservableStatPrometheusApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * GetInfo | etc
     * @param statPrometheus Provides calls to access various statistical information about the cluster
     */
    public statPrometheusQueryPost(statPrometheus: StatPrometheus, _options?: Configuration): Promise<void> {
        const result = this.api.statPrometheusQueryPost(statPrometheus, _options);
        return result.toPromise();
    }


}



import { ObservableUsersApi } from './ObservableAPI';

import { UsersApiRequestFactory, UsersApiResponseProcessor} from "../apis/UsersApi";
export class PromiseUsersApi {
    private api: ObservableUsersApi

    public constructor(
        configuration: Configuration,
        requestFactory?: UsersApiRequestFactory,
        responseProcessor?: UsersApiResponseProcessor
    ) {
        this.api = new ObservableUsersApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * CreateUser | etc
     * @param users Manipulate Cmon Users, users that are maintained by the Cmon controller
     */
    public usersPost(users: Users, _options?: Configuration): Promise<void> {
        const result = this.api.usersPost(users, _options);
        return result.toPromise();
    }


}



