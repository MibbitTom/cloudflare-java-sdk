/*
 * Cloudflare API
 * To get started using Cloudflare's products and services via the API, refer to [how to interact with Cloudflare](https://developers.cloudflare.com/fundamentals/basic-tasks/interact-with-cloudflare/), which covers using tools like [Terraform](https://developers.cloudflare.com/terraform/#cloudflare-terraform) and the [official SDKs](https://developers.cloudflare.com/fundamentals/api/reference/sdks/) to maintain your Cloudflare resources.  Using the Cloudflare API requires authentication so that Cloudflare knows who is making requests and what permissions you have. Create an API token to grant access to the API to perform actions.  To create an API token, from the Cloudflare dashboard, go to My Profile > API Tokens and select Create Token. For more information on how to create and troubleshoot API tokens, refer to our [API fundamentals](https://developers.cloudflare.com/fundamentals/api/).  Totally new to Cloudflare? [Start here](https://developers.cloudflare.com/fundamentals/get-started/).
 *
 * The version of the OpenAPI document: 4.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package cloudflare.sdk;

import cloudflare.ApiCallback;
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.ApiResponse;
import cloudflare.Configuration;
import cloudflare.Pair;
import cloudflare.ProgressRequestBody;
import cloudflare.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import cloudflare.sdk.models.AccessApiResponseCommonFailure;
import cloudflare.sdk.models.AccessComponentsSchemasSingleResponse;
import cloudflare.sdk.models.AccessGroupsCreateAnAccessGroupRequest;
import cloudflare.sdk.models.AccessIdResponse;
import cloudflare.sdk.models.AccessSchemasResponseCollection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccessGroupsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AccessGroupsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AccessGroupsApi(ApiClient apiClient) {
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
     * Build call for accessGroupsCreateAnAccessGroup
     * @param identifier  (required)
     * @param accessGroupsCreateAnAccessGroupRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Create an Access group response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create an Access group response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call accessGroupsCreateAnAccessGroupCall(String identifier, AccessGroupsCreateAnAccessGroupRequest accessGroupsCreateAnAccessGroupRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = accessGroupsCreateAnAccessGroupRequest;

        // create path and map variables
        String localVarPath = "/accounts/{identifier}/access/groups"
            .replace("{" + "identifier" + "}", localVarApiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
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

        String[] localVarAuthNames = new String[] { "api_key", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call accessGroupsCreateAnAccessGroupValidateBeforeCall(String identifier, AccessGroupsCreateAnAccessGroupRequest accessGroupsCreateAnAccessGroupRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling accessGroupsCreateAnAccessGroup(Async)");
        }

        // verify the required parameter 'accessGroupsCreateAnAccessGroupRequest' is set
        if (accessGroupsCreateAnAccessGroupRequest == null) {
            throw new ApiException("Missing the required parameter 'accessGroupsCreateAnAccessGroupRequest' when calling accessGroupsCreateAnAccessGroup(Async)");
        }

        return accessGroupsCreateAnAccessGroupCall(identifier, accessGroupsCreateAnAccessGroupRequest, _callback);

    }

    /**
     * Create an Access group
     * Creates a new Access group.
     * @param identifier  (required)
     * @param accessGroupsCreateAnAccessGroupRequest  (required)
     * @return AccessComponentsSchemasSingleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Create an Access group response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create an Access group response failure </td><td>  -  </td></tr>
     </table>
     */
    public AccessComponentsSchemasSingleResponse accessGroupsCreateAnAccessGroup(String identifier, AccessGroupsCreateAnAccessGroupRequest accessGroupsCreateAnAccessGroupRequest) throws ApiException {
        ApiResponse<AccessComponentsSchemasSingleResponse> localVarResp = accessGroupsCreateAnAccessGroupWithHttpInfo(identifier, accessGroupsCreateAnAccessGroupRequest);
        return localVarResp.getData();
    }

    /**
     * Create an Access group
     * Creates a new Access group.
     * @param identifier  (required)
     * @param accessGroupsCreateAnAccessGroupRequest  (required)
     * @return ApiResponse&lt;AccessComponentsSchemasSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Create an Access group response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create an Access group response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AccessComponentsSchemasSingleResponse> accessGroupsCreateAnAccessGroupWithHttpInfo(String identifier, AccessGroupsCreateAnAccessGroupRequest accessGroupsCreateAnAccessGroupRequest) throws ApiException {
        okhttp3.Call localVarCall = accessGroupsCreateAnAccessGroupValidateBeforeCall(identifier, accessGroupsCreateAnAccessGroupRequest, null);
        Type localVarReturnType = new TypeToken<AccessComponentsSchemasSingleResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create an Access group (asynchronously)
     * Creates a new Access group.
     * @param identifier  (required)
     * @param accessGroupsCreateAnAccessGroupRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Create an Access group response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create an Access group response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call accessGroupsCreateAnAccessGroupAsync(String identifier, AccessGroupsCreateAnAccessGroupRequest accessGroupsCreateAnAccessGroupRequest, final ApiCallback<AccessComponentsSchemasSingleResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = accessGroupsCreateAnAccessGroupValidateBeforeCall(identifier, accessGroupsCreateAnAccessGroupRequest, _callback);
        Type localVarReturnType = new TypeToken<AccessComponentsSchemasSingleResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for accessGroupsDeleteAnAccessGroup
     * @param uuid  (required)
     * @param identifier  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Delete an Access group response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete an Access group response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call accessGroupsDeleteAnAccessGroupCall(String uuid, String identifier, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/accounts/{identifier}/access/groups/{uuid}"
            .replace("{" + "uuid" + "}", localVarApiClient.escapeString(uuid.toString()))
            .replace("{" + "identifier" + "}", localVarApiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call accessGroupsDeleteAnAccessGroupValidateBeforeCall(String uuid, String identifier, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling accessGroupsDeleteAnAccessGroup(Async)");
        }

        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling accessGroupsDeleteAnAccessGroup(Async)");
        }

        return accessGroupsDeleteAnAccessGroupCall(uuid, identifier, _callback);

    }

    /**
     * Delete an Access group
     * Deletes an Access group.
     * @param uuid  (required)
     * @param identifier  (required)
     * @return AccessIdResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Delete an Access group response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete an Access group response failure </td><td>  -  </td></tr>
     </table>
     */
    public AccessIdResponse accessGroupsDeleteAnAccessGroup(String uuid, String identifier) throws ApiException {
        ApiResponse<AccessIdResponse> localVarResp = accessGroupsDeleteAnAccessGroupWithHttpInfo(uuid, identifier);
        return localVarResp.getData();
    }

    /**
     * Delete an Access group
     * Deletes an Access group.
     * @param uuid  (required)
     * @param identifier  (required)
     * @return ApiResponse&lt;AccessIdResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Delete an Access group response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete an Access group response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AccessIdResponse> accessGroupsDeleteAnAccessGroupWithHttpInfo(String uuid, String identifier) throws ApiException {
        okhttp3.Call localVarCall = accessGroupsDeleteAnAccessGroupValidateBeforeCall(uuid, identifier, null);
        Type localVarReturnType = new TypeToken<AccessIdResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete an Access group (asynchronously)
     * Deletes an Access group.
     * @param uuid  (required)
     * @param identifier  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Delete an Access group response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete an Access group response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call accessGroupsDeleteAnAccessGroupAsync(String uuid, String identifier, final ApiCallback<AccessIdResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = accessGroupsDeleteAnAccessGroupValidateBeforeCall(uuid, identifier, _callback);
        Type localVarReturnType = new TypeToken<AccessIdResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for accessGroupsGetAnAccessGroup
     * @param uuid  (required)
     * @param identifier  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get an Access group response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get an Access group response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call accessGroupsGetAnAccessGroupCall(String uuid, String identifier, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/accounts/{identifier}/access/groups/{uuid}"
            .replace("{" + "uuid" + "}", localVarApiClient.escapeString(uuid.toString()))
            .replace("{" + "identifier" + "}", localVarApiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call accessGroupsGetAnAccessGroupValidateBeforeCall(String uuid, String identifier, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling accessGroupsGetAnAccessGroup(Async)");
        }

        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling accessGroupsGetAnAccessGroup(Async)");
        }

        return accessGroupsGetAnAccessGroupCall(uuid, identifier, _callback);

    }

    /**
     * Get an Access group
     * Fetches a single Access group.
     * @param uuid  (required)
     * @param identifier  (required)
     * @return AccessComponentsSchemasSingleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get an Access group response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get an Access group response failure </td><td>  -  </td></tr>
     </table>
     */
    public AccessComponentsSchemasSingleResponse accessGroupsGetAnAccessGroup(String uuid, String identifier) throws ApiException {
        ApiResponse<AccessComponentsSchemasSingleResponse> localVarResp = accessGroupsGetAnAccessGroupWithHttpInfo(uuid, identifier);
        return localVarResp.getData();
    }

    /**
     * Get an Access group
     * Fetches a single Access group.
     * @param uuid  (required)
     * @param identifier  (required)
     * @return ApiResponse&lt;AccessComponentsSchemasSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get an Access group response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get an Access group response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AccessComponentsSchemasSingleResponse> accessGroupsGetAnAccessGroupWithHttpInfo(String uuid, String identifier) throws ApiException {
        okhttp3.Call localVarCall = accessGroupsGetAnAccessGroupValidateBeforeCall(uuid, identifier, null);
        Type localVarReturnType = new TypeToken<AccessComponentsSchemasSingleResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get an Access group (asynchronously)
     * Fetches a single Access group.
     * @param uuid  (required)
     * @param identifier  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get an Access group response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get an Access group response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call accessGroupsGetAnAccessGroupAsync(String uuid, String identifier, final ApiCallback<AccessComponentsSchemasSingleResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = accessGroupsGetAnAccessGroupValidateBeforeCall(uuid, identifier, _callback);
        Type localVarReturnType = new TypeToken<AccessComponentsSchemasSingleResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for accessGroupsListAccessGroups
     * @param identifier  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Access groups response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Access groups response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call accessGroupsListAccessGroupsCall(String identifier, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/accounts/{identifier}/access/groups"
            .replace("{" + "identifier" + "}", localVarApiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call accessGroupsListAccessGroupsValidateBeforeCall(String identifier, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling accessGroupsListAccessGroups(Async)");
        }

        return accessGroupsListAccessGroupsCall(identifier, _callback);

    }

    /**
     * List Access groups
     * Lists all Access groups.
     * @param identifier  (required)
     * @return AccessSchemasResponseCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Access groups response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Access groups response failure </td><td>  -  </td></tr>
     </table>
     */
    public AccessSchemasResponseCollection accessGroupsListAccessGroups(String identifier) throws ApiException {
        ApiResponse<AccessSchemasResponseCollection> localVarResp = accessGroupsListAccessGroupsWithHttpInfo(identifier);
        return localVarResp.getData();
    }

    /**
     * List Access groups
     * Lists all Access groups.
     * @param identifier  (required)
     * @return ApiResponse&lt;AccessSchemasResponseCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Access groups response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Access groups response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AccessSchemasResponseCollection> accessGroupsListAccessGroupsWithHttpInfo(String identifier) throws ApiException {
        okhttp3.Call localVarCall = accessGroupsListAccessGroupsValidateBeforeCall(identifier, null);
        Type localVarReturnType = new TypeToken<AccessSchemasResponseCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Access groups (asynchronously)
     * Lists all Access groups.
     * @param identifier  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Access groups response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Access groups response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call accessGroupsListAccessGroupsAsync(String identifier, final ApiCallback<AccessSchemasResponseCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = accessGroupsListAccessGroupsValidateBeforeCall(identifier, _callback);
        Type localVarReturnType = new TypeToken<AccessSchemasResponseCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for accessGroupsUpdateAnAccessGroup
     * @param uuid  (required)
     * @param identifier  (required)
     * @param accessGroupsCreateAnAccessGroupRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update an Access group response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update an Access group response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call accessGroupsUpdateAnAccessGroupCall(String uuid, String identifier, AccessGroupsCreateAnAccessGroupRequest accessGroupsCreateAnAccessGroupRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = accessGroupsCreateAnAccessGroupRequest;

        // create path and map variables
        String localVarPath = "/accounts/{identifier}/access/groups/{uuid}"
            .replace("{" + "uuid" + "}", localVarApiClient.escapeString(uuid.toString()))
            .replace("{" + "identifier" + "}", localVarApiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
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

        String[] localVarAuthNames = new String[] { "api_key", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call accessGroupsUpdateAnAccessGroupValidateBeforeCall(String uuid, String identifier, AccessGroupsCreateAnAccessGroupRequest accessGroupsCreateAnAccessGroupRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling accessGroupsUpdateAnAccessGroup(Async)");
        }

        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling accessGroupsUpdateAnAccessGroup(Async)");
        }

        // verify the required parameter 'accessGroupsCreateAnAccessGroupRequest' is set
        if (accessGroupsCreateAnAccessGroupRequest == null) {
            throw new ApiException("Missing the required parameter 'accessGroupsCreateAnAccessGroupRequest' when calling accessGroupsUpdateAnAccessGroup(Async)");
        }

        return accessGroupsUpdateAnAccessGroupCall(uuid, identifier, accessGroupsCreateAnAccessGroupRequest, _callback);

    }

    /**
     * Update an Access group
     * Updates a configured Access group.
     * @param uuid  (required)
     * @param identifier  (required)
     * @param accessGroupsCreateAnAccessGroupRequest  (required)
     * @return AccessComponentsSchemasSingleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update an Access group response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update an Access group response failure </td><td>  -  </td></tr>
     </table>
     */
    public AccessComponentsSchemasSingleResponse accessGroupsUpdateAnAccessGroup(String uuid, String identifier, AccessGroupsCreateAnAccessGroupRequest accessGroupsCreateAnAccessGroupRequest) throws ApiException {
        ApiResponse<AccessComponentsSchemasSingleResponse> localVarResp = accessGroupsUpdateAnAccessGroupWithHttpInfo(uuid, identifier, accessGroupsCreateAnAccessGroupRequest);
        return localVarResp.getData();
    }

    /**
     * Update an Access group
     * Updates a configured Access group.
     * @param uuid  (required)
     * @param identifier  (required)
     * @param accessGroupsCreateAnAccessGroupRequest  (required)
     * @return ApiResponse&lt;AccessComponentsSchemasSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update an Access group response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update an Access group response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AccessComponentsSchemasSingleResponse> accessGroupsUpdateAnAccessGroupWithHttpInfo(String uuid, String identifier, AccessGroupsCreateAnAccessGroupRequest accessGroupsCreateAnAccessGroupRequest) throws ApiException {
        okhttp3.Call localVarCall = accessGroupsUpdateAnAccessGroupValidateBeforeCall(uuid, identifier, accessGroupsCreateAnAccessGroupRequest, null);
        Type localVarReturnType = new TypeToken<AccessComponentsSchemasSingleResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update an Access group (asynchronously)
     * Updates a configured Access group.
     * @param uuid  (required)
     * @param identifier  (required)
     * @param accessGroupsCreateAnAccessGroupRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update an Access group response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update an Access group response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call accessGroupsUpdateAnAccessGroupAsync(String uuid, String identifier, AccessGroupsCreateAnAccessGroupRequest accessGroupsCreateAnAccessGroupRequest, final ApiCallback<AccessComponentsSchemasSingleResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = accessGroupsUpdateAnAccessGroupValidateBeforeCall(uuid, identifier, accessGroupsCreateAnAccessGroupRequest, _callback);
        Type localVarReturnType = new TypeToken<AccessComponentsSchemasSingleResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
