/*
 * Severalnines ClusterControl
 * This is a ...
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: sales@severalnines.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.ccapi.client.api;

import org.openapitools.ccapi.client.ApiCallback;
import org.openapitools.ccapi.client.ApiClient;
import org.openapitools.ccapi.client.ApiException;
import org.openapitools.ccapi.client.ApiResponse;
import org.openapitools.ccapi.client.Configuration;
import org.openapitools.ccapi.client.Pair;
import org.openapitools.ccapi.client.ProgressRequestBody;
import org.openapitools.ccapi.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.ccapi.client.model.Users;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class UsersApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public UsersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UsersApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for usersPost
     * @param users Manipulate Cmon Users, users that are maintained by the Cmon controller (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call usersPostCall(Users users, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = users;

        // create path and map variables
        String localVarPath = "/users";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call usersPostValidateBeforeCall(Users users, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'users' is set
        if (users == null) {
            throw new ApiException("Missing the required parameter 'users' when calling usersPost(Async)");
        }
        

        okhttp3.Call localVarCall = usersPostCall(users, _callback);
        return localVarCall;

    }

    /**
     * CreateUser | etc
     * 
     * @param users Manipulate Cmon Users, users that are maintained by the Cmon controller (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public void usersPost(Users users) throws ApiException {
        usersPostWithHttpInfo(users);
    }

    /**
     * CreateUser | etc
     * 
     * @param users Manipulate Cmon Users, users that are maintained by the Cmon controller (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> usersPostWithHttpInfo(Users users) throws ApiException {
        okhttp3.Call localVarCall = usersPostValidateBeforeCall(users, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * CreateUser | etc (asynchronously)
     * 
     * @param users Manipulate Cmon Users, users that are maintained by the Cmon controller (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call usersPostAsync(Users users, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = usersPostValidateBeforeCall(users, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
