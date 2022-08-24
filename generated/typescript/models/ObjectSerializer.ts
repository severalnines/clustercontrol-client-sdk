export * from './Alarm';
export * from './AlarmResponse';
export * from './Audit';
export * from './Authenticate';
export * from './Backup';
export * from './BackupBackupRecord';
export * from './BackupSchedule';
export * from './BackupScheduleJob';
export * from './BackupScheduleJobJobData';
export * from './BackupScheduleJobJobDataVerifyBackup';
export * from './Cloud';
export * from './CloudCredentials';
export * from './Clusters';
export * from './ClustersAccount';
export * from './ClustersConfiguration';
export * from './ClustersDatabase';
export * from './Config';
export * from './ConfigConfiguration';
export * from './ConfigLdapConfiguration';
export * from './ConfigLdapConfigurationGroupMappings';
export * from './ConfigLdapConfigurationLdapSettings';
export * from './ConfigLdapConfigurationSecurity';
export * from './Controller';
export * from './Discovery';
export * from './DiscoveryJob';
export * from './DiscoveryJobJobSpec';
export * from './DiscoveryJobJobSpecJobData';
export * from './DiscoveryJobJobSpecJobDataNodes';
export * from './DiscoveryNodes';
export * from './DiscoverySshCredentials';
export * from './Host';
export * from './HostHost';
export * from './HostServers';
export * from './Jobs';
export * from './JobsJob';
export * from './JobsJobJobSpec';
export * from './JobsJobJobSpecJobData';
export * from './JobsJobJobSpecJobDataConfigServers';
export * from './JobsJobJobSpecJobDataConfigServersMembers';
export * from './JobsJobJobSpecJobDataMembers';
export * from './JobsJobJobSpecJobDataNode';
export * from './JobsJobJobSpecJobDataNodeAdresses';
export * from './JobsJobJobSpecJobDataNodeConfiguration';
export * from './JobsJobJobSpecJobDataNodes';
export * from './JobsJobJobSpecJobDataReplicaSets';
export * from './JobsJobJobSpecJobDataTopology';
export * from './Maintenance';
export * from './Reports';
export * from './ReportsReport';
export * from './Stat';
export * from './StatCmonAgent';
export * from './StatCmonAgentRequestData';
export * from './StatPrometheus';
export * from './StatPrometheusQueries';
export * from './Users';
export * from './UsersGroup';
export * from './UsersUser';
export * from './UsersUserGroups';
export * from './UsersUserPublicKeys';

