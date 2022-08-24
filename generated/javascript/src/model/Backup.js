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
import BackupBackupRecord from './BackupBackupRecord';
import BackupSchedule from './BackupSchedule';

/**
 * The Backup model module.
 * @module model/Backup
 * @version 1.0.0
 */
class Backup {
    /**
     * Constructs a new <code>Backup</code>.
     * @alias module:model/Backup
     * @param operation {module:model/Backup.OperationEnum} 
     */
    constructor(operation) { 
        
        Backup.initialize(this, operation);
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
     * Constructs a <code>Backup</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Backup} obj Optional instance to populate.
     * @return {module:model/Backup} The populated <code>Backup</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Backup();

            if (data.hasOwnProperty('operation')) {
                obj['operation'] = ApiClient.convertToType(data['operation'], 'String');
            }
            if (data.hasOwnProperty('cluster_id')) {
                obj['cluster_id'] = ApiClient.convertToType(data['cluster_id'], 'Number');
            }
            if (data.hasOwnProperty('ascending')) {
                obj['ascending'] = ApiClient.convertToType(data['ascending'], 'Boolean');
            }
            if (data.hasOwnProperty('schedule')) {
                obj['schedule'] = BackupSchedule.constructFromObject(data['schedule']);
            }
            if (data.hasOwnProperty('backup_record')) {
                obj['backup_record'] = BackupBackupRecord.constructFromObject(data['backup_record']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/Backup.OperationEnum} operation
 */
Backup.prototype['operation'] = undefined;

/**
 * @member {Number} cluster_id
 */
Backup.prototype['cluster_id'] = undefined;

/**
 * @member {Boolean} ascending
 */
Backup.prototype['ascending'] = undefined;

/**
 * @member {module:model/BackupSchedule} schedule
 */
Backup.prototype['schedule'] = undefined;

/**
 * @member {module:model/BackupBackupRecord} backup_record
 */
Backup.prototype['backup_record'] = undefined;





/**
 * Allowed values for the <code>operation</code> property.
 * @enum {String}
 * @readonly
 */
Backup['OperationEnum'] = {

    /**
     * value: "getBackups"
     * @const
     */
    "getBackups": "getBackups",

    /**
     * value: "getBackupSchedules"
     * @const
     */
    "getBackupSchedules": "getBackupSchedules",

    /**
     * value: "scheduleBackup"
     * @const
     */
    "scheduleBackup": "scheduleBackup",

    /**
     * value: "deleteBackupRecord"
     * @const
     */
    "deleteBackupRecord": "deleteBackupRecord"
};



export default Backup;
