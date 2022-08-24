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

import { ObservableAlarmsApi } from "./ObservableAPI";
import { AlarmsApiRequestFactory, AlarmsApiResponseProcessor} from "../apis/AlarmsApi";

export interface AlarmsApiAlarmPostRequest {
    /**
     * All things related to Alarms and Stats
     * @type Alarm
     * @memberof AlarmsApialarmPost
     */
    alarm: Alarm
}

export class ObjectAlarmsApi {
    private api: ObservableAlarmsApi

    public constructor(configuration: Configuration, requestFactory?: AlarmsApiRequestFactory, responseProcessor?: AlarmsApiResponseProcessor) {
        this.api = new ObservableAlarmsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * GetStatistics | GetAlarm | GetAlarms | IgnoreAlarm
     * @param param the request object
     */
    public alarmPost(param: AlarmsApiAlarmPostRequest, options?: Configuration): Promise<AlarmResponse> {
        return this.api.alarmPost(param.alarm,  options).toPromise();
    }

}

import { ObservableAuditApi } from "./ObservableAPI";
import { AuditApiRequestFactory, AuditApiResponseProcessor} from "../apis/AuditApi";

export interface AuditApiAuditPostRequest {
    /**
     * Used to get the audit log entries
     * @type Audit
     * @memberof AuditApiauditPost
     */
    audit: Audit
}

export class ObjectAuditApi {
    private api: ObservableAuditApi

    public constructor(configuration: Configuration, requestFactory?: AuditApiRequestFactory, responseProcessor?: AuditApiResponseProcessor) {
        this.api = new ObservableAuditApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * GetStatistics | GetAlarm | GetAlarms | IgnoreAlarm
     * @param param the request object
     */
    public auditPost(param: AuditApiAuditPostRequest, options?: Configuration): Promise<void> {
        return this.api.auditPost(param.audit,  options).toPromise();
    }

}

import { ObservableAuthApi } from "./ObservableAPI";
import { AuthApiRequestFactory, AuthApiResponseProcessor} from "../apis/AuthApi";

export interface AuthApiAuthPostRequest {
    /**
     * Authentication parameters
     * @type Authenticate
     * @memberof AuthApiauthPost
     */
    authenticate: Authenticate
}

export class ObjectAuthApi {
    private api: ObservableAuthApi

    public constructor(configuration: Configuration, requestFactory?: AuthApiRequestFactory, responseProcessor?: AuthApiResponseProcessor) {
        this.api = new ObservableAuthApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Authenticate | Logout | Password Reset | Authenticate response (with challenge)
     * @param param the request object
     */
    public authPost(param: AuthApiAuthPostRequest, options?: Configuration): Promise<void> {
        return this.api.authPost(param.authenticate,  options).toPromise();
    }

}

import { ObservableBackupApi } from "./ObservableAPI";
import { BackupApiRequestFactory, BackupApiResponseProcessor} from "../apis/BackupApi";

export interface BackupApiBackupPostRequest {
    /**
     * All things related to Backups
     * @type Backup
     * @memberof BackupApibackupPost
     */
    backup: Backup
}

export class ObjectBackupApi {
    private api: ObservableBackupApi

    public constructor(configuration: Configuration, requestFactory?: BackupApiRequestFactory, responseProcessor?: BackupApiResponseProcessor) {
        this.api = new ObservableBackupApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * GetBackups | GetBackupSchedules | ScheduleBackup | DeleteBackupRecord
     * @param param the request object
     */
    public backupPost(param: BackupApiBackupPostRequest, options?: Configuration): Promise<void> {
        return this.api.backupPost(param.backup,  options).toPromise();
    }

}

import { ObservableCloudApi } from "./ObservableAPI";
import { CloudApiRequestFactory, CloudApiResponseProcessor} from "../apis/CloudApi";

export interface CloudApiCloudPostRequest {
    /**
     * calls to manage the cloud-credentials
     * @type Cloud
     * @memberof CloudApicloudPost
     */
    cloud: Cloud
}

export class ObjectCloudApi {
    private api: ObservableCloudApi

