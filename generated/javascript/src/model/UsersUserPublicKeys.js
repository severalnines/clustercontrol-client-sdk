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

/**
 * The UsersUserPublicKeys model module.
 * @module model/UsersUserPublicKeys
 * @version 1.0.0
 */
class UsersUserPublicKeys {
    /**
     * Constructs a new <code>UsersUserPublicKeys</code>.
     * @alias module:model/UsersUserPublicKeys
     */
    constructor() { 
        
        UsersUserPublicKeys.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>UsersUserPublicKeys</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UsersUserPublicKeys} obj Optional instance to populate.
     * @return {module:model/UsersUserPublicKeys} The populated <code>UsersUserPublicKeys</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UsersUserPublicKeys();

            if (data.hasOwnProperty('key')) {
                obj['key'] = ApiClient.convertToType(data['key'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} key
 */
UsersUserPublicKeys.prototype['key'] = undefined;

/**
 * @member {String} name
 */
UsersUserPublicKeys.prototype['name'] = undefined;






export default UsersUserPublicKeys;

