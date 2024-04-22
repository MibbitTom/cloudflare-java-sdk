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


import org.openapitools.client.model.TunnelVirtualNetworkCreateAVirtualNetwork4XXResponse;
import org.openapitools.client.model.TunnelVirtualNetworkCreateAVirtualNetworkRequest;
import org.openapitools.client.model.TunnelVirtualNetworkListVirtualNetworks4XXResponse;
import org.openapitools.client.model.TunnelVirtualNetworkUpdateAVirtualNetworkRequest;
import org.openapitools.client.model.TunnelVnetResponseCollection;
import org.openapitools.client.model.TunnelVnetResponseSingle;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TunnelVirtualNetworkApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TunnelVirtualNetworkApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TunnelVirtualNetworkApi(ApiClient apiClient) {
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
     * Build call for tunnelVirtualNetworkCreateAVirtualNetwork
     * @param accountId  (required)
     * @param tunnelVirtualNetworkCreateAVirtualNetworkRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create a virtual network response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create a virtual network response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call tunnelVirtualNetworkCreateAVirtualNetworkCall(String accountId, TunnelVirtualNetworkCreateAVirtualNetworkRequest tunnelVirtualNetworkCreateAVirtualNetworkRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = tunnelVirtualNetworkCreateAVirtualNetworkRequest;

        // create path and map variables
        String localVarPath = "/accounts/{account_id}/teamnet/virtual_networks"
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
    private okhttp3.Call tunnelVirtualNetworkCreateAVirtualNetworkValidateBeforeCall(String accountId, TunnelVirtualNetworkCreateAVirtualNetworkRequest tunnelVirtualNetworkCreateAVirtualNetworkRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling tunnelVirtualNetworkCreateAVirtualNetwork(Async)");
        }

        // verify the required parameter 'tunnelVirtualNetworkCreateAVirtualNetworkRequest' is set
        if (tunnelVirtualNetworkCreateAVirtualNetworkRequest == null) {
            throw new ApiException("Missing the required parameter 'tunnelVirtualNetworkCreateAVirtualNetworkRequest' when calling tunnelVirtualNetworkCreateAVirtualNetwork(Async)");
        }

        return tunnelVirtualNetworkCreateAVirtualNetworkCall(accountId, tunnelVirtualNetworkCreateAVirtualNetworkRequest, _callback);

    }

    /**
     * Create a virtual network
     * Adds a new virtual network to an account.
     * @param accountId  (required)
     * @param tunnelVirtualNetworkCreateAVirtualNetworkRequest  (required)
     * @return TunnelVnetResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create a virtual network response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create a virtual network response failure </td><td>  -  </td></tr>
     </table>
     */
    public TunnelVnetResponseSingle tunnelVirtualNetworkCreateAVirtualNetwork(String accountId, TunnelVirtualNetworkCreateAVirtualNetworkRequest tunnelVirtualNetworkCreateAVirtualNetworkRequest) throws ApiException {
        ApiResponse<TunnelVnetResponseSingle> localVarResp = tunnelVirtualNetworkCreateAVirtualNetworkWithHttpInfo(accountId, tunnelVirtualNetworkCreateAVirtualNetworkRequest);
        return localVarResp.getData();
    }

    /**
     * Create a virtual network
     * Adds a new virtual network to an account.
     * @param accountId  (required)
     * @param tunnelVirtualNetworkCreateAVirtualNetworkRequest  (required)
     * @return ApiResponse&lt;TunnelVnetResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create a virtual network response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create a virtual network response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TunnelVnetResponseSingle> tunnelVirtualNetworkCreateAVirtualNetworkWithHttpInfo(String accountId, TunnelVirtualNetworkCreateAVirtualNetworkRequest tunnelVirtualNetworkCreateAVirtualNetworkRequest) throws ApiException {
        okhttp3.Call localVarCall = tunnelVirtualNetworkCreateAVirtualNetworkValidateBeforeCall(accountId, tunnelVirtualNetworkCreateAVirtualNetworkRequest, null);
        Type localVarReturnType = new TypeToken<TunnelVnetResponseSingle>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a virtual network (asynchronously)
     * Adds a new virtual network to an account.
     * @param accountId  (required)
     * @param tunnelVirtualNetworkCreateAVirtualNetworkRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create a virtual network response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create a virtual network response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call tunnelVirtualNetworkCreateAVirtualNetworkAsync(String accountId, TunnelVirtualNetworkCreateAVirtualNetworkRequest tunnelVirtualNetworkCreateAVirtualNetworkRequest, final ApiCallback<TunnelVnetResponseSingle> _callback) throws ApiException {

        okhttp3.Call localVarCall = tunnelVirtualNetworkCreateAVirtualNetworkValidateBeforeCall(accountId, tunnelVirtualNetworkCreateAVirtualNetworkRequest, _callback);
        Type localVarReturnType = new TypeToken<TunnelVnetResponseSingle>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for tunnelVirtualNetworkDeleteAVirtualNetwork
     * @param virtualNetworkId  (required)
     * @param accountId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete a virtual network response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete a virtual network response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call tunnelVirtualNetworkDeleteAVirtualNetworkCall(String virtualNetworkId, String accountId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/teamnet/virtual_networks/{virtual_network_id}"
            .replace("{" + "virtual_network_id" + "}", localVarApiClient.escapeString(virtualNetworkId.toString()))
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
    private okhttp3.Call tunnelVirtualNetworkDeleteAVirtualNetworkValidateBeforeCall(String virtualNetworkId, String accountId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'virtualNetworkId' is set
        if (virtualNetworkId == null) {
            throw new ApiException("Missing the required parameter 'virtualNetworkId' when calling tunnelVirtualNetworkDeleteAVirtualNetwork(Async)");
        }

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling tunnelVirtualNetworkDeleteAVirtualNetwork(Async)");
        }

        return tunnelVirtualNetworkDeleteAVirtualNetworkCall(virtualNetworkId, accountId, _callback);

    }

    /**
     * Delete a virtual network
     * Deletes an existing virtual network.
     * @param virtualNetworkId  (required)
     * @param accountId  (required)
     * @return TunnelVnetResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete a virtual network response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete a virtual network response failure </td><td>  -  </td></tr>
     </table>
     */
    public TunnelVnetResponseSingle tunnelVirtualNetworkDeleteAVirtualNetwork(String virtualNetworkId, String accountId) throws ApiException {
        ApiResponse<TunnelVnetResponseSingle> localVarResp = tunnelVirtualNetworkDeleteAVirtualNetworkWithHttpInfo(virtualNetworkId, accountId);
        return localVarResp.getData();
    }

    /**
     * Delete a virtual network
     * Deletes an existing virtual network.
     * @param virtualNetworkId  (required)
     * @param accountId  (required)
     * @return ApiResponse&lt;TunnelVnetResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete a virtual network response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete a virtual network response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TunnelVnetResponseSingle> tunnelVirtualNetworkDeleteAVirtualNetworkWithHttpInfo(String virtualNetworkId, String accountId) throws ApiException {
        okhttp3.Call localVarCall = tunnelVirtualNetworkDeleteAVirtualNetworkValidateBeforeCall(virtualNetworkId, accountId, null);
        Type localVarReturnType = new TypeToken<TunnelVnetResponseSingle>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete a virtual network (asynchronously)
     * Deletes an existing virtual network.
     * @param virtualNetworkId  (required)
     * @param accountId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete a virtual network response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete a virtual network response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call tunnelVirtualNetworkDeleteAVirtualNetworkAsync(String virtualNetworkId, String accountId, final ApiCallback<TunnelVnetResponseSingle> _callback) throws ApiException {

        okhttp3.Call localVarCall = tunnelVirtualNetworkDeleteAVirtualNetworkValidateBeforeCall(virtualNetworkId, accountId, _callback);
        Type localVarReturnType = new TypeToken<TunnelVnetResponseSingle>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for tunnelVirtualNetworkListVirtualNetworks
     * @param accountId  (required)
     * @param name  (optional)
     * @param isDefault  (optional)
     * @param isDeleted  (optional)
     * @param vnetName  (optional)
     * @param vnetId  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List virtual networks response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List virtual networks response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call tunnelVirtualNetworkListVirtualNetworksCall(String accountId, String name, Object isDefault, Object isDeleted, String vnetName, String vnetId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/teamnet/virtual_networks"
            .replace("{" + "account_id" + "}", localVarApiClient.escapeString(accountId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (name != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("name", name));
        }

        if (isDefault != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("is_default", isDefault));
        }

        if (isDeleted != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("is_deleted", isDeleted));
        }

        if (vnetName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("vnet_name", vnetName));
        }

        if (vnetId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("vnet_id", vnetId));
        }

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
    private okhttp3.Call tunnelVirtualNetworkListVirtualNetworksValidateBeforeCall(String accountId, String name, Object isDefault, Object isDeleted, String vnetName, String vnetId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling tunnelVirtualNetworkListVirtualNetworks(Async)");
        }

        return tunnelVirtualNetworkListVirtualNetworksCall(accountId, name, isDefault, isDeleted, vnetName, vnetId, _callback);

    }

    /**
     * List virtual networks
     * Lists and filters virtual networks in an account.
     * @param accountId  (required)
     * @param name  (optional)
     * @param isDefault  (optional)
     * @param isDeleted  (optional)
     * @param vnetName  (optional)
     * @param vnetId  (optional)
     * @return TunnelVnetResponseCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List virtual networks response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List virtual networks response failure </td><td>  -  </td></tr>
     </table>
     */
    public TunnelVnetResponseCollection tunnelVirtualNetworkListVirtualNetworks(String accountId, String name, Object isDefault, Object isDeleted, String vnetName, String vnetId) throws ApiException {
        ApiResponse<TunnelVnetResponseCollection> localVarResp = tunnelVirtualNetworkListVirtualNetworksWithHttpInfo(accountId, name, isDefault, isDeleted, vnetName, vnetId);
        return localVarResp.getData();
    }

    /**
     * List virtual networks
     * Lists and filters virtual networks in an account.
     * @param accountId  (required)
     * @param name  (optional)
     * @param isDefault  (optional)
     * @param isDeleted  (optional)
     * @param vnetName  (optional)
     * @param vnetId  (optional)
     * @return ApiResponse&lt;TunnelVnetResponseCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List virtual networks response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List virtual networks response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TunnelVnetResponseCollection> tunnelVirtualNetworkListVirtualNetworksWithHttpInfo(String accountId, String name, Object isDefault, Object isDeleted, String vnetName, String vnetId) throws ApiException {
        okhttp3.Call localVarCall = tunnelVirtualNetworkListVirtualNetworksValidateBeforeCall(accountId, name, isDefault, isDeleted, vnetName, vnetId, null);
        Type localVarReturnType = new TypeToken<TunnelVnetResponseCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List virtual networks (asynchronously)
     * Lists and filters virtual networks in an account.
     * @param accountId  (required)
     * @param name  (optional)
     * @param isDefault  (optional)
     * @param isDeleted  (optional)
     * @param vnetName  (optional)
     * @param vnetId  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List virtual networks response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List virtual networks response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call tunnelVirtualNetworkListVirtualNetworksAsync(String accountId, String name, Object isDefault, Object isDeleted, String vnetName, String vnetId, final ApiCallback<TunnelVnetResponseCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = tunnelVirtualNetworkListVirtualNetworksValidateBeforeCall(accountId, name, isDefault, isDeleted, vnetName, vnetId, _callback);
        Type localVarReturnType = new TypeToken<TunnelVnetResponseCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for tunnelVirtualNetworkUpdateAVirtualNetwork
     * @param virtualNetworkId  (required)
     * @param accountId  (required)
     * @param tunnelVirtualNetworkUpdateAVirtualNetworkRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update a virtual network response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update a virtual network response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call tunnelVirtualNetworkUpdateAVirtualNetworkCall(String virtualNetworkId, String accountId, TunnelVirtualNetworkUpdateAVirtualNetworkRequest tunnelVirtualNetworkUpdateAVirtualNetworkRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = tunnelVirtualNetworkUpdateAVirtualNetworkRequest;

        // create path and map variables
        String localVarPath = "/accounts/{account_id}/teamnet/virtual_networks/{virtual_network_id}"
            .replace("{" + "virtual_network_id" + "}", localVarApiClient.escapeString(virtualNetworkId.toString()))
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
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call tunnelVirtualNetworkUpdateAVirtualNetworkValidateBeforeCall(String virtualNetworkId, String accountId, TunnelVirtualNetworkUpdateAVirtualNetworkRequest tunnelVirtualNetworkUpdateAVirtualNetworkRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'virtualNetworkId' is set
        if (virtualNetworkId == null) {
            throw new ApiException("Missing the required parameter 'virtualNetworkId' when calling tunnelVirtualNetworkUpdateAVirtualNetwork(Async)");
        }

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling tunnelVirtualNetworkUpdateAVirtualNetwork(Async)");
        }

        // verify the required parameter 'tunnelVirtualNetworkUpdateAVirtualNetworkRequest' is set
        if (tunnelVirtualNetworkUpdateAVirtualNetworkRequest == null) {
            throw new ApiException("Missing the required parameter 'tunnelVirtualNetworkUpdateAVirtualNetworkRequest' when calling tunnelVirtualNetworkUpdateAVirtualNetwork(Async)");
        }

        return tunnelVirtualNetworkUpdateAVirtualNetworkCall(virtualNetworkId, accountId, tunnelVirtualNetworkUpdateAVirtualNetworkRequest, _callback);

    }

    /**
     * Update a virtual network
     * Updates an existing virtual network.
     * @param virtualNetworkId  (required)
     * @param accountId  (required)
     * @param tunnelVirtualNetworkUpdateAVirtualNetworkRequest  (required)
     * @return TunnelVnetResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update a virtual network response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update a virtual network response failure </td><td>  -  </td></tr>
     </table>
     */
    public TunnelVnetResponseSingle tunnelVirtualNetworkUpdateAVirtualNetwork(String virtualNetworkId, String accountId, TunnelVirtualNetworkUpdateAVirtualNetworkRequest tunnelVirtualNetworkUpdateAVirtualNetworkRequest) throws ApiException {
        ApiResponse<TunnelVnetResponseSingle> localVarResp = tunnelVirtualNetworkUpdateAVirtualNetworkWithHttpInfo(virtualNetworkId, accountId, tunnelVirtualNetworkUpdateAVirtualNetworkRequest);
        return localVarResp.getData();
    }

    /**
     * Update a virtual network
     * Updates an existing virtual network.
     * @param virtualNetworkId  (required)
     * @param accountId  (required)
     * @param tunnelVirtualNetworkUpdateAVirtualNetworkRequest  (required)
     * @return ApiResponse&lt;TunnelVnetResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update a virtual network response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update a virtual network response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TunnelVnetResponseSingle> tunnelVirtualNetworkUpdateAVirtualNetworkWithHttpInfo(String virtualNetworkId, String accountId, TunnelVirtualNetworkUpdateAVirtualNetworkRequest tunnelVirtualNetworkUpdateAVirtualNetworkRequest) throws ApiException {
        okhttp3.Call localVarCall = tunnelVirtualNetworkUpdateAVirtualNetworkValidateBeforeCall(virtualNetworkId, accountId, tunnelVirtualNetworkUpdateAVirtualNetworkRequest, null);
        Type localVarReturnType = new TypeToken<TunnelVnetResponseSingle>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update a virtual network (asynchronously)
     * Updates an existing virtual network.
     * @param virtualNetworkId  (required)
     * @param accountId  (required)
     * @param tunnelVirtualNetworkUpdateAVirtualNetworkRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update a virtual network response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update a virtual network response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call tunnelVirtualNetworkUpdateAVirtualNetworkAsync(String virtualNetworkId, String accountId, TunnelVirtualNetworkUpdateAVirtualNetworkRequest tunnelVirtualNetworkUpdateAVirtualNetworkRequest, final ApiCallback<TunnelVnetResponseSingle> _callback) throws ApiException {

        okhttp3.Call localVarCall = tunnelVirtualNetworkUpdateAVirtualNetworkValidateBeforeCall(virtualNetworkId, accountId, tunnelVirtualNetworkUpdateAVirtualNetworkRequest, _callback);
        Type localVarReturnType = new TypeToken<TunnelVnetResponseSingle>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