import { Alarm, AlarmOperationEnum    , AlarmClassNameEnum    } from './Alarm';
import { AlarmResponse, AlarmResponseOperationEnum    , AlarmResponseClassNameEnum    } from './AlarmResponse';
import { Audit, AuditOperationEnum     } from './Audit';
import { Authenticate, AuthenticateOperationEnum        } from './Authenticate';
import { Backup, BackupOperationEnum       } from './Backup';
import { BackupBackupRecord } from './BackupBackupRecord';
import { BackupSchedule, BackupScheduleClassNameEnum      } from './BackupSchedule';
import { BackupScheduleJob, BackupScheduleJobCommandEnum    } from './BackupScheduleJob';
import { BackupScheduleJobJobData  , BackupScheduleJobJobDataBackupFailoverHostEnum  , BackupScheduleJobJobDataBackupMethodEnum             } from './BackupScheduleJobJobData';
import { BackupScheduleJobJobDataVerifyBackup } from './BackupScheduleJobJobDataVerifyBackup';
import { Cloud, CloudOperationEnum        } from './Cloud';
import { CloudCredentials } from './CloudCredentials';
import { Clusters, ClustersOperationEnum              } from './Clusters';
import { ClustersAccount, ClustersAccountClassNameEnum         } from './ClustersAccount';
import { ClustersConfiguration } from './ClustersConfiguration';
import { ClustersDatabase, ClustersDatabaseClassNameEnum    } from './ClustersDatabase';
import { Config, ConfigOperationEnum        } from './Config';
import { ConfigConfiguration } from './ConfigConfiguration';
import { ConfigLdapConfiguration } from './ConfigLdapConfiguration';
import { ConfigLdapConfigurationGroupMappings } from './ConfigLdapConfigurationGroupMappings';
import { ConfigLdapConfigurationLdapSettings } from './ConfigLdapConfigurationLdapSettings';
import { ConfigLdapConfigurationSecurity } from './ConfigLdapConfigurationSecurity';
import { Controller, ControllerOperationEnum     } from './Controller';
import { Discovery, DiscoveryOperationEnum          } from './Discovery';
import { DiscoveryJob, DiscoveryJobClassNameEnum    } from './DiscoveryJob';
import { DiscoveryJobJobSpec, DiscoveryJobJobSpecCommandEnum    } from './DiscoveryJobJobSpec';
import { DiscoveryJobJobSpecJobData, DiscoveryJobJobSpecJobDataClusterTypeEnum      } from './DiscoveryJobJobSpecJobData';
import { DiscoveryJobJobSpecJobDataNodes, DiscoveryJobJobSpecJobDataNodesClassNameEnum    } from './DiscoveryJobJobSpecJobDataNodes';
import { DiscoveryNodes, DiscoveryNodesClassNameEnum     } from './DiscoveryNodes';
import { DiscoverySshCredentials } from './DiscoverySshCredentials';
import { Host, HostOperationEnum       } from './Host';
import { HostHost } from './HostHost';
import { HostServers, HostServersClassNameEnum     } from './HostServers';
import { Jobs, JobsOperationEnum           } from './Jobs';
import { JobsJob    , JobsJobTitleEnum  , JobsJobStatusEnum   } from './JobsJob';
import { JobsJobJobSpec, JobsJobJobSpecCommandEnum     } from './JobsJobJobSpec';
import { JobsJobJobSpecJobData, JobsJobJobSpecJobDataActionEnum       , JobsJobJobSpecJobDataArchiveModeEnum       , JobsJobJobSpecJobDataClusterTypeEnum     , JobsJobJobSpecJobDataBackupFailoverHostEnum  , JobsJobJobSpecJobDataBackupMethodEnum  , JobsJobJobSpecJobDataBackupMysqldumpTypeEnum                                                          , JobsJobJobSpecJobDataVendorEnum                       } from './JobsJobJobSpecJobData';
import { JobsJobJobSpecJobDataConfigServers } from './JobsJobJobSpecJobDataConfigServers';
import { JobsJobJobSpecJobDataConfigServersMembers } from './JobsJobJobSpecJobDataConfigServersMembers';
import { JobsJobJobSpecJobDataMembers } from './JobsJobJobSpecJobDataMembers';
import { JobsJobJobSpecJobDataNode } from './JobsJobJobSpecJobDataNode';
import { JobsJobJobSpecJobDataNodeAdresses } from './JobsJobJobSpecJobDataNodeAdresses';
import { JobsJobJobSpecJobDataNodeConfiguration , JobsJobJobSpecJobDataNodeConfigurationJobEnum    } from './JobsJobJobSpecJobDataNodeConfiguration';
import { JobsJobJobSpecJobDataNodes, JobsJobJobSpecJobDataNodesClassNameEnum      , JobsJobJobSpecJobDataNodesMaintenanceModeEnum              } from './JobsJobJobSpecJobDataNodes';
import { JobsJobJobSpecJobDataReplicaSets } from './JobsJobJobSpecJobDataReplicaSets';
import { JobsJobJobSpecJobDataTopology } from './JobsJobJobSpecJobDataTopology';
import { Maintenance, MaintenanceOperationEnum        } from './Maintenance';
import { Reports, ReportsOperationEnum     } from './Reports';
import { ReportsReport, ReportsReportClassNameEnum    , ReportsReportTextFormatEnum    } from './ReportsReport';
import { Stat, StatOperationEnum   , StatNameEnum       } from './Stat';
import { StatCmonAgent, StatCmonAgentOperationEnum   , StatCmonAgentClassNameEnum    } from './StatCmonAgent';
import { StatCmonAgentRequestData , StatCmonAgentRequestDataClassNameEnum      , StatCmonAgentRequestDataOriginEnum   } from './StatCmonAgentRequestData';
import { StatPrometheus, StatPrometheusOperationEnum          } from './StatPrometheus';
import { StatPrometheusQueries } from './StatPrometheusQueries';
import { Users, UsersOperationEnum           } from './Users';
import { UsersGroup, UsersGroupClassNameEnum    } from './UsersGroup';
import { UsersUser, UsersUserClassNameEnum          } from './UsersUser';
import { UsersUserGroups } from './UsersUserGroups';
import { UsersUserPublicKeys } from './UsersUserPublicKeys';

