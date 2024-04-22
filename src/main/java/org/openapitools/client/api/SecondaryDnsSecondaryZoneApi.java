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


import org.openapitools.client.model.SecondaryDnsDnsSecondarySecondaryZone;
import org.openapitools.client.model.SecondaryDnsForceResponse;
import org.openapitools.client.model.SecondaryDnsIdResponse;
import org.openapitools.client.model.SecondaryDnsSecondaryZoneDeleteSecondaryZoneConfiguration4XXResponse;
import org.openapitools.client.model.SecondaryDnsSecondaryZoneForceAxfr4XXResponse;
import org.openapitools.client.model.SecondaryDnsSecondaryZoneSecondaryZoneConfigurationDetails4XXResponse;
import org.openapitools.client.model.SecondaryDnsSingleResponseIncoming;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecondaryDnsSecondaryZoneApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SecondaryDnsSecondaryZoneApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SecondaryDnsSecondaryZoneApi(ApiClient apiClient) {
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
     * Build call for secondaryDnsSecondaryZoneCreateSecondaryZoneConfiguration
     * @param zoneId  (required)
     * @param secondaryDnsDnsSecondarySecondaryZone  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Secondary Zone Configuration response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Secondary Zone Configuration response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call secondaryDnsSecondaryZoneCreateSecondaryZoneConfigurationCall(Object zoneId, SecondaryDnsDnsSecondarySecondaryZone secondaryDnsDnsSecondarySecondaryZone, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = secondaryDnsDnsSecondarySecondaryZone;

        // create path and map variables
        String localVarPath = "/zones/{zone_id}/secondary_dns/incoming"
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

        String[] localVarAuthNames = new String[] { "api_key", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call secondaryDnsSecondaryZoneCreateSecondaryZoneConfigurationValidateBeforeCall(Object zoneId, SecondaryDnsDnsSecondarySecondaryZone secondaryDnsDnsSecondarySecondaryZone, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling secondaryDnsSecondaryZoneCreateSecondaryZoneConfiguration(Async)");
        }

        // verify the required parameter 'secondaryDnsDnsSecondarySecondaryZone' is set
        if (secondaryDnsDnsSecondarySecondaryZone == null) {
            throw new ApiException("Missing the required parameter 'secondaryDnsDnsSecondarySecondaryZone' when calling secondaryDnsSecondaryZoneCreateSecondaryZoneConfiguration(Async)");
        }

        return secondaryDnsSecondaryZoneCreateSecondaryZoneConfigurationCall(zoneId, secondaryDnsDnsSecondarySecondaryZone, _callback);

    }

    /**
     * Create Secondary Zone Configuration
     * Create secondary zone configuration for incoming zone transfers.
     * @param zoneId  (required)
     * @param secondaryDnsDnsSecondarySecondaryZone  (required)
     * @return SecondaryDnsSingleResponseIncoming
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Secondary Zone Configuration response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Secondary Zone Configuration response failure </td><td>  -  </td></tr>
     </table>
     */
    public SecondaryDnsSingleResponseIncoming secondaryDnsSecondaryZoneCreateSecondaryZoneConfiguration(Object zoneId, SecondaryDnsDnsSecondarySecondaryZone secondaryDnsDnsSecondarySecondaryZone) throws ApiException {
        ApiResponse<SecondaryDnsSingleResponseIncoming> localVarResp = secondaryDnsSecondaryZoneCreateSecondaryZoneConfigurationWithHttpInfo(zoneId, secondaryDnsDnsSecondarySecondaryZone);
        return localVarResp.getData();
    }

    /**
     * Create Secondary Zone Configuration
     * Create secondary zone configuration for incoming zone transfers.
     * @param zoneId  (required)
     * @param secondaryDnsDnsSecondarySecondaryZone  (required)
     * @return ApiResponse&lt;SecondaryDnsSingleResponseIncoming&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Secondary Zone Configuration response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Secondary Zone Configuration response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SecondaryDnsSingleResponseIncoming> secondaryDnsSecondaryZoneCreateSecondaryZoneConfigurationWithHttpInfo(Object zoneId, SecondaryDnsDnsSecondarySecondaryZone secondaryDnsDnsSecondarySecondaryZone) throws ApiException {
        okhttp3.Call localVarCall = secondaryDnsSecondaryZoneCreateSecondaryZoneConfigurationValidateBeforeCall(zoneId, secondaryDnsDnsSecondarySecondaryZone, null);
        Type localVarReturnType = new TypeToken<SecondaryDnsSingleResponseIncoming>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create Secondary Zone Configuration (asynchronously)
     * Create secondary zone configuration for incoming zone transfers.
     * @param zoneId  (required)
     * @param secondaryDnsDnsSecondarySecondaryZone  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Secondary Zone Configuration response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Secondary Zone Configuration response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call secondaryDnsSecondaryZoneCreateSecondaryZoneConfigurationAsync(Object zoneId, SecondaryDnsDnsSecondarySecondaryZone secondaryDnsDnsSecondarySecondaryZone, final ApiCallback<SecondaryDnsSingleResponseIncoming> _callback) throws ApiException {

        okhttp3.Call localVarCall = secondaryDnsSecondaryZoneCreateSecondaryZoneConfigurationValidateBeforeCall(zoneId, secondaryDnsDnsSecondarySecondaryZone, _callback);
        Type localVarReturnType = new TypeToken<SecondaryDnsSingleResponseIncoming>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for secondaryDnsSecondaryZoneDeleteSecondaryZoneConfiguration
     * @param zoneId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete Secondary Zone Configuration response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete Secondary Zone Configuration response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call secondaryDnsSecondaryZoneDeleteSecondaryZoneConfigurationCall(Object zoneId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/zones/{zone_id}/secondary_dns/incoming"
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

        String[] localVarAuthNames = new String[] { "api_key", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call secondaryDnsSecondaryZoneDeleteSecondaryZoneConfigurationValidateBeforeCall(Object zoneId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling secondaryDnsSecondaryZoneDeleteSecondaryZoneConfiguration(Async)");
        }

        return secondaryDnsSecondaryZoneDeleteSecondaryZoneConfigurationCall(zoneId, _callback);

    }

    /**
     * Delete Secondary Zone Configuration
     * Delete secondary zone configuration for incoming zone transfers.
     * @param zoneId  (required)
     * @return SecondaryDnsIdResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete Secondary Zone Configuration response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete Secondary Zone Configuration response failure </td><td>  -  </td></tr>
     </table>
     */
    public SecondaryDnsIdResponse secondaryDnsSecondaryZoneDeleteSecondaryZoneConfiguration(Object zoneId) throws ApiException {
        ApiResponse<SecondaryDnsIdResponse> localVarResp = secondaryDnsSecondaryZoneDeleteSecondaryZoneConfigurationWithHttpInfo(zoneId);
        return localVarResp.getData();
    }

    /**
     * Delete Secondary Zone Configuration
     * Delete secondary zone configuration for incoming zone transfers.
     * @param zoneId  (required)
     * @return ApiResponse&lt;SecondaryDnsIdResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete Secondary Zone Configuration response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete Secondary Zone Configuration response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SecondaryDnsIdResponse> secondaryDnsSecondaryZoneDeleteSecondaryZoneConfigurationWithHttpInfo(Object zoneId) throws ApiException {
        okhttp3.Call localVarCall = secondaryDnsSecondaryZoneDeleteSecondaryZoneConfigurationValidateBeforeCall(zoneId, null);
        Type localVarReturnType = new TypeToken<SecondaryDnsIdResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete Secondary Zone Configuration (asynchronously)
     * Delete secondary zone configuration for incoming zone transfers.
     * @param zoneId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete Secondary Zone Configuration response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete Secondary Zone Configuration response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call secondaryDnsSecondaryZoneDeleteSecondaryZoneConfigurationAsync(Object zoneId, final ApiCallback<SecondaryDnsIdResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = secondaryDnsSecondaryZoneDeleteSecondaryZoneConfigurationValidateBeforeCall(zoneId, _callback);
        Type localVarReturnType = new TypeToken<SecondaryDnsIdResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for secondaryDnsSecondaryZoneForceAxfr
     * @param zoneId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Force AXFR response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Force AXFR response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call secondaryDnsSecondaryZoneForceAxfrCall(Object zoneId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/zones/{zone_id}/secondary_dns/force_axfr"
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

        String[] localVarAuthNames = new String[] { "api_key", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call secondaryDnsSecondaryZoneForceAxfrValidateBeforeCall(Object zoneId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling secondaryDnsSecondaryZoneForceAxfr(Async)");
        }

        return secondaryDnsSecondaryZoneForceAxfrCall(zoneId, _callback);

    }

    /**
     * Force AXFR
     * Sends AXFR zone transfer request to primary nameserver(s).
     * @param zoneId  (required)
     * @return SecondaryDnsForceResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Force AXFR response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Force AXFR response failure </td><td>  -  </td></tr>
     </table>
     */
    public SecondaryDnsForceResponse secondaryDnsSecondaryZoneForceAxfr(Object zoneId) throws ApiException {
        ApiResponse<SecondaryDnsForceResponse> localVarResp = secondaryDnsSecondaryZoneForceAxfrWithHttpInfo(zoneId);
        return localVarResp.getData();
    }

    /**
     * Force AXFR
     * Sends AXFR zone transfer request to primary nameserver(s).
     * @param zoneId  (required)
     * @return ApiResponse&lt;SecondaryDnsForceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Force AXFR response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Force AXFR response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SecondaryDnsForceResponse> secondaryDnsSecondaryZoneForceAxfrWithHttpInfo(Object zoneId) throws ApiException {
        okhttp3.Call localVarCall = secondaryDnsSecondaryZoneForceAxfrValidateBeforeCall(zoneId, null);
        Type localVarReturnType = new TypeToken<SecondaryDnsForceResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Force AXFR (asynchronously)
     * Sends AXFR zone transfer request to primary nameserver(s).
     * @param zoneId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Force AXFR response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Force AXFR response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call secondaryDnsSecondaryZoneForceAxfrAsync(Object zoneId, final ApiCallback<SecondaryDnsForceResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = secondaryDnsSecondaryZoneForceAxfrValidateBeforeCall(zoneId, _callback);
        Type localVarReturnType = new TypeToken<SecondaryDnsForceResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for secondaryDnsSecondaryZoneSecondaryZoneConfigurationDetails
     * @param zoneId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Secondary Zone Configuration Details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Secondary Zone Configuration Details response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call secondaryDnsSecondaryZoneSecondaryZoneConfigurationDetailsCall(Object zoneId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/zones/{zone_id}/secondary_dns/incoming"
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

        String[] localVarAuthNames = new String[] { "api_key", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call secondaryDnsSecondaryZoneSecondaryZoneConfigurationDetailsValidateBeforeCall(Object zoneId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling secondaryDnsSecondaryZoneSecondaryZoneConfigurationDetails(Async)");
        }

        return secondaryDnsSecondaryZoneSecondaryZoneConfigurationDetailsCall(zoneId, _callback);

    }

    /**
     * Secondary Zone Configuration Details
     * Get secondary zone configuration for incoming zone transfers.
     * @param zoneId  (required)
     * @return SecondaryDnsSingleResponseIncoming
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Secondary Zone Configuration Details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Secondary Zone Configuration Details response failure </td><td>  -  </td></tr>
     </table>
     */
    public SecondaryDnsSingleResponseIncoming secondaryDnsSecondaryZoneSecondaryZoneConfigurationDetails(Object zoneId) throws ApiException {
        ApiResponse<SecondaryDnsSingleResponseIncoming> localVarResp = secondaryDnsSecondaryZoneSecondaryZoneConfigurationDetailsWithHttpInfo(zoneId);
        return localVarResp.getData();
    }

    /**
     * Secondary Zone Configuration Details
     * Get secondary zone configuration for incoming zone transfers.
     * @param zoneId  (required)
     * @return ApiResponse&lt;SecondaryDnsSingleResponseIncoming&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Secondary Zone Configuration Details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Secondary Zone Configuration Details response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SecondaryDnsSingleResponseIncoming> secondaryDnsSecondaryZoneSecondaryZoneConfigurationDetailsWithHttpInfo(Object zoneId) throws ApiException {
        okhttp3.Call localVarCall = secondaryDnsSecondaryZoneSecondaryZoneConfigurationDetailsValidateBeforeCall(zoneId, null);
        Type localVarReturnType = new TypeToken<SecondaryDnsSingleResponseIncoming>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Secondary Zone Configuration Details (asynchronously)
     * Get secondary zone configuration for incoming zone transfers.
     * @param zoneId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Secondary Zone Configuration Details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Secondary Zone Configuration Details response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call secondaryDnsSecondaryZoneSecondaryZoneConfigurationDetailsAsync(Object zoneId, final ApiCallback<SecondaryDnsSingleResponseIncoming> _callback) throws ApiException {

        okhttp3.Call localVarCall = secondaryDnsSecondaryZoneSecondaryZoneConfigurationDetailsValidateBeforeCall(zoneId, _callback);
        Type localVarReturnType = new TypeToken<SecondaryDnsSingleResponseIncoming>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for secondaryDnsSecondaryZoneUpdateSecondaryZoneConfiguration
     * @param zoneId  (required)
     * @param secondaryDnsDnsSecondarySecondaryZone  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Secondary Zone Configuration response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Secondary Zone Configuration response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call secondaryDnsSecondaryZoneUpdateSecondaryZoneConfigurationCall(Object zoneId, SecondaryDnsDnsSecondarySecondaryZone secondaryDnsDnsSecondarySecondaryZone, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = secondaryDnsDnsSecondarySecondaryZone;

        // create path and map variables
        String localVarPath = "/zones/{zone_id}/secondary_dns/incoming"
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

        String[] localVarAuthNames = new String[] { "api_key", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call secondaryDnsSecondaryZoneUpdateSecondaryZoneConfigurationValidateBeforeCall(Object zoneId, SecondaryDnsDnsSecondarySecondaryZone secondaryDnsDnsSecondarySecondaryZone, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling secondaryDnsSecondaryZoneUpdateSecondaryZoneConfiguration(Async)");
        }

        // verify the required parameter 'secondaryDnsDnsSecondarySecondaryZone' is set
        if (secondaryDnsDnsSecondarySecondaryZone == null) {
            throw new ApiException("Missing the required parameter 'secondaryDnsDnsSecondarySecondaryZone' when calling secondaryDnsSecondaryZoneUpdateSecondaryZoneConfiguration(Async)");
        }

        return secondaryDnsSecondaryZoneUpdateSecondaryZoneConfigurationCall(zoneId, secondaryDnsDnsSecondarySecondaryZone, _callback);

    }

    /**
     * Update Secondary Zone Configuration
     * Update secondary zone configuration for incoming zone transfers.
     * @param zoneId  (required)
     * @param secondaryDnsDnsSecondarySecondaryZone  (required)
     * @return SecondaryDnsSingleResponseIncoming
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Secondary Zone Configuration response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Secondary Zone Configuration response failure </td><td>  -  </td></tr>
     </table>
     */
    public SecondaryDnsSingleResponseIncoming secondaryDnsSecondaryZoneUpdateSecondaryZoneConfiguration(Object zoneId, SecondaryDnsDnsSecondarySecondaryZone secondaryDnsDnsSecondarySecondaryZone) throws ApiException {
        ApiResponse<SecondaryDnsSingleResponseIncoming> localVarResp = secondaryDnsSecondaryZoneUpdateSecondaryZoneConfigurationWithHttpInfo(zoneId, secondaryDnsDnsSecondarySecondaryZone);
        return localVarResp.getData();
    }

    /**
     * Update Secondary Zone Configuration
     * Update secondary zone configuration for incoming zone transfers.
     * @param zoneId  (required)
     * @param secondaryDnsDnsSecondarySecondaryZone  (required)
     * @return ApiResponse&lt;SecondaryDnsSingleResponseIncoming&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Secondary Zone Configuration response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Secondary Zone Configuration response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SecondaryDnsSingleResponseIncoming> secondaryDnsSecondaryZoneUpdateSecondaryZoneConfigurationWithHttpInfo(Object zoneId, SecondaryDnsDnsSecondarySecondaryZone secondaryDnsDnsSecondarySecondaryZone) throws ApiException {
        okhttp3.Call localVarCall = secondaryDnsSecondaryZoneUpdateSecondaryZoneConfigurationValidateBeforeCall(zoneId, secondaryDnsDnsSecondarySecondaryZone, null);
        Type localVarReturnType = new TypeToken<SecondaryDnsSingleResponseIncoming>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Secondary Zone Configuration (asynchronously)
     * Update secondary zone configuration for incoming zone transfers.
     * @param zoneId  (required)
     * @param secondaryDnsDnsSecondarySecondaryZone  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Secondary Zone Configuration response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Secondary Zone Configuration response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call secondaryDnsSecondaryZoneUpdateSecondaryZoneConfigurationAsync(Object zoneId, SecondaryDnsDnsSecondarySecondaryZone secondaryDnsDnsSecondarySecondaryZone, final ApiCallback<SecondaryDnsSingleResponseIncoming> _callback) throws ApiException {

        okhttp3.Call localVarCall = secondaryDnsSecondaryZoneUpdateSecondaryZoneConfigurationValidateBeforeCall(zoneId, secondaryDnsDnsSecondarySecondaryZone, _callback);
        Type localVarReturnType = new TypeToken<SecondaryDnsSingleResponseIncoming>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
