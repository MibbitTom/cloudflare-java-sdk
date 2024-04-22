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


import org.openapitools.client.model.AccessApiResponseCommonFailure;
import org.openapitools.client.model.AccessEmptyResponse;
import org.openapitools.client.model.AccessSingleResponse;
import org.openapitools.client.model.ZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest;
import org.openapitools.client.model.ZeroTrustOrganizationRevokeAllAccessTokensForAUserRequest;
import org.openapitools.client.model.ZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZeroTrustOrganizationApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ZeroTrustOrganizationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ZeroTrustOrganizationApi(ApiClient apiClient) {
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
     * Build call for zeroTrustOrganizationCreateYourZeroTrustOrganization
     * @param identifier  (required)
     * @param zeroTrustOrganizationCreateYourZeroTrustOrganizationRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Create your Zero Trust organization response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create your Zero Trust organization response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call zeroTrustOrganizationCreateYourZeroTrustOrganizationCall(String identifier, ZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest zeroTrustOrganizationCreateYourZeroTrustOrganizationRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = zeroTrustOrganizationCreateYourZeroTrustOrganizationRequest;

        // create path and map variables
        String localVarPath = "/accounts/{identifier}/access/organizations"
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

        String[] localVarAuthNames = new String[] { "api_key", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call zeroTrustOrganizationCreateYourZeroTrustOrganizationValidateBeforeCall(String identifier, ZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest zeroTrustOrganizationCreateYourZeroTrustOrganizationRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling zeroTrustOrganizationCreateYourZeroTrustOrganization(Async)");
        }

        // verify the required parameter 'zeroTrustOrganizationCreateYourZeroTrustOrganizationRequest' is set
        if (zeroTrustOrganizationCreateYourZeroTrustOrganizationRequest == null) {
            throw new ApiException("Missing the required parameter 'zeroTrustOrganizationCreateYourZeroTrustOrganizationRequest' when calling zeroTrustOrganizationCreateYourZeroTrustOrganization(Async)");
        }

        return zeroTrustOrganizationCreateYourZeroTrustOrganizationCall(identifier, zeroTrustOrganizationCreateYourZeroTrustOrganizationRequest, _callback);

    }

    /**
     * Create your Zero Trust organization
     * Sets up a Zero Trust organization for your account.
     * @param identifier  (required)
     * @param zeroTrustOrganizationCreateYourZeroTrustOrganizationRequest  (required)
     * @return AccessSingleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Create your Zero Trust organization response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create your Zero Trust organization response failure </td><td>  -  </td></tr>
     </table>
     */
    public AccessSingleResponse zeroTrustOrganizationCreateYourZeroTrustOrganization(String identifier, ZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest zeroTrustOrganizationCreateYourZeroTrustOrganizationRequest) throws ApiException {
        ApiResponse<AccessSingleResponse> localVarResp = zeroTrustOrganizationCreateYourZeroTrustOrganizationWithHttpInfo(identifier, zeroTrustOrganizationCreateYourZeroTrustOrganizationRequest);
        return localVarResp.getData();
    }

    /**
     * Create your Zero Trust organization
     * Sets up a Zero Trust organization for your account.
     * @param identifier  (required)
     * @param zeroTrustOrganizationCreateYourZeroTrustOrganizationRequest  (required)
     * @return ApiResponse&lt;AccessSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Create your Zero Trust organization response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create your Zero Trust organization response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AccessSingleResponse> zeroTrustOrganizationCreateYourZeroTrustOrganizationWithHttpInfo(String identifier, ZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest zeroTrustOrganizationCreateYourZeroTrustOrganizationRequest) throws ApiException {
        okhttp3.Call localVarCall = zeroTrustOrganizationCreateYourZeroTrustOrganizationValidateBeforeCall(identifier, zeroTrustOrganizationCreateYourZeroTrustOrganizationRequest, null);
        Type localVarReturnType = new TypeToken<AccessSingleResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create your Zero Trust organization (asynchronously)
     * Sets up a Zero Trust organization for your account.
     * @param identifier  (required)
     * @param zeroTrustOrganizationCreateYourZeroTrustOrganizationRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Create your Zero Trust organization response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create your Zero Trust organization response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call zeroTrustOrganizationCreateYourZeroTrustOrganizationAsync(String identifier, ZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest zeroTrustOrganizationCreateYourZeroTrustOrganizationRequest, final ApiCallback<AccessSingleResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = zeroTrustOrganizationCreateYourZeroTrustOrganizationValidateBeforeCall(identifier, zeroTrustOrganizationCreateYourZeroTrustOrganizationRequest, _callback);
        Type localVarReturnType = new TypeToken<AccessSingleResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for zeroTrustOrganizationGetYourZeroTrustOrganization
     * @param identifier  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get your Zero Trust organization response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get your Zero Trust organization response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call zeroTrustOrganizationGetYourZeroTrustOrganizationCall(String identifier, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{identifier}/access/organizations"
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

        String[] localVarAuthNames = new String[] { "api_key", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call zeroTrustOrganizationGetYourZeroTrustOrganizationValidateBeforeCall(String identifier, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling zeroTrustOrganizationGetYourZeroTrustOrganization(Async)");
        }

        return zeroTrustOrganizationGetYourZeroTrustOrganizationCall(identifier, _callback);

    }

    /**
     * Get your Zero Trust organization
     * Returns the configuration for your Zero Trust organization.
     * @param identifier  (required)
     * @return AccessSingleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get your Zero Trust organization response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get your Zero Trust organization response failure </td><td>  -  </td></tr>
     </table>
     */
    public AccessSingleResponse zeroTrustOrganizationGetYourZeroTrustOrganization(String identifier) throws ApiException {
        ApiResponse<AccessSingleResponse> localVarResp = zeroTrustOrganizationGetYourZeroTrustOrganizationWithHttpInfo(identifier);
        return localVarResp.getData();
    }

    /**
     * Get your Zero Trust organization
     * Returns the configuration for your Zero Trust organization.
     * @param identifier  (required)
     * @return ApiResponse&lt;AccessSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get your Zero Trust organization response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get your Zero Trust organization response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AccessSingleResponse> zeroTrustOrganizationGetYourZeroTrustOrganizationWithHttpInfo(String identifier) throws ApiException {
        okhttp3.Call localVarCall = zeroTrustOrganizationGetYourZeroTrustOrganizationValidateBeforeCall(identifier, null);
        Type localVarReturnType = new TypeToken<AccessSingleResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get your Zero Trust organization (asynchronously)
     * Returns the configuration for your Zero Trust organization.
     * @param identifier  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get your Zero Trust organization response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get your Zero Trust organization response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call zeroTrustOrganizationGetYourZeroTrustOrganizationAsync(String identifier, final ApiCallback<AccessSingleResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = zeroTrustOrganizationGetYourZeroTrustOrganizationValidateBeforeCall(identifier, _callback);
        Type localVarReturnType = new TypeToken<AccessSingleResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for zeroTrustOrganizationRevokeAllAccessTokensForAUser
     * @param identifier  (required)
     * @param zeroTrustOrganizationRevokeAllAccessTokensForAUserRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Revoke all Access tokens for a user response </td><td>  -  </td></tr>
        <tr><td> 4xx </td><td> Revoke all Access tokens for a user response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call zeroTrustOrganizationRevokeAllAccessTokensForAUserCall(String identifier, ZeroTrustOrganizationRevokeAllAccessTokensForAUserRequest zeroTrustOrganizationRevokeAllAccessTokensForAUserRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = zeroTrustOrganizationRevokeAllAccessTokensForAUserRequest;

        // create path and map variables
        String localVarPath = "/accounts/{identifier}/access/organizations/revoke_user"
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

        String[] localVarAuthNames = new String[] { "api_key", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call zeroTrustOrganizationRevokeAllAccessTokensForAUserValidateBeforeCall(String identifier, ZeroTrustOrganizationRevokeAllAccessTokensForAUserRequest zeroTrustOrganizationRevokeAllAccessTokensForAUserRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling zeroTrustOrganizationRevokeAllAccessTokensForAUser(Async)");
        }

        // verify the required parameter 'zeroTrustOrganizationRevokeAllAccessTokensForAUserRequest' is set
        if (zeroTrustOrganizationRevokeAllAccessTokensForAUserRequest == null) {
            throw new ApiException("Missing the required parameter 'zeroTrustOrganizationRevokeAllAccessTokensForAUserRequest' when calling zeroTrustOrganizationRevokeAllAccessTokensForAUser(Async)");
        }

        return zeroTrustOrganizationRevokeAllAccessTokensForAUserCall(identifier, zeroTrustOrganizationRevokeAllAccessTokensForAUserRequest, _callback);

    }

    /**
     * Revoke all Access tokens for a user
     * Revokes a user&#39;s access across all applications.
     * @param identifier  (required)
     * @param zeroTrustOrganizationRevokeAllAccessTokensForAUserRequest  (required)
     * @return AccessEmptyResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Revoke all Access tokens for a user response </td><td>  -  </td></tr>
        <tr><td> 4xx </td><td> Revoke all Access tokens for a user response failure </td><td>  -  </td></tr>
     </table>
     */
    public AccessEmptyResponse zeroTrustOrganizationRevokeAllAccessTokensForAUser(String identifier, ZeroTrustOrganizationRevokeAllAccessTokensForAUserRequest zeroTrustOrganizationRevokeAllAccessTokensForAUserRequest) throws ApiException {
        ApiResponse<AccessEmptyResponse> localVarResp = zeroTrustOrganizationRevokeAllAccessTokensForAUserWithHttpInfo(identifier, zeroTrustOrganizationRevokeAllAccessTokensForAUserRequest);
        return localVarResp.getData();
    }

    /**
     * Revoke all Access tokens for a user
     * Revokes a user&#39;s access across all applications.
     * @param identifier  (required)
     * @param zeroTrustOrganizationRevokeAllAccessTokensForAUserRequest  (required)
     * @return ApiResponse&lt;AccessEmptyResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Revoke all Access tokens for a user response </td><td>  -  </td></tr>
        <tr><td> 4xx </td><td> Revoke all Access tokens for a user response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AccessEmptyResponse> zeroTrustOrganizationRevokeAllAccessTokensForAUserWithHttpInfo(String identifier, ZeroTrustOrganizationRevokeAllAccessTokensForAUserRequest zeroTrustOrganizationRevokeAllAccessTokensForAUserRequest) throws ApiException {
        okhttp3.Call localVarCall = zeroTrustOrganizationRevokeAllAccessTokensForAUserValidateBeforeCall(identifier, zeroTrustOrganizationRevokeAllAccessTokensForAUserRequest, null);
        Type localVarReturnType = new TypeToken<AccessEmptyResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Revoke all Access tokens for a user (asynchronously)
     * Revokes a user&#39;s access across all applications.
     * @param identifier  (required)
     * @param zeroTrustOrganizationRevokeAllAccessTokensForAUserRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Revoke all Access tokens for a user response </td><td>  -  </td></tr>
        <tr><td> 4xx </td><td> Revoke all Access tokens for a user response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call zeroTrustOrganizationRevokeAllAccessTokensForAUserAsync(String identifier, ZeroTrustOrganizationRevokeAllAccessTokensForAUserRequest zeroTrustOrganizationRevokeAllAccessTokensForAUserRequest, final ApiCallback<AccessEmptyResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = zeroTrustOrganizationRevokeAllAccessTokensForAUserValidateBeforeCall(identifier, zeroTrustOrganizationRevokeAllAccessTokensForAUserRequest, _callback);
        Type localVarReturnType = new TypeToken<AccessEmptyResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for zeroTrustOrganizationUpdateYourZeroTrustOrganization
     * @param identifier  (required)
     * @param zeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update your Zero Trust organization response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update your Zero Trust organization response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call zeroTrustOrganizationUpdateYourZeroTrustOrganizationCall(String identifier, ZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest zeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = zeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest;

        // create path and map variables
        String localVarPath = "/accounts/{identifier}/access/organizations"
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

        String[] localVarAuthNames = new String[] { "api_key", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call zeroTrustOrganizationUpdateYourZeroTrustOrganizationValidateBeforeCall(String identifier, ZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest zeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling zeroTrustOrganizationUpdateYourZeroTrustOrganization(Async)");
        }

        // verify the required parameter 'zeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest' is set
        if (zeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest == null) {
            throw new ApiException("Missing the required parameter 'zeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest' when calling zeroTrustOrganizationUpdateYourZeroTrustOrganization(Async)");
        }

        return zeroTrustOrganizationUpdateYourZeroTrustOrganizationCall(identifier, zeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest, _callback);

    }

    /**
     * Update your Zero Trust organization
     * Updates the configuration for your Zero Trust organization.
     * @param identifier  (required)
     * @param zeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest  (required)
     * @return AccessSingleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update your Zero Trust organization response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update your Zero Trust organization response failure </td><td>  -  </td></tr>
     </table>
     */
    public AccessSingleResponse zeroTrustOrganizationUpdateYourZeroTrustOrganization(String identifier, ZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest zeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest) throws ApiException {
        ApiResponse<AccessSingleResponse> localVarResp = zeroTrustOrganizationUpdateYourZeroTrustOrganizationWithHttpInfo(identifier, zeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest);
        return localVarResp.getData();
    }

    /**
     * Update your Zero Trust organization
     * Updates the configuration for your Zero Trust organization.
     * @param identifier  (required)
     * @param zeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest  (required)
     * @return ApiResponse&lt;AccessSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update your Zero Trust organization response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update your Zero Trust organization response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AccessSingleResponse> zeroTrustOrganizationUpdateYourZeroTrustOrganizationWithHttpInfo(String identifier, ZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest zeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest) throws ApiException {
        okhttp3.Call localVarCall = zeroTrustOrganizationUpdateYourZeroTrustOrganizationValidateBeforeCall(identifier, zeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest, null);
        Type localVarReturnType = new TypeToken<AccessSingleResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update your Zero Trust organization (asynchronously)
     * Updates the configuration for your Zero Trust organization.
     * @param identifier  (required)
     * @param zeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update your Zero Trust organization response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update your Zero Trust organization response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call zeroTrustOrganizationUpdateYourZeroTrustOrganizationAsync(String identifier, ZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest zeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest, final ApiCallback<AccessSingleResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = zeroTrustOrganizationUpdateYourZeroTrustOrganizationValidateBeforeCall(identifier, zeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest, _callback);
        Type localVarReturnType = new TypeToken<AccessSingleResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}