/* tslint:disable:no-unused-variable */
let primitives = [
                    "string",
                    "boolean",
                    "double",
                    "integer",
                    "long",
                    "float",
                    "number",
                    "any"
                 ];

const supportedMediaTypes: { [mediaType: string]: number } = {
  "application/json": Infinity,
  "application/octet-stream": 0,
  "application/x-www-form-urlencoded": 0
}


let enumsMap: Set<string> = new Set<string>([
    "AlarmOperationEnum",
    "AlarmClassNameEnum",
    "AlarmResponseOperationEnum",
    "AlarmResponseClassNameEnum",
    "AuditOperationEnum",
    "AuthenticateOperationEnum",
    "BackupOperationEnum",
    "BackupScheduleClassNameEnum",
    "BackupScheduleJobCommandEnum",
    "BackupScheduleJobJobDataBackupFailoverHostEnum",
    "BackupScheduleJobJobDataBackupMethodEnum",
    "CloudOperationEnum",
    "ClustersOperationEnum",
    "ClustersAccountClassNameEnum",
    "ClustersDatabaseClassNameEnum",
    "ConfigOperationEnum",
    "ControllerOperationEnum",
    "DiscoveryOperationEnum",
    "DiscoveryJobClassNameEnum",
    "DiscoveryJobJobSpecCommandEnum",
    "DiscoveryJobJobSpecJobDataClusterTypeEnum",
    "DiscoveryJobJobSpecJobDataNodesClassNameEnum",
    "DiscoveryNodesClassNameEnum",
    "HostOperationEnum",
    "HostServersClassNameEnum",
    "JobsOperationEnum",
    "JobsJobTitleEnum",
    "JobsJobStatusEnum",
    "JobsJobJobSpecCommandEnum",
    "JobsJobJobSpecJobDataActionEnum",
    "JobsJobJobSpecJobDataArchiveModeEnum",
    "JobsJobJobSpecJobDataClusterTypeEnum",
    "JobsJobJobSpecJobDataBackupFailoverHostEnum",
    "JobsJobJobSpecJobDataBackupMethodEnum",
    "JobsJobJobSpecJobDataBackupMysqldumpTypeEnum",
    "JobsJobJobSpecJobDataVendorEnum",
    "JobsJobJobSpecJobDataNodeConfigurationJobEnum",
    "JobsJobJobSpecJobDataNodesClassNameEnum",
    "JobsJobJobSpecJobDataNodesMaintenanceModeEnum",
    "MaintenanceOperationEnum",
    "ReportsOperationEnum",
    "ReportsReportClassNameEnum",
    "ReportsReportTextFormatEnum",
    "StatOperationEnum",
    "StatNameEnum",
    "StatCmonAgentOperationEnum",
    "StatCmonAgentClassNameEnum",
    "StatCmonAgentRequestDataClassNameEnum",
    "StatCmonAgentRequestDataOriginEnum",
    "StatPrometheusOperationEnum",
    "UsersOperationEnum",
    "UsersGroupClassNameEnum",
    "UsersUserClassNameEnum",
]);

