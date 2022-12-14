/**
 * Severalnines ClusterControl
 * This is a ...
 *
 * OpenAPI spec version: 1.0.0
 * Contact: sales@severalnines.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { JobsJobJobSpecJobData } from './JobsJobJobSpecJobData';
import { HttpFile } from '../http/http';

export class JobsJobJobSpec {
    'command'?: JobsJobJobSpecCommandEnum;
    'id'?: number;
    'jobData'?: JobsJobJobSpecJobData;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "command",
            "baseName": "command",
            "type": "JobsJobJobSpecCommandEnum",
            "format": ""
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number",
            "format": ""
        },
        {
            "name": "jobData",
            "baseName": "job_data",
            "type": "JobsJobJobSpecJobData",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return JobsJobJobSpec.attributeTypeMap;
    }

    public constructor() {
    }
}


export type JobsJobJobSpecCommandEnum = "rolling_restart" | "create_cluster" | "remove_cluster" | "backup" | "verify_backup" | "deploy_agents" | "pbmagent" | "addnode" | "pgbouncer" | "promote_replication_slave" | "setup_audit_logging" | "disable_recovery" | "enable_recovery" | "restart" | "enable_db_readonly" | "error_report" | "calculate_db_growth" | "enable_node_recovery" | "disable_node_recovery" | "check_pkg_upgrades" | "upgrade_cluster" | "success" | "add_replication_slave" | "deploy_cmonagents" ;

