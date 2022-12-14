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

export class Maintenance {
    'operation': MaintenanceOperationEnum;
    'clusterId'?: number;
    'deadline'?: string;
    'initiate'?: string;
    'hostname'?: string;
    'UUID'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "operation",
            "baseName": "operation",
            "type": "MaintenanceOperationEnum",
            "format": ""
        },
        {
            "name": "clusterId",
            "baseName": "cluster_id",
            "type": "number",
            "format": ""
        },
        {
            "name": "deadline",
            "baseName": "deadline",
            "type": "string",
            "format": ""
        },
        {
            "name": "initiate",
            "baseName": "initiate",
            "type": "string",
            "format": ""
        },
        {
            "name": "hostname",
            "baseName": "hostname",
            "type": "string",
            "format": ""
        },
        {
            "name": "UUID",
            "baseName": "UUID",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Maintenance.attributeTypeMap;
    }

    public constructor() {
    }
}


export type MaintenanceOperationEnum = "addMaintenance" | "removeMaintenance" | "getMaintenance" | "getCurrentMaintenance" | "getNextMaintenance" ;