let typeMap: {[index: string]: any} = {
    "Alarm": Alarm,
    "AlarmResponse": AlarmResponse,
    "Audit": Audit,
    "Authenticate": Authenticate,
    "Backup": Backup,
    "BackupBackupRecord": BackupBackupRecord,
    "BackupSchedule": BackupSchedule,
    "BackupScheduleJob": BackupScheduleJob,
    "BackupScheduleJobJobData": BackupScheduleJobJobData,
    "BackupScheduleJobJobDataVerifyBackup": BackupScheduleJobJobDataVerifyBackup,
    "Cloud": Cloud,
    "CloudCredentials": CloudCredentials,
    "Clusters": Clusters,
    "ClustersAccount": ClustersAccount,
    "ClustersConfiguration": ClustersConfiguration,
    "ClustersDatabase": ClustersDatabase,
    "Config": Config,
    "ConfigConfiguration": ConfigConfiguration,
    "ConfigLdapConfiguration": ConfigLdapConfiguration,
    "ConfigLdapConfigurationGroupMappings": ConfigLdapConfigurationGroupMappings,
    "ConfigLdapConfigurationLdapSettings": ConfigLdapConfigurationLdapSettings,
    "ConfigLdapConfigurationSecurity": ConfigLdapConfigurationSecurity,
    "Controller": Controller,
    "Discovery": Discovery,
    "DiscoveryJob": DiscoveryJob,
    "DiscoveryJobJobSpec": DiscoveryJobJobSpec,
    "DiscoveryJobJobSpecJobData": DiscoveryJobJobSpecJobData,
    "DiscoveryJobJobSpecJobDataNodes": DiscoveryJobJobSpecJobDataNodes,
    "DiscoveryNodes": DiscoveryNodes,
    "DiscoverySshCredentials": DiscoverySshCredentials,
    "Host": Host,
    "HostHost": HostHost,
    "HostServers": HostServers,
    "Jobs": Jobs,
    "JobsJob": JobsJob,
    "JobsJobJobSpec": JobsJobJobSpec,
    "JobsJobJobSpecJobData": JobsJobJobSpecJobData,
    "JobsJobJobSpecJobDataConfigServers": JobsJobJobSpecJobDataConfigServers,
    "JobsJobJobSpecJobDataConfigServersMembers": JobsJobJobSpecJobDataConfigServersMembers,
    "JobsJobJobSpecJobDataMembers": JobsJobJobSpecJobDataMembers,
    "JobsJobJobSpecJobDataNode": JobsJobJobSpecJobDataNode,
    "JobsJobJobSpecJobDataNodeAdresses": JobsJobJobSpecJobDataNodeAdresses,
    "JobsJobJobSpecJobDataNodeConfiguration": JobsJobJobSpecJobDataNodeConfiguration,
    "JobsJobJobSpecJobDataNodes": JobsJobJobSpecJobDataNodes,
    "JobsJobJobSpecJobDataReplicaSets": JobsJobJobSpecJobDataReplicaSets,
    "JobsJobJobSpecJobDataTopology": JobsJobJobSpecJobDataTopology,
    "Maintenance": Maintenance,
    "Reports": Reports,
    "ReportsReport": ReportsReport,
    "Stat": Stat,
    "StatCmonAgent": StatCmonAgent,
    "StatCmonAgentRequestData": StatCmonAgentRequestData,
    "StatPrometheus": StatPrometheus,
    "StatPrometheusQueries": StatPrometheusQueries,
    "Users": Users,
    "UsersGroup": UsersGroup,
    "UsersUser": UsersUser,
    "UsersUserGroups": UsersUserGroups,
    "UsersUserPublicKeys": UsersUserPublicKeys,
}

export class ObjectSerializer {
    public static findCorrectType(data: any, expectedType: string) {
        if (data == undefined) {
            return expectedType;
        } else if (primitives.indexOf(expectedType.toLowerCase()) !== -1) {
            return expectedType;
        } else if (expectedType === "Date") {
            return expectedType;
        } else {
            if (enumsMap.has(expectedType)) {
                return expectedType;
            }

            if (!typeMap[expectedType]) {
                return expectedType; // w/e we don't know the type
            }

            // Check the discriminator
            let discriminatorProperty = typeMap[expectedType].discriminator;
            if (discriminatorProperty == null) {
                return expectedType; // the type does not have a discriminator. use it.
            } else {
                if (data[discriminatorProperty]) {
                    var discriminatorType = data[discriminatorProperty];
                    if(typeMap[discriminatorType]){
                        return discriminatorType; // use the type given in the discriminator
                    } else {
                        return expectedType; // discriminator did not map to a type
                    }
                } else {
                    return expectedType; // discriminator was not present (or an empty string)
                }
            }
        }
    }