    public constructor(configuration: Configuration, requestFactory?: CloudApiRequestFactory, responseProcessor?: CloudApiResponseProcessor) {
        this.api = new ObservableCloudApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * VerifyCredentials | ListCredentials | etc
     * @param param the request object
     */
    public cloudPost(param: CloudApiCloudPostRequest, options?: Configuration): Promise<void> {
        return this.api.cloudPost(param.cloud,  options).toPromise();
    }

}

import { ObservableClustersApi } from "./ObservableAPI";
import { ClustersApiRequestFactory, ClustersApiResponseProcessor} from "../apis/ClustersApi";

export interface ClustersApiClustersPostRequest {
    /**
     * Get cluster information
     * @type Clusters
     * @memberof ClustersApiclustersPost
     */
    clusters: Clusters
}

export class ObjectClustersApi {
    private api: ObservableClustersApi

    public constructor(configuration: Configuration, requestFactory?: ClustersApiRequestFactory, responseProcessor?: ClustersApiResponseProcessor) {
        this.api = new ObservableClustersApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * GetClusterInfo | Get/Set Config | etc
     * @param param the request object
     */
    public clustersPost(param: ClustersApiClustersPostRequest, options?: Configuration): Promise<void> {
        return this.api.clustersPost(param.clusters,  options).toPromise();
    }

}

import { ObservableConfigApi } from "./ObservableAPI";
import { ConfigApiRequestFactory, ConfigApiResponseProcessor} from "../apis/ConfigApi";

export interface ConfigApiConfigPostRequest {
    /**
     * Provides access to various Cmon configuration files
     * @type Config
     * @memberof ConfigApiconfigPost
     */
    config: Config
}

export class ObjectConfigApi {
    private api: ObservableConfigApi

    public constructor(configuration: Configuration, requestFactory?: ConfigApiRequestFactory, responseProcessor?: ConfigApiResponseProcessor) {
        this.api = new ObservableConfigApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * GetConfig | xxx | xxx | etc
     * @param param the request object
     */
    public configPost(param: ConfigApiConfigPostRequest, options?: Configuration): Promise<void> {
        return this.api.configPost(param.config,  options).toPromise();
    }

}

import { ObservableControllerApi } from "./ObservableAPI";
import { ControllerApiRequestFactory, ControllerApiResponseProcessor} from "../apis/ControllerApi";

export interface ControllerApiControllerPostRequest {
    /**
     * Managing controller and operate the Cmon HA subsystem
     * @type Controller
     * @memberof ControllerApicontrollerPost
     */
    controller: Controller
}

export class ObjectControllerApi {
    private api: ObservableControllerApi

    public constructor(configuration: Configuration, requestFactory?: ControllerApiRequestFactory, responseProcessor?: ControllerApiResponseProcessor) {
        this.api = new ObservableControllerApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Ping | Heartbeat | etc
     * @param param the request object
     */
    public controllerPost(param: ControllerApiControllerPostRequest, options?: Configuration): Promise<void> {
        return this.api.controllerPost(param.controller,  options).toPromise();
    }

}

import { ObservableDiscoveryApi } from "./ObservableAPI";
import { DiscoveryApiRequestFactory, DiscoveryApiResponseProcessor} from "../apis/DiscoveryApi";

export interface DiscoveryApiDiscoveryPostRequest {
    /**
     * All things related to Clusters and cluster Hosts
     * @type Discovery
     * @memberof DiscoveryApidiscoveryPost
     */
    discovery: Discovery
}

export class ObjectDiscoveryApi {
    private api: ObservableDiscoveryApi

