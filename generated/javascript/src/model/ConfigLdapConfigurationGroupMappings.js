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
 * The ConfigLdapConfigurationGroupMappings model module.
 * @module model/ConfigLdapConfigurationGroupMappings
 * @version 1.0.0
 */
class ConfigLdapConfigurationGroupMappings {
    /**
     * Constructs a new <code>ConfigLdapConfigurationGroupMappings</code>.
     * @alias module:model/ConfigLdapConfigurationGroupMappings
     */
    constructor() { 
        
        ConfigLdapConfigurationGroupMappings.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ConfigLdapConfigurationGroupMappings</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ConfigLdapConfigurationGroupMappings} obj Optional instance to populate.
     * @return {module:model/ConfigLdapConfigurationGroupMappings} The populated <code>ConfigLdapConfigurationGroupMappings</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ConfigLdapConfigurationGroupMappings();

            if (data.hasOwnProperty('cmonGroupName')) {
                obj['cmonGroupName'] = ApiClient.convertToType(data['cmonGroupName'], 'String');
            }
            if (data.hasOwnProperty('ldapGroupId')) {
                obj['ldapGroupId'] = ApiClient.convertToType(data['ldapGroupId'], 'String');
            }
            if (data.hasOwnProperty('sectionName')) {
                obj['sectionName'] = ApiClient.convertToType(data['sectionName'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} cmonGroupName
 */
ConfigLdapConfigurationGroupMappings.prototype['cmonGroupName'] = undefined;

/**
 * @member {String} ldapGroupId
 */
ConfigLdapConfigurationGroupMappings.prototype['ldapGroupId'] = undefined;

/**
 * @member {String} sectionName
 */
ConfigLdapConfigurationGroupMappings.prototype['sectionName'] = undefined;






export default ConfigLdapConfigurationGroupMappings;

