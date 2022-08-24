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
 * The UsersUserGroups model module.
 * @module model/UsersUserGroups
 * @version 1.0.0
 */
class UsersUserGroups {
    /**
     * Constructs a new <code>UsersUserGroups</code>.
     * @alias module:model/UsersUserGroups
     */
    constructor() { 
        
        UsersUserGroups.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>UsersUserGroups</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UsersUserGroups} obj Optional instance to populate.
     * @return {module:model/UsersUserGroups} The populated <code>UsersUserGroups</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UsersUserGroups();

            if (data.hasOwnProperty('class_name')) {
                obj['class_name'] = ApiClient.convertToType(data['class_name'], 'String');
            }
            if (data.hasOwnProperty('group_name')) {
                obj['group_name'] = ApiClient.convertToType(data['group_name'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} class_name
 */
UsersUserGroups.prototype['class_name'] = undefined;

/**
 * @member {String} group_name
 */
UsersUserGroups.prototype['group_name'] = undefined;






export default UsersUserGroups;
