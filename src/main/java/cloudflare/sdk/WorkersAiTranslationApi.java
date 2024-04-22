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


import cloudflare.sdk.models.WorkersAiPostRunCfBaaiBgeBaseEnV15400Response;
import cloudflare.sdk.models.WorkersAiPostRunCfMetaM2m10012b200Response;
import cloudflare.sdk.models.WorkersAiPostRunCfMetaM2m10012bRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorkersAiTranslationApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public WorkersAiTranslationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WorkersAiTranslationApi(ApiClient apiClient) {
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
     * Build call for workersAiPostRunCfMetaM2m10012b
     * @param accountId  (required)
     * @param workersAiPostRunCfMetaM2m10012bRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call workersAiPostRunCfMetaM2m10012bCall(String accountId, WorkersAiPostRunCfMetaM2m10012bRequest workersAiPostRunCfMetaM2m10012bRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = workersAiPostRunCfMetaM2m10012bRequest;

        // create path and map variables
        String localVarPath = "/accounts/{account_id}/ai/run/@cf/meta/m2m100-1.2b"
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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call workersAiPostRunCfMetaM2m10012bValidateBeforeCall(String accountId, WorkersAiPostRunCfMetaM2m10012bRequest workersAiPostRunCfMetaM2m10012bRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling workersAiPostRunCfMetaM2m10012b(Async)");
        }

        return workersAiPostRunCfMetaM2m10012bCall(accountId, workersAiPostRunCfMetaM2m10012bRequest, _callback);

    }

    /**
     * Execute @cf/meta/m2m100-1.2b model.
     * 
     * @param accountId  (required)
     * @param workersAiPostRunCfMetaM2m10012bRequest  (optional)
     * @return WorkersAiPostRunCfMetaM2m10012b200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
     */
    public WorkersAiPostRunCfMetaM2m10012b200Response workersAiPostRunCfMetaM2m10012b(String accountId, WorkersAiPostRunCfMetaM2m10012bRequest workersAiPostRunCfMetaM2m10012bRequest) throws ApiException {
        ApiResponse<WorkersAiPostRunCfMetaM2m10012b200Response> localVarResp = workersAiPostRunCfMetaM2m10012bWithHttpInfo(accountId, workersAiPostRunCfMetaM2m10012bRequest);
        return localVarResp.getData();
    }

    /**
     * Execute @cf/meta/m2m100-1.2b model.
     * 
     * @param accountId  (required)
     * @param workersAiPostRunCfMetaM2m10012bRequest  (optional)
     * @return ApiResponse&lt;WorkersAiPostRunCfMetaM2m10012b200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<WorkersAiPostRunCfMetaM2m10012b200Response> workersAiPostRunCfMetaM2m10012bWithHttpInfo(String accountId, WorkersAiPostRunCfMetaM2m10012bRequest workersAiPostRunCfMetaM2m10012bRequest) throws ApiException {
        okhttp3.Call localVarCall = workersAiPostRunCfMetaM2m10012bValidateBeforeCall(accountId, workersAiPostRunCfMetaM2m10012bRequest, null);
        Type localVarReturnType = new TypeToken<WorkersAiPostRunCfMetaM2m10012b200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Execute @cf/meta/m2m100-1.2b model. (asynchronously)
     * 
     * @param accountId  (required)
     * @param workersAiPostRunCfMetaM2m10012bRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call workersAiPostRunCfMetaM2m10012bAsync(String accountId, WorkersAiPostRunCfMetaM2m10012bRequest workersAiPostRunCfMetaM2m10012bRequest, final ApiCallback<WorkersAiPostRunCfMetaM2m10012b200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = workersAiPostRunCfMetaM2m10012bValidateBeforeCall(accountId, workersAiPostRunCfMetaM2m10012bRequest, _callback);
        Type localVarReturnType = new TypeToken<WorkersAiPostRunCfMetaM2m10012b200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
