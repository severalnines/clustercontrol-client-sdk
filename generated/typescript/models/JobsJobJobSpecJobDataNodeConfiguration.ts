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

export class JobsJobJobSpecJobDataNodeConfiguration {
    'arguments'?: string;
    'job'?: JobsJobJobSpecJobDataNodeConfigurationJobEnum;
    'scrapeInterval'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "arguments",
            "baseName": "arguments",
            "type": "string",
            "format": ""
        },
        {
            "name": "job",
            "baseName": "job",
            "type": "JobsJobJobSpecJobDataNodeConfigurationJobEnum",
            "format": ""
        },
        {
            "name": "scrapeInterval",
            "baseName": "scrape_interval",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return JobsJobJobSpecJobDataNodeConfiguration.attributeTypeMap;
    }

    public constructor() {
    }
}


export type JobsJobJobSpecJobDataNodeConfigurationJobEnum = "node" | "mysqld" | "mongo" ;

