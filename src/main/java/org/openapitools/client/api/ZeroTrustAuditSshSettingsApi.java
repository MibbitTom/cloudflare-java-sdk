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


import org.openapitools.client.model.ZeroTrustGatewayAuditSshSettingsComponentsSchemasSingleResponse;
import org.openapitools.client.model.ZeroTrustGetAuditSshSettings4XXResponse;
import org.openapitools.client.model.ZeroTrustUpdateAuditSshSettingsRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZeroTrustAuditSshSettingsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ZeroTrustAuditSshSettingsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ZeroTrustAuditSshSettingsApi(ApiClient apiClient) {
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
     * Build call for zeroTrustGetAuditSshSettings
     * @param accountId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get Zero Trust Audit SSH settings response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get Zero Trust Audit SSH Settings response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call zeroTrustGetAuditSshSettingsCall(Object accountId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/gateway/audit_ssh_settings"
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
    private okhttp3.Call zeroTrustGetAuditSshSettingsValidateBeforeCall(Object accountId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling zeroTrustGetAuditSshSettings(Async)");
        }

        return zeroTrustGetAuditSshSettingsCall(accountId, _callback);

    }

    /**
     * Get Zero Trust Audit SSH settings
     * Get all Zero Trust Audit SSH settings for an account.
     * @param accountId  (required)
     * @return ZeroTrustGatewayAuditSshSettingsComponentsSchemasSingleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get Zero Trust Audit SSH settings response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get Zero Trust Audit SSH Settings response failure </td><td>  -  </td></tr>
     </table>
     */
    public ZeroTrustGatewayAuditSshSettingsComponentsSchemasSingleResponse zeroTrustGetAuditSshSettings(Object accountId) throws ApiException {
        ApiResponse<ZeroTrustGatewayAuditSshSettingsComponentsSchemasSingleResponse> localVarResp = zeroTrustGetAuditSshSettingsWithHttpInfo(accountId);
        return localVarResp.getData();
    }

    /**
     * Get Zero Trust Audit SSH settings
     * Get all Zero Trust Audit SSH settings for an account.
     * @param accountId  (required)
     * @return ApiResponse&lt;ZeroTrustGatewayAuditSshSettingsComponentsSchemasSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get Zero Trust Audit SSH settings response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get Zero Trust Audit SSH Settings response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ZeroTrustGatewayAuditSshSettingsComponentsSchemasSingleResponse> zeroTrustGetAuditSshSettingsWithHttpInfo(Object accountId) throws ApiException {
        okhttp3.Call localVarCall = zeroTrustGetAuditSshSettingsValidateBeforeCall(accountId, null);
        Type localVarReturnType = new TypeToken<ZeroTrustGatewayAuditSshSettingsComponentsSchemasSingleResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Zero Trust Audit SSH settings (asynchronously)
     * Get all Zero Trust Audit SSH settings for an account.
     * @param accountId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get Zero Trust Audit SSH settings response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get Zero Trust Audit SSH Settings response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call zeroTrustGetAuditSshSettingsAsync(Object accountId, final ApiCallback<ZeroTrustGatewayAuditSshSettingsComponentsSchemasSingleResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = zeroTrustGetAuditSshSettingsValidateBeforeCall(accountId, _callback);
        Type localVarReturnType = new TypeToken<ZeroTrustGatewayAuditSshSettingsComponentsSchemasSingleResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for zeroTrustUpdateAuditSshSettings
     * @param accountId  (required)
     * @param zeroTrustUpdateAuditSshSettingsRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Zero Trust Audit SSH Setting response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Zero Trust Audit SSH Setting response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call zeroTrustUpdateAuditSshSettingsCall(Object accountId, ZeroTrustUpdateAuditSshSettingsRequest zeroTrustUpdateAuditSshSettingsRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = zeroTrustUpdateAuditSshSettingsRequest;

        // create path and map variables
        String localVarPath = "/accounts/{account_id}/gateway/audit_ssh_settings"
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
    private okhttp3.Call zeroTrustUpdateAuditSshSettingsValidateBeforeCall(Object accountId, ZeroTrustUpdateAuditSshSettingsRequest zeroTrustUpdateAuditSshSettingsRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling zeroTrustUpdateAuditSshSettings(Async)");
        }

        // verify the required parameter 'zeroTrustUpdateAuditSshSettingsRequest' is set
        if (zeroTrustUpdateAuditSshSettingsRequest == null) {
            throw new ApiException("Missing the required parameter 'zeroTrustUpdateAuditSshSettingsRequest' when calling zeroTrustUpdateAuditSshSettings(Async)");
        }

        return zeroTrustUpdateAuditSshSettingsCall(accountId, zeroTrustUpdateAuditSshSettingsRequest, _callback);

    }

    /**
     * Update Zero Trust Audit SSH settings
     * Updates Zero Trust Audit SSH settings.
     * @param accountId  (required)
     * @param zeroTrustUpdateAuditSshSettingsRequest  (required)
     * @return ZeroTrustGatewayAuditSshSettingsComponentsSchemasSingleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Zero Trust Audit SSH Setting response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Zero Trust Audit SSH Setting response failure </td><td>  -  </td></tr>
     </table>
     */
    public ZeroTrustGatewayAuditSshSettingsComponentsSchemasSingleResponse zeroTrustUpdateAuditSshSettings(Object accountId, ZeroTrustUpdateAuditSshSettingsRequest zeroTrustUpdateAuditSshSettingsRequest) throws ApiException {
        ApiResponse<ZeroTrustGatewayAuditSshSettingsComponentsSchemasSingleResponse> localVarResp = zeroTrustUpdateAuditSshSettingsWithHttpInfo(accountId, zeroTrustUpdateAuditSshSettingsRequest);
        return localVarResp.getData();
    }

    /**
     * Update Zero Trust Audit SSH settings
     * Updates Zero Trust Audit SSH settings.
     * @param accountId  (required)
     * @param zeroTrustUpdateAuditSshSettingsRequest  (required)
     * @return ApiResponse&lt;ZeroTrustGatewayAuditSshSettingsComponentsSchemasSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Zero Trust Audit SSH Setting response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Zero Trust Audit SSH Setting response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ZeroTrustGatewayAuditSshSettingsComponentsSchemasSingleResponse> zeroTrustUpdateAuditSshSettingsWithHttpInfo(Object accountId, ZeroTrustUpdateAuditSshSettingsRequest zeroTrustUpdateAuditSshSettingsRequest) throws ApiException {
        okhttp3.Call localVarCall = zeroTrustUpdateAuditSshSettingsValidateBeforeCall(accountId, zeroTrustUpdateAuditSshSettingsRequest, null);
        Type localVarReturnType = new TypeToken<ZeroTrustGatewayAuditSshSettingsComponentsSchemasSingleResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Zero Trust Audit SSH settings (asynchronously)
     * Updates Zero Trust Audit SSH settings.
     * @param accountId  (required)
     * @param zeroTrustUpdateAuditSshSettingsRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Zero Trust Audit SSH Setting response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Zero Trust Audit SSH Setting response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call zeroTrustUpdateAuditSshSettingsAsync(Object accountId, ZeroTrustUpdateAuditSshSettingsRequest zeroTrustUpdateAuditSshSettingsRequest, final ApiCallback<ZeroTrustGatewayAuditSshSettingsComponentsSchemasSingleResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = zeroTrustUpdateAuditSshSettingsValidateBeforeCall(accountId, zeroTrustUpdateAuditSshSettingsRequest, _callback);
        Type localVarReturnType = new TypeToken<ZeroTrustGatewayAuditSshSettingsComponentsSchemasSingleResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
