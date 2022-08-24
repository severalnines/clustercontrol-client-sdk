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
import StatPrometheusQueries from './StatPrometheusQueries';

/**
 * The StatPrometheus model module.
 * @module model/StatPrometheus
 * @version 1.0.0
 */
class StatPrometheus {
    /**
     * Constructs a new <code>StatPrometheus</code>.
     * @alias module:model/StatPrometheus
     * @param operation {module:model/StatPrometheus.OperationEnum} 
     */
    constructor(operation) { 
        
        StatPrometheus.initialize(this, operation);
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
     * Constructs a <code>StatPrometheus</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/StatPrometheus} obj Optional instance to populate.
     * @return {module:model/StatPrometheus} The populated <code>StatPrometheus</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new StatPrometheus();

            if (data.hasOwnProperty('operation')) {
                obj['operation'] = ApiClient.convertToType(data['operation'], 'String');
            }
            if (data.hasOwnProperty('cluster_id')) {
                obj['cluster_id'] = ApiClient.convertToType(data['cluster_id'], 'Number');
            }
            if (data.hasOwnProperty('cluster_name')) {
                obj['cluster_name'] = ApiClient.convertToType(data['cluster_name'], 'String');
            }
            if (data.hasOwnProperty('queries')) {
                obj['queries'] = ApiClient.convertToType(data['queries'], [StatPrometheusQueries]);
            }
            if (data.hasOwnProperty('start')) {
                obj['start'] = ApiClient.convertToType(data['start'], 'Number');
            }
            if (data.hasOwnProperty('end')) {
                obj['end'] = ApiClient.convertToType(data['end'], 'Number');
            }
            if (data.hasOwnProperty('step')) {
                obj['step'] = ApiClient.convertToType(data['step'], 'Number');
            }
            if (data.hasOwnProperty('returnfrom')) {
                obj['returnfrom'] = ApiClient.convertToType(data['returnfrom'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/StatPrometheus.OperationEnum} operation
 */
StatPrometheus.prototype['operation'] = undefined;

/**
 * @member {Number} cluster_id
 */
StatPrometheus.prototype['cluster_id'] = undefined;

/**
 * @member {String} cluster_name
 */
StatPrometheus.prototype['cluster_name'] = undefined;

/**
 * @member {Array.<module:model/StatPrometheusQueries>} queries
 */
StatPrometheus.prototype['queries'] = undefined;

/**
 * Seconds since 1970. e.g. 1622105617
 * @member {Number} start
 */
StatPrometheus.prototype['start'] = undefined;

/**
 * Seconds since 1970. e.g. 1622108317
 * @member {Number} end
 */
StatPrometheus.prototype['end'] = undefined;

/**
 * @member {Number} step
 */
StatPrometheus.prototype['step'] = undefined;

/**
 * @member {Number} returnfrom
 */
StatPrometheus.prototype['returnfrom'] = undefined;





/**
 * Allowed values for the <code>operation</code> property.
 * @enum {String}
 * @readonly
 */
StatPrometheus['OperationEnum'] = {

    /**
     * value: "/prometheus"
     * @const
     */
    "/prometheus": "/prometheus"
};



export default StatPrometheus;

