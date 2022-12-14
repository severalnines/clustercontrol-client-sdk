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

import { DiscoveryJobJobSpecJobDataNodes } from './DiscoveryJobJobSpecJobDataNodes';
import { HttpFile } from '../http/http';

export class DiscoveryJobJobSpecJobData {
    'clusterType'?: DiscoveryJobJobSpecJobDataClusterTypeEnum;
    'mysqlVersion'?: string;
    'vendor'?: string;
    'nodes'?: Array<DiscoveryJobJobSpecJobDataNodes>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "clusterType",
            "baseName": "cluster_type",
            "type": "DiscoveryJobJobSpecJobDataClusterTypeEnum",
            "format": ""
        },
        {
            "name": "mysqlVersion",
            "baseName": "mysql_version",
            "type": "string",
            "format": ""
        },
        {
            "name": "vendor",
            "baseName": "vendor",
            "type": "string",
            "format": ""
        },
        {
            "name": "nodes",
            "baseName": "nodes",
            "type": "Array<DiscoveryJobJobSpecJobDataNodes>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return DiscoveryJobJobSpecJobData.attributeTypeMap;
    }

    public constructor() {
    }
}


export type DiscoveryJobJobSpecJobDataClusterTypeEnum = "group_replication" ;

