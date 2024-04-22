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


import cloudflare.sdk.models.WorkerFiltersDeprecatedCreateFilter4XXResponse;
import cloudflare.sdk.models.WorkerFiltersDeprecatedListFilters4XXResponse;
import cloudflare.sdk.models.WorkerFiltersDeprecatedUpdateFilter4XXResponse;
import cloudflare.sdk.models.WorkersApiResponseSingleId;
import cloudflare.sdk.models.WorkersFilterNoId;
import cloudflare.sdk.models.WorkersFilterResponseCollection;
import cloudflare.sdk.models.WorkersFilterResponseSingle;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorkerFiltersDeprecatedApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public WorkerFiltersDeprecatedApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WorkerFiltersDeprecatedApi(ApiClient apiClient) {
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
     * Build call for workerFiltersDeprecatedCreateFilter
     * @param zoneId  (required)
     * @param workersFilterNoId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Filter response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Filter response failure </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call workerFiltersDeprecatedCreateFilterCall(String zoneId, WorkersFilterNoId workersFilterNoId, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = workersFilterNoId;

        // create path and map variables
        String localVarPath = "/zones/{zone_id}/workers/filters"
            .replace("{" + "zone_id" + "}", localVarApiClient.escapeString(zoneId.toString()));

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

        String[] localVarAuthNames = new String[] { "api_key", "api_token", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @Deprecated
    @SuppressWarnings("rawtypes")
    private okhttp3.Call workerFiltersDeprecatedCreateFilterValidateBeforeCall(String zoneId, WorkersFilterNoId workersFilterNoId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling workerFiltersDeprecatedCreateFilter(Async)");
        }

        // verify the required parameter 'workersFilterNoId' is set
        if (workersFilterNoId == null) {
            throw new ApiException("Missing the required parameter 'workersFilterNoId' when calling workerFiltersDeprecatedCreateFilter(Async)");
        }

        return workerFiltersDeprecatedCreateFilterCall(zoneId, workersFilterNoId, _callback);

    }

    /**
     * Create Filter
     * 
     * @param zoneId  (required)
     * @param workersFilterNoId  (required)
     * @return WorkersApiResponseSingleId
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Filter response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Filter response failure </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public WorkersApiResponseSingleId workerFiltersDeprecatedCreateFilter(String zoneId, WorkersFilterNoId workersFilterNoId) throws ApiException {
        ApiResponse<WorkersApiResponseSingleId> localVarResp = workerFiltersDeprecatedCreateFilterWithHttpInfo(zoneId, workersFilterNoId);
        return localVarResp.getData();
    }

    /**
     * Create Filter
     * 
     * @param zoneId  (required)
     * @param workersFilterNoId  (required)
     * @return ApiResponse&lt;WorkersApiResponseSingleId&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Filter response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Filter response failure </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public ApiResponse<WorkersApiResponseSingleId> workerFiltersDeprecatedCreateFilterWithHttpInfo(String zoneId, WorkersFilterNoId workersFilterNoId) throws ApiException {
        okhttp3.Call localVarCall = workerFiltersDeprecatedCreateFilterValidateBeforeCall(zoneId, workersFilterNoId, null);
        Type localVarReturnType = new TypeToken<WorkersApiResponseSingleId>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create Filter (asynchronously)
     * 
     * @param zoneId  (required)
     * @param workersFilterNoId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Filter response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Filter response failure </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call workerFiltersDeprecatedCreateFilterAsync(String zoneId, WorkersFilterNoId workersFilterNoId, final ApiCallback<WorkersApiResponseSingleId> _callback) throws ApiException {

        okhttp3.Call localVarCall = workerFiltersDeprecatedCreateFilterValidateBeforeCall(zoneId, workersFilterNoId, _callback);
        Type localVarReturnType = new TypeToken<WorkersApiResponseSingleId>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for workerFiltersDeprecatedDeleteFilter
     * @param filterId  (required)
     * @param zoneId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete Filter response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete Filter response failure </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call workerFiltersDeprecatedDeleteFilterCall(String filterId, String zoneId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/zones/{zone_id}/workers/filters/{filter_id}"
            .replace("{" + "filter_id" + "}", localVarApiClient.escapeString(filterId.toString()))
            .replace("{" + "zone_id" + "}", localVarApiClient.escapeString(zoneId.toString()));

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

        String[] localVarAuthNames = new String[] { "api_key", "api_token", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @Deprecated
    @SuppressWarnings("rawtypes")
    private okhttp3.Call workerFiltersDeprecatedDeleteFilterValidateBeforeCall(String filterId, String zoneId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'filterId' is set
        if (filterId == null) {
            throw new ApiException("Missing the required parameter 'filterId' when calling workerFiltersDeprecatedDeleteFilter(Async)");
        }

        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling workerFiltersDeprecatedDeleteFilter(Async)");
        }

        return workerFiltersDeprecatedDeleteFilterCall(filterId, zoneId, _callback);

    }

    /**
     * Delete Filter
     * 
     * @param filterId  (required)
     * @param zoneId  (required)
     * @return WorkersApiResponseSingleId
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete Filter response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete Filter response failure </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public WorkersApiResponseSingleId workerFiltersDeprecatedDeleteFilter(String filterId, String zoneId) throws ApiException {
        ApiResponse<WorkersApiResponseSingleId> localVarResp = workerFiltersDeprecatedDeleteFilterWithHttpInfo(filterId, zoneId);
        return localVarResp.getData();
    }

    /**
     * Delete Filter
     * 
     * @param filterId  (required)
     * @param zoneId  (required)
     * @return ApiResponse&lt;WorkersApiResponseSingleId&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete Filter response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete Filter response failure </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public ApiResponse<WorkersApiResponseSingleId> workerFiltersDeprecatedDeleteFilterWithHttpInfo(String filterId, String zoneId) throws ApiException {
        okhttp3.Call localVarCall = workerFiltersDeprecatedDeleteFilterValidateBeforeCall(filterId, zoneId, null);
        Type localVarReturnType = new TypeToken<WorkersApiResponseSingleId>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete Filter (asynchronously)
     * 
     * @param filterId  (required)
     * @param zoneId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete Filter response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete Filter response failure </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call workerFiltersDeprecatedDeleteFilterAsync(String filterId, String zoneId, final ApiCallback<WorkersApiResponseSingleId> _callback) throws ApiException {

        okhttp3.Call localVarCall = workerFiltersDeprecatedDeleteFilterValidateBeforeCall(filterId, zoneId, _callback);
        Type localVarReturnType = new TypeToken<WorkersApiResponseSingleId>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for workerFiltersDeprecatedListFilters
     * @param zoneId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Filters response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Filters response failure </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call workerFiltersDeprecatedListFiltersCall(String zoneId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/zones/{zone_id}/workers/filters"
            .replace("{" + "zone_id" + "}", localVarApiClient.escapeString(zoneId.toString()));

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

        String[] localVarAuthNames = new String[] { "api_key", "api_token", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @Deprecated
    @SuppressWarnings("rawtypes")
    private okhttp3.Call workerFiltersDeprecatedListFiltersValidateBeforeCall(String zoneId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling workerFiltersDeprecatedListFilters(Async)");
        }

        return workerFiltersDeprecatedListFiltersCall(zoneId, _callback);

    }

    /**
     * List Filters
     * 
     * @param zoneId  (required)
     * @return WorkersFilterResponseCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Filters response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Filters response failure </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public WorkersFilterResponseCollection workerFiltersDeprecatedListFilters(String zoneId) throws ApiException {
        ApiResponse<WorkersFilterResponseCollection> localVarResp = workerFiltersDeprecatedListFiltersWithHttpInfo(zoneId);
        return localVarResp.getData();
    }

    /**
     * List Filters
     * 
     * @param zoneId  (required)
     * @return ApiResponse&lt;WorkersFilterResponseCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Filters response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Filters response failure </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public ApiResponse<WorkersFilterResponseCollection> workerFiltersDeprecatedListFiltersWithHttpInfo(String zoneId) throws ApiException {
        okhttp3.Call localVarCall = workerFiltersDeprecatedListFiltersValidateBeforeCall(zoneId, null);
        Type localVarReturnType = new TypeToken<WorkersFilterResponseCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Filters (asynchronously)
     * 
     * @param zoneId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Filters response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Filters response failure </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call workerFiltersDeprecatedListFiltersAsync(String zoneId, final ApiCallback<WorkersFilterResponseCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = workerFiltersDeprecatedListFiltersValidateBeforeCall(zoneId, _callback);
        Type localVarReturnType = new TypeToken<WorkersFilterResponseCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for workerFiltersDeprecatedUpdateFilter
     * @param filterId  (required)
     * @param zoneId  (required)
     * @param workersFilterNoId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Filter response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Filter response failure </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call workerFiltersDeprecatedUpdateFilterCall(String filterId, String zoneId, WorkersFilterNoId workersFilterNoId, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = workersFilterNoId;

        // create path and map variables
        String localVarPath = "/zones/{zone_id}/workers/filters/{filter_id}"
            .replace("{" + "filter_id" + "}", localVarApiClient.escapeString(filterId.toString()))
            .replace("{" + "zone_id" + "}", localVarApiClient.escapeString(zoneId.toString()));

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

        String[] localVarAuthNames = new String[] { "api_key", "api_token", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @Deprecated
    @SuppressWarnings("rawtypes")
    private okhttp3.Call workerFiltersDeprecatedUpdateFilterValidateBeforeCall(String filterId, String zoneId, WorkersFilterNoId workersFilterNoId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'filterId' is set
        if (filterId == null) {
            throw new ApiException("Missing the required parameter 'filterId' when calling workerFiltersDeprecatedUpdateFilter(Async)");
        }

        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling workerFiltersDeprecatedUpdateFilter(Async)");
        }

        // verify the required parameter 'workersFilterNoId' is set
        if (workersFilterNoId == null) {
            throw new ApiException("Missing the required parameter 'workersFilterNoId' when calling workerFiltersDeprecatedUpdateFilter(Async)");
        }

        return workerFiltersDeprecatedUpdateFilterCall(filterId, zoneId, workersFilterNoId, _callback);

    }

    /**
     * Update Filter
     * 
     * @param filterId  (required)
     * @param zoneId  (required)
     * @param workersFilterNoId  (required)
     * @return WorkersFilterResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Filter response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Filter response failure </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public WorkersFilterResponseSingle workerFiltersDeprecatedUpdateFilter(String filterId, String zoneId, WorkersFilterNoId workersFilterNoId) throws ApiException {
        ApiResponse<WorkersFilterResponseSingle> localVarResp = workerFiltersDeprecatedUpdateFilterWithHttpInfo(filterId, zoneId, workersFilterNoId);
        return localVarResp.getData();
    }

    /**
     * Update Filter
     * 
     * @param filterId  (required)
     * @param zoneId  (required)
     * @param workersFilterNoId  (required)
     * @return ApiResponse&lt;WorkersFilterResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Filter response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Filter response failure </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public ApiResponse<WorkersFilterResponseSingle> workerFiltersDeprecatedUpdateFilterWithHttpInfo(String filterId, String zoneId, WorkersFilterNoId workersFilterNoId) throws ApiException {
        okhttp3.Call localVarCall = workerFiltersDeprecatedUpdateFilterValidateBeforeCall(filterId, zoneId, workersFilterNoId, null);
        Type localVarReturnType = new TypeToken<WorkersFilterResponseSingle>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Filter (asynchronously)
     * 
     * @param filterId  (required)
     * @param zoneId  (required)
     * @param workersFilterNoId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Filter response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Filter response failure </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call workerFiltersDeprecatedUpdateFilterAsync(String filterId, String zoneId, WorkersFilterNoId workersFilterNoId, final ApiCallback<WorkersFilterResponseSingle> _callback) throws ApiException {

        okhttp3.Call localVarCall = workerFiltersDeprecatedUpdateFilterValidateBeforeCall(filterId, zoneId, workersFilterNoId, _callback);
        Type localVarReturnType = new TypeToken<WorkersFilterResponseSingle>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
