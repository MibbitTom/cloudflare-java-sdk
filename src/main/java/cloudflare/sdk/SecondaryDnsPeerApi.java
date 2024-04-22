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


import cloudflare.sdk.models.SecondaryDnsAclDeleteAcl4XXResponse;
import cloudflare.sdk.models.SecondaryDnsComponentsSchemasIdResponse;
import cloudflare.sdk.models.SecondaryDnsPeer;
import cloudflare.sdk.models.SecondaryDnsPeerCreatePeer4XXResponse;
import cloudflare.sdk.models.SecondaryDnsPeerListPeers4XXResponse;
import cloudflare.sdk.models.SecondaryDnsSchemasResponseCollection;
import cloudflare.sdk.models.SecondaryDnsSchemasSingleResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecondaryDnsPeerApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SecondaryDnsPeerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SecondaryDnsPeerApi(ApiClient apiClient) {
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
     * Build call for secondaryDnsPeerCreatePeer
     * @param accountId  (required)
     * @param body  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Peer response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Peer response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call secondaryDnsPeerCreatePeerCall(Object accountId, Object body, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/secondary_dns/peers"
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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call secondaryDnsPeerCreatePeerValidateBeforeCall(Object accountId, Object body, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling secondaryDnsPeerCreatePeer(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling secondaryDnsPeerCreatePeer(Async)");
        }

        return secondaryDnsPeerCreatePeerCall(accountId, body, _callback);

    }

    /**
     * Create Peer
     * Create Peer.
     * @param accountId  (required)
     * @param body  (required)
     * @return SecondaryDnsSchemasSingleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Peer response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Peer response failure </td><td>  -  </td></tr>
     </table>
     */
    public SecondaryDnsSchemasSingleResponse secondaryDnsPeerCreatePeer(Object accountId, Object body) throws ApiException {
        ApiResponse<SecondaryDnsSchemasSingleResponse> localVarResp = secondaryDnsPeerCreatePeerWithHttpInfo(accountId, body);
        return localVarResp.getData();
    }

    /**
     * Create Peer
     * Create Peer.
     * @param accountId  (required)
     * @param body  (required)
     * @return ApiResponse&lt;SecondaryDnsSchemasSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Peer response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Peer response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SecondaryDnsSchemasSingleResponse> secondaryDnsPeerCreatePeerWithHttpInfo(Object accountId, Object body) throws ApiException {
        okhttp3.Call localVarCall = secondaryDnsPeerCreatePeerValidateBeforeCall(accountId, body, null);
        Type localVarReturnType = new TypeToken<SecondaryDnsSchemasSingleResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create Peer (asynchronously)
     * Create Peer.
     * @param accountId  (required)
     * @param body  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Peer response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Peer response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call secondaryDnsPeerCreatePeerAsync(Object accountId, Object body, final ApiCallback<SecondaryDnsSchemasSingleResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = secondaryDnsPeerCreatePeerValidateBeforeCall(accountId, body, _callback);
        Type localVarReturnType = new TypeToken<SecondaryDnsSchemasSingleResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for secondaryDnsPeerDeletePeer
     * @param peerId  (required)
     * @param accountId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete Peer response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete Peer response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call secondaryDnsPeerDeletePeerCall(Object peerId, Object accountId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/secondary_dns/peers/{peer_id}"
            .replace("{" + "peer_id" + "}", localVarApiClient.escapeString(peerId.toString()))
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
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call secondaryDnsPeerDeletePeerValidateBeforeCall(Object peerId, Object accountId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'peerId' is set
        if (peerId == null) {
            throw new ApiException("Missing the required parameter 'peerId' when calling secondaryDnsPeerDeletePeer(Async)");
        }

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling secondaryDnsPeerDeletePeer(Async)");
        }

        return secondaryDnsPeerDeletePeerCall(peerId, accountId, _callback);

    }

    /**
     * Delete Peer
     * Delete Peer.
     * @param peerId  (required)
     * @param accountId  (required)
     * @return SecondaryDnsComponentsSchemasIdResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete Peer response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete Peer response failure </td><td>  -  </td></tr>
     </table>
     */
    public SecondaryDnsComponentsSchemasIdResponse secondaryDnsPeerDeletePeer(Object peerId, Object accountId) throws ApiException {
        ApiResponse<SecondaryDnsComponentsSchemasIdResponse> localVarResp = secondaryDnsPeerDeletePeerWithHttpInfo(peerId, accountId);
        return localVarResp.getData();
    }

    /**
     * Delete Peer
     * Delete Peer.
     * @param peerId  (required)
     * @param accountId  (required)
     * @return ApiResponse&lt;SecondaryDnsComponentsSchemasIdResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete Peer response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete Peer response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SecondaryDnsComponentsSchemasIdResponse> secondaryDnsPeerDeletePeerWithHttpInfo(Object peerId, Object accountId) throws ApiException {
        okhttp3.Call localVarCall = secondaryDnsPeerDeletePeerValidateBeforeCall(peerId, accountId, null);
        Type localVarReturnType = new TypeToken<SecondaryDnsComponentsSchemasIdResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete Peer (asynchronously)
     * Delete Peer.
     * @param peerId  (required)
     * @param accountId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete Peer response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete Peer response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call secondaryDnsPeerDeletePeerAsync(Object peerId, Object accountId, final ApiCallback<SecondaryDnsComponentsSchemasIdResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = secondaryDnsPeerDeletePeerValidateBeforeCall(peerId, accountId, _callback);
        Type localVarReturnType = new TypeToken<SecondaryDnsComponentsSchemasIdResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for secondaryDnsPeerListPeers
     * @param accountId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Peers response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Peers response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call secondaryDnsPeerListPeersCall(Object accountId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/secondary_dns/peers"
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
    private okhttp3.Call secondaryDnsPeerListPeersValidateBeforeCall(Object accountId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling secondaryDnsPeerListPeers(Async)");
        }

        return secondaryDnsPeerListPeersCall(accountId, _callback);

    }

    /**
     * List Peers
     * List Peers.
     * @param accountId  (required)
     * @return SecondaryDnsSchemasResponseCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Peers response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Peers response failure </td><td>  -  </td></tr>
     </table>
     */
    public SecondaryDnsSchemasResponseCollection secondaryDnsPeerListPeers(Object accountId) throws ApiException {
        ApiResponse<SecondaryDnsSchemasResponseCollection> localVarResp = secondaryDnsPeerListPeersWithHttpInfo(accountId);
        return localVarResp.getData();
    }

    /**
     * List Peers
     * List Peers.
     * @param accountId  (required)
     * @return ApiResponse&lt;SecondaryDnsSchemasResponseCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Peers response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Peers response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SecondaryDnsSchemasResponseCollection> secondaryDnsPeerListPeersWithHttpInfo(Object accountId) throws ApiException {
        okhttp3.Call localVarCall = secondaryDnsPeerListPeersValidateBeforeCall(accountId, null);
        Type localVarReturnType = new TypeToken<SecondaryDnsSchemasResponseCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Peers (asynchronously)
     * List Peers.
     * @param accountId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Peers response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Peers response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call secondaryDnsPeerListPeersAsync(Object accountId, final ApiCallback<SecondaryDnsSchemasResponseCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = secondaryDnsPeerListPeersValidateBeforeCall(accountId, _callback);
        Type localVarReturnType = new TypeToken<SecondaryDnsSchemasResponseCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for secondaryDnsPeerPeerDetails
     * @param peerId  (required)
     * @param accountId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Peer Details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Peer Details response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call secondaryDnsPeerPeerDetailsCall(Object peerId, Object accountId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/secondary_dns/peers/{peer_id}"
            .replace("{" + "peer_id" + "}", localVarApiClient.escapeString(peerId.toString()))
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
    private okhttp3.Call secondaryDnsPeerPeerDetailsValidateBeforeCall(Object peerId, Object accountId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'peerId' is set
        if (peerId == null) {
            throw new ApiException("Missing the required parameter 'peerId' when calling secondaryDnsPeerPeerDetails(Async)");
        }

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling secondaryDnsPeerPeerDetails(Async)");
        }

        return secondaryDnsPeerPeerDetailsCall(peerId, accountId, _callback);

    }

    /**
     * Peer Details
     * Get Peer.
     * @param peerId  (required)
     * @param accountId  (required)
     * @return SecondaryDnsSchemasSingleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Peer Details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Peer Details response failure </td><td>  -  </td></tr>
     </table>
     */
    public SecondaryDnsSchemasSingleResponse secondaryDnsPeerPeerDetails(Object peerId, Object accountId) throws ApiException {
        ApiResponse<SecondaryDnsSchemasSingleResponse> localVarResp = secondaryDnsPeerPeerDetailsWithHttpInfo(peerId, accountId);
        return localVarResp.getData();
    }

    /**
     * Peer Details
     * Get Peer.
     * @param peerId  (required)
     * @param accountId  (required)
     * @return ApiResponse&lt;SecondaryDnsSchemasSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Peer Details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Peer Details response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SecondaryDnsSchemasSingleResponse> secondaryDnsPeerPeerDetailsWithHttpInfo(Object peerId, Object accountId) throws ApiException {
        okhttp3.Call localVarCall = secondaryDnsPeerPeerDetailsValidateBeforeCall(peerId, accountId, null);
        Type localVarReturnType = new TypeToken<SecondaryDnsSchemasSingleResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Peer Details (asynchronously)
     * Get Peer.
     * @param peerId  (required)
     * @param accountId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Peer Details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Peer Details response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call secondaryDnsPeerPeerDetailsAsync(Object peerId, Object accountId, final ApiCallback<SecondaryDnsSchemasSingleResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = secondaryDnsPeerPeerDetailsValidateBeforeCall(peerId, accountId, _callback);
        Type localVarReturnType = new TypeToken<SecondaryDnsSchemasSingleResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for secondaryDnsPeerUpdatePeer
     * @param peerId  (required)
     * @param accountId  (required)
     * @param secondaryDnsPeer  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Peer response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Peer response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call secondaryDnsPeerUpdatePeerCall(Object peerId, Object accountId, SecondaryDnsPeer secondaryDnsPeer, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = secondaryDnsPeer;

        // create path and map variables
        String localVarPath = "/accounts/{account_id}/secondary_dns/peers/{peer_id}"
            .replace("{" + "peer_id" + "}", localVarApiClient.escapeString(peerId.toString()))
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
    private okhttp3.Call secondaryDnsPeerUpdatePeerValidateBeforeCall(Object peerId, Object accountId, SecondaryDnsPeer secondaryDnsPeer, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'peerId' is set
        if (peerId == null) {
            throw new ApiException("Missing the required parameter 'peerId' when calling secondaryDnsPeerUpdatePeer(Async)");
        }

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling secondaryDnsPeerUpdatePeer(Async)");
        }

        // verify the required parameter 'secondaryDnsPeer' is set
        if (secondaryDnsPeer == null) {
            throw new ApiException("Missing the required parameter 'secondaryDnsPeer' when calling secondaryDnsPeerUpdatePeer(Async)");
        }

        return secondaryDnsPeerUpdatePeerCall(peerId, accountId, secondaryDnsPeer, _callback);

    }

    /**
     * Update Peer
     * Modify Peer.
     * @param peerId  (required)
     * @param accountId  (required)
     * @param secondaryDnsPeer  (required)
     * @return SecondaryDnsSchemasSingleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Peer response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Peer response failure </td><td>  -  </td></tr>
     </table>
     */
    public SecondaryDnsSchemasSingleResponse secondaryDnsPeerUpdatePeer(Object peerId, Object accountId, SecondaryDnsPeer secondaryDnsPeer) throws ApiException {
        ApiResponse<SecondaryDnsSchemasSingleResponse> localVarResp = secondaryDnsPeerUpdatePeerWithHttpInfo(peerId, accountId, secondaryDnsPeer);
        return localVarResp.getData();
    }

    /**
     * Update Peer
     * Modify Peer.
     * @param peerId  (required)
     * @param accountId  (required)
     * @param secondaryDnsPeer  (required)
     * @return ApiResponse&lt;SecondaryDnsSchemasSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Peer response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Peer response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SecondaryDnsSchemasSingleResponse> secondaryDnsPeerUpdatePeerWithHttpInfo(Object peerId, Object accountId, SecondaryDnsPeer secondaryDnsPeer) throws ApiException {
        okhttp3.Call localVarCall = secondaryDnsPeerUpdatePeerValidateBeforeCall(peerId, accountId, secondaryDnsPeer, null);
        Type localVarReturnType = new TypeToken<SecondaryDnsSchemasSingleResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Peer (asynchronously)
     * Modify Peer.
     * @param peerId  (required)
     * @param accountId  (required)
     * @param secondaryDnsPeer  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Peer response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Peer response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call secondaryDnsPeerUpdatePeerAsync(Object peerId, Object accountId, SecondaryDnsPeer secondaryDnsPeer, final ApiCallback<SecondaryDnsSchemasSingleResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = secondaryDnsPeerUpdatePeerValidateBeforeCall(peerId, accountId, secondaryDnsPeer, _callback);
        Type localVarReturnType = new TypeToken<SecondaryDnsSchemasSingleResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