    public static serialize(data: any, type: string, format: string) {
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (type.lastIndexOf("Array<", 0) === 0) { // string.startsWith pre es6
            let subType: string = type.replace("Array<", ""); // Array<Type> => Type>
            subType = subType.substring(0, subType.length - 1); // Type> => Type
            let transformedData: any[] = [];
            for (let index in data) {
                let date = data[index];
                transformedData.push(ObjectSerializer.serialize(date, subType, format));
            }
            return transformedData;
        } else if (type === "Date") {
            if (format == "date") {
                let month = data.getMonth()+1
                month = month < 10 ? "0" + month.toString() : month.toString()
                let day = data.getDate();
                day = day < 10 ? "0" + day.toString() : day.toString();

                return data.getFullYear() + "-" + month + "-" + day;
            } else {
                return data.toISOString();
            }
        } else {
            if (enumsMap.has(type)) {
                return data;
            }
            if (!typeMap[type]) { // in case we dont know the type
                return data;
            }

            // Get the actual type of this object
            type = this.findCorrectType(data, type);

            // get the map for the correct type.
            let attributeTypes = typeMap[type].getAttributeTypeMap();
            let instance: {[index: string]: any} = {};
            for (let index in attributeTypes) {
                let attributeType = attributeTypes[index];
                instance[attributeType.baseName] = ObjectSerializer.serialize(data[attributeType.name], attributeType.type, attributeType.format);
            }
            return instance;
        }
    }

    public static deserialize(data: any, type: string, format: string) {
        // polymorphism may change the actual type.
        type = ObjectSerializer.findCorrectType(data, type);
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (type.lastIndexOf("Array<", 0) === 0) { // string.startsWith pre es6
            let subType: string = type.replace("Array<", ""); // Array<Type> => Type>
            subType = subType.substring(0, subType.length - 1); // Type> => Type
            let transformedData: any[] = [];
            for (let index in data) {
                let date = data[index];
                transformedData.push(ObjectSerializer.deserialize(date, subType, format));
            }
            return transformedData;
        } else if (type === "Date") {
            return new Date(data);
        } else {
            if (enumsMap.has(type)) {// is Enum
                return data;
            }

            if (!typeMap[type]) { // dont know the type
                return data;
            }
            let instance = new typeMap[type]();
            let attributeTypes = typeMap[type].getAttributeTypeMap();
            for (let index in attributeTypes) {
                let attributeType = attributeTypes[index];
                instance[attributeType.name] = ObjectSerializer.deserialize(data[attributeType.baseName], attributeType.type, attributeType.format);
            }
            return instance;
        }
    }


    /**
     * Normalize media type
     *
     * We currently do not handle any media types attributes, i.e. anything
     * after a semicolon. All content is assumed to be UTF-8 compatible.
     */
    public static normalizeMediaType(mediaType: string | undefined): string | undefined {
        if (mediaType === undefined) {
            return undefined;
        }
        return mediaType.split(";")[0].trim().toLowerCase();
    }

    /**
     * From a list of possible media types, choose the one we can handle best.
     *
     * The order of the given media types does not have any impact on the choice
     * made.
     */
    public static getPreferredMediaType(mediaTypes: Array<string>): string {
        /** According to OAS 3 we should default to json */
        if (!mediaTypes) {
            return "application/json";
        }

        const normalMediaTypes = mediaTypes.map(this.normalizeMediaType);
        let selectedMediaType: string | undefined = undefined;
        let selectedRank: number = -Infinity;
        for (const mediaType of normalMediaTypes) {
            if (supportedMediaTypes[mediaType!] > selectedRank) {
                selectedMediaType = mediaType;
                selectedRank = supportedMediaTypes[mediaType!];
            }
        }

        if (selectedMediaType === undefined) {
            throw new Error("None of the given media types are supported: " + mediaTypes.join(", "));
        }

        return selectedMediaType!;
    }

    /**
     * Convert data to a string according the given media type
     */
    public static stringify(data: any, mediaType: string): string {
        if (mediaType === "application/json") {
            return JSON.stringify(data);
        }

        throw new Error("The mediaType " + mediaType + " is not supported by ObjectSerializer.stringify.");
    }

    /**
     * Parse data from a string according to the given media type
     */
    public static parse(rawData: string, mediaType: string | undefined) {
        if (mediaType === undefined) {
            throw new Error("Cannot parse content. No Content-Type defined.");
        }

        if (mediaType === "application/json") {
            return JSON.parse(rawData);
        }

        throw new Error("The mediaType " + mediaType + " is not supported by ObjectSerializer.parse.");
    }
}
