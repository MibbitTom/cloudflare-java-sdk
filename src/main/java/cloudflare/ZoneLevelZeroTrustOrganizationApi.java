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
import org.openapitools.client.model.AccessOrganizationsComponentsSchemasSingleResponse;
import org.openapitools.client.model.ZeroTrustOrganizationRevokeAllAccessTokensForAUserRequest;
import org.openapitools.client.model.ZoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest;
import org.openapitools.client.model.ZoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZoneLevelZeroTrustOrganizationApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ZoneLevelZeroTrustOrganizationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ZoneLevelZeroTrustOrganizationApi(ApiClient apiClient) {
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
     * Build call for zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganization
     * @param identifier  (required)
     * @param zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest  (required)
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
    public okhttp3.Call zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganizationCall(Object identifier, ZoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest;

        // create path and map variables
        String localVarPath = "/zones/{identifier}/access/organizations"
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
    private okhttp3.Call zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganizationValidateBeforeCall(Object identifier, ZoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganization(Async)");
        }

        // verify the required parameter 'zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest' is set
        if (zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest == null) {
            throw new ApiException("Missing the required parameter 'zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest' when calling zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganization(Async)");
        }

        return zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganizationCall(identifier, zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest, _callback);

    }

    /**
     * Create your Zero Trust organization
     * Sets up a Zero Trust organization for your account.
     * @param identifier  (required)
     * @param zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest  (required)
     * @return AccessOrganizationsComponentsSchemasSingleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Create your Zero Trust organization response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create your Zero Trust organization response failure </td><td>  -  </td></tr>
     </table>
     */
    public AccessOrganizationsComponentsSchemasSingleResponse zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganization(Object identifier, ZoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest) throws ApiException {
        ApiResponse<AccessOrganizationsComponentsSchemasSingleResponse> localVarResp = zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganizationWithHttpInfo(identifier, zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest);
        return localVarResp.getData();
    }

    /**
     * Create your Zero Trust organization
     * Sets up a Zero Trust organization for your account.
     * @param identifier  (required)
     * @param zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest  (required)
     * @return ApiResponse&lt;AccessOrganizationsComponentsSchemasSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Create your Zero Trust organization response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create your Zero Trust organization response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AccessOrganizationsComponentsSchemasSingleResponse> zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganizationWithHttpInfo(Object identifier, ZoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest) throws ApiException {
        okhttp3.Call localVarCall = zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganizationValidateBeforeCall(identifier, zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest, null);
        Type localVarReturnType = new TypeToken<AccessOrganizationsComponentsSchemasSingleResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create your Zero Trust organization (asynchronously)
     * Sets up a Zero Trust organization for your account.
     * @param identifier  (required)
     * @param zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest  (required)
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
    public okhttp3.Call zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganizationAsync(Object identifier, ZoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest, final ApiCallback<AccessOrganizationsComponentsSchemasSingleResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganizationValidateBeforeCall(identifier, zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest, _callback);
        Type localVarReturnType = new TypeToken<AccessOrganizationsComponentsSchemasSingleResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for zoneLevelZeroTrustOrganizationGetYourZeroTrustOrganization
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
    public okhttp3.Call zoneLevelZeroTrustOrganizationGetYourZeroTrustOrganizationCall(Object identifier, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/zones/{identifier}/access/organizations"
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
    private okhttp3.Call zoneLevelZeroTrustOrganizationGetYourZeroTrustOrganizationValidateBeforeCall(Object identifier, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling zoneLevelZeroTrustOrganizationGetYourZeroTrustOrganization(Async)");
        }

        return zoneLevelZeroTrustOrganizationGetYourZeroTrustOrganizationCall(identifier, _callback);

    }

    /**
     * Get your Zero Trust organization
     * Returns the configuration for your Zero Trust organization.
     * @param identifier  (required)
     * @return AccessOrganizationsComponentsSchemasSingleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get your Zero Trust organization response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get your Zero Trust organization response failure </td><td>  -  </td></tr>
     </table>
     */
    public AccessOrganizationsComponentsSchemasSingleResponse zoneLevelZeroTrustOrganizationGetYourZeroTrustOrganization(Object identifier) throws ApiException {
        ApiResponse<AccessOrganizationsComponentsSchemasSingleResponse> localVarResp = zoneLevelZeroTrustOrganizationGetYourZeroTrustOrganizationWithHttpInfo(identifier);
        return localVarResp.getData();
    }

    /**
     * Get your Zero Trust organization
     * Returns the configuration for your Zero Trust organization.
     * @param identifier  (required)
     * @return ApiResponse&lt;AccessOrganizationsComponentsSchemasSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get your Zero Trust organization response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get your Zero Trust organization response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AccessOrganizationsComponentsSchemasSingleResponse> zoneLevelZeroTrustOrganizationGetYourZeroTrustOrganizationWithHttpInfo(Object identifier) throws ApiException {
        okhttp3.Call localVarCall = zoneLevelZeroTrustOrganizationGetYourZeroTrustOrganizationValidateBeforeCall(identifier, null);
        Type localVarReturnType = new TypeToken<AccessOrganizationsComponentsSchemasSingleResponse>(){}.getType();
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
    public okhttp3.Call zoneLevelZeroTrustOrganizationGetYourZeroTrustOrganizationAsync(Object identifier, final ApiCallback<AccessOrganizationsComponentsSchemasSingleResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = zoneLevelZeroTrustOrganizationGetYourZeroTrustOrganizationValidateBeforeCall(identifier, _callback);
        Type localVarReturnType = new TypeToken<AccessOrganizationsComponentsSchemasSingleResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for zoneLevelZeroTrustOrganizationRevokeAllAccessTokensForAUser
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
    public okhttp3.Call zoneLevelZeroTrustOrganizationRevokeAllAccessTokensForAUserCall(Object identifier, ZeroTrustOrganizationRevokeAllAccessTokensForAUserRequest zeroTrustOrganizationRevokeAllAccessTokensForAUserRequest, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/zones/{identifier}/access/organizations/revoke_user"
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
    private okhttp3.Call zoneLevelZeroTrustOrganizationRevokeAllAccessTokensForAUserValidateBeforeCall(Object identifier, ZeroTrustOrganizationRevokeAllAccessTokensForAUserRequest zeroTrustOrganizationRevokeAllAccessTokensForAUserRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling zoneLevelZeroTrustOrganizationRevokeAllAccessTokensForAUser(Async)");
        }

        // verify the required parameter 'zeroTrustOrganizationRevokeAllAccessTokensForAUserRequest' is set
        if (zeroTrustOrganizationRevokeAllAccessTokensForAUserRequest == null) {
            throw new ApiException("Missing the required parameter 'zeroTrustOrganizationRevokeAllAccessTokensForAUserRequest' when calling zoneLevelZeroTrustOrganizationRevokeAllAccessTokensForAUser(Async)");
        }

        return zoneLevelZeroTrustOrganizationRevokeAllAccessTokensForAUserCall(identifier, zeroTrustOrganizationRevokeAllAccessTokensForAUserRequest, _callback);

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
    public AccessEmptyResponse zoneLevelZeroTrustOrganizationRevokeAllAccessTokensForAUser(Object identifier, ZeroTrustOrganizationRevokeAllAccessTokensForAUserRequest zeroTrustOrganizationRevokeAllAccessTokensForAUserRequest) throws ApiException {
        ApiResponse<AccessEmptyResponse> localVarResp = zoneLevelZeroTrustOrganizationRevokeAllAccessTokensForAUserWithHttpInfo(identifier, zeroTrustOrganizationRevokeAllAccessTokensForAUserRequest);
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
    public ApiResponse<AccessEmptyResponse> zoneLevelZeroTrustOrganizationRevokeAllAccessTokensForAUserWithHttpInfo(Object identifier, ZeroTrustOrganizationRevokeAllAccessTokensForAUserRequest zeroTrustOrganizationRevokeAllAccessTokensForAUserRequest) throws ApiException {
        okhttp3.Call localVarCall = zoneLevelZeroTrustOrganizationRevokeAllAccessTokensForAUserValidateBeforeCall(identifier, zeroTrustOrganizationRevokeAllAccessTokensForAUserRequest, null);
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
    public okhttp3.Call zoneLevelZeroTrustOrganizationRevokeAllAccessTokensForAUserAsync(Object identifier, ZeroTrustOrganizationRevokeAllAccessTokensForAUserRequest zeroTrustOrganizationRevokeAllAccessTokensForAUserRequest, final ApiCallback<AccessEmptyResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = zoneLevelZeroTrustOrganizationRevokeAllAccessTokensForAUserValidateBeforeCall(identifier, zeroTrustOrganizationRevokeAllAccessTokensForAUserRequest, _callback);
        Type localVarReturnType = new TypeToken<AccessEmptyResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganization
     * @param identifier  (required)
     * @param zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest  (required)
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
    public okhttp3.Call zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganizationCall(Object identifier, ZoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest;

        // create path and map variables
        String localVarPath = "/zones/{identifier}/access/organizations"
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
    private okhttp3.Call zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganizationValidateBeforeCall(Object identifier, ZoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganization(Async)");
        }

        // verify the required parameter 'zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest' is set
        if (zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest == null) {
            throw new ApiException("Missing the required parameter 'zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest' when calling zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganization(Async)");
        }

        return zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganizationCall(identifier, zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest, _callback);

    }

    /**
     * Update your Zero Trust organization
     * Updates the configuration for your Zero Trust organization.
     * @param identifier  (required)
     * @param zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest  (required)
     * @return AccessOrganizationsComponentsSchemasSingleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update your Zero Trust organization response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update your Zero Trust organization response failure </td><td>  -  </td></tr>
     </table>
     */
    public AccessOrganizationsComponentsSchemasSingleResponse zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganization(Object identifier, ZoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest) throws ApiException {
        ApiResponse<AccessOrganizationsComponentsSchemasSingleResponse> localVarResp = zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganizationWithHttpInfo(identifier, zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest);
        return localVarResp.getData();
    }

    /**
     * Update your Zero Trust organization
     * Updates the configuration for your Zero Trust organization.
     * @param identifier  (required)
     * @param zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest  (required)
     * @return ApiResponse&lt;AccessOrganizationsComponentsSchemasSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update your Zero Trust organization response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update your Zero Trust organization response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AccessOrganizationsComponentsSchemasSingleResponse> zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganizationWithHttpInfo(Object identifier, ZoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest) throws ApiException {
        okhttp3.Call localVarCall = zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganizationValidateBeforeCall(identifier, zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest, null);
        Type localVarReturnType = new TypeToken<AccessOrganizationsComponentsSchemasSingleResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update your Zero Trust organization (asynchronously)
     * Updates the configuration for your Zero Trust organization.
     * @param identifier  (required)
     * @param zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest  (required)
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
    public okhttp3.Call zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganizationAsync(Object identifier, ZoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest, final ApiCallback<AccessOrganizationsComponentsSchemasSingleResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganizationValidateBeforeCall(identifier, zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest, _callback);
        Type localVarReturnType = new TypeToken<AccessOrganizationsComponentsSchemasSingleResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}