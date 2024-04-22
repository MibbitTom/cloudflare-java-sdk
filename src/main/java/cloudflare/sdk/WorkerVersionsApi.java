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


import java.io.File;
import cloudflare.sdk.models.WorkerVersionsListVersions4XXResponse;
import cloudflare.sdk.models.WorkerVersionsUploadVersion4XXResponse;
import cloudflare.sdk.models.WorkerVersionsUploadVersionRequestMetadata;
import cloudflare.sdk.models.WorkersVersionsListResponse;
import cloudflare.sdk.models.WorkersVersionsSingleResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorkerVersionsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public WorkerVersionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WorkerVersionsApi(ApiClient apiClient) {
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
     * Build call for workerVersionsGetVersionDetail
     * @param versionId  (required)
     * @param scriptName  (required)
     * @param accountId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get Version Detail response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get Version Detail response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call workerVersionsGetVersionDetailCall(String versionId, String scriptName, String accountId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/workers/scripts/{script_name}/versions/{version_id}"
            .replace("{" + "version_id" + "}", localVarApiClient.escapeString(versionId.toString()))
            .replace("{" + "script_name" + "}", localVarApiClient.escapeString(scriptName.toString()))
            .replace("{" + "account_id" + "}", localVarApiClient.escapeString(accountId.toString()));

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
    private okhttp3.Call workerVersionsGetVersionDetailValidateBeforeCall(String versionId, String scriptName, String accountId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'versionId' is set
        if (versionId == null) {
            throw new ApiException("Missing the required parameter 'versionId' when calling workerVersionsGetVersionDetail(Async)");
        }

        // verify the required parameter 'scriptName' is set
        if (scriptName == null) {
            throw new ApiException("Missing the required parameter 'scriptName' when calling workerVersionsGetVersionDetail(Async)");
        }

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling workerVersionsGetVersionDetail(Async)");
        }

        return workerVersionsGetVersionDetailCall(versionId, scriptName, accountId, _callback);

    }

    /**
     * Get Version Detail
     * 
     * @param versionId  (required)
     * @param scriptName  (required)
     * @param accountId  (required)
     * @return WorkersVersionsSingleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get Version Detail response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get Version Detail response failure </td><td>  -  </td></tr>
     </table>
     */
    public WorkersVersionsSingleResponse workerVersionsGetVersionDetail(String versionId, String scriptName, String accountId) throws ApiException {
        ApiResponse<WorkersVersionsSingleResponse> localVarResp = workerVersionsGetVersionDetailWithHttpInfo(versionId, scriptName, accountId);
        return localVarResp.getData();
    }

    /**
     * Get Version Detail
     * 
     * @param versionId  (required)
     * @param scriptName  (required)
     * @param accountId  (required)
     * @return ApiResponse&lt;WorkersVersionsSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get Version Detail response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get Version Detail response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<WorkersVersionsSingleResponse> workerVersionsGetVersionDetailWithHttpInfo(String versionId, String scriptName, String accountId) throws ApiException {
        okhttp3.Call localVarCall = workerVersionsGetVersionDetailValidateBeforeCall(versionId, scriptName, accountId, null);
        Type localVarReturnType = new TypeToken<WorkersVersionsSingleResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Version Detail (asynchronously)
     * 
     * @param versionId  (required)
     * @param scriptName  (required)
     * @param accountId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get Version Detail response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get Version Detail response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call workerVersionsGetVersionDetailAsync(String versionId, String scriptName, String accountId, final ApiCallback<WorkersVersionsSingleResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = workerVersionsGetVersionDetailValidateBeforeCall(versionId, scriptName, accountId, _callback);
        Type localVarReturnType = new TypeToken<WorkersVersionsSingleResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for workerVersionsListVersions
     * @param scriptName  (required)
     * @param accountId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Versions response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Versions response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call workerVersionsListVersionsCall(String scriptName, String accountId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/workers/scripts/{script_name}/versions"
            .replace("{" + "script_name" + "}", localVarApiClient.escapeString(scriptName.toString()))
            .replace("{" + "account_id" + "}", localVarApiClient.escapeString(accountId.toString()));

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
    private okhttp3.Call workerVersionsListVersionsValidateBeforeCall(String scriptName, String accountId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'scriptName' is set
        if (scriptName == null) {
            throw new ApiException("Missing the required parameter 'scriptName' when calling workerVersionsListVersions(Async)");
        }

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling workerVersionsListVersions(Async)");
        }

        return workerVersionsListVersionsCall(scriptName, accountId, _callback);

    }

    /**
     * List Versions
     * List of Worker Versions. The first version in the list is the latest version.
     * @param scriptName  (required)
     * @param accountId  (required)
     * @return WorkersVersionsListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Versions response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Versions response failure </td><td>  -  </td></tr>
     </table>
     */
    public WorkersVersionsListResponse workerVersionsListVersions(String scriptName, String accountId) throws ApiException {
        ApiResponse<WorkersVersionsListResponse> localVarResp = workerVersionsListVersionsWithHttpInfo(scriptName, accountId);
        return localVarResp.getData();
    }

    /**
     * List Versions
     * List of Worker Versions. The first version in the list is the latest version.
     * @param scriptName  (required)
     * @param accountId  (required)
     * @return ApiResponse&lt;WorkersVersionsListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Versions response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Versions response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<WorkersVersionsListResponse> workerVersionsListVersionsWithHttpInfo(String scriptName, String accountId) throws ApiException {
        okhttp3.Call localVarCall = workerVersionsListVersionsValidateBeforeCall(scriptName, accountId, null);
        Type localVarReturnType = new TypeToken<WorkersVersionsListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Versions (asynchronously)
     * List of Worker Versions. The first version in the list is the latest version.
     * @param scriptName  (required)
     * @param accountId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Versions response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Versions response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call workerVersionsListVersionsAsync(String scriptName, String accountId, final ApiCallback<WorkersVersionsListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = workerVersionsListVersionsValidateBeforeCall(scriptName, accountId, _callback);
        Type localVarReturnType = new TypeToken<WorkersVersionsListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for workerVersionsUploadVersion
     * @param scriptName  (required)
     * @param accountId  (required)
     * @param lessThanAnyPartNameGreaterThan A module comprising a Worker script, often a javascript file. Multiple modules may be provided as separate named parts, but at least one module must be present and referenced in the metadata as &#x60;main_module&#x60;. (optional)
     * @param metadata  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Upload Version response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Upload Version response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call workerVersionsUploadVersionCall(String scriptName, String accountId, List<File> lessThanAnyPartNameGreaterThan, WorkerVersionsUploadVersionRequestMetadata metadata, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/workers/scripts/{script_name}/versions"
            .replace("{" + "script_name" + "}", localVarApiClient.escapeString(scriptName.toString()))
            .replace("{" + "account_id" + "}", localVarApiClient.escapeString(accountId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (lessThanAnyPartNameGreaterThan != null) {
            localVarFormParams.put("&lt;any part name&gt;", lessThanAnyPartNameGreaterThan);
        }

        if (metadata != null) {
            localVarFormParams.put("metadata", metadata);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key", "api_token", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call workerVersionsUploadVersionValidateBeforeCall(String scriptName, String accountId, List<File> lessThanAnyPartNameGreaterThan, WorkerVersionsUploadVersionRequestMetadata metadata, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'scriptName' is set
        if (scriptName == null) {
            throw new ApiException("Missing the required parameter 'scriptName' when calling workerVersionsUploadVersion(Async)");
        }

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling workerVersionsUploadVersion(Async)");
        }

        return workerVersionsUploadVersionCall(scriptName, accountId, lessThanAnyPartNameGreaterThan, metadata, _callback);

    }

    /**
     * Upload Version
     * Upload a Worker Version without deploying to Cloudflare&#39;s network.
     * @param scriptName  (required)
     * @param accountId  (required)
     * @param lessThanAnyPartNameGreaterThan A module comprising a Worker script, often a javascript file. Multiple modules may be provided as separate named parts, but at least one module must be present and referenced in the metadata as &#x60;main_module&#x60;. (optional)
     * @param metadata  (optional)
     * @return WorkersVersionsSingleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Upload Version response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Upload Version response failure </td><td>  -  </td></tr>
     </table>
     */
    public WorkersVersionsSingleResponse workerVersionsUploadVersion(String scriptName, String accountId, List<File> lessThanAnyPartNameGreaterThan, WorkerVersionsUploadVersionRequestMetadata metadata) throws ApiException {
        ApiResponse<WorkersVersionsSingleResponse> localVarResp = workerVersionsUploadVersionWithHttpInfo(scriptName, accountId, lessThanAnyPartNameGreaterThan, metadata);
        return localVarResp.getData();
    }

    /**
     * Upload Version
     * Upload a Worker Version without deploying to Cloudflare&#39;s network.
     * @param scriptName  (required)
     * @param accountId  (required)
     * @param lessThanAnyPartNameGreaterThan A module comprising a Worker script, often a javascript file. Multiple modules may be provided as separate named parts, but at least one module must be present and referenced in the metadata as &#x60;main_module&#x60;. (optional)
     * @param metadata  (optional)
     * @return ApiResponse&lt;WorkersVersionsSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Upload Version response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Upload Version response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<WorkersVersionsSingleResponse> workerVersionsUploadVersionWithHttpInfo(String scriptName, String accountId, List<File> lessThanAnyPartNameGreaterThan, WorkerVersionsUploadVersionRequestMetadata metadata) throws ApiException {
        okhttp3.Call localVarCall = workerVersionsUploadVersionValidateBeforeCall(scriptName, accountId, lessThanAnyPartNameGreaterThan, metadata, null);
        Type localVarReturnType = new TypeToken<WorkersVersionsSingleResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Upload Version (asynchronously)
     * Upload a Worker Version without deploying to Cloudflare&#39;s network.
     * @param scriptName  (required)
     * @param accountId  (required)
     * @param lessThanAnyPartNameGreaterThan A module comprising a Worker script, often a javascript file. Multiple modules may be provided as separate named parts, but at least one module must be present and referenced in the metadata as &#x60;main_module&#x60;. (optional)
     * @param metadata  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Upload Version response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Upload Version response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call workerVersionsUploadVersionAsync(String scriptName, String accountId, List<File> lessThanAnyPartNameGreaterThan, WorkerVersionsUploadVersionRequestMetadata metadata, final ApiCallback<WorkersVersionsSingleResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = workerVersionsUploadVersionValidateBeforeCall(scriptName, accountId, lessThanAnyPartNameGreaterThan, metadata, _callback);
        Type localVarReturnType = new TypeToken<WorkersVersionsSingleResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}