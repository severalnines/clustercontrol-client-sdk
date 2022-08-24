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

export class StatCmonAgentRequestData {
    /**
    * e.g. \"2021-06-07T09:41:43.636Z\"
    */
    'begin'?: string;
    'className'?: StatCmonAgentRequestDataClassNameEnum;
    /**
    * e.g. \"2021-06-07T09:41:43.636Z\"
    */
    'end'?: string;
    'limit'?: number;
    'mimeType'?: string;
    'objectName'?: string;
    'origin'?: StatCmonAgentRequestDataOriginEnum;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "begin",
            "baseName": "begin",
            "type": "string",
            "format": ""
        },
        {
            "name": "className",
            "baseName": "className",
            "type": "StatCmonAgentRequestDataClassNameEnum",
            "format": ""
        },
        {
            "name": "end",
            "baseName": "end",
            "type": "string",
            "format": ""
        },
        {
            "name": "limit",
            "baseName": "limit",
            "type": "number",
            "format": ""
        },
        {
            "name": "mimeType",
            "baseName": "mimeType",
            "type": "string",
            "format": ""
        },
        {
            "name": "objectName",
            "baseName": "objectName",
            "type": "string",
            "format": ""
        },
        {
            "name": "origin",
            "baseName": "origin",
            "type": "StatCmonAgentRequestDataOriginEnum",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return StatCmonAgentRequestData.attributeTypeMap;
    }

    public constructor() {
    }
}


export type StatCmonAgentRequestDataClassNameEnum = "CmnReadParam" ;
export type StatCmonAgentRequestDataOriginEnum = "timeline" ;
