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


import cloudflare.sdk.models.RegistrarApiDomainResponseCollection;
import cloudflare.sdk.models.RegistrarApiDomainResponseSingle;
import cloudflare.sdk.models.RegistrarApiDomainUpdateProperties;
import cloudflare.sdk.models.RegistrarDomainsGetDomain4XXResponse;
import cloudflare.sdk.models.RegistrarDomainsListDomains4XXResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegistrarDomainsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public RegistrarDomainsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RegistrarDomainsApi(ApiClient apiClient) {
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
     * Build call for registrarDomainsGetDomain
     * @param domainName  (required)
     * @param accountId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get domain response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get domain response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call registrarDomainsGetDomainCall(String domainName, String accountId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/registrar/domains/{domain_name}"
            .replace("{" + "domain_name" + "}", localVarApiClient.escapeString(domainName.toString()))
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

        String[] localVarAuthNames = new String[] { "api_key", "api_token", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call registrarDomainsGetDomainValidateBeforeCall(String domainName, String accountId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'domainName' is set
        if (domainName == null) {
            throw new ApiException("Missing the required parameter 'domainName' when calling registrarDomainsGetDomain(Async)");
        }

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling registrarDomainsGetDomain(Async)");
        }

        return registrarDomainsGetDomainCall(domainName, accountId, _callback);

    }

    /**
     * Get domain
     * Show individual domain.
     * @param domainName  (required)
     * @param accountId  (required)
     * @return RegistrarApiDomainResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get domain response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get domain response failure </td><td>  -  </td></tr>
     </table>
     */
    public RegistrarApiDomainResponseSingle registrarDomainsGetDomain(String domainName, String accountId) throws ApiException {
        ApiResponse<RegistrarApiDomainResponseSingle> localVarResp = registrarDomainsGetDomainWithHttpInfo(domainName, accountId);
        return localVarResp.getData();
    }

    /**
     * Get domain
     * Show individual domain.
     * @param domainName  (required)
     * @param accountId  (required)
     * @return ApiResponse&lt;RegistrarApiDomainResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get domain response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get domain response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<RegistrarApiDomainResponseSingle> registrarDomainsGetDomainWithHttpInfo(String domainName, String accountId) throws ApiException {
        okhttp3.Call localVarCall = registrarDomainsGetDomainValidateBeforeCall(domainName, accountId, null);
        Type localVarReturnType = new TypeToken<RegistrarApiDomainResponseSingle>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get domain (asynchronously)
     * Show individual domain.
     * @param domainName  (required)
     * @param accountId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get domain response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get domain response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call registrarDomainsGetDomainAsync(String domainName, String accountId, final ApiCallback<RegistrarApiDomainResponseSingle> _callback) throws ApiException {

        okhttp3.Call localVarCall = registrarDomainsGetDomainValidateBeforeCall(domainName, accountId, _callback);
        Type localVarReturnType = new TypeToken<RegistrarApiDomainResponseSingle>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for registrarDomainsListDomains
     * @param accountId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List domains response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List domains response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call registrarDomainsListDomainsCall(String accountId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/registrar/domains"
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

        String[] localVarAuthNames = new String[] { "api_key", "api_token", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call registrarDomainsListDomainsValidateBeforeCall(String accountId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling registrarDomainsListDomains(Async)");
        }

        return registrarDomainsListDomainsCall(accountId, _callback);

    }

    /**
     * List domains
     * List domains handled by Registrar.
     * @param accountId  (required)
     * @return RegistrarApiDomainResponseCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List domains response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List domains response failure </td><td>  -  </td></tr>
     </table>
     */
    public RegistrarApiDomainResponseCollection registrarDomainsListDomains(String accountId) throws ApiException {
        ApiResponse<RegistrarApiDomainResponseCollection> localVarResp = registrarDomainsListDomainsWithHttpInfo(accountId);
        return localVarResp.getData();
    }

    /**
     * List domains
     * List domains handled by Registrar.
     * @param accountId  (required)
     * @return ApiResponse&lt;RegistrarApiDomainResponseCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List domains response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List domains response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<RegistrarApiDomainResponseCollection> registrarDomainsListDomainsWithHttpInfo(String accountId) throws ApiException {
        okhttp3.Call localVarCall = registrarDomainsListDomainsValidateBeforeCall(accountId, null);
        Type localVarReturnType = new TypeToken<RegistrarApiDomainResponseCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List domains (asynchronously)
     * List domains handled by Registrar.
     * @param accountId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List domains response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List domains response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call registrarDomainsListDomainsAsync(String accountId, final ApiCallback<RegistrarApiDomainResponseCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = registrarDomainsListDomainsValidateBeforeCall(accountId, _callback);
        Type localVarReturnType = new TypeToken<RegistrarApiDomainResponseCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for registrarDomainsUpdateDomain
     * @param domainName  (required)
     * @param accountId  (required)
     * @param registrarApiDomainUpdateProperties  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update domain response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update domain response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call registrarDomainsUpdateDomainCall(String domainName, String accountId, RegistrarApiDomainUpdateProperties registrarApiDomainUpdateProperties, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = registrarApiDomainUpdateProperties;

        // create path and map variables
        String localVarPath = "/accounts/{account_id}/registrar/domains/{domain_name}"
            .replace("{" + "domain_name" + "}", localVarApiClient.escapeString(domainName.toString()))
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

        String[] localVarAuthNames = new String[] { "api_key", "api_token", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call registrarDomainsUpdateDomainValidateBeforeCall(String domainName, String accountId, RegistrarApiDomainUpdateProperties registrarApiDomainUpdateProperties, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'domainName' is set
        if (domainName == null) {
            throw new ApiException("Missing the required parameter 'domainName' when calling registrarDomainsUpdateDomain(Async)");
        }

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling registrarDomainsUpdateDomain(Async)");
        }

        // verify the required parameter 'registrarApiDomainUpdateProperties' is set
        if (registrarApiDomainUpdateProperties == null) {
            throw new ApiException("Missing the required parameter 'registrarApiDomainUpdateProperties' when calling registrarDomainsUpdateDomain(Async)");
        }

        return registrarDomainsUpdateDomainCall(domainName, accountId, registrarApiDomainUpdateProperties, _callback);

    }

    /**
     * Update domain
     * Update individual domain.
     * @param domainName  (required)
     * @param accountId  (required)
     * @param registrarApiDomainUpdateProperties  (required)
     * @return RegistrarApiDomainResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update domain response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update domain response failure </td><td>  -  </td></tr>
     </table>
     */
    public RegistrarApiDomainResponseSingle registrarDomainsUpdateDomain(String domainName, String accountId, RegistrarApiDomainUpdateProperties registrarApiDomainUpdateProperties) throws ApiException {
        ApiResponse<RegistrarApiDomainResponseSingle> localVarResp = registrarDomainsUpdateDomainWithHttpInfo(domainName, accountId, registrarApiDomainUpdateProperties);
        return localVarResp.getData();
    }

    /**
     * Update domain
     * Update individual domain.
     * @param domainName  (required)
     * @param accountId  (required)
     * @param registrarApiDomainUpdateProperties  (required)
     * @return ApiResponse&lt;RegistrarApiDomainResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update domain response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update domain response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<RegistrarApiDomainResponseSingle> registrarDomainsUpdateDomainWithHttpInfo(String domainName, String accountId, RegistrarApiDomainUpdateProperties registrarApiDomainUpdateProperties) throws ApiException {
        okhttp3.Call localVarCall = registrarDomainsUpdateDomainValidateBeforeCall(domainName, accountId, registrarApiDomainUpdateProperties, null);
        Type localVarReturnType = new TypeToken<RegistrarApiDomainResponseSingle>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update domain (asynchronously)
     * Update individual domain.
     * @param domainName  (required)
     * @param accountId  (required)
     * @param registrarApiDomainUpdateProperties  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update domain response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update domain response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call registrarDomainsUpdateDomainAsync(String domainName, String accountId, RegistrarApiDomainUpdateProperties registrarApiDomainUpdateProperties, final ApiCallback<RegistrarApiDomainResponseSingle> _callback) throws ApiException {

        okhttp3.Call localVarCall = registrarDomainsUpdateDomainValidateBeforeCall(domainName, accountId, registrarApiDomainUpdateProperties, _callback);
        Type localVarReturnType = new TypeToken<RegistrarApiDomainResponseSingle>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
