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


package cloudflare;

import invalidPackageName.ApiCallback;
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.ApiResponse;
import invalidPackageName.Configuration;
import invalidPackageName.Pair;
import invalidPackageName.ProgressRequestBody;
import invalidPackageName.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.ZoneCacheSettingsChangeOriginPostQuantumEncryptionSettingRequest;
import org.openapitools.client.model.ZoneCacheSettingsGetOriginPostQuantumEncryptionSetting200Response;
import org.openapitools.client.model.ZoneCacheSettingsGetOriginPostQuantumEncryptionSetting4XXResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OriginPostQuantumApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public OriginPostQuantumApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OriginPostQuantumApi(ApiClient apiClient) {
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
     * Build call for zoneCacheSettingsChangeOriginPostQuantumEncryptionSetting
     * @param zoneId  (required)
     * @param zoneCacheSettingsChangeOriginPostQuantumEncryptionSettingRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Change Origin Post-Quantum Encryption setting response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Change Origin Post-Quantum Encryption setting response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call zoneCacheSettingsChangeOriginPostQuantumEncryptionSettingCall(String zoneId, ZoneCacheSettingsChangeOriginPostQuantumEncryptionSettingRequest zoneCacheSettingsChangeOriginPostQuantumEncryptionSettingRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = zoneCacheSettingsChangeOriginPostQuantumEncryptionSettingRequest;

        // create path and map variables
        String localVarPath = "/zones/{zone_id}/cache/origin_post_quantum_encryption"
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
    private okhttp3.Call zoneCacheSettingsChangeOriginPostQuantumEncryptionSettingValidateBeforeCall(String zoneId, ZoneCacheSettingsChangeOriginPostQuantumEncryptionSettingRequest zoneCacheSettingsChangeOriginPostQuantumEncryptionSettingRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling zoneCacheSettingsChangeOriginPostQuantumEncryptionSetting(Async)");
        }

        // verify the required parameter 'zoneCacheSettingsChangeOriginPostQuantumEncryptionSettingRequest' is set
        if (zoneCacheSettingsChangeOriginPostQuantumEncryptionSettingRequest == null) {
            throw new ApiException("Missing the required parameter 'zoneCacheSettingsChangeOriginPostQuantumEncryptionSettingRequest' when calling zoneCacheSettingsChangeOriginPostQuantumEncryptionSetting(Async)");
        }

        return zoneCacheSettingsChangeOriginPostQuantumEncryptionSettingCall(zoneId, zoneCacheSettingsChangeOriginPostQuantumEncryptionSettingRequest, _callback);

    }

    /**
     * Change Origin Post-Quantum Encryption setting
     * Instructs Cloudflare to use Post-Quantum (PQ) key agreement algorithms when connecting to your origin. Preferred instructs Cloudflare to opportunistically send a Post-Quantum keyshare in the first message to the origin (for fastest connections when the origin supports and prefers PQ), supported means that PQ algorithms are advertised but only used when requested by the origin, and off means that PQ algorithms are not advertised
     * @param zoneId  (required)
     * @param zoneCacheSettingsChangeOriginPostQuantumEncryptionSettingRequest  (required)
     * @return ZoneCacheSettingsGetOriginPostQuantumEncryptionSetting200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Change Origin Post-Quantum Encryption setting response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Change Origin Post-Quantum Encryption setting response failure </td><td>  -  </td></tr>
     </table>
     */
    public ZoneCacheSettingsGetOriginPostQuantumEncryptionSetting200Response zoneCacheSettingsChangeOriginPostQuantumEncryptionSetting(String zoneId, ZoneCacheSettingsChangeOriginPostQuantumEncryptionSettingRequest zoneCacheSettingsChangeOriginPostQuantumEncryptionSettingRequest) throws ApiException {
        ApiResponse<ZoneCacheSettingsGetOriginPostQuantumEncryptionSetting200Response> localVarResp = zoneCacheSettingsChangeOriginPostQuantumEncryptionSettingWithHttpInfo(zoneId, zoneCacheSettingsChangeOriginPostQuantumEncryptionSettingRequest);
        return localVarResp.getData();
    }

    /**
     * Change Origin Post-Quantum Encryption setting
     * Instructs Cloudflare to use Post-Quantum (PQ) key agreement algorithms when connecting to your origin. Preferred instructs Cloudflare to opportunistically send a Post-Quantum keyshare in the first message to the origin (for fastest connections when the origin supports and prefers PQ), supported means that PQ algorithms are advertised but only used when requested by the origin, and off means that PQ algorithms are not advertised
     * @param zoneId  (required)
     * @param zoneCacheSettingsChangeOriginPostQuantumEncryptionSettingRequest  (required)
     * @return ApiResponse&lt;ZoneCacheSettingsGetOriginPostQuantumEncryptionSetting200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Change Origin Post-Quantum Encryption setting response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Change Origin Post-Quantum Encryption setting response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ZoneCacheSettingsGetOriginPostQuantumEncryptionSetting200Response> zoneCacheSettingsChangeOriginPostQuantumEncryptionSettingWithHttpInfo(String zoneId, ZoneCacheSettingsChangeOriginPostQuantumEncryptionSettingRequest zoneCacheSettingsChangeOriginPostQuantumEncryptionSettingRequest) throws ApiException {
        okhttp3.Call localVarCall = zoneCacheSettingsChangeOriginPostQuantumEncryptionSettingValidateBeforeCall(zoneId, zoneCacheSettingsChangeOriginPostQuantumEncryptionSettingRequest, null);
        Type localVarReturnType = new TypeToken<ZoneCacheSettingsGetOriginPostQuantumEncryptionSetting200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Change Origin Post-Quantum Encryption setting (asynchronously)
     * Instructs Cloudflare to use Post-Quantum (PQ) key agreement algorithms when connecting to your origin. Preferred instructs Cloudflare to opportunistically send a Post-Quantum keyshare in the first message to the origin (for fastest connections when the origin supports and prefers PQ), supported means that PQ algorithms are advertised but only used when requested by the origin, and off means that PQ algorithms are not advertised
     * @param zoneId  (required)
     * @param zoneCacheSettingsChangeOriginPostQuantumEncryptionSettingRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Change Origin Post-Quantum Encryption setting response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Change Origin Post-Quantum Encryption setting response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call zoneCacheSettingsChangeOriginPostQuantumEncryptionSettingAsync(String zoneId, ZoneCacheSettingsChangeOriginPostQuantumEncryptionSettingRequest zoneCacheSettingsChangeOriginPostQuantumEncryptionSettingRequest, final ApiCallback<ZoneCacheSettingsGetOriginPostQuantumEncryptionSetting200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = zoneCacheSettingsChangeOriginPostQuantumEncryptionSettingValidateBeforeCall(zoneId, zoneCacheSettingsChangeOriginPostQuantumEncryptionSettingRequest, _callback);
        Type localVarReturnType = new TypeToken<ZoneCacheSettingsGetOriginPostQuantumEncryptionSetting200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for zoneCacheSettingsGetOriginPostQuantumEncryptionSetting
     * @param zoneId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get Origin Post-Quantum Encryption setting response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get Origin Post-Quantum Encryption setting response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call zoneCacheSettingsGetOriginPostQuantumEncryptionSettingCall(String zoneId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/zones/{zone_id}/cache/origin_post_quantum_encryption"
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
    private okhttp3.Call zoneCacheSettingsGetOriginPostQuantumEncryptionSettingValidateBeforeCall(String zoneId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling zoneCacheSettingsGetOriginPostQuantumEncryptionSetting(Async)");
        }

        return zoneCacheSettingsGetOriginPostQuantumEncryptionSettingCall(zoneId, _callback);

    }

    /**
     * Get Origin Post-Quantum Encryption setting
     * Instructs Cloudflare to use Post-Quantum (PQ) key agreement algorithms when connecting to your origin. Preferred instructs Cloudflare to opportunistically send a Post-Quantum keyshare in the first message to the origin (for fastest connections when the origin supports and prefers PQ), supported means that PQ algorithms are advertised but only used when requested by the origin, and off means that PQ algorithms are not advertised
     * @param zoneId  (required)
     * @return ZoneCacheSettingsGetOriginPostQuantumEncryptionSetting200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get Origin Post-Quantum Encryption setting response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get Origin Post-Quantum Encryption setting response failure </td><td>  -  </td></tr>
     </table>
     */
    public ZoneCacheSettingsGetOriginPostQuantumEncryptionSetting200Response zoneCacheSettingsGetOriginPostQuantumEncryptionSetting(String zoneId) throws ApiException {
        ApiResponse<ZoneCacheSettingsGetOriginPostQuantumEncryptionSetting200Response> localVarResp = zoneCacheSettingsGetOriginPostQuantumEncryptionSettingWithHttpInfo(zoneId);
        return localVarResp.getData();
    }

    /**
     * Get Origin Post-Quantum Encryption setting
     * Instructs Cloudflare to use Post-Quantum (PQ) key agreement algorithms when connecting to your origin. Preferred instructs Cloudflare to opportunistically send a Post-Quantum keyshare in the first message to the origin (for fastest connections when the origin supports and prefers PQ), supported means that PQ algorithms are advertised but only used when requested by the origin, and off means that PQ algorithms are not advertised
     * @param zoneId  (required)
     * @return ApiResponse&lt;ZoneCacheSettingsGetOriginPostQuantumEncryptionSetting200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get Origin Post-Quantum Encryption setting response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get Origin Post-Quantum Encryption setting response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ZoneCacheSettingsGetOriginPostQuantumEncryptionSetting200Response> zoneCacheSettingsGetOriginPostQuantumEncryptionSettingWithHttpInfo(String zoneId) throws ApiException {
        okhttp3.Call localVarCall = zoneCacheSettingsGetOriginPostQuantumEncryptionSettingValidateBeforeCall(zoneId, null);
        Type localVarReturnType = new TypeToken<ZoneCacheSettingsGetOriginPostQuantumEncryptionSetting200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Origin Post-Quantum Encryption setting (asynchronously)
     * Instructs Cloudflare to use Post-Quantum (PQ) key agreement algorithms when connecting to your origin. Preferred instructs Cloudflare to opportunistically send a Post-Quantum keyshare in the first message to the origin (for fastest connections when the origin supports and prefers PQ), supported means that PQ algorithms are advertised but only used when requested by the origin, and off means that PQ algorithms are not advertised
     * @param zoneId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get Origin Post-Quantum Encryption setting response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get Origin Post-Quantum Encryption setting response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call zoneCacheSettingsGetOriginPostQuantumEncryptionSettingAsync(String zoneId, final ApiCallback<ZoneCacheSettingsGetOriginPostQuantumEncryptionSetting200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = zoneCacheSettingsGetOriginPostQuantumEncryptionSettingValidateBeforeCall(zoneId, _callback);
        Type localVarReturnType = new TypeToken<ZoneCacheSettingsGetOriginPostQuantumEncryptionSetting200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
