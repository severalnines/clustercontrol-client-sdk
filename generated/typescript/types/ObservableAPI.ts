import { ResponseContext, RequestContext, HttpFile } from '../http/http';
import * as models from '../models/all';
import { Configuration} from '../configuration'
import { Observable, of, from } from '../rxjsStub';
import {mergeMap, map} from  '../rxjsStub';
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

import { AlarmsApiRequestFactory, AlarmsApiResponseProcessor} from "../apis/AlarmsApi";
export class ObservableAlarmsApi {
    private requestFactory: AlarmsApiRequestFactory;
    private responseProcessor: AlarmsApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: AlarmsApiRequestFactory,
        responseProcessor?: AlarmsApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new AlarmsApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new AlarmsApiResponseProcessor();
    }

    /**
     * GetStatistics | GetAlarm | GetAlarms | IgnoreAlarm
     * @param alarm All things related to Alarms and Stats
     */
    public alarmPost(alarm: Alarm, _options?: Configuration): Observable<AlarmResponse> {
        const requestContextPromise = this.requestFactory.alarmPost(alarm, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.alarmPost(rsp)));
            }));
    }

}

import { AuditApiRequestFactory, AuditApiResponseProcessor} from "../apis/AuditApi";
export class ObservableAuditApi {
    private requestFactory: AuditApiRequestFactory;
    private responseProcessor: AuditApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: AuditApiRequestFactory,
        responseProcessor?: AuditApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new AuditApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new AuditApiResponseProcessor();
    }

    /**
     * GetStatistics | GetAlarm | GetAlarms | IgnoreAlarm
     * @param audit Used to get the audit log entries
     */
    public auditPost(audit: Audit, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.auditPost(audit, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.auditPost(rsp)));
            }));
    }

}

import { AuthApiRequestFactory, AuthApiResponseProcessor} from "../apis/AuthApi";
export class ObservableAuthApi {
    private requestFactory: AuthApiRequestFactory;
    private responseProcessor: AuthApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: AuthApiRequestFactory,
        responseProcessor?: AuthApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new AuthApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new AuthApiResponseProcessor();
    }

    /**
     * Authenticate | Logout | Password Reset | Authenticate response (with challenge)
     * @param authenticate Authentication parameters
     */
    public authPost(authenticate: Authenticate, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.authPost(authenticate, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.authPost(rsp)));
            }));
    }

}

import { BackupApiRequestFactory, BackupApiResponseProcessor} from "../apis/BackupApi";
export class ObservableBackupApi {
    private requestFactory: BackupApiRequestFactory;
    private responseProcessor: BackupApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: BackupApiRequestFactory,
        responseProcessor?: BackupApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new BackupApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new BackupApiResponseProcessor();
    }

    /**
     * GetBackups | GetBackupSchedules | ScheduleBackup | DeleteBackupRecord
     * @param backup All things related to Backups
     */
    public backupPost(backup: Backup, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.backupPost(backup, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.backupPost(rsp)));
            }));
    }

}

import { CloudApiRequestFactory, CloudApiResponseProcessor} from "../apis/CloudApi";
export class ObservableCloudApi {
    private requestFactory: CloudApiRequestFactory;
    private responseProcessor: CloudApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: CloudApiRequestFactory,
        responseProcessor?: CloudApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new CloudApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new CloudApiResponseProcessor();
    }

    /**
     * VerifyCredentials | ListCredentials | etc
     * @param cloud calls to manage the cloud-credentials
     */
    public cloudPost(cloud: Cloud, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.cloudPost(cloud, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.cloudPost(rsp)));
            }));
    }

}

import { ClustersApiRequestFactory, ClustersApiResponseProcessor} from "../apis/ClustersApi";
export class ObservableClustersApi {
    private requestFactory: ClustersApiRequestFactory;
    private responseProcessor: ClustersApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: ClustersApiRequestFactory,
        responseProcessor?: ClustersApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new ClustersApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new ClustersApiResponseProcessor();
    }

    /**
     * GetClusterInfo | Get/Set Config | etc
     * @param clusters Get cluster information
     */
    public clustersPost(clusters: Clusters, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.clustersPost(clusters, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.clustersPost(rsp)));
            }));
    }

}

import { ConfigApiRequestFactory, ConfigApiResponseProcessor} from "../apis/ConfigApi";
export class ObservableConfigApi {
    private requestFactory: ConfigApiRequestFactory;
    private responseProcessor: ConfigApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: ConfigApiRequestFactory,
        responseProcessor?: ConfigApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new ConfigApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new ConfigApiResponseProcessor();
    }

    /**
     * GetConfig | xxx | xxx | etc
     * @param config Provides access to various Cmon configuration files
     */
    public configPost(config: Config, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.configPost(config, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.configPost(rsp)));
            }));
    }

}

import { ControllerApiRequestFactory, ControllerApiResponseProcessor} from "../apis/ControllerApi";
export class ObservableControllerApi {
    private requestFactory: ControllerApiRequestFactory;
    private responseProcessor: ControllerApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: ControllerApiRequestFactory,
        responseProcessor?: ControllerApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new ControllerApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new ControllerApiResponseProcessor();
    }

    /**
     * Ping | Heartbeat | etc
     * @param controller Managing controller and operate the Cmon HA subsystem
     */
    public controllerPost(controller: Controller, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.controllerPost(controller, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.controllerPost(rsp)));
            }));
    }

}

