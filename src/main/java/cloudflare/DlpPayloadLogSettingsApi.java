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


import org.openapitools.client.model.DlpGetSettingsResponse;
import org.openapitools.client.model.DlpPayloadLogSettingsGetSettings4XXResponse;
import org.openapitools.client.model.DlpPayloadLogSettingsUpdateSettings4XXResponse;
import org.openapitools.client.model.DlpUpdateSettings;
import org.openapitools.client.model.DlpUpdateSettingsResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DlpPayloadLogSettingsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DlpPayloadLogSettingsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DlpPayloadLogSettingsApi(ApiClient apiClient) {
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
     * Build call for dlpPayloadLogSettingsGetSettings
     * @param accountId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get settings response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get settings response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call dlpPayloadLogSettingsGetSettingsCall(String accountId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/dlp/payload_log"
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
    private okhttp3.Call dlpPayloadLogSettingsGetSettingsValidateBeforeCall(String accountId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling dlpPayloadLogSettingsGetSettings(Async)");
        }

        return dlpPayloadLogSettingsGetSettingsCall(accountId, _callback);

    }

    /**
     * Get settings
     * Gets the current DLP payload log settings for this account.
     * @param accountId  (required)
     * @return DlpGetSettingsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get settings response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get settings response failure </td><td>  -  </td></tr>
     </table>
     */
    public DlpGetSettingsResponse dlpPayloadLogSettingsGetSettings(String accountId) throws ApiException {
        ApiResponse<DlpGetSettingsResponse> localVarResp = dlpPayloadLogSettingsGetSettingsWithHttpInfo(accountId);
        return localVarResp.getData();
    }

    /**
     * Get settings
     * Gets the current DLP payload log settings for this account.
     * @param accountId  (required)
     * @return ApiResponse&lt;DlpGetSettingsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get settings response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get settings response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DlpGetSettingsResponse> dlpPayloadLogSettingsGetSettingsWithHttpInfo(String accountId) throws ApiException {
        okhttp3.Call localVarCall = dlpPayloadLogSettingsGetSettingsValidateBeforeCall(accountId, null);
        Type localVarReturnType = new TypeToken<DlpGetSettingsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get settings (asynchronously)
     * Gets the current DLP payload log settings for this account.
     * @param accountId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get settings response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get settings response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call dlpPayloadLogSettingsGetSettingsAsync(String accountId, final ApiCallback<DlpGetSettingsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = dlpPayloadLogSettingsGetSettingsValidateBeforeCall(accountId, _callback);
        Type localVarReturnType = new TypeToken<DlpGetSettingsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for dlpPayloadLogSettingsUpdateSettings
     * @param accountId  (required)
     * @param dlpUpdateSettings  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update settings response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update settings response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call dlpPayloadLogSettingsUpdateSettingsCall(String accountId, DlpUpdateSettings dlpUpdateSettings, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = dlpUpdateSettings;

        // create path and map variables
        String localVarPath = "/accounts/{account_id}/dlp/payload_log"
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

        String[] localVarAuthNames = new String[] { "api_key", "api_token", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call dlpPayloadLogSettingsUpdateSettingsValidateBeforeCall(String accountId, DlpUpdateSettings dlpUpdateSettings, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling dlpPayloadLogSettingsUpdateSettings(Async)");
        }

        // verify the required parameter 'dlpUpdateSettings' is set
        if (dlpUpdateSettings == null) {
            throw new ApiException("Missing the required parameter 'dlpUpdateSettings' when calling dlpPayloadLogSettingsUpdateSettings(Async)");
        }

        return dlpPayloadLogSettingsUpdateSettingsCall(accountId, dlpUpdateSettings, _callback);

    }

    /**
     * Update settings
     * Updates the DLP payload log settings for this account.
     * @param accountId  (required)
     * @param dlpUpdateSettings  (required)
     * @return DlpUpdateSettingsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update settings response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update settings response failure </td><td>  -  </td></tr>
     </table>
     */
    public DlpUpdateSettingsResponse dlpPayloadLogSettingsUpdateSettings(String accountId, DlpUpdateSettings dlpUpdateSettings) throws ApiException {
        ApiResponse<DlpUpdateSettingsResponse> localVarResp = dlpPayloadLogSettingsUpdateSettingsWithHttpInfo(accountId, dlpUpdateSettings);
        return localVarResp.getData();
    }

    /**
     * Update settings
     * Updates the DLP payload log settings for this account.
     * @param accountId  (required)
     * @param dlpUpdateSettings  (required)
     * @return ApiResponse&lt;DlpUpdateSettingsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update settings response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update settings response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DlpUpdateSettingsResponse> dlpPayloadLogSettingsUpdateSettingsWithHttpInfo(String accountId, DlpUpdateSettings dlpUpdateSettings) throws ApiException {
        okhttp3.Call localVarCall = dlpPayloadLogSettingsUpdateSettingsValidateBeforeCall(accountId, dlpUpdateSettings, null);
        Type localVarReturnType = new TypeToken<DlpUpdateSettingsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update settings (asynchronously)
     * Updates the DLP payload log settings for this account.
     * @param accountId  (required)
     * @param dlpUpdateSettings  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update settings response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update settings response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call dlpPayloadLogSettingsUpdateSettingsAsync(String accountId, DlpUpdateSettings dlpUpdateSettings, final ApiCallback<DlpUpdateSettingsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = dlpPayloadLogSettingsUpdateSettingsValidateBeforeCall(accountId, dlpUpdateSettings, _callback);
        Type localVarReturnType = new TypeToken<DlpUpdateSettingsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
