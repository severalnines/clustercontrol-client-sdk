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

import { CloudCredentials } from './CloudCredentials';
import { HttpFile } from '../http/http';

export class Cloud {
    'operation': CloudOperationEnum;
    'provider'?: string;
    'name'?: string;
    'comment'?: string;
    'id'?: number;
    'credentials'?: CloudCredentials;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "operation",
            "baseName": "operation",
            "type": "CloudOperationEnum",
            "format": ""
        },
        {
            "name": "provider",
            "baseName": "provider",
            "type": "string",
            "format": ""
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "comment",
            "baseName": "comment",
            "type": "string",
            "format": ""
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number",
            "format": ""
        },
        {
            "name": "credentials",
            "baseName": "credentials",
            "type": "CloudCredentials",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Cloud.attributeTypeMap;
    }

    public constructor() {
    }
}


export type CloudOperationEnum = "verifyCredentials" | "listCredentials" | "getCredentials" | "addCredentials" | "updateCredentials" | "removeCredentials" ;

