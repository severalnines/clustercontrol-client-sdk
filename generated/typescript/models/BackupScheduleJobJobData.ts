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

import { BackupScheduleJobJobDataVerifyBackup } from './BackupScheduleJobJobDataVerifyBackup';
import { HttpFile } from '../http/http';

export class BackupScheduleJobJobData {
    'description'?: string;
    'backupFailover'?: boolean;
    'backupFailoverHost'?: BackupScheduleJobJobDataBackupFailoverHostEnum;
    'backupMethod'?: BackupScheduleJobJobDataBackupMethodEnum;
    'backupRetention'?: number;
    'backupdir'?: string;
    'backupsubdir'?: string;
    'ccStorage'?: string;
    'compression'?: boolean;
    'compresionLevel'?: number;
    'hostname'?: string;
    'port'?: number;
    'verifyBackupDelay'?: number;
    'verifyBackup'?: BackupScheduleJobJobDataVerifyBackup;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "description",
            "baseName": "description",
            "type": "string",
            "format": ""
        },
        {
            "name": "backupFailover",
            "baseName": "backup_failover",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "backupFailoverHost",
            "baseName": "backup_failover_host",
            "type": "BackupScheduleJobJobDataBackupFailoverHostEnum",
            "format": ""
        },
        {
            "name": "backupMethod",
            "baseName": "backup_method",
            "type": "BackupScheduleJobJobDataBackupMethodEnum",
            "format": ""
        },
        {
            "name": "backupRetention",
            "baseName": "backup_retention",
            "type": "number",
            "format": ""
        },
        {
            "name": "backupdir",
            "baseName": "backupdir",
            "type": "string",
            "format": ""
        },
        {
            "name": "backupsubdir",
            "baseName": "backupsubdir",
            "type": "string",
            "format": ""
        },
        {
            "name": "ccStorage",
            "baseName": "cc_storage",
            "type": "string",
            "format": ""
        },
        {
            "name": "compression",
            "baseName": "compression",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "compresionLevel",
            "baseName": "compresion_level",
            "type": "number",
            "format": ""
        },
        {
            "name": "hostname",
            "baseName": "hostname",
            "type": "string",
            "format": ""
        },
        {
            "name": "port",
            "baseName": "port",
            "type": "number",
            "format": ""
        },
        {
            "name": "verifyBackupDelay",
            "baseName": "verify_backup_delay",
            "type": "number",
            "format": ""
        },
        {
            "name": "verifyBackup",
            "baseName": "verify_backup",
            "type": "BackupScheduleJobJobDataVerifyBackup",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return BackupScheduleJobJobData.attributeTypeMap;
    }

    public constructor() {
    }
}


export type BackupScheduleJobJobDataBackupFailoverHostEnum = "auto" ;
export type BackupScheduleJobJobDataBackupMethodEnum = "pg_basebackup" ;
