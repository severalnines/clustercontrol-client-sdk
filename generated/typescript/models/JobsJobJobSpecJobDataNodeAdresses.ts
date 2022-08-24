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

import { HttpFile } from '../http/http';

export class JobsJobJobSpecJobDataNodeAdresses {
    'hostname'?: string;
    'maxConnection'?: number;
    'maxReplicationLag'?: number;
    'port'?: number;
    'weight'?: number;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "hostname",
            "baseName": "hostname",
            "type": "string",
            "format": ""
        },
        {
            "name": "maxConnection",
            "baseName": "max_connection",
            "type": "number",
            "format": ""
        },
        {
            "name": "maxReplicationLag",
            "baseName": "max_replication_lag",
            "type": "number",
            "format": ""
        },
        {
            "name": "port",
            "baseName": "port",
            "type": "number",
            "format": ""
        },
        {
            "name": "weight",
            "baseName": "weight",
            "type": "number",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return JobsJobJobSpecJobDataNodeAdresses.attributeTypeMap;
    }

    public constructor() {
    }
}

