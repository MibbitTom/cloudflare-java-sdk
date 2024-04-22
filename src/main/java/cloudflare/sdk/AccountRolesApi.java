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


import cloudflare.sdk.models.AccountsAccountDetails4XXResponse;
import cloudflare.sdk.models.AccountsListAccounts4XXResponse;
import cloudflare.sdk.models.IamCollectionRoleResponse;
import cloudflare.sdk.models.IamSingleRoleResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountRolesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AccountRolesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AccountRolesApi(ApiClient apiClient) {
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
     * Build call for accountRolesListRoles
     * @param accountId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Roles response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Roles response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call accountRolesListRolesCall(Object accountId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/roles"
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
    private okhttp3.Call accountRolesListRolesValidateBeforeCall(Object accountId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling accountRolesListRoles(Async)");
        }

        return accountRolesListRolesCall(accountId, _callback);

    }

    /**
     * List Roles
     * Get all available roles for an account.
     * @param accountId  (required)
     * @return IamCollectionRoleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Roles response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Roles response failure </td><td>  -  </td></tr>
     </table>
     */
    public IamCollectionRoleResponse accountRolesListRoles(Object accountId) throws ApiException {
        ApiResponse<IamCollectionRoleResponse> localVarResp = accountRolesListRolesWithHttpInfo(accountId);
        return localVarResp.getData();
    }

    /**
     * List Roles
     * Get all available roles for an account.
     * @param accountId  (required)
     * @return ApiResponse&lt;IamCollectionRoleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Roles response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Roles response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<IamCollectionRoleResponse> accountRolesListRolesWithHttpInfo(Object accountId) throws ApiException {
        okhttp3.Call localVarCall = accountRolesListRolesValidateBeforeCall(accountId, null);
        Type localVarReturnType = new TypeToken<IamCollectionRoleResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Roles (asynchronously)
     * Get all available roles for an account.
     * @param accountId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Roles response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Roles response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call accountRolesListRolesAsync(Object accountId, final ApiCallback<IamCollectionRoleResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = accountRolesListRolesValidateBeforeCall(accountId, _callback);
        Type localVarReturnType = new TypeToken<IamCollectionRoleResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for accountRolesRoleDetails
     * @param roleId  (required)
     * @param accountId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Role Details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Role Details response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call accountRolesRoleDetailsCall(Object roleId, Object accountId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/roles/{role_id}"
            .replace("{" + "role_id" + "}", localVarApiClient.escapeString(roleId.toString()))
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
    private okhttp3.Call accountRolesRoleDetailsValidateBeforeCall(Object roleId, Object accountId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'roleId' is set
        if (roleId == null) {
            throw new ApiException("Missing the required parameter 'roleId' when calling accountRolesRoleDetails(Async)");
        }

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling accountRolesRoleDetails(Async)");
        }

        return accountRolesRoleDetailsCall(roleId, accountId, _callback);

    }

    /**
     * Role Details
     * Get information about a specific role for an account.
     * @param roleId  (required)
     * @param accountId  (required)
     * @return IamSingleRoleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Role Details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Role Details response failure </td><td>  -  </td></tr>
     </table>
     */
    public IamSingleRoleResponse accountRolesRoleDetails(Object roleId, Object accountId) throws ApiException {
        ApiResponse<IamSingleRoleResponse> localVarResp = accountRolesRoleDetailsWithHttpInfo(roleId, accountId);
        return localVarResp.getData();
    }

    /**
     * Role Details
     * Get information about a specific role for an account.
     * @param roleId  (required)
     * @param accountId  (required)
     * @return ApiResponse&lt;IamSingleRoleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Role Details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Role Details response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<IamSingleRoleResponse> accountRolesRoleDetailsWithHttpInfo(Object roleId, Object accountId) throws ApiException {
        okhttp3.Call localVarCall = accountRolesRoleDetailsValidateBeforeCall(roleId, accountId, null);
        Type localVarReturnType = new TypeToken<IamSingleRoleResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Role Details (asynchronously)
     * Get information about a specific role for an account.
     * @param roleId  (required)
     * @param accountId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Role Details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Role Details response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call accountRolesRoleDetailsAsync(Object roleId, Object accountId, final ApiCallback<IamSingleRoleResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = accountRolesRoleDetailsValidateBeforeCall(roleId, accountId, _callback);
        Type localVarReturnType = new TypeToken<IamSingleRoleResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
