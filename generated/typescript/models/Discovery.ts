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

import { DiscoveryJob } from './DiscoveryJob';
import { DiscoveryNodes } from './DiscoveryNodes';
import { DiscoverySshCredentials } from './DiscoverySshCredentials';
import { HttpFile } from '../http/http';

export class Discovery {
    'operation': DiscoveryOperationEnum;
    'newClusterName'?: string;
    'checkIfAlreadyRegistered'?: boolean;
    'checkJob'?: boolean;
    'checkSshSudo'?: boolean;
    'nodes'?: Array<DiscoveryNodes>;
    'job'?: DiscoveryJob;
    'sshCredentials'?: DiscoverySshCredentials;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "operation",
            "baseName": "operation",
            "type": "DiscoveryOperationEnum",
            "format": ""
        },
        {
            "name": "newClusterName",
            "baseName": "new_cluster_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "checkIfAlreadyRegistered",
            "baseName": "check_if_already_registered",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "checkJob",
            "baseName": "check_job",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "checkSshSudo",
            "baseName": "check_ssh_sudo",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "nodes",
            "baseName": "nodes",
            "type": "Array<DiscoveryNodes>",
            "format": ""
        },
        {
            "name": "job",
            "baseName": "job",
            "type": "DiscoveryJob",
            "format": ""
        },
        {
            "name": "sshCredentials",
            "baseName": "ssh_credentials",
            "type": "DiscoverySshCredentials",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Discovery.attributeTypeMap;
    }

    public constructor() {
    }
}


export type DiscoveryOperationEnum = "checkClusterName" | "getSupportedClusterTypes" | "checkHosts" ;
