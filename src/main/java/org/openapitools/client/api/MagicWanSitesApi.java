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


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.MagicApiResponseCommonFailure;
import org.openapitools.client.model.MagicSiteDeletedResponse;
import org.openapitools.client.model.MagicSiteModifiedResponse;
import org.openapitools.client.model.MagicSiteSingleResponse;
import org.openapitools.client.model.MagicSiteUpdateRequest;
import org.openapitools.client.model.MagicSitesAddSingleRequest;
import org.openapitools.client.model.MagicSitesCollectionResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MagicWanSitesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public MagicWanSitesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MagicWanSitesApi(ApiClient apiClient) {
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
     * Build call for magicSitesCreateSite
     * @param accountId  (required)
     * @param magicSitesAddSingleRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Site response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Site response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call magicSitesCreateSiteCall(String accountId, MagicSitesAddSingleRequest magicSitesAddSingleRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = magicSitesAddSingleRequest;

        // create path and map variables
        String localVarPath = "/accounts/{account_id}/magic/sites"
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
    private okhttp3.Call magicSitesCreateSiteValidateBeforeCall(String accountId, MagicSitesAddSingleRequest magicSitesAddSingleRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling magicSitesCreateSite(Async)");
        }

        // verify the required parameter 'magicSitesAddSingleRequest' is set
        if (magicSitesAddSingleRequest == null) {
            throw new ApiException("Missing the required parameter 'magicSitesAddSingleRequest' when calling magicSitesCreateSite(Async)");
        }

        return magicSitesCreateSiteCall(accountId, magicSitesAddSingleRequest, _callback);

    }

    /**
     * Create a new Site
     * Creates a new Site
     * @param accountId  (required)
     * @param magicSitesAddSingleRequest  (required)
     * @return MagicSiteSingleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Site response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Site response failure </td><td>  -  </td></tr>
     </table>
     */
    public MagicSiteSingleResponse magicSitesCreateSite(String accountId, MagicSitesAddSingleRequest magicSitesAddSingleRequest) throws ApiException {
        ApiResponse<MagicSiteSingleResponse> localVarResp = magicSitesCreateSiteWithHttpInfo(accountId, magicSitesAddSingleRequest);
        return localVarResp.getData();
    }

    /**
     * Create a new Site
     * Creates a new Site
     * @param accountId  (required)
     * @param magicSitesAddSingleRequest  (required)
     * @return ApiResponse&lt;MagicSiteSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Site response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Site response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MagicSiteSingleResponse> magicSitesCreateSiteWithHttpInfo(String accountId, MagicSitesAddSingleRequest magicSitesAddSingleRequest) throws ApiException {
        okhttp3.Call localVarCall = magicSitesCreateSiteValidateBeforeCall(accountId, magicSitesAddSingleRequest, null);
        Type localVarReturnType = new TypeToken<MagicSiteSingleResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a new Site (asynchronously)
     * Creates a new Site
     * @param accountId  (required)
     * @param magicSitesAddSingleRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Site response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Site response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call magicSitesCreateSiteAsync(String accountId, MagicSitesAddSingleRequest magicSitesAddSingleRequest, final ApiCallback<MagicSiteSingleResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = magicSitesCreateSiteValidateBeforeCall(accountId, magicSitesAddSingleRequest, _callback);
        Type localVarReturnType = new TypeToken<MagicSiteSingleResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for magicSitesDeleteSite
     * @param siteId  (required)
     * @param accountId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete Site response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete Site response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call magicSitesDeleteSiteCall(String siteId, String accountId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/magic/sites/{site_id}"
            .replace("{" + "site_id" + "}", localVarApiClient.escapeString(siteId.toString()))
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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call magicSitesDeleteSiteValidateBeforeCall(String siteId, String accountId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'siteId' is set
        if (siteId == null) {
            throw new ApiException("Missing the required parameter 'siteId' when calling magicSitesDeleteSite(Async)");
        }

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling magicSitesDeleteSite(Async)");
        }

        return magicSitesDeleteSiteCall(siteId, accountId, _callback);

    }

    /**
     * Delete Site
     * Remove a specific Site.
     * @param siteId  (required)
     * @param accountId  (required)
     * @return MagicSiteDeletedResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete Site response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete Site response failure </td><td>  -  </td></tr>
     </table>
     */
    public MagicSiteDeletedResponse magicSitesDeleteSite(String siteId, String accountId) throws ApiException {
        ApiResponse<MagicSiteDeletedResponse> localVarResp = magicSitesDeleteSiteWithHttpInfo(siteId, accountId);
        return localVarResp.getData();
    }

    /**
     * Delete Site
     * Remove a specific Site.
     * @param siteId  (required)
     * @param accountId  (required)
     * @return ApiResponse&lt;MagicSiteDeletedResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete Site response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete Site response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MagicSiteDeletedResponse> magicSitesDeleteSiteWithHttpInfo(String siteId, String accountId) throws ApiException {
        okhttp3.Call localVarCall = magicSitesDeleteSiteValidateBeforeCall(siteId, accountId, null);
        Type localVarReturnType = new TypeToken<MagicSiteDeletedResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete Site (asynchronously)
     * Remove a specific Site.
     * @param siteId  (required)
     * @param accountId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete Site response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete Site response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call magicSitesDeleteSiteAsync(String siteId, String accountId, final ApiCallback<MagicSiteDeletedResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = magicSitesDeleteSiteValidateBeforeCall(siteId, accountId, _callback);
        Type localVarReturnType = new TypeToken<MagicSiteDeletedResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for magicSitesSiteDetails
     * @param siteId  (required)
     * @param accountId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Site Details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Site Details response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call magicSitesSiteDetailsCall(String siteId, String accountId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/magic/sites/{site_id}"
            .replace("{" + "site_id" + "}", localVarApiClient.escapeString(siteId.toString()))
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

        String[] localVarAuthNames = new String[] { "api_key", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call magicSitesSiteDetailsValidateBeforeCall(String siteId, String accountId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'siteId' is set
        if (siteId == null) {
            throw new ApiException("Missing the required parameter 'siteId' when calling magicSitesSiteDetails(Async)");
        }

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling magicSitesSiteDetails(Async)");
        }

        return magicSitesSiteDetailsCall(siteId, accountId, _callback);

    }

    /**
     * Site Details
     * Get a specific Site.
     * @param siteId  (required)
     * @param accountId  (required)
     * @return MagicSiteSingleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Site Details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Site Details response failure </td><td>  -  </td></tr>
     </table>
     */
    public MagicSiteSingleResponse magicSitesSiteDetails(String siteId, String accountId) throws ApiException {
        ApiResponse<MagicSiteSingleResponse> localVarResp = magicSitesSiteDetailsWithHttpInfo(siteId, accountId);
        return localVarResp.getData();
    }

    /**
     * Site Details
     * Get a specific Site.
     * @param siteId  (required)
     * @param accountId  (required)
     * @return ApiResponse&lt;MagicSiteSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Site Details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Site Details response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MagicSiteSingleResponse> magicSitesSiteDetailsWithHttpInfo(String siteId, String accountId) throws ApiException {
        okhttp3.Call localVarCall = magicSitesSiteDetailsValidateBeforeCall(siteId, accountId, null);
        Type localVarReturnType = new TypeToken<MagicSiteSingleResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Site Details (asynchronously)
     * Get a specific Site.
     * @param siteId  (required)
     * @param accountId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Site Details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Site Details response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call magicSitesSiteDetailsAsync(String siteId, String accountId, final ApiCallback<MagicSiteSingleResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = magicSitesSiteDetailsValidateBeforeCall(siteId, accountId, _callback);
        Type localVarReturnType = new TypeToken<MagicSiteSingleResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for magicSitesUpdateSite
     * @param siteId  (required)
     * @param accountId  (required)
     * @param magicSiteUpdateRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Site response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Site response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call magicSitesUpdateSiteCall(String siteId, String accountId, MagicSiteUpdateRequest magicSiteUpdateRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = magicSiteUpdateRequest;

        // create path and map variables
        String localVarPath = "/accounts/{account_id}/magic/sites/{site_id}"
            .replace("{" + "site_id" + "}", localVarApiClient.escapeString(siteId.toString()))
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
    private okhttp3.Call magicSitesUpdateSiteValidateBeforeCall(String siteId, String accountId, MagicSiteUpdateRequest magicSiteUpdateRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'siteId' is set
        if (siteId == null) {
            throw new ApiException("Missing the required parameter 'siteId' when calling magicSitesUpdateSite(Async)");
        }

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling magicSitesUpdateSite(Async)");
        }

        // verify the required parameter 'magicSiteUpdateRequest' is set
        if (magicSiteUpdateRequest == null) {
            throw new ApiException("Missing the required parameter 'magicSiteUpdateRequest' when calling magicSitesUpdateSite(Async)");
        }

        return magicSitesUpdateSiteCall(siteId, accountId, magicSiteUpdateRequest, _callback);

    }

    /**
     * Update Site
     * Update a specific Site.
     * @param siteId  (required)
     * @param accountId  (required)
     * @param magicSiteUpdateRequest  (required)
     * @return MagicSiteModifiedResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Site response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Site response failure </td><td>  -  </td></tr>
     </table>
     */
    public MagicSiteModifiedResponse magicSitesUpdateSite(String siteId, String accountId, MagicSiteUpdateRequest magicSiteUpdateRequest) throws ApiException {
        ApiResponse<MagicSiteModifiedResponse> localVarResp = magicSitesUpdateSiteWithHttpInfo(siteId, accountId, magicSiteUpdateRequest);
        return localVarResp.getData();
    }

    /**
     * Update Site
     * Update a specific Site.
     * @param siteId  (required)
     * @param accountId  (required)
     * @param magicSiteUpdateRequest  (required)
     * @return ApiResponse&lt;MagicSiteModifiedResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Site response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Site response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MagicSiteModifiedResponse> magicSitesUpdateSiteWithHttpInfo(String siteId, String accountId, MagicSiteUpdateRequest magicSiteUpdateRequest) throws ApiException {
        okhttp3.Call localVarCall = magicSitesUpdateSiteValidateBeforeCall(siteId, accountId, magicSiteUpdateRequest, null);
        Type localVarReturnType = new TypeToken<MagicSiteModifiedResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Site (asynchronously)
     * Update a specific Site.
     * @param siteId  (required)
     * @param accountId  (required)
     * @param magicSiteUpdateRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Site response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Site response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call magicSitesUpdateSiteAsync(String siteId, String accountId, MagicSiteUpdateRequest magicSiteUpdateRequest, final ApiCallback<MagicSiteModifiedResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = magicSitesUpdateSiteValidateBeforeCall(siteId, accountId, magicSiteUpdateRequest, _callback);
        Type localVarReturnType = new TypeToken<MagicSiteModifiedResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for magicWanSitesListSites
     * @param accountId  (required)
     * @param connectorIdentifier  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Sites response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Sites response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call magicWanSitesListSitesCall(String accountId, String connectorIdentifier, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/magic/sites"
            .replace("{" + "account_id" + "}", localVarApiClient.escapeString(accountId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (connectorIdentifier != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("connector_identifier", connectorIdentifier));
        }

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
    private okhttp3.Call magicWanSitesListSitesValidateBeforeCall(String accountId, String connectorIdentifier, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling magicWanSitesListSites(Async)");
        }

        return magicWanSitesListSitesCall(accountId, connectorIdentifier, _callback);

    }

    /**
     * List Sites
     * Lists Sites associated with an account. Use connector_identifier query param to return sites where connector_identifier matches either site.ConnectorID or site.SecondaryConnectorID.
     * @param accountId  (required)
     * @param connectorIdentifier  (optional)
     * @return MagicSitesCollectionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Sites response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Sites response failure </td><td>  -  </td></tr>
     </table>
     */
    public MagicSitesCollectionResponse magicWanSitesListSites(String accountId, String connectorIdentifier) throws ApiException {
        ApiResponse<MagicSitesCollectionResponse> localVarResp = magicWanSitesListSitesWithHttpInfo(accountId, connectorIdentifier);
        return localVarResp.getData();
    }

    /**
     * List Sites
     * Lists Sites associated with an account. Use connector_identifier query param to return sites where connector_identifier matches either site.ConnectorID or site.SecondaryConnectorID.
     * @param accountId  (required)
     * @param connectorIdentifier  (optional)
     * @return ApiResponse&lt;MagicSitesCollectionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Sites response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Sites response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MagicSitesCollectionResponse> magicWanSitesListSitesWithHttpInfo(String accountId, String connectorIdentifier) throws ApiException {
        okhttp3.Call localVarCall = magicWanSitesListSitesValidateBeforeCall(accountId, connectorIdentifier, null);
        Type localVarReturnType = new TypeToken<MagicSitesCollectionResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Sites (asynchronously)
     * Lists Sites associated with an account. Use connector_identifier query param to return sites where connector_identifier matches either site.ConnectorID or site.SecondaryConnectorID.
     * @param accountId  (required)
     * @param connectorIdentifier  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Sites response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Sites response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call magicWanSitesListSitesAsync(String accountId, String connectorIdentifier, final ApiCallback<MagicSitesCollectionResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = magicWanSitesListSitesValidateBeforeCall(accountId, connectorIdentifier, _callback);
        Type localVarReturnType = new TypeToken<MagicSitesCollectionResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
