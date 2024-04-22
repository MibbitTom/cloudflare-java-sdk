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


import org.openapitools.client.model.BotManagementBotManagementResponseBody;
import org.openapitools.client.model.BotManagementConfigSingle;
import org.openapitools.client.model.BotManagementForAZoneGetConfig4XXResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BotSettingsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public BotSettingsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BotSettingsApi(ApiClient apiClient) {
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
     * Build call for botManagementForAZoneGetConfig
     * @param zoneId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Bot Management config response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Bot Management config response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call botManagementForAZoneGetConfigCall(String zoneId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/zones/{zone_id}/bot_management"
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
    private okhttp3.Call botManagementForAZoneGetConfigValidateBeforeCall(String zoneId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling botManagementForAZoneGetConfig(Async)");
        }

        return botManagementForAZoneGetConfigCall(zoneId, _callback);

    }

    /**
     * Get Zone Bot Management Config
     * Retrieve a zone&#39;s Bot Management Config
     * @param zoneId  (required)
     * @return BotManagementBotManagementResponseBody
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Bot Management config response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Bot Management config response failure </td><td>  -  </td></tr>
     </table>
     */
    public BotManagementBotManagementResponseBody botManagementForAZoneGetConfig(String zoneId) throws ApiException {
        ApiResponse<BotManagementBotManagementResponseBody> localVarResp = botManagementForAZoneGetConfigWithHttpInfo(zoneId);
        return localVarResp.getData();
    }

    /**
     * Get Zone Bot Management Config
     * Retrieve a zone&#39;s Bot Management Config
     * @param zoneId  (required)
     * @return ApiResponse&lt;BotManagementBotManagementResponseBody&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Bot Management config response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Bot Management config response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BotManagementBotManagementResponseBody> botManagementForAZoneGetConfigWithHttpInfo(String zoneId) throws ApiException {
        okhttp3.Call localVarCall = botManagementForAZoneGetConfigValidateBeforeCall(zoneId, null);
        Type localVarReturnType = new TypeToken<BotManagementBotManagementResponseBody>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Zone Bot Management Config (asynchronously)
     * Retrieve a zone&#39;s Bot Management Config
     * @param zoneId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Bot Management config response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Bot Management config response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call botManagementForAZoneGetConfigAsync(String zoneId, final ApiCallback<BotManagementBotManagementResponseBody> _callback) throws ApiException {

        okhttp3.Call localVarCall = botManagementForAZoneGetConfigValidateBeforeCall(zoneId, _callback);
        Type localVarReturnType = new TypeToken<BotManagementBotManagementResponseBody>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for botManagementForAZoneUpdateConfig
     * @param zoneId  (required)
     * @param botManagementConfigSingle  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Bot Management response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Bot Management response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call botManagementForAZoneUpdateConfigCall(String zoneId, BotManagementConfigSingle botManagementConfigSingle, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = botManagementConfigSingle;

        // create path and map variables
        String localVarPath = "/zones/{zone_id}/bot_management"
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
    private okhttp3.Call botManagementForAZoneUpdateConfigValidateBeforeCall(String zoneId, BotManagementConfigSingle botManagementConfigSingle, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling botManagementForAZoneUpdateConfig(Async)");
        }

        // verify the required parameter 'botManagementConfigSingle' is set
        if (botManagementConfigSingle == null) {
            throw new ApiException("Missing the required parameter 'botManagementConfigSingle' when calling botManagementForAZoneUpdateConfig(Async)");
        }

        return botManagementForAZoneUpdateConfigCall(zoneId, botManagementConfigSingle, _callback);

    }

    /**
     * Update Zone Bot Management Config
     * Updates the Bot Management configuration for a zone.  This API is used to update: - **Bot Fight Mode** - **Super Bot Fight Mode** - **Bot Management for Enterprise**  See [Bot Plans](https://developers.cloudflare.com/bots/plans/) for more information on the different plans 
     * @param zoneId  (required)
     * @param botManagementConfigSingle  (required)
     * @return BotManagementBotManagementResponseBody
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Bot Management response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Bot Management response failure </td><td>  -  </td></tr>
     </table>
     */
    public BotManagementBotManagementResponseBody botManagementForAZoneUpdateConfig(String zoneId, BotManagementConfigSingle botManagementConfigSingle) throws ApiException {
        ApiResponse<BotManagementBotManagementResponseBody> localVarResp = botManagementForAZoneUpdateConfigWithHttpInfo(zoneId, botManagementConfigSingle);
        return localVarResp.getData();
    }

    /**
     * Update Zone Bot Management Config
     * Updates the Bot Management configuration for a zone.  This API is used to update: - **Bot Fight Mode** - **Super Bot Fight Mode** - **Bot Management for Enterprise**  See [Bot Plans](https://developers.cloudflare.com/bots/plans/) for more information on the different plans 
     * @param zoneId  (required)
     * @param botManagementConfigSingle  (required)
     * @return ApiResponse&lt;BotManagementBotManagementResponseBody&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Bot Management response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Bot Management response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BotManagementBotManagementResponseBody> botManagementForAZoneUpdateConfigWithHttpInfo(String zoneId, BotManagementConfigSingle botManagementConfigSingle) throws ApiException {
        okhttp3.Call localVarCall = botManagementForAZoneUpdateConfigValidateBeforeCall(zoneId, botManagementConfigSingle, null);
        Type localVarReturnType = new TypeToken<BotManagementBotManagementResponseBody>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Zone Bot Management Config (asynchronously)
     * Updates the Bot Management configuration for a zone.  This API is used to update: - **Bot Fight Mode** - **Super Bot Fight Mode** - **Bot Management for Enterprise**  See [Bot Plans](https://developers.cloudflare.com/bots/plans/) for more information on the different plans 
     * @param zoneId  (required)
     * @param botManagementConfigSingle  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Bot Management response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Bot Management response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call botManagementForAZoneUpdateConfigAsync(String zoneId, BotManagementConfigSingle botManagementConfigSingle, final ApiCallback<BotManagementBotManagementResponseBody> _callback) throws ApiException {

        okhttp3.Call localVarCall = botManagementForAZoneUpdateConfigValidateBeforeCall(zoneId, botManagementConfigSingle, _callback);
        Type localVarReturnType = new TypeToken<BotManagementBotManagementResponseBody>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
