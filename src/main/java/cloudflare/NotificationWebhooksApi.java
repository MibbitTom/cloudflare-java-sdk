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


import org.openapitools.client.model.AaaApiResponseCollection;
import org.openapitools.client.model.AaaIdResponse;
import org.openapitools.client.model.AaaSchemasSingleResponse;
import org.openapitools.client.model.AaaWebhooksComponentsSchemasResponseCollection;
import org.openapitools.client.model.NotificationDestinationsWithPagerDutyConnectPagerDuty4XXResponse;
import org.openapitools.client.model.NotificationDestinationsWithPagerDutyDeletePagerDutyServices4XXResponse;
import org.openapitools.client.model.NotificationWebhooksCreateAWebhookRequest;
import org.openapitools.client.model.NotificationWebhooksGetAWebhook4XXResponse;
import org.openapitools.client.model.NotificationWebhooksListWebhooks4XXResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationWebhooksApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public NotificationWebhooksApi() {
        this(Configuration.getDefaultApiClient());
    }

    public NotificationWebhooksApi(ApiClient apiClient) {
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
     * Build call for notificationWebhooksCreateAWebhook
     * @param accountId  (required)
     * @param notificationWebhooksCreateAWebhookRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Create a webhook response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create a webhook response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call notificationWebhooksCreateAWebhookCall(String accountId, NotificationWebhooksCreateAWebhookRequest notificationWebhooksCreateAWebhookRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = notificationWebhooksCreateAWebhookRequest;

        // create path and map variables
        String localVarPath = "/accounts/{account_id}/alerting/v3/destinations/webhooks"
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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call notificationWebhooksCreateAWebhookValidateBeforeCall(String accountId, NotificationWebhooksCreateAWebhookRequest notificationWebhooksCreateAWebhookRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling notificationWebhooksCreateAWebhook(Async)");
        }

        // verify the required parameter 'notificationWebhooksCreateAWebhookRequest' is set
        if (notificationWebhooksCreateAWebhookRequest == null) {
            throw new ApiException("Missing the required parameter 'notificationWebhooksCreateAWebhookRequest' when calling notificationWebhooksCreateAWebhook(Async)");
        }

        return notificationWebhooksCreateAWebhookCall(accountId, notificationWebhooksCreateAWebhookRequest, _callback);

    }

    /**
     * Create a webhook
     * Creates a new webhook destination.
     * @param accountId  (required)
     * @param notificationWebhooksCreateAWebhookRequest  (required)
     * @return AaaIdResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Create a webhook response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create a webhook response failure </td><td>  -  </td></tr>
     </table>
     */
    public AaaIdResponse notificationWebhooksCreateAWebhook(String accountId, NotificationWebhooksCreateAWebhookRequest notificationWebhooksCreateAWebhookRequest) throws ApiException {
        ApiResponse<AaaIdResponse> localVarResp = notificationWebhooksCreateAWebhookWithHttpInfo(accountId, notificationWebhooksCreateAWebhookRequest);
        return localVarResp.getData();
    }

    /**
     * Create a webhook
     * Creates a new webhook destination.
     * @param accountId  (required)
     * @param notificationWebhooksCreateAWebhookRequest  (required)
     * @return ApiResponse&lt;AaaIdResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Create a webhook response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create a webhook response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AaaIdResponse> notificationWebhooksCreateAWebhookWithHttpInfo(String accountId, NotificationWebhooksCreateAWebhookRequest notificationWebhooksCreateAWebhookRequest) throws ApiException {
        okhttp3.Call localVarCall = notificationWebhooksCreateAWebhookValidateBeforeCall(accountId, notificationWebhooksCreateAWebhookRequest, null);
        Type localVarReturnType = new TypeToken<AaaIdResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a webhook (asynchronously)
     * Creates a new webhook destination.
     * @param accountId  (required)
     * @param notificationWebhooksCreateAWebhookRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Create a webhook response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create a webhook response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call notificationWebhooksCreateAWebhookAsync(String accountId, NotificationWebhooksCreateAWebhookRequest notificationWebhooksCreateAWebhookRequest, final ApiCallback<AaaIdResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = notificationWebhooksCreateAWebhookValidateBeforeCall(accountId, notificationWebhooksCreateAWebhookRequest, _callback);
        Type localVarReturnType = new TypeToken<AaaIdResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for notificationWebhooksDeleteAWebhook
     * @param webhookId  (required)
     * @param accountId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete a webhook response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete a webhook response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call notificationWebhooksDeleteAWebhookCall(String webhookId, String accountId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/alerting/v3/destinations/webhooks/{webhook_id}"
            .replace("{" + "webhook_id" + "}", localVarApiClient.escapeString(webhookId.toString()))
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
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call notificationWebhooksDeleteAWebhookValidateBeforeCall(String webhookId, String accountId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'webhookId' is set
        if (webhookId == null) {
            throw new ApiException("Missing the required parameter 'webhookId' when calling notificationWebhooksDeleteAWebhook(Async)");
        }

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling notificationWebhooksDeleteAWebhook(Async)");
        }

        return notificationWebhooksDeleteAWebhookCall(webhookId, accountId, _callback);

    }

    /**
     * Delete a webhook
     * Delete a configured webhook destination.
     * @param webhookId  (required)
     * @param accountId  (required)
     * @return AaaApiResponseCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete a webhook response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete a webhook response failure </td><td>  -  </td></tr>
     </table>
     */
    public AaaApiResponseCollection notificationWebhooksDeleteAWebhook(String webhookId, String accountId) throws ApiException {
        ApiResponse<AaaApiResponseCollection> localVarResp = notificationWebhooksDeleteAWebhookWithHttpInfo(webhookId, accountId);
        return localVarResp.getData();
    }

    /**
     * Delete a webhook
     * Delete a configured webhook destination.
     * @param webhookId  (required)
     * @param accountId  (required)
     * @return ApiResponse&lt;AaaApiResponseCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete a webhook response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete a webhook response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AaaApiResponseCollection> notificationWebhooksDeleteAWebhookWithHttpInfo(String webhookId, String accountId) throws ApiException {
        okhttp3.Call localVarCall = notificationWebhooksDeleteAWebhookValidateBeforeCall(webhookId, accountId, null);
        Type localVarReturnType = new TypeToken<AaaApiResponseCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete a webhook (asynchronously)
     * Delete a configured webhook destination.
     * @param webhookId  (required)
     * @param accountId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete a webhook response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete a webhook response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call notificationWebhooksDeleteAWebhookAsync(String webhookId, String accountId, final ApiCallback<AaaApiResponseCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = notificationWebhooksDeleteAWebhookValidateBeforeCall(webhookId, accountId, _callback);
        Type localVarReturnType = new TypeToken<AaaApiResponseCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for notificationWebhooksGetAWebhook
     * @param accountId  (required)
     * @param webhookId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get a webhook response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get a webhook response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call notificationWebhooksGetAWebhookCall(String accountId, String webhookId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/alerting/v3/destinations/webhooks/{webhook_id}"
            .replace("{" + "account_id" + "}", localVarApiClient.escapeString(accountId.toString()))
            .replace("{" + "webhook_id" + "}", localVarApiClient.escapeString(webhookId.toString()));

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
    private okhttp3.Call notificationWebhooksGetAWebhookValidateBeforeCall(String accountId, String webhookId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling notificationWebhooksGetAWebhook(Async)");
        }

        // verify the required parameter 'webhookId' is set
        if (webhookId == null) {
            throw new ApiException("Missing the required parameter 'webhookId' when calling notificationWebhooksGetAWebhook(Async)");
        }

        return notificationWebhooksGetAWebhookCall(accountId, webhookId, _callback);

    }

    /**
     * Get a webhook
     * Get details for a single webhooks destination.
     * @param accountId  (required)
     * @param webhookId  (required)
     * @return AaaSchemasSingleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get a webhook response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get a webhook response failure </td><td>  -  </td></tr>
     </table>
     */
    public AaaSchemasSingleResponse notificationWebhooksGetAWebhook(String accountId, String webhookId) throws ApiException {
        ApiResponse<AaaSchemasSingleResponse> localVarResp = notificationWebhooksGetAWebhookWithHttpInfo(accountId, webhookId);
        return localVarResp.getData();
    }

    /**
     * Get a webhook
     * Get details for a single webhooks destination.
     * @param accountId  (required)
     * @param webhookId  (required)
     * @return ApiResponse&lt;AaaSchemasSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get a webhook response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get a webhook response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AaaSchemasSingleResponse> notificationWebhooksGetAWebhookWithHttpInfo(String accountId, String webhookId) throws ApiException {
        okhttp3.Call localVarCall = notificationWebhooksGetAWebhookValidateBeforeCall(accountId, webhookId, null);
        Type localVarReturnType = new TypeToken<AaaSchemasSingleResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a webhook (asynchronously)
     * Get details for a single webhooks destination.
     * @param accountId  (required)
     * @param webhookId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get a webhook response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get a webhook response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call notificationWebhooksGetAWebhookAsync(String accountId, String webhookId, final ApiCallback<AaaSchemasSingleResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = notificationWebhooksGetAWebhookValidateBeforeCall(accountId, webhookId, _callback);
        Type localVarReturnType = new TypeToken<AaaSchemasSingleResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for notificationWebhooksListWebhooks
     * @param accountId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List webhooks response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List webhooks response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call notificationWebhooksListWebhooksCall(String accountId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/alerting/v3/destinations/webhooks"
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
    private okhttp3.Call notificationWebhooksListWebhooksValidateBeforeCall(String accountId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling notificationWebhooksListWebhooks(Async)");
        }

        return notificationWebhooksListWebhooksCall(accountId, _callback);

    }

    /**
     * List webhooks
     * Gets a list of all configured webhook destinations.
     * @param accountId  (required)
     * @return AaaWebhooksComponentsSchemasResponseCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List webhooks response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List webhooks response failure </td><td>  -  </td></tr>
     </table>
     */
    public AaaWebhooksComponentsSchemasResponseCollection notificationWebhooksListWebhooks(String accountId) throws ApiException {
        ApiResponse<AaaWebhooksComponentsSchemasResponseCollection> localVarResp = notificationWebhooksListWebhooksWithHttpInfo(accountId);
        return localVarResp.getData();
    }

    /**
     * List webhooks
     * Gets a list of all configured webhook destinations.
     * @param accountId  (required)
     * @return ApiResponse&lt;AaaWebhooksComponentsSchemasResponseCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List webhooks response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List webhooks response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AaaWebhooksComponentsSchemasResponseCollection> notificationWebhooksListWebhooksWithHttpInfo(String accountId) throws ApiException {
        okhttp3.Call localVarCall = notificationWebhooksListWebhooksValidateBeforeCall(accountId, null);
        Type localVarReturnType = new TypeToken<AaaWebhooksComponentsSchemasResponseCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List webhooks (asynchronously)
     * Gets a list of all configured webhook destinations.
     * @param accountId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List webhooks response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List webhooks response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call notificationWebhooksListWebhooksAsync(String accountId, final ApiCallback<AaaWebhooksComponentsSchemasResponseCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = notificationWebhooksListWebhooksValidateBeforeCall(accountId, _callback);
        Type localVarReturnType = new TypeToken<AaaWebhooksComponentsSchemasResponseCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for notificationWebhooksUpdateAWebhook
     * @param webhookId  (required)
     * @param accountId  (required)
     * @param notificationWebhooksCreateAWebhookRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update a webhook response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update a webhook response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call notificationWebhooksUpdateAWebhookCall(String webhookId, String accountId, NotificationWebhooksCreateAWebhookRequest notificationWebhooksCreateAWebhookRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = notificationWebhooksCreateAWebhookRequest;

        // create path and map variables
        String localVarPath = "/accounts/{account_id}/alerting/v3/destinations/webhooks/{webhook_id}"
            .replace("{" + "webhook_id" + "}", localVarApiClient.escapeString(webhookId.toString()))
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
    private okhttp3.Call notificationWebhooksUpdateAWebhookValidateBeforeCall(String webhookId, String accountId, NotificationWebhooksCreateAWebhookRequest notificationWebhooksCreateAWebhookRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'webhookId' is set
        if (webhookId == null) {
            throw new ApiException("Missing the required parameter 'webhookId' when calling notificationWebhooksUpdateAWebhook(Async)");
        }

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling notificationWebhooksUpdateAWebhook(Async)");
        }

        // verify the required parameter 'notificationWebhooksCreateAWebhookRequest' is set
        if (notificationWebhooksCreateAWebhookRequest == null) {
            throw new ApiException("Missing the required parameter 'notificationWebhooksCreateAWebhookRequest' when calling notificationWebhooksUpdateAWebhook(Async)");
        }

        return notificationWebhooksUpdateAWebhookCall(webhookId, accountId, notificationWebhooksCreateAWebhookRequest, _callback);

    }

    /**
     * Update a webhook
     * Update a webhook destination.
     * @param webhookId  (required)
     * @param accountId  (required)
     * @param notificationWebhooksCreateAWebhookRequest  (required)
     * @return AaaIdResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update a webhook response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update a webhook response failure </td><td>  -  </td></tr>
     </table>
     */
    public AaaIdResponse notificationWebhooksUpdateAWebhook(String webhookId, String accountId, NotificationWebhooksCreateAWebhookRequest notificationWebhooksCreateAWebhookRequest) throws ApiException {
        ApiResponse<AaaIdResponse> localVarResp = notificationWebhooksUpdateAWebhookWithHttpInfo(webhookId, accountId, notificationWebhooksCreateAWebhookRequest);
        return localVarResp.getData();
    }

    /**
     * Update a webhook
     * Update a webhook destination.
     * @param webhookId  (required)
     * @param accountId  (required)
     * @param notificationWebhooksCreateAWebhookRequest  (required)
     * @return ApiResponse&lt;AaaIdResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update a webhook response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update a webhook response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AaaIdResponse> notificationWebhooksUpdateAWebhookWithHttpInfo(String webhookId, String accountId, NotificationWebhooksCreateAWebhookRequest notificationWebhooksCreateAWebhookRequest) throws ApiException {
        okhttp3.Call localVarCall = notificationWebhooksUpdateAWebhookValidateBeforeCall(webhookId, accountId, notificationWebhooksCreateAWebhookRequest, null);
        Type localVarReturnType = new TypeToken<AaaIdResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update a webhook (asynchronously)
     * Update a webhook destination.
     * @param webhookId  (required)
     * @param accountId  (required)
     * @param notificationWebhooksCreateAWebhookRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update a webhook response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update a webhook response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call notificationWebhooksUpdateAWebhookAsync(String webhookId, String accountId, NotificationWebhooksCreateAWebhookRequest notificationWebhooksCreateAWebhookRequest, final ApiCallback<AaaIdResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = notificationWebhooksUpdateAWebhookValidateBeforeCall(webhookId, accountId, notificationWebhooksCreateAWebhookRequest, _callback);
        Type localVarReturnType = new TypeToken<AaaIdResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
