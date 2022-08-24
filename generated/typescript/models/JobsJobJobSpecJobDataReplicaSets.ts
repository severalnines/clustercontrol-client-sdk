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

import { JobsJobJobSpecJobDataMembers } from './JobsJobJobSpecJobDataMembers';
import { HttpFile } from '../http/http';

export class JobsJobJobSpecJobDataReplicaSets {
    'rs'?: string;
    'members'?: Array<JobsJobJobSpecJobDataMembers>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "rs",
            "baseName": "rs",
            "type": "string",
            "format": ""
        },
        {
            "name": "members",
            "baseName": "members",
            "type": "Array<JobsJobJobSpecJobDataMembers>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return JobsJobJobSpecJobDataReplicaSets.attributeTypeMap;
    }

    public constructor() {
    }
}

