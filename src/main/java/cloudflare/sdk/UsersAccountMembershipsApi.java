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


import java.math.BigDecimal;
import cloudflare.sdk.models.IamCollectionMembershipResponse;
import cloudflare.sdk.models.IamSingleMembershipResponse;
import cloudflare.sdk.models.UserSAccountMembershipsDeleteMembership200Response;
import cloudflare.sdk.models.UserSAccountMembershipsDeleteMembership4XXResponse;
import cloudflare.sdk.models.UserSAccountMembershipsListMemberships4XXResponse;
import cloudflare.sdk.models.UserSAccountMembershipsMembershipDetails4XXResponse;
import cloudflare.sdk.models.UserSAccountMembershipsUpdateMembershipRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsersAccountMembershipsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public UsersAccountMembershipsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UsersAccountMembershipsApi(ApiClient apiClient) {
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
     * Build call for userSAccountMembershipsDeleteMembership
     * @param membershipId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete Membership response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete Membership response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call userSAccountMembershipsDeleteMembershipCall(String membershipId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/memberships/{membership_id}"
            .replace("{" + "membership_id" + "}", localVarApiClient.escapeString(membershipId.toString()));

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
    private okhttp3.Call userSAccountMembershipsDeleteMembershipValidateBeforeCall(String membershipId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'membershipId' is set
        if (membershipId == null) {
            throw new ApiException("Missing the required parameter 'membershipId' when calling userSAccountMembershipsDeleteMembership(Async)");
        }

        return userSAccountMembershipsDeleteMembershipCall(membershipId, _callback);

    }

    /**
     * Delete Membership
     * Remove the associated member from an account.
     * @param membershipId  (required)
     * @return UserSAccountMembershipsDeleteMembership200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete Membership response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete Membership response failure </td><td>  -  </td></tr>
     </table>
     */
    public UserSAccountMembershipsDeleteMembership200Response userSAccountMembershipsDeleteMembership(String membershipId) throws ApiException {
        ApiResponse<UserSAccountMembershipsDeleteMembership200Response> localVarResp = userSAccountMembershipsDeleteMembershipWithHttpInfo(membershipId);
        return localVarResp.getData();
    }

    /**
     * Delete Membership
     * Remove the associated member from an account.
     * @param membershipId  (required)
     * @return ApiResponse&lt;UserSAccountMembershipsDeleteMembership200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete Membership response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete Membership response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<UserSAccountMembershipsDeleteMembership200Response> userSAccountMembershipsDeleteMembershipWithHttpInfo(String membershipId) throws ApiException {
        okhttp3.Call localVarCall = userSAccountMembershipsDeleteMembershipValidateBeforeCall(membershipId, null);
        Type localVarReturnType = new TypeToken<UserSAccountMembershipsDeleteMembership200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete Membership (asynchronously)
     * Remove the associated member from an account.
     * @param membershipId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete Membership response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete Membership response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call userSAccountMembershipsDeleteMembershipAsync(String membershipId, final ApiCallback<UserSAccountMembershipsDeleteMembership200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = userSAccountMembershipsDeleteMembershipValidateBeforeCall(membershipId, _callback);
        Type localVarReturnType = new TypeToken<UserSAccountMembershipsDeleteMembership200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for userSAccountMembershipsListMemberships
     * @param accountName  (optional)
     * @param page  (optional, default to 1)
     * @param perPage  (optional, default to 20)
     * @param order  (optional)
     * @param direction  (optional)
     * @param name  (optional)
     * @param status  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Memberships response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Memberships response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call userSAccountMembershipsListMembershipsCall(String accountName, BigDecimal page, BigDecimal perPage, String order, String direction, String name, String status, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/memberships";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (accountName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account.name", accountName));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (perPage != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("per_page", perPage));
        }

        if (order != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order", order));
        }

        if (direction != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("direction", direction));
        }

        if (name != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("name", name));
        }

        if (status != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("status", status));
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
    private okhttp3.Call userSAccountMembershipsListMembershipsValidateBeforeCall(String accountName, BigDecimal page, BigDecimal perPage, String order, String direction, String name, String status, final ApiCallback _callback) throws ApiException {
        return userSAccountMembershipsListMembershipsCall(accountName, page, perPage, order, direction, name, status, _callback);

    }

    /**
     * List Memberships
     * List memberships of accounts the user can access.
     * @param accountName  (optional)
     * @param page  (optional, default to 1)
     * @param perPage  (optional, default to 20)
     * @param order  (optional)
     * @param direction  (optional)
     * @param name  (optional)
     * @param status  (optional)
     * @return IamCollectionMembershipResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Memberships response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Memberships response failure </td><td>  -  </td></tr>
     </table>
     */
    public IamCollectionMembershipResponse userSAccountMembershipsListMemberships(String accountName, BigDecimal page, BigDecimal perPage, String order, String direction, String name, String status) throws ApiException {
        ApiResponse<IamCollectionMembershipResponse> localVarResp = userSAccountMembershipsListMembershipsWithHttpInfo(accountName, page, perPage, order, direction, name, status);
        return localVarResp.getData();
    }

    /**
     * List Memberships
     * List memberships of accounts the user can access.
     * @param accountName  (optional)
     * @param page  (optional, default to 1)
     * @param perPage  (optional, default to 20)
     * @param order  (optional)
     * @param direction  (optional)
     * @param name  (optional)
     * @param status  (optional)
     * @return ApiResponse&lt;IamCollectionMembershipResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Memberships response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Memberships response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<IamCollectionMembershipResponse> userSAccountMembershipsListMembershipsWithHttpInfo(String accountName, BigDecimal page, BigDecimal perPage, String order, String direction, String name, String status) throws ApiException {
        okhttp3.Call localVarCall = userSAccountMembershipsListMembershipsValidateBeforeCall(accountName, page, perPage, order, direction, name, status, null);
        Type localVarReturnType = new TypeToken<IamCollectionMembershipResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Memberships (asynchronously)
     * List memberships of accounts the user can access.
     * @param accountName  (optional)
     * @param page  (optional, default to 1)
     * @param perPage  (optional, default to 20)
     * @param order  (optional)
     * @param direction  (optional)
     * @param name  (optional)
     * @param status  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Memberships response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Memberships response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call userSAccountMembershipsListMembershipsAsync(String accountName, BigDecimal page, BigDecimal perPage, String order, String direction, String name, String status, final ApiCallback<IamCollectionMembershipResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = userSAccountMembershipsListMembershipsValidateBeforeCall(accountName, page, perPage, order, direction, name, status, _callback);
        Type localVarReturnType = new TypeToken<IamCollectionMembershipResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for userSAccountMembershipsMembershipDetails
     * @param membershipId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Membership Details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Membership Details response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call userSAccountMembershipsMembershipDetailsCall(String membershipId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/memberships/{membership_id}"
            .replace("{" + "membership_id" + "}", localVarApiClient.escapeString(membershipId.toString()));

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
    private okhttp3.Call userSAccountMembershipsMembershipDetailsValidateBeforeCall(String membershipId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'membershipId' is set
        if (membershipId == null) {
            throw new ApiException("Missing the required parameter 'membershipId' when calling userSAccountMembershipsMembershipDetails(Async)");
        }

        return userSAccountMembershipsMembershipDetailsCall(membershipId, _callback);

    }

    /**
     * Membership Details
     * Get a specific membership.
     * @param membershipId  (required)
     * @return IamSingleMembershipResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Membership Details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Membership Details response failure </td><td>  -  </td></tr>
     </table>
     */
    public IamSingleMembershipResponse userSAccountMembershipsMembershipDetails(String membershipId) throws ApiException {
        ApiResponse<IamSingleMembershipResponse> localVarResp = userSAccountMembershipsMembershipDetailsWithHttpInfo(membershipId);
        return localVarResp.getData();
    }

    /**
     * Membership Details
     * Get a specific membership.
     * @param membershipId  (required)
     * @return ApiResponse&lt;IamSingleMembershipResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Membership Details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Membership Details response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<IamSingleMembershipResponse> userSAccountMembershipsMembershipDetailsWithHttpInfo(String membershipId) throws ApiException {
        okhttp3.Call localVarCall = userSAccountMembershipsMembershipDetailsValidateBeforeCall(membershipId, null);
        Type localVarReturnType = new TypeToken<IamSingleMembershipResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Membership Details (asynchronously)
     * Get a specific membership.
     * @param membershipId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Membership Details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Membership Details response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call userSAccountMembershipsMembershipDetailsAsync(String membershipId, final ApiCallback<IamSingleMembershipResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = userSAccountMembershipsMembershipDetailsValidateBeforeCall(membershipId, _callback);
        Type localVarReturnType = new TypeToken<IamSingleMembershipResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for userSAccountMembershipsUpdateMembership
     * @param membershipId  (required)
     * @param userSAccountMembershipsUpdateMembershipRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Membership response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Membership response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call userSAccountMembershipsUpdateMembershipCall(String membershipId, UserSAccountMembershipsUpdateMembershipRequest userSAccountMembershipsUpdateMembershipRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = userSAccountMembershipsUpdateMembershipRequest;

        // create path and map variables
        String localVarPath = "/memberships/{membership_id}"
            .replace("{" + "membership_id" + "}", localVarApiClient.escapeString(membershipId.toString()));

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
    private okhttp3.Call userSAccountMembershipsUpdateMembershipValidateBeforeCall(String membershipId, UserSAccountMembershipsUpdateMembershipRequest userSAccountMembershipsUpdateMembershipRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'membershipId' is set
        if (membershipId == null) {
            throw new ApiException("Missing the required parameter 'membershipId' when calling userSAccountMembershipsUpdateMembership(Async)");
        }

        // verify the required parameter 'userSAccountMembershipsUpdateMembershipRequest' is set
        if (userSAccountMembershipsUpdateMembershipRequest == null) {
            throw new ApiException("Missing the required parameter 'userSAccountMembershipsUpdateMembershipRequest' when calling userSAccountMembershipsUpdateMembership(Async)");
        }

        return userSAccountMembershipsUpdateMembershipCall(membershipId, userSAccountMembershipsUpdateMembershipRequest, _callback);

    }

    /**
     * Update Membership
     * Accept or reject this account invitation.
     * @param membershipId  (required)
     * @param userSAccountMembershipsUpdateMembershipRequest  (required)
     * @return IamSingleMembershipResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Membership response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Membership response failure </td><td>  -  </td></tr>
     </table>
     */
    public IamSingleMembershipResponse userSAccountMembershipsUpdateMembership(String membershipId, UserSAccountMembershipsUpdateMembershipRequest userSAccountMembershipsUpdateMembershipRequest) throws ApiException {
        ApiResponse<IamSingleMembershipResponse> localVarResp = userSAccountMembershipsUpdateMembershipWithHttpInfo(membershipId, userSAccountMembershipsUpdateMembershipRequest);
        return localVarResp.getData();
    }

    /**
     * Update Membership
     * Accept or reject this account invitation.
     * @param membershipId  (required)
     * @param userSAccountMembershipsUpdateMembershipRequest  (required)
     * @return ApiResponse&lt;IamSingleMembershipResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Membership response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Membership response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<IamSingleMembershipResponse> userSAccountMembershipsUpdateMembershipWithHttpInfo(String membershipId, UserSAccountMembershipsUpdateMembershipRequest userSAccountMembershipsUpdateMembershipRequest) throws ApiException {
        okhttp3.Call localVarCall = userSAccountMembershipsUpdateMembershipValidateBeforeCall(membershipId, userSAccountMembershipsUpdateMembershipRequest, null);
        Type localVarReturnType = new TypeToken<IamSingleMembershipResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Membership (asynchronously)
     * Accept or reject this account invitation.
     * @param membershipId  (required)
     * @param userSAccountMembershipsUpdateMembershipRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Membership response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Membership response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call userSAccountMembershipsUpdateMembershipAsync(String membershipId, UserSAccountMembershipsUpdateMembershipRequest userSAccountMembershipsUpdateMembershipRequest, final ApiCallback<IamSingleMembershipResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = userSAccountMembershipsUpdateMembershipValidateBeforeCall(membershipId, userSAccountMembershipsUpdateMembershipRequest, _callback);
        Type localVarReturnType = new TypeToken<IamSingleMembershipResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
