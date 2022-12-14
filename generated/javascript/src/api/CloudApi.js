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


import ApiClient from "../ApiClient";
import Cloud from '../model/Cloud';

/**
* Cloud service.
* @module api/CloudApi
* @version 1.0.0
*/
export default class CloudApi {

    /**
    * Constructs a new CloudApi. 
    * @alias module:api/CloudApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the cloudPost operation.
     * @callback module:api/CloudApi~cloudPostCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * VerifyCredentials | ListCredentials | etc
     * @param {module:model/Cloud} cloud calls to manage the cloud-credentials
     * @param {module:api/CloudApi~cloudPostCallback} callback The callback function, accepting three arguments: error, data, response
     */
    cloudPost(cloud, callback) {
      let postBody = cloud;
      // verify the required parameter 'cloud' is set
      if (cloud === undefined || cloud === null) {
        throw new Error("Missing the required parameter 'cloud' when calling cloudPost");
      }

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = [];
      let returnType = null;
      return this.apiClient.callApi(
        '/cloud', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
