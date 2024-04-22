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


import cloudflare.sdk.models.AccountSubscriptionsDeleteSubscription200ResponseAllOfResult;
import cloudflare.sdk.models.BillSubsApiSubscriptionV2;
import cloudflare.sdk.models.BillSubsApiUserSubscriptionResponseCollection;
import cloudflare.sdk.models.BillSubsApiUserSubscriptionResponseSingle;
import cloudflare.sdk.models.UserSubscriptionDeleteUserSubscription4XXResponse;
import cloudflare.sdk.models.UserSubscriptionGetUserSubscriptions4XXResponse;
import cloudflare.sdk.models.UserSubscriptionUpdateUserSubscription4XXResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserSubscriptionApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public UserSubscriptionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UserSubscriptionApi(ApiClient apiClient) {
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
     * Build call for userSubscriptionDeleteUserSubscription
     * @param identifier  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete User Subscription response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete User Subscription response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call userSubscriptionDeleteUserSubscriptionCall(String identifier, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/user/subscriptions/{identifier}"
            .replace("{" + "identifier" + "}", localVarApiClient.escapeString(identifier.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call userSubscriptionDeleteUserSubscriptionValidateBeforeCall(String identifier, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling userSubscriptionDeleteUserSubscription(Async)");
        }

        return userSubscriptionDeleteUserSubscriptionCall(identifier, _callback);

    }

    /**
     * Delete User Subscription
     * Deletes a user&#39;s subscription.
     * @param identifier  (required)
     * @return AccountSubscriptionsDeleteSubscription200ResponseAllOfResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete User Subscription response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete User Subscription response failure </td><td>  -  </td></tr>
     </table>
     */
    public AccountSubscriptionsDeleteSubscription200ResponseAllOfResult userSubscriptionDeleteUserSubscription(String identifier) throws ApiException {
        ApiResponse<AccountSubscriptionsDeleteSubscription200ResponseAllOfResult> localVarResp = userSubscriptionDeleteUserSubscriptionWithHttpInfo(identifier);
        return localVarResp.getData();
    }

    /**
     * Delete User Subscription
     * Deletes a user&#39;s subscription.
     * @param identifier  (required)
     * @return ApiResponse&lt;AccountSubscriptionsDeleteSubscription200ResponseAllOfResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete User Subscription response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete User Subscription response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AccountSubscriptionsDeleteSubscription200ResponseAllOfResult> userSubscriptionDeleteUserSubscriptionWithHttpInfo(String identifier) throws ApiException {
        okhttp3.Call localVarCall = userSubscriptionDeleteUserSubscriptionValidateBeforeCall(identifier, null);
        Type localVarReturnType = new TypeToken<AccountSubscriptionsDeleteSubscription200ResponseAllOfResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete User Subscription (asynchronously)
     * Deletes a user&#39;s subscription.
     * @param identifier  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete User Subscription response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete User Subscription response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call userSubscriptionDeleteUserSubscriptionAsync(String identifier, final ApiCallback<AccountSubscriptionsDeleteSubscription200ResponseAllOfResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = userSubscriptionDeleteUserSubscriptionValidateBeforeCall(identifier, _callback);
        Type localVarReturnType = new TypeToken<AccountSubscriptionsDeleteSubscription200ResponseAllOfResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for userSubscriptionGetUserSubscriptions
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get User Subscriptions response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get User Subscriptions response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call userSubscriptionGetUserSubscriptionsCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/user/subscriptions";

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
    private okhttp3.Call userSubscriptionGetUserSubscriptionsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return userSubscriptionGetUserSubscriptionsCall(_callback);

    }

    /**
     * Get User Subscriptions
     * Lists all of a user&#39;s subscriptions.
     * @return BillSubsApiUserSubscriptionResponseCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get User Subscriptions response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get User Subscriptions response failure </td><td>  -  </td></tr>
     </table>
     */
    public BillSubsApiUserSubscriptionResponseCollection userSubscriptionGetUserSubscriptions() throws ApiException {
        ApiResponse<BillSubsApiUserSubscriptionResponseCollection> localVarResp = userSubscriptionGetUserSubscriptionsWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get User Subscriptions
     * Lists all of a user&#39;s subscriptions.
     * @return ApiResponse&lt;BillSubsApiUserSubscriptionResponseCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get User Subscriptions response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get User Subscriptions response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BillSubsApiUserSubscriptionResponseCollection> userSubscriptionGetUserSubscriptionsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = userSubscriptionGetUserSubscriptionsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<BillSubsApiUserSubscriptionResponseCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get User Subscriptions (asynchronously)
     * Lists all of a user&#39;s subscriptions.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get User Subscriptions response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get User Subscriptions response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call userSubscriptionGetUserSubscriptionsAsync(final ApiCallback<BillSubsApiUserSubscriptionResponseCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = userSubscriptionGetUserSubscriptionsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<BillSubsApiUserSubscriptionResponseCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for userSubscriptionUpdateUserSubscription
     * @param identifier  (required)
     * @param billSubsApiSubscriptionV2  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update User Subscription response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update User Subscription response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call userSubscriptionUpdateUserSubscriptionCall(String identifier, BillSubsApiSubscriptionV2 billSubsApiSubscriptionV2, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = billSubsApiSubscriptionV2;

        // create path and map variables
        String localVarPath = "/user/subscriptions/{identifier}"
            .replace("{" + "identifier" + "}", localVarApiClient.escapeString(identifier.toString()));

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
    private okhttp3.Call userSubscriptionUpdateUserSubscriptionValidateBeforeCall(String identifier, BillSubsApiSubscriptionV2 billSubsApiSubscriptionV2, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling userSubscriptionUpdateUserSubscription(Async)");
        }

        // verify the required parameter 'billSubsApiSubscriptionV2' is set
        if (billSubsApiSubscriptionV2 == null) {
            throw new ApiException("Missing the required parameter 'billSubsApiSubscriptionV2' when calling userSubscriptionUpdateUserSubscription(Async)");
        }

        return userSubscriptionUpdateUserSubscriptionCall(identifier, billSubsApiSubscriptionV2, _callback);

    }

    /**
     * Update User Subscription
     * Updates a user&#39;s subscriptions.
     * @param identifier  (required)
     * @param billSubsApiSubscriptionV2  (required)
     * @return BillSubsApiUserSubscriptionResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update User Subscription response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update User Subscription response failure </td><td>  -  </td></tr>
     </table>
     */
    public BillSubsApiUserSubscriptionResponseSingle userSubscriptionUpdateUserSubscription(String identifier, BillSubsApiSubscriptionV2 billSubsApiSubscriptionV2) throws ApiException {
        ApiResponse<BillSubsApiUserSubscriptionResponseSingle> localVarResp = userSubscriptionUpdateUserSubscriptionWithHttpInfo(identifier, billSubsApiSubscriptionV2);
        return localVarResp.getData();
    }

    /**
     * Update User Subscription
     * Updates a user&#39;s subscriptions.
     * @param identifier  (required)
     * @param billSubsApiSubscriptionV2  (required)
     * @return ApiResponse&lt;BillSubsApiUserSubscriptionResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update User Subscription response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update User Subscription response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BillSubsApiUserSubscriptionResponseSingle> userSubscriptionUpdateUserSubscriptionWithHttpInfo(String identifier, BillSubsApiSubscriptionV2 billSubsApiSubscriptionV2) throws ApiException {
        okhttp3.Call localVarCall = userSubscriptionUpdateUserSubscriptionValidateBeforeCall(identifier, billSubsApiSubscriptionV2, null);
        Type localVarReturnType = new TypeToken<BillSubsApiUserSubscriptionResponseSingle>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update User Subscription (asynchronously)
     * Updates a user&#39;s subscriptions.
     * @param identifier  (required)
     * @param billSubsApiSubscriptionV2  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update User Subscription response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update User Subscription response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call userSubscriptionUpdateUserSubscriptionAsync(String identifier, BillSubsApiSubscriptionV2 billSubsApiSubscriptionV2, final ApiCallback<BillSubsApiUserSubscriptionResponseSingle> _callback) throws ApiException {

        okhttp3.Call localVarCall = userSubscriptionUpdateUserSubscriptionValidateBeforeCall(identifier, billSubsApiSubscriptionV2, _callback);
        Type localVarReturnType = new TypeToken<BillSubsApiUserSubscriptionResponseSingle>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
