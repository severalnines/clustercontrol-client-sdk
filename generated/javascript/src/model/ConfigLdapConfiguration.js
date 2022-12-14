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
import ConfigLdapConfigurationGroupMappings from './ConfigLdapConfigurationGroupMappings';
import ConfigLdapConfigurationLdapSettings from './ConfigLdapConfigurationLdapSettings';
import ConfigLdapConfigurationSecurity from './ConfigLdapConfigurationSecurity';

/**
 * The ConfigLdapConfiguration model module.
 * @module model/ConfigLdapConfiguration
 * @version 1.0.0
 */
class ConfigLdapConfiguration {
    /**
     * Constructs a new <code>ConfigLdapConfiguration</code>.
     * @alias module:model/ConfigLdapConfiguration
     */
    constructor() { 
        
        ConfigLdapConfiguration.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ConfigLdapConfiguration</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ConfigLdapConfiguration} obj Optional instance to populate.
     * @return {module:model/ConfigLdapConfiguration} The populated <code>ConfigLdapConfiguration</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ConfigLdapConfiguration();

            if (data.hasOwnProperty('enabled')) {
                obj['enabled'] = ApiClient.convertToType(data['enabled'], 'Boolean');
            }
            if (data.hasOwnProperty('ldapAdminPassword')) {
                obj['ldapAdminPassword'] = ApiClient.convertToType(data['ldapAdminPassword'], 'String');
            }
            if (data.hasOwnProperty('ldapAdminUser')) {
                obj['ldapAdminUser'] = ApiClient.convertToType(data['ldapAdminUser'], 'String');
            }
            if (data.hasOwnProperty('ldapGroupSearchRoot')) {
                obj['ldapGroupSearchRoot'] = ApiClient.convertToType(data['ldapGroupSearchRoot'], 'String');
            }
            if (data.hasOwnProperty('ldapServerUri')) {
                obj['ldapServerUri'] = ApiClient.convertToType(data['ldapServerUri'], 'String');
            }
            if (data.hasOwnProperty('ldapUserSearchRoot')) {
                obj['ldapUserSearchRoot'] = ApiClient.convertToType(data['ldapUserSearchRoot'], 'String');
            }
            if (data.hasOwnProperty('groupMappings')) {
                obj['groupMappings'] = ApiClient.convertToType(data['groupMappings'], [ConfigLdapConfigurationGroupMappings]);
            }
            if (data.hasOwnProperty('ldapSettings')) {
                obj['ldapSettings'] = ConfigLdapConfigurationLdapSettings.constructFromObject(data['ldapSettings']);
            }
            if (data.hasOwnProperty('security')) {
                obj['security'] = ConfigLdapConfigurationSecurity.constructFromObject(data['security']);
            }
        }
        return obj;
    }


}

/**
 * @member {Boolean} enabled
 */
ConfigLdapConfiguration.prototype['enabled'] = undefined;

/**
 * @member {String} ldapAdminPassword
 */
ConfigLdapConfiguration.prototype['ldapAdminPassword'] = undefined;

/**
 * @member {String} ldapAdminUser
 */
ConfigLdapConfiguration.prototype['ldapAdminUser'] = undefined;

/**
 * @member {String} ldapGroupSearchRoot
 */
ConfigLdapConfiguration.prototype['ldapGroupSearchRoot'] = undefined;

/**
 * @member {String} ldapServerUri
 */
ConfigLdapConfiguration.prototype['ldapServerUri'] = undefined;

/**
 * @member {String} ldapUserSearchRoot
 */
ConfigLdapConfiguration.prototype['ldapUserSearchRoot'] = undefined;

/**
 * @member {Array.<module:model/ConfigLdapConfigurationGroupMappings>} groupMappings
 */
ConfigLdapConfiguration.prototype['groupMappings'] = undefined;

/**
 * @member {module:model/ConfigLdapConfigurationLdapSettings} ldapSettings
 */
ConfigLdapConfiguration.prototype['ldapSettings'] = undefined;

/**
 * @member {module:model/ConfigLdapConfigurationSecurity} security
 */
ConfigLdapConfiguration.prototype['security'] = undefined;






export default ConfigLdapConfiguration;

