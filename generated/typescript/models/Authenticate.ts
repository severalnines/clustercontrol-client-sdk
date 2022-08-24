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

export class Authenticate {
    'operation': AuthenticateOperationEnum;
    'userName'?: string;
    'password'?: string;
    'signature'?: string;
    'newPassword'?: string;
    'passwordResetToken'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "operation",
            "baseName": "operation",
            "type": "AuthenticateOperationEnum",
            "format": ""
        },
        {
            "name": "userName",
            "baseName": "user_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "password",
            "baseName": "password",
            "type": "string",
            "format": ""
        },
        {
            "name": "signature",
            "baseName": "signature",
            "type": "string",
            "format": ""
        },
        {
            "name": "newPassword",
            "baseName": "new_password",
            "type": "string",
            "format": ""
        },
        {
            "name": "passwordResetToken",
            "baseName": "password_reset_token",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Authenticate.attributeTypeMap;
    }

    public constructor() {
    }
}


export type AuthenticateOperationEnum = "authenticateWithPassword" | "authenticate" | "authenticateresponse" | "logout" | "passwordReset" | "newpassword" ;

