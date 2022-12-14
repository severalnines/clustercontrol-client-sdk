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

import { BackupScheduleJob } from './BackupScheduleJob';
import { HttpFile } from '../http/http';

export class BackupSchedule {
    'className'?: BackupScheduleClassNameEnum;
    'enabled'?: boolean;
    'schedule'?: string;
    'job'?: BackupScheduleJob;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "className",
            "baseName": "class_name",
            "type": "BackupScheduleClassNameEnum",
            "format": ""
        },
        {
            "name": "enabled",
            "baseName": "enabled",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "schedule",
            "baseName": "schedule",
            "type": "string",
            "format": ""
        },
        {
            "name": "job",
            "baseName": "job",
            "type": "BackupScheduleJob",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return BackupSchedule.attributeTypeMap;
    }

    public constructor() {
    }
}


export type BackupScheduleClassNameEnum = "CmonBackupSchedule" ;

