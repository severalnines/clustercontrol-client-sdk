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
 * The HostServers model module.
 * @module model/HostServers
 * @version 1.0.0
 */
class HostServers {
    /**
     * Constructs a new <code>HostServers</code>.
     * @alias module:model/HostServers
     */
    constructor() { 
        
        HostServers.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>HostServers</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/HostServers} obj Optional instance to populate.
     * @return {module:model/HostServers} The populated <code>HostServers</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new HostServers();

            if (data.hasOwnProperty('class_name')) {
                obj['class_name'] = ApiClient.convertToType(data['class_name'], 'String');
            }
            if (data.hasOwnProperty('hostname')) {
                obj['hostname'] = ApiClient.convertToType(data['hostname'], 'String');
            }
            if (data.hasOwnProperty('cdt_path')) {
                obj['cdt_path'] = ApiClient.convertToType(data['cdt_path'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/HostServers.ClassNameEnum} class_name
 */
HostServers.prototype['class_name'] = undefined;

/**
 * @member {String} hostname
 */
HostServers.prototype['hostname'] = undefined;

/**
 * @member {String} cdt_path
 */
HostServers.prototype['cdt_path'] = undefined;





/**
 * Allowed values for the <code>class_name</code> property.
 * @enum {String}
 * @readonly
 */
HostServers['ClassNameEnum'] = {

    /**
     * value: "CmonContainerServer"
     * @const
     */
    "CmonContainerServer": "CmonContainerServer"
};



export default HostServers;

