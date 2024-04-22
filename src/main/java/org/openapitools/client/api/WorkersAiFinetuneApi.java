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


import java.io.File;
import org.openapitools.client.model.WorkersAiCreateFinetune200Response;
import org.openapitools.client.model.WorkersAiCreateFinetune400Response;
import org.openapitools.client.model.WorkersAiCreateFinetuneRequest;
import org.openapitools.client.model.WorkersAiListFinetunes200Response;
import org.openapitools.client.model.WorkersAiListFinetunes400Response;
import org.openapitools.client.model.WorkersAiUploadFinetuneAsset200Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorkersAiFinetuneApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public WorkersAiFinetuneApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WorkersAiFinetuneApi(ApiClient apiClient) {
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
     * Build call for workersAiCreateFinetune
     * @param accountId  (required)
     * @param workersAiCreateFinetuneRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the created finetune </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Finetune creation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call workersAiCreateFinetuneCall(Integer accountId, WorkersAiCreateFinetuneRequest workersAiCreateFinetuneRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = workersAiCreateFinetuneRequest;

        // create path and map variables
        String localVarPath = "/accounts/{account_id}/ai/finetunes"
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
    private okhttp3.Call workersAiCreateFinetuneValidateBeforeCall(Integer accountId, WorkersAiCreateFinetuneRequest workersAiCreateFinetuneRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling workersAiCreateFinetune(Async)");
        }

        return workersAiCreateFinetuneCall(accountId, workersAiCreateFinetuneRequest, _callback);

    }

    /**
     * Create a new Finetune
     * 
     * @param accountId  (required)
     * @param workersAiCreateFinetuneRequest  (optional)
     * @return WorkersAiCreateFinetune200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the created finetune </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Finetune creation failed </td><td>  -  </td></tr>
     </table>
     */
    public WorkersAiCreateFinetune200Response workersAiCreateFinetune(Integer accountId, WorkersAiCreateFinetuneRequest workersAiCreateFinetuneRequest) throws ApiException {
        ApiResponse<WorkersAiCreateFinetune200Response> localVarResp = workersAiCreateFinetuneWithHttpInfo(accountId, workersAiCreateFinetuneRequest);
        return localVarResp.getData();
    }

    /**
     * Create a new Finetune
     * 
     * @param accountId  (required)
     * @param workersAiCreateFinetuneRequest  (optional)
     * @return ApiResponse&lt;WorkersAiCreateFinetune200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the created finetune </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Finetune creation failed </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<WorkersAiCreateFinetune200Response> workersAiCreateFinetuneWithHttpInfo(Integer accountId, WorkersAiCreateFinetuneRequest workersAiCreateFinetuneRequest) throws ApiException {
        okhttp3.Call localVarCall = workersAiCreateFinetuneValidateBeforeCall(accountId, workersAiCreateFinetuneRequest, null);
        Type localVarReturnType = new TypeToken<WorkersAiCreateFinetune200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a new Finetune (asynchronously)
     * 
     * @param accountId  (required)
     * @param workersAiCreateFinetuneRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the created finetune </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Finetune creation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call workersAiCreateFinetuneAsync(Integer accountId, WorkersAiCreateFinetuneRequest workersAiCreateFinetuneRequest, final ApiCallback<WorkersAiCreateFinetune200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = workersAiCreateFinetuneValidateBeforeCall(accountId, workersAiCreateFinetuneRequest, _callback);
        Type localVarReturnType = new TypeToken<WorkersAiCreateFinetune200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for workersAiListFinetunes
     * @param accountId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns all finetunes </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call workersAiListFinetunesCall(Integer accountId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/ai/finetunes"
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
    private okhttp3.Call workersAiListFinetunesValidateBeforeCall(Integer accountId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling workersAiListFinetunes(Async)");
        }

        return workersAiListFinetunesCall(accountId, _callback);

    }

    /**
     * List Finetunes
     * 
     * @param accountId  (required)
     * @return WorkersAiListFinetunes200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns all finetunes </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public WorkersAiListFinetunes200Response workersAiListFinetunes(Integer accountId) throws ApiException {
        ApiResponse<WorkersAiListFinetunes200Response> localVarResp = workersAiListFinetunesWithHttpInfo(accountId);
        return localVarResp.getData();
    }

    /**
     * List Finetunes
     * 
     * @param accountId  (required)
     * @return ApiResponse&lt;WorkersAiListFinetunes200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns all finetunes </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<WorkersAiListFinetunes200Response> workersAiListFinetunesWithHttpInfo(Integer accountId) throws ApiException {
        okhttp3.Call localVarCall = workersAiListFinetunesValidateBeforeCall(accountId, null);
        Type localVarReturnType = new TypeToken<WorkersAiListFinetunes200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Finetunes (asynchronously)
     * 
     * @param accountId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns all finetunes </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call workersAiListFinetunesAsync(Integer accountId, final ApiCallback<WorkersAiListFinetunes200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = workersAiListFinetunesValidateBeforeCall(accountId, _callback);
        Type localVarReturnType = new TypeToken<WorkersAiListFinetunes200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for workersAiUploadFinetuneAsset
     * @param accountId  (required)
     * @param finetuneId  (required)
     * @param _file  (optional)
     * @param fileName  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the created finetune asset </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Finetune creation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call workersAiUploadFinetuneAssetCall(Integer accountId, String finetuneId, File _file, String fileName, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/ai/finetunes/{finetune_id}/finetune-assets"
            .replace("{" + "account_id" + "}", localVarApiClient.escapeString(accountId.toString()))
            .replace("{" + "finetune_id" + "}", localVarApiClient.escapeString(finetuneId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (_file != null) {
            localVarFormParams.put("file", _file);
        }

        if (fileName != null) {
            localVarFormParams.put("file_name", fileName);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key", "api_token", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call workersAiUploadFinetuneAssetValidateBeforeCall(Integer accountId, String finetuneId, File _file, String fileName, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling workersAiUploadFinetuneAsset(Async)");
        }

        // verify the required parameter 'finetuneId' is set
        if (finetuneId == null) {
            throw new ApiException("Missing the required parameter 'finetuneId' when calling workersAiUploadFinetuneAsset(Async)");
        }

        return workersAiUploadFinetuneAssetCall(accountId, finetuneId, _file, fileName, _callback);

    }

    /**
     * Upload a Finetune Asset
     * 
     * @param accountId  (required)
     * @param finetuneId  (required)
     * @param _file  (optional)
     * @param fileName  (optional)
     * @return WorkersAiUploadFinetuneAsset200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the created finetune asset </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Finetune creation failed </td><td>  -  </td></tr>
     </table>
     */
    public WorkersAiUploadFinetuneAsset200Response workersAiUploadFinetuneAsset(Integer accountId, String finetuneId, File _file, String fileName) throws ApiException {
        ApiResponse<WorkersAiUploadFinetuneAsset200Response> localVarResp = workersAiUploadFinetuneAssetWithHttpInfo(accountId, finetuneId, _file, fileName);
        return localVarResp.getData();
    }

    /**
     * Upload a Finetune Asset
     * 
     * @param accountId  (required)
     * @param finetuneId  (required)
     * @param _file  (optional)
     * @param fileName  (optional)
     * @return ApiResponse&lt;WorkersAiUploadFinetuneAsset200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the created finetune asset </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Finetune creation failed </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<WorkersAiUploadFinetuneAsset200Response> workersAiUploadFinetuneAssetWithHttpInfo(Integer accountId, String finetuneId, File _file, String fileName) throws ApiException {
        okhttp3.Call localVarCall = workersAiUploadFinetuneAssetValidateBeforeCall(accountId, finetuneId, _file, fileName, null);
        Type localVarReturnType = new TypeToken<WorkersAiUploadFinetuneAsset200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Upload a Finetune Asset (asynchronously)
     * 
     * @param accountId  (required)
     * @param finetuneId  (required)
     * @param _file  (optional)
     * @param fileName  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the created finetune asset </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Finetune creation failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call workersAiUploadFinetuneAssetAsync(Integer accountId, String finetuneId, File _file, String fileName, final ApiCallback<WorkersAiUploadFinetuneAsset200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = workersAiUploadFinetuneAssetValidateBeforeCall(accountId, finetuneId, _file, fileName, _callback);
        Type localVarReturnType = new TypeToken<WorkersAiUploadFinetuneAsset200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
