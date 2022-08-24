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
 * The BackupScheduleJobJobDataVerifyBackup model module.
 * @module model/BackupScheduleJobJobDataVerifyBackup
 * @version 1.0.0
 */
class BackupScheduleJobJobDataVerifyBackup {
    /**
     * Constructs a new <code>BackupScheduleJobJobDataVerifyBackup</code>.
     * @alias module:model/BackupScheduleJobJobDataVerifyBackup
     */
    constructor() { 
        
        BackupScheduleJobJobDataVerifyBackup.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>BackupScheduleJobJobDataVerifyBackup</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/BackupScheduleJobJobDataVerifyBackup} obj Optional instance to populate.
     * @return {module:model/BackupScheduleJobJobDataVerifyBackup} The populated <code>BackupScheduleJobJobDataVerifyBackup</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BackupScheduleJobJobDataVerifyBackup();

            if (data.hasOwnProperty('disable_firewall')) {
                obj['disable_firewall'] = ApiClient.convertToType(data['disable_firewall'], 'Boolean');
            }
            if (data.hasOwnProperty('disable_selinux')) {
                obj['disable_selinux'] = ApiClient.convertToType(data['disable_selinux'], 'Boolean');
            }
            if (data.hasOwnProperty('install_software')) {
                obj['install_software'] = ApiClient.convertToType(data['install_software'], 'Boolean');
            }
            if (data.hasOwnProperty('server_address')) {
                obj['server_address'] = ApiClient.convertToType(data['server_address'], 'String');
            }
            if (data.hasOwnProperty('terminate_db_server')) {
                obj['terminate_db_server'] = ApiClient.convertToType(data['terminate_db_server'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * @member {Boolean} disable_firewall
 */
BackupScheduleJobJobDataVerifyBackup.prototype['disable_firewall'] = undefined;

/**
 * @member {Boolean} disable_selinux
 */
BackupScheduleJobJobDataVerifyBackup.prototype['disable_selinux'] = undefined;

/**
 * @member {Boolean} install_software
 */
BackupScheduleJobJobDataVerifyBackup.prototype['install_software'] = undefined;

/**
 * @member {String} server_address
 */
BackupScheduleJobJobDataVerifyBackup.prototype['server_address'] = undefined;

/**
 * @member {Boolean} terminate_db_server
 */
BackupScheduleJobJobDataVerifyBackup.prototype['terminate_db_server'] = undefined;






export default BackupScheduleJobJobDataVerifyBackup;

