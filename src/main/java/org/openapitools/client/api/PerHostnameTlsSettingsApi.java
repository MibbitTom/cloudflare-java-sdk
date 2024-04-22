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


import org.openapitools.client.model.PerHostnameTlsSettingsDelete4XXResponse;
import org.openapitools.client.model.PerHostnameTlsSettingsList4XXResponse;
import org.openapitools.client.model.PerHostnameTlsSettingsPut4XXResponse;
import org.openapitools.client.model.PerHostnameTlsSettingsPutRequest;
import org.openapitools.client.model.TlsCertificatesAndHostnamesPerHostnameSettingsResponse;
import org.openapitools.client.model.TlsCertificatesAndHostnamesPerHostnameSettingsResponseCollection;
import org.openapitools.client.model.TlsCertificatesAndHostnamesPerHostnameSettingsResponseDelete;
import org.openapitools.client.model.TlsCertificatesAndHostnamesSettingId;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PerHostnameTlsSettingsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PerHostnameTlsSettingsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PerHostnameTlsSettingsApi(ApiClient apiClient) {
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
     * Build call for perHostnameTlsSettingsDelete
     * @param zoneId  (required)
     * @param settingId  (required)
     * @param hostname  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete TLS setting for hostname response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete TLS setting for hostname response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call perHostnameTlsSettingsDeleteCall(String zoneId, TlsCertificatesAndHostnamesSettingId settingId, String hostname, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/zones/{zone_id}/hostnames/settings/{setting_id}/{hostname}"
            .replace("{" + "zone_id" + "}", localVarApiClient.escapeString(zoneId.toString()))
            .replace("{" + "setting_id" + "}", localVarApiClient.escapeString(settingId.toString()))
            .replace("{" + "hostname" + "}", localVarApiClient.escapeString(hostname.toString()));

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
    private okhttp3.Call perHostnameTlsSettingsDeleteValidateBeforeCall(String zoneId, TlsCertificatesAndHostnamesSettingId settingId, String hostname, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling perHostnameTlsSettingsDelete(Async)");
        }

        // verify the required parameter 'settingId' is set
        if (settingId == null) {
            throw new ApiException("Missing the required parameter 'settingId' when calling perHostnameTlsSettingsDelete(Async)");
        }

        // verify the required parameter 'hostname' is set
        if (hostname == null) {
            throw new ApiException("Missing the required parameter 'hostname' when calling perHostnameTlsSettingsDelete(Async)");
        }

        return perHostnameTlsSettingsDeleteCall(zoneId, settingId, hostname, _callback);

    }

    /**
     * Delete TLS setting for hostname
     * Delete the tls setting value for the hostname.
     * @param zoneId  (required)
     * @param settingId  (required)
     * @param hostname  (required)
     * @return TlsCertificatesAndHostnamesPerHostnameSettingsResponseDelete
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete TLS setting for hostname response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete TLS setting for hostname response failure </td><td>  -  </td></tr>
     </table>
     */
    public TlsCertificatesAndHostnamesPerHostnameSettingsResponseDelete perHostnameTlsSettingsDelete(String zoneId, TlsCertificatesAndHostnamesSettingId settingId, String hostname) throws ApiException {
        ApiResponse<TlsCertificatesAndHostnamesPerHostnameSettingsResponseDelete> localVarResp = perHostnameTlsSettingsDeleteWithHttpInfo(zoneId, settingId, hostname);
        return localVarResp.getData();
    }

    /**
     * Delete TLS setting for hostname
     * Delete the tls setting value for the hostname.
     * @param zoneId  (required)
     * @param settingId  (required)
     * @param hostname  (required)
     * @return ApiResponse&lt;TlsCertificatesAndHostnamesPerHostnameSettingsResponseDelete&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete TLS setting for hostname response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete TLS setting for hostname response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TlsCertificatesAndHostnamesPerHostnameSettingsResponseDelete> perHostnameTlsSettingsDeleteWithHttpInfo(String zoneId, TlsCertificatesAndHostnamesSettingId settingId, String hostname) throws ApiException {
        okhttp3.Call localVarCall = perHostnameTlsSettingsDeleteValidateBeforeCall(zoneId, settingId, hostname, null);
        Type localVarReturnType = new TypeToken<TlsCertificatesAndHostnamesPerHostnameSettingsResponseDelete>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete TLS setting for hostname (asynchronously)
     * Delete the tls setting value for the hostname.
     * @param zoneId  (required)
     * @param settingId  (required)
     * @param hostname  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete TLS setting for hostname response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete TLS setting for hostname response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call perHostnameTlsSettingsDeleteAsync(String zoneId, TlsCertificatesAndHostnamesSettingId settingId, String hostname, final ApiCallback<TlsCertificatesAndHostnamesPerHostnameSettingsResponseDelete> _callback) throws ApiException {

        okhttp3.Call localVarCall = perHostnameTlsSettingsDeleteValidateBeforeCall(zoneId, settingId, hostname, _callback);
        Type localVarReturnType = new TypeToken<TlsCertificatesAndHostnamesPerHostnameSettingsResponseDelete>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for perHostnameTlsSettingsList
     * @param zoneId  (required)
     * @param settingId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List per-hostname TLS settings response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List per-hostname TLS settings response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call perHostnameTlsSettingsListCall(String zoneId, TlsCertificatesAndHostnamesSettingId settingId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/zones/{zone_id}/hostnames/settings/{setting_id}"
            .replace("{" + "zone_id" + "}", localVarApiClient.escapeString(zoneId.toString()))
            .replace("{" + "setting_id" + "}", localVarApiClient.escapeString(settingId.toString()));

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
    private okhttp3.Call perHostnameTlsSettingsListValidateBeforeCall(String zoneId, TlsCertificatesAndHostnamesSettingId settingId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling perHostnameTlsSettingsList(Async)");
        }

        // verify the required parameter 'settingId' is set
        if (settingId == null) {
            throw new ApiException("Missing the required parameter 'settingId' when calling perHostnameTlsSettingsList(Async)");
        }

        return perHostnameTlsSettingsListCall(zoneId, settingId, _callback);

    }

    /**
     * List TLS setting for hostnames
     * List the requested TLS setting for the hostnames under this zone.
     * @param zoneId  (required)
     * @param settingId  (required)
     * @return TlsCertificatesAndHostnamesPerHostnameSettingsResponseCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List per-hostname TLS settings response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List per-hostname TLS settings response failure </td><td>  -  </td></tr>
     </table>
     */
    public TlsCertificatesAndHostnamesPerHostnameSettingsResponseCollection perHostnameTlsSettingsList(String zoneId, TlsCertificatesAndHostnamesSettingId settingId) throws ApiException {
        ApiResponse<TlsCertificatesAndHostnamesPerHostnameSettingsResponseCollection> localVarResp = perHostnameTlsSettingsListWithHttpInfo(zoneId, settingId);
        return localVarResp.getData();
    }

    /**
     * List TLS setting for hostnames
     * List the requested TLS setting for the hostnames under this zone.
     * @param zoneId  (required)
     * @param settingId  (required)
     * @return ApiResponse&lt;TlsCertificatesAndHostnamesPerHostnameSettingsResponseCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List per-hostname TLS settings response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List per-hostname TLS settings response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TlsCertificatesAndHostnamesPerHostnameSettingsResponseCollection> perHostnameTlsSettingsListWithHttpInfo(String zoneId, TlsCertificatesAndHostnamesSettingId settingId) throws ApiException {
        okhttp3.Call localVarCall = perHostnameTlsSettingsListValidateBeforeCall(zoneId, settingId, null);
        Type localVarReturnType = new TypeToken<TlsCertificatesAndHostnamesPerHostnameSettingsResponseCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List TLS setting for hostnames (asynchronously)
     * List the requested TLS setting for the hostnames under this zone.
     * @param zoneId  (required)
     * @param settingId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List per-hostname TLS settings response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List per-hostname TLS settings response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call perHostnameTlsSettingsListAsync(String zoneId, TlsCertificatesAndHostnamesSettingId settingId, final ApiCallback<TlsCertificatesAndHostnamesPerHostnameSettingsResponseCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = perHostnameTlsSettingsListValidateBeforeCall(zoneId, settingId, _callback);
        Type localVarReturnType = new TypeToken<TlsCertificatesAndHostnamesPerHostnameSettingsResponseCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for perHostnameTlsSettingsPut
     * @param zoneId  (required)
     * @param settingId  (required)
     * @param hostname  (required)
     * @param perHostnameTlsSettingsPutRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Edit TLS setting for hostname response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Edit TLS setting for hostname response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call perHostnameTlsSettingsPutCall(String zoneId, TlsCertificatesAndHostnamesSettingId settingId, String hostname, PerHostnameTlsSettingsPutRequest perHostnameTlsSettingsPutRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = perHostnameTlsSettingsPutRequest;

        // create path and map variables
        String localVarPath = "/zones/{zone_id}/hostnames/settings/{setting_id}/{hostname}"
            .replace("{" + "zone_id" + "}", localVarApiClient.escapeString(zoneId.toString()))
            .replace("{" + "setting_id" + "}", localVarApiClient.escapeString(settingId.toString()))
            .replace("{" + "hostname" + "}", localVarApiClient.escapeString(hostname.toString()));

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
    private okhttp3.Call perHostnameTlsSettingsPutValidateBeforeCall(String zoneId, TlsCertificatesAndHostnamesSettingId settingId, String hostname, PerHostnameTlsSettingsPutRequest perHostnameTlsSettingsPutRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling perHostnameTlsSettingsPut(Async)");
        }

        // verify the required parameter 'settingId' is set
        if (settingId == null) {
            throw new ApiException("Missing the required parameter 'settingId' when calling perHostnameTlsSettingsPut(Async)");
        }

        // verify the required parameter 'hostname' is set
        if (hostname == null) {
            throw new ApiException("Missing the required parameter 'hostname' when calling perHostnameTlsSettingsPut(Async)");
        }

        // verify the required parameter 'perHostnameTlsSettingsPutRequest' is set
        if (perHostnameTlsSettingsPutRequest == null) {
            throw new ApiException("Missing the required parameter 'perHostnameTlsSettingsPutRequest' when calling perHostnameTlsSettingsPut(Async)");
        }

        return perHostnameTlsSettingsPutCall(zoneId, settingId, hostname, perHostnameTlsSettingsPutRequest, _callback);

    }

    /**
     * Edit TLS setting for hostname
     * Update the tls setting value for the hostname.
     * @param zoneId  (required)
     * @param settingId  (required)
     * @param hostname  (required)
     * @param perHostnameTlsSettingsPutRequest  (required)
     * @return TlsCertificatesAndHostnamesPerHostnameSettingsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Edit TLS setting for hostname response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Edit TLS setting for hostname response failure </td><td>  -  </td></tr>
     </table>
     */
    public TlsCertificatesAndHostnamesPerHostnameSettingsResponse perHostnameTlsSettingsPut(String zoneId, TlsCertificatesAndHostnamesSettingId settingId, String hostname, PerHostnameTlsSettingsPutRequest perHostnameTlsSettingsPutRequest) throws ApiException {
        ApiResponse<TlsCertificatesAndHostnamesPerHostnameSettingsResponse> localVarResp = perHostnameTlsSettingsPutWithHttpInfo(zoneId, settingId, hostname, perHostnameTlsSettingsPutRequest);
        return localVarResp.getData();
    }

    /**
     * Edit TLS setting for hostname
     * Update the tls setting value for the hostname.
     * @param zoneId  (required)
     * @param settingId  (required)
     * @param hostname  (required)
     * @param perHostnameTlsSettingsPutRequest  (required)
     * @return ApiResponse&lt;TlsCertificatesAndHostnamesPerHostnameSettingsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Edit TLS setting for hostname response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Edit TLS setting for hostname response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TlsCertificatesAndHostnamesPerHostnameSettingsResponse> perHostnameTlsSettingsPutWithHttpInfo(String zoneId, TlsCertificatesAndHostnamesSettingId settingId, String hostname, PerHostnameTlsSettingsPutRequest perHostnameTlsSettingsPutRequest) throws ApiException {
        okhttp3.Call localVarCall = perHostnameTlsSettingsPutValidateBeforeCall(zoneId, settingId, hostname, perHostnameTlsSettingsPutRequest, null);
        Type localVarReturnType = new TypeToken<TlsCertificatesAndHostnamesPerHostnameSettingsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Edit TLS setting for hostname (asynchronously)
     * Update the tls setting value for the hostname.
     * @param zoneId  (required)
     * @param settingId  (required)
     * @param hostname  (required)
     * @param perHostnameTlsSettingsPutRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Edit TLS setting for hostname response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Edit TLS setting for hostname response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call perHostnameTlsSettingsPutAsync(String zoneId, TlsCertificatesAndHostnamesSettingId settingId, String hostname, PerHostnameTlsSettingsPutRequest perHostnameTlsSettingsPutRequest, final ApiCallback<TlsCertificatesAndHostnamesPerHostnameSettingsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = perHostnameTlsSettingsPutValidateBeforeCall(zoneId, settingId, hostname, perHostnameTlsSettingsPutRequest, _callback);
        Type localVarReturnType = new TypeToken<TlsCertificatesAndHostnamesPerHostnameSettingsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
