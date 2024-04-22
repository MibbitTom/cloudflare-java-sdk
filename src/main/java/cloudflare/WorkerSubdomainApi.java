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


import org.openapitools.client.model.WorkerSubdomainGetSubdomain4XXResponse;
import org.openapitools.client.model.WorkersSubdomainResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorkerSubdomainApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public WorkerSubdomainApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WorkerSubdomainApi(ApiClient apiClient) {
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
     * Build call for workerSubdomainCreateSubdomain
     * @param accountId  (required)
     * @param body  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Subdomain response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Subdomain response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call workerSubdomainCreateSubdomainCall(String accountId, Object body, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/workers/subdomain"
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
    private okhttp3.Call workerSubdomainCreateSubdomainValidateBeforeCall(String accountId, Object body, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling workerSubdomainCreateSubdomain(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling workerSubdomainCreateSubdomain(Async)");
        }

        return workerSubdomainCreateSubdomainCall(accountId, body, _callback);

    }

    /**
     * Create Subdomain
     * Creates a Workers subdomain for an account.
     * @param accountId  (required)
     * @param body  (required)
     * @return WorkersSubdomainResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Subdomain response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Subdomain response failure </td><td>  -  </td></tr>
     </table>
     */
    public WorkersSubdomainResponse workerSubdomainCreateSubdomain(String accountId, Object body) throws ApiException {
        ApiResponse<WorkersSubdomainResponse> localVarResp = workerSubdomainCreateSubdomainWithHttpInfo(accountId, body);
        return localVarResp.getData();
    }

    /**
     * Create Subdomain
     * Creates a Workers subdomain for an account.
     * @param accountId  (required)
     * @param body  (required)
     * @return ApiResponse&lt;WorkersSubdomainResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Subdomain response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Subdomain response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<WorkersSubdomainResponse> workerSubdomainCreateSubdomainWithHttpInfo(String accountId, Object body) throws ApiException {
        okhttp3.Call localVarCall = workerSubdomainCreateSubdomainValidateBeforeCall(accountId, body, null);
        Type localVarReturnType = new TypeToken<WorkersSubdomainResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create Subdomain (asynchronously)
     * Creates a Workers subdomain for an account.
     * @param accountId  (required)
     * @param body  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Subdomain response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Subdomain response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call workerSubdomainCreateSubdomainAsync(String accountId, Object body, final ApiCallback<WorkersSubdomainResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = workerSubdomainCreateSubdomainValidateBeforeCall(accountId, body, _callback);
        Type localVarReturnType = new TypeToken<WorkersSubdomainResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for workerSubdomainGetSubdomain
     * @param accountId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get Subdomain response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get Subdomain response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call workerSubdomainGetSubdomainCall(String accountId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/workers/subdomain"
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
    private okhttp3.Call workerSubdomainGetSubdomainValidateBeforeCall(String accountId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling workerSubdomainGetSubdomain(Async)");
        }

        return workerSubdomainGetSubdomainCall(accountId, _callback);

    }

    /**
     * Get Subdomain
     * Returns a Workers subdomain for an account.
     * @param accountId  (required)
     * @return WorkersSubdomainResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get Subdomain response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get Subdomain response failure </td><td>  -  </td></tr>
     </table>
     */
    public WorkersSubdomainResponse workerSubdomainGetSubdomain(String accountId) throws ApiException {
        ApiResponse<WorkersSubdomainResponse> localVarResp = workerSubdomainGetSubdomainWithHttpInfo(accountId);
        return localVarResp.getData();
    }

    /**
     * Get Subdomain
     * Returns a Workers subdomain for an account.
     * @param accountId  (required)
     * @return ApiResponse&lt;WorkersSubdomainResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get Subdomain response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get Subdomain response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<WorkersSubdomainResponse> workerSubdomainGetSubdomainWithHttpInfo(String accountId) throws ApiException {
        okhttp3.Call localVarCall = workerSubdomainGetSubdomainValidateBeforeCall(accountId, null);
        Type localVarReturnType = new TypeToken<WorkersSubdomainResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Subdomain (asynchronously)
     * Returns a Workers subdomain for an account.
     * @param accountId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get Subdomain response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get Subdomain response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call workerSubdomainGetSubdomainAsync(String accountId, final ApiCallback<WorkersSubdomainResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = workerSubdomainGetSubdomainValidateBeforeCall(accountId, _callback);
        Type localVarReturnType = new TypeToken<WorkersSubdomainResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
