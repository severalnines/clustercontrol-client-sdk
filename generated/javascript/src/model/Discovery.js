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
import DiscoveryJob from './DiscoveryJob';
import DiscoveryNodes from './DiscoveryNodes';
import DiscoverySshCredentials from './DiscoverySshCredentials';

/**
 * The Discovery model module.
 * @module model/Discovery
 * @version 1.0.0
 */
class Discovery {
    /**
     * Constructs a new <code>Discovery</code>.
     * @alias module:model/Discovery
     * @param operation {module:model/Discovery.OperationEnum} 
     */
    constructor(operation) { 
        
        Discovery.initialize(this, operation);
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
     * Constructs a <code>Discovery</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Discovery} obj Optional instance to populate.
     * @return {module:model/Discovery} The populated <code>Discovery</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Discovery();

            if (data.hasOwnProperty('operation')) {
                obj['operation'] = ApiClient.convertToType(data['operation'], 'String');
            }
            if (data.hasOwnProperty('new_cluster_name')) {
                obj['new_cluster_name'] = ApiClient.convertToType(data['new_cluster_name'], 'String');
            }
            if (data.hasOwnProperty('check_if_already_registered')) {
                obj['check_if_already_registered'] = ApiClient.convertToType(data['check_if_already_registered'], 'Boolean');
            }
            if (data.hasOwnProperty('check_job')) {
                obj['check_job'] = ApiClient.convertToType(data['check_job'], 'Boolean');
            }
            if (data.hasOwnProperty('check_ssh_sudo')) {
                obj['check_ssh_sudo'] = ApiClient.convertToType(data['check_ssh_sudo'], 'Boolean');
            }
            if (data.hasOwnProperty('nodes')) {
                obj['nodes'] = ApiClient.convertToType(data['nodes'], [DiscoveryNodes]);
            }
            if (data.hasOwnProperty('job')) {
                obj['job'] = DiscoveryJob.constructFromObject(data['job']);
            }
            if (data.hasOwnProperty('ssh_credentials')) {
                obj['ssh_credentials'] = DiscoverySshCredentials.constructFromObject(data['ssh_credentials']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/Discovery.OperationEnum} operation
 */
Discovery.prototype['operation'] = undefined;

/**
 * @member {String} new_cluster_name
 */
Discovery.prototype['new_cluster_name'] = undefined;

/**
 * @member {Boolean} check_if_already_registered
 */
Discovery.prototype['check_if_already_registered'] = undefined;

/**
 * @member {Boolean} check_job
 */
Discovery.prototype['check_job'] = undefined;

/**
 * @member {Boolean} check_ssh_sudo
 */
Discovery.prototype['check_ssh_sudo'] = undefined;

/**
 * @member {Array.<module:model/DiscoveryNodes>} nodes
 */
Discovery.prototype['nodes'] = undefined;

/**
 * @member {module:model/DiscoveryJob} job
 */
Discovery.prototype['job'] = undefined;

/**
 * @member {module:model/DiscoverySshCredentials} ssh_credentials
 */
Discovery.prototype['ssh_credentials'] = undefined;





/**
 * Allowed values for the <code>operation</code> property.
 * @enum {String}
 * @readonly
 */
Discovery['OperationEnum'] = {

    /**
     * value: "checkClusterName"
     * @const
     */
    "checkClusterName": "checkClusterName",

    /**
     * value: "getSupportedClusterTypes"
     * @const
     */
    "getSupportedClusterTypes": "getSupportedClusterTypes",

    /**
     * value: "checkHosts"
     * @const
     */
    "checkHosts": "checkHosts"
};



export default Discovery;