import { DiscoveryApiRequestFactory, DiscoveryApiResponseProcessor} from "../apis/DiscoveryApi";
export class ObservableDiscoveryApi {
    private requestFactory: DiscoveryApiRequestFactory;
    private responseProcessor: DiscoveryApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: DiscoveryApiRequestFactory,
        responseProcessor?: DiscoveryApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new DiscoveryApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new DiscoveryApiResponseProcessor();
    }

    /**
     * CheckClusterName | CheckHosts | GetSupportedClusterTypes
     * @param discovery All things related to Clusters and cluster Hosts
     */
    public discoveryPost(discovery: Discovery, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.discoveryPost(discovery, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.discoveryPost(rsp)));
            }));
    }

}

import { HostApiRequestFactory, HostApiResponseProcessor} from "../apis/HostApi";
export class ObservableHostApi {
    private requestFactory: HostApiRequestFactory;
    private responseProcessor: HostApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: HostApiRequestFactory,
        responseProcessor?: HostApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new HostApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new HostApiResponseProcessor();
    }

    /**
     * Path for managing servers
     * @param host (Un)Register servers, Shutdown servers, etc
     */
    public hostPost(host: Host, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.hostPost(host, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.hostPost(rsp)));
            }));
    }

}

import { JobsApiRequestFactory, JobsApiResponseProcessor} from "../apis/JobsApi";
export class ObservableJobsApi {
    private requestFactory: JobsApiRequestFactory;
    private responseProcessor: JobsApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: JobsApiRequestFactory,
        responseProcessor?: JobsApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new JobsApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new JobsApiResponseProcessor();
    }

    /**
     * CreateJobInstance | etc
     * @param jobs Creating, manipulating, and obtaining information about jobs
     */
    public jobsPost(jobs: Jobs, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.jobsPost(jobs, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.jobsPost(rsp)));
            }));
    }

}

import { MaintenanceApiRequestFactory, MaintenanceApiResponseProcessor} from "../apis/MaintenanceApi";
export class ObservableMaintenanceApi {
    private requestFactory: MaintenanceApiRequestFactory;
    private responseProcessor: MaintenanceApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: MaintenanceApiRequestFactory,
        responseProcessor?: MaintenanceApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new MaintenanceApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new MaintenanceApiResponseProcessor();
    }

    /**
     * CreateJobInstance | etc
     * @param maintenance Creating, deleting and obtaining maintenance periods
     */
    public maintenancePost(maintenance: Maintenance, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.maintenancePost(maintenance, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.maintenancePost(rsp)));
            }));
    }

}

import { ReportsApiRequestFactory, ReportsApiResponseProcessor} from "../apis/ReportsApi";
export class ObservableReportsApi {
    private requestFactory: ReportsApiRequestFactory;
    private responseProcessor: ReportsApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: ReportsApiRequestFactory,
        responseProcessor?: ReportsApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new ReportsApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new ReportsApiResponseProcessor();
    }

    /**
     * GenerateReport | etc
     * @param reports Provides access to reports generated by the Cmon controller
     */
    public reportsPost(reports: Reports, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.reportsPost(reports, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.reportsPost(rsp)));
            }));
    }

}

import { StatApiRequestFactory, StatApiResponseProcessor} from "../apis/StatApi";
export class ObservableStatApi {
    private requestFactory: StatApiRequestFactory;
    private responseProcessor: StatApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: StatApiRequestFactory,
        responseProcessor?: StatApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new StatApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new StatApiResponseProcessor();
    }

    /**
     * GetInfo | etc
     * @param stat Provides calls to access various statistical information about the cluster
     */
    public statPost(stat: Stat, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.statPost(stat, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.statPost(rsp)));
            }));
    }

}

import { StatCmonAgentApiRequestFactory, StatCmonAgentApiResponseProcessor} from "../apis/StatCmonAgentApi";
export class ObservableStatCmonAgentApi {
    private requestFactory: StatCmonAgentApiRequestFactory;
    private responseProcessor: StatCmonAgentApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: StatCmonAgentApiRequestFactory,
        responseProcessor?: StatCmonAgentApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new StatCmonAgentApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new StatCmonAgentApiResponseProcessor();
    }

    /**
     * GetInfo | etc
     * @param statCmonAgent Provides calls to access various statistical information about the cluster
     */
    public statCmonagentPost(statCmonAgent: StatCmonAgent, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.statCmonagentPost(statCmonAgent, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.statCmonagentPost(rsp)));
            }));
    }

}

import { StatPrometheusApiRequestFactory, StatPrometheusApiResponseProcessor} from "../apis/StatPrometheusApi";
export class ObservableStatPrometheusApi {
    private requestFactory: StatPrometheusApiRequestFactory;
    private responseProcessor: StatPrometheusApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: StatPrometheusApiRequestFactory,
        responseProcessor?: StatPrometheusApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new StatPrometheusApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new StatPrometheusApiResponseProcessor();
    }

    /**
     * GetInfo | etc
     * @param statPrometheus Provides calls to access various statistical information about the cluster
     */
    public statPrometheusQueryPost(statPrometheus: StatPrometheus, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.statPrometheusQueryPost(statPrometheus, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.statPrometheusQueryPost(rsp)));
            }));
    }

}

import { UsersApiRequestFactory, UsersApiResponseProcessor} from "../apis/UsersApi";
export class ObservableUsersApi {
    private requestFactory: UsersApiRequestFactory;
    private responseProcessor: UsersApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: UsersApiRequestFactory,
        responseProcessor?: UsersApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new UsersApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new UsersApiResponseProcessor();
    }

    /**
     * CreateUser | etc
     * @param users Manipulate Cmon Users, users that are maintained by the Cmon controller
     */
    public usersPost(users: Users, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.usersPost(users, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.usersPost(rsp)));
            }));
    }

}
