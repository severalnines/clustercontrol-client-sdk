/**
 * Severalnines ClusterControl
 * This is a ...
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: sales@severalnines.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import CloudCredentials from './CloudCredentials';

/**
 * The Cloud model module.
 * @module model/Cloud
 * @version 1.0.0
 */
class Cloud {
    /**
     * Constructs a new <code>Cloud</code>.
     * @alias module:model/Cloud
     * @param operation {module:model/Cloud.OperationEnum} 
     */
    constructor(operation) { 
        
        Cloud.initialize(this, operation);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, operation) { 
        obj['operation'] = operation;
    }

    /**
     * Constructs a <code>Cloud</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Cloud} obj Optional instance to populate.
     * @return {module:model/Cloud} The populated <code>Cloud</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Cloud();

            if (data.hasOwnProperty('operation')) {
                obj['operation'] = ApiClient.convertToType(data['operation'], 'String');
            }
            if (data.hasOwnProperty('provider')) {
                obj['provider'] = ApiClient.convertToType(data['provider'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('comment')) {
                obj['comment'] = ApiClient.convertToType(data['comment'], 'String');
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('credentials')) {
                obj['credentials'] = CloudCredentials.constructFromObject(data['credentials']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/Cloud.OperationEnum} operation
 */
Cloud.prototype['operation'] = undefined;

/**
 * @member {String} provider
 */
Cloud.prototype['provider'] = undefined;

/**
 * @member {String} name
 */
Cloud.prototype['name'] = undefined;

/**
 * @member {String} comment
 */
Cloud.prototype['comment'] = undefined;

/**
 * @member {Number} id
 */
Cloud.prototype['id'] = undefined;

/**
 * @member {module:model/CloudCredentials} credentials
 */
Cloud.prototype['credentials'] = undefined;





/**
 * Allowed values for the <code>operation</code> property.
 * @enum {String}
 * @readonly
 */
Cloud['OperationEnum'] = {

    /**
     * value: "verifyCredentials"
     * @const
     */
    "verifyCredentials": "verifyCredentials",

    /**
     * value: "listCredentials"
     * @const
     */
    "listCredentials": "listCredentials",

    /**
     * value: "getCredentials"
     * @const
     */
    "getCredentials": "getCredentials",

    /**
     * value: "addCredentials"
     * @const
     */
    "addCredentials": "addCredentials",

    /**
     * value: "updateCredentials"
     * @const
     */
    "updateCredentials": "updateCredentials",

    /**
     * value: "removeCredentials"
     * @const
     */
    "removeCredentials": "removeCredentials"
};



export default Cloud;