    public constructor(configuration: Configuration, requestFactory?: DiscoveryApiRequestFactory, responseProcessor?: DiscoveryApiResponseProcessor) {
        this.api = new ObservableDiscoveryApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * CheckClusterName | CheckHosts | GetSupportedClusterTypes
     * @param param the request object
     */
    public discoveryPost(param: DiscoveryApiDiscoveryPostRequest, options?: Configuration): Promise<void> {
        return this.api.discoveryPost(param.discovery,  options).toPromise();
    }

}

import { ObservableHostApi } from "./ObservableAPI";
import { HostApiRequestFactory, HostApiResponseProcessor} from "../apis/HostApi";

export interface HostApiHostPostRequest {
    /**
     * (Un)Register servers, Shutdown servers, etc
     * @type Host
     * @memberof HostApihostPost
     */
    host: Host
}

export class ObjectHostApi {
    private api: ObservableHostApi

    public constructor(configuration: Configuration, requestFactory?: HostApiRequestFactory, responseProcessor?: HostApiResponseProcessor) {
        this.api = new ObservableHostApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Path for managing servers
     * @param param the request object
     */
    public hostPost(param: HostApiHostPostRequest, options?: Configuration): Promise<void> {
        return this.api.hostPost(param.host,  options).toPromise();
    }

}

import { ObservableJobsApi } from "./ObservableAPI";
import { JobsApiRequestFactory, JobsApiResponseProcessor} from "../apis/JobsApi";

export interface JobsApiJobsPostRequest {
    /**
     * Creating, manipulating, and obtaining information about jobs
     * @type Jobs
     * @memberof JobsApijobsPost
     */
    jobs: Jobs
}

export class ObjectJobsApi {
    private api: ObservableJobsApi

    public constructor(configuration: Configuration, requestFactory?: JobsApiRequestFactory, responseProcessor?: JobsApiResponseProcessor) {
        this.api = new ObservableJobsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * CreateJobInstance | etc
     * @param param the request object
     */
    public jobsPost(param: JobsApiJobsPostRequest, options?: Configuration): Promise<void> {
        return this.api.jobsPost(param.jobs,  options).toPromise();
    }

}

import { ObservableMaintenanceApi } from "./ObservableAPI";
import { MaintenanceApiRequestFactory, MaintenanceApiResponseProcessor} from "../apis/MaintenanceApi";

export interface MaintenanceApiMaintenancePostRequest {
    /**
     * Creating, deleting and obtaining maintenance periods
     * @type Maintenance
     * @memberof MaintenanceApimaintenancePost
     */
    maintenance: Maintenance
}

export class ObjectMaintenanceApi {
    private api: ObservableMaintenanceApi

    public constructor(configuration: Configuration, requestFactory?: MaintenanceApiRequestFactory, responseProcessor?: MaintenanceApiResponseProcessor) {
        this.api = new ObservableMaintenanceApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * CreateJobInstance | etc
     * @param param the request object
     */
    public maintenancePost(param: MaintenanceApiMaintenancePostRequest, options?: Configuration): Promise<void> {
        return this.api.maintenancePost(param.maintenance,  options).toPromise();
    }

}

import { ObservableReportsApi } from "./ObservableAPI";
import { ReportsApiRequestFactory, ReportsApiResponseProcessor} from "../apis/ReportsApi";

export interface ReportsApiReportsPostRequest {
    /**
     * Provides access to reports generated by the Cmon controller
     * @type Reports
     * @memberof ReportsApireportsPost
     */
    reports: Reports
}

export class ObjectReportsApi {
    private api: ObservableReportsApi

