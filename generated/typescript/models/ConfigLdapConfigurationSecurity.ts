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

export class ConfigLdapConfigurationSecurity {
    'caCertFile'?: string;
    'certFile'?: string;
    'keyFile'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "caCertFile",
            "baseName": "caCertFile",
            "type": "string",
            "format": ""
        },
        {
            "name": "certFile",
            "baseName": "certFile",
            "type": "string",
            "format": ""
        },
        {
            "name": "keyFile",
            "baseName": "keyFile",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ConfigLdapConfigurationSecurity.attributeTypeMap;
    }

    public constructor() {
    }
}
