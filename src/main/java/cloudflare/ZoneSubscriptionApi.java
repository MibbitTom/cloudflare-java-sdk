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


import org.openapitools.client.model.BillSubsApiSubscriptionV2;
import org.openapitools.client.model.BillSubsApiZoneSubscriptionResponseSingle;
import org.openapitools.client.model.ZoneSubscriptionZoneSubscriptionDetails4XXResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZoneSubscriptionApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ZoneSubscriptionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ZoneSubscriptionApi(ApiClient apiClient) {
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
     * Build call for zoneSubscriptionCreateZoneSubscription
     * @param identifier  (required)
     * @param billSubsApiSubscriptionV2  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Zone Subscription response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Zone Subscription response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call zoneSubscriptionCreateZoneSubscriptionCall(String identifier, BillSubsApiSubscriptionV2 billSubsApiSubscriptionV2, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/zones/{identifier}/subscription"
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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call zoneSubscriptionCreateZoneSubscriptionValidateBeforeCall(String identifier, BillSubsApiSubscriptionV2 billSubsApiSubscriptionV2, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling zoneSubscriptionCreateZoneSubscription(Async)");
        }

        // verify the required parameter 'billSubsApiSubscriptionV2' is set
        if (billSubsApiSubscriptionV2 == null) {
            throw new ApiException("Missing the required parameter 'billSubsApiSubscriptionV2' when calling zoneSubscriptionCreateZoneSubscription(Async)");
        }

        return zoneSubscriptionCreateZoneSubscriptionCall(identifier, billSubsApiSubscriptionV2, _callback);

    }

    /**
     * Create Zone Subscription
     * Create a zone subscription, either plan or add-ons.
     * @param identifier  (required)
     * @param billSubsApiSubscriptionV2  (required)
     * @return BillSubsApiZoneSubscriptionResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Zone Subscription response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Zone Subscription response failure </td><td>  -  </td></tr>
     </table>
     */
    public BillSubsApiZoneSubscriptionResponseSingle zoneSubscriptionCreateZoneSubscription(String identifier, BillSubsApiSubscriptionV2 billSubsApiSubscriptionV2) throws ApiException {
        ApiResponse<BillSubsApiZoneSubscriptionResponseSingle> localVarResp = zoneSubscriptionCreateZoneSubscriptionWithHttpInfo(identifier, billSubsApiSubscriptionV2);
        return localVarResp.getData();
    }

    /**
     * Create Zone Subscription
     * Create a zone subscription, either plan or add-ons.
     * @param identifier  (required)
     * @param billSubsApiSubscriptionV2  (required)
     * @return ApiResponse&lt;BillSubsApiZoneSubscriptionResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Zone Subscription response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Zone Subscription response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BillSubsApiZoneSubscriptionResponseSingle> zoneSubscriptionCreateZoneSubscriptionWithHttpInfo(String identifier, BillSubsApiSubscriptionV2 billSubsApiSubscriptionV2) throws ApiException {
        okhttp3.Call localVarCall = zoneSubscriptionCreateZoneSubscriptionValidateBeforeCall(identifier, billSubsApiSubscriptionV2, null);
        Type localVarReturnType = new TypeToken<BillSubsApiZoneSubscriptionResponseSingle>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create Zone Subscription (asynchronously)
     * Create a zone subscription, either plan or add-ons.
     * @param identifier  (required)
     * @param billSubsApiSubscriptionV2  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Zone Subscription response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Zone Subscription response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call zoneSubscriptionCreateZoneSubscriptionAsync(String identifier, BillSubsApiSubscriptionV2 billSubsApiSubscriptionV2, final ApiCallback<BillSubsApiZoneSubscriptionResponseSingle> _callback) throws ApiException {

        okhttp3.Call localVarCall = zoneSubscriptionCreateZoneSubscriptionValidateBeforeCall(identifier, billSubsApiSubscriptionV2, _callback);
        Type localVarReturnType = new TypeToken<BillSubsApiZoneSubscriptionResponseSingle>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for zoneSubscriptionUpdateZoneSubscription
     * @param identifier  (required)
     * @param billSubsApiSubscriptionV2  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Zone Subscription response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Zone Subscription response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call zoneSubscriptionUpdateZoneSubscriptionCall(String identifier, BillSubsApiSubscriptionV2 billSubsApiSubscriptionV2, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/zones/{identifier}/subscription"
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
    private okhttp3.Call zoneSubscriptionUpdateZoneSubscriptionValidateBeforeCall(String identifier, BillSubsApiSubscriptionV2 billSubsApiSubscriptionV2, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling zoneSubscriptionUpdateZoneSubscription(Async)");
        }

        // verify the required parameter 'billSubsApiSubscriptionV2' is set
        if (billSubsApiSubscriptionV2 == null) {
            throw new ApiException("Missing the required parameter 'billSubsApiSubscriptionV2' when calling zoneSubscriptionUpdateZoneSubscription(Async)");
        }

        return zoneSubscriptionUpdateZoneSubscriptionCall(identifier, billSubsApiSubscriptionV2, _callback);

    }

    /**
     * Update Zone Subscription
     * Updates zone subscriptions, either plan or add-ons.
     * @param identifier  (required)
     * @param billSubsApiSubscriptionV2  (required)
     * @return BillSubsApiZoneSubscriptionResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Zone Subscription response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Zone Subscription response failure </td><td>  -  </td></tr>
     </table>
     */
    public BillSubsApiZoneSubscriptionResponseSingle zoneSubscriptionUpdateZoneSubscription(String identifier, BillSubsApiSubscriptionV2 billSubsApiSubscriptionV2) throws ApiException {
        ApiResponse<BillSubsApiZoneSubscriptionResponseSingle> localVarResp = zoneSubscriptionUpdateZoneSubscriptionWithHttpInfo(identifier, billSubsApiSubscriptionV2);
        return localVarResp.getData();
    }

    /**
     * Update Zone Subscription
     * Updates zone subscriptions, either plan or add-ons.
     * @param identifier  (required)
     * @param billSubsApiSubscriptionV2  (required)
     * @return ApiResponse&lt;BillSubsApiZoneSubscriptionResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Zone Subscription response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Zone Subscription response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BillSubsApiZoneSubscriptionResponseSingle> zoneSubscriptionUpdateZoneSubscriptionWithHttpInfo(String identifier, BillSubsApiSubscriptionV2 billSubsApiSubscriptionV2) throws ApiException {
        okhttp3.Call localVarCall = zoneSubscriptionUpdateZoneSubscriptionValidateBeforeCall(identifier, billSubsApiSubscriptionV2, null);
        Type localVarReturnType = new TypeToken<BillSubsApiZoneSubscriptionResponseSingle>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Zone Subscription (asynchronously)
     * Updates zone subscriptions, either plan or add-ons.
     * @param identifier  (required)
     * @param billSubsApiSubscriptionV2  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Zone Subscription response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Zone Subscription response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call zoneSubscriptionUpdateZoneSubscriptionAsync(String identifier, BillSubsApiSubscriptionV2 billSubsApiSubscriptionV2, final ApiCallback<BillSubsApiZoneSubscriptionResponseSingle> _callback) throws ApiException {

        okhttp3.Call localVarCall = zoneSubscriptionUpdateZoneSubscriptionValidateBeforeCall(identifier, billSubsApiSubscriptionV2, _callback);
        Type localVarReturnType = new TypeToken<BillSubsApiZoneSubscriptionResponseSingle>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for zoneSubscriptionZoneSubscriptionDetails
     * @param identifier  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zone Subscription Details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Zone Subscription Details response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call zoneSubscriptionZoneSubscriptionDetailsCall(String identifier, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/zones/{identifier}/subscription"
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
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key", "api_token", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call zoneSubscriptionZoneSubscriptionDetailsValidateBeforeCall(String identifier, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling zoneSubscriptionZoneSubscriptionDetails(Async)");
        }

        return zoneSubscriptionZoneSubscriptionDetailsCall(identifier, _callback);

    }

    /**
     * Zone Subscription Details
     * Lists zone subscription details.
     * @param identifier  (required)
     * @return BillSubsApiZoneSubscriptionResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zone Subscription Details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Zone Subscription Details response failure </td><td>  -  </td></tr>
     </table>
     */
    public BillSubsApiZoneSubscriptionResponseSingle zoneSubscriptionZoneSubscriptionDetails(String identifier) throws ApiException {
        ApiResponse<BillSubsApiZoneSubscriptionResponseSingle> localVarResp = zoneSubscriptionZoneSubscriptionDetailsWithHttpInfo(identifier);
        return localVarResp.getData();
    }

    /**
     * Zone Subscription Details
     * Lists zone subscription details.
     * @param identifier  (required)
     * @return ApiResponse&lt;BillSubsApiZoneSubscriptionResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zone Subscription Details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Zone Subscription Details response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BillSubsApiZoneSubscriptionResponseSingle> zoneSubscriptionZoneSubscriptionDetailsWithHttpInfo(String identifier) throws ApiException {
        okhttp3.Call localVarCall = zoneSubscriptionZoneSubscriptionDetailsValidateBeforeCall(identifier, null);
        Type localVarReturnType = new TypeToken<BillSubsApiZoneSubscriptionResponseSingle>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Zone Subscription Details (asynchronously)
     * Lists zone subscription details.
     * @param identifier  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zone Subscription Details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Zone Subscription Details response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call zoneSubscriptionZoneSubscriptionDetailsAsync(String identifier, final ApiCallback<BillSubsApiZoneSubscriptionResponseSingle> _callback) throws ApiException {

        okhttp3.Call localVarCall = zoneSubscriptionZoneSubscriptionDetailsValidateBeforeCall(identifier, _callback);
        Type localVarReturnType = new TypeToken<BillSubsApiZoneSubscriptionResponseSingle>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
