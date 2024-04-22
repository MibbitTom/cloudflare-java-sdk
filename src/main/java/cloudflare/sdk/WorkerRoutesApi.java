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


import cloudflare.sdk.models.WorkerRoutesCreateRoute4XXResponse;
import cloudflare.sdk.models.WorkerRoutesGetRoute4XXResponse;
import cloudflare.sdk.models.WorkerRoutesListRoutes4XXResponse;
import cloudflare.sdk.models.WorkersApiResponseSingle;
import cloudflare.sdk.models.WorkersRouteNoId;
import cloudflare.sdk.models.WorkersRouteResponseCollection;
import cloudflare.sdk.models.WorkersRouteResponseSingle;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorkerRoutesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public WorkerRoutesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WorkerRoutesApi(ApiClient apiClient) {
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
     * Build call for workerRoutesCreateRoute
     * @param zoneId  (required)
     * @param workersRouteNoId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Route response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Route response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call workerRoutesCreateRouteCall(String zoneId, WorkersRouteNoId workersRouteNoId, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = workersRouteNoId;

        // create path and map variables
        String localVarPath = "/zones/{zone_id}/workers/routes"
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

    @SuppressWarnings("rawtypes")
    private okhttp3.Call workerRoutesCreateRouteValidateBeforeCall(String zoneId, WorkersRouteNoId workersRouteNoId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling workerRoutesCreateRoute(Async)");
        }

        // verify the required parameter 'workersRouteNoId' is set
        if (workersRouteNoId == null) {
            throw new ApiException("Missing the required parameter 'workersRouteNoId' when calling workerRoutesCreateRoute(Async)");
        }

        return workerRoutesCreateRouteCall(zoneId, workersRouteNoId, _callback);

    }

    /**
     * Create Route
     * Creates a route that maps a URL pattern to a Worker.
     * @param zoneId  (required)
     * @param workersRouteNoId  (required)
     * @return WorkersApiResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Route response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Route response failure </td><td>  -  </td></tr>
     </table>
     */
    public WorkersApiResponseSingle workerRoutesCreateRoute(String zoneId, WorkersRouteNoId workersRouteNoId) throws ApiException {
        ApiResponse<WorkersApiResponseSingle> localVarResp = workerRoutesCreateRouteWithHttpInfo(zoneId, workersRouteNoId);
        return localVarResp.getData();
    }

    /**
     * Create Route
     * Creates a route that maps a URL pattern to a Worker.
     * @param zoneId  (required)
     * @param workersRouteNoId  (required)
     * @return ApiResponse&lt;WorkersApiResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Route response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Route response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<WorkersApiResponseSingle> workerRoutesCreateRouteWithHttpInfo(String zoneId, WorkersRouteNoId workersRouteNoId) throws ApiException {
        okhttp3.Call localVarCall = workerRoutesCreateRouteValidateBeforeCall(zoneId, workersRouteNoId, null);
        Type localVarReturnType = new TypeToken<WorkersApiResponseSingle>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create Route (asynchronously)
     * Creates a route that maps a URL pattern to a Worker.
     * @param zoneId  (required)
     * @param workersRouteNoId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Route response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Route response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call workerRoutesCreateRouteAsync(String zoneId, WorkersRouteNoId workersRouteNoId, final ApiCallback<WorkersApiResponseSingle> _callback) throws ApiException {

        okhttp3.Call localVarCall = workerRoutesCreateRouteValidateBeforeCall(zoneId, workersRouteNoId, _callback);
        Type localVarReturnType = new TypeToken<WorkersApiResponseSingle>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for workerRoutesDeleteRoute
     * @param routeId  (required)
     * @param zoneId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete Route response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete Route response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call workerRoutesDeleteRouteCall(String routeId, String zoneId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/zones/{zone_id}/workers/routes/{route_id}"
            .replace("{" + "route_id" + "}", localVarApiClient.escapeString(routeId.toString()))
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

    @SuppressWarnings("rawtypes")
    private okhttp3.Call workerRoutesDeleteRouteValidateBeforeCall(String routeId, String zoneId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'routeId' is set
        if (routeId == null) {
            throw new ApiException("Missing the required parameter 'routeId' when calling workerRoutesDeleteRoute(Async)");
        }

        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling workerRoutesDeleteRoute(Async)");
        }

        return workerRoutesDeleteRouteCall(routeId, zoneId, _callback);

    }

    /**
     * Delete Route
     * Deletes a route.
     * @param routeId  (required)
     * @param zoneId  (required)
     * @return WorkersApiResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete Route response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete Route response failure </td><td>  -  </td></tr>
     </table>
     */
    public WorkersApiResponseSingle workerRoutesDeleteRoute(String routeId, String zoneId) throws ApiException {
        ApiResponse<WorkersApiResponseSingle> localVarResp = workerRoutesDeleteRouteWithHttpInfo(routeId, zoneId);
        return localVarResp.getData();
    }

    /**
     * Delete Route
     * Deletes a route.
     * @param routeId  (required)
     * @param zoneId  (required)
     * @return ApiResponse&lt;WorkersApiResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete Route response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete Route response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<WorkersApiResponseSingle> workerRoutesDeleteRouteWithHttpInfo(String routeId, String zoneId) throws ApiException {
        okhttp3.Call localVarCall = workerRoutesDeleteRouteValidateBeforeCall(routeId, zoneId, null);
        Type localVarReturnType = new TypeToken<WorkersApiResponseSingle>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete Route (asynchronously)
     * Deletes a route.
     * @param routeId  (required)
     * @param zoneId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete Route response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete Route response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call workerRoutesDeleteRouteAsync(String routeId, String zoneId, final ApiCallback<WorkersApiResponseSingle> _callback) throws ApiException {

        okhttp3.Call localVarCall = workerRoutesDeleteRouteValidateBeforeCall(routeId, zoneId, _callback);
        Type localVarReturnType = new TypeToken<WorkersApiResponseSingle>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for workerRoutesGetRoute
     * @param routeId  (required)
     * @param zoneId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get Route response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get Route response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call workerRoutesGetRouteCall(String routeId, String zoneId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/zones/{zone_id}/workers/routes/{route_id}"
            .replace("{" + "route_id" + "}", localVarApiClient.escapeString(routeId.toString()))
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

    @SuppressWarnings("rawtypes")
    private okhttp3.Call workerRoutesGetRouteValidateBeforeCall(String routeId, String zoneId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'routeId' is set
        if (routeId == null) {
            throw new ApiException("Missing the required parameter 'routeId' when calling workerRoutesGetRoute(Async)");
        }

        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling workerRoutesGetRoute(Async)");
        }

        return workerRoutesGetRouteCall(routeId, zoneId, _callback);

    }

    /**
     * Get Route
     * Returns information about a route, including URL pattern and Worker.
     * @param routeId  (required)
     * @param zoneId  (required)
     * @return WorkersRouteResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get Route response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get Route response failure </td><td>  -  </td></tr>
     </table>
     */
    public WorkersRouteResponseSingle workerRoutesGetRoute(String routeId, String zoneId) throws ApiException {
        ApiResponse<WorkersRouteResponseSingle> localVarResp = workerRoutesGetRouteWithHttpInfo(routeId, zoneId);
        return localVarResp.getData();
    }

    /**
     * Get Route
     * Returns information about a route, including URL pattern and Worker.
     * @param routeId  (required)
     * @param zoneId  (required)
     * @return ApiResponse&lt;WorkersRouteResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get Route response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get Route response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<WorkersRouteResponseSingle> workerRoutesGetRouteWithHttpInfo(String routeId, String zoneId) throws ApiException {
        okhttp3.Call localVarCall = workerRoutesGetRouteValidateBeforeCall(routeId, zoneId, null);
        Type localVarReturnType = new TypeToken<WorkersRouteResponseSingle>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Route (asynchronously)
     * Returns information about a route, including URL pattern and Worker.
     * @param routeId  (required)
     * @param zoneId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get Route response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get Route response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call workerRoutesGetRouteAsync(String routeId, String zoneId, final ApiCallback<WorkersRouteResponseSingle> _callback) throws ApiException {

        okhttp3.Call localVarCall = workerRoutesGetRouteValidateBeforeCall(routeId, zoneId, _callback);
        Type localVarReturnType = new TypeToken<WorkersRouteResponseSingle>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for workerRoutesListRoutes
     * @param zoneId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Routes response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Routes response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call workerRoutesListRoutesCall(String zoneId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/zones/{zone_id}/workers/routes"
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

    @SuppressWarnings("rawtypes")
    private okhttp3.Call workerRoutesListRoutesValidateBeforeCall(String zoneId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling workerRoutesListRoutes(Async)");
        }

        return workerRoutesListRoutesCall(zoneId, _callback);

    }

    /**
     * List Routes
     * Returns routes for a zone.
     * @param zoneId  (required)
     * @return WorkersRouteResponseCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Routes response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Routes response failure </td><td>  -  </td></tr>
     </table>
     */
    public WorkersRouteResponseCollection workerRoutesListRoutes(String zoneId) throws ApiException {
        ApiResponse<WorkersRouteResponseCollection> localVarResp = workerRoutesListRoutesWithHttpInfo(zoneId);
        return localVarResp.getData();
    }

    /**
     * List Routes
     * Returns routes for a zone.
     * @param zoneId  (required)
     * @return ApiResponse&lt;WorkersRouteResponseCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Routes response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Routes response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<WorkersRouteResponseCollection> workerRoutesListRoutesWithHttpInfo(String zoneId) throws ApiException {
        okhttp3.Call localVarCall = workerRoutesListRoutesValidateBeforeCall(zoneId, null);
        Type localVarReturnType = new TypeToken<WorkersRouteResponseCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Routes (asynchronously)
     * Returns routes for a zone.
     * @param zoneId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Routes response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Routes response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call workerRoutesListRoutesAsync(String zoneId, final ApiCallback<WorkersRouteResponseCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = workerRoutesListRoutesValidateBeforeCall(zoneId, _callback);
        Type localVarReturnType = new TypeToken<WorkersRouteResponseCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for workerRoutesUpdateRoute
     * @param routeId  (required)
     * @param zoneId  (required)
     * @param workersRouteNoId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Route response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Route response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call workerRoutesUpdateRouteCall(String routeId, String zoneId, WorkersRouteNoId workersRouteNoId, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = workersRouteNoId;

        // create path and map variables
        String localVarPath = "/zones/{zone_id}/workers/routes/{route_id}"
            .replace("{" + "route_id" + "}", localVarApiClient.escapeString(routeId.toString()))
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

    @SuppressWarnings("rawtypes")
    private okhttp3.Call workerRoutesUpdateRouteValidateBeforeCall(String routeId, String zoneId, WorkersRouteNoId workersRouteNoId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'routeId' is set
        if (routeId == null) {
            throw new ApiException("Missing the required parameter 'routeId' when calling workerRoutesUpdateRoute(Async)");
        }

        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling workerRoutesUpdateRoute(Async)");
        }

        // verify the required parameter 'workersRouteNoId' is set
        if (workersRouteNoId == null) {
            throw new ApiException("Missing the required parameter 'workersRouteNoId' when calling workerRoutesUpdateRoute(Async)");
        }

        return workerRoutesUpdateRouteCall(routeId, zoneId, workersRouteNoId, _callback);

    }

    /**
     * Update Route
     * Updates the URL pattern or Worker associated with a route.
     * @param routeId  (required)
     * @param zoneId  (required)
     * @param workersRouteNoId  (required)
     * @return WorkersRouteResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Route response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Route response failure </td><td>  -  </td></tr>
     </table>
     */
    public WorkersRouteResponseSingle workerRoutesUpdateRoute(String routeId, String zoneId, WorkersRouteNoId workersRouteNoId) throws ApiException {
        ApiResponse<WorkersRouteResponseSingle> localVarResp = workerRoutesUpdateRouteWithHttpInfo(routeId, zoneId, workersRouteNoId);
        return localVarResp.getData();
    }

    /**
     * Update Route
     * Updates the URL pattern or Worker associated with a route.
     * @param routeId  (required)
     * @param zoneId  (required)
     * @param workersRouteNoId  (required)
     * @return ApiResponse&lt;WorkersRouteResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Route response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Route response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<WorkersRouteResponseSingle> workerRoutesUpdateRouteWithHttpInfo(String routeId, String zoneId, WorkersRouteNoId workersRouteNoId) throws ApiException {
        okhttp3.Call localVarCall = workerRoutesUpdateRouteValidateBeforeCall(routeId, zoneId, workersRouteNoId, null);
        Type localVarReturnType = new TypeToken<WorkersRouteResponseSingle>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Route (asynchronously)
     * Updates the URL pattern or Worker associated with a route.
     * @param routeId  (required)
     * @param zoneId  (required)
     * @param workersRouteNoId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Route response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Route response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call workerRoutesUpdateRouteAsync(String routeId, String zoneId, WorkersRouteNoId workersRouteNoId, final ApiCallback<WorkersRouteResponseSingle> _callback) throws ApiException {

        okhttp3.Call localVarCall = workerRoutesUpdateRouteValidateBeforeCall(routeId, zoneId, workersRouteNoId, _callback);
        Type localVarReturnType = new TypeToken<WorkersRouteResponseSingle>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
