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


import cloudflare.sdk.models.WorkerCronTriggerGetCronTriggers4XXResponse;
import cloudflare.sdk.models.WorkersCronTriggerResponseCollection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorkerCronTriggerApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public WorkerCronTriggerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WorkerCronTriggerApi(ApiClient apiClient) {
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
     * Build call for workerCronTriggerGetCronTriggers
     * @param scriptName  (required)
     * @param accountId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get Cron Triggers response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get Cron Triggers response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call workerCronTriggerGetCronTriggersCall(String scriptName, String accountId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/workers/scripts/{script_name}/schedules"
            .replace("{" + "script_name" + "}", localVarApiClient.escapeString(scriptName.toString()))
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
    private okhttp3.Call workerCronTriggerGetCronTriggersValidateBeforeCall(String scriptName, String accountId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'scriptName' is set
        if (scriptName == null) {
            throw new ApiException("Missing the required parameter 'scriptName' when calling workerCronTriggerGetCronTriggers(Async)");
        }

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling workerCronTriggerGetCronTriggers(Async)");
        }

        return workerCronTriggerGetCronTriggersCall(scriptName, accountId, _callback);

    }

    /**
     * Get Cron Triggers
     * Fetches Cron Triggers for a Worker.
     * @param scriptName  (required)
     * @param accountId  (required)
     * @return WorkersCronTriggerResponseCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get Cron Triggers response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get Cron Triggers response failure </td><td>  -  </td></tr>
     </table>
     */
    public WorkersCronTriggerResponseCollection workerCronTriggerGetCronTriggers(String scriptName, String accountId) throws ApiException {
        ApiResponse<WorkersCronTriggerResponseCollection> localVarResp = workerCronTriggerGetCronTriggersWithHttpInfo(scriptName, accountId);
        return localVarResp.getData();
    }

    /**
     * Get Cron Triggers
     * Fetches Cron Triggers for a Worker.
     * @param scriptName  (required)
     * @param accountId  (required)
     * @return ApiResponse&lt;WorkersCronTriggerResponseCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get Cron Triggers response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get Cron Triggers response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<WorkersCronTriggerResponseCollection> workerCronTriggerGetCronTriggersWithHttpInfo(String scriptName, String accountId) throws ApiException {
        okhttp3.Call localVarCall = workerCronTriggerGetCronTriggersValidateBeforeCall(scriptName, accountId, null);
        Type localVarReturnType = new TypeToken<WorkersCronTriggerResponseCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Cron Triggers (asynchronously)
     * Fetches Cron Triggers for a Worker.
     * @param scriptName  (required)
     * @param accountId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get Cron Triggers response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get Cron Triggers response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call workerCronTriggerGetCronTriggersAsync(String scriptName, String accountId, final ApiCallback<WorkersCronTriggerResponseCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = workerCronTriggerGetCronTriggersValidateBeforeCall(scriptName, accountId, _callback);
        Type localVarReturnType = new TypeToken<WorkersCronTriggerResponseCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for workerCronTriggerUpdateCronTriggers
     * @param scriptName  (required)
     * @param accountId  (required)
     * @param body  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Cron Triggers response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Cron Triggers response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call workerCronTriggerUpdateCronTriggersCall(String scriptName, String accountId, Object body, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/workers/scripts/{script_name}/schedules"
            .replace("{" + "script_name" + "}", localVarApiClient.escapeString(scriptName.toString()))
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
    private okhttp3.Call workerCronTriggerUpdateCronTriggersValidateBeforeCall(String scriptName, String accountId, Object body, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'scriptName' is set
        if (scriptName == null) {
            throw new ApiException("Missing the required parameter 'scriptName' when calling workerCronTriggerUpdateCronTriggers(Async)");
        }

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling workerCronTriggerUpdateCronTriggers(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling workerCronTriggerUpdateCronTriggers(Async)");
        }

        return workerCronTriggerUpdateCronTriggersCall(scriptName, accountId, body, _callback);

    }

    /**
     * Update Cron Triggers
     * Updates Cron Triggers for a Worker.
     * @param scriptName  (required)
     * @param accountId  (required)
     * @param body  (required)
     * @return WorkersCronTriggerResponseCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Cron Triggers response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Cron Triggers response failure </td><td>  -  </td></tr>
     </table>
     */
    public WorkersCronTriggerResponseCollection workerCronTriggerUpdateCronTriggers(String scriptName, String accountId, Object body) throws ApiException {
        ApiResponse<WorkersCronTriggerResponseCollection> localVarResp = workerCronTriggerUpdateCronTriggersWithHttpInfo(scriptName, accountId, body);
        return localVarResp.getData();
    }

    /**
     * Update Cron Triggers
     * Updates Cron Triggers for a Worker.
     * @param scriptName  (required)
     * @param accountId  (required)
     * @param body  (required)
     * @return ApiResponse&lt;WorkersCronTriggerResponseCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Cron Triggers response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Cron Triggers response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<WorkersCronTriggerResponseCollection> workerCronTriggerUpdateCronTriggersWithHttpInfo(String scriptName, String accountId, Object body) throws ApiException {
        okhttp3.Call localVarCall = workerCronTriggerUpdateCronTriggersValidateBeforeCall(scriptName, accountId, body, null);
        Type localVarReturnType = new TypeToken<WorkersCronTriggerResponseCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Cron Triggers (asynchronously)
     * Updates Cron Triggers for a Worker.
     * @param scriptName  (required)
     * @param accountId  (required)
     * @param body  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Cron Triggers response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Cron Triggers response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call workerCronTriggerUpdateCronTriggersAsync(String scriptName, String accountId, Object body, final ApiCallback<WorkersCronTriggerResponseCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = workerCronTriggerUpdateCronTriggersValidateBeforeCall(scriptName, accountId, body, _callback);
        Type localVarReturnType = new TypeToken<WorkersCronTriggerResponseCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
