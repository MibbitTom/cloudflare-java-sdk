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


import org.openapitools.client.model.AddressingIdResponse;
import org.openapitools.client.model.AddressingSchemasResponseCollection;
import org.openapitools.client.model.AddressingSchemasSingleResponse;
import org.openapitools.client.model.IpAddressManagementPrefixDelegationCreatePrefixDelegation4XXResponse;
import org.openapitools.client.model.IpAddressManagementPrefixDelegationCreatePrefixDelegationRequest;
import org.openapitools.client.model.IpAddressManagementPrefixDelegationDeletePrefixDelegation4XXResponse;
import org.openapitools.client.model.IpAddressManagementPrefixDelegationListPrefixDelegations4XXResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IpAddressManagementPrefixDelegationApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public IpAddressManagementPrefixDelegationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public IpAddressManagementPrefixDelegationApi(ApiClient apiClient) {
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
     * Build call for ipAddressManagementPrefixDelegationCreatePrefixDelegation
     * @param prefixId  (required)
     * @param accountId  (required)
     * @param ipAddressManagementPrefixDelegationCreatePrefixDelegationRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Prefix Delegation response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Prefix Delegation response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ipAddressManagementPrefixDelegationCreatePrefixDelegationCall(String prefixId, String accountId, IpAddressManagementPrefixDelegationCreatePrefixDelegationRequest ipAddressManagementPrefixDelegationCreatePrefixDelegationRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = ipAddressManagementPrefixDelegationCreatePrefixDelegationRequest;

        // create path and map variables
        String localVarPath = "/accounts/{account_id}/addressing/prefixes/{prefix_id}/delegations"
            .replace("{" + "prefix_id" + "}", localVarApiClient.escapeString(prefixId.toString()))
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
    private okhttp3.Call ipAddressManagementPrefixDelegationCreatePrefixDelegationValidateBeforeCall(String prefixId, String accountId, IpAddressManagementPrefixDelegationCreatePrefixDelegationRequest ipAddressManagementPrefixDelegationCreatePrefixDelegationRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'prefixId' is set
        if (prefixId == null) {
            throw new ApiException("Missing the required parameter 'prefixId' when calling ipAddressManagementPrefixDelegationCreatePrefixDelegation(Async)");
        }

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling ipAddressManagementPrefixDelegationCreatePrefixDelegation(Async)");
        }

        // verify the required parameter 'ipAddressManagementPrefixDelegationCreatePrefixDelegationRequest' is set
        if (ipAddressManagementPrefixDelegationCreatePrefixDelegationRequest == null) {
            throw new ApiException("Missing the required parameter 'ipAddressManagementPrefixDelegationCreatePrefixDelegationRequest' when calling ipAddressManagementPrefixDelegationCreatePrefixDelegation(Async)");
        }

        return ipAddressManagementPrefixDelegationCreatePrefixDelegationCall(prefixId, accountId, ipAddressManagementPrefixDelegationCreatePrefixDelegationRequest, _callback);

    }

    /**
     * Create Prefix Delegation
     * Create a new account delegation for a given IP prefix.
     * @param prefixId  (required)
     * @param accountId  (required)
     * @param ipAddressManagementPrefixDelegationCreatePrefixDelegationRequest  (required)
     * @return AddressingSchemasSingleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Prefix Delegation response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Prefix Delegation response failure </td><td>  -  </td></tr>
     </table>
     */
    public AddressingSchemasSingleResponse ipAddressManagementPrefixDelegationCreatePrefixDelegation(String prefixId, String accountId, IpAddressManagementPrefixDelegationCreatePrefixDelegationRequest ipAddressManagementPrefixDelegationCreatePrefixDelegationRequest) throws ApiException {
        ApiResponse<AddressingSchemasSingleResponse> localVarResp = ipAddressManagementPrefixDelegationCreatePrefixDelegationWithHttpInfo(prefixId, accountId, ipAddressManagementPrefixDelegationCreatePrefixDelegationRequest);
        return localVarResp.getData();
    }

    /**
     * Create Prefix Delegation
     * Create a new account delegation for a given IP prefix.
     * @param prefixId  (required)
     * @param accountId  (required)
     * @param ipAddressManagementPrefixDelegationCreatePrefixDelegationRequest  (required)
     * @return ApiResponse&lt;AddressingSchemasSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Prefix Delegation response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Prefix Delegation response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AddressingSchemasSingleResponse> ipAddressManagementPrefixDelegationCreatePrefixDelegationWithHttpInfo(String prefixId, String accountId, IpAddressManagementPrefixDelegationCreatePrefixDelegationRequest ipAddressManagementPrefixDelegationCreatePrefixDelegationRequest) throws ApiException {
        okhttp3.Call localVarCall = ipAddressManagementPrefixDelegationCreatePrefixDelegationValidateBeforeCall(prefixId, accountId, ipAddressManagementPrefixDelegationCreatePrefixDelegationRequest, null);
        Type localVarReturnType = new TypeToken<AddressingSchemasSingleResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create Prefix Delegation (asynchronously)
     * Create a new account delegation for a given IP prefix.
     * @param prefixId  (required)
     * @param accountId  (required)
     * @param ipAddressManagementPrefixDelegationCreatePrefixDelegationRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Prefix Delegation response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Prefix Delegation response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ipAddressManagementPrefixDelegationCreatePrefixDelegationAsync(String prefixId, String accountId, IpAddressManagementPrefixDelegationCreatePrefixDelegationRequest ipAddressManagementPrefixDelegationCreatePrefixDelegationRequest, final ApiCallback<AddressingSchemasSingleResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = ipAddressManagementPrefixDelegationCreatePrefixDelegationValidateBeforeCall(prefixId, accountId, ipAddressManagementPrefixDelegationCreatePrefixDelegationRequest, _callback);
        Type localVarReturnType = new TypeToken<AddressingSchemasSingleResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for ipAddressManagementPrefixDelegationDeletePrefixDelegation
     * @param delegationId  (required)
     * @param prefixId  (required)
     * @param accountId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete Prefix Delegation response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete Prefix Delegation response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ipAddressManagementPrefixDelegationDeletePrefixDelegationCall(String delegationId, String prefixId, String accountId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/addressing/prefixes/{prefix_id}/delegations/{delegation_id}"
            .replace("{" + "delegation_id" + "}", localVarApiClient.escapeString(delegationId.toString()))
            .replace("{" + "prefix_id" + "}", localVarApiClient.escapeString(prefixId.toString()))
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
    private okhttp3.Call ipAddressManagementPrefixDelegationDeletePrefixDelegationValidateBeforeCall(String delegationId, String prefixId, String accountId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'delegationId' is set
        if (delegationId == null) {
            throw new ApiException("Missing the required parameter 'delegationId' when calling ipAddressManagementPrefixDelegationDeletePrefixDelegation(Async)");
        }

        // verify the required parameter 'prefixId' is set
        if (prefixId == null) {
            throw new ApiException("Missing the required parameter 'prefixId' when calling ipAddressManagementPrefixDelegationDeletePrefixDelegation(Async)");
        }

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling ipAddressManagementPrefixDelegationDeletePrefixDelegation(Async)");
        }

        return ipAddressManagementPrefixDelegationDeletePrefixDelegationCall(delegationId, prefixId, accountId, _callback);

    }

    /**
     * Delete Prefix Delegation
     * Delete an account delegation for a given IP prefix.
     * @param delegationId  (required)
     * @param prefixId  (required)
     * @param accountId  (required)
     * @return AddressingIdResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete Prefix Delegation response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete Prefix Delegation response failure </td><td>  -  </td></tr>
     </table>
     */
    public AddressingIdResponse ipAddressManagementPrefixDelegationDeletePrefixDelegation(String delegationId, String prefixId, String accountId) throws ApiException {
        ApiResponse<AddressingIdResponse> localVarResp = ipAddressManagementPrefixDelegationDeletePrefixDelegationWithHttpInfo(delegationId, prefixId, accountId);
        return localVarResp.getData();
    }

    /**
     * Delete Prefix Delegation
     * Delete an account delegation for a given IP prefix.
     * @param delegationId  (required)
     * @param prefixId  (required)
     * @param accountId  (required)
     * @return ApiResponse&lt;AddressingIdResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete Prefix Delegation response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete Prefix Delegation response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AddressingIdResponse> ipAddressManagementPrefixDelegationDeletePrefixDelegationWithHttpInfo(String delegationId, String prefixId, String accountId) throws ApiException {
        okhttp3.Call localVarCall = ipAddressManagementPrefixDelegationDeletePrefixDelegationValidateBeforeCall(delegationId, prefixId, accountId, null);
        Type localVarReturnType = new TypeToken<AddressingIdResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete Prefix Delegation (asynchronously)
     * Delete an account delegation for a given IP prefix.
     * @param delegationId  (required)
     * @param prefixId  (required)
     * @param accountId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete Prefix Delegation response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete Prefix Delegation response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ipAddressManagementPrefixDelegationDeletePrefixDelegationAsync(String delegationId, String prefixId, String accountId, final ApiCallback<AddressingIdResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = ipAddressManagementPrefixDelegationDeletePrefixDelegationValidateBeforeCall(delegationId, prefixId, accountId, _callback);
        Type localVarReturnType = new TypeToken<AddressingIdResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for ipAddressManagementPrefixDelegationListPrefixDelegations
     * @param prefixId  (required)
     * @param accountId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Prefix Delegations response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Prefix Delegations response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ipAddressManagementPrefixDelegationListPrefixDelegationsCall(String prefixId, String accountId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/addressing/prefixes/{prefix_id}/delegations"
            .replace("{" + "prefix_id" + "}", localVarApiClient.escapeString(prefixId.toString()))
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
    private okhttp3.Call ipAddressManagementPrefixDelegationListPrefixDelegationsValidateBeforeCall(String prefixId, String accountId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'prefixId' is set
        if (prefixId == null) {
            throw new ApiException("Missing the required parameter 'prefixId' when calling ipAddressManagementPrefixDelegationListPrefixDelegations(Async)");
        }

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling ipAddressManagementPrefixDelegationListPrefixDelegations(Async)");
        }

        return ipAddressManagementPrefixDelegationListPrefixDelegationsCall(prefixId, accountId, _callback);

    }

    /**
     * List Prefix Delegations
     * List all delegations for a given account IP prefix.
     * @param prefixId  (required)
     * @param accountId  (required)
     * @return AddressingSchemasResponseCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Prefix Delegations response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Prefix Delegations response failure </td><td>  -  </td></tr>
     </table>
     */
    public AddressingSchemasResponseCollection ipAddressManagementPrefixDelegationListPrefixDelegations(String prefixId, String accountId) throws ApiException {
        ApiResponse<AddressingSchemasResponseCollection> localVarResp = ipAddressManagementPrefixDelegationListPrefixDelegationsWithHttpInfo(prefixId, accountId);
        return localVarResp.getData();
    }

    /**
     * List Prefix Delegations
     * List all delegations for a given account IP prefix.
     * @param prefixId  (required)
     * @param accountId  (required)
     * @return ApiResponse&lt;AddressingSchemasResponseCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Prefix Delegations response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Prefix Delegations response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AddressingSchemasResponseCollection> ipAddressManagementPrefixDelegationListPrefixDelegationsWithHttpInfo(String prefixId, String accountId) throws ApiException {
        okhttp3.Call localVarCall = ipAddressManagementPrefixDelegationListPrefixDelegationsValidateBeforeCall(prefixId, accountId, null);
        Type localVarReturnType = new TypeToken<AddressingSchemasResponseCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Prefix Delegations (asynchronously)
     * List all delegations for a given account IP prefix.
     * @param prefixId  (required)
     * @param accountId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Prefix Delegations response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Prefix Delegations response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ipAddressManagementPrefixDelegationListPrefixDelegationsAsync(String prefixId, String accountId, final ApiCallback<AddressingSchemasResponseCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = ipAddressManagementPrefixDelegationListPrefixDelegationsValidateBeforeCall(prefixId, accountId, _callback);
        Type localVarReturnType = new TypeToken<AddressingSchemasResponseCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}