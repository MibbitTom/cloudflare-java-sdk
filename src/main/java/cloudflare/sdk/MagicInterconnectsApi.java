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


import cloudflare.sdk.models.MagicComponentsSchemasModifiedTunnelsCollectionResponse;
import cloudflare.sdk.models.MagicComponentsSchemasTunnelModifiedResponse;
import cloudflare.sdk.models.MagicComponentsSchemasTunnelSingleResponse;
import cloudflare.sdk.models.MagicComponentsSchemasTunnelUpdateRequest;
import cloudflare.sdk.models.MagicComponentsSchemasTunnelsCollectionResponse;
import cloudflare.sdk.models.MagicInterconnectsListInterconnectDetails4xxResponse;
import cloudflare.sdk.models.MagicInterconnectsListInterconnects4xxResponse;
import cloudflare.sdk.models.MagicInterconnectsUpdateInterconnect4xxResponse;
import cloudflare.sdk.models.MagicInterconnectsUpdateMultipleInterconnects4xxResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MagicInterconnectsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public MagicInterconnectsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MagicInterconnectsApi(ApiClient apiClient) {
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
     * Build call for magicInterconnectsListInterconnectDetails
     * @param tunnelIdentifier  (required)
     * @param accountId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List interconnect Details response </td><td>  -  </td></tr>
        <tr><td> 4xx </td><td> List interconnect Details response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call magicInterconnectsListInterconnectDetailsCall(String tunnelIdentifier, String accountId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/magic/cf_interconnects/{tunnel_identifier}"
            .replace("{" + "tunnel_identifier" + "}", localVarApiClient.escapeString(tunnelIdentifier.toString()))
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
    private okhttp3.Call magicInterconnectsListInterconnectDetailsValidateBeforeCall(String tunnelIdentifier, String accountId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'tunnelIdentifier' is set
        if (tunnelIdentifier == null) {
            throw new ApiException("Missing the required parameter 'tunnelIdentifier' when calling magicInterconnectsListInterconnectDetails(Async)");
        }

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling magicInterconnectsListInterconnectDetails(Async)");
        }

        return magicInterconnectsListInterconnectDetailsCall(tunnelIdentifier, accountId, _callback);

    }

    /**
     * List interconnect Details
     * Lists details for a specific interconnect.
     * @param tunnelIdentifier  (required)
     * @param accountId  (required)
     * @return MagicComponentsSchemasTunnelSingleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List interconnect Details response </td><td>  -  </td></tr>
        <tr><td> 4xx </td><td> List interconnect Details response failure </td><td>  -  </td></tr>
     </table>
     */
    public MagicComponentsSchemasTunnelSingleResponse magicInterconnectsListInterconnectDetails(String tunnelIdentifier, String accountId) throws ApiException {
        ApiResponse<MagicComponentsSchemasTunnelSingleResponse> localVarResp = magicInterconnectsListInterconnectDetailsWithHttpInfo(tunnelIdentifier, accountId);
        return localVarResp.getData();
    }

    /**
     * List interconnect Details
     * Lists details for a specific interconnect.
     * @param tunnelIdentifier  (required)
     * @param accountId  (required)
     * @return ApiResponse&lt;MagicComponentsSchemasTunnelSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List interconnect Details response </td><td>  -  </td></tr>
        <tr><td> 4xx </td><td> List interconnect Details response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MagicComponentsSchemasTunnelSingleResponse> magicInterconnectsListInterconnectDetailsWithHttpInfo(String tunnelIdentifier, String accountId) throws ApiException {
        okhttp3.Call localVarCall = magicInterconnectsListInterconnectDetailsValidateBeforeCall(tunnelIdentifier, accountId, null);
        Type localVarReturnType = new TypeToken<MagicComponentsSchemasTunnelSingleResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List interconnect Details (asynchronously)
     * Lists details for a specific interconnect.
     * @param tunnelIdentifier  (required)
     * @param accountId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List interconnect Details response </td><td>  -  </td></tr>
        <tr><td> 4xx </td><td> List interconnect Details response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call magicInterconnectsListInterconnectDetailsAsync(String tunnelIdentifier, String accountId, final ApiCallback<MagicComponentsSchemasTunnelSingleResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = magicInterconnectsListInterconnectDetailsValidateBeforeCall(tunnelIdentifier, accountId, _callback);
        Type localVarReturnType = new TypeToken<MagicComponentsSchemasTunnelSingleResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for magicInterconnectsListInterconnects
     * @param accountId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List interconnects response </td><td>  -  </td></tr>
        <tr><td> 4xx </td><td> List interconnects response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call magicInterconnectsListInterconnectsCall(String accountId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/magic/cf_interconnects"
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
    private okhttp3.Call magicInterconnectsListInterconnectsValidateBeforeCall(String accountId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling magicInterconnectsListInterconnects(Async)");
        }

        return magicInterconnectsListInterconnectsCall(accountId, _callback);

    }

    /**
     * List interconnects
     * Lists interconnects associated with an account.
     * @param accountId  (required)
     * @return MagicComponentsSchemasTunnelsCollectionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List interconnects response </td><td>  -  </td></tr>
        <tr><td> 4xx </td><td> List interconnects response failure </td><td>  -  </td></tr>
     </table>
     */
    public MagicComponentsSchemasTunnelsCollectionResponse magicInterconnectsListInterconnects(String accountId) throws ApiException {
        ApiResponse<MagicComponentsSchemasTunnelsCollectionResponse> localVarResp = magicInterconnectsListInterconnectsWithHttpInfo(accountId);
        return localVarResp.getData();
    }

    /**
     * List interconnects
     * Lists interconnects associated with an account.
     * @param accountId  (required)
     * @return ApiResponse&lt;MagicComponentsSchemasTunnelsCollectionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List interconnects response </td><td>  -  </td></tr>
        <tr><td> 4xx </td><td> List interconnects response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MagicComponentsSchemasTunnelsCollectionResponse> magicInterconnectsListInterconnectsWithHttpInfo(String accountId) throws ApiException {
        okhttp3.Call localVarCall = magicInterconnectsListInterconnectsValidateBeforeCall(accountId, null);
        Type localVarReturnType = new TypeToken<MagicComponentsSchemasTunnelsCollectionResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List interconnects (asynchronously)
     * Lists interconnects associated with an account.
     * @param accountId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List interconnects response </td><td>  -  </td></tr>
        <tr><td> 4xx </td><td> List interconnects response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call magicInterconnectsListInterconnectsAsync(String accountId, final ApiCallback<MagicComponentsSchemasTunnelsCollectionResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = magicInterconnectsListInterconnectsValidateBeforeCall(accountId, _callback);
        Type localVarReturnType = new TypeToken<MagicComponentsSchemasTunnelsCollectionResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for magicInterconnectsUpdateInterconnect
     * @param tunnelIdentifier  (required)
     * @param accountId  (required)
     * @param magicComponentsSchemasTunnelUpdateRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update interconnect response </td><td>  -  </td></tr>
        <tr><td> 4xx </td><td> Update interconnect response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call magicInterconnectsUpdateInterconnectCall(String tunnelIdentifier, String accountId, MagicComponentsSchemasTunnelUpdateRequest magicComponentsSchemasTunnelUpdateRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = magicComponentsSchemasTunnelUpdateRequest;

        // create path and map variables
        String localVarPath = "/accounts/{account_id}/magic/cf_interconnects/{tunnel_identifier}"
            .replace("{" + "tunnel_identifier" + "}", localVarApiClient.escapeString(tunnelIdentifier.toString()))
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
    private okhttp3.Call magicInterconnectsUpdateInterconnectValidateBeforeCall(String tunnelIdentifier, String accountId, MagicComponentsSchemasTunnelUpdateRequest magicComponentsSchemasTunnelUpdateRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'tunnelIdentifier' is set
        if (tunnelIdentifier == null) {
            throw new ApiException("Missing the required parameter 'tunnelIdentifier' when calling magicInterconnectsUpdateInterconnect(Async)");
        }

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling magicInterconnectsUpdateInterconnect(Async)");
        }

        // verify the required parameter 'magicComponentsSchemasTunnelUpdateRequest' is set
        if (magicComponentsSchemasTunnelUpdateRequest == null) {
            throw new ApiException("Missing the required parameter 'magicComponentsSchemasTunnelUpdateRequest' when calling magicInterconnectsUpdateInterconnect(Async)");
        }

        return magicInterconnectsUpdateInterconnectCall(tunnelIdentifier, accountId, magicComponentsSchemasTunnelUpdateRequest, _callback);

    }

    /**
     * Update interconnect
     * Updates a specific interconnect associated with an account. Use &#x60;?validate_only&#x3D;true&#x60; as an optional query parameter to only run validation without persisting changes.
     * @param tunnelIdentifier  (required)
     * @param accountId  (required)
     * @param magicComponentsSchemasTunnelUpdateRequest  (required)
     * @return MagicComponentsSchemasTunnelModifiedResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update interconnect response </td><td>  -  </td></tr>
        <tr><td> 4xx </td><td> Update interconnect response failure </td><td>  -  </td></tr>
     </table>
     */
    public MagicComponentsSchemasTunnelModifiedResponse magicInterconnectsUpdateInterconnect(String tunnelIdentifier, String accountId, MagicComponentsSchemasTunnelUpdateRequest magicComponentsSchemasTunnelUpdateRequest) throws ApiException {
        ApiResponse<MagicComponentsSchemasTunnelModifiedResponse> localVarResp = magicInterconnectsUpdateInterconnectWithHttpInfo(tunnelIdentifier, accountId, magicComponentsSchemasTunnelUpdateRequest);
        return localVarResp.getData();
    }

    /**
     * Update interconnect
     * Updates a specific interconnect associated with an account. Use &#x60;?validate_only&#x3D;true&#x60; as an optional query parameter to only run validation without persisting changes.
     * @param tunnelIdentifier  (required)
     * @param accountId  (required)
     * @param magicComponentsSchemasTunnelUpdateRequest  (required)
     * @return ApiResponse&lt;MagicComponentsSchemasTunnelModifiedResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update interconnect response </td><td>  -  </td></tr>
        <tr><td> 4xx </td><td> Update interconnect response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MagicComponentsSchemasTunnelModifiedResponse> magicInterconnectsUpdateInterconnectWithHttpInfo(String tunnelIdentifier, String accountId, MagicComponentsSchemasTunnelUpdateRequest magicComponentsSchemasTunnelUpdateRequest) throws ApiException {
        okhttp3.Call localVarCall = magicInterconnectsUpdateInterconnectValidateBeforeCall(tunnelIdentifier, accountId, magicComponentsSchemasTunnelUpdateRequest, null);
        Type localVarReturnType = new TypeToken<MagicComponentsSchemasTunnelModifiedResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update interconnect (asynchronously)
     * Updates a specific interconnect associated with an account. Use &#x60;?validate_only&#x3D;true&#x60; as an optional query parameter to only run validation without persisting changes.
     * @param tunnelIdentifier  (required)
     * @param accountId  (required)
     * @param magicComponentsSchemasTunnelUpdateRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update interconnect response </td><td>  -  </td></tr>
        <tr><td> 4xx </td><td> Update interconnect response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call magicInterconnectsUpdateInterconnectAsync(String tunnelIdentifier, String accountId, MagicComponentsSchemasTunnelUpdateRequest magicComponentsSchemasTunnelUpdateRequest, final ApiCallback<MagicComponentsSchemasTunnelModifiedResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = magicInterconnectsUpdateInterconnectValidateBeforeCall(tunnelIdentifier, accountId, magicComponentsSchemasTunnelUpdateRequest, _callback);
        Type localVarReturnType = new TypeToken<MagicComponentsSchemasTunnelModifiedResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for magicInterconnectsUpdateMultipleInterconnects
     * @param accountId  (required)
     * @param body  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update multiple interconnects response </td><td>  -  </td></tr>
        <tr><td> 4xx </td><td> Update multiple interconnects response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call magicInterconnectsUpdateMultipleInterconnectsCall(String accountId, Object body, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/accounts/{account_id}/magic/cf_interconnects"
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
    private okhttp3.Call magicInterconnectsUpdateMultipleInterconnectsValidateBeforeCall(String accountId, Object body, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling magicInterconnectsUpdateMultipleInterconnects(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling magicInterconnectsUpdateMultipleInterconnects(Async)");
        }

        return magicInterconnectsUpdateMultipleInterconnectsCall(accountId, body, _callback);

    }

    /**
     * Update multiple interconnects
     * Updates multiple interconnects associated with an account. Use &#x60;?validate_only&#x3D;true&#x60; as an optional query parameter to only run validation without persisting changes.
     * @param accountId  (required)
     * @param body  (required)
     * @return MagicComponentsSchemasModifiedTunnelsCollectionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update multiple interconnects response </td><td>  -  </td></tr>
        <tr><td> 4xx </td><td> Update multiple interconnects response failure </td><td>  -  </td></tr>
     </table>
     */
    public MagicComponentsSchemasModifiedTunnelsCollectionResponse magicInterconnectsUpdateMultipleInterconnects(String accountId, Object body) throws ApiException {
        ApiResponse<MagicComponentsSchemasModifiedTunnelsCollectionResponse> localVarResp = magicInterconnectsUpdateMultipleInterconnectsWithHttpInfo(accountId, body);
        return localVarResp.getData();
    }

    /**
     * Update multiple interconnects
     * Updates multiple interconnects associated with an account. Use &#x60;?validate_only&#x3D;true&#x60; as an optional query parameter to only run validation without persisting changes.
     * @param accountId  (required)
     * @param body  (required)
     * @return ApiResponse&lt;MagicComponentsSchemasModifiedTunnelsCollectionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update multiple interconnects response </td><td>  -  </td></tr>
        <tr><td> 4xx </td><td> Update multiple interconnects response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MagicComponentsSchemasModifiedTunnelsCollectionResponse> magicInterconnectsUpdateMultipleInterconnectsWithHttpInfo(String accountId, Object body) throws ApiException {
        okhttp3.Call localVarCall = magicInterconnectsUpdateMultipleInterconnectsValidateBeforeCall(accountId, body, null);
        Type localVarReturnType = new TypeToken<MagicComponentsSchemasModifiedTunnelsCollectionResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update multiple interconnects (asynchronously)
     * Updates multiple interconnects associated with an account. Use &#x60;?validate_only&#x3D;true&#x60; as an optional query parameter to only run validation without persisting changes.
     * @param accountId  (required)
     * @param body  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update multiple interconnects response </td><td>  -  </td></tr>
        <tr><td> 4xx </td><td> Update multiple interconnects response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call magicInterconnectsUpdateMultipleInterconnectsAsync(String accountId, Object body, final ApiCallback<MagicComponentsSchemasModifiedTunnelsCollectionResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = magicInterconnectsUpdateMultipleInterconnectsValidateBeforeCall(accountId, body, _callback);
        Type localVarReturnType = new TypeToken<MagicComponentsSchemasModifiedTunnelsCollectionResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
