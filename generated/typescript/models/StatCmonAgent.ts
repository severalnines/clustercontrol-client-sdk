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

import { StatCmonAgentRequestData } from './StatCmonAgentRequestData';
import { HttpFile } from '../http/http';

export class StatCmonAgent {
    'operation': StatCmonAgentOperationEnum;
    'apiKey'?: string;
    'className'?: StatCmonAgentClassNameEnum;
    'requestData'?: StatCmonAgentRequestData;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "operation",
            "baseName": "operation",
            "type": "StatCmonAgentOperationEnum",
            "format": ""
        },
        {
            "name": "apiKey",
            "baseName": "apiKey",
            "type": "string",
            "format": ""
        },
        {
            "name": "className",
            "baseName": "className",
            "type": "StatCmonAgentClassNameEnum",
            "format": ""
        },
        {
            "name": "requestData",
            "baseName": "requestData",
            "type": "StatCmonAgentRequestData",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return StatCmonAgent.attributeTypeMap;
    }

    public constructor() {
    }
}


export type StatCmonAgentOperationEnum = "/cmonagent" ;
export type StatCmonAgentClassNameEnum = "CmnRequest" ;

