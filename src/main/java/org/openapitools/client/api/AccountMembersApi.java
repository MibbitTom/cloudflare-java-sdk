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


import org.openapitools.client.model.AccountMembersRemoveMember4XXResponse;
import org.openapitools.client.model.AccountsAccountDetails4XXResponse;
import org.openapitools.client.model.AccountsListAccounts4XXResponse;
import java.math.BigDecimal;
import org.openapitools.client.model.IamApiResponseSingleId;
import org.openapitools.client.model.IamCollectionMemberResponse;
import org.openapitools.client.model.IamCreate;
import org.openapitools.client.model.IamSchemasMember;
import org.openapitools.client.model.IamSingleMemberResponse;
import org.openapitools.client.model.IamSingleMemberResponseWithCode;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountMembersApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AccountMembersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AccountMembersApi(ApiClient apiClient) {
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
     * Build call for accountMembersAddMember
     * @param accountId  (required)
     * @param iamCreate  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Add Member response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Add Member response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call accountMembersAddMemberCall(Object accountId, IamCreate iamCreate, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = iamCreate;

        // create path and map variables
        String localVarPath = "/accounts/{account_id}/members"
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
    private okhttp3.Call accountMembersAddMemberValidateBeforeCall(Object accountId, IamCreate iamCreate, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling accountMembersAddMember(Async)");
        }

        // verify the required parameter 'iamCreate' is set
        if (iamCreate == null) {
            throw new ApiException("Missing the required parameter 'iamCreate' when calling accountMembersAddMember(Async)");
        }

        return accountMembersAddMemberCall(accountId, iamCreate, _callback);

    }

    /**
     * Add Member
     * Add a user to the list of members for this account.
     * @param accountId  (required)
     * @param iamCreate  (required)
     * @return IamSingleMemberResponseWithCode
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Add Member response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Add Member response failure </td><td>  -  </td></tr>
     </table>
     */
    public IamSingleMemberResponseWithCode accountMembersAddMember(Object accountId, IamCreate iamCreate) throws ApiException {
        ApiResponse<IamSingleMemberResponseWithCode> localVarResp = accountMembersAddMemberWithHttpInfo(accountId, iamCreate);
        return localVarResp.getData();
    }

    /**
     * Add Member
     * Add a user to the list of members for this account.
     * @param accountId  (required)
     * @param iamCreate  (required)
     * @return ApiResponse&lt;IamSingleMemberResponseWithCode&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Add Member response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Add Member response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<IamSingleMemberResponseWithCode> accountMembersAddMemberWithHttpInfo(Object accountId, IamCreate iamCreate) throws ApiException {
        okhttp3.Call localVarCall = accountMembersAddMemberValidateBeforeCall(accountId, iamCreate, null);
        Type localVarReturnType = new TypeToken<IamSingleMemberResponseWithCode>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add Member (asynchronously)
     * Add a user to the list of members for this account.
     * @param accountId  (required)
     * @param iamCreate  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Add Member response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Add Member response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call accountMembersAddMemberAsync(Object accountId, IamCreate iamCreate, final ApiCallback<IamSingleMemberResponseWithCode> _callback) throws ApiException {

        okhttp3.Call localVarCall = accountMembersAddMemberValidateBeforeCall(accountId, iamCreate, _callback);
        Type localVarReturnType = new TypeToken<IamSingleMemberResponseWithCode>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for accountMembersListMembers
     * @param accountId  (required)
     * @param order  (optional)
     * @param status  (optional)
     * @param page  (optional, default to 1)
     * @param perPage  (optional, default to 20)
     * @param direction  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Members response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Members response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call accountMembersListMembersCall(Object accountId, String order, String status, BigDecimal page, BigDecimal perPage, String direction, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/members"
            .replace("{" + "account_id" + "}", localVarApiClient.escapeString(accountId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (order != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order", order));
        }

        if (status != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("status", status));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (perPage != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("per_page", perPage));
        }

        if (direction != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("direction", direction));
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
    private okhttp3.Call accountMembersListMembersValidateBeforeCall(Object accountId, String order, String status, BigDecimal page, BigDecimal perPage, String direction, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling accountMembersListMembers(Async)");
        }

        return accountMembersListMembersCall(accountId, order, status, page, perPage, direction, _callback);

    }

    /**
     * List Members
     * List all members of an account.
     * @param accountId  (required)
     * @param order  (optional)
     * @param status  (optional)
     * @param page  (optional, default to 1)
     * @param perPage  (optional, default to 20)
     * @param direction  (optional)
     * @return IamCollectionMemberResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Members response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Members response failure </td><td>  -  </td></tr>
     </table>
     */
    public IamCollectionMemberResponse accountMembersListMembers(Object accountId, String order, String status, BigDecimal page, BigDecimal perPage, String direction) throws ApiException {
        ApiResponse<IamCollectionMemberResponse> localVarResp = accountMembersListMembersWithHttpInfo(accountId, order, status, page, perPage, direction);
        return localVarResp.getData();
    }

    /**
     * List Members
     * List all members of an account.
     * @param accountId  (required)
     * @param order  (optional)
     * @param status  (optional)
     * @param page  (optional, default to 1)
     * @param perPage  (optional, default to 20)
     * @param direction  (optional)
     * @return ApiResponse&lt;IamCollectionMemberResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Members response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Members response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<IamCollectionMemberResponse> accountMembersListMembersWithHttpInfo(Object accountId, String order, String status, BigDecimal page, BigDecimal perPage, String direction) throws ApiException {
        okhttp3.Call localVarCall = accountMembersListMembersValidateBeforeCall(accountId, order, status, page, perPage, direction, null);
        Type localVarReturnType = new TypeToken<IamCollectionMemberResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Members (asynchronously)
     * List all members of an account.
     * @param accountId  (required)
     * @param order  (optional)
     * @param status  (optional)
     * @param page  (optional, default to 1)
     * @param perPage  (optional, default to 20)
     * @param direction  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Members response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Members response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call accountMembersListMembersAsync(Object accountId, String order, String status, BigDecimal page, BigDecimal perPage, String direction, final ApiCallback<IamCollectionMemberResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = accountMembersListMembersValidateBeforeCall(accountId, order, status, page, perPage, direction, _callback);
        Type localVarReturnType = new TypeToken<IamCollectionMemberResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for accountMembersMemberDetails
     * @param memberId  (required)
     * @param accountId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Member Details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Member Details response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call accountMembersMemberDetailsCall(String memberId, Object accountId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/members/{member_id}"
            .replace("{" + "member_id" + "}", localVarApiClient.escapeString(memberId.toString()))
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
    private okhttp3.Call accountMembersMemberDetailsValidateBeforeCall(String memberId, Object accountId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'memberId' is set
        if (memberId == null) {
            throw new ApiException("Missing the required parameter 'memberId' when calling accountMembersMemberDetails(Async)");
        }

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling accountMembersMemberDetails(Async)");
        }

        return accountMembersMemberDetailsCall(memberId, accountId, _callback);

    }

    /**
     * Member Details
     * Get information about a specific member of an account.
     * @param memberId  (required)
     * @param accountId  (required)
     * @return IamSingleMemberResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Member Details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Member Details response failure </td><td>  -  </td></tr>
     </table>
     */
    public IamSingleMemberResponse accountMembersMemberDetails(String memberId, Object accountId) throws ApiException {
        ApiResponse<IamSingleMemberResponse> localVarResp = accountMembersMemberDetailsWithHttpInfo(memberId, accountId);
        return localVarResp.getData();
    }

    /**
     * Member Details
     * Get information about a specific member of an account.
     * @param memberId  (required)
     * @param accountId  (required)
     * @return ApiResponse&lt;IamSingleMemberResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Member Details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Member Details response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<IamSingleMemberResponse> accountMembersMemberDetailsWithHttpInfo(String memberId, Object accountId) throws ApiException {
        okhttp3.Call localVarCall = accountMembersMemberDetailsValidateBeforeCall(memberId, accountId, null);
        Type localVarReturnType = new TypeToken<IamSingleMemberResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Member Details (asynchronously)
     * Get information about a specific member of an account.
     * @param memberId  (required)
     * @param accountId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Member Details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Member Details response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call accountMembersMemberDetailsAsync(String memberId, Object accountId, final ApiCallback<IamSingleMemberResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = accountMembersMemberDetailsValidateBeforeCall(memberId, accountId, _callback);
        Type localVarReturnType = new TypeToken<IamSingleMemberResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for accountMembersRemoveMember
     * @param memberId  (required)
     * @param accountId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Remove Member response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Remove Member response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call accountMembersRemoveMemberCall(String memberId, Object accountId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/members/{member_id}"
            .replace("{" + "member_id" + "}", localVarApiClient.escapeString(memberId.toString()))
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
    private okhttp3.Call accountMembersRemoveMemberValidateBeforeCall(String memberId, Object accountId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'memberId' is set
        if (memberId == null) {
            throw new ApiException("Missing the required parameter 'memberId' when calling accountMembersRemoveMember(Async)");
        }

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling accountMembersRemoveMember(Async)");
        }

        return accountMembersRemoveMemberCall(memberId, accountId, _callback);

    }

    /**
     * Remove Member
     * Remove a member from an account.
     * @param memberId  (required)
     * @param accountId  (required)
     * @return IamApiResponseSingleId
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Remove Member response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Remove Member response failure </td><td>  -  </td></tr>
     </table>
     */
    public IamApiResponseSingleId accountMembersRemoveMember(String memberId, Object accountId) throws ApiException {
        ApiResponse<IamApiResponseSingleId> localVarResp = accountMembersRemoveMemberWithHttpInfo(memberId, accountId);
        return localVarResp.getData();
    }

    /**
     * Remove Member
     * Remove a member from an account.
     * @param memberId  (required)
     * @param accountId  (required)
     * @return ApiResponse&lt;IamApiResponseSingleId&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Remove Member response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Remove Member response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<IamApiResponseSingleId> accountMembersRemoveMemberWithHttpInfo(String memberId, Object accountId) throws ApiException {
        okhttp3.Call localVarCall = accountMembersRemoveMemberValidateBeforeCall(memberId, accountId, null);
        Type localVarReturnType = new TypeToken<IamApiResponseSingleId>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Remove Member (asynchronously)
     * Remove a member from an account.
     * @param memberId  (required)
     * @param accountId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Remove Member response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Remove Member response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call accountMembersRemoveMemberAsync(String memberId, Object accountId, final ApiCallback<IamApiResponseSingleId> _callback) throws ApiException {

        okhttp3.Call localVarCall = accountMembersRemoveMemberValidateBeforeCall(memberId, accountId, _callback);
        Type localVarReturnType = new TypeToken<IamApiResponseSingleId>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for accountMembersUpdateMember
     * @param memberId  (required)
     * @param accountId  (required)
     * @param iamSchemasMember  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Member response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Member response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call accountMembersUpdateMemberCall(String memberId, Object accountId, IamSchemasMember iamSchemasMember, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = iamSchemasMember;

        // create path and map variables
        String localVarPath = "/accounts/{account_id}/members/{member_id}"
            .replace("{" + "member_id" + "}", localVarApiClient.escapeString(memberId.toString()))
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
    private okhttp3.Call accountMembersUpdateMemberValidateBeforeCall(String memberId, Object accountId, IamSchemasMember iamSchemasMember, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'memberId' is set
        if (memberId == null) {
            throw new ApiException("Missing the required parameter 'memberId' when calling accountMembersUpdateMember(Async)");
        }

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling accountMembersUpdateMember(Async)");
        }

        // verify the required parameter 'iamSchemasMember' is set
        if (iamSchemasMember == null) {
            throw new ApiException("Missing the required parameter 'iamSchemasMember' when calling accountMembersUpdateMember(Async)");
        }

        return accountMembersUpdateMemberCall(memberId, accountId, iamSchemasMember, _callback);

    }

    /**
     * Update Member
     * Modify an account member.
     * @param memberId  (required)
     * @param accountId  (required)
     * @param iamSchemasMember  (required)
     * @return IamSingleMemberResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Member response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Member response failure </td><td>  -  </td></tr>
     </table>
     */
    public IamSingleMemberResponse accountMembersUpdateMember(String memberId, Object accountId, IamSchemasMember iamSchemasMember) throws ApiException {
        ApiResponse<IamSingleMemberResponse> localVarResp = accountMembersUpdateMemberWithHttpInfo(memberId, accountId, iamSchemasMember);
        return localVarResp.getData();
    }

    /**
     * Update Member
     * Modify an account member.
     * @param memberId  (required)
     * @param accountId  (required)
     * @param iamSchemasMember  (required)
     * @return ApiResponse&lt;IamSingleMemberResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Member response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Member response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<IamSingleMemberResponse> accountMembersUpdateMemberWithHttpInfo(String memberId, Object accountId, IamSchemasMember iamSchemasMember) throws ApiException {
        okhttp3.Call localVarCall = accountMembersUpdateMemberValidateBeforeCall(memberId, accountId, iamSchemasMember, null);
        Type localVarReturnType = new TypeToken<IamSingleMemberResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Member (asynchronously)
     * Modify an account member.
     * @param memberId  (required)
     * @param accountId  (required)
     * @param iamSchemasMember  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Member response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Member response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call accountMembersUpdateMemberAsync(String memberId, Object accountId, IamSchemasMember iamSchemasMember, final ApiCallback<IamSingleMemberResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = accountMembersUpdateMemberValidateBeforeCall(memberId, accountId, iamSchemasMember, _callback);
        Type localVarReturnType = new TypeToken<IamSingleMemberResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
