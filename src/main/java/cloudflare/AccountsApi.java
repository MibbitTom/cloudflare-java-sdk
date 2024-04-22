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


import org.openapitools.client.model.AccountsAccountDetails4XXResponse;
import org.openapitools.client.model.AccountsListAccounts4XXResponse;
import java.math.BigDecimal;
import org.openapitools.client.model.IamComponentsSchemasAccount;
import org.openapitools.client.model.IamResponseCollection;
import org.openapitools.client.model.IamResponseSingle;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AccountsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AccountsApi(ApiClient apiClient) {
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
     * Build call for accountsAccountDetails
     * @param accountId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Account Details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Account Details response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call accountsAccountDetailsCall(Object accountId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}"
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
    private okhttp3.Call accountsAccountDetailsValidateBeforeCall(Object accountId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling accountsAccountDetails(Async)");
        }

        return accountsAccountDetailsCall(accountId, _callback);

    }

    /**
     * Account Details
     * Get information about a specific account that you are a member of.
     * @param accountId  (required)
     * @return IamResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Account Details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Account Details response failure </td><td>  -  </td></tr>
     </table>
     */
    public IamResponseSingle accountsAccountDetails(Object accountId) throws ApiException {
        ApiResponse<IamResponseSingle> localVarResp = accountsAccountDetailsWithHttpInfo(accountId);
        return localVarResp.getData();
    }

    /**
     * Account Details
     * Get information about a specific account that you are a member of.
     * @param accountId  (required)
     * @return ApiResponse&lt;IamResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Account Details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Account Details response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<IamResponseSingle> accountsAccountDetailsWithHttpInfo(Object accountId) throws ApiException {
        okhttp3.Call localVarCall = accountsAccountDetailsValidateBeforeCall(accountId, null);
        Type localVarReturnType = new TypeToken<IamResponseSingle>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Account Details (asynchronously)
     * Get information about a specific account that you are a member of.
     * @param accountId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Account Details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Account Details response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call accountsAccountDetailsAsync(Object accountId, final ApiCallback<IamResponseSingle> _callback) throws ApiException {

        okhttp3.Call localVarCall = accountsAccountDetailsValidateBeforeCall(accountId, _callback);
        Type localVarReturnType = new TypeToken<IamResponseSingle>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for accountsListAccounts
     * @param name  (optional)
     * @param page  (optional, default to 1)
     * @param perPage  (optional, default to 20)
     * @param direction  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Accounts response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Accounts response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call accountsListAccountsCall(String name, BigDecimal page, BigDecimal perPage, String direction, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (name != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("name", name));
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
    private okhttp3.Call accountsListAccountsValidateBeforeCall(String name, BigDecimal page, BigDecimal perPage, String direction, final ApiCallback _callback) throws ApiException {
        return accountsListAccountsCall(name, page, perPage, direction, _callback);

    }

    /**
     * List Accounts
     * List all accounts you have ownership or verified access to.
     * @param name  (optional)
     * @param page  (optional, default to 1)
     * @param perPage  (optional, default to 20)
     * @param direction  (optional)
     * @return IamResponseCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Accounts response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Accounts response failure </td><td>  -  </td></tr>
     </table>
     */
    public IamResponseCollection accountsListAccounts(String name, BigDecimal page, BigDecimal perPage, String direction) throws ApiException {
        ApiResponse<IamResponseCollection> localVarResp = accountsListAccountsWithHttpInfo(name, page, perPage, direction);
        return localVarResp.getData();
    }

    /**
     * List Accounts
     * List all accounts you have ownership or verified access to.
     * @param name  (optional)
     * @param page  (optional, default to 1)
     * @param perPage  (optional, default to 20)
     * @param direction  (optional)
     * @return ApiResponse&lt;IamResponseCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Accounts response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Accounts response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<IamResponseCollection> accountsListAccountsWithHttpInfo(String name, BigDecimal page, BigDecimal perPage, String direction) throws ApiException {
        okhttp3.Call localVarCall = accountsListAccountsValidateBeforeCall(name, page, perPage, direction, null);
        Type localVarReturnType = new TypeToken<IamResponseCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Accounts (asynchronously)
     * List all accounts you have ownership or verified access to.
     * @param name  (optional)
     * @param page  (optional, default to 1)
     * @param perPage  (optional, default to 20)
     * @param direction  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Accounts response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Accounts response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call accountsListAccountsAsync(String name, BigDecimal page, BigDecimal perPage, String direction, final ApiCallback<IamResponseCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = accountsListAccountsValidateBeforeCall(name, page, perPage, direction, _callback);
        Type localVarReturnType = new TypeToken<IamResponseCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for accountsUpdateAccount
     * @param accountId  (required)
     * @param iamComponentsSchemasAccount  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Account response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Account response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call accountsUpdateAccountCall(Object accountId, IamComponentsSchemasAccount iamComponentsSchemasAccount, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = iamComponentsSchemasAccount;

        // create path and map variables
        String localVarPath = "/accounts/{account_id}"
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
    private okhttp3.Call accountsUpdateAccountValidateBeforeCall(Object accountId, IamComponentsSchemasAccount iamComponentsSchemasAccount, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling accountsUpdateAccount(Async)");
        }

        // verify the required parameter 'iamComponentsSchemasAccount' is set
        if (iamComponentsSchemasAccount == null) {
            throw new ApiException("Missing the required parameter 'iamComponentsSchemasAccount' when calling accountsUpdateAccount(Async)");
        }

        return accountsUpdateAccountCall(accountId, iamComponentsSchemasAccount, _callback);

    }

    /**
     * Update Account
     * Update an existing account.
     * @param accountId  (required)
     * @param iamComponentsSchemasAccount  (required)
     * @return IamResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Account response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Account response failure </td><td>  -  </td></tr>
     </table>
     */
    public IamResponseSingle accountsUpdateAccount(Object accountId, IamComponentsSchemasAccount iamComponentsSchemasAccount) throws ApiException {
        ApiResponse<IamResponseSingle> localVarResp = accountsUpdateAccountWithHttpInfo(accountId, iamComponentsSchemasAccount);
        return localVarResp.getData();
    }

    /**
     * Update Account
     * Update an existing account.
     * @param accountId  (required)
     * @param iamComponentsSchemasAccount  (required)
     * @return ApiResponse&lt;IamResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Account response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Account response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<IamResponseSingle> accountsUpdateAccountWithHttpInfo(Object accountId, IamComponentsSchemasAccount iamComponentsSchemasAccount) throws ApiException {
        okhttp3.Call localVarCall = accountsUpdateAccountValidateBeforeCall(accountId, iamComponentsSchemasAccount, null);
        Type localVarReturnType = new TypeToken<IamResponseSingle>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Account (asynchronously)
     * Update an existing account.
     * @param accountId  (required)
     * @param iamComponentsSchemasAccount  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Account response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Account response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call accountsUpdateAccountAsync(Object accountId, IamComponentsSchemasAccount iamComponentsSchemasAccount, final ApiCallback<IamResponseSingle> _callback) throws ApiException {

        okhttp3.Call localVarCall = accountsUpdateAccountValidateBeforeCall(accountId, iamComponentsSchemasAccount, _callback);
        Type localVarReturnType = new TypeToken<IamResponseSingle>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}