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

import { BackupScheduleJobJobData } from './BackupScheduleJobJobData';
import { HttpFile } from '../http/http';

export class BackupScheduleJob {
    'command'?: BackupScheduleJobCommandEnum;
    'jobData'?: BackupScheduleJobJobData;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "command",
            "baseName": "command",
            "type": "BackupScheduleJobCommandEnum",
            "format": ""
        },
        {
            "name": "jobData",
            "baseName": "job_data",
            "type": "BackupScheduleJobJobData",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return BackupScheduleJob.attributeTypeMap;
    }

    public constructor() {
    }
}


export type BackupScheduleJobCommandEnum = "backup" ;

