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


import org.openapitools.client.model.PagesDomainResponseCollection;
import org.openapitools.client.model.PagesDomainResponseSingle;
import org.openapitools.client.model.PagesDomainsAddDomain4XXResponse;
import org.openapitools.client.model.PagesDomainsGetDomains4XXResponse;
import org.openapitools.client.model.PagesProjectDeleteProject4XXResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PagesDomainsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PagesDomainsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PagesDomainsApi(ApiClient apiClient) {
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
     * Build call for pagesDomainsAddDomain
     * @param projectName  (required)
     * @param accountId  (required)
     * @param body  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Add domain response. </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Add domain response failure. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call pagesDomainsAddDomainCall(String projectName, String accountId, Object body, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/pages/projects/{project_name}/domains"
            .replace("{" + "project_name" + "}", localVarApiClient.escapeString(projectName.toString()))
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
    private okhttp3.Call pagesDomainsAddDomainValidateBeforeCall(String projectName, String accountId, Object body, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new ApiException("Missing the required parameter 'projectName' when calling pagesDomainsAddDomain(Async)");
        }

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling pagesDomainsAddDomain(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling pagesDomainsAddDomain(Async)");
        }

        return pagesDomainsAddDomainCall(projectName, accountId, body, _callback);

    }

    /**
     * Add domain
     * Add a new domain for the Pages project.
     * @param projectName  (required)
     * @param accountId  (required)
     * @param body  (required)
     * @return PagesDomainResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Add domain response. </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Add domain response failure. </td><td>  -  </td></tr>
     </table>
     */
    public PagesDomainResponseSingle pagesDomainsAddDomain(String projectName, String accountId, Object body) throws ApiException {
        ApiResponse<PagesDomainResponseSingle> localVarResp = pagesDomainsAddDomainWithHttpInfo(projectName, accountId, body);
        return localVarResp.getData();
    }

    /**
     * Add domain
     * Add a new domain for the Pages project.
     * @param projectName  (required)
     * @param accountId  (required)
     * @param body  (required)
     * @return ApiResponse&lt;PagesDomainResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Add domain response. </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Add domain response failure. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PagesDomainResponseSingle> pagesDomainsAddDomainWithHttpInfo(String projectName, String accountId, Object body) throws ApiException {
        okhttp3.Call localVarCall = pagesDomainsAddDomainValidateBeforeCall(projectName, accountId, body, null);
        Type localVarReturnType = new TypeToken<PagesDomainResponseSingle>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add domain (asynchronously)
     * Add a new domain for the Pages project.
     * @param projectName  (required)
     * @param accountId  (required)
     * @param body  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Add domain response. </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Add domain response failure. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call pagesDomainsAddDomainAsync(String projectName, String accountId, Object body, final ApiCallback<PagesDomainResponseSingle> _callback) throws ApiException {

        okhttp3.Call localVarCall = pagesDomainsAddDomainValidateBeforeCall(projectName, accountId, body, _callback);
        Type localVarReturnType = new TypeToken<PagesDomainResponseSingle>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for pagesDomainsDeleteDomain
     * @param domainName  (required)
     * @param projectName  (required)
     * @param accountId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete domain response. </td><td>  -  </td></tr>
        <tr><td> 4xx </td><td> Delete domain response failure. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call pagesDomainsDeleteDomainCall(String domainName, String projectName, String accountId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/pages/projects/{project_name}/domains/{domain_name}"
            .replace("{" + "domain_name" + "}", localVarApiClient.escapeString(domainName.toString()))
            .replace("{" + "project_name" + "}", localVarApiClient.escapeString(projectName.toString()))
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
    private okhttp3.Call pagesDomainsDeleteDomainValidateBeforeCall(String domainName, String projectName, String accountId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'domainName' is set
        if (domainName == null) {
            throw new ApiException("Missing the required parameter 'domainName' when calling pagesDomainsDeleteDomain(Async)");
        }

        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new ApiException("Missing the required parameter 'projectName' when calling pagesDomainsDeleteDomain(Async)");
        }

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling pagesDomainsDeleteDomain(Async)");
        }

        return pagesDomainsDeleteDomainCall(domainName, projectName, accountId, _callback);

    }

    /**
     * Delete domain
     * Delete a Pages project&#39;s domain.
     * @param domainName  (required)
     * @param projectName  (required)
     * @param accountId  (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete domain response. </td><td>  -  </td></tr>
        <tr><td> 4xx </td><td> Delete domain response failure. </td><td>  -  </td></tr>
     </table>
     */
    public Object pagesDomainsDeleteDomain(String domainName, String projectName, String accountId) throws ApiException {
        ApiResponse<Object> localVarResp = pagesDomainsDeleteDomainWithHttpInfo(domainName, projectName, accountId);
        return localVarResp.getData();
    }

    /**
     * Delete domain
     * Delete a Pages project&#39;s domain.
     * @param domainName  (required)
     * @param projectName  (required)
     * @param accountId  (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete domain response. </td><td>  -  </td></tr>
        <tr><td> 4xx </td><td> Delete domain response failure. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> pagesDomainsDeleteDomainWithHttpInfo(String domainName, String projectName, String accountId) throws ApiException {
        okhttp3.Call localVarCall = pagesDomainsDeleteDomainValidateBeforeCall(domainName, projectName, accountId, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete domain (asynchronously)
     * Delete a Pages project&#39;s domain.
     * @param domainName  (required)
     * @param projectName  (required)
     * @param accountId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete domain response. </td><td>  -  </td></tr>
        <tr><td> 4xx </td><td> Delete domain response failure. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call pagesDomainsDeleteDomainAsync(String domainName, String projectName, String accountId, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = pagesDomainsDeleteDomainValidateBeforeCall(domainName, projectName, accountId, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for pagesDomainsGetDomain
     * @param domainName  (required)
     * @param projectName  (required)
     * @param accountId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get domain response. </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get domain response failure. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call pagesDomainsGetDomainCall(String domainName, String projectName, String accountId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/pages/projects/{project_name}/domains/{domain_name}"
            .replace("{" + "domain_name" + "}", localVarApiClient.escapeString(domainName.toString()))
            .replace("{" + "project_name" + "}", localVarApiClient.escapeString(projectName.toString()))
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
    private okhttp3.Call pagesDomainsGetDomainValidateBeforeCall(String domainName, String projectName, String accountId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'domainName' is set
        if (domainName == null) {
            throw new ApiException("Missing the required parameter 'domainName' when calling pagesDomainsGetDomain(Async)");
        }

        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new ApiException("Missing the required parameter 'projectName' when calling pagesDomainsGetDomain(Async)");
        }

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling pagesDomainsGetDomain(Async)");
        }

        return pagesDomainsGetDomainCall(domainName, projectName, accountId, _callback);

    }

    /**
     * Get domain
     * Fetch a single domain.
     * @param domainName  (required)
     * @param projectName  (required)
     * @param accountId  (required)
     * @return PagesDomainResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get domain response. </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get domain response failure. </td><td>  -  </td></tr>
     </table>
     */
    public PagesDomainResponseSingle pagesDomainsGetDomain(String domainName, String projectName, String accountId) throws ApiException {
        ApiResponse<PagesDomainResponseSingle> localVarResp = pagesDomainsGetDomainWithHttpInfo(domainName, projectName, accountId);
        return localVarResp.getData();
    }

    /**
     * Get domain
     * Fetch a single domain.
     * @param domainName  (required)
     * @param projectName  (required)
     * @param accountId  (required)
     * @return ApiResponse&lt;PagesDomainResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get domain response. </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get domain response failure. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PagesDomainResponseSingle> pagesDomainsGetDomainWithHttpInfo(String domainName, String projectName, String accountId) throws ApiException {
        okhttp3.Call localVarCall = pagesDomainsGetDomainValidateBeforeCall(domainName, projectName, accountId, null);
        Type localVarReturnType = new TypeToken<PagesDomainResponseSingle>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get domain (asynchronously)
     * Fetch a single domain.
     * @param domainName  (required)
     * @param projectName  (required)
     * @param accountId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get domain response. </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get domain response failure. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call pagesDomainsGetDomainAsync(String domainName, String projectName, String accountId, final ApiCallback<PagesDomainResponseSingle> _callback) throws ApiException {

        okhttp3.Call localVarCall = pagesDomainsGetDomainValidateBeforeCall(domainName, projectName, accountId, _callback);
        Type localVarReturnType = new TypeToken<PagesDomainResponseSingle>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for pagesDomainsGetDomains
     * @param projectName  (required)
     * @param accountId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get domains response. </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get domains response failure. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call pagesDomainsGetDomainsCall(String projectName, String accountId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/pages/projects/{project_name}/domains"
            .replace("{" + "project_name" + "}", localVarApiClient.escapeString(projectName.toString()))
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
    private okhttp3.Call pagesDomainsGetDomainsValidateBeforeCall(String projectName, String accountId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new ApiException("Missing the required parameter 'projectName' when calling pagesDomainsGetDomains(Async)");
        }

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling pagesDomainsGetDomains(Async)");
        }

        return pagesDomainsGetDomainsCall(projectName, accountId, _callback);

    }

    /**
     * Get domains
     * Fetch a list of all domains associated with a Pages project.
     * @param projectName  (required)
     * @param accountId  (required)
     * @return PagesDomainResponseCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get domains response. </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get domains response failure. </td><td>  -  </td></tr>
     </table>
     */
    public PagesDomainResponseCollection pagesDomainsGetDomains(String projectName, String accountId) throws ApiException {
        ApiResponse<PagesDomainResponseCollection> localVarResp = pagesDomainsGetDomainsWithHttpInfo(projectName, accountId);
        return localVarResp.getData();
    }

    /**
     * Get domains
     * Fetch a list of all domains associated with a Pages project.
     * @param projectName  (required)
     * @param accountId  (required)
     * @return ApiResponse&lt;PagesDomainResponseCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get domains response. </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get domains response failure. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PagesDomainResponseCollection> pagesDomainsGetDomainsWithHttpInfo(String projectName, String accountId) throws ApiException {
        okhttp3.Call localVarCall = pagesDomainsGetDomainsValidateBeforeCall(projectName, accountId, null);
        Type localVarReturnType = new TypeToken<PagesDomainResponseCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get domains (asynchronously)
     * Fetch a list of all domains associated with a Pages project.
     * @param projectName  (required)
     * @param accountId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get domains response. </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get domains response failure. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call pagesDomainsGetDomainsAsync(String projectName, String accountId, final ApiCallback<PagesDomainResponseCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = pagesDomainsGetDomainsValidateBeforeCall(projectName, accountId, _callback);
        Type localVarReturnType = new TypeToken<PagesDomainResponseCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for pagesDomainsPatchDomain
     * @param domainName  (required)
     * @param projectName  (required)
     * @param accountId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Patch domain response. </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Patch domain response failure. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call pagesDomainsPatchDomainCall(String domainName, String projectName, String accountId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/pages/projects/{project_name}/domains/{domain_name}"
            .replace("{" + "domain_name" + "}", localVarApiClient.escapeString(domainName.toString()))
            .replace("{" + "project_name" + "}", localVarApiClient.escapeString(projectName.toString()))
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
    private okhttp3.Call pagesDomainsPatchDomainValidateBeforeCall(String domainName, String projectName, String accountId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'domainName' is set
        if (domainName == null) {
            throw new ApiException("Missing the required parameter 'domainName' when calling pagesDomainsPatchDomain(Async)");
        }

        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new ApiException("Missing the required parameter 'projectName' when calling pagesDomainsPatchDomain(Async)");
        }

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling pagesDomainsPatchDomain(Async)");
        }

        return pagesDomainsPatchDomainCall(domainName, projectName, accountId, _callback);

    }

    /**
     * Patch domain
     * Retry the validation status of a single domain.
     * @param domainName  (required)
     * @param projectName  (required)
     * @param accountId  (required)
     * @return PagesDomainResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Patch domain response. </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Patch domain response failure. </td><td>  -  </td></tr>
     </table>
     */
    public PagesDomainResponseSingle pagesDomainsPatchDomain(String domainName, String projectName, String accountId) throws ApiException {
        ApiResponse<PagesDomainResponseSingle> localVarResp = pagesDomainsPatchDomainWithHttpInfo(domainName, projectName, accountId);
        return localVarResp.getData();
    }

    /**
     * Patch domain
     * Retry the validation status of a single domain.
     * @param domainName  (required)
     * @param projectName  (required)
     * @param accountId  (required)
     * @return ApiResponse&lt;PagesDomainResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Patch domain response. </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Patch domain response failure. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PagesDomainResponseSingle> pagesDomainsPatchDomainWithHttpInfo(String domainName, String projectName, String accountId) throws ApiException {
        okhttp3.Call localVarCall = pagesDomainsPatchDomainValidateBeforeCall(domainName, projectName, accountId, null);
        Type localVarReturnType = new TypeToken<PagesDomainResponseSingle>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Patch domain (asynchronously)
     * Retry the validation status of a single domain.
     * @param domainName  (required)
     * @param projectName  (required)
     * @param accountId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Patch domain response. </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Patch domain response failure. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call pagesDomainsPatchDomainAsync(String domainName, String projectName, String accountId, final ApiCallback<PagesDomainResponseSingle> _callback) throws ApiException {

        okhttp3.Call localVarCall = pagesDomainsPatchDomainValidateBeforeCall(domainName, projectName, accountId, _callback);
        Type localVarReturnType = new TypeToken<PagesDomainResponseSingle>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}