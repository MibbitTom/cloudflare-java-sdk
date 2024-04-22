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


import java.math.BigDecimal;
import org.openapitools.client.model.DurableObjectsNamespaceListNamespaces200Response;
import org.openapitools.client.model.DurableObjectsNamespaceListNamespaces4XXResponse;
import org.openapitools.client.model.DurableObjectsNamespaceListObjects200Response;
import org.openapitools.client.model.DurableObjectsNamespaceListObjects4XXResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DurableObjectsNamespaceApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DurableObjectsNamespaceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DurableObjectsNamespaceApi(ApiClient apiClient) {
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
     * Build call for durableObjectsNamespaceListNamespaces
     * @param accountId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Namespaces response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Namespaces response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call durableObjectsNamespaceListNamespacesCall(String accountId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/workers/durable_objects/namespaces"
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
    private okhttp3.Call durableObjectsNamespaceListNamespacesValidateBeforeCall(String accountId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling durableObjectsNamespaceListNamespaces(Async)");
        }

        return durableObjectsNamespaceListNamespacesCall(accountId, _callback);

    }

    /**
     * List Namespaces
     * Returns the Durable Object namespaces owned by an account.
     * @param accountId  (required)
     * @return DurableObjectsNamespaceListNamespaces200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Namespaces response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Namespaces response failure </td><td>  -  </td></tr>
     </table>
     */
    public DurableObjectsNamespaceListNamespaces200Response durableObjectsNamespaceListNamespaces(String accountId) throws ApiException {
        ApiResponse<DurableObjectsNamespaceListNamespaces200Response> localVarResp = durableObjectsNamespaceListNamespacesWithHttpInfo(accountId);
        return localVarResp.getData();
    }

    /**
     * List Namespaces
     * Returns the Durable Object namespaces owned by an account.
     * @param accountId  (required)
     * @return ApiResponse&lt;DurableObjectsNamespaceListNamespaces200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Namespaces response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Namespaces response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DurableObjectsNamespaceListNamespaces200Response> durableObjectsNamespaceListNamespacesWithHttpInfo(String accountId) throws ApiException {
        okhttp3.Call localVarCall = durableObjectsNamespaceListNamespacesValidateBeforeCall(accountId, null);
        Type localVarReturnType = new TypeToken<DurableObjectsNamespaceListNamespaces200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Namespaces (asynchronously)
     * Returns the Durable Object namespaces owned by an account.
     * @param accountId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Namespaces response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Namespaces response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call durableObjectsNamespaceListNamespacesAsync(String accountId, final ApiCallback<DurableObjectsNamespaceListNamespaces200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = durableObjectsNamespaceListNamespacesValidateBeforeCall(accountId, _callback);
        Type localVarReturnType = new TypeToken<DurableObjectsNamespaceListNamespaces200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for durableObjectsNamespaceListObjects
     * @param id  (required)
     * @param accountId  (required)
     * @param limit  (optional, default to 1000)
     * @param cursor  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Objects response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Objects response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call durableObjectsNamespaceListObjectsCall(String id, String accountId, BigDecimal limit, String cursor, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/workers/durable_objects/namespaces/{id}/objects"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()))
            .replace("{" + "account_id" + "}", localVarApiClient.escapeString(accountId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (cursor != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cursor", cursor));
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

        String[] localVarAuthNames = new String[] { "api_key", "api_token", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call durableObjectsNamespaceListObjectsValidateBeforeCall(String id, String accountId, BigDecimal limit, String cursor, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling durableObjectsNamespaceListObjects(Async)");
        }

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling durableObjectsNamespaceListObjects(Async)");
        }

        return durableObjectsNamespaceListObjectsCall(id, accountId, limit, cursor, _callback);

    }

    /**
     * List Objects
     * Returns the Durable Objects in a given namespace.
     * @param id  (required)
     * @param accountId  (required)
     * @param limit  (optional, default to 1000)
     * @param cursor  (optional)
     * @return DurableObjectsNamespaceListObjects200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Objects response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Objects response failure </td><td>  -  </td></tr>
     </table>
     */
    public DurableObjectsNamespaceListObjects200Response durableObjectsNamespaceListObjects(String id, String accountId, BigDecimal limit, String cursor) throws ApiException {
        ApiResponse<DurableObjectsNamespaceListObjects200Response> localVarResp = durableObjectsNamespaceListObjectsWithHttpInfo(id, accountId, limit, cursor);
        return localVarResp.getData();
    }

    /**
     * List Objects
     * Returns the Durable Objects in a given namespace.
     * @param id  (required)
     * @param accountId  (required)
     * @param limit  (optional, default to 1000)
     * @param cursor  (optional)
     * @return ApiResponse&lt;DurableObjectsNamespaceListObjects200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Objects response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Objects response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DurableObjectsNamespaceListObjects200Response> durableObjectsNamespaceListObjectsWithHttpInfo(String id, String accountId, BigDecimal limit, String cursor) throws ApiException {
        okhttp3.Call localVarCall = durableObjectsNamespaceListObjectsValidateBeforeCall(id, accountId, limit, cursor, null);
        Type localVarReturnType = new TypeToken<DurableObjectsNamespaceListObjects200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Objects (asynchronously)
     * Returns the Durable Objects in a given namespace.
     * @param id  (required)
     * @param accountId  (required)
     * @param limit  (optional, default to 1000)
     * @param cursor  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Objects response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Objects response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call durableObjectsNamespaceListObjectsAsync(String id, String accountId, BigDecimal limit, String cursor, final ApiCallback<DurableObjectsNamespaceListObjects200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = durableObjectsNamespaceListObjectsValidateBeforeCall(id, accountId, limit, cursor, _callback);
        Type localVarReturnType = new TypeToken<DurableObjectsNamespaceListObjects200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
