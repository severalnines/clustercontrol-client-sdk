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
import Authenticate from '../model/Authenticate';

/**
* Auth service.
* @module api/AuthApi
* @version 1.0.0
*/
export default class AuthApi {

    /**
    * Constructs a new AuthApi. 
    * @alias module:api/AuthApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the authPost operation.
     * @callback module:api/AuthApi~authPostCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Authenticate | Logout | Password Reset | Authenticate response (with challenge)
     * @param {module:model/Authenticate} authenticate Authentication parameters
     * @param {module:api/AuthApi~authPostCallback} callback The callback function, accepting three arguments: error, data, response
     */
    authPost(authenticate, callback) {
      let postBody = authenticate;
      // verify the required parameter 'authenticate' is set
      if (authenticate === undefined || authenticate === null) {
        throw new Error("Missing the required parameter 'authenticate' when calling authPost");
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
        '/auth', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