    public constructor(configuration: Configuration, requestFactory?: ReportsApiRequestFactory, responseProcessor?: ReportsApiResponseProcessor) {
        this.api = new ObservableReportsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * GenerateReport | etc
     * @param param the request object
     */
    public reportsPost(param: ReportsApiReportsPostRequest, options?: Configuration): Promise<void> {
        return this.api.reportsPost(param.reports,  options).toPromise();
    }

}

import { ObservableStatApi } from "./ObservableAPI";
import { StatApiRequestFactory, StatApiResponseProcessor} from "../apis/StatApi";

export interface StatApiStatPostRequest {
    /**
     * Provides calls to access various statistical information about the cluster
     * @type Stat
     * @memberof StatApistatPost
     */
    stat: Stat
}

export class ObjectStatApi {
    private api: ObservableStatApi

    public constructor(configuration: Configuration, requestFactory?: StatApiRequestFactory, responseProcessor?: StatApiResponseProcessor) {
        this.api = new ObservableStatApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * GetInfo | etc
     * @param param the request object
     */
    public statPost(param: StatApiStatPostRequest, options?: Configuration): Promise<void> {
        return this.api.statPost(param.stat,  options).toPromise();
    }

}

import { ObservableStatCmonAgentApi } from "./ObservableAPI";
import { StatCmonAgentApiRequestFactory, StatCmonAgentApiResponseProcessor} from "../apis/StatCmonAgentApi";

export interface StatCmonAgentApiStatCmonagentPostRequest {
    /**
     * Provides calls to access various statistical information about the cluster
     * @type StatCmonAgent
     * @memberof StatCmonAgentApistatCmonagentPost
     */
    statCmonAgent: StatCmonAgent
}

export class ObjectStatCmonAgentApi {
    private api: ObservableStatCmonAgentApi

    public constructor(configuration: Configuration, requestFactory?: StatCmonAgentApiRequestFactory, responseProcessor?: StatCmonAgentApiResponseProcessor) {
        this.api = new ObservableStatCmonAgentApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * GetInfo | etc
     * @param param the request object
     */
    public statCmonagentPost(param: StatCmonAgentApiStatCmonagentPostRequest, options?: Configuration): Promise<void> {
        return this.api.statCmonagentPost(param.statCmonAgent,  options).toPromise();
    }

}

import { ObservableStatPrometheusApi } from "./ObservableAPI";
import { StatPrometheusApiRequestFactory, StatPrometheusApiResponseProcessor} from "../apis/StatPrometheusApi";

export interface StatPrometheusApiStatPrometheusQueryPostRequest {
    /**
     * Provides calls to access various statistical information about the cluster
     * @type StatPrometheus
     * @memberof StatPrometheusApistatPrometheusQueryPost
     */
    statPrometheus: StatPrometheus
}

export class ObjectStatPrometheusApi {
    private api: ObservableStatPrometheusApi

    public constructor(configuration: Configuration, requestFactory?: StatPrometheusApiRequestFactory, responseProcessor?: StatPrometheusApiResponseProcessor) {
        this.api = new ObservableStatPrometheusApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * GetInfo | etc
     * @param param the request object
     */
    public statPrometheusQueryPost(param: StatPrometheusApiStatPrometheusQueryPostRequest, options?: Configuration): Promise<void> {
        return this.api.statPrometheusQueryPost(param.statPrometheus,  options).toPromise();
    }

}

import { ObservableUsersApi } from "./ObservableAPI";
import { UsersApiRequestFactory, UsersApiResponseProcessor} from "../apis/UsersApi";

export interface UsersApiUsersPostRequest {
    /**
     * Manipulate Cmon Users, users that are maintained by the Cmon controller
     * @type Users
     * @memberof UsersApiusersPost
     */
    users: Users
}

export class ObjectUsersApi {
    private api: ObservableUsersApi

    public constructor(configuration: Configuration, requestFactory?: UsersApiRequestFactory, responseProcessor?: UsersApiResponseProcessor) {
        this.api = new ObservableUsersApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * CreateUser | etc
     * @param param the request object
     */
    public usersPost(param: UsersApiUsersPostRequest, options?: Configuration): Promise<void> {
        return this.api.usersPost(param.users,  options).toPromise();
    }

}
