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
 * The ConfigLdapConfigurationSecurity model module.
 * @module model/ConfigLdapConfigurationSecurity
 * @version 1.0.0
 */
class ConfigLdapConfigurationSecurity {
    /**
     * Constructs a new <code>ConfigLdapConfigurationSecurity</code>.
     * @alias module:model/ConfigLdapConfigurationSecurity
     */
    constructor() { 
        
        ConfigLdapConfigurationSecurity.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ConfigLdapConfigurationSecurity</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ConfigLdapConfigurationSecurity} obj Optional instance to populate.
     * @return {module:model/ConfigLdapConfigurationSecurity} The populated <code>ConfigLdapConfigurationSecurity</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ConfigLdapConfigurationSecurity();

            if (data.hasOwnProperty('caCertFile')) {
                obj['caCertFile'] = ApiClient.convertToType(data['caCertFile'], 'String');
            }
            if (data.hasOwnProperty('certFile')) {
                obj['certFile'] = ApiClient.convertToType(data['certFile'], 'String');
            }
            if (data.hasOwnProperty('keyFile')) {
                obj['keyFile'] = ApiClient.convertToType(data['keyFile'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} caCertFile
 */
ConfigLdapConfigurationSecurity.prototype['caCertFile'] = undefined;

/**
 * @member {String} certFile
 */
ConfigLdapConfigurationSecurity.prototype['certFile'] = undefined;

/**
 * @member {String} keyFile
 */
ConfigLdapConfigurationSecurity.prototype['keyFile'] = undefined;






export default ConfigLdapConfigurationSecurity;
