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
import JobsJobJobSpecJobData from './JobsJobJobSpecJobData';

/**
 * The JobsJobJobSpec model module.
 * @module model/JobsJobJobSpec
 * @version 1.0.0
 */
class JobsJobJobSpec {
    /**
     * Constructs a new <code>JobsJobJobSpec</code>.
     * @alias module:model/JobsJobJobSpec
     */
    constructor() { 
        
        JobsJobJobSpec.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>JobsJobJobSpec</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/JobsJobJobSpec} obj Optional instance to populate.
     * @return {module:model/JobsJobJobSpec} The populated <code>JobsJobJobSpec</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new JobsJobJobSpec();

            if (data.hasOwnProperty('command')) {
                obj['command'] = ApiClient.convertToType(data['command'], 'String');
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('job_data')) {
                obj['job_data'] = JobsJobJobSpecJobData.constructFromObject(data['job_data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/JobsJobJobSpec.CommandEnum} command
 */
JobsJobJobSpec.prototype['command'] = undefined;

/**
 * @member {Number} id
 */
JobsJobJobSpec.prototype['id'] = undefined;

/**
 * @member {module:model/JobsJobJobSpecJobData} job_data
 */
JobsJobJobSpec.prototype['job_data'] = undefined;





/**
 * Allowed values for the <code>command</code> property.
 * @enum {String}
 * @readonly
 */
JobsJobJobSpec['CommandEnum'] = {

    /**
     * value: "rolling_restart"
     * @const
     */
    "rolling_restart": "rolling_restart",

    /**
     * value: "create_cluster"
     * @const
     */
    "create_cluster": "create_cluster",

    /**
     * value: "remove_cluster"
     * @const
     */
    "remove_cluster": "remove_cluster",

    /**
     * value: "backup"
     * @const
     */
    "backup": "backup",

    /**
     * value: "verify_backup"
     * @const
     */
    "verify_backup": "verify_backup",

    /**
     * value: "deploy_agents"
     * @const
     */
    "deploy_agents": "deploy_agents",

    /**
     * value: "pbmagent"
     * @const
     */
    "pbmagent": "pbmagent",

    /**
     * value: "addnode"
     * @const
     */
    "addnode": "addnode",

    /**
     * value: "pgbouncer"
     * @const
     */
    "pgbouncer": "pgbouncer",

    /**
     * value: "promote_replication_slave"
     * @const
     */
    "promote_replication_slave": "promote_replication_slave",

    /**
     * value: "setup_audit_logging"
     * @const
     */
    "setup_audit_logging": "setup_audit_logging",

    /**
     * value: "disable_recovery"
     * @const
     */
    "disable_recovery": "disable_recovery",

    /**
     * value: "enable_recovery"
     * @const
     */
    "enable_recovery": "enable_recovery",

    /**
     * value: "restart"
     * @const
     */
    "restart": "restart",

    /**
     * value: "enable_db_readonly"
     * @const
     */
    "enable_db_readonly": "enable_db_readonly",

    /**
     * value: "error_report"
     * @const
     */
    "error_report": "error_report",

    /**
     * value: "calculate_db_growth"
     * @const
     */
    "calculate_db_growth": "calculate_db_growth",

    /**
     * value: "enable_node_recovery"
     * @const
     */
    "enable_node_recovery": "enable_node_recovery",

    /**
     * value: "disable_node_recovery"
     * @const
     */
    "disable_node_recovery": "disable_node_recovery",

    /**
     * value: "check_pkg_upgrades"
     * @const
     */
    "check_pkg_upgrades": "check_pkg_upgrades",

    /**
     * value: "upgrade_cluster"
     * @const
     */
    "upgrade_cluster": "upgrade_cluster",

    /**
     * value: "success"
     * @const
     */
    "success": "success",

    /**
     * value: "add_replication_slave"
     * @const
     */
    "add_replication_slave": "add_replication_slave",

    /**
     * value: "deploy_cmonagents"
     * @const
     */
    "deploy_cmonagents": "deploy_cmonagents"
};



export default JobsJobJobSpec;
